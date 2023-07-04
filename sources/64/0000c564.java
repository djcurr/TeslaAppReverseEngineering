package zu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final h f60771a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<g> f60772b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private static final com.tesla.logging.g f60773c = com.tesla.logging.g.f21878b.a("DataRestriction");

    private h() {
    }

    @Override // zu.g
    public boolean a() {
        g gVar = f60772b.get();
        kotlin.jvm.internal.s.e(gVar);
        return gVar.a();
    }

    public final void b(g dataRestriction) {
        kotlin.jvm.internal.s.g(dataRestriction, "dataRestriction");
        if (f60772b.compareAndSet(null, dataRestriction)) {
            return;
        }
        f60773c.f("unable to initialize data restriction holder", new IllegalStateException("Do not init DataRestriction interface twice"));
    }
}