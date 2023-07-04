package x20;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.f0;
import v20.r0;
import vz.b0;

/* loaded from: classes5.dex */
public class n<E> extends a<E> {

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantLock f57018d;

    /* renamed from: e  reason: collision with root package name */
    private Object f57019e;

    public n(h00.l<? super E, b0> lVar) {
        super(lVar);
        this.f57018d = new ReentrantLock();
        this.f57019e = b.f56988a;
    }

    private final UndeliveredElementException c0(Object obj) {
        h00.l<E, b0> lVar;
        Object obj2 = this.f57019e;
        UndeliveredElementException undeliveredElementException = null;
        if (obj2 != b.f56988a && (lVar = this.f56995a) != null) {
            undeliveredElementException = kotlinx.coroutines.internal.z.d(lVar, obj2, null, 2, null);
        }
        this.f57019e = obj;
        return undeliveredElementException;
    }

    @Override // x20.c
    protected Object B(E e11) {
        u<E> F;
        f0 q11;
        ReentrantLock reentrantLock = this.f57018d;
        reentrantLock.lock();
        try {
            m<?> p11 = p();
            if (p11 == null) {
                if (this.f57019e == b.f56988a) {
                    do {
                        F = F();
                        if (F != null) {
                            if (F instanceof m) {
                                return F;
                            }
                            q11 = F.q(e11, null);
                        }
                    } while (q11 == null);
                    if (r0.a()) {
                        if (!(q11 == v20.q.f53988a)) {
                            throw new AssertionError();
                        }
                    }
                    b0 b0Var = b0.f54756a;
                    reentrantLock.unlock();
                    F.i(e11);
                    return F.b();
                }
                UndeliveredElementException c02 = c0(e11);
                if (c02 == null) {
                    return b.f56989b;
                }
                throw c02;
            }
            return p11;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x20.a
    protected boolean N(s<? super E> sVar) {
        ReentrantLock reentrantLock = this.f57018d;
        reentrantLock.lock();
        try {
            return super.N(sVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x20.a
    protected final boolean P() {
        return false;
    }

    @Override // x20.a
    protected final boolean Q() {
        return this.f57019e == b.f56988a;
    }

    @Override // x20.a
    protected void S(boolean z11) {
        ReentrantLock reentrantLock = this.f57018d;
        reentrantLock.lock();
        try {
            UndeliveredElementException c02 = c0(b.f56988a);
            b0 b0Var = b0.f54756a;
            reentrantLock.unlock();
            super.S(z11);
            if (c02 != null) {
                throw c02;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // x20.a
    protected Object W() {
        ReentrantLock reentrantLock = this.f57018d;
        reentrantLock.lock();
        try {
            Object obj = this.f57019e;
            f0 f0Var = b.f56988a;
            if (obj != f0Var) {
                this.f57019e = f0Var;
                b0 b0Var = b0.f54756a;
                return obj;
            }
            Object p11 = p();
            if (p11 == null) {
                p11 = b.f56991d;
            }
            return p11;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x20.a
    protected Object X(kotlinx.coroutines.selects.d<?> dVar) {
        ReentrantLock reentrantLock = this.f57018d;
        reentrantLock.lock();
        try {
            Object obj = this.f57019e;
            f0 f0Var = b.f56988a;
            if (obj == f0Var) {
                Object p11 = p();
                if (p11 == null) {
                    p11 = b.f56991d;
                }
                return p11;
            } else if (!dVar.k()) {
                return kotlinx.coroutines.selects.e.d();
            } else {
                Object obj2 = this.f57019e;
                this.f57019e = f0Var;
                b0 b0Var = b0.f54756a;
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x20.c
    protected String n() {
        return "(value=" + this.f57019e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // x20.c
    protected final boolean y() {
        return false;
    }

    @Override // x20.c
    protected final boolean z() {
        return false;
    }
}