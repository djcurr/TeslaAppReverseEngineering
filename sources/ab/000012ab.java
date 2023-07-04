package com.adyen.checkout.components.analytics;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.g;
import com.adyen.checkout.core.api.d;
import com.adyen.checkout.core.api.f;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import o7.b;

/* loaded from: classes.dex */
public class AnalyticsDispatcher extends g {

    /* renamed from: i  reason: collision with root package name */
    private static final String f9552i = o7.a.c();

    public static void j(Context context, d dVar, a aVar) {
        Intent intent = new Intent();
        intent.putExtra("analytic_event", aVar);
        intent.putExtra("env_url_key", dVar.a());
        g.d(context, AnalyticsDispatcher.class, 4747, intent);
    }

    @Override // androidx.core.app.g
    protected void g(Intent intent) {
        a aVar = (a) intent.getParcelableExtra("analytic_event");
        String stringExtra = intent.getStringExtra("env_url_key");
        if (aVar == null) {
            b.c(f9552i, "Analytics event is null.");
        } else if (stringExtra == null) {
            b.c(f9552i, "env url is null.");
        } else {
            b.f(f9552i, "Sending analytic event.");
            HttpsURLConnection httpsURLConnection = null;
            try {
                try {
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(aVar.b(stringExtra + "images/analytics.png").openConnection()));
                    try {
                        httpsURLConnection2.setSSLSocketFactory(f.f9589a);
                        httpsURLConnection2.connect();
                        InputStream inputStream = httpsURLConnection2.getInputStream();
                        try {
                            inputStream.read();
                            inputStream.close();
                            httpsURLConnection2.disconnect();
                        } catch (Throwable th2) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        httpsURLConnection = httpsURLConnection2;
                        b.d(f9552i, "Failed to send analytics event.", e);
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        httpsURLConnection = httpsURLConnection2;
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }
}