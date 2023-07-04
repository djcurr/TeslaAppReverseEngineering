package org.bouncycastle.jce.provider;

import i50.s;
import i50.v;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.p;
import org.bouncycastle.crypto.w;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
class OldPKCS12ParametersGenerator extends w {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private p digest;

    /* renamed from: u  reason: collision with root package name */
    private int f43202u;

    /* renamed from: v  reason: collision with root package name */
    private int f43203v;

    public OldPKCS12ParametersGenerator(p pVar) {
        this.digest = pVar;
        if (pVar instanceof i50.p) {
            this.f43202u = 16;
        } else if (!(pVar instanceof v) && !(pVar instanceof s)) {
            throw new IllegalArgumentException("Digest " + pVar.getAlgorithmName() + " unsupported");
        } else {
            this.f43202u = 20;
        }
        this.f43203v = 64;
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
        int i14 = this.f43203v;
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
            int i18 = this.f43203v;
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
            int i21 = this.f43203v;
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
        int i23 = this.f43203v;
        byte[] bArr10 = new byte[i23];
        int i24 = this.f43202u;
        int i25 = ((i12 + i24) - 1) / i24;
        int i26 = 1;
        while (i26 <= i25) {
            int i27 = this.f43202u;
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
                int i32 = this.f43203v;
                if (i31 == length3 / i32) {
                    break;
                }
                adjust(bArr9, i32 * i31, bArr10);
                i31++;
            }
            if (i26 == i25) {
                int i33 = i26 - 1;
                int i34 = this.f43202u;
                i13 = 0;
                System.arraycopy(bArr11, 0, bArr4, i33 * i34, i12 - (i33 * i34));
            } else {
                i13 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i26 - 1) * this.f43202u, i27);
            }
            i26++;
            i15 = i13;
            i17 = 1;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.w
    public i generateDerivedMacParameters(int i11) {
        int i12 = i11 / 8;
        return new b1(generateDerivedKey(3, i12), 0, i12);
    }

    @Override // org.bouncycastle.crypto.w
    public i generateDerivedParameters(int i11) {
        int i12 = i11 / 8;
        return new b1(generateDerivedKey(1, i12), 0, i12);
    }

    @Override // org.bouncycastle.crypto.w
    public i generateDerivedParameters(int i11, int i12) {
        int i13 = i11 / 8;
        int i14 = i12 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i13);
        return new f1(new b1(generateDerivedKey, 0, i13), generateDerivedKey(2, i14), 0, i14);
    }
}