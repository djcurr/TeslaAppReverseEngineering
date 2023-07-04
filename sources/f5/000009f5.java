package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import d5.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k5.g;
import k5.h;
import k5.k;
import k5.p;
import k5.t;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: b  reason: collision with root package name */
    private static final String f6688b = q.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String c(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f34405a, pVar.f34407c, num, pVar.f34406b.name(), str, str2);
    }

    private static String d(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (p pVar : list) {
            Integer num = null;
            g a11 = hVar.a(pVar.f34405a);
            if (a11 != null) {
                num = Integer.valueOf(a11.f34389b);
            }
            sb2.append(c(pVar, TextUtils.join(",", kVar.a(pVar.f34405a)), num, TextUtils.join(",", tVar.a(pVar.f34405a))));
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a a() {
        WorkDatabase v11 = i.r(getApplicationContext()).v();
        k5.q l11 = v11.l();
        k j11 = v11.j();
        t m11 = v11.m();
        h i11 = v11.i();
        List<p> c11 = l11.c(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<p> o11 = l11.o();
        List<p> i12 = l11.i(200);
        if (c11 != null && !c11.isEmpty()) {
            q c12 = q.c();
            String str = f6688b;
            c12.d(str, "Recently completed work:\n\n", new Throwable[0]);
            q.c().d(str, d(j11, m11, i11, c11), new Throwable[0]);
        }
        if (o11 != null && !o11.isEmpty()) {
            q c13 = q.c();
            String str2 = f6688b;
            c13.d(str2, "Running work:\n\n", new Throwable[0]);
            q.c().d(str2, d(j11, m11, i11, o11), new Throwable[0]);
        }
        if (i12 != null && !i12.isEmpty()) {
            q c14 = q.c();
            String str3 = f6688b;
            c14.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            q.c().d(str3, d(j11, m11, i11, i12), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}