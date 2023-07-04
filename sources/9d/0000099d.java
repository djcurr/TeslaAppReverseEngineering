package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: a  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f6468a;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f6468a.p(Worker.this.a());
            } catch (Throwable th2) {
                Worker.this.f6468a.q(th2);
            }
        }
    }

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a a();

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.c<ListenableWorker.a> startWork() {
        this.f6468a = androidx.work.impl.utils.futures.c.t();
        getBackgroundExecutor().execute(new a());
        return this.f6468a;
    }
}