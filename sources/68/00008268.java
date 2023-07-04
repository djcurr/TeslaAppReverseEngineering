package l5;

import android.content.Context;
import androidx.work.a0;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import androidx.work.w;
import java.util.UUID;

/* loaded from: classes.dex */
public class o implements w {

    /* renamed from: c  reason: collision with root package name */
    static final String f36641c = q.f("WorkProgressUpdater");

    /* renamed from: a  reason: collision with root package name */
    final WorkDatabase f36642a;

    /* renamed from: b  reason: collision with root package name */
    final m5.a f36643b;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UUID f36644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.work.e f36645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36646c;

        a(UUID uuid, androidx.work.e eVar, androidx.work.impl.utils.futures.c cVar) {
            this.f36644a = uuid;
            this.f36645b = eVar;
            this.f36646c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k5.p g11;
            String uuid = this.f36644a.toString();
            q c11 = q.c();
            String str = o.f36641c;
            c11.a(str, String.format("Updating progress for %s (%s)", this.f36644a, this.f36645b), new Throwable[0]);
            o.this.f36642a.beginTransaction();
            try {
                g11 = o.this.f36642a.l().g(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (g11 != null) {
                if (g11.f34406b == a0.a.RUNNING) {
                    o.this.f36642a.k().c(new k5.m(uuid, this.f36645b));
                } else {
                    q.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
                }
                this.f36646c.p(null);
                o.this.f36642a.setTransactionSuccessful();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public o(WorkDatabase workDatabase, m5.a aVar) {
        this.f36642a = workDatabase;
        this.f36643b = aVar;
    }

    @Override // androidx.work.w
    public com.google.common.util.concurrent.c<Void> a(Context context, UUID uuid, androidx.work.e eVar) {
        androidx.work.impl.utils.futures.c t11 = androidx.work.impl.utils.futures.c.t();
        this.f36643b.b(new a(uuid, eVar, t11));
        return t11;
    }
}