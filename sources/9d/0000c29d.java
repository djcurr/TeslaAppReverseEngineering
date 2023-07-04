package yh;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class n0 implements sh.b<m0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ai.a> f59549a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<ai.a> f59550b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<e> f59551c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<t0> f59552d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<String> f59553e;

    public n0(Provider<ai.a> provider, Provider<ai.a> provider2, Provider<e> provider3, Provider<t0> provider4, Provider<String> provider5) {
        this.f59549a = provider;
        this.f59550b = provider2;
        this.f59551c = provider3;
        this.f59552d = provider4;
        this.f59553e = provider5;
    }

    public static n0 a(Provider<ai.a> provider, Provider<ai.a> provider2, Provider<e> provider3, Provider<t0> provider4, Provider<String> provider5) {
        return new n0(provider, provider2, provider3, provider4, provider5);
    }

    public static m0 c(ai.a aVar, ai.a aVar2, Object obj, Object obj2, rh.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public m0 get() {
        return c(this.f59549a.get(), this.f59550b.get(), this.f59551c.get(), this.f59552d.get(), sh.a.a(this.f59553e));
    }
}