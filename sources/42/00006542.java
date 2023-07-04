package d5;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.q;
import java.util.List;
import k5.p;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f23627a = q.f("Schedulers");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            f5.b bVar = new f5.b(context, iVar);
            l5.d.a(context, SystemJobService.class, true);
            q.c().a(f23627a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        e c11 = c(context);
        if (c11 == null) {
            androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
            l5.d.a(context, SystemAlarmService.class, true);
            q.c().a(f23627a, "Created SystemAlarmScheduler", new Throwable[0]);
            return fVar;
        }
        return c11;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        k5.q l11 = workDatabase.l();
        workDatabase.beginTransaction();
        try {
            List<p> m11 = l11.m(bVar.h());
            List<p> i11 = l11.i(200);
            if (m11 != null && m11.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (p pVar : m11) {
                    l11.k(pVar.f34405a, currentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            if (m11 != null && m11.size() > 0) {
                p[] pVarArr = (p[]) m11.toArray(new p[m11.size()]);
                for (e eVar : list) {
                    if (eVar.d()) {
                        eVar.c(pVarArr);
                    }
                }
            }
            if (i11 == null || i11.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) i11.toArray(new p[i11.size()]);
            for (e eVar2 : list) {
                if (!eVar2.d()) {
                    eVar2.c(pVarArr2);
                }
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    private static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            q.c().a(f23627a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th2) {
            q.c().a(f23627a, "Unable to create GCM Scheduler", th2);
            return null;
        }
    }
}