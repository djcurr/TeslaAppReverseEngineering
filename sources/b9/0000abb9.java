package pv;

import javax.inject.Provider;
import pv.r;

/* loaded from: classes2.dex */
public final class m implements tw.e<l> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<r> f46968a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<x20.e<r.a>> f46969b;

    public m(Provider<r> provider, Provider<x20.e<r.a>> provider2) {
        this.f46968a = provider;
        this.f46969b = provider2;
    }

    public static m a(Provider<r> provider, Provider<x20.e<r.a>> provider2) {
        return new m(provider, provider2);
    }

    public static l c(r rVar, x20.e<r.a> eVar) {
        return new l(rVar, eVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public l get() {
        return c(this.f46968a.get(), this.f46969b.get());
    }
}