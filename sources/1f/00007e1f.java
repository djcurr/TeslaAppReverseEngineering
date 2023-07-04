package kn;

import com.google.firebase.perf.v1.PerfMetric;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final fn.a f34823d = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final String f34824a;

    /* renamed from: b  reason: collision with root package name */
    private final sm.b<nh.g> f34825b;

    /* renamed from: c  reason: collision with root package name */
    private nh.f<PerfMetric> f34826c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(sm.b<nh.g> bVar, String str) {
        this.f34824a = str;
        this.f34825b = bVar;
    }

    private boolean a() {
        if (this.f34826c == null) {
            nh.g gVar = this.f34825b.get();
            if (gVar != null) {
                this.f34826c = gVar.a(this.f34824a, PerfMetric.class, nh.b.b("proto"), new nh.e() { // from class: kn.a
                    @Override // nh.e
                    public final Object apply(Object obj) {
                        return ((PerfMetric) obj).toByteArray();
                    }
                });
            } else {
                f34823d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f34826c != null;
    }

    public void b(PerfMetric perfMetric) {
        if (!a()) {
            f34823d.j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f34826c.a(nh.c.d(perfMetric));
        }
    }
}