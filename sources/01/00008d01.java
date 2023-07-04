package nu;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import androidx.core.app.j;
import androidx.core.app.m;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes6.dex */
public class j implements dt.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.tesla.logging.g f41883a = com.tesla.logging.g.g("TeslaNotification");

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f41884b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f41885c;

    public j(Bundle bundle, Context context) {
        this.f41884b = bundle;
        this.f41885c = context.getApplicationContext();
    }

    public static void b(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        Resources resources = context.getResources();
        NotificationChannel notificationChannel = new NotificationChannel("default_channel", resources.getString(f.f41876b), 4);
        notificationChannel.setDescription(resources.getString(f.f41875a));
        notificationChannel.setLockscreenVisibility(1);
        NotificationChannel notificationChannel2 = new NotificationChannel("phone_key_service_channel", resources.getString(f.f41878d), 2);
        notificationChannel2.setDescription(resources.getString(f.f41877c));
        j(context).d(Arrays.asList(notificationChannel, notificationChannel2));
    }

    public static j.e e(Context context) {
        return new j.e(context, "default_channel").A(ow.b.b()).i(h()).h("default_channel").G(System.currentTimeMillis()).z(true).f(true);
    }

    private static int h() {
        return Color.parseColor("#CC0000");
    }

    private static m j(Context context) {
        return m.e(context);
    }

    public static void n(Context context, String str, String str2, PendingIntent pendingIntent, int i11) {
        j(context).g(i11, e(context).m(str).l(str2).k(pendingIntent).w(true).b());
    }

    @Override // dt.a
    public dt.b a(Context context, Bundle bundle, PendingIntent pendingIntent) {
        return new j(bundle, context).g(pendingIntent);
    }

    public String c() {
        if (this.f41884b.containsKey("actions")) {
            return this.f41884b.getString("actions");
        }
        return null;
    }

    public long d() {
        String string = this.f41884b.getString("alert_time");
        return string != null ? Long.parseLong(string) * 1000 : System.currentTimeMillis();
    }

    public String f() {
        return this.f41884b.getString("override_string");
    }

    public dt.b g(PendingIntent pendingIntent) {
        int c11 = k00.c.f34202a.c();
        j jVar = new j(this.f41884b, this.f41885c);
        j.e e11 = e(this.f41885c);
        String m11 = jVar.m();
        String f11 = jVar.f();
        jVar.i();
        String c12 = jVar.c();
        e11.x(k()).m(m11).k(pendingIntent).l(f11).G(jVar.d()).C(new j.c().h(f11));
        String l11 = l();
        if (l11 == null) {
            this.f41883a.d("product id was null, cannot process actions", new Throwable("product id was null, cannot process actions"));
        } else if (c12 != null && !c12.isEmpty()) {
            try {
                List<ut.a> c13 = ut.b.f53661b.decode(Base64.decode(c12, 0)).c();
                b a11 = b.a();
                boolean z11 = c13.size() > 1;
                for (ut.a aVar : c13) {
                    a b11 = a11.b(aVar);
                    if (b11 != null) {
                        c a12 = b11.a(z11);
                        e11.a(a12.a(), this.f41885c.getString(a12.b()), b11.c(this.f41885c, c11, l11));
                    }
                }
            } catch (IOException e12) {
                this.f41883a.d("Exception thrown decoding actions proto base64", e12);
            }
        }
        return new dt.b(c11, e11.b());
    }

    public String i() {
        return this.f41884b.getString("alert_id");
    }

    public int k() {
        String string = this.f41884b.getString("priority");
        return (string == null || !string.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH)) ? 0 : 1;
    }

    public String l() {
        return this.f41884b.getString("product_id_s");
    }

    public String m() {
        String string = this.f41884b.getString("alert_args");
        if (string != null) {
            try {
                return new JSONArray(string).getString(0);
            } catch (JSONException e11) {
                this.f41883a.d("Failed to parse notification args", e11);
                return null;
            }
        }
        return null;
    }
}