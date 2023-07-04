package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final h00.l<y0, vz.b0> f3137a = a.f3140a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3138b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f3139c = 0;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3140a = new a();

        a() {
            super(1);
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    public static final h00.l<y0, vz.b0> a() {
        return f3137a;
    }

    public static final o1.f b(o1.f fVar, h00.l<? super y0, vz.b0> inspectorInfo, o1.f wrapped) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        w0 w0Var = new w0(inspectorInfo);
        return fVar.g0(w0Var).g0(wrapped).g0(w0Var.b());
    }

    public static final boolean c() {
        return f3138b;
    }
}