package net.time4j.format.expert;

/* loaded from: classes5.dex */
final class p implements net.time4j.engine.d {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.d f41205a;

    /* renamed from: b  reason: collision with root package name */
    private final net.time4j.engine.d f41206b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(net.time4j.engine.d dVar, net.time4j.engine.d dVar2) {
        this.f41205a = dVar;
        this.f41206b = dVar2;
    }

    @Override // net.time4j.engine.d
    public <A> A a(net.time4j.engine.c<A> cVar) {
        if (this.f41205a.c(cVar)) {
            return (A) this.f41205a.a(cVar);
        }
        return (A) this.f41206b.a(cVar);
    }

    @Override // net.time4j.engine.d
    public <A> A b(net.time4j.engine.c<A> cVar, A a11) {
        if (this.f41205a.c(cVar)) {
            return (A) this.f41205a.a(cVar);
        }
        return (A) this.f41206b.b(cVar, a11);
    }

    @Override // net.time4j.engine.d
    public boolean c(net.time4j.engine.c<?> cVar) {
        return this.f41205a.c(cVar) || this.f41206b.c(cVar);
    }
}