package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class l implements a {

    /* renamed from: a  reason: collision with root package name */
    private CookieJar f12067a = null;

    @Override // com.facebook.react.modules.network.a
    public void a() {
        this.f12067a = null;
    }

    @Override // com.facebook.react.modules.network.a
    public void b(CookieJar cookieJar) {
        this.f12067a = cookieJar;
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        CookieJar cookieJar = this.f12067a;
        if (cookieJar != null) {
            List<Cookie> loadForRequest = cookieJar.loadForRequest(httpUrl);
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : loadForRequest) {
                try {
                    new Headers.Builder().add(cookie.name(), cookie.value());
                    arrayList.add(cookie);
                } catch (IllegalArgumentException unused) {
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        CookieJar cookieJar = this.f12067a;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(httpUrl, list);
        }
    }
}