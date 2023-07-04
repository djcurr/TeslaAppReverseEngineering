package r3;

import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f49113a;

    /* renamed from: b  reason: collision with root package name */
    private a f49114b;

    /* renamed from: c  reason: collision with root package name */
    private Object f49115c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f49116d;

    /* loaded from: classes.dex */
    public interface a {
        void onCancel();
    }

    private void f() {
        while (this.f49116d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f49113a) {
                return;
            }
            this.f49113a = true;
            this.f49116d = true;
            a aVar = this.f49114b;
            Object obj = this.f49115c;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f49116d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f49116d = false;
                notifyAll();
            }
        }
    }

    public Object b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f49115c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f49115c = cancellationSignal;
                if (this.f49113a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f49115c;
        }
        return obj;
    }

    public boolean c() {
        boolean z11;
        synchronized (this) {
            z11 = this.f49113a;
        }
        return z11;
    }

    public void d(a aVar) {
        synchronized (this) {
            f();
            if (this.f49114b == aVar) {
                return;
            }
            this.f49114b = aVar;
            if (this.f49113a && aVar != null) {
                aVar.onCancel();
            }
        }
    }

    public void e() {
        if (c()) {
            throw new OperationCanceledException();
        }
    }
}