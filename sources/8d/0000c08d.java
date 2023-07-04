package y0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import l0.a1;
import v1.e;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    private static final float f58236b;

    /* renamed from: d  reason: collision with root package name */
    private static final float f58238d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f58239e;

    /* renamed from: a  reason: collision with root package name */
    private static final float f58235a = x2.g.f(24);

    /* renamed from: c  reason: collision with root package name */
    private static final float f58237c = x2.g.f(20);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<Boolean, vz.b0> f58240a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f58241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.l<? super Boolean, vz.b0> lVar, boolean z11) {
            super(0);
            this.f58240a = lVar;
            this.f58241b = z11;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f58240a.mo12invoke(Boolean.valueOf(!this.f58241b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f58242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<Boolean, vz.b0> f58243b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f58244c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f58245d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o0.m f58246e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f58247f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f58248g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f58249h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z11, h00.l<? super Boolean, vz.b0> lVar, o1.f fVar, boolean z12, o0.m mVar, i iVar, int i11, int i12) {
            super(2);
            this.f58242a = z11;
            this.f58243b = lVar;
            this.f58244c = fVar;
            this.f58245d = z12;
            this.f58246e = mVar;
            this.f58247f = iVar;
            this.f58248g = i11;
            this.f58249h = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            k.a(this.f58242a, this.f58243b, this.f58244c, this.f58245d, this.f58246e, this.f58247f, iVar, this.f58248g | 1, this.f58249h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<v1.e, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y0.h f58250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v1<t1.a0> f58251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v1<t1.a0> f58252c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v1<t1.a0> f58253d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v1<Float> f58254e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v1<Float> f58255f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0.h hVar, v1<t1.a0> v1Var, v1<t1.a0> v1Var2, v1<t1.a0> v1Var3, v1<Float> v1Var4, v1<Float> v1Var5) {
            super(1);
            this.f58250a = hVar;
            this.f58251b = v1Var;
            this.f58252c = v1Var2;
            this.f58253d = v1Var3;
            this.f58254e = v1Var4;
            this.f58255f = v1Var5;
        }

        public final void a(v1.e Canvas) {
            kotlin.jvm.internal.s.g(Canvas, "$this$Canvas");
            float floor = (float) Math.floor(Canvas.i0(k.f58238d));
            k.s(Canvas, k.g(this.f58251b), k.c(this.f58252c), Canvas.i0(k.f58239e), floor);
            k.t(Canvas, k.f(this.f58253d), k.d(this.f58254e), k.e(this.f58255f), floor, this.f58250a);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.e eVar) {
            a(eVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f58256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m2.a f58257b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f58258c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f58259d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58260e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, m2.a aVar, o1.f fVar, i iVar, int i11) {
            super(2);
            this.f58256a = z11;
            this.f58257b = aVar;
            this.f58258c = fVar;
            this.f58259d = iVar;
            this.f58260e = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            k.b(this.f58256a, this.f58257b, this.f58258c, this.f58259d, iVar, this.f58260e | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.q<a1.b<m2.a>, c1.i, Integer, l0.c0<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f58261a = new e();

        e() {
            super(3);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ l0.c0<Float> invoke(a1.b<m2.a> bVar, c1.i iVar, Integer num) {
            return invoke(bVar, iVar, num.intValue());
        }

        public final l0.c0<Float> invoke(a1.b<m2.a> animateFloat, c1.i iVar, int i11) {
            l0.c0<Float> f11;
            kotlin.jvm.internal.s.g(animateFloat, "$this$animateFloat");
            iVar.x(-1028757885);
            m2.a b11 = animateFloat.b();
            m2.a aVar = m2.a.Off;
            if (b11 == aVar) {
                f11 = l0.j.g(0, 1, null);
            } else {
                f11 = animateFloat.a() == aVar ? l0.j.f(100) : l0.j.k(100, 0, null, 6, null);
            }
            iVar.N();
            return f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.q<a1.b<m2.a>, c1.i, Integer, l0.c0<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f58262a = new f();

        f() {
            super(3);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ l0.c0<Float> invoke(a1.b<m2.a> bVar, c1.i iVar, Integer num) {
            return invoke(bVar, iVar, num.intValue());
        }

        public final l0.c0<Float> invoke(a1.b<m2.a> animateFloat, c1.i iVar, int i11) {
            l0.c0<Float> f11;
            kotlin.jvm.internal.s.g(animateFloat, "$this$animateFloat");
            iVar.x(-1028758388);
            m2.a b11 = animateFloat.b();
            m2.a aVar = m2.a.Off;
            if (b11 == aVar) {
                f11 = l0.j.k(100, 0, null, 6, null);
            } else {
                f11 = animateFloat.a() == aVar ? l0.j.f(100) : l0.j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
            }
            iVar.N();
            return f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m2.a f58263a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f58264b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f58265c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f58266d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o0.m f58267e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f58268f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f58269g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f58270h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m2.a aVar, h00.a<vz.b0> aVar2, o1.f fVar, boolean z11, o0.m mVar, i iVar, int i11, int i12) {
            super(2);
            this.f58263a = aVar;
            this.f58264b = aVar2;
            this.f58265c = fVar;
            this.f58266d = z11;
            this.f58267e = mVar;
            this.f58268f = iVar;
            this.f58269g = i11;
            this.f58270h = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            k.h(this.f58263a, this.f58264b, this.f58265c, this.f58266d, this.f58267e, this.f58268f, iVar, this.f58269g | 1, this.f58270h);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58271a;

        static {
            int[] iArr = new int[m2.a.values().length];
            iArr[m2.a.On.ordinal()] = 1;
            iArr[m2.a.Off.ordinal()] = 2;
            iArr[m2.a.Indeterminate.ordinal()] = 3;
            f58271a = iArr;
        }
    }

    static {
        float f11 = 2;
        f58236b = x2.g.f(f11);
        f58238d = x2.g.f(f11);
        f58239e = x2.g.f(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r26, h00.l<? super java.lang.Boolean, vz.b0> r27, o1.f r28, boolean r29, o0.m r30, y0.i r31, c1.i r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.k.a(boolean, h00.l, o1.f, boolean, o0.m, y0.i, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207 A[LOOP:0: B:77:0x0205->B:78:0x0207, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(boolean r34, m2.a r35, o1.f r36, y0.i r37, c1.i r38, int r39) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.k.b(boolean, m2.a, o1.f, y0.i, c1.i, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(v1<t1.a0> v1Var) {
        return v1Var.getValue().v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(v1<t1.a0> v1Var) {
        return v1Var.getValue().v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(v1<t1.a0> v1Var) {
        return v1Var.getValue().v();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(m2.a r25, h00.a<vz.b0> r26, o1.f r27, boolean r28, o0.m r29, y0.i r30, c1.i r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.k.h(m2.a, h00.a, o1.f, boolean, o0.m, y0.i, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(v1.e eVar, long j11, long j12, float f11, float f12) {
        float f13 = f12 / 2.0f;
        v1.j jVar = new v1.j(f12, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null);
        float i11 = s1.l.i(eVar.c());
        if (t1.a0.n(j11, j12)) {
            e.b.l(eVar, j11, 0L, s1.m.a(i11, i11), s1.b.b(f11, BitmapDescriptorFactory.HUE_RED, 2, null), v1.i.f53871a, BitmapDescriptorFactory.HUE_RED, null, 0, 226, null);
            return;
        }
        float f14 = i11 - (2 * f12);
        e.b.l(eVar, j11, s1.g.a(f12, f12), s1.m.a(f14, f14), s1.b.b(Math.max((float) BitmapDescriptorFactory.HUE_RED, f11 - f12), BitmapDescriptorFactory.HUE_RED, 2, null), v1.i.f53871a, BitmapDescriptorFactory.HUE_RED, null, 0, 224, null);
        float f15 = i11 - f12;
        e.b.l(eVar, j12, s1.g.a(f13, f13), s1.m.a(f15, f15), s1.b.b(f11 - f13, BitmapDescriptorFactory.HUE_RED, 2, null), jVar, BitmapDescriptorFactory.HUE_RED, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(v1.e eVar, long j11, float f11, float f12, float f13, y0.h hVar) {
        v1.j jVar = new v1.j(f13, BitmapDescriptorFactory.HUE_RED, t1.f1.f51429b.c(), 0, null, 26, null);
        float i11 = s1.l.i(eVar.c());
        float a11 = y2.a.a(0.4f, 0.5f, f12);
        float a12 = y2.a.a(0.7f, 0.5f, f12);
        float a13 = y2.a.a(0.5f, 0.5f, f12);
        float a14 = y2.a.a(0.3f, 0.5f, f12);
        hVar.a().reset();
        hVar.a().l(0.2f * i11, a13 * i11);
        hVar.a().o(a11 * i11, a12 * i11);
        hVar.a().o(0.8f * i11, i11 * a14);
        hVar.b().a(hVar.a(), false);
        hVar.c().reset();
        hVar.b().b(BitmapDescriptorFactory.HUE_RED, hVar.b().getLength() * f11, hVar.c(), true);
        e.b.h(eVar, hVar.c(), j11, BitmapDescriptorFactory.HUE_RED, jVar, null, 0, 52, null);
    }
}