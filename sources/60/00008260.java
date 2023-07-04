package l5;

import androidx.work.a0;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;

/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f36616d = q.f("StopWorkRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final d5.i f36617a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36618b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36619c;

    public j(d5.i iVar, String str, boolean z11) {
        this.f36617a = iVar;
        this.f36618b = str;
        this.f36619c = z11;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o11;
        WorkDatabase v11 = this.f36617a.v();
        d5.d t11 = this.f36617a.t();
        k5.q l11 = v11.l();
        v11.beginTransaction();
        try {
            boolean h11 = t11.h(this.f36618b);
            if (this.f36619c) {
                o11 = this.f36617a.t().n(this.f36618b);
            } else {
                if (!h11 && l11.f(this.f36618b) == a0.a.RUNNING) {
                    l11.b(a0.a.ENQUEUED, this.f36618b);
                }
                o11 = this.f36617a.t().o(this.f36618b);
            }
            q.c().a(f36616d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f36618b, Boolean.valueOf(o11)), new Throwable[0]);
            v11.setTransactionSuccessful();
        } finally {
            v11.endTransaction();
        }
    }
}