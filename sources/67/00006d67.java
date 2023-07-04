package f5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.a0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.q;
import androidx.work.u;
import d5.e;
import d5.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k5.g;
import k5.p;
import l5.c;

/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: e  reason: collision with root package name */
    private static final String f25820e = q.f("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f25821a;

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f25822b;

    /* renamed from: c  reason: collision with root package name */
    private final i f25823c;

    /* renamed from: d  reason: collision with root package name */
    private final a f25824d;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void b(Context context) {
        List<JobInfo> g11;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g11 = g(context, jobScheduler)) == null || g11.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : g11) {
            e(jobScheduler, jobInfo.getId());
        }
    }

    private static void e(JobScheduler jobScheduler, int i11) {
        try {
            jobScheduler.cancel(i11);
        } catch (Throwable th2) {
            q.c().b(f25820e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i11)), th2);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g11 = g(context, jobScheduler);
        if (g11 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g11) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            q.c().b(f25820e, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g11 = g(context, jobScheduler);
        List<String> c11 = iVar.v().i().c();
        boolean z11 = false;
        HashSet hashSet = new HashSet(g11 != null ? g11.size() : 0);
        if (g11 != null && !g11.isEmpty()) {
            for (JobInfo jobInfo : g11) {
                String h11 = h(jobInfo);
                if (!TextUtils.isEmpty(h11)) {
                    hashSet.add(h11);
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it2 = c11.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains(it2.next())) {
                    q.c().a(f25820e, "Reconciling jobs", new Throwable[0]);
                    z11 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z11) {
            WorkDatabase v11 = iVar.v();
            v11.beginTransaction();
            try {
                k5.q l11 = v11.l();
                for (String str : c11) {
                    l11.k(str, -1L);
                }
                v11.setTransactionSuccessful();
            } finally {
                v11.endTransaction();
            }
        }
        return z11;
    }

    @Override // d5.e
    public void a(String str) {
        List<Integer> f11 = f(this.f25821a, this.f25822b, str);
        if (f11 == null || f11.isEmpty()) {
            return;
        }
        for (Integer num : f11) {
            e(this.f25822b, num.intValue());
        }
        this.f25823c.v().i().d(str);
    }

    @Override // d5.e
    public void c(p... pVarArr) {
        int d11;
        List<Integer> f11;
        int d12;
        WorkDatabase v11 = this.f25823c.v();
        c cVar = new c(v11);
        for (p pVar : pVarArr) {
            v11.beginTransaction();
            try {
                p g11 = v11.l().g(pVar.f34405a);
                if (g11 == null) {
                    q.c().h(f25820e, "Skipping scheduling " + pVar.f34405a + " because it's no longer in the DB", new Throwable[0]);
                    v11.setTransactionSuccessful();
                } else if (g11.f34406b != a0.a.ENQUEUED) {
                    q.c().h(f25820e, "Skipping scheduling " + pVar.f34405a + " because it is no longer enqueued", new Throwable[0]);
                    v11.setTransactionSuccessful();
                } else {
                    g a11 = v11.i().a(pVar.f34405a);
                    if (a11 != null) {
                        d11 = a11.f34389b;
                    } else {
                        d11 = cVar.d(this.f25823c.p().i(), this.f25823c.p().g());
                    }
                    if (a11 == null) {
                        this.f25823c.v().i().b(new g(pVar.f34405a, d11));
                    }
                    j(pVar, d11);
                    if (Build.VERSION.SDK_INT == 23 && (f11 = f(this.f25821a, this.f25822b, pVar.f34405a)) != null) {
                        int indexOf = f11.indexOf(Integer.valueOf(d11));
                        if (indexOf >= 0) {
                            f11.remove(indexOf);
                        }
                        if (!f11.isEmpty()) {
                            d12 = f11.get(0).intValue();
                        } else {
                            d12 = cVar.d(this.f25823c.p().i(), this.f25823c.p().g());
                        }
                        j(pVar, d12);
                    }
                    v11.setTransactionSuccessful();
                }
                v11.endTransaction();
            } catch (Throwable th2) {
                v11.endTransaction();
                throw th2;
            }
        }
    }

    @Override // d5.e
    public boolean d() {
        return true;
    }

    public void j(p pVar, int i11) {
        JobInfo a11 = this.f25824d.a(pVar, i11);
        q c11 = q.c();
        String str = f25820e;
        c11.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f34405a, Integer.valueOf(i11)), new Throwable[0]);
        try {
            if (this.f25822b.schedule(a11) == 0) {
                q.c().h(str, String.format("Unable to schedule work ID %s", pVar.f34405a), new Throwable[0]);
                if (pVar.f34421q && pVar.f34422r == u.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f34421q = false;
                    q.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f34405a), new Throwable[0]);
                    j(pVar, i11);
                }
            }
        } catch (IllegalStateException e11) {
            List<JobInfo> g11 = g(this.f25821a, this.f25822b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g11 != null ? g11.size() : 0), Integer.valueOf(this.f25823c.v().l().d().size()), Integer.valueOf(this.f25823c.p().h()));
            q.c().b(f25820e, format, new Throwable[0]);
            throw new IllegalStateException(format, e11);
        } catch (Throwable th2) {
            q.c().b(f25820e, String.format("Unable to schedule %s", pVar), th2);
        }
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f25821a = context;
        this.f25823c = iVar;
        this.f25822b = jobScheduler;
        this.f25824d = aVar;
    }
}