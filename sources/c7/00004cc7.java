package com.stripe.android.core.networking;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.StripeConnection;
import com.stripe.android.core.networking.StripeRequest;
import e00.b;
import java.io.File;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes2.dex */
public interface ConnectionFactory {
    public static final /* synthetic */ Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int CONNECT_TIMEOUT;
        private static final int READ_TIMEOUT;

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CONNECT_TIMEOUT = (int) timeUnit.toMillis(30L);
            READ_TIMEOUT = (int) timeUnit.toMillis(80L);
        }

        private Companion() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class Default implements ConnectionFactory {
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        private final HttpURLConnection openConnectionAndApplyFields(StripeRequest stripeRequest) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(stripeRequest.getUrl()).openConnection());
            Objects.requireNonNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setConnectTimeout(Companion.CONNECT_TIMEOUT);
            httpURLConnection.setReadTimeout(Companion.READ_TIMEOUT);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod(stripeRequest.getMethod().getCode());
            for (Map.Entry<String, String> entry : stripeRequest.getHeaders().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            if (StripeRequest.Method.POST == stripeRequest.getMethod()) {
                httpURLConnection.setDoOutput(true);
                Map<String, String> postHeaders = stripeRequest.getPostHeaders();
                if (postHeaders != null) {
                    for (Map.Entry<String, String> entry2 : postHeaders.entrySet()) {
                        httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                }
                OutputStream output = httpURLConnection.getOutputStream();
                try {
                    s.f(output, "output");
                    stripeRequest.writePostBody(output);
                    b0 b0Var = b0.f54756a;
                    b.a(output, null);
                } finally {
                }
            }
            return httpURLConnection;
        }

        @Override // com.stripe.android.core.networking.ConnectionFactory
        public /* synthetic */ StripeConnection create(StripeRequest request) {
            s.g(request, "request");
            return new StripeConnection.Default(openConnectionAndApplyFields(request));
        }

        @Override // com.stripe.android.core.networking.ConnectionFactory
        public StripeConnection<File> createForFile(StripeRequest request, File outputFile) {
            s.g(request, "request");
            s.g(outputFile, "outputFile");
            return new StripeConnection.FileConnection(openConnectionAndApplyFields(request), outputFile);
        }
    }

    StripeConnection<String> create(StripeRequest stripeRequest);

    StripeConnection<File> createForFile(StripeRequest stripeRequest, File file);
}