package l5;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.q;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    static final String f36622g = q.f("WorkForegroundRunnable");

    /* renamed from: a  reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f36623a = androidx.work.impl.utils.futures.c.t();

    /* renamed from: b  reason: collision with root package name */
    final Context f36624b;

    /* renamed from: c  reason: collision with root package name */
    final k5.p f36625c;

    /* renamed from: d  reason: collision with root package name */
    final ListenableWorker f36626d;

    /* renamed from: e  reason: collision with root package name */
    final androidx.work.j f36627e;

    /* renamed from: f  reason: collision with root package name */
    final m5.a f36628f;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36629a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f36629a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36629a.r(m.this.f36626d.getForegroundInfoAsync());
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36631a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f36631a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.i iVar = (androidx.work.i) this.f36631a.get();
                if (iVar != null) {
                    q.c().a(m.f36622g, String.format("Updating notification for %s", m.this.f36625c.f34407c), new Throwable[0]);
                    m.this.f36626d.setRunInForeground(true);
                    m mVar = m.this;
                    mVar.f36623a.r(mVar.f36627e.a(mVar.f36624b, mVar.f36626d.getId(), iVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", m.this.f36625c.f34407c));
            } catch (Throwable th2) {
                m.this.f36623a.q(th2);
            }
        }
    }

    public m(Context context, k5.p pVar, ListenableWorker listenableWorker, androidx.work.j jVar, m5.a aVar) {
        this.f36624b = context;
        this.f36625c = pVar;
        this.f36626d = listenableWorker;
        this.f36627e = jVar;
        this.f36628f = aVar;
    }

    public com.google.common.util.concurrent.c<Void> a() {
        return this.f36623a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f36625c.f34421q && !r3.a.c()) {
            androidx.work.impl.utils.futures.c t11 = androidx.work.impl.utils.futures.c.t();
            this.f36628f.a().execute(new a(t11));
            t11.a(new b(t11), this.f36628f.a());
            return;
        }
        this.f36623a.p(null);
    }
}