package yh;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class u0 implements sh.b<t0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f59582a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<String> f59583b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<Integer> f59584c;

    public u0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f59582a = provider;
        this.f59583b = provider2;
        this.f59584c = provider3;
    }

    public static u0 a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new u0(provider, provider2, provider3);
    }

    public static t0 c(Context context, String str, int i11) {
        return new t0(context, str, i11);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public t0 get() {
        return c(this.f59582a.get(), this.f59583b.get(), this.f59584c.get().intValue());
    }
}