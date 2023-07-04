package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.d;
import java.util.Arrays;
import java.util.List;
import ul.e;
import ul.h;
import ul.i;
import ul.q;
import wl.a;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements i {
    public static /* synthetic */ FirebaseCrashlytics a(CrashlyticsRegistrar crashlyticsRegistrar, e eVar) {
        return crashlyticsRegistrar.b(eVar);
    }

    public FirebaseCrashlytics b(e eVar) {
        return FirebaseCrashlytics.a((d) eVar.a(d.class), (tm.e) eVar.a(tm.e.class), eVar.e(a.class), eVar.e(sl.a.class));
    }

    @Override // ul.i
    public List<ul.d<?>> getComponents() {
        return Arrays.asList(ul.d.c(FirebaseCrashlytics.class).b(q.j(d.class)).b(q.j(tm.e.class)).b(q.a(a.class)).b(q.a(sl.a.class)).f(new h() { // from class: vl.f
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return CrashlyticsRegistrar.a(CrashlyticsRegistrar.this, eVar);
            }
        }).e().d(), ln.h.b("fire-cls", "18.2.9"));
    }
}