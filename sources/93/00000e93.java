package bw;

import javax.inject.Provider;
import retrofit2.t;

/* loaded from: classes6.dex */
public final class l implements tw.e<iw.b> {

    /* renamed from: a  reason: collision with root package name */
    private final a f8323a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<t> f8324b;

    public l(a aVar, Provider<t> provider) {
        this.f8323a = aVar;
        this.f8324b = provider;
    }

    public static l a(a aVar, Provider<t> provider) {
        return new l(aVar, provider);
    }

    public static iw.b c(a aVar, t tVar) {
        return (iw.b) tw.h.e(aVar.j(tVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public iw.b get() {
        return c(this.f8323a, this.f8324b.get());
    }
}