package v20;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.CompletionHandlerException;
import v20.a2;

/* loaded from: classes5.dex */
public class p<T> extends b1<T> implements o<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f53983g = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decision");

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f53984h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: d  reason: collision with root package name */
    private final zz.d<T> f53985d;

    /* renamed from: e  reason: collision with root package name */
    private final zz.g f53986e;

    /* renamed from: f  reason: collision with root package name */
    private g1 f53987f;

    /* JADX WARN: Multi-variable type inference failed */
    public p(zz.d<? super T> dVar, int i11) {
        super(i11);
        this.f53985d = dVar;
        if (r0.a()) {
            if (!(i11 != -1)) {
                throw new AssertionError();
            }
        }
        this.f53986e = dVar.getContext();
        this._decision = 0;
        this._state = d.f53904a;
    }

    private final boolean B() {
        return c1.c(this.f53896c) && ((kotlinx.coroutines.internal.i) this.f53985d).m();
    }

    private final m C(h00.l<? super Throwable, vz.b0> lVar) {
        return lVar instanceof m ? (m) lVar : new x1(lVar);
    }

    private final void D(h00.l<? super Throwable, vz.b0> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void G() {
        zz.d<T> dVar = this.f53985d;
        kotlinx.coroutines.internal.i iVar = dVar instanceof kotlinx.coroutines.internal.i ? (kotlinx.coroutines.internal.i) dVar : null;
        Throwable q11 = iVar != null ? iVar.q(this) : null;
        if (q11 == null) {
            return;
        }
        n();
        u(q11);
    }

    private final void I(Object obj, int i11, h00.l<? super Throwable, vz.b0> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof o2) {
            } else {
                if (obj2 instanceof s) {
                    s sVar = (s) obj2;
                    if (sVar.c()) {
                        if (lVar == null) {
                            return;
                        }
                        l(lVar, sVar.f53902a);
                        return;
                    }
                }
                i(obj);
                throw new KotlinNothingValueException();
            }
        } while (!f53984h.compareAndSet(this, obj2, K((o2) obj2, obj, i11, lVar, null)));
        p();
        q(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void J(p pVar, Object obj, int i11, h00.l lVar, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        pVar.I(obj, i11, lVar);
    }

    private final Object K(o2 o2Var, Object obj, int i11, h00.l<? super Throwable, vz.b0> lVar, Object obj2) {
        if (obj instanceof c0) {
            if (r0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (r0.a()) {
                if (lVar == null) {
                    return obj;
                }
                throw new AssertionError();
            }
            return obj;
        } else if (c1.b(i11) || obj2 != null) {
            if (lVar != null || (((o2Var instanceof m) && !(o2Var instanceof f)) || obj2 != null)) {
                return new b0(obj, o2Var instanceof m ? (m) o2Var : null, lVar, obj2, null, 16, null);
            }
            return obj;
        } else {
            return obj;
        }
    }

    private final boolean L() {
        do {
            int i11 = this._decision;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f53983g.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.f0 M(Object obj, Object obj2, h00.l<? super Throwable, vz.b0> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof o2) {
            } else if (!(obj3 instanceof b0) || obj2 == null) {
                return null;
            } else {
                b0 b0Var = (b0) obj3;
                if (b0Var.f53894d == obj2) {
                    if (!r0.a() || kotlin.jvm.internal.s.c(b0Var.f53891a, obj)) {
                        return q.f53988a;
                    }
                    throw new AssertionError();
                }
                return null;
            }
        } while (!f53984h.compareAndSet(this, obj3, K((o2) obj3, obj, this.f53896c, lVar, obj2)));
        p();
        return q.f53988a;
    }

    private final boolean N() {
        do {
            int i11 = this._decision;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f53983g.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(kotlin.jvm.internal.s.p("Already resumed, but proposed with update ", obj).toString());
    }

    private final void j(h00.l<? super Throwable, vz.b0> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            l0.a(getContext(), new CompletionHandlerException(kotlin.jvm.internal.s.p("Exception in invokeOnCancellation handler for ", this), th3));
        }
    }

    private final boolean m(Throwable th2) {
        if (B()) {
            return ((kotlinx.coroutines.internal.i) this.f53985d).n(th2);
        }
        return false;
    }

    private final void p() {
        if (B()) {
            return;
        }
        n();
    }

    private final void q(int i11) {
        if (L()) {
            return;
        }
        c1.a(this, i11);
    }

    private final String x() {
        Object w11 = w();
        return w11 instanceof o2 ? "Active" : w11 instanceof s ? "Cancelled" : "Completed";
    }

    private final g1 z() {
        a2 a2Var = (a2) getContext().get(a2.f53887l1);
        if (a2Var == null) {
            return null;
        }
        g1 d11 = a2.a.d(a2Var, true, false, new t(this), 2, null);
        this.f53987f = d11;
        return d11;
    }

    public boolean A() {
        return !(w() instanceof o2);
    }

    protected String E() {
        return "CancellableContinuation";
    }

    public final void F(Throwable th2) {
        if (m(th2)) {
            return;
        }
        u(th2);
        p();
    }

    public final boolean H() {
        if (r0.a()) {
            if (!(this.f53896c == 2)) {
                throw new AssertionError();
            }
        }
        if (r0.a()) {
            if (!(this.f53987f != n2.f53980a)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (!r0.a() || (!(obj instanceof o2))) {
            if ((obj instanceof b0) && ((b0) obj).f53894d != null) {
                n();
                return false;
            }
            this._decision = 0;
            this._state = d.f53904a;
            return true;
        }
        throw new AssertionError();
    }

    @Override // v20.o
    public void S(T t11, h00.l<? super Throwable, vz.b0> lVar) {
        I(t11, this.f53896c, lVar);
    }

    @Override // v20.o
    public void T(h00.l<? super Throwable, vz.b0> lVar) {
        m C = C(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (f53984h.compareAndSet(this, obj, C)) {
                    return;
                }
            } else if (obj instanceof m) {
                D(lVar, obj);
            } else {
                boolean z11 = obj instanceof c0;
                if (z11) {
                    c0 c0Var = (c0) obj;
                    if (!c0Var.b()) {
                        D(lVar, obj);
                    }
                    if (obj instanceof s) {
                        if (!z11) {
                            c0Var = null;
                        }
                        j(lVar, c0Var != null ? c0Var.f53902a : null);
                        return;
                    }
                    return;
                } else if (obj instanceof b0) {
                    b0 b0Var = (b0) obj;
                    if (b0Var.f53892b != null) {
                        D(lVar, obj);
                    }
                    if (C instanceof f) {
                        return;
                    }
                    if (b0Var.c()) {
                        j(lVar, b0Var.f53895e);
                        return;
                    } else {
                        if (f53984h.compareAndSet(this, obj, b0.b(b0Var, null, C, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (C instanceof f) {
                    return;
                } else {
                    if (f53984h.compareAndSet(this, obj, new b0(obj, C, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // v20.o
    public void U(Object obj) {
        if (r0.a()) {
            if (!(obj == q.f53988a)) {
                throw new AssertionError();
            }
        }
        q(this.f53896c);
    }

    @Override // v20.o
    public boolean a() {
        return w() instanceof o2;
    }

    @Override // v20.b1
    public void b(Object obj, Throwable th2) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof o2)) {
                if (obj2 instanceof c0) {
                    return;
                }
                if (obj2 instanceof b0) {
                    b0 b0Var = (b0) obj2;
                    if (!b0Var.c()) {
                        if (f53984h.compareAndSet(this, obj2, b0.b(b0Var, null, null, null, null, th2, 15, null))) {
                            b0Var.d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f53984h.compareAndSet(this, obj2, new b0(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // v20.b1
    public final zz.d<T> c() {
        return this.f53985d;
    }

    @Override // v20.b1
    public Throwable d(Object obj) {
        Throwable j11;
        Throwable d11 = super.d(obj);
        if (d11 == null) {
            return null;
        }
        zz.d<T> c11 = c();
        if (r0.d() && (c11 instanceof kotlin.coroutines.jvm.internal.e)) {
            j11 = kotlinx.coroutines.internal.e0.j(d11, (kotlin.coroutines.jvm.internal.e) c11);
            return j11;
        }
        return d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v20.b1
    public <T> T e(Object obj) {
        return obj instanceof b0 ? (T) ((b0) obj).f53891a : obj;
    }

    @Override // v20.b1
    public Object g() {
        return w();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zz.d<T> dVar = this.f53985d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // zz.d
    public zz.g getContext() {
        return this.f53986e;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // v20.o
    public Object h(T t11, Object obj) {
        return M(t11, obj, null);
    }

    public final void k(m mVar, Throwable th2) {
        try {
            mVar.a(th2);
        } catch (Throwable th3) {
            l0.a(getContext(), new CompletionHandlerException(kotlin.jvm.internal.s.p("Exception in invokeOnCancellation handler for ", this), th3));
        }
    }

    public final void l(h00.l<? super Throwable, vz.b0> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            l0.a(getContext(), new CompletionHandlerException(kotlin.jvm.internal.s.p("Exception in resume onCancellation handler for ", this), th3));
        }
    }

    public final void n() {
        g1 g1Var = this.f53987f;
        if (g1Var == null) {
            return;
        }
        g1Var.dispose();
        this.f53987f = n2.f53980a;
    }

    @Override // v20.o
    public Object o(T t11, Object obj, h00.l<? super Throwable, vz.b0> lVar) {
        return M(t11, obj, lVar);
    }

    public Throwable r(a2 a2Var) {
        return a2Var.m();
    }

    @Override // zz.d
    public void resumeWith(Object obj) {
        J(this, f0.c(obj, this), this.f53896c, null, 4, null);
    }

    public final Object s() {
        a2 a2Var;
        Throwable j11;
        Throwable j12;
        Object d11;
        boolean B = B();
        if (N()) {
            if (this.f53987f == null) {
                z();
            }
            if (B) {
                G();
            }
            d11 = a00.d.d();
            return d11;
        }
        if (B) {
            G();
        }
        Object w11 = w();
        if (w11 instanceof c0) {
            Throwable th2 = ((c0) w11).f53902a;
            if (r0.d()) {
                j12 = kotlinx.coroutines.internal.e0.j(th2, this);
                throw j12;
            }
            throw th2;
        } else if (c1.b(this.f53896c) && (a2Var = (a2) getContext().get(a2.f53887l1)) != null && !a2Var.a()) {
            CancellationException m11 = a2Var.m();
            b(w11, m11);
            if (r0.d()) {
                j11 = kotlinx.coroutines.internal.e0.j(m11, this);
                throw j11;
            }
            throw m11;
        } else {
            return e(w11);
        }
    }

    @Override // v20.o
    public Object t(Throwable th2) {
        return M(new c0(th2, false, 2, null), null, null);
    }

    public String toString() {
        return E() + CoreConstants.LEFT_PARENTHESIS_CHAR + s0.c(this.f53985d) + "){" + x() + "}@" + s0.b(this);
    }

    @Override // v20.o
    public boolean u(Throwable th2) {
        Object obj;
        boolean z11;
        do {
            obj = this._state;
            if (!(obj instanceof o2)) {
                return false;
            }
            z11 = obj instanceof m;
        } while (!f53984h.compareAndSet(this, obj, new s(this, th2, z11)));
        m mVar = z11 ? (m) obj : null;
        if (mVar != null) {
            k(mVar, th2);
        }
        p();
        q(this.f53896c);
        return true;
    }

    @Override // v20.o
    public void v(j0 j0Var, T t11) {
        zz.d<T> dVar = this.f53985d;
        kotlinx.coroutines.internal.i iVar = dVar instanceof kotlinx.coroutines.internal.i ? (kotlinx.coroutines.internal.i) dVar : null;
        J(this, t11, (iVar != null ? iVar.f35463d : null) == j0Var ? 4 : this.f53896c, null, 4, null);
    }

    public final Object w() {
        return this._state;
    }

    public void y() {
        g1 z11 = z();
        if (z11 != null && A()) {
            z11.dispose();
            this.f53987f = n2.f53980a;
        }
    }
}