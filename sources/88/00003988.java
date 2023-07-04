package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.h;
import java.io.IOException;
import kn.k;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, h hVar, k kVar) {
        gn.c c11 = gn.c.c(kVar);
        try {
            c11.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long a11 = in.d.a(httpRequest);
            if (a11 != null) {
                c11.o(a11.longValue());
            }
            hVar.e();
            c11.p(hVar.d());
            return (T) httpClient.execute(httpHost, httpRequest, new in.c(responseHandler, hVar, c11));
        } catch (IOException e11) {
            c11.t(hVar.b());
            in.d.d(c11);
            throw e11;
        }
    }

    static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, h hVar, k kVar) {
        gn.c c11 = gn.c.c(kVar);
        try {
            c11.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long a11 = in.d.a(httpRequest);
            if (a11 != null) {
                c11.o(a11.longValue());
            }
            hVar.e();
            c11.p(hVar.d());
            return (T) httpClient.execute(httpHost, httpRequest, new in.c(responseHandler, hVar, c11), httpContext);
        } catch (IOException e11) {
            c11.t(hVar.b());
            in.d.d(c11);
            throw e11;
        }
    }

    static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, h hVar, k kVar) {
        gn.c c11 = gn.c.c(kVar);
        try {
            c11.v(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long a11 = in.d.a(httpUriRequest);
            if (a11 != null) {
                c11.o(a11.longValue());
            }
            hVar.e();
            c11.p(hVar.d());
            return (T) httpClient.execute(httpUriRequest, new in.c(responseHandler, hVar, c11));
        } catch (IOException e11) {
            c11.t(hVar.b());
            in.d.d(c11);
            throw e11;
        }
    }

    static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, h hVar, k kVar) {
        gn.c c11 = gn.c.c(kVar);
        try {
            c11.v(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long a11 = in.d.a(httpUriRequest);
            if (a11 != null) {
                c11.o(a11.longValue());
            }
            hVar.e();
            c11.p(hVar.d());
            return (T) httpClient.execute(httpUriRequest, new in.c(responseHandler, hVar, c11), httpContext);
        } catch (IOException e11) {
            c11.t(hVar.b());
            in.d.d(c11);
            throw e11;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, h hVar, k kVar) {
        gn.c c11 = gn.c.c(kVar);
        try {
            c11.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long a11 = in.d.a(httpRequest);
            if (a11 != null) {
                c11.o(a11.longValue());
            }
            hVar.e();
            c11.p(hVar.d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c11.t(hVar.b());
            c11.l(execute.getStatusLine().getStatusCode());
            Long a12 = in.d.a(execute);
            if (a12 != null) {
                c11.r(a12.longValue());
            }
            String b11 = in.d.b(execute);
            if (b11 != null) {
                c11.q(b11);
            }
            c11.b();
            return execute;
        } catch (IOException e11) {
            c11.t(hVar.b());
            in.d.d(c11);
            throw e11;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new h(), k.k());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, h hVar, k kVar) {
        gn.c c11 = gn.c.c(kVar);
        try {
            c11.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).k(httpRequest.getRequestLine().getMethod());
            Long a11 = in.d.a(httpRequest);
            if (a11 != null) {
                c11.o(a11.longValue());
            }
            hVar.e();
            c11.p(hVar.d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c11.t(hVar.b());
            c11.l(execute.getStatusLine().getStatusCode());
            Long a12 = in.d.a(execute);
            if (a12 != null) {
                c11.r(a12.longValue());
            }
            String b11 = in.d.b(execute);
            if (b11 != null) {
                c11.q(b11);
            }
            c11.b();
            return execute;
        } catch (IOException e11) {
            c11.t(hVar.b());
            in.d.d(c11);
            throw e11;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, h hVar, k kVar) {
        gn.c c11 = gn.c.c(kVar);
        try {
            c11.v(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long a11 = in.d.a(httpUriRequest);
            if (a11 != null) {
                c11.o(a11.longValue());
            }
            hVar.e();
            c11.p(hVar.d());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c11.t(hVar.b());
            c11.l(execute.getStatusLine().getStatusCode());
            Long a12 = in.d.a(execute);
            if (a12 != null) {
                c11.r(a12.longValue());
            }
            String b11 = in.d.b(execute);
            if (b11 != null) {
                c11.q(b11);
            }
            c11.b();
            return execute;
        } catch (IOException e11) {
            c11.t(hVar.b());
            in.d.d(c11);
            throw e11;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, h hVar, k kVar) {
        gn.c c11 = gn.c.c(kVar);
        try {
            c11.v(httpUriRequest.getURI().toString()).k(httpUriRequest.getMethod());
            Long a11 = in.d.a(httpUriRequest);
            if (a11 != null) {
                c11.o(a11.longValue());
            }
            hVar.e();
            c11.p(hVar.d());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c11.t(hVar.b());
            c11.l(execute.getStatusLine().getStatusCode());
            Long a12 = in.d.a(execute);
            if (a12 != null) {
                c11.r(a12.longValue());
            }
            String b11 = in.d.b(execute);
            if (b11 != null) {
                c11.q(b11);
            }
            c11.b();
            return execute;
        } catch (IOException e11) {
            c11.t(hVar.b());
            in.d.d(c11);
            throw e11;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new h(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return (T) c(httpClient, httpUriRequest, responseHandler, new h(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new h(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new h(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new h(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new h(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new h(), k.k());
    }
}