package wh;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class g implements sh.b<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ai.a> f55896a;

    public g(Provider<ai.a> provider) {
        this.f55896a = provider;
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.c a(ai.a aVar) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.c) sh.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(Provider<ai.a> provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.c get() {
        return a(this.f55896a.get());
    }
}