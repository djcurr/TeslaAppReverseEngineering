package com.android.volley.toolbox;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class j extends com.android.volley.toolbox.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f10348a;

    /* renamed from: b  reason: collision with root package name */
    private final SSLSocketFactory f10349b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final HttpURLConnection f10350a;

        a(HttpURLConnection httpURLConnection) {
            super(j.k(httpURLConnection));
            this.f10350a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            this.f10350a.disconnect();
        }
    }

    /* loaded from: classes.dex */
    public interface b extends p {
    }

    public j() {
        this(null);
    }

    private void d(HttpURLConnection httpURLConnection, com.android.volley.i<?> iVar, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey(NetworkConstantsKt.HEADER_CONTENT_TYPE)) {
            httpURLConnection.setRequestProperty(NetworkConstantsKt.HEADER_CONTENT_TYPE, iVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(i(iVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void e(HttpURLConnection httpURLConnection, com.android.volley.i<?> iVar) {
        byte[] body = iVar.getBody();
        if (body != null) {
            d(httpURLConnection, iVar, body);
        }
    }

    static List<com.android.volley.e> f(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new com.android.volley.e(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private static boolean j(int i11, int i12) {
        return (i11 == 4 || (100 <= i12 && i12 < 200) || i12 == 204 || i12 == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream k(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection l(URL url, com.android.volley.i<?> iVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection g11 = g(url);
        int timeoutMs = iVar.getTimeoutMs();
        g11.setConnectTimeout(timeoutMs);
        g11.setReadTimeout(timeoutMs);
        g11.setUseCaches(false);
        g11.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f10349b) != null) {
            ((HttpsURLConnection) g11).setSSLSocketFactory(sSLSocketFactory);
        }
        return g11;
    }

    @Override // com.android.volley.toolbox.b
    public h b(com.android.volley.i<?> iVar, Map<String, String> map) {
        String url = iVar.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(iVar.getHeaders());
        b bVar = this.f10348a;
        if (bVar != null) {
            String a11 = bVar.a(url);
            if (a11 == null) {
                throw new IOException("URL blocked by rewriter: " + url);
            }
            url = a11;
        }
        HttpURLConnection l11 = l(new URL(url), iVar);
        try {
            for (String str : hashMap.keySet()) {
                l11.setRequestProperty(str, (String) hashMap.get(str));
            }
            m(l11, iVar);
            int responseCode = l11.getResponseCode();
            if (responseCode != -1) {
                if (!j(iVar.getMethod(), responseCode)) {
                    h hVar = new h(responseCode, f(l11.getHeaderFields()));
                    l11.disconnect();
                    return hVar;
                }
                return new h(responseCode, f(l11.getHeaderFields()), l11.getContentLength(), h(iVar, l11));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            if (0 == 0) {
                l11.disconnect();
            }
            throw th2;
        }
    }

    protected HttpURLConnection g(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    protected InputStream h(com.android.volley.i<?> iVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    protected OutputStream i(com.android.volley.i<?> iVar, HttpURLConnection httpURLConnection, int i11) {
        return httpURLConnection.getOutputStream();
    }

    void m(HttpURLConnection httpURLConnection, com.android.volley.i<?> iVar) {
        switch (iVar.getMethod()) {
            case -1:
                byte[] postBody = iVar.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    d(httpURLConnection, iVar, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                e(httpURLConnection, iVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                e(httpURLConnection, iVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                e(httpURLConnection, iVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public j(b bVar) {
        this(bVar, null);
    }

    public j(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f10348a = bVar;
        this.f10349b = sSLSocketFactory;
    }
}