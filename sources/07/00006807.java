package en;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.d f25205a;

    /* renamed from: b  reason: collision with root package name */
    private final tm.e f25206b;

    /* renamed from: c  reason: collision with root package name */
    private final sm.b<com.google.firebase.remoteconfig.c> f25207c;

    /* renamed from: d  reason: collision with root package name */
    private final sm.b<nh.g> f25208d;

    public a(com.google.firebase.d dVar, tm.e eVar, sm.b<com.google.firebase.remoteconfig.c> bVar, sm.b<nh.g> bVar2) {
        this.f25205a = dVar;
        this.f25206b = eVar;
        this.f25207c = bVar;
        this.f25208d = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.d b() {
        return this.f25205a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public tm.e c() {
        return this.f25206b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public sm.b<com.google.firebase.remoteconfig.c> d() {
        return this.f25207c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionManager f() {
        return SessionManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public sm.b<nh.g> g() {
        return this.f25208d;
    }
}