package ph;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class v implements sh.b<t> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ai.a> f46533a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<ai.a> f46534b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<wh.e> f46535c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<xh.p> f46536d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<xh.t> f46537e;

    public v(Provider<ai.a> provider, Provider<ai.a> provider2, Provider<wh.e> provider3, Provider<xh.p> provider4, Provider<xh.t> provider5) {
        this.f46533a = provider;
        this.f46534b = provider2;
        this.f46535c = provider3;
        this.f46536d = provider4;
        this.f46537e = provider5;
    }

    public static v a(Provider<ai.a> provider, Provider<ai.a> provider2, Provider<wh.e> provider3, Provider<xh.p> provider4, Provider<xh.t> provider5) {
        return new v(provider, provider2, provider3, provider4, provider5);
    }

    public static t c(ai.a aVar, ai.a aVar2, wh.e eVar, xh.p pVar, xh.t tVar) {
        return new t(aVar, aVar2, eVar, pVar, tVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public t get() {
        return c(this.f46533a.get(), this.f46534b.get(), this.f46535c.get(), this.f46536d.get(), this.f46537e.get());
    }
}