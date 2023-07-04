package ee;

import de.i;

/* loaded from: classes.dex */
public class c extends pf.a {

    /* renamed from: a  reason: collision with root package name */
    private final td.b f25072a;

    /* renamed from: b  reason: collision with root package name */
    private final i f25073b;

    public c(td.b bVar, i iVar) {
        this.f25072a = bVar;
        this.f25073b = iVar;
    }

    @Override // pf.a, pf.e
    public void a(com.facebook.imagepipeline.request.a aVar, Object obj, String str, boolean z11) {
        this.f25073b.s(this.f25072a.now());
        this.f25073b.q(aVar);
        this.f25073b.d(obj);
        this.f25073b.x(str);
        this.f25073b.w(z11);
    }

    @Override // pf.a, pf.e
    public void c(com.facebook.imagepipeline.request.a aVar, String str, boolean z11) {
        this.f25073b.r(this.f25072a.now());
        this.f25073b.q(aVar);
        this.f25073b.x(str);
        this.f25073b.w(z11);
    }

    @Override // pf.a, pf.e
    public void i(com.facebook.imagepipeline.request.a aVar, String str, Throwable th2, boolean z11) {
        this.f25073b.r(this.f25072a.now());
        this.f25073b.q(aVar);
        this.f25073b.x(str);
        this.f25073b.w(z11);
    }

    @Override // pf.a, pf.e
    public void k(String str) {
        this.f25073b.r(this.f25072a.now());
        this.f25073b.x(str);
    }
}