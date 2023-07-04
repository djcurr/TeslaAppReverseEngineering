package mw;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes6.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f39470a;

    /* renamed from: b  reason: collision with root package name */
    protected final d f39471b;

    protected c(Context context, Bundle bundle) {
        this.f39470a = context;
        this.f39471b = b(bundle);
    }

    private long[] c(List list) {
        if (list == null) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11) instanceof Number) {
                jArr[i11] = ((Number) list.get(i11)).longValue();
            }
        }
        return jArr;
    }

    public static a d(Context context, Bundle bundle) {
        return new c(context, bundle);
    }

    private int e(String str, String str2) {
        return this.f39470a.getResources().getIdentifier(str2, str, this.f39470a.getPackageName());
    }

    private Uri f(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("://")) {
            return Uri.parse(str);
        }
        if (str.equalsIgnoreCase("default")) {
            return RingtoneManager.getDefaultUri(2);
        }
        int e11 = e("raw", str);
        if (e11 == 0) {
            e11 = e("raw", str.substring(0, str.lastIndexOf(46)));
        }
        return Uri.parse("android.resource://" + this.f39470a.getPackageName() + "/" + e11);
    }

    @Override // mw.a
    public void a() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.f39471b.a(), this.f39471b.h(), this.f39471b.f());
        if (this.f39471b.l()) {
            notificationChannel.setDescription(this.f39471b.b());
        }
        if (this.f39471b.m()) {
            notificationChannel.enableLights(this.f39471b.c());
        }
        if (this.f39471b.n()) {
            notificationChannel.enableVibration(this.f39471b.d());
        }
        if (this.f39471b.o()) {
            notificationChannel.setGroup(this.f39471b.e());
        }
        if (this.f39471b.p()) {
            notificationChannel.setLightColor(Color.parseColor(this.f39471b.g()));
        }
        if (this.f39471b.q()) {
            notificationChannel.setShowBadge(this.f39471b.i());
        }
        if (this.f39471b.r()) {
            notificationChannel.setSound(f(this.f39471b.j()), null);
        }
        if (this.f39471b.s()) {
            notificationChannel.setVibrationPattern(c(this.f39471b.k()));
        }
        ((NotificationManager) this.f39470a.getSystemService("notification")).createNotificationChannel(notificationChannel);
    }

    protected d b(Bundle bundle) {
        return new d(bundle);
    }
}