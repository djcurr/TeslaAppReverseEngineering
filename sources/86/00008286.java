package l50;

/* loaded from: classes5.dex */
public final class i extends h {

    /* renamed from: n  reason: collision with root package name */
    protected int[] f36771n = new int[48];

    /* renamed from: o  reason: collision with root package name */
    protected int[] f36772o = new int[48];

    /* renamed from: p  reason: collision with root package name */
    protected int[] f36773p = new int[192];

    /* renamed from: q  reason: collision with root package name */
    protected int[] f36774q = new int[192];

    /* renamed from: r  reason: collision with root package name */
    private int[] f36775r = new int[8];

    @Override // l50.h, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "CAST6";
    }

    @Override // l50.h, org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // l50.h
    protected int j(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = new int[4];
        m(c(bArr, i11), c(bArr, i11 + 4), c(bArr, i11 + 8), c(bArr, i11 + 12), iArr);
        a(iArr[0], bArr2, i12);
        a(iArr[1], bArr2, i12 + 4);
        a(iArr[2], bArr2, i12 + 8);
        a(iArr[3], bArr2, i12 + 12);
        return 16;
    }

    @Override // l50.h
    protected int k(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = new int[4];
        n(c(bArr, i11), c(bArr, i11 + 4), c(bArr, i11 + 8), c(bArr, i11 + 12), iArr);
        a(iArr[0], bArr2, i12);
        a(iArr[1], bArr2, i12 + 4);
        a(iArr[2], bArr2, i12 + 8);
        a(iArr[3], bArr2, i12 + 12);
        return 16;
    }

    @Override // l50.h
    protected void l(byte[] bArr) {
        int i11 = 1518500249;
        int i12 = 19;
        for (int i13 = 0; i13 < 24; i13++) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = (i13 * 8) + i14;
                this.f36774q[i15] = i11;
                i11 += 1859775393;
                this.f36773p[i15] = i12;
                i12 = (i12 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i16 = 0; i16 < 8; i16++) {
            this.f36775r[i16] = c(bArr2, i16 * 4);
        }
        for (int i17 = 0; i17 < 12; i17++) {
            int i18 = i17 * 2;
            int i19 = i18 * 8;
            int[] iArr = this.f36775r;
            iArr[6] = iArr[6] ^ f(iArr[7], this.f36774q[i19], this.f36773p[i19]);
            int[] iArr2 = this.f36775r;
            int i21 = i19 + 1;
            iArr2[5] = iArr2[5] ^ g(iArr2[6], this.f36774q[i21], this.f36773p[i21]);
            int[] iArr3 = this.f36775r;
            int i22 = i19 + 2;
            iArr3[4] = iArr3[4] ^ h(iArr3[5], this.f36774q[i22], this.f36773p[i22]);
            int[] iArr4 = this.f36775r;
            int i23 = i19 + 3;
            iArr4[3] = f(iArr4[4], this.f36774q[i23], this.f36773p[i23]) ^ iArr4[3];
            int[] iArr5 = this.f36775r;
            int i24 = i19 + 4;
            iArr5[2] = g(iArr5[3], this.f36774q[i24], this.f36773p[i24]) ^ iArr5[2];
            int[] iArr6 = this.f36775r;
            int i25 = i19 + 5;
            iArr6[1] = h(iArr6[2], this.f36774q[i25], this.f36773p[i25]) ^ iArr6[1];
            int[] iArr7 = this.f36775r;
            int i26 = i19 + 6;
            iArr7[0] = iArr7[0] ^ f(iArr7[1], this.f36774q[i26], this.f36773p[i26]);
            int[] iArr8 = this.f36775r;
            int i27 = i19 + 7;
            iArr8[7] = g(iArr8[0], this.f36774q[i27], this.f36773p[i27]) ^ iArr8[7];
            int i28 = (i18 + 1) * 8;
            int[] iArr9 = this.f36775r;
            iArr9[6] = iArr9[6] ^ f(iArr9[7], this.f36774q[i28], this.f36773p[i28]);
            int[] iArr10 = this.f36775r;
            int i29 = i28 + 1;
            iArr10[5] = iArr10[5] ^ g(iArr10[6], this.f36774q[i29], this.f36773p[i29]);
            int[] iArr11 = this.f36775r;
            int i31 = i28 + 2;
            iArr11[4] = iArr11[4] ^ h(iArr11[5], this.f36774q[i31], this.f36773p[i31]);
            int[] iArr12 = this.f36775r;
            int i32 = i28 + 3;
            iArr12[3] = f(iArr12[4], this.f36774q[i32], this.f36773p[i32]) ^ iArr12[3];
            int[] iArr13 = this.f36775r;
            int i33 = i28 + 4;
            iArr13[2] = g(iArr13[3], this.f36774q[i33], this.f36773p[i33]) ^ iArr13[2];
            int[] iArr14 = this.f36775r;
            int i34 = i28 + 5;
            iArr14[1] = h(iArr14[2], this.f36774q[i34], this.f36773p[i34]) ^ iArr14[1];
            int[] iArr15 = this.f36775r;
            int i35 = i28 + 6;
            iArr15[0] = iArr15[0] ^ f(iArr15[1], this.f36774q[i35], this.f36773p[i35]);
            int[] iArr16 = this.f36775r;
            int i36 = i28 + 7;
            iArr16[7] = g(iArr16[0], this.f36774q[i36], this.f36773p[i36]) ^ iArr16[7];
            int[] iArr17 = this.f36771n;
            int i37 = i17 * 4;
            int[] iArr18 = this.f36775r;
            iArr17[i37] = iArr18[0] & 31;
            int i38 = i37 + 1;
            iArr17[i38] = iArr18[2] & 31;
            int i39 = i37 + 2;
            iArr17[i39] = iArr18[4] & 31;
            int i41 = i37 + 3;
            iArr17[i41] = iArr18[6] & 31;
            int[] iArr19 = this.f36772o;
            iArr19[i37] = iArr18[7];
            iArr19[i38] = iArr18[5];
            iArr19[i39] = iArr18[3];
            iArr19[i41] = iArr18[1];
        }
    }

    protected final void m(int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        int i16 = 0;
        while (true) {
            if (i16 >= 6) {
                break;
            }
            int i17 = (11 - i16) * 4;
            i13 ^= f(i14, this.f36772o[i17], this.f36771n[i17]);
            int i18 = i17 + 1;
            i12 ^= g(i13, this.f36772o[i18], this.f36771n[i18]);
            int i19 = i17 + 2;
            i11 ^= h(i12, this.f36772o[i19], this.f36771n[i19]);
            int i21 = i17 + 3;
            i14 ^= f(i11, this.f36772o[i21], this.f36771n[i21]);
            i16++;
        }
        for (i15 = 6; i15 < 12; i15++) {
            int i22 = (11 - i15) * 4;
            int i23 = i22 + 3;
            i14 ^= f(i11, this.f36772o[i23], this.f36771n[i23]);
            int i24 = i22 + 2;
            i11 ^= h(i12, this.f36772o[i24], this.f36771n[i24]);
            int i25 = i22 + 1;
            i12 ^= g(i13, this.f36772o[i25], this.f36771n[i25]);
            i13 ^= f(i14, this.f36772o[i22], this.f36771n[i22]);
        }
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
    }

    protected final void n(int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        int i16 = 0;
        while (true) {
            if (i16 >= 6) {
                break;
            }
            int i17 = i16 * 4;
            i13 ^= f(i14, this.f36772o[i17], this.f36771n[i17]);
            int i18 = i17 + 1;
            i12 ^= g(i13, this.f36772o[i18], this.f36771n[i18]);
            int i19 = i17 + 2;
            i11 ^= h(i12, this.f36772o[i19], this.f36771n[i19]);
            int i21 = i17 + 3;
            i14 ^= f(i11, this.f36772o[i21], this.f36771n[i21]);
            i16++;
        }
        for (i15 = 6; i15 < 12; i15++) {
            int i22 = i15 * 4;
            int i23 = i22 + 3;
            i14 ^= f(i11, this.f36772o[i23], this.f36771n[i23]);
            int i24 = i22 + 2;
            i11 ^= h(i12, this.f36772o[i24], this.f36771n[i24]);
            int i25 = i22 + 1;
            i12 ^= g(i13, this.f36772o[i25], this.f36771n[i25]);
            i13 ^= f(i14, this.f36772o[i22], this.f36771n[i22]);
        }
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
    }

    @Override // l50.h, org.bouncycastle.crypto.e
    public void reset() {
    }
}