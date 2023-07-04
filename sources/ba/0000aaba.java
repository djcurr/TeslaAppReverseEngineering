package ph;

/* loaded from: classes3.dex */
final class r<T> implements nh.f<T> {

    /* renamed from: a */
    private final o f46523a;

    /* renamed from: b */
    private final String f46524b;

    /* renamed from: c */
    private final nh.b f46525c;

    /* renamed from: d */
    private final nh.e<T, byte[]> f46526d;

    /* renamed from: e */
    private final s f46527e;

    public r(o oVar, String str, nh.b bVar, nh.e<T, byte[]> eVar, s sVar) {
        this.f46523a = oVar;
        this.f46524b = str;
        this.f46525c = bVar;
        this.f46526d = eVar;
        this.f46527e = sVar;
    }

    public static /* synthetic */ void c(Exception exc) {
        d(exc);
    }

    public static /* synthetic */ void d(Exception exc) {
    }

    @Override // nh.f
    public void a(nh.c<T> cVar) {
        b(cVar, new nh.h() { // from class: ph.q
            @Override // nh.h
            public final void a(Exception exc) {
                r.c(exc);
            }
        });
    }

    @Override // nh.f
    public void b(nh.c<T> cVar, nh.h hVar) {
        this.f46527e.a(n.a().e(this.f46523a).c(cVar).f(this.f46524b).d(this.f46526d).b(this.f46525c).a(), hVar);
    }
}