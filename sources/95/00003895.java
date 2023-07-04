package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;
import ul.h;
import ul.i;
import ul.q;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements i {
    public static /* synthetic */ sl.a lambda$getComponents$0(ul.e eVar) {
        return sl.b.h((com.google.firebase.d) eVar.a(com.google.firebase.d.class), (Context) eVar.a(Context.class), (pm.d) eVar.a(pm.d.class));
    }

    @Override // ul.i
    @Keep
    @KeepForSdk
    public List<ul.d<?>> getComponents() {
        return Arrays.asList(ul.d.c(sl.a.class).b(q.j(com.google.firebase.d.class)).b(q.j(Context.class)).b(q.j(pm.d.class)).f(new h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(eVar);
            }
        }).e().d(), ln.h.b("fire-analytics", "20.1.1"));
    }
}