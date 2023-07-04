package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import d5.i;
import k5.g;
import k5.h;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f6576a = q.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h i11 = iVar.v().i();
        g a11 = i11.a(str);
        if (a11 != null) {
            b(context, str, a11.f34389b);
            q.c().a(f6576a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            i11.d(str);
        }
    }

    private static void b(Context context, String str, int i11) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i11, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : PKIFailureInfo.duplicateCertReq);
        if (service == null || alarmManager == null) {
            return;
        }
        q.c().a(f6576a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i11)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j11) {
        WorkDatabase v11 = iVar.v();
        h i11 = v11.i();
        g a11 = i11.a(str);
        if (a11 != null) {
            b(context, str, a11.f34389b);
            d(context, str, a11.f34389b, j11);
            return;
        }
        int b11 = new l5.c(v11).b();
        i11.b(new g(str, b11));
        d(context, str, b11, j11);
    }

    private static void d(Context context, String str, int i11, long j11) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i12 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i11, b.b(context, str), i12 >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            if (i12 >= 19) {
                alarmManager.setExact(0, j11, service);
            } else {
                alarmManager.set(0, j11, service);
            }
        }
    }
}