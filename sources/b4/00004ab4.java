package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class r extends y {

    /* renamed from: a  reason: collision with root package name */
    private final j f20730a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f20731b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends IOException {

        /* renamed from: a  reason: collision with root package name */
        final int f20732a;

        /* renamed from: b  reason: collision with root package name */
        final int f20733b;

        b(int i11, int i12) {
            super("HTTP " + i11);
            this.f20732a = i11;
            this.f20733b = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(j jVar, a0 a0Var) {
        this.f20730a = jVar;
        this.f20731b = a0Var;
    }

    private static Request j(w wVar, int i11) {
        CacheControl cacheControl;
        if (i11 == 0) {
            cacheControl = null;
        } else if (q.isOfflineOnly(i11)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!q.shouldReadFromDiskCache(i11)) {
                builder.noCache();
            }
            if (!q.shouldWriteToDiskCache(i11)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(wVar.f20779d.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        return url.build();
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        String scheme = wVar.f20779d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.y
    int e() {
        return 2;
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i11) {
        Response a11 = this.f20730a.a(j(wVar, i11));
        ResponseBody body = a11.body();
        if (a11.isSuccessful()) {
            t.e eVar = a11.cacheResponse() == null ? t.e.NETWORK : t.e.DISK;
            if (eVar == t.e.DISK && body.contentLength() == 0) {
                body.close();
                throw new a("Received response with 0 content-length header.");
            }
            if (eVar == t.e.NETWORK && body.contentLength() > 0) {
                this.f20731b.f(body.contentLength());
            }
            return new y.a(body.source(), eVar);
        }
        body.close();
        throw new b(a11.code(), wVar.f20778c);
    }

    @Override // com.squareup.picasso.y
    boolean h(boolean z11, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.y
    boolean i() {
        return true;
    }
}