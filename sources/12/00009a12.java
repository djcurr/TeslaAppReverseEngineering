package org.spongycastle.cert.crmf.bc;

import java.security.SecureRandom;
import org.spongycastle.cert.crmf.EncryptedValuePadder;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.generators.MGF1BytesGenerator;
import org.spongycastle.crypto.params.MGFParameters;

/* loaded from: classes5.dex */
public class BcFixedLengthMGF1Padder implements EncryptedValuePadder {
    private Digest dig;
    private int length;
    private SecureRandom random;

    public BcFixedLengthMGF1Padder(int i11) {
        this(i11, null);
    }

    @Override // org.spongycastle.cert.crmf.EncryptedValuePadder
    public byte[] getPaddedData(byte[] bArr) {
        int i11 = this.length;
        byte[] bArr2 = new byte[i11];
        int digestSize = this.dig.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int digestSize2 = this.length - this.dig.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        this.random.nextBytes(bArr3);
        MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(this.dig);
        mGF1BytesGenerator.init(new MGFParameters(bArr3));
        mGF1BytesGenerator.generateBytes(bArr4, 0, digestSize2);
        System.arraycopy(bArr3, 0, bArr2, 0, digestSize);
        System.arraycopy(bArr, 0, bArr2, digestSize, bArr.length);
        int length = bArr.length + digestSize;
        while (true) {
            length++;
            if (length == i11) {
                break;
            }
            bArr2[length] = (byte) (this.random.nextInt(255) + 1);
        }
        for (int i12 = 0; i12 != digestSize2; i12++) {
            int i13 = i12 + digestSize;
            bArr2[i13] = (byte) (bArr2[i13] ^ bArr4[i12]);
        }
        return bArr2;
    }

    @Override // org.spongycastle.cert.crmf.EncryptedValuePadder
    public byte[] getUnpaddedData(byte[] bArr) {
        int digestSize = this.dig.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        int digestSize2 = this.length - this.dig.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        System.arraycopy(bArr, 0, bArr2, 0, digestSize);
        MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(this.dig);
        mGF1BytesGenerator.init(new MGFParameters(bArr2));
        mGF1BytesGenerator.generateBytes(bArr3, 0, digestSize2);
        for (int i11 = 0; i11 != digestSize2; i11++) {
            int i12 = i11 + digestSize;
            bArr[i12] = (byte) (bArr[i12] ^ bArr3[i11]);
        }
        int length = bArr.length - 1;
        while (true) {
            if (length == digestSize) {
                length = 0;
                break;
            } else if (bArr[length] == 0) {
                break;
            } else {
                length--;
            }
        }
        if (length != 0) {
            int i13 = length - digestSize;
            byte[] bArr4 = new byte[i13];
            System.arraycopy(bArr, digestSize, bArr4, 0, i13);
            return bArr4;
        }
        throw new IllegalStateException("bad padding in encoding");
    }

    public BcFixedLengthMGF1Padder(int i11, SecureRandom secureRandom) {
        this.dig = new SHA1Digest();
        this.length = i11;
        this.random = secureRandom;
    }
}