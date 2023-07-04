package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.UUID;

@KeepForSdk
/* loaded from: classes2.dex */
public class n {
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    public static final ul.d<?> f17267b = ul.d.c(n.class).b(ul.q.j(i.class)).b(ul.q.j(Context.class)).f(new ul.h() { // from class: com.google.mlkit.common.sdkinternal.f0
        @Override // ul.h
        public final Object a(ul.e eVar) {
            return new n((Context) eVar.a(Context.class));
        }
    }).d();

    /* renamed from: a  reason: collision with root package name */
    private final Context f17268a;

    public n(Context context) {
        this.f17268a = context;
    }

    private final SharedPreferences e() {
        return this.f17268a.getSharedPreferences("com.google.mlkit.internal", 0);
    }

    @KeepForSdk
    public synchronized String a() {
        String string = e().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        e().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    @KeepForSdk
    public synchronized long b(eo.b bVar) {
        return e().getLong(String.format("downloading_begin_time_%s", bVar.d()), 0L);
    }

    @KeepForSdk
    public synchronized long c(eo.b bVar) {
        return e().getLong(String.format("model_first_use_time_%s", bVar.d()), 0L);
    }

    @KeepForSdk
    public synchronized void d(eo.b bVar, long j11) {
        e().edit().putLong(String.format("model_first_use_time_%s", bVar.d()), j11).apply();
    }
}