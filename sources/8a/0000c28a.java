package yh;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class h implements sh.b<String> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f59522a;

    public h(Provider<Context> provider) {
        this.f59522a = provider;
    }

    public static h a(Provider<Context> provider) {
        return new h(provider);
    }

    public static String c(Context context) {
        return (String) sh.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public String get() {
        return c(this.f59522a.get());
    }
}