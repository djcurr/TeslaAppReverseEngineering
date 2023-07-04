package kotlinx.coroutines.selects;

import ch.qos.logback.core.CoreConstants;
import h00.p;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.internal.s;
import v20.a2;
import v20.b2;
import v20.c0;
import v20.f0;
import v20.g1;
import v20.l0;
import v20.r0;
import vz.b0;
import vz.q;
import vz.r;
import zz.g;

/* loaded from: classes5.dex */
public final class b<R> extends q implements kotlinx.coroutines.selects.a<R>, kotlinx.coroutines.selects.d<R>, zz.d<R>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f35577e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35578f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_result");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _result;
    volatile /* synthetic */ Object _state = e.e();

    /* renamed from: d  reason: collision with root package name */
    private final zz.d<R> f35579d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlinx.coroutines.internal.d<Object> {

        /* renamed from: b  reason: collision with root package name */
        public final b<?> f35580b;

        /* renamed from: c  reason: collision with root package name */
        public final kotlinx.coroutines.internal.b f35581c;

        /* renamed from: d  reason: collision with root package name */
        private final long f35582d;

        public a(b<?> bVar, kotlinx.coroutines.internal.b bVar2) {
            f fVar;
            this.f35580b = bVar;
            this.f35581c = bVar2;
            fVar = e.f35590e;
            this.f35582d = fVar.a();
            bVar2.d(this);
        }

        private final void j(Object obj) {
            boolean z11 = obj == null;
            if (b.f35577e.compareAndSet(this.f35580b, this, z11 ? null : e.e()) && z11) {
                this.f35580b.Y();
            }
        }

        private final Object k() {
            b<?> bVar = this.f35580b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof a0) {
                    ((a0) obj).c(this.f35580b);
                } else if (obj == e.e()) {
                    if (b.f35577e.compareAndSet(this.f35580b, e.e(), this)) {
                        return null;
                    }
                } else {
                    return e.d();
                }
            }
        }

        private final void l() {
            b.f35577e.compareAndSet(this.f35580b, this, e.e());
        }

        @Override // kotlinx.coroutines.internal.d
        public void d(Object obj, Object obj2) {
            j(obj2);
            this.f35581c.a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.d
        public long g() {
            return this.f35582d;
        }

        @Override // kotlinx.coroutines.internal.d
        public Object i(Object obj) {
            Object k11;
            if (obj != null || (k11 = k()) == null) {
                try {
                    return this.f35581c.c(this);
                } catch (Throwable th2) {
                    if (obj == null) {
                        l();
                    }
                    throw th2;
                }
            }
            return k11;
        }

        @Override // kotlinx.coroutines.internal.a0
        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.selects.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0674b extends s {

        /* renamed from: d  reason: collision with root package name */
        public final g1 f35583d;

        public C0674b(g1 g1Var) {
            this.f35583d = g1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final s.c f35584a;

        public c(s.c cVar) {
            this.f35584a = cVar;
        }

        @Override // kotlinx.coroutines.internal.a0
        public kotlinx.coroutines.internal.d<?> a() {
            return this.f35584a.a();
        }

        @Override // kotlinx.coroutines.internal.a0
        public Object c(Object obj) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            b bVar = (b) obj;
            this.f35584a.d();
            Object e11 = this.f35584a.a().e(null);
            b.f35577e.compareAndSet(bVar, this, e11 == null ? this.f35584a.f35507c : e.e());
            return e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class d extends b2 {
        public d() {
        }

        @Override // v20.e0
        public void V(Throwable th2) {
            if (b.this.k()) {
                b.this.m(W().m());
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
            V(th2);
            return b0.f54756a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(zz.d<? super R> dVar) {
        Object obj;
        this.f35579d = dVar;
        obj = e.f35588c;
        this._result = obj;
        this._parentHandle = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        g1 Z = Z();
        if (Z != null) {
            Z.dispose();
        }
        for (s sVar = (s) F(); !kotlin.jvm.internal.s.c(sVar, this); sVar = sVar.G()) {
            if (sVar instanceof C0674b) {
                ((C0674b) sVar).f35583d.dispose();
            }
        }
    }

    private final g1 Z() {
        return (g1) this._parentHandle;
    }

    private final void d0() {
        a2 a2Var = (a2) getContext().get(a2.f53887l1);
        if (a2Var == null) {
            return;
        }
        g1 d11 = a2.a.d(a2Var, true, false, new d(), 2, null);
        f0(d11);
        if (f()) {
            d11.dispose();
        }
    }

    private final void f0(g1 g1Var) {
        this._parentHandle = g1Var;
    }

    public final Object b0() {
        Object obj;
        Object obj2;
        Object obj3;
        Object d11;
        Object d12;
        if (!f()) {
            d0();
        }
        Object obj4 = this._result;
        obj = e.f35588c;
        if (obj4 == obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35578f;
            obj3 = e.f35588c;
            d11 = a00.d.d();
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, d11)) {
                d12 = a00.d.d();
                return d12;
            }
            obj4 = this._result;
        }
        obj2 = e.f35589d;
        if (obj4 != obj2) {
            if (obj4 instanceof c0) {
                throw ((c0) obj4).f53902a;
            }
            return obj4;
        }
        throw new IllegalStateException("Already resumed");
    }

    public final void c0(Throwable th2) {
        if (k()) {
            q.a aVar = vz.q.f54772b;
            resumeWith(vz.q.b(r.a(th2)));
        } else if (th2 instanceof CancellationException) {
        } else {
            Object b02 = b0();
            if (b02 instanceof c0) {
                Throwable th3 = ((c0) b02).f53902a;
                if (r0.d()) {
                    th3 = e0.n(th3);
                }
                if (th3 == (!r0.d() ? th2 : e0.n(th2))) {
                    return;
                }
            }
            l0.a(getContext(), th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <Q> void e(kotlinx.coroutines.selects.c<? extends Q> cVar, p<? super Q, ? super zz.d<? super R>, ? extends Object> pVar) {
        cVar.n(this, pVar);
    }

    @Override // kotlinx.coroutines.selects.d
    public boolean f() {
        while (true) {
            Object obj = this._state;
            if (obj == e.e()) {
                return false;
            }
            if (!(obj instanceof a0)) {
                return true;
            }
            ((a0) obj).c(this);
        }
    }

    @Override // kotlinx.coroutines.selects.d
    public void g(g1 g1Var) {
        C0674b c0674b = new C0674b(g1Var);
        if (!f()) {
            x(c0674b);
            if (!f()) {
                return;
            }
        }
        g1Var.dispose();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zz.d<R> dVar = this.f35579d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // zz.d
    public g getContext() {
        return this.f35579d.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        return v20.q.f53988a;
     */
    @Override // kotlinx.coroutines.selects.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(kotlinx.coroutines.internal.s.c r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = kotlinx.coroutines.selects.e.e()
            r2 = 0
            if (r0 != r1) goto L37
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.b.f35577e
            java.lang.Object r1 = kotlinx.coroutines.selects.e.e()
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 != 0) goto L31
            goto L0
        L18:
            kotlinx.coroutines.selects.b$c r0 = new kotlinx.coroutines.selects.b$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.b.f35577e
            java.lang.Object r2 = kotlinx.coroutines.selects.e.e()
            boolean r1 = r1.compareAndSet(r3, r2, r0)
            if (r1 != 0) goto L2a
            goto L0
        L2a:
            java.lang.Object r4 = r0.c(r3)
            if (r4 == 0) goto L31
            return r4
        L31:
            r3.Y()
            kotlinx.coroutines.internal.f0 r4 = v20.q.f53988a
            return r4
        L37:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.a0
            if (r1 == 0) goto L6b
            if (r4 == 0) goto L65
            kotlinx.coroutines.internal.d r1 = r4.a()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.b.a
            if (r2 == 0) goto L59
            r2 = r1
            kotlinx.coroutines.selects.b$a r2 = (kotlinx.coroutines.selects.b.a) r2
            kotlinx.coroutines.selects.b<?> r2 = r2.f35580b
            if (r2 == r3) goto L4d
            goto L59
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L59:
            r2 = r0
            kotlinx.coroutines.internal.a0 r2 = (kotlinx.coroutines.internal.a0) r2
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L65
            java.lang.Object r4 = kotlinx.coroutines.internal.c.f35451b
            return r4
        L65:
            kotlinx.coroutines.internal.a0 r0 = (kotlinx.coroutines.internal.a0) r0
            r0.c(r3)
            goto L0
        L6b:
            if (r4 != 0) goto L6e
            return r2
        L6e:
            kotlinx.coroutines.internal.s$a r4 = r4.f35507c
            if (r0 != r4) goto L75
            kotlinx.coroutines.internal.f0 r4 = v20.q.f53988a
            return r4
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.b.j(kotlinx.coroutines.internal.s$c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.d
    public boolean k() {
        Object j11 = j(null);
        if (j11 == v20.q.f53988a) {
            return true;
        }
        if (j11 == null) {
            return false;
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.p("Unexpected trySelectIdempotent result ", j11).toString());
    }

    @Override // kotlinx.coroutines.selects.d
    public zz.d<R> l() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.d
    public void m(Throwable th2) {
        Object obj;
        Object obj2;
        Object d11;
        Object d12;
        Object obj3;
        zz.d c11;
        if (r0.a() && !f()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj4 = this._result;
            obj = e.f35588c;
            if (obj4 == obj) {
                zz.d<R> dVar = this.f35579d;
                c0 c0Var = new c0((r0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) ? e0.j(th2, (kotlin.coroutines.jvm.internal.e) dVar) : th2, false, 2, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35578f;
                obj2 = e.f35588c;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0Var)) {
                    return;
                }
            } else {
                d11 = a00.d.d();
                if (obj4 == d11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f35578f;
                    d12 = a00.d.d();
                    obj3 = e.f35589d;
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, d12, obj3)) {
                        c11 = a00.c.c(this.f35579d);
                        q.a aVar = vz.q.f54772b;
                        c11.resumeWith(vz.q.b(r.a(th2)));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.d
    public Object n(kotlinx.coroutines.internal.b bVar) {
        return new a(this, bVar).c(null);
    }

    @Override // zz.d
    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        Object d11;
        Object d12;
        Object obj4;
        if (r0.a() && !f()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj5 = this._result;
            obj2 = e.f35588c;
            if (obj5 == obj2) {
                Object d13 = f0.d(obj, null, 1, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35578f;
                obj3 = e.f35588c;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, d13)) {
                    return;
                }
            } else {
                d11 = a00.d.d();
                if (obj5 == d11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f35578f;
                    d12 = a00.d.d();
                    obj4 = e.f35589d;
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, d12, obj4)) {
                        if (vz.q.g(obj)) {
                            zz.d<R> dVar = this.f35579d;
                            Throwable e11 = vz.q.e(obj);
                            kotlin.jvm.internal.s.e(e11);
                            q.a aVar = vz.q.f54772b;
                            if (r0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                                e11 = e0.j(e11, (kotlin.coroutines.jvm.internal.e) dVar);
                            }
                            dVar.resumeWith(vz.q.b(r.a(e11)));
                            return;
                        }
                        this.f35579d.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // kotlinx.coroutines.internal.s
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}