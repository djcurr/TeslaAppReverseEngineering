package kj;

import ak.g0;
import ji.u;
import ti.h0;

/* loaded from: classes3.dex */
public final class b implements j {

    /* renamed from: d  reason: collision with root package name */
    private static final u f34678d = new u();

    /* renamed from: a  reason: collision with root package name */
    final ji.h f34679a;

    /* renamed from: b  reason: collision with root package name */
    private final ci.i f34680b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f34681c;

    public b(ji.h hVar, ci.i iVar, g0 g0Var) {
        this.f34679a = hVar;
        this.f34680b = iVar;
        this.f34681c = g0Var;
    }

    @Override // kj.j
    public boolean a(ji.i iVar) {
        return this.f34679a.e(iVar, f34678d) == 0;
    }

    @Override // kj.j
    public void b(ji.j jVar) {
        this.f34679a.b(jVar);
    }

    @Override // kj.j
    public void c() {
        this.f34679a.a(0L, 0L);
    }

    @Override // kj.j
    public boolean d() {
        ji.h hVar = this.f34679a;
        return (hVar instanceof h0) || (hVar instanceof qi.g);
    }

    @Override // kj.j
    public boolean e() {
        ji.h hVar = this.f34679a;
        return (hVar instanceof ti.h) || (hVar instanceof ti.b) || (hVar instanceof ti.e) || (hVar instanceof pi.f);
    }

    @Override // kj.j
    public j f() {
        ji.h fVar;
        ak.a.f(!d());
        ji.h hVar = this.f34679a;
        if (hVar instanceof t) {
            fVar = new t(this.f34680b.f9196c, this.f34681c);
        } else if (hVar instanceof ti.h) {
            fVar = new ti.h();
        } else if (hVar instanceof ti.b) {
            fVar = new ti.b();
        } else if (hVar instanceof ti.e) {
            fVar = new ti.e();
        } else if (hVar instanceof pi.f) {
            fVar = new pi.f();
        } else {
            String simpleName = this.f34679a.getClass().getSimpleName();
            throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
        }
        return new b(fVar, this.f34680b, this.f34681c);
    }
}