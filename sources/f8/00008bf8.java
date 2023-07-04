package net.time4j;

/* loaded from: classes5.dex */
final class j extends p<g0> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f41458c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(net.time4j.engine.p<?> pVar, int i11) {
        this(pVar, i11, null);
    }

    private static <V> Object c(net.time4j.engine.p<V> pVar, Object obj) {
        return t0.a(net.time4j.engine.e0.o(pVar.getType().cast(obj), pVar), obj);
    }

    private static <V> Object d(net.time4j.engine.p<V> pVar, Object obj) {
        return t0.a(net.time4j.engine.e0.n(pVar.getType().cast(obj), pVar), obj);
    }

    @Override // net.time4j.engine.u
    /* renamed from: b */
    public g0 apply(g0 g0Var) {
        return (g0) ((net.time4j.engine.u) this.f41458c).apply(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(net.time4j.engine.p<?> pVar, int i11, Object obj) {
        super(pVar, i11);
        switch (i11) {
            case -1:
                this.f41458c = d(pVar, obj);
                return;
            case 0:
                this.f41458c = net.time4j.engine.e0.l(pVar);
                return;
            case 1:
                this.f41458c = net.time4j.engine.e0.j(pVar);
                return;
            case 2:
                this.f41458c = net.time4j.engine.e0.f(pVar);
                return;
            case 3:
                this.f41458c = net.time4j.engine.e0.h(pVar);
                return;
            case 4:
                this.f41458c = net.time4j.engine.e0.d(pVar);
                return;
            case 5:
                this.f41458c = net.time4j.engine.e0.c(pVar);
                return;
            case 6:
                this.f41458c = c(pVar, obj);
                return;
            default:
                throw new AssertionError("Unknown: " + a());
        }
    }
}