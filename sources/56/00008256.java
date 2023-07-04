package l5;

import android.text.TextUtils;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.q;
import androidx.work.t;
import java.util.List;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final String f36597c = q.f("EnqueueRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final d5.g f36598a;

    /* renamed from: b  reason: collision with root package name */
    private final d5.c f36599b = new d5.c();

    public b(d5.g gVar) {
        this.f36598a = gVar;
    }

    private static boolean b(d5.g gVar) {
        boolean c11 = c(gVar.g(), gVar.f(), (String[]) d5.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c11;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e1 A[LOOP:5: B:125:0x01db->B:127:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(d5.i r19, java.util.List<? extends androidx.work.c0> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.h r23) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.c(d5.i, java.util.List, java.lang.String[], java.lang.String, androidx.work.h):boolean");
    }

    private static boolean e(d5.g gVar) {
        List<d5.g> e11 = gVar.e();
        boolean z11 = false;
        if (e11 != null) {
            boolean z12 = false;
            for (d5.g gVar2 : e11) {
                if (!gVar2.j()) {
                    z12 |= e(gVar2);
                } else {
                    q.c().h(f36597c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                }
            }
            z11 = z12;
        }
        return b(gVar) | z11;
    }

    private static void g(k5.p pVar) {
        androidx.work.c cVar = pVar.f34414j;
        String str = pVar.f34407c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (cVar.f() || cVar.i()) {
            e.a aVar = new e.a();
            aVar.c(pVar.f34409e).g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f34407c = ConstraintTrackingWorker.class.getName();
            pVar.f34409e = aVar.a();
        }
    }

    private static boolean h(d5.i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (d5.e eVar : iVar.u()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase v11 = this.f36598a.g().v();
        v11.beginTransaction();
        try {
            boolean e11 = e(this.f36598a);
            v11.setTransactionSuccessful();
            return e11;
        } finally {
            v11.endTransaction();
        }
    }

    public t d() {
        return this.f36599b;
    }

    public void f() {
        d5.i g11 = this.f36598a.g();
        d5.f.b(g11.p(), g11.v(), g11.u());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f36598a.h()) {
                if (a()) {
                    d.a(this.f36598a.g().o(), RescheduleReceiver.class, true);
                    f();
                }
                this.f36599b.a(t.f6703a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f36598a));
        } catch (Throwable th2) {
            this.f36599b.a(new t.b.a(th2));
        }
    }
}