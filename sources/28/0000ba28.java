package vm;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f54541c = {Marker.ANY_MARKER, "FCM", CodePackage.GCM, ""};

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f54542a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54543b;

    public b(com.google.firebase.d dVar) {
        this.f54542a = dVar.j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f54543b = b(dVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(com.google.firebase.d dVar) {
        String d11 = dVar.m().d();
        if (d11 != null) {
            return d11;
        }
        String c11 = dVar.m().c();
        if (c11.startsWith("1:") || c11.startsWith("2:")) {
            String[] split = c11.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return c11;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e11) {
            Log.w("ContentValues", "Invalid key stored " + e11);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f54542a) {
            string = this.f54542a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f54542a) {
            String string = this.f54542a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e11 = e(string);
            if (e11 == null) {
                return null;
            }
            return c(e11);
        }
    }

    public String f() {
        synchronized (this.f54542a) {
            String g11 = g();
            if (g11 != null) {
                return g11;
            }
            return h();
        }
    }

    public String i() {
        synchronized (this.f54542a) {
            for (String str : f54541c) {
                String string = this.f54542a.getString(a(this.f54543b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}