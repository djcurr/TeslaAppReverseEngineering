package com.brentvatne.exoplayer;

import ak.k0;
import com.facebook.react.bridge.ReactContext;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.a;
import java.util.Map;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import zj.j;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static a.InterfaceC0258a f10369a;

    /* renamed from: b  reason: collision with root package name */
    private static HttpDataSource.b f10370b;

    /* renamed from: c  reason: collision with root package name */
    private static String f10371c;

    private static a.InterfaceC0258a a(ReactContext reactContext, j jVar, Map<String, String> map) {
        return new com.google.android.exoplayer2.upstream.d(reactContext, jVar, b(reactContext, jVar, map));
    }

    private static HttpDataSource.b b(ReactContext reactContext, j jVar, Map<String, String> map) {
        OkHttpClient f11 = com.facebook.react.modules.network.g.f();
        ((com.facebook.react.modules.network.a) f11.cookieJar()).b(new JavaNetCookieJar(new com.facebook.react.modules.network.c(reactContext)));
        ii.b bVar = new ii.b(f11, e(reactContext), jVar);
        if (map != null) {
            bVar.c().b(map);
        }
        return bVar;
    }

    public static a.InterfaceC0258a c(ReactContext reactContext, j jVar, Map<String, String> map) {
        if (f10369a == null || (map != null && !map.isEmpty())) {
            f10369a = a(reactContext, jVar, map);
        }
        return f10369a;
    }

    public static HttpDataSource.b d(ReactContext reactContext, j jVar, Map<String, String> map) {
        if (f10370b == null || (map != null && !map.isEmpty())) {
            f10370b = b(reactContext, jVar, map);
        }
        return f10370b;
    }

    public static String e(ReactContext reactContext) {
        if (f10371c == null) {
            f10371c = k0.k0(reactContext, "ReactNativeVideo");
        }
        return f10371c;
    }
}