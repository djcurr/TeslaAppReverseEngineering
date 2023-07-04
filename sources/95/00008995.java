package n4;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import v3.i;

/* loaded from: classes.dex */
public abstract class a<D> extends c<D> {

    /* renamed from: j  reason: collision with root package name */
    private final Executor f40448j;

    /* renamed from: k  reason: collision with root package name */
    volatile a<D>.RunnableC0791a f40449k;

    /* renamed from: l  reason: collision with root package name */
    volatile a<D>.RunnableC0791a f40450l;

    /* renamed from: m  reason: collision with root package name */
    long f40451m;

    /* renamed from: n  reason: collision with root package name */
    long f40452n;

    /* renamed from: o  reason: collision with root package name */
    Handler f40453o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0791a extends d<Void, Void, D> implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private final CountDownLatch f40454j = new CountDownLatch(1);

        /* renamed from: k  reason: collision with root package name */
        boolean f40455k;

        RunnableC0791a() {
        }

        @Override // n4.d
        protected void h(D d11) {
            try {
                a.this.A(this, d11);
            } finally {
                this.f40454j.countDown();
            }
        }

        @Override // n4.d
        protected void i(D d11) {
            try {
                a.this.B(this, d11);
            } finally {
                this.f40454j.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n4.d
        /* renamed from: n */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.G();
            } catch (OperationCanceledException e11) {
                if (f()) {
                    return null;
                }
                throw e11;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40455k = false;
            a.this.C();
        }
    }

    public a(Context context) {
        this(context, d.f40477h);
    }

    void A(a<D>.RunnableC0791a runnableC0791a, D d11) {
        F(d11);
        if (this.f40450l == runnableC0791a) {
            u();
            this.f40452n = SystemClock.uptimeMillis();
            this.f40450l = null;
            e();
            C();
        }
    }

    void B(a<D>.RunnableC0791a runnableC0791a, D d11) {
        if (this.f40449k != runnableC0791a) {
            A(runnableC0791a, d11);
        } else if (j()) {
            F(d11);
        } else {
            c();
            this.f40452n = SystemClock.uptimeMillis();
            this.f40449k = null;
            f(d11);
        }
    }

    void C() {
        if (this.f40450l != null || this.f40449k == null) {
            return;
        }
        if (this.f40449k.f40455k) {
            this.f40449k.f40455k = false;
            this.f40453o.removeCallbacks(this.f40449k);
        }
        if (this.f40451m > 0 && SystemClock.uptimeMillis() < this.f40452n + this.f40451m) {
            this.f40449k.f40455k = true;
            this.f40453o.postAtTime(this.f40449k, this.f40452n + this.f40451m);
            return;
        }
        this.f40449k.c(this.f40448j, null);
    }

    public boolean D() {
        return this.f40450l != null;
    }

    public abstract D E();

    public abstract void F(D d11);

    protected D G() {
        return E();
    }

    @Override // n4.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f40449k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f40449k);
            printWriter.print(" waiting=");
            printWriter.println(this.f40449k.f40455k);
        }
        if (this.f40450l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f40450l);
            printWriter.print(" waiting=");
            printWriter.println(this.f40450l.f40455k);
        }
        if (this.f40451m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            i.c(this.f40451m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            i.b(this.f40452n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // n4.c
    protected boolean n() {
        if (this.f40449k != null) {
            if (!this.f40469e) {
                this.f40472h = true;
            }
            if (this.f40450l != null) {
                if (this.f40449k.f40455k) {
                    this.f40449k.f40455k = false;
                    this.f40453o.removeCallbacks(this.f40449k);
                }
                this.f40449k = null;
                return false;
            } else if (this.f40449k.f40455k) {
                this.f40449k.f40455k = false;
                this.f40453o.removeCallbacks(this.f40449k);
                this.f40449k = null;
                return false;
            } else {
                boolean a11 = this.f40449k.a(false);
                if (a11) {
                    this.f40450l = this.f40449k;
                    z();
                }
                this.f40449k = null;
                return a11;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n4.c
    public void p() {
        super.p();
        b();
        this.f40449k = new RunnableC0791a();
        C();
    }

    public void z() {
    }

    private a(Context context, Executor executor) {
        super(context);
        this.f40452n = -10000L;
        this.f40448j = executor;
    }
}