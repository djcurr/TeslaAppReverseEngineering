package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a0;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import androidx.work.q;
import d5.f;
import d5.h;
import d5.i;
import f5.b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k5.n;
import k5.p;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import r3.a;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f6646d = q.f("ForceStopRunnable");

    /* renamed from: e  reason: collision with root package name */
    private static final long f6647e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    private final Context f6648a;

    /* renamed from: b  reason: collision with root package name */
    private final i f6649b;

    /* renamed from: c  reason: collision with root package name */
    private int f6650c = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f6651a = q.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            q.c().g(f6651a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f6648a = context.getApplicationContext();
        this.f6649b = iVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i11) {
        return PendingIntent.getBroadcast(context, -1, c(context), i11);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d11 = d(context, a.c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f6647e;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, d11);
            } else {
                alarmManager.set(0, currentTimeMillis, d11);
            }
        }
    }

    public boolean a() {
        boolean i11 = Build.VERSION.SDK_INT >= 23 ? b.i(this.f6648a, this.f6649b) : false;
        WorkDatabase v11 = this.f6649b.v();
        k5.q l11 = v11.l();
        n k11 = v11.k();
        v11.beginTransaction();
        try {
            List<p> o11 = l11.o();
            boolean z11 = (o11 == null || o11.isEmpty()) ? false : true;
            if (z11) {
                for (p pVar : o11) {
                    l11.b(a0.a.ENQUEUED, pVar.f34405a);
                    l11.k(pVar.f34405a, -1L);
                }
            }
            k11.b();
            v11.setTransactionSuccessful();
            return z11 || i11;
        } finally {
            v11.endTransaction();
        }
    }

    public void b() {
        boolean a11 = a();
        if (h()) {
            q.c().a(f6646d, "Rescheduling Workers.", new Throwable[0]);
            this.f6649b.z();
            this.f6649b.s().c(false);
        } else if (e()) {
            q.c().a(f6646d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f6649b.z();
        } else if (a11) {
            q.c().a(f6646d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f6649b.p(), this.f6649b.v(), this.f6649b.u());
        }
    }

    public boolean e() {
        int i11 = PKIFailureInfo.duplicateCertReq;
        try {
            if (a.c()) {
                i11 = 570425344;
            }
            PendingIntent d11 = d(this.f6648a, i11);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d11 != null) {
                    d11.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f6648a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i12 = 0; i12 < historicalProcessExitReasons.size(); i12++) {
                        if (historicalProcessExitReasons.get(i12).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d11 == null) {
                g(this.f6648a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e11) {
            q.c().h(f6646d, "Ignoring exception", e11);
            return true;
        }
    }

    public boolean f() {
        androidx.work.b p11 = this.f6649b.p();
        if (TextUtils.isEmpty(p11.c())) {
            q.c().a(f6646d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b11 = l5.f.b(this.f6648a, p11);
        q.c().a(f6646d, String.format("Is default app process = %s", Boolean.valueOf(b11)), new Throwable[0]);
        return b11;
    }

    boolean h() {
        return this.f6649b.s().a();
    }

    public void i(long j11) {
        try {
            Thread.sleep(j11);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i11;
        try {
            if (f()) {
                while (true) {
                    h.e(this.f6648a);
                    q.c().a(f6646d, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e11) {
                        i11 = this.f6650c + 1;
                        this.f6650c = i11;
                        if (i11 >= 3) {
                            q c11 = q.c();
                            String str = f6646d;
                            c11.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e11);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e11);
                            k d11 = this.f6649b.p().d();
                            if (d11 != null) {
                                q.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                                d11.a(illegalStateException);
                            } else {
                                throw illegalStateException;
                            }
                        } else {
                            q.c().a(f6646d, String.format("Retrying after %s", Long.valueOf(i11 * 300)), e11);
                            i(this.f6650c * 300);
                        }
                    }
                    q.c().a(f6646d, String.format("Retrying after %s", Long.valueOf(i11 * 300)), e11);
                    i(this.f6650c * 300);
                }
            }
        } finally {
            this.f6649b.y();
        }
    }
}