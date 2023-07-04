package pv;

import javax.inject.Provider;
import pv.r;

/* loaded from: classes2.dex */
public final class o implements tw.e<n> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<r> f46972a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<x20.e<r.a>> f46973b;

    public o(Provider<r> provider, Provider<x20.e<r.a>> provider2) {
        this.f46972a = provider;
        this.f46973b = provider2;
    }

    public static o a(Provider<r> provider, Provider<x20.e<r.a>> provider2) {
        return new o(provider, provider2);
    }

    public static n c(r rVar, x20.e<r.a> eVar) {
        return new n(rVar, eVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public n get() {
        return c(this.f46972a.get(), this.f46973b.get());
    }
}