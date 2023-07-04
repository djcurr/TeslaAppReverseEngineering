package u1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import wz.o;

/* loaded from: classes.dex */
public final class k extends u1.c {

    /* renamed from: p  reason: collision with root package name */
    public static final h f52946p = new h(null);

    /* renamed from: q  reason: collision with root package name */
    private static final h00.l<Double, Double> f52947q = g.f52966a;

    /* renamed from: d  reason: collision with root package name */
    private final m f52948d;

    /* renamed from: e  reason: collision with root package name */
    private final float f52949e;

    /* renamed from: f  reason: collision with root package name */
    private final float f52950f;

    /* renamed from: g  reason: collision with root package name */
    private final l f52951g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f52952h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f52953i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f52954j;

    /* renamed from: k  reason: collision with root package name */
    private final h00.l<Double, Double> f52955k;

    /* renamed from: l  reason: collision with root package name */
    private final h00.l<Double, Double> f52956l;

    /* renamed from: m  reason: collision with root package name */
    private final h00.l<Double, Double> f52957m;

    /* renamed from: n  reason: collision with root package name */
    private final h00.l<Double, Double> f52958n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f52959o;

    /* loaded from: classes.dex */
    static final class a extends u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f52960a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar) {
            super(1);
            this.f52960a = lVar;
        }

        public final Double a(double d11) {
            return Double.valueOf(u1.d.n(d11, this.f52960a.a(), this.f52960a.b(), this.f52960a.c(), this.f52960a.d(), this.f52960a.g()));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f52961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(1);
            this.f52961a = lVar;
        }

        public final Double a(double d11) {
            return Double.valueOf(u1.d.o(d11, this.f52961a.a(), this.f52961a.b(), this.f52961a.c(), this.f52961a.d(), this.f52961a.e(), this.f52961a.f(), this.f52961a.g()));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static final class c extends u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f52962a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l lVar) {
            super(1);
            this.f52962a = lVar;
        }

        public final Double a(double d11) {
            return Double.valueOf(u1.d.p(d11, this.f52962a.a(), this.f52962a.b(), this.f52962a.c(), this.f52962a.d(), this.f52962a.g()));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static final class d extends u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f52963a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l lVar) {
            super(1);
            this.f52963a = lVar;
        }

        public final Double a(double d11) {
            return Double.valueOf(u1.d.q(d11, this.f52963a.a(), this.f52963a.b(), this.f52963a.c(), this.f52963a.d(), this.f52963a.e(), this.f52963a.f(), this.f52963a.g()));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static final class e extends u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ double f52964a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(double d11) {
            super(1);
            this.f52964a = d11;
        }

        public final Double a(double d11) {
            if (d11 < 0.0d) {
                d11 = 0.0d;
            }
            return Double.valueOf(Math.pow(d11, 1.0d / this.f52964a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static final class f extends u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ double f52965a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(double d11) {
            super(1);
            this.f52965a = d11;
        }

        public final Double a(double d11) {
            if (d11 < 0.0d) {
                d11 = 0.0d;
            }
            return Double.valueOf(Math.pow(d11, this.f52965a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static final class g extends u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f52966a = new g();

        g() {
            super(1);
        }

        public final Double a(double d11) {
            return Double.valueOf(d11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class h {
        private h() {
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float e(float[] fArr) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            float f17 = ((((((f11 * f14) + (f12 * f15)) + (f13 * f16)) - (f14 * f15)) - (f12 * f13)) - (f11 * f16)) * 0.5f;
            return f17 < BitmapDescriptorFactory.HUE_RED ? -f17 : f17;
        }

        private final boolean f(double d11, h00.l<? super Double, Double> lVar, h00.l<? super Double, Double> lVar2) {
            return Math.abs(lVar.invoke(Double.valueOf(d11)).doubleValue() - lVar2.invoke(Double.valueOf(d11)).doubleValue()) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] fArr, m mVar) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            float a11 = mVar.a();
            float b11 = mVar.b();
            float f17 = 1;
            float f18 = (f17 - f11) / f12;
            float f19 = f11 / f12;
            float f21 = (f13 / f14) - f19;
            float f22 = (a11 / b11) - f19;
            float f23 = ((f17 - f13) / f14) - f18;
            float f24 = (f15 / f16) - f19;
            float f25 = (((((f17 - a11) / b11) - f18) * f21) - (f22 * f23)) / (((((f17 - f15) / f16) - f18) * f21) - (f23 * f24));
            float f26 = (f22 - (f24 * f25)) / f21;
            float f27 = (1.0f - f26) - f25;
            float f28 = f27 / f12;
            float f29 = f26 / f14;
            float f31 = f25 / f16;
            return new float[]{f28 * f11, f27, f28 * ((1.0f - f11) - f12), f29 * f13, f26, f29 * ((1.0f - f13) - f14), f31 * f15, f25, f31 * ((1.0f - f15) - f16)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float[] fArr3 = {fArr[0] - fArr2[0], fArr[1] - fArr2[1], fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            return i(fArr3[0], fArr3[1], fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) >= BitmapDescriptorFactory.HUE_RED && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= BitmapDescriptorFactory.HUE_RED && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= BitmapDescriptorFactory.HUE_RED && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= BitmapDescriptorFactory.HUE_RED && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= BitmapDescriptorFactory.HUE_RED && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= BitmapDescriptorFactory.HUE_RED;
        }

        private final float i(float f11, float f12, float f13, float f14) {
            return (f11 * f14) - (f12 * f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] fArr, m mVar, h00.l<? super Double, Double> lVar, h00.l<? super Double, Double> lVar2, float f11, float f12, int i11) {
            if (i11 == 0) {
                return true;
            }
            u1.e eVar = u1.e.f52899a;
            if (u1.d.g(fArr, eVar.t()) && u1.d.f(mVar, u1.g.f52932a.e())) {
                if (f11 == BitmapDescriptorFactory.HUE_RED) {
                    if (f12 == 1.0f) {
                        k s11 = eVar.s();
                        for (double d11 = 0.0d; d11 <= 1.0d; d11 += 0.00392156862745098d) {
                            if (!f(d11, lVar, s11.p()) || !f(d11, lVar2, s11.m())) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] fArr, float f11, float f12) {
            float e11 = e(fArr);
            u1.e eVar = u1.e.f52899a;
            return (e11 / e(eVar.o()) > 0.9f && h(fArr, eVar.t())) || (f11 < BitmapDescriptorFactory.HUE_RED && f12 > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f11 = fArr[0] + fArr[1] + fArr[2];
                fArr2[0] = fArr[0] / f11;
                fArr2[1] = fArr[1] / f11;
                float f12 = fArr[3] + fArr[4] + fArr[5];
                fArr2[2] = fArr[3] / f12;
                fArr2[3] = fArr[4] / f12;
                float f13 = fArr[6] + fArr[7] + fArr[8];
                fArr2[4] = fArr[6] / f13;
                fArr2[5] = fArr[7] / f13;
            } else {
                o.m(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }
    }

    /* loaded from: classes.dex */
    static final class i extends u implements h00.l<Double, Double> {
        i() {
            super(1);
        }

        public final Double a(double d11) {
            double k11;
            h00.l<Double, Double> m11 = k.this.m();
            k11 = m00.l.k(d11, k.this.f52949e, k.this.f52950f);
            return m11.invoke(Double.valueOf(k11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static final class j extends u implements h00.l<Double, Double> {
        j() {
            super(1);
        }

        public final Double a(double d11) {
            double k11;
            k11 = m00.l.k(k.this.p().invoke(Double.valueOf(d11)).doubleValue(), k.this.f52949e, k.this.f52950f);
            return Double.valueOf(k11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(String name, float[] primaries, m whitePoint, float[] fArr, h00.l<? super Double, Double> oetf, h00.l<? super Double, Double> eotf, float f11, float f12, l lVar, int i11) {
        super(name, u1.b.f52891a.b(), i11, null);
        s.g(name, "name");
        s.g(primaries, "primaries");
        s.g(whitePoint, "whitePoint");
        s.g(oetf, "oetf");
        s.g(eotf, "eotf");
        this.f52948d = whitePoint;
        this.f52949e = f11;
        this.f52950f = f12;
        this.f52951g = lVar;
        this.f52955k = oetf;
        this.f52956l = new j();
        this.f52957m = eotf;
        this.f52958n = new i();
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f11 < f12) {
            h hVar = f52946p;
            float[] l11 = hVar.l(primaries);
            this.f52952h = l11;
            if (fArr == null) {
                this.f52953i = hVar.g(l11, whitePoint);
            } else if (fArr.length == 9) {
                this.f52953i = fArr;
            } else {
                throw new IllegalArgumentException(s.p("Transform must have 9 entries! Has ", Integer.valueOf(fArr.length)));
            }
            this.f52954j = u1.d.j(this.f52953i);
            hVar.k(l11, f11, f12);
            this.f52959o = hVar.j(l11, whitePoint, oetf, eotf, f11, f12, i11);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f11 + ", max=" + f12 + "; min must be strictly < max");
    }

    @Override // u1.c
    public float[] a(float[] v11) {
        s.g(v11, "v");
        u1.d.m(this.f52954j, v11);
        v11[0] = (float) this.f52956l.invoke(Double.valueOf(v11[0])).doubleValue();
        v11[1] = (float) this.f52956l.invoke(Double.valueOf(v11[1])).doubleValue();
        v11[2] = (float) this.f52956l.invoke(Double.valueOf(v11[2])).doubleValue();
        return v11;
    }

    @Override // u1.c
    public float d(int i11) {
        return this.f52950f;
    }

    @Override // u1.c
    public float e(int i11) {
        return this.f52949e;
    }

    @Override // u1.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.c(m0.b(k.class), m0.b(obj.getClass())) && super.equals(obj)) {
            k kVar = (k) obj;
            if (Float.compare(kVar.f52949e, this.f52949e) == 0 && Float.compare(kVar.f52950f, this.f52950f) == 0 && s.c(this.f52948d, kVar.f52948d) && Arrays.equals(this.f52952h, kVar.f52952h)) {
                l lVar = this.f52951g;
                if (lVar != null) {
                    return s.c(lVar, kVar.f52951g);
                }
                if (kVar.f52951g == null) {
                    return true;
                }
                if (s.c(this.f52955k, kVar.f52955k)) {
                    return s.c(this.f52957m, kVar.f52957m);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // u1.c
    public boolean h() {
        return this.f52959o;
    }

    @Override // u1.c
    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f52948d.hashCode()) * 31) + Arrays.hashCode(this.f52952h)) * 31;
        float f11 = this.f52949e;
        int floatToIntBits = (hashCode + (!((f11 > BitmapDescriptorFactory.HUE_RED ? 1 : (f11 == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) == 0) ? Float.floatToIntBits(f11) : 0)) * 31;
        float f12 = this.f52950f;
        int floatToIntBits2 = (floatToIntBits + (!(f12 == BitmapDescriptorFactory.HUE_RED) ? Float.floatToIntBits(f12) : 0)) * 31;
        l lVar = this.f52951g;
        int hashCode2 = floatToIntBits2 + (lVar != null ? lVar.hashCode() : 0);
        return this.f52951g == null ? (((hashCode2 * 31) + this.f52955k.hashCode()) * 31) + this.f52957m.hashCode() : hashCode2;
    }

    @Override // u1.c
    public float[] i(float[] v11) {
        s.g(v11, "v");
        v11[0] = (float) this.f52958n.invoke(Double.valueOf(v11[0])).doubleValue();
        v11[1] = (float) this.f52958n.invoke(Double.valueOf(v11[1])).doubleValue();
        v11[2] = (float) this.f52958n.invoke(Double.valueOf(v11[2])).doubleValue();
        return u1.d.m(this.f52953i, v11);
    }

    public final h00.l<Double, Double> l() {
        return this.f52958n;
    }

    public final h00.l<Double, Double> m() {
        return this.f52957m;
    }

    public final float[] n() {
        return this.f52954j;
    }

    public final h00.l<Double, Double> o() {
        return this.f52956l;
    }

    public final h00.l<Double, Double> p() {
        return this.f52955k;
    }

    public final float[] q() {
        return this.f52953i;
    }

    public final m r() {
        return this.f52948d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(java.lang.String r13, float[] r14, u1.m r15, u1.l r16, int r17) {
        /*
            r12 = this;
            r9 = r16
            java.lang.String r0 = "name"
            r1 = r13
            kotlin.jvm.internal.s.g(r13, r0)
            java.lang.String r0 = "primaries"
            r2 = r14
            kotlin.jvm.internal.s.g(r14, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r15
            kotlin.jvm.internal.s.g(r15, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.s.g(r9, r0)
            double r4 = r16.e()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r5
        L28:
            if (r0 == 0) goto L3d
            double r10 = r16.f()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r4
            goto L35
        L34:
            r0 = r5
        L35:
            if (r0 == 0) goto L3d
            u1.k$a r0 = new u1.k$a
            r0.<init>(r9)
            goto L42
        L3d:
            u1.k$b r0 = new u1.k$b
            r0.<init>(r9)
        L42:
            r8 = r0
            double r10 = r16.e()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r0 = r4
            goto L4e
        L4d:
            r0 = r5
        L4e:
            if (r0 == 0) goto L62
            double r10 = r16.f()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            goto L5a
        L59:
            r4 = r5
        L5a:
            if (r4 == 0) goto L62
            u1.k$c r0 = new u1.k$c
            r0.<init>(r9)
            goto L67
        L62:
            u1.k$d r0 = new u1.k$d
            r0.<init>(r9)
        L67:
            r6 = r0
            r7 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r8
            r8 = r10
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.k.<init>(java.lang.String, float[], u1.m, u1.l, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(java.lang.String r23, float[] r24, u1.m r25, double r26, float r28, float r29, int r30) {
        /*
            r22 = this;
            r1 = r26
            java.lang.String r0 = "name"
            r15 = r23
            kotlin.jvm.internal.s.g(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r24
            kotlin.jvm.internal.s.g(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r25
            kotlin.jvm.internal.s.g(r14, r0)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L21
            r5 = r3
            goto L22
        L21:
            r5 = r4
        L22:
            if (r5 == 0) goto L27
            h00.l<java.lang.Double, java.lang.Double> r5 = u1.k.f52947q
            goto L2c
        L27:
            u1.k$e r5 = new u1.k$e
            r5.<init>(r1)
        L2c:
            r17 = r5
            if (r0 != 0) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            if (r3 == 0) goto L37
            h00.l<java.lang.Double, java.lang.Double> r0 = u1.k.f52947q
            goto L3c
        L37:
            u1.k$f r0 = new u1.k$f
            r0.<init>(r1)
        L3c:
            r18 = r0
            u1.l r19 = new u1.l
            r0 = r19
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r20 = 0
            r13 = r20
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r26
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r5 = 0
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r6 = r17
            r7 = r18
            r8 = r28
            r9 = r29
            r10 = r19
            r11 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.k.<init>(java.lang.String, float[], u1.m, double, float, float, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(k colorSpace, float[] transform, m whitePoint) {
        this(colorSpace.g(), colorSpace.f52952h, whitePoint, transform, colorSpace.f52955k, colorSpace.f52957m, colorSpace.f52949e, colorSpace.f52950f, colorSpace.f52951g, -1);
        s.g(colorSpace, "colorSpace");
        s.g(transform, "transform");
        s.g(whitePoint, "whitePoint");
    }
}