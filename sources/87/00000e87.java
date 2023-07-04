package bw;

import javax.inject.Provider;
import retrofit2.t;

/* loaded from: classes6.dex */
public final class d implements tw.e<vv.a> {

    /* renamed from: a  reason: collision with root package name */
    private final a f8311a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<t> f8312b;

    public d(a aVar, Provider<t> provider) {
        this.f8311a = aVar;
        this.f8312b = provider;
    }

    public static d a(a aVar, Provider<t> provider) {
        return new d(aVar, provider);
    }

    public static vv.a b(a aVar, t tVar) {
        return (vv.a) tw.h.e(aVar.b(tVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public vv.a get() {
        return b(this.f8311a, this.f8312b.get());
    }
}