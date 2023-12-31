package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.MGFParameters;

/* loaded from: classes4.dex */
public class MGF1BytesGenerator implements DerivationFunction {
    private Digest digest;
    private int hLen;
    private byte[] seed;

    public MGF1BytesGenerator(Digest digest) {
        this.digest = digest;
        this.hLen = digest.getDigestSize();
    }

    private void ItoOSP(int i11, byte[] bArr) {
        bArr[0] = (byte) (i11 >>> 24);
        bArr[1] = (byte) (i11 >>> 16);
        bArr[2] = (byte) (i11 >>> 8);
        bArr[3] = (byte) (i11 >>> 0);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) {
        int i13;
        if (bArr.length - i12 >= i11) {
            byte[] bArr2 = new byte[this.hLen];
            byte[] bArr3 = new byte[4];
            this.digest.reset();
            if (i12 > this.hLen) {
                i13 = 0;
                do {
                    ItoOSP(i13, bArr3);
                    Digest digest = this.digest;
                    byte[] bArr4 = this.seed;
                    digest.update(bArr4, 0, bArr4.length);
                    this.digest.update(bArr3, 0, 4);
                    this.digest.doFinal(bArr2, 0);
                    int i14 = this.hLen;
                    System.arraycopy(bArr2, 0, bArr, (i13 * i14) + i11, i14);
                    i13++;
                } while (i13 < i12 / this.hLen);
            } else {
                i13 = 0;
            }
            if (this.hLen * i13 < i12) {
                ItoOSP(i13, bArr3);
                Digest digest2 = this.digest;
                byte[] bArr5 = this.seed;
                digest2.update(bArr5, 0, bArr5.length);
                this.digest.update(bArr3, 0, 4);
                this.digest.doFinal(bArr2, 0);
                int i15 = this.hLen;
                System.arraycopy(bArr2, 0, bArr, i11 + (i13 * i15), i12 - (i13 * i15));
            }
            return i12;
        }
        throw new DataLengthException("output buffer too small");
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof MGFParameters) {
            this.seed = ((MGFParameters) derivationParameters).getSeed();
            return;
        }
        throw new IllegalArgumentException("MGF parameters required for MGF1Generator");
    }
}