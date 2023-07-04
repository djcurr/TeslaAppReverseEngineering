package net.time4j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class r0 extends p<h0> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f41501c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(net.time4j.engine.p<?> pVar, int i11) {
        this(pVar, i11, null);
    }

    private static <V, T extends net.time4j.engine.q<T>> net.time4j.engine.u<T> c(net.time4j.engine.p<V> pVar, boolean z11) {
        String name = pVar.name();
        if (!name.equals("MILLI_OF_SECOND") && !name.equals("MILLI_OF_DAY")) {
            if (!name.equals("MICRO_OF_SECOND") && !name.equals("MICRO_OF_DAY")) {
                if (name.equals("NANO_OF_SECOND") || name.equals("NANO_OF_DAY")) {
                    return new r('9', z11);
                }
                if (z11) {
                    return net.time4j.engine.e0.c(pVar);
                }
                return net.time4j.engine.e0.d(pVar);
            }
            return new r('6', z11);
        }
        return new r('3', z11);
    }

    private static <V> Object d(net.time4j.engine.p<V> pVar, Object obj) {
        return t0.a(net.time4j.engine.e0.o(pVar.getType().cast(obj), pVar), obj);
    }

    private static <V> Object e(net.time4j.engine.p<V> pVar, Object obj) {
        return t0.a(net.time4j.engine.e0.n(pVar.getType().cast(obj), pVar), obj);
    }

    @Override // net.time4j.engine.u
    /* renamed from: b */
    public h0 apply(h0 h0Var) {
        return (h0) ((net.time4j.engine.u) this.f41501c).apply(h0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(net.time4j.engine.p<?> pVar, int i11, Object obj) {
        super(pVar, i11);
        switch (i11) {
            case -1:
                this.f41501c = e(pVar, obj);
                return;
            case 0:
                this.f41501c = net.time4j.engine.e0.l(pVar);
                return;
            case 1:
                this.f41501c = net.time4j.engine.e0.j(pVar);
                return;
            case 2:
                this.f41501c = net.time4j.engine.e0.f(pVar);
                return;
            case 3:
                this.f41501c = net.time4j.engine.e0.h(pVar);
                return;
            case 4:
                this.f41501c = c(pVar, false);
                return;
            case 5:
                this.f41501c = c(pVar, true);
                return;
            case 6:
                this.f41501c = d(pVar, obj);
                return;
            default:
                throw new AssertionError("Unknown: " + a());
        }
    }
}