package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v20.a3;
import v20.b1;
import v20.k1;
import v20.r0;
import v20.s0;

/* loaded from: classes5.dex */
public final class i<T> extends b1<T> implements kotlin.coroutines.jvm.internal.e, zz.d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35462h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: d  reason: collision with root package name */
    public final v20.j0 f35463d;

    /* renamed from: e  reason: collision with root package name */
    public final zz.d<T> f35464e;

    /* renamed from: f  reason: collision with root package name */
    public Object f35465f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f35466g;

    /* JADX WARN: Multi-variable type inference failed */
    public i(v20.j0 j0Var, zz.d<? super T> dVar) {
        super(-1);
        this.f35463d = j0Var;
        this.f35464e = dVar;
        this.f35465f = j.a();
        this.f35466g = j0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final v20.p<?> l() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof v20.p) {
            return (v20.p) obj;
        }
        return null;
    }

    @Override // v20.b1
    public void b(Object obj, Throwable th2) {
        if (obj instanceof v20.d0) {
            ((v20.d0) obj).f53906b.invoke(th2);
        }
    }

    @Override // v20.b1
    public zz.d<T> c() {
        return this;
    }

    @Override // v20.b1
    public Object g() {
        Object obj = this.f35465f;
        if (r0.a()) {
            if (!(obj != j.a())) {
                throw new AssertionError();
            }
        }
        this.f35465f = j.a();
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zz.d<T> dVar = this.f35464e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // zz.d
    public zz.g getContext() {
        return this.f35464e.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void i() {
        do {
        } while (this._reusableCancellableContinuation == j.f35468b);
    }

    public final v20.p<T> j() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = j.f35468b;
                return null;
            } else if (obj instanceof v20.p) {
                if (f35462h.compareAndSet(this, obj, j.f35468b)) {
                    return (v20.p) obj;
                }
            } else if (obj != j.f35468b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Inconsistent state ", obj).toString());
            }
        }
    }

    public final void k(zz.g gVar, T t11) {
        this.f35465f = t11;
        this.f53896c = 1;
        this.f35463d.J0(gVar, this);
    }

    public final boolean m() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean n(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            f0 f0Var = j.f35468b;
            if (kotlin.jvm.internal.s.c(obj, f0Var)) {
                if (f35462h.compareAndSet(this, f0Var, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f35462h.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void p() {
        i();
        v20.p<?> l11 = l();
        if (l11 == null) {
            return;
        }
        l11.n();
    }

    public final Throwable q(v20.o<?> oVar) {
        f0 f0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            f0Var = j.f35468b;
            if (obj != f0Var) {
                if (obj instanceof Throwable) {
                    if (f35462h.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Inconsistent state ", obj).toString());
            }
        } while (!f35462h.compareAndSet(this, f0Var, oVar));
        return null;
    }

    @Override // zz.d
    public void resumeWith(Object obj) {
        zz.g context = this.f35464e.getContext();
        Object d11 = v20.f0.d(obj, null, 1, null);
        if (this.f35463d.P0(context)) {
            this.f35465f = d11;
            this.f53896c = 0;
            this.f35463d.I0(context, this);
            return;
        }
        r0.a();
        k1 b11 = a3.f53889a.b();
        if (b11.t1()) {
            this.f35465f = d11;
            this.f53896c = 0;
            b11.Z0(this);
            return;
        }
        b11.h1(true);
        try {
            zz.g context2 = getContext();
            Object c11 = j0.c(context2, this.f35466g);
            this.f35464e.resumeWith(obj);
            vz.b0 b0Var = vz.b0.f54756a;
            j0.a(context2, c11);
            do {
            } while (b11.z1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f35463d + ", " + s0.c(this.f35464e) + ']';
    }
}