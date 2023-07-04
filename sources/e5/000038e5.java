package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import ul.q;

/* loaded from: classes3.dex */
public class CrashlyticsNdkRegistrar implements ul.i {
    public static /* synthetic */ wl.a a(CrashlyticsNdkRegistrar crashlyticsNdkRegistrar, ul.e eVar) {
        return crashlyticsNdkRegistrar.b(eVar);
    }

    public wl.a b(ul.e eVar) {
        Context context = (Context) eVar.a(Context.class);
        return d.f(context, !wl.e.g(context));
    }

    @Override // ul.i
    public List<ul.d<?>> getComponents() {
        return Arrays.asList(ul.d.c(wl.a.class).b(q.j(Context.class)).f(new ul.h() { // from class: com.google.firebase.crashlytics.ndk.a
            {
                CrashlyticsNdkRegistrar.this = this;
            }

            @Override // ul.h
            public final Object a(ul.e eVar) {
                return CrashlyticsNdkRegistrar.a(CrashlyticsNdkRegistrar.this, eVar);
            }
        }).e().d(), ln.h.b("fire-cls-ndk", "18.2.9"));
    }
}