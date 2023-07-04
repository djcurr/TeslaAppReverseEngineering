package v20;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class g<T> extends a<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Thread f53922c;

    /* renamed from: d  reason: collision with root package name */
    private final k1 f53923d;

    public g(zz.g gVar, Thread thread, k1 k1Var) {
        super(gVar, true, true);
        this.f53922c = thread;
        this.f53923d = k1Var;
    }

    public final T a1() {
        c.a();
        try {
            k1 k1Var = this.f53923d;
            if (k1Var != null) {
                k1.p1(k1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                k1 k1Var2 = this.f53923d;
                long y12 = k1Var2 == null ? Long.MAX_VALUE : k1Var2.y1();
                if (j0()) {
                    k1 k1Var3 = this.f53923d;
                    if (k1Var3 != null) {
                        k1.S0(k1Var3, false, 1, null);
                    }
                    c.a();
                    T t11 = (T) i2.h(d0());
                    c0 c0Var = t11 instanceof c0 ? (c0) t11 : null;
                    if (c0Var == null) {
                        return t11;
                    }
                    throw c0Var.f53902a;
                }
                c.a();
                LockSupport.parkNanos(this, y12);
            }
            InterruptedException interruptedException = new InterruptedException();
            E(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            c.a();
            throw th2;
        }
    }

    @Override // v20.h2
    protected boolean k0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v20.h2
    public void z(Object obj) {
        if (kotlin.jvm.internal.s.c(Thread.currentThread(), this.f53922c)) {
            return;
        }
        Thread thread = this.f53922c;
        c.a();
        LockSupport.unpark(thread);
    }
}