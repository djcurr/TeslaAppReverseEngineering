package com.google.firebase.messaging;

import an.a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Tasks;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public class h0 {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return B(intent.getExtras());
    }

    public static boolean B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            com.google.firebase.d.k();
            Context j11 = com.google.firebase.d.k().j();
            SharedPreferences sharedPreferences = j11.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = j11.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(j11.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static an.a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.C0030a h11 = an.a.p().m(p(extras)).e(bVar).f(f(extras)).i(m()).k(a.d.ANDROID).h(k(extras));
        String h12 = h(extras);
        if (h12 != null) {
            h11.g(h12);
        }
        String o11 = o(extras);
        if (o11 != null) {
            h11.l(o11);
        }
        String c11 = c(extras);
        if (c11 != null) {
            h11.c(c11);
        }
        String i11 = i(extras);
        if (i11 != null) {
            h11.b(i11);
        }
        String e11 = e(extras);
        if (e11 != null) {
            h11.d(e11);
        }
        long n11 = n(extras);
        if (n11 > 0) {
            h11.j(n11);
        }
        return h11.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (TextUtils.isEmpty(string)) {
            try {
                return (String) Tasks.await(com.google.firebase.installations.c.r(com.google.firebase.d.k()).getId());
            } catch (InterruptedException | ExecutionException e11) {
                throw new RuntimeException(e11);
            }
        }
        return string;
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static a.c k(Bundle bundle) {
        if (bundle != null && j0.t(bundle)) {
            return a.c.DISPLAY_NOTIFICATION;
        }
        return a.c.DATA_MESSAGE;
    }

    static String l(Bundle bundle) {
        return (bundle == null || !j0.t(bundle)) ? MessageExtension.FIELD_DATA : "display";
    }

    static String m() {
        return com.google.firebase.d.k().j().getPackageName();
    }

    static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing project number", e11);
            }
        }
        com.google.firebase.d k11 = com.google.firebase.d.k();
        String d11 = k11.m().d();
        if (d11 != null) {
            try {
                return Long.parseLong(d11);
            } catch (NumberFormatException e12) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e12);
            }
        }
        String c11 = k11.m().c();
        if (!c11.startsWith("1:")) {
            try {
                return Long.parseLong(c11);
            } catch (NumberFormatException e13) {
                Log.w("FirebaseMessaging", "error parsing app ID", e13);
            }
        } else {
            String[] split = c11.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e14) {
                Log.w("FirebaseMessaging", "error parsing app ID", e14);
            }
        }
        return 0L;
    }

    static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        y(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (A(intent)) {
            x("_nr", intent.getExtras());
        }
        if (z(intent)) {
            w(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.t());
        }
    }

    private static void w(a.b bVar, Intent intent, nh.g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        an.a b11 = b(bVar, intent);
        if (b11 == null) {
            return;
        }
        try {
            gVar.a("FCM_CLIENT_EVENT_LOGGING", an.b.class, nh.b.b("src/main/proto"), new nh.e() { // from class: com.google.firebase.messaging.g0
                @Override // nh.e
                public final Object apply(Object obj) {
                    return ((an.b) obj).c();
                }
            }).a(nh.c.e(an.b.b().b(b11).a()));
        } catch (RuntimeException e11) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e11);
        }
    }

    static void x(String str, Bundle bundle) {
        try {
            com.google.firebase.d.k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d11 = d(bundle);
            if (d11 != null) {
                bundle2.putString("_nmid", d11);
            }
            String e11 = e(bundle);
            if (e11 != null) {
                bundle2.putString("_nmn", e11);
            }
            String i11 = i(bundle);
            if (!TextUtils.isEmpty(i11)) {
                bundle2.putString("label", i11);
            }
            String g11 = g(bundle);
            if (!TextUtils.isEmpty(g11)) {
                bundle2.putString("message_channel", g11);
            }
            String o11 = o(bundle);
            if (o11 != null) {
                bundle2.putString("_nt", o11);
            }
            String j11 = j(bundle);
            if (j11 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j11));
                } catch (NumberFormatException e12) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e12);
                }
            }
            String q11 = q(bundle);
            if (q11 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q11));
                } catch (NumberFormatException e13) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e13);
                }
            }
            String l11 = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l11);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            sl.a aVar = (sl.a) com.google.firebase.d.k().i(sl.a.class);
            if (aVar != null) {
                aVar.a(AppMeasurement.FCM_ORIGIN, str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    private static void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString("google.c.a.tc"))) {
            sl.a aVar = (sl.a) com.google.firebase.d.k().i(sl.a.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (aVar != null) {
                String string = bundle.getString("google.c.a.c_id");
                aVar.b(AppMeasurement.FCM_ORIGIN, "_ln", string);
                Bundle bundle2 = new Bundle();
                bundle2.putString(Stripe3ds2AuthParams.FIELD_SOURCE, "Firebase");
                bundle2.putString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM, "notification");
                bundle2.putString("campaign", string);
                aVar.a(AppMeasurement.FCM_ORIGIN, "_cmp", bundle2);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }

    public static boolean z(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }
}