package cm;

import ch.qos.logback.classic.spi.CallerData;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wl.f;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f9277a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f9278b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f9279c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f9277a = str;
        this.f9278b = map;
    }

    private String a(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        Map.Entry<String, String> next = it2.next();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(next.getKey());
        sb3.append("=");
        sb3.append(next.getValue() != null ? next.getValue() : "");
        sb2.append(sb3.toString());
        while (it2.hasNext()) {
            Map.Entry<String, String> next2 = it2.next();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("&");
            sb4.append(next2.getKey());
            sb4.append("=");
            sb4.append(next2.getValue() != null ? next2.getValue() : "");
            sb2.append(sb4.toString());
        }
        return sb2.toString();
    }

    private String b(String str, Map<String, String> map) {
        String a11 = a(map);
        if (a11.isEmpty()) {
            return str;
        }
        if (str.contains(CallerData.NA)) {
            if (!str.endsWith("&")) {
                a11 = "&" + a11;
            }
            return str + a11;
        }
        return str + CallerData.NA + a11;
    }

    private String e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[PKIFailureInfo.certRevoked];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }

    public c c() {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String e11 = null;
        inputStream = null;
        try {
            String b11 = b(this.f9277a, this.f9278b);
            f.f().i("GET Request URL: " + b11);
            httpsURLConnection = (HttpsURLConnection) new URL(b11).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f9279c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        e11 = e(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, e11);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f9279c.put(str, str2);
        return this;
    }
}