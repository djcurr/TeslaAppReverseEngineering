package w0;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    private d0 f55274a;

    /* renamed from: b  reason: collision with root package name */
    private final long f55275b;

    /* renamed from: c  reason: collision with root package name */
    private h00.l<? super n2.w, vz.b0> f55276c;

    /* renamed from: d  reason: collision with root package name */
    private x0.i f55277d;

    /* renamed from: e  reason: collision with root package name */
    private f2.o f55278e;

    /* renamed from: f  reason: collision with root package name */
    private n2.w f55279f;

    /* renamed from: g  reason: collision with root package name */
    private long f55280g;

    /* renamed from: h  reason: collision with root package name */
    private long f55281h;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<n2.w, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55282a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(n2.w wVar) {
            invoke2(wVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(n2.w it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }
    }

    public y0(d0 textDelegate, long j11) {
        kotlin.jvm.internal.s.g(textDelegate, "textDelegate");
        this.f55274a = textDelegate;
        this.f55275b = j11;
        this.f55276c = a.f55282a;
        this.f55280g = s1.f.f49950b.c();
        this.f55281h = t1.a0.f51365b.f();
    }

    public final f2.o a() {
        return this.f55278e;
    }

    public final n2.w b() {
        return this.f55279f;
    }

    public final h00.l<n2.w, vz.b0> c() {
        return this.f55276c;
    }

    public final long d() {
        return this.f55280g;
    }

    public final x0.i e() {
        return this.f55277d;
    }

    public final long f() {
        return this.f55275b;
    }

    public final d0 g() {
        return this.f55274a;
    }

    public final void h(f2.o oVar) {
        this.f55278e = oVar;
    }

    public final void i(n2.w wVar) {
        this.f55279f = wVar;
    }

    public final void j(h00.l<? super n2.w, vz.b0> lVar) {
        kotlin.jvm.internal.s.g(lVar, "<set-?>");
        this.f55276c = lVar;
    }

    public final void k(long j11) {
        this.f55280g = j11;
    }

    public final void l(x0.i iVar) {
        this.f55277d = iVar;
    }

    public final void m(long j11) {
        this.f55281h = j11;
    }

    public final void n(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<set-?>");
        this.f55274a = d0Var;
    }
}