package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import d5.i;
import g5.c;
import g5.d;
import java.util.Collections;
import java.util.List;
import k5.p;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: f  reason: collision with root package name */
    private static final String f6679f = q.f("ConstraintTrkngWrkr");

    /* renamed from: a  reason: collision with root package name */
    private WorkerParameters f6680a;

    /* renamed from: b  reason: collision with root package name */
    final Object f6681b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f6682c;

    /* renamed from: d  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f6683d;

    /* renamed from: e  reason: collision with root package name */
    private ListenableWorker f6684e;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.c f6686a;

        b(com.google.common.util.concurrent.c cVar) {
            this.f6686a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f6681b) {
                if (ConstraintTrackingWorker.this.f6682c) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f6683d.r(this.f6686a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f6680a = workerParameters;
        this.f6681b = new Object();
        this.f6682c = false;
        this.f6683d = androidx.work.impl.utils.futures.c.t();
    }

    public WorkDatabase a() {
        return i.r(getApplicationContext()).v();
    }

    @Override // g5.c
    public void b(List<String> list) {
        q.c().a(f6679f, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f6681b) {
            this.f6682c = true;
        }
    }

    void c() {
        this.f6683d.p(ListenableWorker.a.a());
    }

    void d() {
        this.f6683d.p(ListenableWorker.a.b());
    }

    void e() {
        String k11 = getInputData().k("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(k11)) {
            q.c().b(f6679f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b11 = getWorkerFactory().b(getApplicationContext(), k11, this.f6680a);
        this.f6684e = b11;
        if (b11 == null) {
            q.c().a(f6679f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p g11 = a().l().g(getId().toString());
        if (g11 == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(g11));
        if (dVar.c(getId().toString())) {
            q.c().a(f6679f, String.format("Constraints met for delegate %s", k11), new Throwable[0]);
            try {
                com.google.common.util.concurrent.c<ListenableWorker.a> startWork = this.f6684e.startWork();
                startWork.a(new b(startWork), getBackgroundExecutor());
                return;
            } catch (Throwable th2) {
                q c11 = q.c();
                String str = f6679f;
                c11.a(str, String.format("Delegated worker %s threw exception in startWork.", k11), th2);
                synchronized (this.f6681b) {
                    if (this.f6682c) {
                        q.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                    return;
                }
            }
        }
        q.c().a(f6679f, String.format("Constraints not met for delegate %s. Requesting retry.", k11), new Throwable[0]);
        d();
    }

    @Override // g5.c
    public void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public m5.a getTaskExecutor() {
        return i.r(getApplicationContext()).w();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f6684e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f6684e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f6684e.stop();
    }

    @Override // androidx.work.ListenableWorker
    public com.google.common.util.concurrent.c<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f6683d;
    }
}