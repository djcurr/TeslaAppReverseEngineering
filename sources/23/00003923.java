package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.j;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f16771a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.e f16772a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16773b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16774c;

        a(j.e eVar, String str, int i11) {
            this.f16772a = eVar;
            this.f16773b = str;
            this.f16774c = i11;
        }
    }

    private static PendingIntent a(Context context, j0 j0Var, String str, PackageManager packageManager) {
        Intent f11 = f(str, j0Var, packageManager);
        if (f11 == null) {
            return null;
        }
        f11.addFlags(67108864);
        f11.putExtras(j0Var.y());
        if (q(j0Var)) {
            f11.putExtra("gcm.n.analytics_data", j0Var.x());
        }
        return PendingIntent.getActivity(context, g(), f11, l(1073741824));
    }

    private static PendingIntent b(Context context, j0 j0Var) {
        if (q(j0Var)) {
            return c(context, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(j0Var.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), l(1073741824));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a d(Context context, j0 j0Var) {
        Bundle j11 = j(context.getPackageManager(), context.getPackageName());
        return e(context, context.getPackageName(), j0Var, k(context, j0Var.k(), j11), context.getResources(), context.getPackageManager(), j11);
    }

    public static a e(Context context, String str, j0 j0Var, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        j.e eVar = new j.e(context, str2);
        String n11 = j0Var.n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(n11)) {
            eVar.m(n11);
        }
        String n12 = j0Var.n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(n12)) {
            eVar.l(n12);
            eVar.C(new j.c().h(n12));
        }
        eVar.A(m(packageManager, resources, str, j0Var.p("gcm.n.icon"), bundle));
        Uri n13 = n(str, j0Var, resources);
        if (n13 != null) {
            eVar.B(n13);
        }
        eVar.k(a(context, j0Var, str, packageManager));
        PendingIntent b11 = b(context, j0Var);
        if (b11 != null) {
            eVar.o(b11);
        }
        Integer h11 = h(context, j0Var.p("gcm.n.color"), bundle);
        if (h11 != null) {
            eVar.i(h11.intValue());
        }
        eVar.f(!j0Var.a("gcm.n.sticky"));
        eVar.t(j0Var.a("gcm.n.local_only"));
        String p11 = j0Var.p("gcm.n.ticker");
        if (p11 != null) {
            eVar.D(p11);
        }
        Integer m11 = j0Var.m();
        if (m11 != null) {
            eVar.x(m11.intValue());
        }
        Integer r11 = j0Var.r();
        if (r11 != null) {
            eVar.F(r11.intValue());
        }
        Integer l11 = j0Var.l();
        if (l11 != null) {
            eVar.u(l11.intValue());
        }
        Long j11 = j0Var.j("gcm.n.event_time");
        if (j11 != null) {
            eVar.z(true);
            eVar.G(j11.longValue());
        }
        long[] q11 = j0Var.q();
        if (q11 != null) {
            eVar.E(q11);
        }
        int[] e11 = j0Var.e();
        if (e11 != null) {
            eVar.s(e11[0], e11[1], e11[2]);
        }
        eVar.n(i(j0Var));
        return new a(eVar, o(j0Var), 0);
    }

    private static Intent f(String str, j0 j0Var, PackageManager packageManager) {
        String p11 = j0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p11)) {
            Intent intent = new Intent(p11);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f11 = j0Var.f();
        if (f11 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f11);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f16771a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i11 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i11 != 0) {
            try {
                return Integer.valueOf(androidx.core.content.b.getColor(context, i11));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int i(j0 j0Var) {
        boolean a11 = j0Var.a("gcm.n.default_sound");
        ?? r02 = a11;
        if (j0Var.a("gcm.n.default_vibrate_timings")) {
            r02 = (a11 ? 1 : 0) | true;
        }
        return j0Var.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e11) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e11);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string2)) {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i11) {
        return Build.VERSION.SDK_INT >= 23 ? i11 | 67108864 : i11;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i11 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i11 == 0 || !p(resources, i11)) {
            try {
                i11 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e11) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e11);
            }
        }
        if (i11 == 0 || !p(resources, i11)) {
            return 17301651;
        }
        return i11;
    }

    private static Uri n(String str, j0 j0Var, Resources resources) {
        String o11 = j0Var.o();
        if (TextUtils.isEmpty(o11)) {
            return null;
        }
        if (!"default".equals(o11) && resources.getIdentifier(o11, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + o11);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static String o(j0 j0Var) {
        String p11 = j0Var.p("gcm.n.tag");
        if (TextUtils.isEmpty(p11)) {
            return "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return p11;
    }

    private static boolean p(Resources resources, int i11) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i11, null) instanceof AdaptiveIconDrawable) {
                Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i11);
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i11 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(j0 j0Var) {
        return j0Var.a("google.c.a.e");
    }
}