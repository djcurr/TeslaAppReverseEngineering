package pv;

import javax.inject.Provider;
import pv.r;

/* loaded from: classes2.dex */
public final class q implements tw.e<p> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<r> f46976a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<x20.e<r.a>> f46977b;

    public q(Provider<r> provider, Provider<x20.e<r.a>> provider2) {
        this.f46976a = provider;
        this.f46977b = provider2;
    }

    public static q a(Provider<r> provider, Provider<x20.e<r.a>> provider2) {
        return new q(provider, provider2);
    }

    public static p c(r rVar, x20.e<r.a> eVar) {
        return new p(rVar, eVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public p get() {
        return c(this.f46976a.get(), this.f46977b.get());
    }
}