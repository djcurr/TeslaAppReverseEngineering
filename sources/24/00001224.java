package cn;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import javax.inject.Provider;
import nh.g;

/* loaded from: classes2.dex */
public final class e implements tw.e<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<com.google.firebase.d> f9294a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<sm.b<com.google.firebase.remoteconfig.c>> f9295b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<tm.e> f9296c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<sm.b<g>> f9297d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<RemoteConfigManager> f9298e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<com.google.firebase.perf.config.a> f9299f;

    /* renamed from: g  reason: collision with root package name */
    private final Provider<SessionManager> f9300g;

    public e(Provider<com.google.firebase.d> provider, Provider<sm.b<com.google.firebase.remoteconfig.c>> provider2, Provider<tm.e> provider3, Provider<sm.b<g>> provider4, Provider<RemoteConfigManager> provider5, Provider<com.google.firebase.perf.config.a> provider6, Provider<SessionManager> provider7) {
        this.f9294a = provider;
        this.f9295b = provider2;
        this.f9296c = provider3;
        this.f9297d = provider4;
        this.f9298e = provider5;
        this.f9299f = provider6;
        this.f9300g = provider7;
    }

    public static e a(Provider<com.google.firebase.d> provider, Provider<sm.b<com.google.firebase.remoteconfig.c>> provider2, Provider<tm.e> provider3, Provider<sm.b<g>> provider4, Provider<RemoteConfigManager> provider5, Provider<com.google.firebase.perf.config.a> provider6, Provider<SessionManager> provider7) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static c c(com.google.firebase.d dVar, sm.b<com.google.firebase.remoteconfig.c> bVar, tm.e eVar, sm.b<g> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        return new c(dVar, bVar, eVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public c get() {
        return c(this.f9294a.get(), this.f9295b.get(), this.f9296c.get(), this.f9297d.get(), this.f9298e.get(), this.f9299f.get(), this.f9300g.get());
    }
}