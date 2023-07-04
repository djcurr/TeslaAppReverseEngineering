package bw;

import javax.inject.Provider;
import retrofit2.t;

/* loaded from: classes6.dex */
public final class e implements tw.e<yv.b> {

    /* renamed from: a  reason: collision with root package name */
    private final a f8313a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<t> f8314b;

    public e(a aVar, Provider<t> provider) {
        this.f8313a = aVar;
        this.f8314b = provider;
    }

    public static e a(a aVar, Provider<t> provider) {
        return new e(aVar, provider);
    }

    public static yv.b c(a aVar, t tVar) {
        return (yv.b) tw.h.e(aVar.c(tVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public yv.b get() {
        return c(this.f8313a, this.f8314b.get());
    }
}