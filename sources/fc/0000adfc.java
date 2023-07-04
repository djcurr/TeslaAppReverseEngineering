package qh;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class h implements sh.b<g> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f48157a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<ai.a> f48158b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<ai.a> f48159c;

    public h(Provider<Context> provider, Provider<ai.a> provider2, Provider<ai.a> provider3) {
        this.f48157a = provider;
        this.f48158b = provider2;
        this.f48159c = provider3;
    }

    public static h a(Provider<Context> provider, Provider<ai.a> provider2, Provider<ai.a> provider3) {
        return new h(provider, provider2, provider3);
    }

    public static g c(Context context, ai.a aVar, ai.a aVar2) {
        return new g(context, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public g get() {
        return c(this.f48157a.get(), this.f48158b.get(), this.f48159c.get());
    }
}