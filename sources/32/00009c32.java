package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.util.DigestFactory;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class PKCS5S2ParametersGenerator extends PBEParametersGenerator {
    private Mac hMac;
    private byte[] state;

    public PKCS5S2ParametersGenerator() {
        this(DigestFactory.createSHA1());
    }

    private void F(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, int i12) {
        if (i11 != 0) {
            if (bArr != null) {
                this.hMac.update(bArr, 0, bArr.length);
            }
            this.hMac.update(bArr2, 0, bArr2.length);
            this.hMac.doFinal(this.state, 0);
            byte[] bArr4 = this.state;
            System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
            for (int i13 = 1; i13 < i11; i13++) {
                Mac mac = this.hMac;
                byte[] bArr5 = this.state;
                mac.update(bArr5, 0, bArr5.length);
                this.hMac.doFinal(this.state, 0);
                int i14 = 0;
                while (true) {
                    byte[] bArr6 = this.state;
                    if (i14 != bArr6.length) {
                        int i15 = i12 + i14;
                        bArr3[i15] = (byte) (bArr6[i14] ^ bArr3[i15]);
                        i14++;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("iteration count must be at least 1.");
    }

    private byte[] generateDerivedKey(int i11) {
        int i12;
        int macSize = this.hMac.getMacSize();
        int i13 = ((i11 + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i13 * macSize];
        this.hMac.init(new KeyParameter(this.password));
        int i14 = 0;
        for (int i15 = 1; i15 <= i13; i15++) {
            while (true) {
                byte b11 = (byte) (bArr[i12] + 1);
                bArr[i12] = b11;
                i12 = b11 == 0 ? i12 - 1 : 3;
            }
            F(this.salt, this.iterationCount, bArr, bArr2, i14);
            i14 += macSize;
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i11) {
        return generateDerivedParameters(i11);
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i11) {
        int i12 = i11 / 8;
        return new KeyParameter(Arrays.copyOfRange(generateDerivedKey(i12), 0, i12), 0, i12);
    }

    public PKCS5S2ParametersGenerator(Digest digest) {
        HMac hMac = new HMac(digest);
        this.hMac = hMac;
        this.state = new byte[hMac.getMacSize()];
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i11, int i12) {
        int i13 = i11 / 8;
        int i14 = i12 / 8;
        byte[] generateDerivedKey = generateDerivedKey(i13 + i14);
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i13), generateDerivedKey, i13, i14);
    }
}