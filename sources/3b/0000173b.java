package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.k0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class x extends com.facebook.imagepipeline.producers.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private int f11583a;

    /* renamed from: b  reason: collision with root package name */
    private String f11584b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f11585c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f11586d;

    /* renamed from: e  reason: collision with root package name */
    private final td.b f11587e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.a f11589b;

        a(c cVar, k0.a aVar) {
            this.f11588a = cVar;
            this.f11589b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.j(this.f11588a, this.f11589b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Future f11591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.a f11592b;

        b(x xVar, Future future, k0.a aVar) {
            this.f11591a = future;
            this.f11592b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            if (this.f11591a.cancel(false)) {
                this.f11592b.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends w {

        /* renamed from: f  reason: collision with root package name */
        private long f11593f;

        /* renamed from: g  reason: collision with root package name */
        private long f11594g;

        /* renamed from: h  reason: collision with root package name */
        private long f11595h;

        public c(l<nf.e> lVar, p0 p0Var) {
            super(lVar, p0Var);
        }
    }

    public x(int i11) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f11583a = i11;
    }

    private HttpURLConnection g(Uri uri, int i11) {
        HttpURLConnection o11 = o(uri);
        String str = this.f11584b;
        if (str != null) {
            o11.setRequestProperty(NetworkConstantsKt.HEADER_USER_AGENT, str);
        }
        Map<String, String> map = this.f11585c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                o11.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        o11.setConnectTimeout(this.f11583a);
        int responseCode = o11.getResponseCode();
        if (m(responseCode)) {
            return o11;
        }
        if (l(responseCode)) {
            String headerField = o11.getHeaderField("Location");
            o11.disconnect();
            Uri parse = headerField == null ? null : Uri.parse(headerField);
            String scheme = uri.getScheme();
            if (i11 > 0 && parse != null && !md.j.a(parse.getScheme(), scheme)) {
                return g(parse, i11 - 1);
            }
            throw new IOException(i11 == 0 ? h("URL %s follows too many redirects", uri.toString()) : h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        o11.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i11) {
        if (i11 == 307 || i11 == 308) {
            return true;
        }
        switch (i11) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i11) {
        return i11 >= 200 && i11 < 300;
    }

    static HttpURLConnection o(Uri uri) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(ud.d.n(uri).openConnection()));
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: f */
    public c e(l<nf.e> lVar, p0 p0Var) {
        return new c(lVar, p0Var);
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: i */
    public void a(c cVar, k0.a aVar) {
        cVar.f11593f = this.f11587e.now();
        cVar.b().c(new b(this, this.f11586d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void j(com.facebook.imagepipeline.producers.x.c r5, com.facebook.imagepipeline.producers.k0.a r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.g()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r2 = 5
            java.net.HttpURLConnection r1 = r4.g(r1, r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            td.b r2 = r4.f11587e     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            long r2 = r2.now()     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            com.facebook.imagepipeline.producers.x.c.n(r5, r2)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            if (r1 == 0) goto L1d
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            r5 = -1
            r6.b(r0, r5)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
        L1d:
            if (r0 == 0) goto L22
            r0.close()     // Catch: java.io.IOException -> L22
        L22:
            if (r1 == 0) goto L39
            goto L36
        L25:
            r5 = move-exception
            goto L2c
        L27:
            r5 = move-exception
            r1 = r0
            goto L3b
        L2a:
            r5 = move-exception
            r1 = r0
        L2c:
            r6.onFailure(r5)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L34
            r0.close()     // Catch: java.io.IOException -> L34
        L34:
            if (r1 == 0) goto L39
        L36:
            r1.disconnect()
        L39:
            return
        L3a:
            r5 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()     // Catch: java.io.IOException -> L40
        L40:
            if (r1 == 0) goto L45
            r1.disconnect()
        L45:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.x.j(com.facebook.imagepipeline.producers.x$c, com.facebook.imagepipeline.producers.k0$a):void");
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: k */
    public Map<String, String> d(c cVar, int i11) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f11594g - cVar.f11593f));
        hashMap.put("fetch_time", Long.toString(cVar.f11595h - cVar.f11594g));
        hashMap.put("total_time", Long.toString(cVar.f11595h - cVar.f11593f));
        hashMap.put("image_size", Integer.toString(i11));
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: n */
    public void b(c cVar, int i11) {
        cVar.f11595h = this.f11587e.now();
    }

    x(String str, Map<String, String> map, td.b bVar) {
        this.f11586d = Executors.newFixedThreadPool(3);
        this.f11587e = bVar;
        this.f11585c = map;
        this.f11584b = str;
    }
}