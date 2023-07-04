package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.stripe.android.networking.FraudDetectionData;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes2.dex */
class v0 {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f16868a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f16869d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f16870a;

        /* renamed from: b  reason: collision with root package name */
        final String f16871b;

        /* renamed from: c  reason: collision with root package name */
        final long f16872c;

        private a(String str, String str2, long j11) {
            this.f16870a = str;
            this.f16871b = str2;
            this.f16872c = j11;
        }

        static String a(String str, String str2, long j11) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(FraudDetectionData.KEY_TIMESTAMP, j11);
                return jSONObject.toString();
            } catch (JSONException e11) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e11);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(FraudDetectionData.KEY_TIMESTAMP));
                } catch (JSONException e11) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + e11);
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(String str) {
            return System.currentTimeMillis() > this.f16872c + f16869d || !str.equals(this.f16871b);
        }
    }

    public v0(Context context) {
        this.f16868a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.b.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e11) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e11.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|" + Marker.ANY_MARKER;
    }

    public synchronized void c() {
        this.f16868a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b11 = b(str, str2);
        SharedPreferences.Editor edit = this.f16868a.edit();
        edit.remove(b11);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f16868a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f16868a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a11 = a.a(str3, str4, System.currentTimeMillis());
        if (a11 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f16868a.edit();
        edit.putString(b(str, str2), a11);
        edit.commit();
    }
}