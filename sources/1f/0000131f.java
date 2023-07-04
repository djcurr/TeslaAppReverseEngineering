package com.adyen.checkout.core.api;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
abstract class a {
    static {
        HttpsURLConnection.setDefaultSSLSocketFactory(f.f9589a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpURLConnection a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(f.f9589a);
            return httpURLConnection;
        }
        return b(httpURLConnection);
    }

    abstract HttpURLConnection b(HttpURLConnection httpURLConnection);
}