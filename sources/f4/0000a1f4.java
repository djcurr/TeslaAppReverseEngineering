package org.spongycastle.jce.provider;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* loaded from: classes4.dex */
class OldPKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;

    /* renamed from: u  reason: collision with root package name */
    private int f43669u;

    /* renamed from: v  reason: collision with root package name */
    private int f43670v;

    public OldPKCS12ParametersGenerator(Digest digest) {
        this.digest = digest;
        if (digest instanceof MD5Digest) {
            this.f43669u = 16;
            this.f43670v = 64;
        } else if (digest instanceof SHA1Digest) {
            this.f43669u = 20;
            this.f43670v = 64;
        } else if (digest instanceof RIPEMD160Digest) {
            this.f43669u = 20;
            this.f43670v = 64;
        } else {
            throw new IllegalArgumentException("Digest " + digest.getAlgorithmName() + " unsupported");
        }
    }

    private void adjust(byte[] bArr, int i11, byte[] bArr2) {
        int i12 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i11) - 1] & 255) + 1;
        bArr[(bArr2.length + i11) - 1] = (byte) i12;
        int i13 = i12 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i14 = i11 + length;
            int i15 = i13 + (bArr2[length] & 255) + (bArr[i14] & 255);
            bArr[i14] = (byte) i15;
            i13 = i15 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i11, int i12) {
        byte[] bArr;
        byte[] bArr2;
        int i13;
        int i14 = this.f43670v;
        byte[] bArr3 = new byte[i14];
        byte[] bArr4 = new byte[i12];
        int i15 = 0;
        for (int i16 = 0; i16 != i14; i16++) {
            bArr3[i16] = (byte) i11;
        }
        byte[] bArr5 = this.salt;
        int i17 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i18 = this.f43670v;
            int length = i18 * (((bArr5.length + i18) - 1) / i18);
            bArr = new byte[length];
            for (int i19 = 0; i19 != length; i19++) {
                byte[] bArr6 = this.salt;
                bArr[i19] = bArr6[i19 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i21 = this.f43670v;
            int length2 = i21 * (((bArr7.length + i21) - 1) / i21);
            bArr2 = new byte[length2];
            for (int i22 = 0; i22 != length2; i22++) {
                byte[] bArr8 = this.password;
                bArr2[i22] = bArr8[i22 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i23 = this.f43670v;
        byte[] bArr10 = new byte[i23];
        int i24 = this.f43669u;
        int i25 = ((i12 + i24) - 1) / i24;
        int i26 = 1;
        while (i26 <= i25) {
            int i27 = this.f43669u;
            byte[] bArr11 = new byte[i27];
            this.digest.update(bArr3, i15, i14);
            this.digest.update(bArr9, i15, length3);
            this.digest.doFinal(bArr11, i15);
            for (int i28 = i17; i28 != this.iterationCount; i28++) {
                this.digest.update(bArr11, i15, i27);
                this.digest.doFinal(bArr11, i15);
            }
            for (int i29 = i15; i29 != i23; i29++) {
                bArr10[i26] = bArr11[i29 % i27];
            }
            int i31 = i15;
            while (true) {
                int i32 = this.f43670v;
                if (i31 == length3 / i32) {
                    break;
                }
                adjust(bArr9, i32 * i31, bArr10);
                i31++;
            }
            if (i26 == i25) {
                int i33 = i26 - 1;
                int i34 = this.f43669u;
                i13 = 0;
                System.arraycopy(bArr11, 0, bArr4, i33 * i34, i12 - (i33 * i34));
            } else {
                i13 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i26 - 1) * this.f43669u, i27);
            }
            i26++;
            i15 = i13;
            i17 = 1;
        }
        return bArr4;
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i11) {
        int i12 = i11 / 8;
        return new KeyParameter(generateDerivedKey(3, i12), 0, i12);
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i11) {
        int i12 = i11 / 8;
        return new KeyParameter(generateDerivedKey(1, i12), 0, i12);
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i11, int i12) {
        int i13 = i11 / 8;
        int i14 = i12 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i13);
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i13), generateDerivedKey(2, i14), 0, i14);
    }
}