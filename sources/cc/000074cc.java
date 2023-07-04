package i50;

/* loaded from: classes5.dex */
public class r extends h {

    /* renamed from: d  reason: collision with root package name */
    private int f30106d;

    /* renamed from: e  reason: collision with root package name */
    private int f30107e;

    /* renamed from: f  reason: collision with root package name */
    private int f30108f;

    /* renamed from: g  reason: collision with root package name */
    private int f30109g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f30110h;

    /* renamed from: i  reason: collision with root package name */
    private int f30111i;

    public r() {
        this.f30110h = new int[16];
        reset();
    }

    public r(r rVar) {
        super(rVar);
        this.f30110h = new int[16];
        p(rVar);
    }

    private int g(int i11, int i12, int i13, int i14, int i15, int i16) {
        return o(i11 + q(i12, i13, i14) + i15, i16);
    }

    private int h(int i11, int i12, int i13, int i14, int i15, int i16) {
        return o(i11 + r(i12, i13, i14) + i15 + 1518500249, i16);
    }

    private int i(int i11, int i12, int i13, int i14, int i15, int i16) {
        return o(i11 + s(i12, i13, i14) + i15 + 1859775393, i16);
    }

    private int j(int i11, int i12, int i13, int i14, int i15, int i16) {
        return o(((i11 + t(i12, i13, i14)) + i15) - 1894007588, i16);
    }

    private int k(int i11, int i12, int i13, int i14, int i15, int i16) {
        return o(i11 + q(i12, i13, i14) + i15, i16);
    }

    private int l(int i11, int i12, int i13, int i14, int i15, int i16) {
        return o(i11 + r(i12, i13, i14) + i15 + 1836072691, i16);
    }

    private int m(int i11, int i12, int i13, int i14, int i15, int i16) {
        return o(i11 + s(i12, i13, i14) + i15 + 1548603684, i16);
    }

    private int n(int i11, int i12, int i13, int i14, int i15, int i16) {
        return o(i11 + t(i12, i13, i14) + i15 + 1352829926, i16);
    }

    private int o(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }

    private void p(r rVar) {
        super.b(rVar);
        this.f30106d = rVar.f30106d;
        this.f30107e = rVar.f30107e;
        this.f30108f = rVar.f30108f;
        this.f30109g = rVar.f30109g;
        int[] iArr = rVar.f30110h;
        System.arraycopy(iArr, 0, this.f30110h, 0, iArr.length);
        this.f30111i = rVar.f30111i;
    }

    private int q(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private int r(int i11, int i12, int i13) {
        return ((~i11) & i13) | (i12 & i11);
    }

    private int s(int i11, int i12, int i13) {
        return (i11 | (~i12)) ^ i13;
    }

    private int t(int i11, int i12, int i13) {
        return (i11 & i13) | (i12 & (~i13));
    }

    private void u(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        p((r) hVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new r(this);
    }

    @Override // i50.h
    protected void d() {
        int i11 = this.f30106d;
        int i12 = this.f30107e;
        int i13 = this.f30108f;
        int i14 = this.f30109g;
        int g11 = g(i11, i12, i13, i14, this.f30110h[0], 11);
        int g12 = g(i14, g11, i12, i13, this.f30110h[1], 14);
        int g13 = g(i13, g12, g11, i12, this.f30110h[2], 15);
        int g14 = g(i12, g13, g12, g11, this.f30110h[3], 12);
        int g15 = g(g11, g14, g13, g12, this.f30110h[4], 5);
        int g16 = g(g12, g15, g14, g13, this.f30110h[5], 8);
        int g17 = g(g13, g16, g15, g14, this.f30110h[6], 7);
        int g18 = g(g14, g17, g16, g15, this.f30110h[7], 9);
        int g19 = g(g15, g18, g17, g16, this.f30110h[8], 11);
        int g21 = g(g16, g19, g18, g17, this.f30110h[9], 13);
        int g22 = g(g17, g21, g19, g18, this.f30110h[10], 14);
        int g23 = g(g18, g22, g21, g19, this.f30110h[11], 15);
        int g24 = g(g19, g23, g22, g21, this.f30110h[12], 6);
        int g25 = g(g21, g24, g23, g22, this.f30110h[13], 7);
        int g26 = g(g22, g25, g24, g23, this.f30110h[14], 9);
        int g27 = g(g23, g26, g25, g24, this.f30110h[15], 8);
        int h11 = h(g24, g27, g26, g25, this.f30110h[7], 7);
        int h12 = h(g25, h11, g27, g26, this.f30110h[4], 6);
        int h13 = h(g26, h12, h11, g27, this.f30110h[13], 8);
        int h14 = h(g27, h13, h12, h11, this.f30110h[1], 13);
        int h15 = h(h11, h14, h13, h12, this.f30110h[10], 11);
        int h16 = h(h12, h15, h14, h13, this.f30110h[6], 9);
        int h17 = h(h13, h16, h15, h14, this.f30110h[15], 7);
        int h18 = h(h14, h17, h16, h15, this.f30110h[3], 15);
        int h19 = h(h15, h18, h17, h16, this.f30110h[12], 7);
        int h21 = h(h16, h19, h18, h17, this.f30110h[0], 12);
        int h22 = h(h17, h21, h19, h18, this.f30110h[9], 15);
        int h23 = h(h18, h22, h21, h19, this.f30110h[5], 9);
        int h24 = h(h19, h23, h22, h21, this.f30110h[2], 11);
        int h25 = h(h21, h24, h23, h22, this.f30110h[14], 7);
        int h26 = h(h22, h25, h24, h23, this.f30110h[11], 13);
        int h27 = h(h23, h26, h25, h24, this.f30110h[8], 12);
        int i15 = i(h24, h27, h26, h25, this.f30110h[3], 11);
        int i16 = i(h25, i15, h27, h26, this.f30110h[10], 13);
        int i17 = i(h26, i16, i15, h27, this.f30110h[14], 6);
        int i18 = i(h27, i17, i16, i15, this.f30110h[4], 7);
        int i19 = i(i15, i18, i17, i16, this.f30110h[9], 14);
        int i21 = i(i16, i19, i18, i17, this.f30110h[15], 9);
        int i22 = i(i17, i21, i19, i18, this.f30110h[8], 13);
        int i23 = i(i18, i22, i21, i19, this.f30110h[1], 15);
        int i24 = i(i19, i23, i22, i21, this.f30110h[2], 14);
        int i25 = i(i21, i24, i23, i22, this.f30110h[7], 8);
        int i26 = i(i22, i25, i24, i23, this.f30110h[0], 13);
        int i27 = i(i23, i26, i25, i24, this.f30110h[6], 6);
        int i28 = i(i24, i27, i26, i25, this.f30110h[13], 5);
        int i29 = i(i25, i28, i27, i26, this.f30110h[11], 12);
        int i31 = i(i26, i29, i28, i27, this.f30110h[5], 7);
        int i32 = i(i27, i31, i29, i28, this.f30110h[12], 5);
        int j11 = j(i28, i32, i31, i29, this.f30110h[1], 11);
        int j12 = j(i29, j11, i32, i31, this.f30110h[9], 12);
        int j13 = j(i31, j12, j11, i32, this.f30110h[11], 14);
        int j14 = j(i32, j13, j12, j11, this.f30110h[10], 15);
        int j15 = j(j11, j14, j13, j12, this.f30110h[0], 14);
        int j16 = j(j12, j15, j14, j13, this.f30110h[8], 15);
        int j17 = j(j13, j16, j15, j14, this.f30110h[12], 9);
        int j18 = j(j14, j17, j16, j15, this.f30110h[4], 8);
        int j19 = j(j15, j18, j17, j16, this.f30110h[13], 9);
        int j21 = j(j16, j19, j18, j17, this.f30110h[3], 14);
        int j22 = j(j17, j21, j19, j18, this.f30110h[7], 5);
        int j23 = j(j18, j22, j21, j19, this.f30110h[15], 6);
        int j24 = j(j19, j23, j22, j21, this.f30110h[14], 8);
        int j25 = j(j21, j24, j23, j22, this.f30110h[5], 6);
        int j26 = j(j22, j25, j24, j23, this.f30110h[6], 5);
        int j27 = j(j23, j26, j25, j24, this.f30110h[2], 12);
        int n11 = n(i11, i12, i13, i14, this.f30110h[5], 8);
        int n12 = n(i14, n11, i12, i13, this.f30110h[14], 9);
        int n13 = n(i13, n12, n11, i12, this.f30110h[7], 9);
        int n14 = n(i12, n13, n12, n11, this.f30110h[0], 11);
        int n15 = n(n11, n14, n13, n12, this.f30110h[9], 13);
        int n16 = n(n12, n15, n14, n13, this.f30110h[2], 15);
        int n17 = n(n13, n16, n15, n14, this.f30110h[11], 15);
        int n18 = n(n14, n17, n16, n15, this.f30110h[4], 5);
        int n19 = n(n15, n18, n17, n16, this.f30110h[13], 7);
        int n21 = n(n16, n19, n18, n17, this.f30110h[6], 7);
        int n22 = n(n17, n21, n19, n18, this.f30110h[15], 8);
        int n23 = n(n18, n22, n21, n19, this.f30110h[8], 11);
        int n24 = n(n19, n23, n22, n21, this.f30110h[1], 14);
        int n25 = n(n21, n24, n23, n22, this.f30110h[10], 14);
        int n26 = n(n22, n25, n24, n23, this.f30110h[3], 12);
        int n27 = n(n23, n26, n25, n24, this.f30110h[12], 6);
        int m11 = m(n24, n27, n26, n25, this.f30110h[6], 9);
        int m12 = m(n25, m11, n27, n26, this.f30110h[11], 13);
        int m13 = m(n26, m12, m11, n27, this.f30110h[3], 15);
        int m14 = m(n27, m13, m12, m11, this.f30110h[7], 7);
        int m15 = m(m11, m14, m13, m12, this.f30110h[0], 12);
        int m16 = m(m12, m15, m14, m13, this.f30110h[13], 8);
        int m17 = m(m13, m16, m15, m14, this.f30110h[5], 9);
        int m18 = m(m14, m17, m16, m15, this.f30110h[10], 11);
        int m19 = m(m15, m18, m17, m16, this.f30110h[14], 7);
        int m21 = m(m16, m19, m18, m17, this.f30110h[15], 7);
        int m22 = m(m17, m21, m19, m18, this.f30110h[8], 12);
        int m23 = m(m18, m22, m21, m19, this.f30110h[12], 7);
        int m24 = m(m19, m23, m22, m21, this.f30110h[4], 6);
        int m25 = m(m21, m24, m23, m22, this.f30110h[9], 15);
        int m26 = m(m22, m25, m24, m23, this.f30110h[1], 13);
        int m27 = m(m23, m26, m25, m24, this.f30110h[2], 11);
        int l11 = l(m24, m27, m26, m25, this.f30110h[15], 9);
        int l12 = l(m25, l11, m27, m26, this.f30110h[5], 7);
        int l13 = l(m26, l12, l11, m27, this.f30110h[1], 15);
        int l14 = l(m27, l13, l12, l11, this.f30110h[3], 11);
        int l15 = l(l11, l14, l13, l12, this.f30110h[7], 8);
        int l16 = l(l12, l15, l14, l13, this.f30110h[14], 6);
        int l17 = l(l13, l16, l15, l14, this.f30110h[6], 6);
        int l18 = l(l14, l17, l16, l15, this.f30110h[9], 14);
        int l19 = l(l15, l18, l17, l16, this.f30110h[11], 12);
        int l21 = l(l16, l19, l18, l17, this.f30110h[8], 13);
        int l22 = l(l17, l21, l19, l18, this.f30110h[12], 5);
        int l23 = l(l18, l22, l21, l19, this.f30110h[2], 14);
        int l24 = l(l19, l23, l22, l21, this.f30110h[10], 13);
        int l25 = l(l21, l24, l23, l22, this.f30110h[0], 13);
        int l26 = l(l22, l25, l24, l23, this.f30110h[4], 7);
        int l27 = l(l23, l26, l25, l24, this.f30110h[13], 5);
        int k11 = k(l24, l27, l26, l25, this.f30110h[8], 15);
        int k12 = k(l25, k11, l27, l26, this.f30110h[6], 5);
        int k13 = k(l26, k12, k11, l27, this.f30110h[4], 8);
        int k14 = k(l27, k13, k12, k11, this.f30110h[1], 11);
        int k15 = k(k11, k14, k13, k12, this.f30110h[3], 14);
        int k16 = k(k12, k15, k14, k13, this.f30110h[11], 14);
        int k17 = k(k13, k16, k15, k14, this.f30110h[15], 6);
        int k18 = k(k14, k17, k16, k15, this.f30110h[0], 14);
        int k19 = k(k15, k18, k17, k16, this.f30110h[5], 6);
        int k21 = k(k16, k19, k18, k17, this.f30110h[12], 9);
        int k22 = k(k17, k21, k19, k18, this.f30110h[2], 12);
        int k23 = k(k18, k22, k21, k19, this.f30110h[13], 9);
        int k24 = k(k19, k23, k22, k21, this.f30110h[9], 12);
        int k25 = k(k21, k24, k23, k22, this.f30110h[7], 5);
        int k26 = k(k22, k25, k24, k23, this.f30110h[10], 15);
        int k27 = k(k23, k26, k25, k24, this.f30110h[14], 8);
        this.f30107e = this.f30108f + j25 + k24;
        this.f30108f = this.f30109g + j24 + k27;
        this.f30109g = this.f30106d + j27 + k26;
        this.f30106d = k25 + j26 + this.f30107e;
        this.f30111i = 0;
        int i33 = 0;
        while (true) {
            int[] iArr = this.f30110h;
            if (i33 == iArr.length) {
                return;
            }
            iArr[i33] = 0;
            i33++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        c();
        u(this.f30106d, bArr, i11);
        u(this.f30107e, bArr, i11 + 4);
        u(this.f30108f, bArr, i11 + 8);
        u(this.f30109g, bArr, i11 + 12);
        reset();
        return 16;
    }

    @Override // i50.h
    protected void e(long j11) {
        if (this.f30111i > 14) {
            d();
        }
        int[] iArr = this.f30110h;
        iArr[14] = (int) ((-1) & j11);
        iArr[15] = (int) (j11 >>> 32);
    }

    @Override // i50.h
    protected void f(byte[] bArr, int i11) {
        int[] iArr = this.f30110h;
        int i12 = this.f30111i;
        int i13 = i12 + 1;
        this.f30111i = i13;
        iArr[i12] = ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        if (i13 == 16) {
            d();
        }
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 16;
    }

    @Override // i50.h, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        this.f30106d = 1732584193;
        this.f30107e = -271733879;
        this.f30108f = -1732584194;
        this.f30109g = 271733878;
        this.f30111i = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f30110h;
            if (i11 == iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }
}