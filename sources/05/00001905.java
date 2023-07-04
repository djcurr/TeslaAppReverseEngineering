package com.facebook.react.modules.network;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static OkHttpClient f12054a;

    /* renamed from: b  reason: collision with root package name */
    private static f f12055b;

    public static OkHttpClient a() {
        f fVar = f12055b;
        if (fVar != null) {
            return fVar.a();
        }
        return c().build();
    }

    public static OkHttpClient b(Context context) {
        f fVar = f12055b;
        if (fVar != null) {
            return fVar.a();
        }
        return d(context).build();
    }

    public static OkHttpClient.Builder c() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.connectTimeout(0L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).cookieJar(new l());
    }

    public static OkHttpClient.Builder d(Context context) {
        return e(context, 10485760);
    }

    public static OkHttpClient.Builder e(Context context, int i11) {
        OkHttpClient.Builder c11 = c();
        return i11 == 0 ? c11 : c11.cache(new Cache(new File(context.getCacheDir(), "http-cache"), i11));
    }

    public static OkHttpClient f() {
        if (f12054a == null) {
            f12054a = a();
        }
        return f12054a;
    }
}