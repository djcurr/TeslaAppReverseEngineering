package y0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import l0.l0;
import v1.e;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f58644a;

    /* renamed from: b  reason: collision with root package name */
    private static final l0.u f58645b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<v1.e, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f58646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f58647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v1.j f58648c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v1<Integer> f58649d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v1<Float> f58650e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v1<Float> f58651f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v1<Float> f58652g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, long j11, v1.j jVar, v1<Integer> v1Var, v1<Float> v1Var2, v1<Float> v1Var3, v1<Float> v1Var4) {
            super(1);
            this.f58646a = f11;
            this.f58647b = j11;
            this.f58648c = jVar;
            this.f58649d = v1Var;
            this.f58650e = v1Var2;
            this.f58651f = v1Var3;
            this.f58652g = v1Var4;
        }

        public final void a(v1.e Canvas) {
            kotlin.jvm.internal.s.g(Canvas, "$this$Canvas");
            s0.m(Canvas, s0.c(this.f58651f) + (((s0.d(this.f58649d) * 216.0f) % 360.0f) - 90.0f) + s0.e(this.f58652g), this.f58646a, Math.abs(s0.b(this.f58650e) - s0.c(this.f58651f)), this.f58647b, this.f58648c);
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
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f58653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f58654b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f58655c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58656d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58657e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o1.f fVar, long j11, float f11, int i11, int i12) {
            super(2);
            this.f58653a = fVar;
            this.f58654b = j11;
            this.f58655c = f11;
            this.f58656d = i11;
            this.f58657e = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            s0.a(this.f58653a, this.f58654b, this.f58655c, iVar, this.f58656d | 1, this.f58657e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<l0.b<Float>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58658a = new c();

        c() {
            super(1);
        }

        public final void a(l0.b<Float> keyframes) {
            kotlin.jvm.internal.s.g(keyframes, "$this$keyframes");
            keyframes.e(1332);
            keyframes.f(keyframes.a(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), 0), s0.f58645b);
            keyframes.a(Float.valueOf(290.0f), 666);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(l0.b<Float> bVar) {
            a(bVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<l0.b<Float>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f58659a = new d();

        d() {
            super(1);
        }

        public final void a(l0.b<Float> keyframes) {
            kotlin.jvm.internal.s.g(keyframes, "$this$keyframes");
            keyframes.e(1332);
            keyframes.f(keyframes.a(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), 666), s0.f58645b);
            keyframes.a(Float.valueOf(290.0f), keyframes.c());
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(l0.b<Float> bVar) {
            a(bVar);
            return vz.b0.f54756a;
        }
    }

    static {
        r0.f58617a.a();
        x2.g.f(240);
        f58644a = x2.g.f(40);
        new l0.u(0.2f, BitmapDescriptorFactory.HUE_RED, 0.8f, 1.0f);
        new l0.u(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        new l0.u(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.65f, 1.0f);
        new l0.u(0.1f, BitmapDescriptorFactory.HUE_RED, 0.45f, 1.0f);
        f58645b = new l0.u(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(o1.f r30, long r31, float r33, c1.i r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.s0.a(o1.f, long, float, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(v1<Integer> v1Var) {
        return v1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    private static final void l(v1.e eVar, float f11, float f12, long j11, v1.j jVar) {
        float f13 = 2;
        float f14 = jVar.f() / f13;
        float i11 = s1.l.i(eVar.c()) - (f13 * f14);
        e.b.a(eVar, j11, f11, f12, false, s1.g.a(f14, f14), s1.m.a(i11, i11), BitmapDescriptorFactory.HUE_RED, jVar, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(v1.e eVar, float f11, float f12, float f13, long j11, v1.j jVar) {
        l(eVar, f11 + (((f12 / x2.g.f(f58644a / 2)) * 57.29578f) / 2.0f), Math.max(f13, 0.1f), j11, jVar);
    }
}