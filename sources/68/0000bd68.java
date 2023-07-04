package wv;

import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class k implements tw.e<j> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<pv.n> f56352a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<pv.l> f56353b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<pv.p> f56354c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<pv.v> f56355d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<pv.i> f56356e;

    public k(Provider<pv.n> provider, Provider<pv.l> provider2, Provider<pv.p> provider3, Provider<pv.v> provider4, Provider<pv.i> provider5) {
        this.f56352a = provider;
        this.f56353b = provider2;
        this.f56354c = provider3;
        this.f56355d = provider4;
        this.f56356e = provider5;
    }

    public static k a(Provider<pv.n> provider, Provider<pv.l> provider2, Provider<pv.p> provider3, Provider<pv.v> provider4, Provider<pv.i> provider5) {
        return new k(provider, provider2, provider3, provider4, provider5);
    }

    public static j c(pv.n nVar, pv.l lVar, pv.p pVar, pv.v vVar, pv.i iVar) {
        return new j(nVar, lVar, pVar, vVar, iVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public j get() {
        return c(this.f56352a.get(), this.f56353b.get(), this.f56354c.get(), this.f56355d.get(), this.f56356e.get());
    }
}