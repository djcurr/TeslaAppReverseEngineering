package com.google.android.exoplayer2.drm;

import ak.k0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.b;
import com.google.common.collect.t;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final HttpDataSource.b f13373a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13374b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13375c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f13376d;

    public l(String str, HttpDataSource.b bVar) {
        this(str, false, bVar);
    }

    private static byte[] c(HttpDataSource.b bVar, String str, byte[] bArr, Map<String, String> map) {
        zj.m mVar = new zj.m(bVar.a());
        com.google.android.exoplayer2.upstream.b a11 = new b.C0259b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i11 = 0;
        com.google.android.exoplayer2.upstream.b bVar2 = a11;
        while (true) {
            try {
                zj.h hVar = new zj.h(mVar, bVar2);
                try {
                    byte[] P0 = k0.P0(hVar);
                    k0.o(hVar);
                    return P0;
                } catch (HttpDataSource.InvalidResponseCodeException e11) {
                    String d11 = d(e11, i11);
                    if (d11 != null) {
                        i11++;
                        bVar2 = bVar2.a().j(d11).a();
                        k0.o(hVar);
                    } else {
                        throw e11;
                    }
                }
            } catch (Exception e12) {
                throw new MediaDrmCallbackException(a11, (Uri) ak.a.e(mVar.p()), mVar.c(), mVar.o(), e12);
            }
        }
    }

    private static String d(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i11) {
        Map<String, List<String>> map;
        List<String> list;
        int i12 = invalidResponseCodeException.f14591a;
        if (!((i12 == 307 || i12 == 308) && i11 < 5) || (map = invalidResponseCodeException.f14592b) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.m
    public byte[] a(UUID uuid, j.e eVar) {
        String b11 = eVar.b();
        String E = k0.E(eVar.a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(b11).length() + 15 + String.valueOf(E).length());
        sb2.append(b11);
        sb2.append("&signedRequest=");
        sb2.append(E);
        return c(this.f13373a, sb2.toString(), null, Collections.emptyMap());
    }

    @Override // com.google.android.exoplayer2.drm.m
    public byte[] b(UUID uuid, j.b bVar) {
        String str;
        String b11 = bVar.b();
        if (this.f13375c || TextUtils.isEmpty(b11)) {
            b11 = this.f13374b;
        }
        if (!TextUtils.isEmpty(b11)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = ci.b.f9157e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = ci.b.f9155c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put(NetworkConstantsKt.HEADER_CONTENT_TYPE, str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f13376d) {
                hashMap.putAll(this.f13376d);
            }
            return c(this.f13373a, b11, bVar.a(), hashMap);
        }
        throw new MediaDrmCallbackException(new b.C0259b().i(Uri.EMPTY).a(), Uri.EMPTY, t.l(), 0L, new IllegalStateException("No license URL"));
    }

    public void e(String str, String str2) {
        ak.a.e(str);
        ak.a.e(str2);
        synchronized (this.f13376d) {
            this.f13376d.put(str, str2);
        }
    }

    public l(String str, boolean z11, HttpDataSource.b bVar) {
        ak.a.a((z11 && TextUtils.isEmpty(str)) ? false : true);
        this.f13373a = bVar;
        this.f13374b = str;
        this.f13375c = z11;
        this.f13376d = new HashMap();
    }
}