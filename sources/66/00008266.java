package l5;

import android.content.Context;
import androidx.work.a0;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import k5.q;

/* loaded from: classes.dex */
public class n implements androidx.work.j {

    /* renamed from: a  reason: collision with root package name */
    private final m5.a f36633a;

    /* renamed from: b  reason: collision with root package name */
    final j5.a f36634b;

    /* renamed from: c  reason: collision with root package name */
    final q f36635c;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36636a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UUID f36637b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.work.i f36638c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f36639d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, androidx.work.i iVar, Context context) {
            this.f36636a = cVar;
            this.f36637b = uuid;
            this.f36638c = iVar;
            this.f36639d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f36636a.isCancelled()) {
                    String uuid = this.f36637b.toString();
                    a0.a f11 = n.this.f36635c.f(uuid);
                    if (f11 != null && !f11.isFinished()) {
                        n.this.f36634b.b(uuid, this.f36638c);
                        this.f36639d.startService(androidx.work.impl.foreground.a.a(this.f36639d, uuid, this.f36638c));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f36636a.p(null);
            } catch (Throwable th2) {
                this.f36636a.q(th2);
            }
        }
    }

    static {
        androidx.work.q.f("WMFgUpdater");
    }

    public n(WorkDatabase workDatabase, j5.a aVar, m5.a aVar2) {
        this.f36634b = aVar;
        this.f36633a = aVar2;
        this.f36635c = workDatabase.l();
    }

    @Override // androidx.work.j
    public com.google.common.util.concurrent.c<Void> a(Context context, UUID uuid, androidx.work.i iVar) {
        androidx.work.impl.utils.futures.c t11 = androidx.work.impl.utils.futures.c.t();
        this.f36633a.b(new a(t11, uuid, iVar, context));
        return t11;
    }
}