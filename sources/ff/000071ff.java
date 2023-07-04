package h2;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final m1.v f28668a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<k, vz.b0> f28669b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<k, vz.b0> f28670c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.l<k, vz.b0> f28671d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28672a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(!((g0) it2).isValid());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<k, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f28673a = new b();

        b() {
            super(1);
        }

        public final void a(k layoutNode) {
            kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
            if (layoutNode.isValid()) {
                layoutNode.M0();
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(k kVar) {
            a(kVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<k, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f28674a = new c();

        c() {
            super(1);
        }

        public final void a(k layoutNode) {
            kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
            if (layoutNode.isValid()) {
                layoutNode.M0();
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(k kVar) {
            a(kVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<k, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f28675a = new d();

        d() {
            super(1);
        }

        public final void a(k layoutNode) {
            kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
            if (layoutNode.isValid()) {
                layoutNode.N0();
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(k kVar) {
            a(kVar);
            return vz.b0.f54756a;
        }
    }

    public h0(h00.l<? super h00.a<vz.b0>, vz.b0> onChangedExecutor) {
        kotlin.jvm.internal.s.g(onChangedExecutor, "onChangedExecutor");
        this.f28668a = new m1.v(onChangedExecutor);
        this.f28669b = d.f28675a;
        this.f28670c = b.f28673a;
        this.f28671d = c.f28674a;
    }

    public final void a() {
        this.f28668a.h(a.f28672a);
    }

    public final void b(k node, h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(node, "node");
        kotlin.jvm.internal.s.g(block, "block");
        e(node, this.f28671d, block);
    }

    public final void c(k node, h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(node, "node");
        kotlin.jvm.internal.s.g(block, "block");
        e(node, this.f28670c, block);
    }

    public final void d(k node, h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(node, "node");
        kotlin.jvm.internal.s.g(block, "block");
        e(node, this.f28669b, block);
    }

    public final <T extends g0> void e(T target, h00.l<? super T, vz.b0> onChanged, h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(target, "target");
        kotlin.jvm.internal.s.g(onChanged, "onChanged");
        kotlin.jvm.internal.s.g(block, "block");
        this.f28668a.j(target, onChanged, block);
    }

    public final void f() {
        this.f28668a.k();
    }

    public final void g() {
        this.f28668a.l();
        this.f28668a.g();
    }

    public final void h(h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(block, "block");
        this.f28668a.m(block);
    }
}