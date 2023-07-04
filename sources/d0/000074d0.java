package i50;

import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public class v extends h {

    /* renamed from: d  reason: collision with root package name */
    private int f30141d;

    /* renamed from: e  reason: collision with root package name */
    private int f30142e;

    /* renamed from: f  reason: collision with root package name */
    private int f30143f;

    /* renamed from: g  reason: collision with root package name */
    private int f30144g;

    /* renamed from: h  reason: collision with root package name */
    private int f30145h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f30146i;

    /* renamed from: j  reason: collision with root package name */
    private int f30147j;

    public v() {
        this.f30146i = new int[80];
        reset();
    }

    public v(v vVar) {
        super(vVar);
        this.f30146i = new int[80];
        g(vVar);
    }

    private void g(v vVar) {
        this.f30141d = vVar.f30141d;
        this.f30142e = vVar.f30142e;
        this.f30143f = vVar.f30143f;
        this.f30144g = vVar.f30144g;
        this.f30145h = vVar.f30145h;
        int[] iArr = vVar.f30146i;
        System.arraycopy(iArr, 0, this.f30146i, 0, iArr.length);
        this.f30147j = vVar.f30147j;
    }

    private int h(int i11, int i12, int i13) {
        return ((~i11) & i13) | (i12 & i11);
    }

    private int i(int i11, int i12, int i13) {
        return (i11 & i13) | (i11 & i12) | (i12 & i13);
    }

    private int j(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        v vVar = (v) hVar;
        super.b(vVar);
        g(vVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new v(this);
    }

    @Override // i50.h
    protected void d() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        for (int i24 = 16; i24 < 80; i24++) {
            int[] iArr = this.f30146i;
            int i25 = ((iArr[i24 - 3] ^ iArr[i24 - 8]) ^ iArr[i24 - 14]) ^ iArr[i24 - 16];
            iArr[i24] = (i25 >>> 31) | (i25 << 1);
        }
        int i26 = this.f30141d;
        int i27 = this.f30142e;
        int i28 = this.f30143f;
        int i29 = this.f30144g;
        int i31 = this.f30145h;
        int i32 = 0;
        int i33 = 0;
        while (i32 < 4) {
            int i34 = i33 + 1;
            int h11 = i31 + ((i26 << 5) | (i26 >>> 27)) + h(i27, i28, i29) + this.f30146i[i33] + 1518500249;
            int i35 = (i27 >>> 2) | (i27 << 30);
            int i36 = i34 + 1;
            int h12 = i29 + ((h11 << 5) | (h11 >>> 27)) + h(i26, i35, i28) + this.f30146i[i34] + 1518500249;
            int i37 = (i26 >>> 2) | (i26 << 30);
            int i38 = i36 + 1;
            int h13 = i28 + ((h12 << 5) | (h12 >>> 27)) + h(h11, i37, i35) + this.f30146i[i36] + 1518500249;
            i31 = (h11 >>> 2) | (h11 << 30);
            int i39 = i38 + 1;
            i27 = i35 + ((h13 << 5) | (h13 >>> 27)) + h(h12, i31, i37) + this.f30146i[i38] + 1518500249;
            i29 = (h12 >>> 2) | (h12 << 30);
            i26 = i37 + ((i27 << 5) | (i27 >>> 27)) + h(h13, i29, i31) + this.f30146i[i39] + 1518500249;
            i28 = (h13 >>> 2) | (h13 << 30);
            i32++;
            i33 = i39 + 1;
        }
        int i41 = 0;
        while (i41 < 4) {
            int i42 = i33 + 1;
            int j11 = i31 + ((i26 << 5) | (i26 >>> 27)) + j(i27, i28, i29) + this.f30146i[i33] + 1859775393;
            int i43 = (i27 >>> 2) | (i27 << 30);
            int i44 = i42 + 1;
            int j12 = i29 + ((j11 << 5) | (j11 >>> 27)) + j(i26, i43, i28) + this.f30146i[i42] + 1859775393;
            int i45 = (i26 >>> 2) | (i26 << 30);
            int i46 = i44 + 1;
            int j13 = i28 + ((j12 << 5) | (j12 >>> 27)) + j(j11, i45, i43) + this.f30146i[i44] + 1859775393;
            i31 = (j11 >>> 2) | (j11 << 30);
            int i47 = i46 + 1;
            i27 = i43 + ((j13 << 5) | (j13 >>> 27)) + j(j12, i31, i45) + this.f30146i[i46] + 1859775393;
            i29 = (j12 >>> 2) | (j12 << 30);
            i26 = i45 + ((i27 << 5) | (i27 >>> 27)) + j(j13, i29, i31) + this.f30146i[i47] + 1859775393;
            i28 = (j13 >>> 2) | (j13 << 30);
            i41++;
            i33 = i47 + 1;
        }
        int i48 = 0;
        while (i48 < 4) {
            int i49 = i31 + (((((i26 << 5) | (i26 >>> 27)) + i(i27, i28, i29)) + this.f30146i[i33]) - 1894007588);
            int i51 = i29 + (((((i49 << 5) | (i49 >>> 27)) + i(i26, i18, i28)) + this.f30146i[i17]) - 1894007588);
            int i52 = i28 + (((((i51 << 5) | (i51 >>> 27)) + i(i49, i21, i18)) + this.f30146i[i19]) - 1894007588);
            i31 = (i49 >>> 2) | (i49 << 30);
            i27 = ((i27 >>> 2) | (i27 << 30)) + (((((i52 << 5) | (i52 >>> 27)) + i(i51, i31, i21)) + this.f30146i[i22]) - 1894007588);
            i29 = (i51 >>> 2) | (i51 << 30);
            i26 = ((i26 >>> 2) | (i26 << 30)) + (((((i27 << 5) | (i27 >>> 27)) + i(i52, i29, i31)) + this.f30146i[i23]) - 1894007588);
            i28 = (i52 >>> 2) | (i52 << 30);
            i48++;
            i33 = i33 + 1 + 1 + 1 + 1 + 1;
        }
        int i53 = 0;
        while (i53 <= 3) {
            int j14 = i31 + (((((i26 << 5) | (i26 >>> 27)) + j(i27, i28, i29)) + this.f30146i[i33]) - 899497514);
            int j15 = i29 + (((((j14 << 5) | (j14 >>> 27)) + j(i26, i12, i28)) + this.f30146i[i11]) - 899497514);
            int j16 = i28 + (((((j15 << 5) | (j15 >>> 27)) + j(j14, i14, i12)) + this.f30146i[i13]) - 899497514);
            i31 = (j14 >>> 2) | (j14 << 30);
            i27 = ((i27 >>> 2) | (i27 << 30)) + (((((j16 << 5) | (j16 >>> 27)) + j(j15, i31, i14)) + this.f30146i[i15]) - 899497514);
            i29 = (j15 >>> 2) | (j15 << 30);
            i26 = ((i26 >>> 2) | (i26 << 30)) + (((((i27 << 5) | (i27 >>> 27)) + j(j16, i29, i31)) + this.f30146i[i16]) - 899497514);
            i28 = (j16 >>> 2) | (j16 << 30);
            i53++;
            i33 = i33 + 1 + 1 + 1 + 1 + 1;
        }
        this.f30141d += i26;
        this.f30142e += i27;
        this.f30143f += i28;
        this.f30144g += i29;
        this.f30145h += i31;
        this.f30147j = 0;
        for (int i54 = 0; i54 < 16; i54++) {
            this.f30146i[i54] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        c();
        r70.i.f(this.f30141d, bArr, i11);
        r70.i.f(this.f30142e, bArr, i11 + 4);
        r70.i.f(this.f30143f, bArr, i11 + 8);
        r70.i.f(this.f30144g, bArr, i11 + 12);
        r70.i.f(this.f30145h, bArr, i11 + 16);
        reset();
        return 20;
    }

    @Override // i50.h
    protected void e(long j11) {
        if (this.f30147j > 14) {
            d();
        }
        int[] iArr = this.f30146i;
        iArr[14] = (int) (j11 >>> 32);
        iArr[15] = (int) j11;
    }

    @Override // i50.h
    protected void f(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i13 + 1] & 255) | (bArr[i11] << 24) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8);
        int[] iArr = this.f30146i;
        int i15 = this.f30147j;
        iArr[i15] = i14;
        int i16 = i15 + 1;
        this.f30147j = i16;
        if (i16 == 16) {
            d();
        }
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA1;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 20;
    }

    @Override // i50.h, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        this.f30141d = 1732584193;
        this.f30142e = -271733879;
        this.f30143f = -1732584194;
        this.f30144g = 271733878;
        this.f30145h = -1009589776;
        this.f30147j = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f30146i;
            if (i11 == iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }
}