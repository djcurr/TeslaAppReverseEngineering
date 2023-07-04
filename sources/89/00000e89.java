package bw;

import javax.inject.Provider;
import retrofit2.t;

/* loaded from: classes6.dex */
public final class f implements tw.e<n> {

    /* renamed from: a  reason: collision with root package name */
    private final a f8315a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<t> f8316b;

    public f(a aVar, Provider<t> provider) {
        this.f8315a = aVar;
        this.f8316b = provider;
    }

    public static f a(a aVar, Provider<t> provider) {
        return new f(aVar, provider);
    }

    public static n c(a aVar, t tVar) {
        return (n) tw.h.e(aVar.d(tVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public n get() {
        return c(this.f8315a, this.f8316b.get());
    }
}