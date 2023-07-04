package f5;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.c;
import androidx.work.d;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.q;
import androidx.work.r;
import k5.p;

/* loaded from: classes.dex */
class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25817b = q.f("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    private final ComponentName f25818a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0510a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25819a;

        static {
            int[] iArr = new int[r.values().length];
            f25819a = iArr;
            try {
                iArr[r.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25819a[r.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25819a[r.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25819a[r.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25819a[r.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f25818a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(r rVar) {
        int i11 = C0510a.f25819a[rVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5 && Build.VERSION.SDK_INT >= 26) {
                            return 4;
                        }
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        return 3;
                    }
                    q.c().a(f25817b, String.format("API version too low. Cannot convert network type value %s", rVar), new Throwable[0]);
                    return 1;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    static void d(JobInfo.Builder builder, r rVar) {
        if (Build.VERSION.SDK_INT >= 30 && rVar == r.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(c(rVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JobInfo a(p pVar, int i11) {
        c cVar = pVar.f34414j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f34405a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i11, this.f25818a).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        d(extras, cVar.b());
        if (!cVar.h()) {
            extras.setBackoffCriteria(pVar.f34417m, pVar.f34416l == androidx.work.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f34421q) {
            extras.setImportantWhileForeground(true);
        }
        if (i12 >= 24 && cVar.e()) {
            for (d.a aVar : cVar.a().b()) {
                extras.addTriggerContentUri(b(aVar));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        boolean z11 = pVar.f34415k > 0;
        boolean z12 = max > 0;
        if (r3.a.c() && pVar.f34421q && !z11 && !z12) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}