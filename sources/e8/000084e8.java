package lw;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.teslamotors.TeslaApp.MainActivity;
import com.wix.reactnativenotifications.core.ProxyService;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import zu.q;

/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final com.tesla.logging.g f37759a = com.tesla.logging.g.g(f.class.getSimpleName());

    public static boolean a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return false;
        }
        boolean z11 = intent.hasExtra("pushNotification") || extras.getString("google.message_id", null) != null;
        if (q.a()) {
            return (intent.getDataString() == null && intent.getStringExtra("JMessageExtra") == null && !z11) ? false : true;
        }
        return z11;
    }

    public static PendingIntent b(Context context, com.wix.reactnativenotifications.core.notification.c cVar) {
        Intent launchIntentForPackage;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                int i11 = MainActivity.f22063d;
                launchIntentForPackage = new Intent(context, MainActivity.class);
            } catch (ClassNotFoundException e11) {
                e11.printStackTrace();
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            }
            launchIntentForPackage.putExtra("pushNotification", cVar.a());
            return PendingIntent.getActivity(context, (int) System.currentTimeMillis(), launchIntentForPackage, 1140850688);
        }
        Intent intent = new Intent(context, ProxyService.class);
        intent.putExtra("pushNotification", cVar.a());
        return PendingIntent.getService(context, (int) System.currentTimeMillis(), intent, 1073741824);
    }

    public static Bundle c(Intent intent) {
        Bundle d11 = intent.hasExtra("pushNotification") ? d(intent) : intent.getExtras();
        if (q.a()) {
            String stringExtra = intent.getStringExtra("JMessageExtra");
            if (stringExtra == null) {
                stringExtra = intent.getDataString();
            }
            if (stringExtra != null) {
                try {
                    e(d11, new JSONObject(stringExtra).getJSONObject("n_extras"));
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    f37759a.d("[JPUSH] Failed to parse JPush Notification Json", e11);
                }
            }
        }
        return d11;
    }

    public static Bundle d(Intent intent) {
        return intent.getBundleExtra("pushNotification");
    }

    public static void e(Bundle bundle, JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException e11) {
                f37759a.d("[JPUSH] Failed to parse Notification Json", e11);
            }
        }
    }
}