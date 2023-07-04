package oh;

import ezvcard.property.Kind;

/* loaded from: classes3.dex */
public final class b implements mm.a {

    /* renamed from: a  reason: collision with root package name */
    public static final mm.a f42365a = new b();

    /* loaded from: classes3.dex */
    private static final class a implements lm.c<oh.a> {

        /* renamed from: a  reason: collision with root package name */
        static final a f42366a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f42367b = lm.b.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f42368c = lm.b.d("model");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f42369d = lm.b.d("hardware");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f42370e = lm.b.d(Kind.DEVICE);

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f42371f = lm.b.d("product");

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f42372g = lm.b.d("osBuild");

        /* renamed from: h  reason: collision with root package name */
        private static final lm.b f42373h = lm.b.d("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        private static final lm.b f42374i = lm.b.d("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        private static final lm.b f42375j = lm.b.d("locale");

        /* renamed from: k  reason: collision with root package name */
        private static final lm.b f42376k = lm.b.d("country");

        /* renamed from: l  reason: collision with root package name */
        private static final lm.b f42377l = lm.b.d("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        private static final lm.b f42378m = lm.b.d("applicationBuild");

        private a() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(oh.a aVar, lm.d dVar) {
            dVar.add(f42367b, aVar.m());
            dVar.add(f42368c, aVar.j());
            dVar.add(f42369d, aVar.f());
            dVar.add(f42370e, aVar.d());
            dVar.add(f42371f, aVar.l());
            dVar.add(f42372g, aVar.k());
            dVar.add(f42373h, aVar.h());
            dVar.add(f42374i, aVar.e());
            dVar.add(f42375j, aVar.g());
            dVar.add(f42376k, aVar.c());
            dVar.add(f42377l, aVar.i());
            dVar.add(f42378m, aVar.b());
        }
    }

    /* renamed from: oh.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0844b implements lm.c<j> {

        /* renamed from: a  reason: collision with root package name */
        static final C0844b f42379a = new C0844b();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f42380b = lm.b.d("logRequest");

        private C0844b() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(j jVar, lm.d dVar) {
            dVar.add(f42380b, jVar.c());
        }
    }

    /* loaded from: classes3.dex */
    private static final class c implements lm.c<k> {

        /* renamed from: a  reason: collision with root package name */
        static final c f42381a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f42382b = lm.b.d("clientType");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f42383c = lm.b.d("androidClientInfo");

        private c() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(k kVar, lm.d dVar) {
            dVar.add(f42382b, kVar.c());
            dVar.add(f42383c, kVar.b());
        }
    }

    /* loaded from: classes3.dex */
    private static final class d implements lm.c<l> {

        /* renamed from: a  reason: collision with root package name */
        static final d f42384a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f42385b = lm.b.d("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f42386c = lm.b.d("eventCode");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f42387d = lm.b.d("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f42388e = lm.b.d("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f42389f = lm.b.d("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f42390g = lm.b.d("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        private static final lm.b f42391h = lm.b.d("networkConnectionInfo");

        private d() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(l lVar, lm.d dVar) {
            dVar.add(f42385b, lVar.c());
            dVar.add(f42386c, lVar.b());
            dVar.add(f42387d, lVar.d());
            dVar.add(f42388e, lVar.f());
            dVar.add(f42389f, lVar.g());
            dVar.add(f42390g, lVar.h());
            dVar.add(f42391h, lVar.e());
        }
    }

    /* loaded from: classes3.dex */
    private static final class e implements lm.c<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f42392a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f42393b = lm.b.d("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f42394c = lm.b.d("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f42395d = lm.b.d("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f42396e = lm.b.d("logSource");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f42397f = lm.b.d("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f42398g = lm.b.d("logEvent");

        /* renamed from: h  reason: collision with root package name */
        private static final lm.b f42399h = lm.b.d("qosTier");

        private e() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(m mVar, lm.d dVar) {
            dVar.add(f42393b, mVar.g());
            dVar.add(f42394c, mVar.h());
            dVar.add(f42395d, mVar.b());
            dVar.add(f42396e, mVar.d());
            dVar.add(f42397f, mVar.e());
            dVar.add(f42398g, mVar.c());
            dVar.add(f42399h, mVar.f());
        }
    }

    /* loaded from: classes3.dex */
    private static final class f implements lm.c<o> {

        /* renamed from: a  reason: collision with root package name */
        static final f f42400a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f42401b = lm.b.d("networkType");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f42402c = lm.b.d("mobileSubtype");

        private f() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(o oVar, lm.d dVar) {
            dVar.add(f42401b, oVar.c());
            dVar.add(f42402c, oVar.b());
        }
    }

    private b() {
    }

    @Override // mm.a
    public void configure(mm.b<?> bVar) {
        C0844b c0844b = C0844b.f42379a;
        bVar.registerEncoder(j.class, c0844b);
        bVar.registerEncoder(oh.d.class, c0844b);
        e eVar = e.f42392a;
        bVar.registerEncoder(m.class, eVar);
        bVar.registerEncoder(g.class, eVar);
        c cVar = c.f42381a;
        bVar.registerEncoder(k.class, cVar);
        bVar.registerEncoder(oh.e.class, cVar);
        a aVar = a.f42366a;
        bVar.registerEncoder(oh.a.class, aVar);
        bVar.registerEncoder(oh.c.class, aVar);
        d dVar = d.f42384a;
        bVar.registerEncoder(l.class, dVar);
        bVar.registerEncoder(oh.f.class, dVar);
        f fVar = f.f42400a;
        bVar.registerEncoder(o.class, fVar);
        bVar.registerEncoder(i.class, fVar);
    }
}