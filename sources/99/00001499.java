package com.android.volley.toolbox;

import com.google.firebase.perf.network.FirebasePerfHttpClient;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes.dex */
public class f implements i {

    /* renamed from: a  reason: collision with root package name */
    protected final HttpClient f10342a;

    /* loaded from: classes.dex */
    public static final class a extends HttpEntityEnclosingRequestBase {
        public a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public f(HttpClient httpClient) {
        this.f10342a = httpClient;
    }

    static HttpUriRequest b(com.android.volley.i<?> iVar, Map<String, String> map) {
        switch (iVar.getMethod()) {
            case -1:
                byte[] postBody = iVar.getPostBody();
                if (postBody != null) {
                    HttpPost httpPost = new HttpPost(iVar.getUrl());
                    httpPost.addHeader(NetworkConstantsKt.HEADER_CONTENT_TYPE, iVar.getPostBodyContentType());
                    httpPost.setEntity(new ByteArrayEntity(postBody));
                    return httpPost;
                }
                return new HttpGet(iVar.getUrl());
            case 0:
                return new HttpGet(iVar.getUrl());
            case 1:
                HttpPost httpPost2 = new HttpPost(iVar.getUrl());
                httpPost2.addHeader(NetworkConstantsKt.HEADER_CONTENT_TYPE, iVar.getBodyContentType());
                d(httpPost2, iVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(iVar.getUrl());
                httpPut.addHeader(NetworkConstantsKt.HEADER_CONTENT_TYPE, iVar.getBodyContentType());
                d(httpPut, iVar);
                return httpPut;
            case 3:
                return new HttpDelete(iVar.getUrl());
            case 4:
                return new HttpHead(iVar.getUrl());
            case 5:
                return new HttpOptions(iVar.getUrl());
            case 6:
                return new HttpTrace(iVar.getUrl());
            case 7:
                a aVar = new a(iVar.getUrl());
                aVar.addHeader(NetworkConstantsKt.HEADER_CONTENT_TYPE, iVar.getBodyContentType());
                d(aVar, iVar);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static void d(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, com.android.volley.i<?> iVar) {
        byte[] body = iVar.getBody();
        if (body != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(body));
        }
    }

    private static void e(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // com.android.volley.toolbox.i
    public HttpResponse a(com.android.volley.i<?> iVar, Map<String, String> map) {
        HttpUriRequest b11 = b(iVar, map);
        e(b11, map);
        e(b11, iVar.getHeaders());
        c(b11);
        HttpParams params = b11.getParams();
        int timeoutMs = iVar.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, timeoutMs);
        return FirebasePerfHttpClient.execute(this.f10342a, b11);
    }

    protected void c(HttpUriRequest httpUriRequest) {
    }
}