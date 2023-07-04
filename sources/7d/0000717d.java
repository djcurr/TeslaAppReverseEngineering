package gw;

import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class r implements tw.e<p> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<pv.i> f28466a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<pv.x> f28467b;

    public r(Provider<pv.i> provider, Provider<pv.x> provider2) {
        this.f28466a = provider;
        this.f28467b = provider2;
    }

    public static r a(Provider<pv.i> provider, Provider<pv.x> provider2) {
        return new r(provider, provider2);
    }

    public static p c(pv.i iVar, pv.x xVar) {
        return new p(iVar, xVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public p get() {
        return c(this.f28466a.get(), this.f28467b.get());
    }
}