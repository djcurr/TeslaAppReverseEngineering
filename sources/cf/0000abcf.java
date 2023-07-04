package pv;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class y implements tw.e<x> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a0> f46997a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<x20.e<z>> f46998b;

    public y(Provider<a0> provider, Provider<x20.e<z>> provider2) {
        this.f46997a = provider;
        this.f46998b = provider2;
    }

    public static y a(Provider<a0> provider, Provider<x20.e<z>> provider2) {
        return new y(provider, provider2);
    }

    public static x c(a0 a0Var, x20.e<z> eVar) {
        return new x(a0Var, eVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public x get() {
        return c(this.f46997a.get(), this.f46998b.get());
    }
}