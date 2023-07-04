package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.q;
import k5.p;

/* loaded from: classes.dex */
public class f implements d5.e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f6612b = q.f("SystemAlarmScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f6613a;

    public f(Context context) {
        this.f6613a = context.getApplicationContext();
    }

    private void b(p pVar) {
        q.c().a(f6612b, String.format("Scheduling work with workSpecId %s", pVar.f34405a), new Throwable[0]);
        this.f6613a.startService(b.f(this.f6613a, pVar.f34405a));
    }

    @Override // d5.e
    public void a(String str) {
        this.f6613a.startService(b.g(this.f6613a, str));
    }

    @Override // d5.e
    public void c(p... pVarArr) {
        for (p pVar : pVarArr) {
            b(pVar);
        }
    }

    @Override // d5.e
    public boolean d() {
        return true;
    }
}