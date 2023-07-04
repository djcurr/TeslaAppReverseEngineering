package gy;

import android.os.Handler;
import android.os.Message;
import hy.l;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class c extends l {

    /* renamed from: c  reason: collision with root package name */
    private final Handler f28516c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f28517d;

    /* loaded from: classes5.dex */
    private static final class a extends l.c {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f28518a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f28519b;

        /* renamed from: c  reason: collision with root package name */
        private volatile boolean f28520c;

        a(Handler handler, boolean z11) {
            this.f28518a = handler;
            this.f28519b = z11;
        }

        @Override // hy.l.c
        public iy.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f28520c) {
                return iy.b.d();
            }
            b bVar = new b(this.f28518a, az.a.t(runnable));
            Message obtain = Message.obtain(this.f28518a, bVar);
            obtain.obj = this;
            if (this.f28519b) {
                obtain.setAsynchronous(true);
            }
            this.f28518a.sendMessageDelayed(obtain, timeUnit.toMillis(j11));
            if (this.f28520c) {
                this.f28518a.removeCallbacks(bVar);
                return iy.b.d();
            }
            return bVar;
        }

        @Override // iy.b
        public void dispose() {
            this.f28520c = true;
            this.f28518a.removeCallbacksAndMessages(this);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f28520c;
        }
    }

    /* loaded from: classes5.dex */
    private static final class b implements Runnable, iy.b {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f28521a;

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f28522b;

        /* renamed from: c  reason: collision with root package name */
        private volatile boolean f28523c;

        b(Handler handler, Runnable runnable) {
            this.f28521a = handler;
            this.f28522b = runnable;
        }

        @Override // iy.b
        public void dispose() {
            this.f28521a.removeCallbacks(this);
            this.f28523c = true;
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f28523c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28522b.run();
            } catch (Throwable th2) {
                az.a.r(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Handler handler, boolean z11) {
        this.f28516c = handler;
        this.f28517d = z11;
    }

    @Override // hy.l
    public l.c c() {
        return new a(this.f28516c, this.f28517d);
    }

    @Override // hy.l
    public iy.b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        b bVar = new b(this.f28516c, az.a.t(runnable));
        Message obtain = Message.obtain(this.f28516c, bVar);
        if (this.f28517d) {
            obtain.setAsynchronous(true);
        }
        this.f28516c.sendMessageDelayed(obtain, timeUnit.toMillis(j11));
        return bVar;
    }
}