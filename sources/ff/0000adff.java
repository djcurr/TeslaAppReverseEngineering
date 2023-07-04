package qh;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class j implements sh.b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f48165a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<g> f48166b;

    public j(Provider<Context> provider, Provider<g> provider2) {
        this.f48165a = provider;
        this.f48166b = provider2;
    }

    public static j a(Provider<Context> provider, Provider<g> provider2) {
        return new j(provider, provider2);
    }

    public static i c(Context context, Object obj) {
        return new i(context, (g) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public i get() {
        return c(this.f48165a.get(), this.f48166b.get());
    }
}