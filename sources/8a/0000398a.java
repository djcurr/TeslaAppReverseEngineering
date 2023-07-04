package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.util.j;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kn.k;

/* loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    static Object a(j jVar, k kVar, h hVar) {
        hVar.e();
        long d11 = hVar.d();
        gn.c c11 = gn.c.c(kVar);
        try {
            URLConnection a11 = jVar.a();
            if (a11 instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a11, hVar, c11).getContent();
            }
            if (a11 instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a11, hVar, c11).getContent();
            }
            return a11.getContent();
        } catch (IOException e11) {
            c11.p(d11);
            c11.t(hVar.b());
            c11.v(jVar.toString());
            in.d.d(c11);
            throw e11;
        }
    }

    static Object b(j jVar, Class[] clsArr, k kVar, h hVar) {
        hVar.e();
        long d11 = hVar.d();
        gn.c c11 = gn.c.c(kVar);
        try {
            URLConnection a11 = jVar.a();
            if (a11 instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a11, hVar, c11).getContent(clsArr);
            }
            if (a11 instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a11, hVar, c11).getContent(clsArr);
            }
            return a11.getContent(clsArr);
        } catch (IOException e11) {
            c11.p(d11);
            c11.t(hVar.b());
            c11.v(jVar.toString());
            in.d.d(c11);
            throw e11;
        }
    }

    static InputStream c(j jVar, k kVar, h hVar) {
        hVar.e();
        long d11 = hVar.d();
        gn.c c11 = gn.c.c(kVar);
        try {
            URLConnection a11 = jVar.a();
            if (a11 instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a11, hVar, c11).getInputStream();
            }
            if (a11 instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a11, hVar, c11).getInputStream();
            }
            return a11.getInputStream();
        } catch (IOException e11) {
            c11.p(d11);
            c11.t(hVar.b());
            c11.v(jVar.toString());
            in.d.d(c11);
            throw e11;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return a(new j(url), k.k(), new h());
    }

    @Keep
    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new b((HttpsURLConnection) obj, new h(), gn.c.c(k.k()));
        }
        return obj instanceof HttpURLConnection ? new a((HttpURLConnection) obj, new h(), gn.c.c(k.k())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return c(new j(url), k.k(), new h());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return b(new j(url), clsArr, k.k(), new h());
    }
}