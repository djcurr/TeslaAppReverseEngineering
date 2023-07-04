package qz;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.NetworkConstantsKt;
import io.sentry.d0;
import io.sentry.f3;
import io.sentry.g3;
import io.sentry.i2;
import io.sentry.r1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f48837e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Proxy f48838a;

    /* renamed from: b  reason: collision with root package name */
    private final r1 f48839b;

    /* renamed from: c  reason: collision with root package name */
    private final g3 f48840c;

    /* renamed from: d  reason: collision with root package name */
    private final y f48841d;

    public n(g3 g3Var, r1 r1Var, y yVar) {
        this(g3Var, r1Var, l.a(), yVar);
    }

    private void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
        httpURLConnection.disconnect();
    }

    private HttpURLConnection b() {
        HttpURLConnection e11 = e();
        for (Map.Entry<String, String> entry : this.f48839b.a().entrySet()) {
            e11.setRequestProperty(entry.getKey(), entry.getValue());
        }
        e11.setRequestMethod("POST");
        e11.setDoOutput(true);
        e11.setRequestProperty("Content-Encoding", "gzip");
        e11.setRequestProperty(NetworkConstantsKt.HEADER_CONTENT_TYPE, "application/x-sentry-envelope");
        e11.setRequestProperty(NetworkConstantsKt.HEADER_ACCEPT, "application/json");
        e11.setRequestProperty("Connection", "close");
        e11.setConnectTimeout(this.f48840c.getConnectionTimeoutMillis());
        e11.setReadTimeout(this.f48840c.getReadTimeoutMillis());
        HostnameVerifier hostnameVerifier = this.f48840c.getHostnameVerifier();
        boolean z11 = e11 instanceof HttpsURLConnection;
        if (z11 && hostnameVerifier != null) {
            ((HttpsURLConnection) e11).setHostnameVerifier(hostnameVerifier);
        }
        SSLSocketFactory sslSocketFactory = this.f48840c.getSslSocketFactory();
        if (z11 && sslSocketFactory != null) {
            ((HttpsURLConnection) e11).setSSLSocketFactory(sslSocketFactory);
        }
        e11.connect();
        return e11;
    }

    private String c(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f48837e));
            try {
                StringBuilder sb2 = new StringBuilder();
                boolean z11 = true;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (!z11) {
                        sb2.append("\n");
                    }
                    sb2.append(readLine);
                    z11 = false;
                }
                String sb3 = sb2.toString();
                bufferedReader.close();
                if (errorStream != null) {
                    errorStream.close();
                }
                return sb3;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    private boolean d(int i11) {
        return i11 == 200;
    }

    private a0 f(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                i(httpURLConnection, responseCode);
                if (!d(responseCode)) {
                    d0 logger = this.f48840c.getLogger();
                    f3 f3Var = f3.ERROR;
                    logger.c(f3Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
                    if (this.f48840c.isDebug()) {
                        this.f48840c.getLogger().c(f3Var, c(httpURLConnection), new Object[0]);
                    }
                    return a0.b(responseCode);
                }
                this.f48840c.getLogger().c(f3.DEBUG, "Envelope sent successfully.", new Object[0]);
                return a0.e();
            } catch (IOException e11) {
                this.f48840c.getLogger().a(f3.ERROR, e11, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return a0.a();
            }
        } finally {
            a(httpURLConnection);
        }
    }

    private Proxy g(g3.c cVar) {
        if (cVar != null) {
            String c11 = cVar.c();
            String a11 = cVar.a();
            if (c11 != null && a11 != null) {
                try {
                    return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(a11, Integer.parseInt(c11)));
                } catch (NumberFormatException e11) {
                    d0 logger = this.f48840c.getLogger();
                    f3 f3Var = f3.ERROR;
                    logger.a(f3Var, e11, "Failed to parse Sentry Proxy port: " + cVar.c() + ". Proxy is ignored", new Object[0]);
                }
            }
        }
        return null;
    }

    HttpURLConnection e() {
        URLConnection uRLConnection;
        if (this.f48838a == null) {
            uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(this.f48839b.b().openConnection());
        } else {
            uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(this.f48839b.b().openConnection(this.f48838a));
        }
        return (HttpURLConnection) uRLConnection;
    }

    public a0 h(i2 i2Var) {
        HttpURLConnection b11;
        try {
            OutputStream outputStream = b().getOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                this.f48840c.getSerializer().b(i2Var, gZIPOutputStream);
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } finally {
            try {
                return f(b11);
            } finally {
            }
        }
        return f(b11);
    }

    public void i(HttpURLConnection httpURLConnection, int i11) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f48841d.k(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i11);
    }

    n(g3 g3Var, r1 r1Var, l lVar, y yVar) {
        this.f48839b = r1Var;
        this.f48840c = g3Var;
        this.f48841d = yVar;
        Proxy g11 = g(g3Var.getProxy());
        this.f48838a = g11;
        if (g11 == null || g3Var.getProxy() == null) {
            return;
        }
        String d11 = g3Var.getProxy().d();
        String b11 = g3Var.getProxy().b();
        if (d11 == null || b11 == null) {
            return;
        }
        lVar.b(new u(d11, b11));
    }
}