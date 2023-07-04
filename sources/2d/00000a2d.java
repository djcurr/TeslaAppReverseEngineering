package atd.a;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final SSLSocketFactory f6735a;

    static {
        try {
            f6735a = new k();
        } catch (KeyManagementException | NoSuchAlgorithmException e11) {
            throw new RuntimeException(atd.s0.a.a(-103017749473856L), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpURLConnection a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(f6735a);
            return httpsURLConnection;
        }
        return a(httpURLConnection);
    }

    abstract HttpURLConnection a(HttpURLConnection httpURLConnection);
}