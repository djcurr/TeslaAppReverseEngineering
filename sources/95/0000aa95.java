package ph;

/* loaded from: classes3.dex */
public final class a implements mm.a {

    /* renamed from: a  reason: collision with root package name */
    public static final mm.a f46449a = new a();

    /* renamed from: ph.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0992a implements lm.c<th.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0992a f46450a = new C0992a();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f46451b = lm.b.a("window").b(om.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f46452c = lm.b.a("logSourceMetrics").b(om.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f46453d = lm.b.a("globalMetrics").b(om.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f46454e = lm.b.a("appNamespace").b(om.a.b().c(4).a()).a();

        private C0992a() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(th.a aVar, lm.d dVar) {
            dVar.add(f46451b, aVar.d());
            dVar.add(f46452c, aVar.c());
            dVar.add(f46453d, aVar.b());
            dVar.add(f46454e, aVar.a());
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements lm.c<th.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f46455a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f46456b = lm.b.a("storageMetrics").b(om.a.b().c(1).a()).a();

        private b() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(th.b bVar, lm.d dVar) {
            dVar.add(f46456b, bVar.a());
        }
    }

    /* loaded from: classes3.dex */
    private static final class c implements lm.c<th.c> {

        /* renamed from: a  reason: collision with root package name */
        static final c f46457a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f46458b = lm.b.a("eventsDroppedCount").b(om.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f46459c = lm.b.a("reason").b(om.a.b().c(3).a()).a();

        private c() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(th.c cVar, lm.d dVar) {
            dVar.add(f46458b, cVar.a());
            dVar.add(f46459c, cVar.b());
        }
    }

    /* loaded from: classes3.dex */
    private static final class d implements lm.c<th.d> {

        /* renamed from: a  reason: collision with root package name */
        static final d f46460a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f46461b = lm.b.a("logSource").b(om.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f46462c = lm.b.a("logEventDropped").b(om.a.b().c(2).a()).a();

        private d() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(th.d dVar, lm.d dVar2) {
            dVar2.add(f46461b, dVar.b());
            dVar2.add(f46462c, dVar.a());
        }
    }

    /* loaded from: classes3.dex */
    private static final class e implements lm.c<l> {

        /* renamed from: a  reason: collision with root package name */
        static final e f46463a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f46464b = lm.b.d("clientMetrics");

        private e() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(l lVar, lm.d dVar) {
            dVar.add(f46464b, lVar.b());
        }
    }

    /* loaded from: classes3.dex */
    private static final class f implements lm.c<th.e> {

        /* renamed from: a  reason: collision with root package name */
        static final f f46465a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f46466b = lm.b.a("currentCacheSizeBytes").b(om.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f46467c = lm.b.a("maxCacheSizeBytes").b(om.a.b().c(2).a()).a();

        private f() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(th.e eVar, lm.d dVar) {
            dVar.add(f46466b, eVar.a());
            dVar.add(f46467c, eVar.b());
        }
    }

    /* loaded from: classes3.dex */
    private static final class g implements lm.c<th.f> {

        /* renamed from: a  reason: collision with root package name */
        static final g f46468a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f46469b = lm.b.a("startMs").b(om.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f46470c = lm.b.a("endMs").b(om.a.b().c(2).a()).a();

        private g() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(th.f fVar, lm.d dVar) {
            dVar.add(f46469b, fVar.b());
            dVar.add(f46470c, fVar.a());
        }
    }

    private a() {
    }

    @Override // mm.a
    public void configure(mm.b<?> bVar) {
        bVar.registerEncoder(l.class, e.f46463a);
        bVar.registerEncoder(th.a.class, C0992a.f46450a);
        bVar.registerEncoder(th.f.class, g.f46468a);
        bVar.registerEncoder(th.d.class, d.f46460a);
        bVar.registerEncoder(th.c.class, c.f46457a);
        bVar.registerEncoder(th.b.class, b.f46455a);
        bVar.registerEncoder(th.e.class, f.f46465a);
    }
}