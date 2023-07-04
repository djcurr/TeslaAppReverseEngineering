package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
public final class q implements Callable<u> {

    /* renamed from: e  reason: collision with root package name */
    public static final HttpRequestRetryHandler f10115e = new ad();

    /* renamed from: a  reason: collision with root package name */
    public l f10116a;

    /* renamed from: b  reason: collision with root package name */
    public Context f10117b;

    /* renamed from: c  reason: collision with root package name */
    public o f10118c;

    /* renamed from: d  reason: collision with root package name */
    public String f10119d;

    /* renamed from: f  reason: collision with root package name */
    public HttpUriRequest f10120f;

    /* renamed from: i  reason: collision with root package name */
    public CookieManager f10123i;

    /* renamed from: j  reason: collision with root package name */
    public AbstractHttpEntity f10124j;

    /* renamed from: k  reason: collision with root package name */
    public HttpHost f10125k;

    /* renamed from: l  reason: collision with root package name */
    public URL f10126l;

    /* renamed from: q  reason: collision with root package name */
    public String f10131q;

    /* renamed from: g  reason: collision with root package name */
    public HttpContext f10121g = new BasicHttpContext();

    /* renamed from: h  reason: collision with root package name */
    public CookieStore f10122h = new BasicCookieStore();

    /* renamed from: m  reason: collision with root package name */
    public int f10127m = 0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10128n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10129o = false;

    /* renamed from: p  reason: collision with root package name */
    public String f10130p = null;

    public q(l lVar, o oVar) {
        this.f10116a = lVar;
        this.f10117b = lVar.f10093a;
        this.f10118c = oVar;
    }

    public static long a(String[] strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if ("max-age".equalsIgnoreCase(strArr[i11])) {
                int i12 = i11 + 1;
                if (strArr[i12] != null) {
                    try {
                        return Long.parseLong(strArr[i12]);
                    } catch (Exception unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return 0L;
    }

    public static HttpUrlHeader a(HttpResponse httpResponse) {
        Header[] allHeaders;
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    private u a(HttpResponse httpResponse, int i11, String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        String str2;
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        String str3 = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.getStatusLine().getStatusCode();
                return null;
            }
            return null;
        }
        Thread.currentThread().getId();
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            a(entity, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.f10129o = false;
            this.f10116a.c(System.currentTimeMillis() - currentTimeMillis);
            this.f10116a.a(byteArray.length);
            p pVar = new p(a(httpResponse), i11, str, byteArray);
            long b11 = b(httpResponse);
            Header contentType = httpResponse.getEntity().getContentType();
            if (contentType != null) {
                HashMap<String, String> a11 = a(contentType.getValue());
                str3 = a11.get("charset");
                str2 = a11.get(NetworkConstantsKt.HEADER_CONTENT_TYPE);
            } else {
                str2 = null;
            }
            pVar.b(str2);
            pVar.a(str3);
            pVar.a(System.currentTimeMillis());
            pVar.b(b11);
            try {
                byteArrayOutputStream.close();
                return pVar;
            } catch (IOException e11) {
                throw new RuntimeException("ArrayOutputStream close error!", e11.getCause());
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException e12) {
                    throw new RuntimeException("ArrayOutputStream close error!", e12.getCause());
                }
            }
            throw th;
        }
    }

    public static HashMap<String, String> a(String str) {
        String[] split;
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split2 = str2.indexOf(61) == -1 ? new String[]{NetworkConstantsKt.HEADER_CONTENT_TYPE, str2} : str2.split("=");
            hashMap.put(split2[0], split2[1]);
        }
        return hashMap;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) {
        InputStream a11 = b.a(httpEntity);
        httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = a11.read(bArr);
                    if (read == -1 || this.f10118c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    this.f10118c.f();
                }
                outputStream.flush();
            } catch (Exception e11) {
                e11.getCause();
                throw new IOException("HttpWorker Request Error!" + e11.getLocalizedMessage());
            }
        } finally {
            r.a(a11);
        }
    }

    public static long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private URI b() {
        String a11 = this.f10118c.a();
        String str = this.f10119d;
        if (str != null) {
            a11 = str;
        }
        if (a11 != null) {
            return new URI(a11);
        }
        throw new RuntimeException("url should not be null");
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f10120f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f10124j == null) {
            byte[] b11 = this.f10118c.b();
            String b12 = this.f10118c.b("gzip");
            if (b11 != null) {
                if (TextUtils.equals(b12, "true")) {
                    this.f10124j = b.a(b11);
                } else {
                    this.f10124j = new ByteArrayEntity(b11);
                }
                this.f10124j.setContentType(this.f10118c.c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f10124j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(abstractHttpEntity);
            this.f10120f = httpPost;
        } else {
            this.f10120f = new HttpGet(b());
        }
        return this.f10120f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3 A[Catch: Exception -> 0x023b, NullPointerException -> 0x0258, IOException -> 0x0277, UnknownHostException -> 0x0297, HttpHostConnectException -> 0x02b9, NoHttpResponseException -> 0x02d8, SocketTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x031a, ConnectionPoolTimeoutException -> 0x033a, SSLException -> 0x035a, SSLPeerUnverifiedException -> 0x037a, SSLHandshakeException -> 0x039a, URISyntaxException -> 0x03ba, HttpException -> 0x03c7, TryCatch #3 {HttpException -> 0x03c7, NullPointerException -> 0x0258, SocketTimeoutException -> 0x02f9, UnknownHostException -> 0x0297, SSLHandshakeException -> 0x039a, SSLException -> 0x035a, IOException -> 0x0277, HttpHostConnectException -> 0x02b9, SSLPeerUnverifiedException -> 0x037a, NoHttpResponseException -> 0x02d8, ConnectTimeoutException -> 0x031a, Exception -> 0x023b, ConnectionPoolTimeoutException -> 0x033a, URISyntaxException -> 0x03ba, blocks: (B:4:0x0006, B:18:0x0032, B:20:0x003a, B:22:0x0040, B:23:0x0044, B:25:0x004a, B:26:0x0058, B:28:0x006c, B:30:0x0081, B:32:0x00ad, B:34:0x00bc, B:36:0x00c2, B:38:0x00cc, B:41:0x00d5, B:43:0x00e1, B:47:0x00eb, B:51:0x010b, B:53:0x0113, B:54:0x0120, B:56:0x0146, B:57:0x014d, B:59:0x0153, B:60:0x0157, B:62:0x015d, B:64:0x0169, B:68:0x0198, B:69:0x01b4, B:77:0x01d1, B:78:0x01ea, B:79:0x01eb, B:81:0x01f3, B:83:0x01f9, B:87:0x0205, B:89:0x0209, B:91:0x0219, B:93:0x0221, B:95:0x022b, B:50:0x00f3, B:97:0x022f, B:98:0x023a, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0025, B:16:0x002d), top: B:183:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113 A[Catch: Exception -> 0x023b, NullPointerException -> 0x0258, IOException -> 0x0277, UnknownHostException -> 0x0297, HttpHostConnectException -> 0x02b9, NoHttpResponseException -> 0x02d8, SocketTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x031a, ConnectionPoolTimeoutException -> 0x033a, SSLException -> 0x035a, SSLPeerUnverifiedException -> 0x037a, SSLHandshakeException -> 0x039a, URISyntaxException -> 0x03ba, HttpException -> 0x03c7, TryCatch #3 {HttpException -> 0x03c7, NullPointerException -> 0x0258, SocketTimeoutException -> 0x02f9, UnknownHostException -> 0x0297, SSLHandshakeException -> 0x039a, SSLException -> 0x035a, IOException -> 0x0277, HttpHostConnectException -> 0x02b9, SSLPeerUnverifiedException -> 0x037a, NoHttpResponseException -> 0x02d8, ConnectTimeoutException -> 0x031a, Exception -> 0x023b, ConnectionPoolTimeoutException -> 0x033a, URISyntaxException -> 0x03ba, blocks: (B:4:0x0006, B:18:0x0032, B:20:0x003a, B:22:0x0040, B:23:0x0044, B:25:0x004a, B:26:0x0058, B:28:0x006c, B:30:0x0081, B:32:0x00ad, B:34:0x00bc, B:36:0x00c2, B:38:0x00cc, B:41:0x00d5, B:43:0x00e1, B:47:0x00eb, B:51:0x010b, B:53:0x0113, B:54:0x0120, B:56:0x0146, B:57:0x014d, B:59:0x0153, B:60:0x0157, B:62:0x015d, B:64:0x0169, B:68:0x0198, B:69:0x01b4, B:77:0x01d1, B:78:0x01ea, B:79:0x01eb, B:81:0x01f3, B:83:0x01f9, B:87:0x0205, B:89:0x0209, B:91:0x0219, B:93:0x0221, B:95:0x022b, B:50:0x00f3, B:97:0x022f, B:98:0x023a, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0025, B:16:0x002d), top: B:183:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146 A[Catch: Exception -> 0x023b, NullPointerException -> 0x0258, IOException -> 0x0277, UnknownHostException -> 0x0297, HttpHostConnectException -> 0x02b9, NoHttpResponseException -> 0x02d8, SocketTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x031a, ConnectionPoolTimeoutException -> 0x033a, SSLException -> 0x035a, SSLPeerUnverifiedException -> 0x037a, SSLHandshakeException -> 0x039a, URISyntaxException -> 0x03ba, HttpException -> 0x03c7, TryCatch #3 {HttpException -> 0x03c7, NullPointerException -> 0x0258, SocketTimeoutException -> 0x02f9, UnknownHostException -> 0x0297, SSLHandshakeException -> 0x039a, SSLException -> 0x035a, IOException -> 0x0277, HttpHostConnectException -> 0x02b9, SSLPeerUnverifiedException -> 0x037a, NoHttpResponseException -> 0x02d8, ConnectTimeoutException -> 0x031a, Exception -> 0x023b, ConnectionPoolTimeoutException -> 0x033a, URISyntaxException -> 0x03ba, blocks: (B:4:0x0006, B:18:0x0032, B:20:0x003a, B:22:0x0040, B:23:0x0044, B:25:0x004a, B:26:0x0058, B:28:0x006c, B:30:0x0081, B:32:0x00ad, B:34:0x00bc, B:36:0x00c2, B:38:0x00cc, B:41:0x00d5, B:43:0x00e1, B:47:0x00eb, B:51:0x010b, B:53:0x0113, B:54:0x0120, B:56:0x0146, B:57:0x014d, B:59:0x0153, B:60:0x0157, B:62:0x015d, B:64:0x0169, B:68:0x0198, B:69:0x01b4, B:77:0x01d1, B:78:0x01ea, B:79:0x01eb, B:81:0x01f3, B:83:0x01f9, B:87:0x0205, B:89:0x0209, B:91:0x0219, B:93:0x0221, B:95:0x022b, B:50:0x00f3, B:97:0x022f, B:98:0x023a, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0025, B:16:0x002d), top: B:183:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153 A[Catch: Exception -> 0x023b, NullPointerException -> 0x0258, IOException -> 0x0277, UnknownHostException -> 0x0297, HttpHostConnectException -> 0x02b9, NoHttpResponseException -> 0x02d8, SocketTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x031a, ConnectionPoolTimeoutException -> 0x033a, SSLException -> 0x035a, SSLPeerUnverifiedException -> 0x037a, SSLHandshakeException -> 0x039a, URISyntaxException -> 0x03ba, HttpException -> 0x03c7, TryCatch #3 {HttpException -> 0x03c7, NullPointerException -> 0x0258, SocketTimeoutException -> 0x02f9, UnknownHostException -> 0x0297, SSLHandshakeException -> 0x039a, SSLException -> 0x035a, IOException -> 0x0277, HttpHostConnectException -> 0x02b9, SSLPeerUnverifiedException -> 0x037a, NoHttpResponseException -> 0x02d8, ConnectTimeoutException -> 0x031a, Exception -> 0x023b, ConnectionPoolTimeoutException -> 0x033a, URISyntaxException -> 0x03ba, blocks: (B:4:0x0006, B:18:0x0032, B:20:0x003a, B:22:0x0040, B:23:0x0044, B:25:0x004a, B:26:0x0058, B:28:0x006c, B:30:0x0081, B:32:0x00ad, B:34:0x00bc, B:36:0x00c2, B:38:0x00cc, B:41:0x00d5, B:43:0x00e1, B:47:0x00eb, B:51:0x010b, B:53:0x0113, B:54:0x0120, B:56:0x0146, B:57:0x014d, B:59:0x0153, B:60:0x0157, B:62:0x015d, B:64:0x0169, B:68:0x0198, B:69:0x01b4, B:77:0x01d1, B:78:0x01ea, B:79:0x01eb, B:81:0x01f3, B:83:0x01f9, B:87:0x0205, B:89:0x0209, B:91:0x0219, B:93:0x0221, B:95:0x022b, B:50:0x00f3, B:97:0x022f, B:98:0x023a, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0025, B:16:0x002d), top: B:183:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    @Override // java.util.concurrent.Callable
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.phone.mrpc.core.u call() {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.q.call():com.alipay.android.phone.mrpc.core.u");
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f10120f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (TextUtils.isEmpty(this.f10131q)) {
            String b11 = this.f10118c.b("operationType");
            this.f10131q = b11;
            return b11;
        }
        return this.f10131q;
    }

    private int g() {
        URL h11 = h();
        return h11.getPort() == -1 ? h11.getDefaultPort() : h11.getPort();
    }

    private URL h() {
        URL url = this.f10126l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f10118c.a());
        this.f10126l = url2;
        return url2;
    }

    private CookieManager i() {
        CookieManager cookieManager = this.f10123i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f10123i = cookieManager2;
        return cookieManager2;
    }

    public final o a() {
        return this.f10118c;
    }
}