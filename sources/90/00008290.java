package l50;

/* loaded from: classes5.dex */
public class m extends t0 {
    public static void j(int i11, int[] iArr, int[] iArr2) {
        int i12 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i11 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        char c11 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        int i17 = iArr[4];
        int i18 = iArr[5];
        int i19 = iArr[6];
        int i21 = 7;
        int i22 = iArr[7];
        int i23 = 8;
        int i24 = iArr[8];
        int i25 = iArr[9];
        int i26 = iArr[10];
        int i27 = iArr[11];
        int i28 = 12;
        int i29 = iArr[12];
        int i31 = iArr[13];
        int i32 = iArr[14];
        int i33 = iArr[15];
        int i34 = i32;
        int i35 = i31;
        int i36 = i29;
        int i37 = i27;
        int i38 = i26;
        int i39 = i25;
        int i41 = i24;
        int i42 = i22;
        int i43 = i19;
        int i44 = i18;
        int i45 = i17;
        int i46 = i16;
        int i47 = i15;
        int i48 = i14;
        int i49 = i13;
        int i51 = i11;
        while (i51 > 0) {
            int i52 = i49 + i45;
            int c12 = r70.f.c(i36 ^ i52, i12);
            int i53 = i41 + c12;
            int c13 = r70.f.c(i45 ^ i53, i28);
            int i54 = i52 + c13;
            int c14 = r70.f.c(c12 ^ i54, i23);
            int i55 = i53 + c14;
            int c15 = r70.f.c(c13 ^ i55, i21);
            int i56 = i48 + i44;
            int c16 = r70.f.c(i35 ^ i56, i12);
            int i57 = i39 + c16;
            int c17 = r70.f.c(i44 ^ i57, i28);
            int i58 = i56 + c17;
            int c18 = r70.f.c(c16 ^ i58, i23);
            int i59 = i57 + c18;
            int c19 = r70.f.c(c17 ^ i59, i21);
            int i61 = i47 + i43;
            int c21 = r70.f.c(i34 ^ i61, i12);
            int i62 = i38 + c21;
            int c22 = r70.f.c(i43 ^ i62, i28);
            int i63 = i61 + c22;
            int c23 = r70.f.c(c21 ^ i63, i23);
            int i64 = i62 + c23;
            int c24 = r70.f.c(c22 ^ i64, i21);
            int i65 = i46 + i42;
            int c25 = r70.f.c(i33 ^ i65, 16);
            int i66 = i37 + c25;
            int c26 = r70.f.c(i42 ^ i66, i28);
            int i67 = i65 + c26;
            int c27 = r70.f.c(c25 ^ i67, 8);
            int i68 = i66 + c27;
            int c28 = r70.f.c(c26 ^ i68, 7);
            int i69 = i54 + c19;
            int c29 = r70.f.c(c27 ^ i69, 16);
            int i71 = i64 + c29;
            int c31 = r70.f.c(c19 ^ i71, 12);
            i49 = i69 + c31;
            i33 = r70.f.c(c29 ^ i49, 8);
            i38 = i71 + i33;
            i44 = r70.f.c(c31 ^ i38, 7);
            int i72 = i58 + c24;
            int c32 = r70.f.c(c14 ^ i72, 16);
            int i73 = i68 + c32;
            int c33 = r70.f.c(c24 ^ i73, 12);
            i48 = i72 + c33;
            i36 = r70.f.c(c32 ^ i48, 8);
            i37 = i73 + i36;
            i43 = r70.f.c(c33 ^ i37, 7);
            int i74 = i63 + c28;
            int c34 = r70.f.c(c18 ^ i74, 16);
            int i75 = i55 + c34;
            int c35 = r70.f.c(c28 ^ i75, 12);
            i47 = i74 + c35;
            i35 = r70.f.c(c34 ^ i47, 8);
            i41 = i75 + i35;
            i42 = r70.f.c(c35 ^ i41, 7);
            int i76 = i67 + c15;
            i12 = 16;
            int c36 = r70.f.c(c23 ^ i76, 16);
            int i77 = i59 + c36;
            int c37 = r70.f.c(c15 ^ i77, 12);
            i46 = i76 + c37;
            i34 = r70.f.c(c36 ^ i46, 8);
            i39 = i77 + i34;
            i45 = r70.f.c(c37 ^ i39, 7);
            i51 -= 2;
            c11 = 0;
            i28 = 12;
            i23 = 8;
            i21 = 7;
        }
        iArr2[c11] = i49 + iArr[c11];
        iArr2[1] = i48 + iArr[1];
        iArr2[2] = i47 + iArr[2];
        iArr2[3] = i46 + iArr[3];
        iArr2[4] = i45 + iArr[4];
        iArr2[5] = i44 + iArr[5];
        iArr2[6] = i43 + iArr[6];
        iArr2[7] = i42 + iArr[7];
        iArr2[8] = i41 + iArr[8];
        iArr2[9] = i39 + iArr[9];
        iArr2[10] = i38 + iArr[10];
        iArr2[11] = i37 + iArr[11];
        iArr2[12] = i36 + iArr[12];
        iArr2[13] = i35 + iArr[13];
        iArr2[14] = i34 + iArr[14];
        iArr2[15] = i33 + iArr[15];
    }

    @Override // l50.t0
    protected void a() {
        int[] iArr = this.f36907c;
        int i11 = iArr[12] + 1;
        iArr[12] = i11;
        if (i11 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // l50.t0
    protected void b(byte[] bArr) {
        j(this.f36905a, this.f36907c, this.f36908d);
        r70.i.j(this.f36908d, bArr, 0);
    }

    @Override // l50.t0
    protected void f() {
        int[] iArr = this.f36907c;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // l50.t0, org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "ChaCha" + this.f36905a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l50.t0
    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            e(bArr.length, this.f36907c, 0);
            r70.i.n(bArr, 0, this.f36907c, 4, 4);
            r70.i.n(bArr, bArr.length - 16, this.f36907c, 8, 4);
        }
        r70.i.n(bArr2, 0, this.f36907c, 14, 2);
    }
}