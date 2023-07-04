package bw;

import javax.inject.Provider;
import retrofit2.t;

/* loaded from: classes6.dex */
public final class c implements tw.e<sv.c> {

    /* renamed from: a  reason: collision with root package name */
    private final a f8309a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<t> f8310b;

    public c(a aVar, Provider<t> provider) {
        this.f8309a = aVar;
        this.f8310b = provider;
    }

    public static c a(a aVar, Provider<t> provider) {
        return new c(aVar, provider);
    }

    public static sv.c b(a aVar, t tVar) {
        return (sv.c) tw.h.e(aVar.a(tVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public sv.c get() {
        return b(this.f8309a, this.f8310b.get());
    }
}