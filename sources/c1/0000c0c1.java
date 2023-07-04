package y0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import l0.a1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final m1 f58467a = new m1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f58469b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f58470c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f58471d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.q<e0, c1.i, Integer, t1.a0> f58472e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f58473f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h00.u<Float, t1.a0, t1.a0, x2.g, Float, c1.i, Integer, vz.b0> f58474g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f58475h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(e0 e0Var, long j11, long j12, h00.q<? super e0, ? super c1.i, ? super Integer, t1.a0> qVar, boolean z11, h00.u<? super Float, ? super t1.a0, ? super t1.a0, ? super x2.g, ? super Float, ? super c1.i, ? super Integer, vz.b0> uVar, int i11) {
            super(2);
            this.f58469b = e0Var;
            this.f58470c = j11;
            this.f58471d = j12;
            this.f58472e = qVar;
            this.f58473f = z11;
            this.f58474g = uVar;
            this.f58475h = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            m1.this.a(this.f58469b, this.f58470c, this.f58471d, this.f58472e, this.f58473f, this.f58474g, iVar, this.f58475h | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.q<a1.b<e0>, c1.i, Integer, l0.c0<x2.g>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58476a = new b();

        b() {
            super(3);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ l0.c0<x2.g> invoke(a1.b<e0> bVar, c1.i iVar, Integer num) {
            return invoke(bVar, iVar, num.intValue());
        }

        public final l0.c0<x2.g> invoke(a1.b<e0> animateDp, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(animateDp, "$this$animateDp");
            iVar.x(337280971);
            l0.c1 k11 = l0.j.k(150, 0, null, 6, null);
            iVar.N();
            return k11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.q<a1.b<e0>, c1.i, Integer, l0.c0<t1.a0>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58477a = new c();

        c() {
            super(3);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ l0.c0<t1.a0> invoke(a1.b<e0> bVar, c1.i iVar, Integer num) {
            return invoke(bVar, iVar, num.intValue());
        }

        public final l0.c0<t1.a0> invoke(a1.b<e0> animateColor, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(animateColor, "$this$animateColor");
            iVar.x(337282861);
            l0.c1 k11 = l0.j.k(150, 0, null, 6, null);
            iVar.N();
            return k11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.q<a1.b<e0>, c1.i, Integer, l0.c0<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f58478a = new d();

        d() {
            super(3);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ l0.c0<Float> invoke(a1.b<e0> bVar, c1.i iVar, Integer num) {
            return invoke(bVar, iVar, num.intValue());
        }

        public final l0.c0<Float> invoke(a1.b<e0> animateFloat, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(animateFloat, "$this$animateFloat");
            iVar.x(337280605);
            l0.c1 k11 = l0.j.k(150, 0, null, 6, null);
            iVar.N();
            return k11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.q<a1.b<e0>, c1.i, Integer, l0.c0<t1.a0>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f58479a = new e();

        e() {
            super(3);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ l0.c0<t1.a0> invoke(a1.b<e0> bVar, c1.i iVar, Integer num) {
            return invoke(bVar, iVar, num.intValue());
        }

        public final l0.c0<t1.a0> invoke(a1.b<e0> animateColor, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(animateColor, "$this$animateColor");
            iVar.x(337282516);
            l0.c1 k11 = l0.j.k(150, 0, null, 6, null);
            iVar.N();
            return k11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.q<a1.b<e0>, c1.i, Integer, l0.c0<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f58480a = new f();

        f() {
            super(3);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ l0.c0<Float> invoke(a1.b<e0> bVar, c1.i iVar, Integer num) {
            return invoke(bVar, iVar, num.intValue());
        }

        public final l0.c0<Float> invoke(a1.b<e0> animateFloat, c1.i iVar, int i11) {
            l0.c0<Float> j11;
            kotlin.jvm.internal.s.g(animateFloat, "$this$animateFloat");
            iVar.x(337281409);
            e0 e0Var = e0.Focused;
            e0 e0Var2 = e0.UnfocusedEmpty;
            if (animateFloat.c(e0Var, e0Var2)) {
                j11 = l0.j.k(67, 0, l0.b0.b(), 2, null);
            } else if (!animateFloat.c(e0Var2, e0Var) && !animateFloat.c(e0.UnfocusedNotEmpty, e0Var2)) {
                j11 = l0.j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
            } else {
                j11 = l0.j.j(83, 67, l0.b0.b());
            }
            iVar.N();
            return j11;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58481a;

        static {
            int[] iArr = new int[e0.values().length];
            iArr[e0.Focused.ordinal()] = 1;
            iArr[e0.UnfocusedEmpty.ordinal()] = 2;
            iArr[e0.UnfocusedNotEmpty.ordinal()] = 3;
            f58481a = iArr;
        }
    }

    private m1() {
    }

    private static final float b(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    private static final float c(v1<x2.g> v1Var) {
        return v1Var.getValue().l();
    }

    private static final float d(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    private static final long e(v1<t1.a0> v1Var) {
        return v1Var.getValue().v();
    }

    private static final long f(v1<t1.a0> v1Var) {
        return v1Var.getValue().v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0244, code lost:
        if (r35 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021b, code lost:
        if (r35 != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(y0.e0 r29, long r30, long r32, h00.q<? super y0.e0, ? super c1.i, ? super java.lang.Integer, t1.a0> r34, boolean r35, h00.u<? super java.lang.Float, ? super t1.a0, ? super t1.a0, ? super x2.g, ? super java.lang.Float, ? super c1.i, ? super java.lang.Integer, vz.b0> r36, c1.i r37, int r38) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.m1.a(y0.e0, long, long, h00.q, boolean, h00.u, c1.i, int):void");
    }
}