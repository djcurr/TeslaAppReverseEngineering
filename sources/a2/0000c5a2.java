package zv;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class g implements tw.e<f> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f60891a;

    public g(Provider<Context> provider) {
        this.f60891a = provider;
    }

    public static g a(Provider<Context> provider) {
        return new g(provider);
    }

    public static f c(Context context) {
        return new f(context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public f get() {
        return c(this.f60891a.get());
    }
}