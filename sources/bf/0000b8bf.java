package v20;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.s;
import v20.a2;
import zz.g;

/* loaded from: classes5.dex */
public class h2 implements a2, w, p2 {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f53928a = AtomicReferenceFieldUpdater.newUpdater(h2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a<T> extends p<T> {

        /* renamed from: i  reason: collision with root package name */
        private final h2 f53929i;

        public a(zz.d<? super T> dVar, h2 h2Var) {
            super(dVar, 1);
            this.f53929i = h2Var;
        }

        @Override // v20.p
        protected String E() {
            return "AwaitContinuation";
        }

        @Override // v20.p
        public Throwable r(a2 a2Var) {
            Throwable f11;
            Object d02 = this.f53929i.d0();
            return (!(d02 instanceof c) || (f11 = ((c) d02).f()) == null) ? d02 instanceof c0 ? ((c0) d02).f53902a : a2Var.m() : f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends g2 {

        /* renamed from: e  reason: collision with root package name */
        private final h2 f53930e;

        /* renamed from: f  reason: collision with root package name */
        private final c f53931f;

        /* renamed from: g  reason: collision with root package name */
        private final v f53932g;

        /* renamed from: h  reason: collision with root package name */
        private final Object f53933h;

        public b(h2 h2Var, c cVar, v vVar, Object obj) {
            this.f53930e = h2Var;
            this.f53931f = cVar;
            this.f53932g = vVar;
            this.f53933h = obj;
        }

        @Override // v20.e0
        public void V(Throwable th2) {
            this.f53930e.O(this.f53931f, this.f53932g, this.f53933h);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
            V(th2);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c implements v1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        private final m2 f53934a;

        public c(m2 m2Var, boolean z11, Throwable th2) {
            this.f53934a = m2Var;
            this._isCompleting = z11 ? 1 : 0;
            this._rootCause = th2;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object e() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        @Override // v20.v1
        public boolean a() {
            return f() == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(Throwable th2) {
            Throwable f11 = f();
            if (f11 == null) {
                m(th2);
            } else if (th2 == f11) {
            } else {
                Object e11 = e();
                if (e11 == null) {
                    l(th2);
                } else if (!(e11 instanceof Throwable)) {
                    if (!(e11 instanceof ArrayList)) {
                        throw new IllegalStateException(kotlin.jvm.internal.s.p("State is ", e11).toString());
                    }
                    ((ArrayList) e11).add(th2);
                } else if (th2 == e11) {
                } else {
                    ArrayList<Throwable> c11 = c();
                    c11.add(e11);
                    c11.add(th2);
                    l(c11);
                }
            }
        }

        @Override // v20.v1
        public m2 d() {
            return this.f53934a;
        }

        public final Throwable f() {
            return (Throwable) this._rootCause;
        }

        public final boolean g() {
            return f() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean h() {
            return this._isCompleting;
        }

        public final boolean i() {
            kotlinx.coroutines.internal.f0 f0Var;
            Object e11 = e();
            f0Var = i2.f53952e;
            return e11 == f0Var;
        }

        public final List<Throwable> j(Throwable th2) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.f0 f0Var;
            Object e11 = e();
            if (e11 == null) {
                arrayList = c();
            } else if (e11 instanceof Throwable) {
                ArrayList<Throwable> c11 = c();
                c11.add(e11);
                arrayList = c11;
            } else if (!(e11 instanceof ArrayList)) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("State is ", e11).toString());
            } else {
                arrayList = (ArrayList) e11;
            }
            Throwable f11 = f();
            if (f11 != null) {
                arrayList.add(0, f11);
            }
            if (th2 != null && !kotlin.jvm.internal.s.c(th2, f11)) {
                arrayList.add(th2);
            }
            f0Var = i2.f53952e;
            l(f0Var);
            return arrayList;
        }

        public final void k(boolean z11) {
            this._isCompleting = z11 ? 1 : 0;
        }

        public final void m(Throwable th2) {
            this._rootCause = th2;
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + d() + ']';
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends s.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h2 f53935d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f53936e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.s sVar, h2 h2Var, Object obj) {
            super(sVar);
            this.f53935d = h2Var;
            this.f53936e = obj;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: k */
        public Object i(kotlinx.coroutines.internal.s sVar) {
            if (this.f53935d.d0() == this.f53936e) {
                return null;
            }
            return kotlinx.coroutines.internal.r.a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.k implements h00.p<u20.j<? super a2>, zz.d<? super vz.b0>, Object> {

        /* renamed from: b  reason: collision with root package name */
        Object f53937b;

        /* renamed from: c  reason: collision with root package name */
        Object f53938c;

        /* renamed from: d  reason: collision with root package name */
        int f53939d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f53940e;

        e(zz.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f53940e = obj;
            return eVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(u20.j<? super a2> jVar, zz.d<? super vz.b0> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:28:0x007f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:28:0x007f). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r7.f53939d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f53938c
                kotlinx.coroutines.internal.s r1 = (kotlinx.coroutines.internal.s) r1
                java.lang.Object r3 = r7.f53937b
                kotlinx.coroutines.internal.q r3 = (kotlinx.coroutines.internal.q) r3
                java.lang.Object r4 = r7.f53940e
                u20.j r4 = (u20.j) r4
                vz.r.b(r8)
                r8 = r7
                goto L7f
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                vz.r.b(r8)
                goto L84
            L2b:
                vz.r.b(r8)
                java.lang.Object r8 = r7.f53940e
                u20.j r8 = (u20.j) r8
                v20.h2 r1 = v20.h2.this
                java.lang.Object r1 = r1.d0()
                boolean r4 = r1 instanceof v20.v
                if (r4 == 0) goto L49
                v20.v r1 = (v20.v) r1
                v20.w r1 = r1.f54010e
                r7.f53939d = r3
                java.lang.Object r8 = r8.b(r1, r7)
                if (r8 != r0) goto L84
                return r0
            L49:
                boolean r3 = r1 instanceof v20.v1
                if (r3 == 0) goto L84
                v20.v1 r1 = (v20.v1) r1
                v20.m2 r1 = r1.d()
                if (r1 != 0) goto L56
                goto L84
            L56:
                java.lang.Object r3 = r1.F()
                kotlinx.coroutines.internal.s r3 = (kotlinx.coroutines.internal.s) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L61:
                boolean r5 = kotlin.jvm.internal.s.c(r1, r3)
                if (r5 != 0) goto L84
                boolean r5 = r1 instanceof v20.v
                if (r5 == 0) goto L7f
                r5 = r1
                v20.v r5 = (v20.v) r5
                v20.w r5 = r5.f54010e
                r8.f53940e = r4
                r8.f53937b = r3
                r8.f53938c = r1
                r8.f53939d = r2
                java.lang.Object r5 = r4.b(r5, r8)
                if (r5 != r0) goto L7f
                return r0
            L7f:
                kotlinx.coroutines.internal.s r1 = r1.G()
                goto L61
            L84:
                vz.b0 r8 = vz.b0.f54756a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: v20.h2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h2(boolean z11) {
        this._state = z11 ? i2.f53954g : i2.f53953f;
        this._parentHandle = null;
    }

    private final Object B(zz.d<Object> dVar) {
        zz.d c11;
        Object d11;
        c11 = a00.c.c(dVar);
        a aVar = new a(c11, this);
        aVar.y();
        r.a(aVar, p(new r2(aVar)));
        Object s11 = aVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return s11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [v20.u1] */
    private final void E0(j1 j1Var) {
        m2 m2Var = new m2();
        if (!j1Var.a()) {
            m2Var = new u1(m2Var);
        }
        f53928a.compareAndSet(this, j1Var, m2Var);
    }

    private final Object H(Object obj) {
        kotlinx.coroutines.internal.f0 f0Var;
        Object T0;
        kotlinx.coroutines.internal.f0 f0Var2;
        do {
            Object d02 = d0();
            if (!(d02 instanceof v1) || ((d02 instanceof c) && ((c) d02).h())) {
                f0Var = i2.f53948a;
                return f0Var;
            }
            T0 = T0(d02, new c0(P(obj), false, 2, null));
            f0Var2 = i2.f53950c;
        } while (T0 == f0Var2);
        return T0;
    }

    private final void H0(g2 g2Var) {
        g2Var.z(new m2());
        f53928a.compareAndSet(this, g2Var, g2Var.G());
    }

    private final boolean I(Throwable th2) {
        if (k0()) {
            return true;
        }
        boolean z11 = th2 instanceof CancellationException;
        u c02 = c0();
        return (c02 == null || c02 == n2.f53980a) ? z11 : c02.c(th2) || z11;
    }

    private final int M0(Object obj) {
        j1 j1Var;
        if (obj instanceof j1) {
            if (((j1) obj).a()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53928a;
            j1Var = i2.f53954g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, j1Var)) {
                B0();
                return 1;
            }
            return -1;
        } else if (obj instanceof u1) {
            if (f53928a.compareAndSet(this, obj, ((u1) obj).d())) {
                B0();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    private final void N(v1 v1Var, Object obj) {
        u c02 = c0();
        if (c02 != null) {
            c02.dispose();
            L0(n2.f53980a);
        }
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th2 = c0Var != null ? c0Var.f53902a : null;
        if (v1Var instanceof g2) {
            try {
                ((g2) v1Var).V(th2);
                return;
            } catch (Throwable th3) {
                g0(new CompletionHandlerException("Exception in completion handler " + v1Var + " for " + this, th3));
                return;
            }
        }
        m2 d11 = v1Var.d();
        if (d11 == null) {
            return;
        }
        y0(d11, th2);
    }

    private final String N0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof v1 ? ((v1) obj).a() ? "Active" : "New" : obj instanceof c0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.g() ? "Cancelling" : cVar.h() ? "Completing" : "Active";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(c cVar, v vVar, Object obj) {
        if (r0.a()) {
            if (!(d0() == cVar)) {
                throw new AssertionError();
            }
        }
        v w02 = w0(vVar);
        if (w02 == null || !V0(cVar, w02, obj)) {
            z(Q(cVar, obj));
        }
    }

    private final Throwable P(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(K(), null, this) : th2;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((p2) obj).R();
    }

    public static /* synthetic */ CancellationException P0(h2 h2Var, Throwable th2, String str, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return h2Var.O0(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final Object Q(c cVar, Object obj) {
        boolean g11;
        Throwable X;
        boolean z11 = true;
        if (r0.a()) {
            if (!(d0() == cVar)) {
                throw new AssertionError();
            }
        }
        if (!r0.a() || (!cVar.i())) {
            if (!r0.a() || cVar.h()) {
                c0 c0Var = obj instanceof c0 ? (c0) obj : null;
                Throwable th2 = c0Var == null ? null : c0Var.f53902a;
                synchronized (cVar) {
                    g11 = cVar.g();
                    List<Throwable> j11 = cVar.j(th2);
                    X = X(cVar, j11);
                    if (X != null) {
                        y(X, j11);
                    }
                }
                if (X != null && X != th2) {
                    obj = new c0(X, false, 2, null);
                }
                if (X != null) {
                    if (!I(X) && !f0(X)) {
                        z11 = false;
                    }
                    if (z11) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                        ((c0) obj).b();
                    }
                }
                if (!g11) {
                    z0(X);
                }
                A0(obj);
                boolean compareAndSet = f53928a.compareAndSet(this, cVar, i2.g(obj));
                if (!r0.a() || compareAndSet) {
                    N(cVar, obj);
                    return obj;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final boolean R0(v1 v1Var, Object obj) {
        if (r0.a()) {
            if (!((v1Var instanceof j1) || (v1Var instanceof g2))) {
                throw new AssertionError();
            }
        }
        if (!r0.a() || (!(obj instanceof c0))) {
            if (f53928a.compareAndSet(this, v1Var, i2.g(obj))) {
                z0(null);
                A0(obj);
                N(v1Var, obj);
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    private final boolean S0(v1 v1Var, Throwable th2) {
        if (!r0.a() || (!(v1Var instanceof c))) {
            if (!r0.a() || v1Var.a()) {
                m2 b02 = b0(v1Var);
                if (b02 == null) {
                    return false;
                }
                if (f53928a.compareAndSet(this, v1Var, new c(b02, false, th2))) {
                    x0(b02, th2);
                    return true;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final Object T0(Object obj, Object obj2) {
        kotlinx.coroutines.internal.f0 f0Var;
        kotlinx.coroutines.internal.f0 f0Var2;
        if (!(obj instanceof v1)) {
            f0Var2 = i2.f53948a;
            return f0Var2;
        } else if (((obj instanceof j1) || (obj instanceof g2)) && !(obj instanceof v) && !(obj2 instanceof c0)) {
            if (R0((v1) obj, obj2)) {
                return obj2;
            }
            f0Var = i2.f53950c;
            return f0Var;
        } else {
            return U0((v1) obj, obj2);
        }
    }

    private final Object U0(v1 v1Var, Object obj) {
        kotlinx.coroutines.internal.f0 f0Var;
        kotlinx.coroutines.internal.f0 f0Var2;
        kotlinx.coroutines.internal.f0 f0Var3;
        m2 b02 = b0(v1Var);
        if (b02 == null) {
            f0Var3 = i2.f53950c;
            return f0Var3;
        }
        c cVar = v1Var instanceof c ? (c) v1Var : null;
        if (cVar == null) {
            cVar = new c(b02, false, null);
        }
        synchronized (cVar) {
            if (cVar.h()) {
                f0Var2 = i2.f53948a;
                return f0Var2;
            }
            cVar.k(true);
            if (cVar != v1Var && !f53928a.compareAndSet(this, v1Var, cVar)) {
                f0Var = i2.f53950c;
                return f0Var;
            }
            if (r0.a() && !(!cVar.i())) {
                throw new AssertionError();
            }
            boolean g11 = cVar.g();
            c0 c0Var = obj instanceof c0 ? (c0) obj : null;
            if (c0Var != null) {
                cVar.b(c0Var.f53902a);
            }
            Throwable f11 = true ^ g11 ? cVar.f() : null;
            vz.b0 b0Var = vz.b0.f54756a;
            if (f11 != null) {
                x0(b02, f11);
            }
            v V = V(v1Var);
            if (V != null && V0(cVar, V, obj)) {
                return i2.f53949b;
            }
            return Q(cVar, obj);
        }
    }

    private final v V(v1 v1Var) {
        v vVar = v1Var instanceof v ? (v) v1Var : null;
        if (vVar == null) {
            m2 d11 = v1Var.d();
            if (d11 == null) {
                return null;
            }
            return w0(d11);
        }
        return vVar;
    }

    private final boolean V0(c cVar, v vVar, Object obj) {
        while (a2.a.d(vVar.f54010e, false, false, new b(this, cVar, vVar, obj), 1, null) == n2.f53980a) {
            vVar = w0(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable W(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f53902a;
    }

    private final Throwable X(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z11;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.g()) {
                return new JobCancellationException(K(), null, this);
            }
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                Throwable th4 = (Throwable) next;
                if (th4 == th3 || !(th4 instanceof TimeoutCancellationException)) {
                    z11 = false;
                    continue;
                } else {
                    z11 = true;
                    continue;
                }
                if (z11) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final m2 b0(v1 v1Var) {
        m2 d11 = v1Var.d();
        if (d11 == null) {
            if (v1Var instanceof j1) {
                return new m2();
            }
            if (v1Var instanceof g2) {
                H0((g2) v1Var);
                return null;
            }
            throw new IllegalStateException(kotlin.jvm.internal.s.p("State should have list: ", v1Var).toString());
        }
        return d11;
    }

    private final boolean l0() {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof v1)) {
                return false;
            }
        } while (M0(d02) < 0);
        return true;
    }

    private final Object m0(zz.d<? super vz.b0> dVar) {
        zz.d c11;
        Object d11;
        Object d12;
        c11 = a00.c.c(dVar);
        p pVar = new p(c11, 1);
        pVar.y();
        r.a(pVar, p(new s2(pVar)));
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        d12 = a00.d.d();
        return s11 == d12 ? s11 : vz.b0.f54756a;
    }

    private final Object o0(Object obj) {
        kotlinx.coroutines.internal.f0 f0Var;
        kotlinx.coroutines.internal.f0 f0Var2;
        kotlinx.coroutines.internal.f0 f0Var3;
        kotlinx.coroutines.internal.f0 f0Var4;
        kotlinx.coroutines.internal.f0 f0Var5;
        kotlinx.coroutines.internal.f0 f0Var6;
        Throwable th2 = null;
        while (true) {
            Object d02 = d0();
            if (d02 instanceof c) {
                synchronized (d02) {
                    if (((c) d02).i()) {
                        f0Var2 = i2.f53951d;
                        return f0Var2;
                    }
                    boolean g11 = ((c) d02).g();
                    if (obj != null || !g11) {
                        if (th2 == null) {
                            th2 = P(obj);
                        }
                        ((c) d02).b(th2);
                    }
                    Throwable f11 = g11 ^ true ? ((c) d02).f() : null;
                    if (f11 != null) {
                        x0(((c) d02).d(), f11);
                    }
                    f0Var = i2.f53948a;
                    return f0Var;
                }
            } else if (!(d02 instanceof v1)) {
                f0Var3 = i2.f53951d;
                return f0Var3;
            } else {
                if (th2 == null) {
                    th2 = P(obj);
                }
                v1 v1Var = (v1) d02;
                if (v1Var.a()) {
                    if (S0(v1Var, th2)) {
                        f0Var4 = i2.f53948a;
                        return f0Var4;
                    }
                } else {
                    Object T0 = T0(d02, new c0(th2, false, 2, null));
                    f0Var5 = i2.f53948a;
                    if (T0 != f0Var5) {
                        f0Var6 = i2.f53950c;
                        if (T0 != f0Var6) {
                            return T0;
                        }
                    } else {
                        throw new IllegalStateException(kotlin.jvm.internal.s.p("Cannot happen in ", d02).toString());
                    }
                }
            }
        }
    }

    private final g2 s0(h00.l<? super Throwable, vz.b0> lVar, boolean z11) {
        if (z11) {
            r0 = lVar instanceof b2 ? (b2) lVar : null;
            if (r0 == null) {
                r0 = new y1(lVar);
            }
        } else {
            g2 g2Var = lVar instanceof g2 ? (g2) lVar : null;
            if (g2Var != null) {
                if (r0.a() && !(!(g2Var instanceof b2))) {
                    throw new AssertionError();
                }
                r0 = g2Var;
            }
            if (r0 == null) {
                r0 = new z1(lVar);
            }
        }
        r0.X(this);
        return r0;
    }

    private final v w0(kotlinx.coroutines.internal.s sVar) {
        while (sVar.M()) {
            sVar = sVar.H();
        }
        while (true) {
            sVar = sVar.G();
            if (!sVar.M()) {
                if (sVar instanceof v) {
                    return (v) sVar;
                }
                if (sVar instanceof m2) {
                    return null;
                }
            }
        }
    }

    private final boolean x(Object obj, m2 m2Var, g2 g2Var) {
        int R;
        d dVar = new d(g2Var, this, obj);
        do {
            R = m2Var.H().R(g2Var, m2Var, dVar);
            if (R == 1) {
                return true;
            }
        } while (R != 2);
        return false;
    }

    private final void x0(m2 m2Var, Throwable th2) {
        CompletionHandlerException completionHandlerException;
        z0(th2);
        CompletionHandlerException completionHandlerException2 = null;
        for (kotlinx.coroutines.internal.s sVar = (kotlinx.coroutines.internal.s) m2Var.F(); !kotlin.jvm.internal.s.c(sVar, m2Var); sVar = sVar.G()) {
            if (sVar instanceof b2) {
                g2 g2Var = (g2) sVar;
                try {
                    g2Var.V(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        vz.f.a(completionHandlerException2, th3);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + g2Var + " for " + this, th3);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            g0(completionHandlerException2);
        }
        I(th2);
    }

    private final void y(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable n11 = !r0.d() ? th2 : kotlinx.coroutines.internal.e0.n(th2);
        for (Throwable th3 : list) {
            if (r0.d()) {
                th3 = kotlinx.coroutines.internal.e0.n(th3);
            }
            if (th3 != th2 && th3 != n11 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                vz.f.a(th2, th3);
            }
        }
    }

    private final void y0(m2 m2Var, Throwable th2) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (kotlinx.coroutines.internal.s sVar = (kotlinx.coroutines.internal.s) m2Var.F(); !kotlin.jvm.internal.s.c(sVar, m2Var); sVar = sVar.G()) {
            if (sVar instanceof g2) {
                g2 g2Var = (g2) sVar;
                try {
                    g2Var.V(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        vz.f.a(completionHandlerException2, th3);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + g2Var + " for " + this, th3);
                    }
                }
            }
        }
        if (completionHandlerException2 == null) {
            return;
        }
        g0(completionHandlerException2);
    }

    public final Object A(zz.d<Object> dVar) {
        Object d02;
        Throwable j11;
        do {
            d02 = d0();
            if (!(d02 instanceof v1)) {
                if (d02 instanceof c0) {
                    Throwable th2 = ((c0) d02).f53902a;
                    if (r0.d()) {
                        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
                            j11 = kotlinx.coroutines.internal.e0.j(th2, (kotlin.coroutines.jvm.internal.e) dVar);
                            throw j11;
                        }
                        throw th2;
                    }
                    throw th2;
                }
                return i2.h(d02);
            }
        } while (M0(d02) < 0);
        return B(dVar);
    }

    protected void A0(Object obj) {
    }

    protected void B0() {
    }

    @Override // v20.a2
    public final Object D(zz.d<? super vz.b0> dVar) {
        Object d11;
        if (!l0()) {
            d2.m(dVar.getContext());
            return vz.b0.f54756a;
        }
        Object m02 = m0(dVar);
        d11 = a00.d.d();
        return m02 == d11 ? m02 : vz.b0.f54756a;
    }

    public final boolean E(Throwable th2) {
        return F(th2);
    }

    public final boolean F(Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.f0 f0Var;
        kotlinx.coroutines.internal.f0 f0Var2;
        kotlinx.coroutines.internal.f0 f0Var3;
        obj2 = i2.f53948a;
        if (Z() && (obj2 = H(obj)) == i2.f53949b) {
            return true;
        }
        f0Var = i2.f53948a;
        if (obj2 == f0Var) {
            obj2 = o0(obj);
        }
        f0Var2 = i2.f53948a;
        if (obj2 == f0Var2 || obj2 == i2.f53949b) {
            return true;
        }
        f0Var3 = i2.f53951d;
        if (obj2 == f0Var3) {
            return false;
        }
        z(obj2);
        return true;
    }

    @Override // v20.a2
    public final u F0(w wVar) {
        return (u) a2.a.d(this, true, false, new v(wVar), 2, null);
    }

    public void G(Throwable th2) {
        F(th2);
    }

    @Override // v20.a2
    public final g1 G0(boolean z11, boolean z12, h00.l<? super Throwable, vz.b0> lVar) {
        g2 s02 = s0(lVar, z11);
        while (true) {
            Object d02 = d0();
            if (d02 instanceof j1) {
                j1 j1Var = (j1) d02;
                if (j1Var.a()) {
                    if (f53928a.compareAndSet(this, d02, s02)) {
                        return s02;
                    }
                } else {
                    E0(j1Var);
                }
            } else {
                if (d02 instanceof v1) {
                    m2 d11 = ((v1) d02).d();
                    if (d11 == null) {
                        Objects.requireNonNull(d02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        H0((g2) d02);
                    } else {
                        g1 g1Var = n2.f53980a;
                        if (z11 && (d02 instanceof c)) {
                            synchronized (d02) {
                                r3 = ((c) d02).f();
                                if (r3 == null || ((lVar instanceof v) && !((c) d02).h())) {
                                    if (x(d02, d11, s02)) {
                                        if (r3 == null) {
                                            return s02;
                                        }
                                        g1Var = s02;
                                    }
                                }
                                vz.b0 b0Var = vz.b0.f54756a;
                            }
                        }
                        if (r3 != null) {
                            if (z12) {
                                lVar.invoke(r3);
                            }
                            return g1Var;
                        } else if (x(d02, d11, s02)) {
                            return s02;
                        }
                    }
                } else {
                    if (z12) {
                        c0 c0Var = d02 instanceof c0 ? (c0) d02 : null;
                        lVar.invoke(c0Var != null ? c0Var.f53902a : null);
                    }
                    return n2.f53980a;
                }
            }
        }
    }

    public final <T, R> void I0(kotlinx.coroutines.selects.d<? super R> dVar, h00.p<? super T, ? super zz.d<? super R>, ? extends Object> pVar) {
        Object d02;
        do {
            d02 = d0();
            if (dVar.f()) {
                return;
            }
            if (!(d02 instanceof v1)) {
                if (dVar.k()) {
                    if (d02 instanceof c0) {
                        dVar.m(((c0) d02).f53902a);
                        return;
                    } else {
                        z20.b.c(pVar, i2.h(d02), dVar.l());
                        return;
                    }
                }
                return;
            }
        } while (M0(d02) != 0);
        dVar.g(p(new u2(dVar, pVar)));
    }

    public final void J0(g2 g2Var) {
        Object d02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var;
        do {
            d02 = d0();
            if (!(d02 instanceof g2)) {
                if (!(d02 instanceof v1) || ((v1) d02).d() == null) {
                    return;
                }
                g2Var.N();
                return;
            } else if (d02 != g2Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f53928a;
                j1Var = i2.f53954g;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, d02, j1Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String K() {
        return "Job was cancelled";
    }

    public final <T, R> void K0(kotlinx.coroutines.selects.d<? super R> dVar, h00.p<? super T, ? super zz.d<? super R>, ? extends Object> pVar) {
        Object d02 = d0();
        if (d02 instanceof c0) {
            dVar.m(((c0) d02).f53902a);
        } else {
            z20.a.e(pVar, i2.h(d02), dVar.l(), null, 4, null);
        }
    }

    public final void L0(u uVar) {
        this._parentHandle = uVar;
    }

    public boolean M(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return F(th2) && Y();
    }

    protected final CancellationException O0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = K();
            }
            cancellationException = new JobCancellationException(str, th2, this);
        }
        return cancellationException;
    }

    public final String Q0() {
        return v0() + CoreConstants.CURLY_LEFT + N0(d0()) + CoreConstants.CURLY_RIGHT;
    }

    @Override // v20.p2
    public CancellationException R() {
        Throwable th2;
        Object d02 = d0();
        if (d02 instanceof c) {
            th2 = ((c) d02).f();
        } else if (d02 instanceof c0) {
            th2 = ((c0) d02).f53902a;
        } else if (d02 instanceof v1) {
            throw new IllegalStateException(kotlin.jvm.internal.s.p("Cannot be cancelling child in this state: ", d02).toString());
        } else {
            th2 = null;
        }
        CancellationException cancellationException = th2 instanceof CancellationException ? th2 : null;
        return cancellationException == null ? new JobCancellationException(kotlin.jvm.internal.s.p("Parent job is ", N0(d02)), th2, this) : cancellationException;
    }

    public boolean Y() {
        return true;
    }

    public boolean Z() {
        return false;
    }

    @Override // v20.a2
    public boolean a() {
        Object d02 = d0();
        return (d02 instanceof v1) && ((v1) d02).a();
    }

    public final u c0() {
        return (u) this._parentHandle;
    }

    public final Object d0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.a0)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.a0) obj).c(this);
        }
    }

    protected boolean f0(Throwable th2) {
        return false;
    }

    @Override // zz.g
    public <R> R fold(R r11, h00.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) a2.a.b(this, r11, pVar);
    }

    public void g0(Throwable th2) {
        throw th2;
    }

    @Override // zz.g.b, zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) a2.a.c(this, cVar);
    }

    @Override // v20.a2
    public final u20.h<a2> getChildren() {
        return u20.k.b(new e(null));
    }

    @Override // zz.g.b
    public final g.c<?> getKey() {
        return a2.f53887l1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h0(a2 a2Var) {
        if (r0.a()) {
            if (!(c0() == null)) {
                throw new AssertionError();
            }
        }
        if (a2Var == null) {
            L0(n2.f53980a);
            return;
        }
        a2Var.start();
        u F0 = a2Var.F0(this);
        L0(F0);
        if (j0()) {
            F0.dispose();
            L0(n2.f53980a);
        }
    }

    public final boolean i0() {
        Object d02 = d0();
        return (d02 instanceof c0) || ((d02 instanceof c) && ((c) d02).g());
    }

    @Override // v20.a2
    public void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(K(), null, this);
        }
        G(cancellationException);
    }

    public final boolean j0() {
        return !(d0() instanceof v1);
    }

    protected boolean k0() {
        return false;
    }

    @Override // v20.a2
    public final CancellationException m() {
        Object d02 = d0();
        if (!(d02 instanceof c)) {
            if (d02 instanceof v1) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Job is still new or active: ", this).toString());
            }
            return d02 instanceof c0 ? P0(this, ((c0) d02).f53902a, null, 1, null) : new JobCancellationException(kotlin.jvm.internal.s.p(s0.a(this), " has completed normally"), null, this);
        }
        Throwable f11 = ((c) d02).f();
        CancellationException O0 = f11 != null ? O0(f11, kotlin.jvm.internal.s.p(s0.a(this), " is cancelling")) : null;
        if (O0 != null) {
            return O0;
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.p("Job is still new or active: ", this).toString());
    }

    @Override // zz.g
    public zz.g minusKey(g.c<?> cVar) {
        return a2.a.e(this, cVar);
    }

    @Override // v20.w
    public final void n0(p2 p2Var) {
        F(p2Var);
    }

    @Override // v20.a2
    public final g1 p(h00.l<? super Throwable, vz.b0> lVar) {
        return G0(false, true, lVar);
    }

    @Override // zz.g
    public zz.g plus(zz.g gVar) {
        return a2.a.f(this, gVar);
    }

    public final boolean q0(Object obj) {
        Object T0;
        kotlinx.coroutines.internal.f0 f0Var;
        kotlinx.coroutines.internal.f0 f0Var2;
        do {
            T0 = T0(d0(), obj);
            f0Var = i2.f53948a;
            if (T0 == f0Var) {
                return false;
            }
            if (T0 == i2.f53949b) {
                return true;
            }
            f0Var2 = i2.f53950c;
        } while (T0 == f0Var2);
        z(T0);
        return true;
    }

    public final Object r0(Object obj) {
        Object T0;
        kotlinx.coroutines.internal.f0 f0Var;
        kotlinx.coroutines.internal.f0 f0Var2;
        do {
            T0 = T0(d0(), obj);
            f0Var = i2.f53948a;
            if (T0 != f0Var) {
                f0Var2 = i2.f53950c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, W(obj));
            }
        } while (T0 == f0Var2);
        return T0;
    }

    @Override // v20.a2
    public final boolean start() {
        int M0;
        do {
            M0 = M0(d0());
            if (M0 == 0) {
                return false;
            }
        } while (M0 != 1);
        return true;
    }

    public String toString() {
        return Q0() + '@' + s0.b(this);
    }

    public String v0() {
        return s0.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z(Object obj) {
    }

    protected void z0(Throwable th2) {
    }
}