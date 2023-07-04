package bw;

import javax.inject.Provider;
import retrofit2.t;

/* loaded from: classes6.dex */
public final class g implements tw.e<fw.a> {

    /* renamed from: a  reason: collision with root package name */
    private final a f8317a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<t> f8318b;

    public g(a aVar, Provider<t> provider) {
        this.f8317a = aVar;
        this.f8318b = provider;
    }

    public static g a(a aVar, Provider<t> provider) {
        return new g(aVar, provider);
    }

    public static fw.a c(a aVar, t tVar) {
        return (fw.a) tw.h.e(aVar.e(tVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public fw.a get() {
        return c(this.f8317a, this.f8318b.get());
    }
}