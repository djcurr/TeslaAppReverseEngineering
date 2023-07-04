package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import ff.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes3.dex */
class a extends b {

    /* renamed from: d  reason: collision with root package name */
    private final Executor f12021d;

    public a(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.f12021d = okHttpClient.dispatcher().executorService();
    }

    private Map<String, String> n(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    @Override // ff.b, com.facebook.imagepipeline.producers.k0
    /* renamed from: i */
    public void a(b.c cVar, k0.a aVar) {
        cVar.f26226f = SystemClock.elapsedRealtime();
        Uri g11 = cVar.g();
        Map<String, String> n11 = cVar.b().l() instanceof ig.a ? n(((ig.a) cVar.b().l()).z()) : null;
        if (n11 == null) {
            n11 = Collections.emptyMap();
        }
        j(cVar, aVar, new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(g11.toString()).headers(Headers.of(n11)).get().build());
    }
}