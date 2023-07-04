package i50;

/* loaded from: classes5.dex */
public class d0 extends h {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f29983h = new int[64];

    /* renamed from: d  reason: collision with root package name */
    private int[] f29984d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f29985e;

    /* renamed from: f  reason: collision with root package name */
    private int f29986f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f29987g;

    static {
        int i11;
        int i12 = 0;
        while (true) {
            if (i12 >= 16) {
                break;
            }
            f29983h[i12] = (2043430169 >>> (32 - i12)) | (2043430169 << i12);
            i12++;
        }
        for (i11 = 16; i11 < 64; i11++) {
            int i13 = i11 % 32;
            f29983h[i11] = (2055708042 >>> (32 - i13)) | (2055708042 << i13);
        }
    }

    public d0() {
        this.f29984d = new int[8];
        this.f29985e = new int[16];
        this.f29987g = new int[68];
        reset();
    }

    public d0(d0 d0Var) {
        super(d0Var);
        this.f29984d = new int[8];
        this.f29985e = new int[16];
        this.f29987g = new int[68];
        m(d0Var);
    }

    private int g(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private int h(int i11, int i12, int i13) {
        return (i11 & i13) | (i11 & i12) | (i12 & i13);
    }

    private int i(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private int j(int i11, int i12, int i13) {
        return ((~i11) & i13) | (i12 & i11);
    }

    private int k(int i11) {
        return (i11 ^ ((i11 << 9) | (i11 >>> 23))) ^ ((i11 << 17) | (i11 >>> 15));
    }

    private int l(int i11) {
        return (i11 ^ ((i11 << 15) | (i11 >>> 17))) ^ ((i11 << 23) | (i11 >>> 9));
    }

    private void m(d0 d0Var) {
        int[] iArr = d0Var.f29984d;
        int[] iArr2 = this.f29984d;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = d0Var.f29985e;
        int[] iArr4 = this.f29985e;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.f29986f = d0Var.f29986f;
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        d0 d0Var = (d0) hVar;
        super.b(d0Var);
        m(d0Var);
    }

    @Override // r70.h
    public r70.h copy() {
        return new d0(this);
    }

    @Override // i50.h
    protected void d() {
        int i11;
        int i12 = 0;
        while (true) {
            if (i12 >= 16) {
                break;
            }
            this.f29987g[i12] = this.f29985e[i12];
            i12++;
        }
        for (int i13 = 16; i13 < 68; i13++) {
            int[] iArr = this.f29987g;
            int i14 = iArr[i13 - 3];
            int i15 = iArr[i13 - 13];
            iArr[i13] = (l(((i14 >>> 17) | (i14 << 15)) ^ (iArr[i13 - 16] ^ iArr[i13 - 9])) ^ ((i15 >>> 25) | (i15 << 7))) ^ this.f29987g[i13 - 6];
        }
        int[] iArr2 = this.f29984d;
        int i16 = iArr2[0];
        int i17 = iArr2[1];
        int i18 = iArr2[2];
        int i19 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = 0;
        int i26 = i23;
        for (i11 = 16; i25 < i11; i11 = 16) {
            int i27 = (i16 << 12) | (i16 >>> 20);
            int i28 = i27 + i21 + f29983h[i25];
            int i29 = (i28 << 7) | (i28 >>> 25);
            int[] iArr3 = this.f29987g;
            int i31 = iArr3[i25];
            int i32 = (i17 << 9) | (i17 >>> 23);
            int i33 = (i22 << 19) | (i22 >>> 13);
            i25++;
            i22 = i21;
            i21 = k(i(i21, i22, i26) + i24 + i29 + i31);
            i19 = i18;
            i18 = i32;
            i24 = i26;
            i26 = i33;
            i17 = i16;
            i16 = g(i16, i17, i18) + i19 + (i29 ^ i27) + (i31 ^ iArr3[i25 + 4]);
        }
        int i34 = i24;
        int i35 = i21;
        int i36 = i26;
        int i37 = i19;
        int i38 = i18;
        int i39 = i17;
        int i41 = i16;
        int i42 = 16;
        while (i42 < 64) {
            int i43 = (i41 << 12) | (i41 >>> 20);
            int i44 = i43 + i35 + f29983h[i42];
            int i45 = (i44 << 7) | (i44 >>> 25);
            int[] iArr4 = this.f29987g;
            int i46 = iArr4[i42];
            int i47 = (i22 << 19) | (i22 >>> 13);
            i42++;
            i22 = i35;
            i35 = k(j(i35, i22, i36) + i34 + i45 + i46);
            i37 = i38;
            i38 = (i39 >>> 23) | (i39 << 9);
            i39 = i41;
            i41 = h(i41, i39, i38) + i37 + (i45 ^ i43) + (i46 ^ iArr4[i42 + 4]);
            i34 = i36;
            i36 = i47;
        }
        int[] iArr5 = this.f29984d;
        iArr5[0] = i41 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i39;
        iArr5[2] = iArr5[2] ^ i38;
        iArr5[3] = iArr5[3] ^ i37;
        iArr5[4] = iArr5[4] ^ i35;
        iArr5[5] = iArr5[5] ^ i22;
        iArr5[6] = i36 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i34;
        this.f29986f = 0;
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        c();
        r70.i.g(this.f29984d, bArr, i11);
        reset();
        return 32;
    }

    @Override // i50.h
    protected void e(long j11) {
        int i11 = this.f29986f;
        if (i11 > 14) {
            this.f29985e[i11] = 0;
            this.f29986f = i11 + 1;
            d();
        }
        while (true) {
            int i12 = this.f29986f;
            if (i12 >= 14) {
                int[] iArr = this.f29985e;
                int i13 = i12 + 1;
                this.f29986f = i13;
                iArr[i12] = (int) (j11 >>> 32);
                this.f29986f = i13 + 1;
                iArr[i13] = (int) j11;
                return;
            }
            this.f29985e[i12] = 0;
            this.f29986f = i12 + 1;
        }
    }

    @Override // i50.h
    protected void f(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i13 + 1] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8);
        int[] iArr = this.f29985e;
        int i15 = this.f29986f;
        iArr[i15] = i14;
        int i16 = i15 + 1;
        this.f29986f = i16;
        if (i16 >= 16) {
            d();
        }
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 32;
    }

    @Override // i50.h, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        int[] iArr = this.f29984d;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.f29986f = 0;
    }
}