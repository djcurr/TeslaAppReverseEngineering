package wm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import qm.j;
import wm.d;
import wm.f;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f56123d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f56124e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Context f56125a;

    /* renamed from: b  reason: collision with root package name */
    private final sm.b<j> f56126b;

    /* renamed from: c  reason: collision with root package name */
    private final e f56127c = new e();

    public c(Context context, sm.b<j> bVar) {
        this.f56125a = context;
        this.f56126b = bVar;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            return jSONObject;
        } catch (JSONException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private String g() {
        try {
            Context context = this.f56125a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f56125a.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("ContentValues", "No such package: " + this.f56125a.getPackageName(), e11);
            return null;
        }
    }

    private URL h(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e11) {
            throw new FirebaseInstallationsException(e11.getMessage(), FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    private static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean j(int i11) {
        return i11 >= 200 && i11 < 300;
    }

    private static void k() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void l(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String p11 = p(httpURLConnection);
        if (TextUtils.isEmpty(p11)) {
            return;
        }
        Log.w("Firebase-Installations", p11);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    private HttpURLConnection m(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(NetworkConstantsKt.HEADER_CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty(NetworkConstantsKt.HEADER_ACCEPT, "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f56125a.getPackageName());
            j jVar = this.f56126b.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(jVar.a()));
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                } catch (ExecutionException e12) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e12);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", g());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    static long n(String str) {
        Preconditions.checkArgument(f56123d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d o(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f56124e));
        f.a a11 = f.a();
        d.a a12 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a12.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a12.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a12.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a11.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a11.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a12.b(a11.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a12.e(d.b.OK).a();
    }

    private static String p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f56124e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th2;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    private f q(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f56124e));
        f.a a11 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a11.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a11.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a11.b(f.b.OK).a();
    }

    private void r(HttpURLConnection httpURLConnection, String str, String str2) {
        t(httpURLConnection, i(b(str, str2)));
    }

    private void s(HttpURLConnection httpURLConnection) {
        t(httpURLConnection, i(c()));
    }

    private static void t(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public d d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        d o11;
        if (this.f56127c.b()) {
            URL h11 = h(String.format("projects/%s/installations", str3));
            for (int i11 = 0; i11 <= 1; i11++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection m11 = m(h11, str);
                try {
                    m11.setRequestMethod("POST");
                    m11.setDoOutput(true);
                    if (str5 != null) {
                        m11.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    r(m11, str2, str4);
                    responseCode = m11.getResponseCode();
                    this.f56127c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    m11.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (j(responseCode)) {
                    o11 = o(m11);
                } else {
                    l(m11, str4, str, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        k();
                        o11 = d.a().e(d.b.BAD_CONFIG).a();
                    } else {
                        m11.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                m11.disconnect();
                TrafficStats.clearThreadStatsTag();
                return o11;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    public void e(String str, String str2, String str3, String str4) {
        int responseCode;
        int i11 = 0;
        URL h11 = h(String.format("projects/%s/installations/%s", str3, str2));
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            HttpURLConnection m11 = m(h11, str);
            try {
                m11.setRequestMethod("DELETE");
                m11.addRequestProperty(NetworkConstantsKt.HEADER_AUTHORIZATION, "FIS_v2 " + str4);
                responseCode = m11.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                m11.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                l(m11, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    k();
                    throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.a.BAD_CONFIG);
                    break;
                }
                i11++;
                m11.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m11.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    public f f(String str, String str2, String str3, String str4) {
        int responseCode;
        f q11;
        if (this.f56127c.b()) {
            URL h11 = h(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i11 = 0; i11 <= 1; i11++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection m11 = m(h11, str);
                try {
                    m11.setRequestMethod("POST");
                    m11.addRequestProperty(NetworkConstantsKt.HEADER_AUTHORIZATION, "FIS_v2 " + str4);
                    m11.setDoOutput(true);
                    s(m11);
                    responseCode = m11.getResponseCode();
                    this.f56127c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    m11.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (j(responseCode)) {
                    q11 = q(m11);
                } else {
                    l(m11, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            k();
                            q11 = f.a().b(f.b.BAD_CONFIG).a();
                        } else {
                            m11.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    q11 = f.a().b(f.b.AUTH_ERROR).a();
                }
                m11.disconnect();
                TrafficStats.clearThreadStatsTag();
                return q11;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }
}