package i50;

import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public class w extends h {

    /* renamed from: n  reason: collision with root package name */
    static final int[] f30148n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d  reason: collision with root package name */
    private int f30149d;

    /* renamed from: e  reason: collision with root package name */
    private int f30150e;

    /* renamed from: f  reason: collision with root package name */
    private int f30151f;

    /* renamed from: g  reason: collision with root package name */
    private int f30152g;

    /* renamed from: h  reason: collision with root package name */
    private int f30153h;

    /* renamed from: i  reason: collision with root package name */
    private int f30154i;

    /* renamed from: j  reason: collision with root package name */
    private int f30155j;

    /* renamed from: k  reason: collision with root package name */
    private int f30156k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f30157l;

    /* renamed from: m  reason: collision with root package name */
    private int f30158m;

    public w() {
        this.f30157l = new int[64];
        reset();
    }

    public w(w wVar) {
        super(wVar);
        this.f30157l = new int[64];
        m(wVar);
    }

    private int g(int i11, int i12, int i13) {
        return ((~i11) & i13) ^ (i12 & i11);
    }

    private int h(int i11, int i12, int i13) {
        return ((i11 & i13) ^ (i11 & i12)) ^ (i12 & i13);
    }

    private int i(int i11) {
        return ((i11 << 10) | (i11 >>> 22)) ^ (((i11 >>> 2) | (i11 << 30)) ^ ((i11 >>> 13) | (i11 << 19)));
    }

    private int j(int i11) {
        return ((i11 << 7) | (i11 >>> 25)) ^ (((i11 >>> 6) | (i11 << 26)) ^ ((i11 >>> 11) | (i11 << 21)));
    }

    private int k(int i11) {
        return (i11 >>> 3) ^ (((i11 >>> 7) | (i11 << 25)) ^ ((i11 >>> 18) | (i11 << 14)));
    }

    private int l(int i11) {
        return (i11 >>> 10) ^ (((i11 >>> 17) | (i11 << 15)) ^ ((i11 >>> 19) | (i11 << 13)));
    }

    private void m(w wVar) {
        super.b(wVar);
        this.f30149d = wVar.f30149d;
        this.f30150e = wVar.f30150e;
        this.f30151f = wVar.f30151f;
        this.f30152g = wVar.f30152g;
        this.f30153h = wVar.f30153h;
        this.f30154i = wVar.f30154i;
        this.f30155j = wVar.f30155j;
        this.f30156k = wVar.f30156k;
        int[] iArr = wVar.f30157l;
        System.arraycopy(iArr, 0, this.f30157l, 0, iArr.length);
        this.f30158m = wVar.f30158m;
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        m((w) hVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new w(this);
    }

    @Override // i50.h
    protected void d() {
        for (int i11 = 16; i11 <= 63; i11++) {
            int[] iArr = this.f30157l;
            int l11 = l(iArr[i11 - 2]);
            int[] iArr2 = this.f30157l;
            iArr[i11] = l11 + iArr2[i11 - 7] + k(iArr2[i11 - 15]) + this.f30157l[i11 - 16];
        }
        int i12 = this.f30149d;
        int i13 = this.f30150e;
        int i14 = this.f30151f;
        int i15 = this.f30152g;
        int i16 = this.f30153h;
        int i17 = this.f30154i;
        int i18 = this.f30155j;
        int i19 = this.f30156k;
        int i21 = 0;
        for (int i22 = 0; i22 < 8; i22++) {
            int j11 = j(i16) + g(i16, i17, i18);
            int[] iArr3 = f30148n;
            int i23 = i19 + j11 + iArr3[i21] + this.f30157l[i21];
            int i24 = i15 + i23;
            int i25 = i23 + i(i12) + h(i12, i13, i14);
            int i26 = i21 + 1;
            int j12 = i18 + j(i24) + g(i24, i16, i17) + iArr3[i26] + this.f30157l[i26];
            int i27 = i14 + j12;
            int i28 = j12 + i(i25) + h(i25, i12, i13);
            int i29 = i26 + 1;
            int j13 = i17 + j(i27) + g(i27, i24, i16) + iArr3[i29] + this.f30157l[i29];
            int i31 = i13 + j13;
            int i32 = j13 + i(i28) + h(i28, i25, i12);
            int i33 = i29 + 1;
            int j14 = i16 + j(i31) + g(i31, i27, i24) + iArr3[i33] + this.f30157l[i33];
            int i34 = i12 + j14;
            int i35 = j14 + i(i32) + h(i32, i28, i25);
            int i36 = i33 + 1;
            int j15 = i24 + j(i34) + g(i34, i31, i27) + iArr3[i36] + this.f30157l[i36];
            i19 = i25 + j15;
            i15 = j15 + i(i35) + h(i35, i32, i28);
            int i37 = i36 + 1;
            int j16 = i27 + j(i19) + g(i19, i34, i31) + iArr3[i37] + this.f30157l[i37];
            i18 = i28 + j16;
            i14 = j16 + i(i15) + h(i15, i35, i32);
            int i38 = i37 + 1;
            int j17 = i31 + j(i18) + g(i18, i19, i34) + iArr3[i38] + this.f30157l[i38];
            i17 = i32 + j17;
            i13 = j17 + i(i14) + h(i14, i15, i35);
            int i39 = i38 + 1;
            int j18 = i34 + j(i17) + g(i17, i18, i19) + iArr3[i39] + this.f30157l[i39];
            i16 = i35 + j18;
            i12 = j18 + i(i13) + h(i13, i14, i15);
            i21 = i39 + 1;
        }
        this.f30149d += i12;
        this.f30150e += i13;
        this.f30151f += i14;
        this.f30152g += i15;
        this.f30153h += i16;
        this.f30154i += i17;
        this.f30155j += i18;
        this.f30156k += i19;
        this.f30158m = 0;
        for (int i41 = 0; i41 < 16; i41++) {
            this.f30157l[i41] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        c();
        r70.i.f(this.f30149d, bArr, i11);
        r70.i.f(this.f30150e, bArr, i11 + 4);
        r70.i.f(this.f30151f, bArr, i11 + 8);
        r70.i.f(this.f30152g, bArr, i11 + 12);
        r70.i.f(this.f30153h, bArr, i11 + 16);
        r70.i.f(this.f30154i, bArr, i11 + 20);
        r70.i.f(this.f30155j, bArr, i11 + 24);
        reset();
        return 28;
    }

    @Override // i50.h
    protected void e(long j11) {
        if (this.f30158m > 14) {
            d();
        }
        int[] iArr = this.f30157l;
        iArr[14] = (int) (j11 >>> 32);
        iArr[15] = (int) (j11 & (-1));
    }

    @Override // i50.h
    protected void f(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i13 + 1] & 255) | (bArr[i11] << 24) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8);
        int[] iArr = this.f30157l;
        int i15 = this.f30158m;
        iArr[i15] = i14;
        int i16 = i15 + 1;
        this.f30158m = i16;
        if (i16 == 16) {
            d();
        }
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA224;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 28;
    }

    @Override // i50.h, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        this.f30149d = -1056596264;
        this.f30150e = 914150663;
        this.f30151f = 812702999;
        this.f30152g = -150054599;
        this.f30153h = -4191439;
        this.f30154i = 1750603025;
        this.f30155j = 1694076839;
        this.f30156k = -1090891868;
        this.f30158m = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f30157l;
            if (i11 == iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }
}