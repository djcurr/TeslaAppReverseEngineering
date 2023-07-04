package androidx.work.rxjava3;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.c;
import hy.l;
import hy.m;
import hy.o;
import iy.b;
import java.util.concurrent.Executor;
import l5.k;

/* loaded from: classes.dex */
public abstract class RxWorker extends ListenableWorker {

    /* renamed from: b  reason: collision with root package name */
    static final Executor f6699b = new k();

    /* renamed from: a  reason: collision with root package name */
    private a<ListenableWorker.a> f6700a;

    /* loaded from: classes.dex */
    static class a<T> implements o<T>, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final c<T> f6701a;

        /* renamed from: b  reason: collision with root package name */
        private b f6702b;

        a() {
            c<T> t11 = c.t();
            this.f6701a = t11;
            t11.a(this, RxWorker.f6699b);
        }

        @Override // hy.o
        public void a(b bVar) {
            this.f6702b = bVar;
        }

        void b() {
            b bVar = this.f6702b;
            if (bVar != null) {
                bVar.dispose();
            }
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            this.f6701a.q(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            this.f6701a.p(t11);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6701a.isCancelled()) {
                b();
            }
        }
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract m<ListenableWorker.a> a();

    protected l c() {
        return bz.a.b(getBackgroundExecutor(), true, true);
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        a<ListenableWorker.a> aVar = this.f6700a;
        if (aVar != null) {
            aVar.b();
            this.f6700a = null;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.c<ListenableWorker.a> startWork() {
        this.f6700a = new a<>();
        a().w(c()).p(bz.a.b(getTaskExecutor().c(), true, true)).a(this.f6700a);
        return this.f6700a.f6701a;
    }
}