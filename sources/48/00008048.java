package kotlinx.coroutines.sync;

import h00.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.s;
import v20.g1;
import v20.o;
import v20.q;
import vz.b0;

/* loaded from: classes5.dex */
public final class c implements kotlinx.coroutines.sync.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f35593a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class a extends b {

        /* renamed from: f  reason: collision with root package name */
        private final o<b0> f35594f;

        /* renamed from: kotlinx.coroutines.sync.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0675a extends u implements l<Throwable, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f35596a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f35597b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0675a(c cVar, a aVar) {
                super(1);
                this.f35596a = cVar;
                this.f35597b = aVar;
            }

            public final void a(Throwable th2) {
                this.f35596a.c(this.f35597b.f35599d);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
                a(th2);
                return b0.f54756a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, o<? super b0> oVar) {
            super(c.this, obj);
            this.f35594f = oVar;
        }

        @Override // kotlinx.coroutines.sync.c.b
        public void V() {
            this.f35594f.U(q.f53988a);
        }

        @Override // kotlinx.coroutines.sync.c.b
        public boolean X() {
            return W() && this.f35594f.o(b0.f54756a, null, new C0675a(c.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.s
        public String toString() {
            return "LockCont[" + this.f35599d + ", " + this.f35594f + "] for " + c.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public abstract class b extends s implements g1 {

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f35598e = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");

        /* renamed from: d  reason: collision with root package name */
        public final Object f35599d;
        private volatile /* synthetic */ int isTaken = 0;

        public b(c cVar, Object obj) {
            this.f35599d = obj;
        }

        public abstract void V();

        public final boolean W() {
            return f35598e.compareAndSet(this, 0, 1);
        }

        public abstract boolean X();

        @Override // v20.g1
        public final void dispose() {
            N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.sync.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0676c extends kotlinx.coroutines.internal.q {

        /* renamed from: d  reason: collision with root package name */
        public Object f35600d;

        public C0676c(Object obj) {
            this.f35600d = obj;
        }

        @Override // kotlinx.coroutines.internal.s
        public String toString() {
            return "LockedQueue[" + this.f35600d + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlinx.coroutines.internal.d<c> {

        /* renamed from: b  reason: collision with root package name */
        public final C0676c f35601b;

        public d(C0676c c0676c) {
            this.f35601b = c0676c;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: j */
        public void d(c cVar, Object obj) {
            c.f35593a.compareAndSet(cVar, this, obj == null ? kotlinx.coroutines.sync.d.f35608e : this.f35601b);
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: k */
        public Object i(c cVar) {
            f0 f0Var;
            if (this.f35601b.V()) {
                return null;
            }
            f0Var = kotlinx.coroutines.sync.d.f35604a;
            return f0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends u implements l<Throwable, b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f35603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(1);
            this.f35603b = obj;
        }

        public final void a(Throwable th2) {
            c.this.c(this.f35603b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
            a(th2);
            return b0.f54756a;
        }
    }

    public c(boolean z11) {
        this._state = z11 ? kotlinx.coroutines.sync.d.f35607d : kotlinx.coroutines.sync.d.f35608e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        v20.r.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object d(java.lang.Object r7, zz.d<? super vz.b0> r8) {
        /*
            r6 = this;
            zz.d r0 = a00.b.c(r8)
            v20.p r0 = v20.r.b(r0)
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.a
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.a r3 = (kotlinx.coroutines.sync.a) r3
            java.lang.Object r4 = r3.f35592a
            kotlinx.coroutines.internal.f0 r5 = kotlinx.coroutines.sync.d.f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.c.f35593a
            kotlinx.coroutines.sync.c$c r5 = new kotlinx.coroutines.sync.c$c
            java.lang.Object r3 = r3.f35592a
            r5.<init>(r3)
            r4.compareAndSet(r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.a r3 = kotlinx.coroutines.sync.d.c()
            goto L37
        L32:
            kotlinx.coroutines.sync.a r3 = new kotlinx.coroutines.sync.a
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.c.f35593a
            boolean r2 = r4.compareAndSet(r6, r2, r3)
            if (r2 == 0) goto Ld
            vz.b0 r1 = vz.b0.f54756a
            kotlinx.coroutines.sync.c$e r2 = new kotlinx.coroutines.sync.c$e
            r2.<init>(r7)
            r0.S(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.c.C0676c
            if (r3 == 0) goto L98
            r3 = r2
            kotlinx.coroutines.sync.c$c r3 = (kotlinx.coroutines.sync.c.C0676c) r3
            java.lang.Object r4 = r3.f35600d
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.x(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.W()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            v20.r.c(r0, r1)
        L71:
            java.lang.Object r7 = r0.s()
            java.lang.Object r0 = a00.b.d()
            if (r7 != r0) goto L7e
            kotlin.coroutines.jvm.internal.h.c(r8)
        L7e:
            java.lang.Object r8 = a00.b.d()
            if (r7 != r8) goto L85
            return r7
        L85:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        L88:
            java.lang.String r8 = "Already locked by "
            java.lang.String r7 = kotlin.jvm.internal.s.p(r8, r7)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L98:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.a0
            if (r3 == 0) goto La3
            kotlinx.coroutines.internal.a0 r2 = (kotlinx.coroutines.internal.a0) r2
            r2.c(r6)
            goto Ld
        La3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Illegal state "
            java.lang.String r8 = kotlin.jvm.internal.s.p(r8, r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.c.d(java.lang.Object, zz.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.b
    public boolean a(Object obj) {
        f0 f0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                Object obj3 = ((kotlinx.coroutines.sync.a) obj2).f35592a;
                f0Var = kotlinx.coroutines.sync.d.f35606c;
                if (obj3 != f0Var) {
                    return false;
                }
                if (f35593a.compareAndSet(this, obj2, obj == null ? kotlinx.coroutines.sync.d.f35607d : new kotlinx.coroutines.sync.a(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C0676c) {
                if (((C0676c) obj2).f35600d != obj) {
                    return false;
                }
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Already locked by ", obj).toString());
            } else if (!(obj2 instanceof a0)) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Illegal state ", obj2).toString());
            } else {
                ((a0) obj2).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.b
    public Object b(Object obj, zz.d<? super b0> dVar) {
        Object d11;
        if (a(obj)) {
            return b0.f54756a;
        }
        Object d12 = d(obj, dVar);
        d11 = a00.d.d();
        return d12 == d11 ? d12 : b0.f54756a;
    }

    @Override // kotlinx.coroutines.sync.b
    public void c(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        f0 f0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                if (obj == null) {
                    Object obj3 = ((kotlinx.coroutines.sync.a) obj2).f35592a;
                    f0Var = kotlinx.coroutines.sync.d.f35606c;
                    if (!(obj3 != f0Var)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) obj2;
                    if (!(aVar2.f35592a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar2.f35592a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35593a;
                aVar = kotlinx.coroutines.sync.d.f35608e;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                    return;
                }
            } else if (obj2 instanceof a0) {
                ((a0) obj2).c(this);
            } else if (obj2 instanceof C0676c) {
                if (obj != null) {
                    C0676c c0676c = (C0676c) obj2;
                    if (!(c0676c.f35600d == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c0676c.f35600d + " but expected " + obj).toString());
                    }
                }
                C0676c c0676c2 = (C0676c) obj2;
                s O = c0676c2.O();
                if (O == null) {
                    d dVar = new d(c0676c2);
                    if (f35593a.compareAndSet(this, obj2, dVar) && dVar.c(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) O;
                    if (bVar.X()) {
                        Object obj4 = bVar.f35599d;
                        if (obj4 == null) {
                            obj4 = kotlinx.coroutines.sync.d.f35605b;
                        }
                        c0676c2.f35600d = obj4;
                        bVar.V();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Illegal state ", obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.a) {
                return "Mutex[" + ((kotlinx.coroutines.sync.a) obj).f35592a + ']';
            } else if (!(obj instanceof a0)) {
                if (obj instanceof C0676c) {
                    return "Mutex[" + ((C0676c) obj).f35600d + ']';
                }
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Illegal state ", obj).toString());
            } else {
                ((a0) obj).c(this);
            }
        }
    }
}