package cn;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kn.k;
import nh.g;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: h  reason: collision with root package name */
    private static final fn.a f9286h = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f9287a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f9288b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.perf.util.d f9289c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f9290d;

    /* renamed from: e  reason: collision with root package name */
    private final sm.b<com.google.firebase.remoteconfig.c> f9291e;

    /* renamed from: f  reason: collision with root package name */
    private final tm.e f9292f;

    /* renamed from: g  reason: collision with root package name */
    private final sm.b<g> f9293g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.google.firebase.d dVar, sm.b<com.google.firebase.remoteconfig.c> bVar, tm.e eVar, sm.b<g> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f9290d = null;
        this.f9291e = bVar;
        this.f9292f = eVar;
        this.f9293g = bVar2;
        if (dVar == null) {
            this.f9290d = Boolean.FALSE;
            this.f9288b = aVar;
            this.f9289c = new com.google.firebase.perf.util.d(new Bundle());
            return;
        }
        k.k().r(dVar, eVar, bVar2);
        Context j11 = dVar.j();
        com.google.firebase.perf.util.d a11 = a(j11);
        this.f9289c = a11;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f9288b = aVar;
        aVar.P(a11);
        aVar.M(j11);
        sessionManager.setApplicationContext(j11);
        this.f9290d = aVar.h();
        fn.a aVar2 = f9286h;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", fn.b.b(dVar.m().e(), j11.getPackageName())));
        }
    }

    private static com.google.firebase.perf.util.d a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e11) {
            Log.d("isEnabled", "No perf enable meta data found " + e11.getMessage());
            bundle = null;
        }
        return bundle != null ? new com.google.firebase.perf.util.d(bundle) : new com.google.firebase.perf.util.d();
    }

    public static c c() {
        return (c) com.google.firebase.d.k().i(c.class);
    }

    public Map<String, String> b() {
        return new HashMap(this.f9287a);
    }

    public boolean d() {
        Boolean bool = this.f9290d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return com.google.firebase.d.k().s();
    }

    public synchronized void e(Boolean bool) {
        try {
            com.google.firebase.d.k();
            if (this.f9288b.g().booleanValue()) {
                f9286h.f("Firebase Performance is permanently disabled");
                return;
            }
            this.f9288b.O(bool);
            if (bool != null) {
                this.f9290d = bool;
            } else {
                this.f9290d = this.f9288b.h();
            }
            if (Boolean.TRUE.equals(this.f9290d)) {
                f9286h.f("Firebase Performance is Enabled");
            } else if (Boolean.FALSE.equals(this.f9290d)) {
                f9286h.f("Firebase Performance is Disabled");
            }
        } catch (IllegalStateException unused) {
        }
    }

    public void f(boolean z11) {
        e(Boolean.valueOf(z11));
    }
}