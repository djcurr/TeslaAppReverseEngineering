package wh;

import android.content.Context;
import javax.inject.Provider;
import xh.v;

/* loaded from: classes3.dex */
public final class i implements sh.b<v> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f55897a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<yh.d> f55898b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> f55899c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<ai.a> f55900d;

    public i(Provider<Context> provider, Provider<yh.d> provider2, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> provider3, Provider<ai.a> provider4) {
        this.f55897a = provider;
        this.f55898b = provider2;
        this.f55899c = provider3;
        this.f55900d = provider4;
    }

    public static i a(Provider<Context> provider, Provider<yh.d> provider2, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> provider3, Provider<ai.a> provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static v c(Context context, yh.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar, ai.a aVar) {
        return (v) sh.d.c(h.a(context, dVar, cVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public v get() {
        return c(this.f55897a.get(), this.f55898b.get(), this.f55899c.get(), this.f55900d.get());
    }
}