package kotlinx.coroutines.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v20.r0;
import v20.s0;

/* loaded from: classes5.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f35500a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f35501b = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_prev");

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35502c = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes5.dex */
    public static abstract class a extends kotlinx.coroutines.internal.b {
        @Override // kotlinx.coroutines.internal.b
        public final void a(kotlinx.coroutines.internal.d<?> dVar, Object obj) {
            boolean z11 = obj == null;
            s h11 = h();
            if (h11 == null) {
                if (r0.a() && !(!z11)) {
                    throw new AssertionError();
                }
                return;
            }
            s i11 = i();
            if (i11 == null) {
                if (r0.a() && !(!z11)) {
                    throw new AssertionError();
                }
                return;
            }
            if (s.f35500a.compareAndSet(h11, dVar, z11 ? n(h11, i11) : i11) && z11) {
                f(h11, i11);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
            if (v20.r0.a() == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
            if (r4 != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
            if (r7 == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
            return null;
         */
        @Override // kotlinx.coroutines.internal.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(kotlinx.coroutines.internal.d<?> r7) {
            /*
                r6 = this;
            L0:
                kotlinx.coroutines.internal.s r0 = r6.m(r7)
                if (r0 != 0) goto L9
                java.lang.Object r7 = kotlinx.coroutines.internal.c.f35451b
                return r7
            L9:
                java.lang.Object r1 = r0._next
                r2 = 0
                if (r1 != r7) goto Lf
                return r2
            Lf:
                boolean r3 = r7.h()
                if (r3 == 0) goto L16
                return r2
            L16:
                boolean r3 = r1 instanceof kotlinx.coroutines.internal.a0
                if (r3 == 0) goto L29
                kotlinx.coroutines.internal.a0 r1 = (kotlinx.coroutines.internal.a0) r1
                boolean r2 = r7.b(r1)
                if (r2 == 0) goto L25
                java.lang.Object r7 = kotlinx.coroutines.internal.c.f35451b
                return r7
            L25:
                r1.c(r0)
                goto L0
            L29:
                java.lang.Object r3 = r6.e(r0)
                if (r3 == 0) goto L30
                return r3
            L30:
                boolean r3 = r6.l(r0, r1)
                if (r3 == 0) goto L37
                goto L0
            L37:
                kotlinx.coroutines.internal.s$c r3 = new kotlinx.coroutines.internal.s$c
                r4 = r1
                kotlinx.coroutines.internal.s r4 = (kotlinx.coroutines.internal.s) r4
                r3.<init>(r0, r4, r6)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.s.f35500a
                boolean r4 = r4.compareAndSet(r0, r1, r3)
                if (r4 == 0) goto L0
                java.lang.Object r4 = r3.c(r0)     // Catch: java.lang.Throwable -> L65
                java.lang.Object r5 = kotlinx.coroutines.internal.t.f35511a     // Catch: java.lang.Throwable -> L65
                if (r4 != r5) goto L50
                goto L0
            L50:
                boolean r7 = v20.r0.a()     // Catch: java.lang.Throwable -> L65
                if (r7 == 0) goto L64
                if (r4 != 0) goto L5a
                r7 = 1
                goto L5b
            L5a:
                r7 = 0
            L5b:
                if (r7 == 0) goto L5e
                goto L64
            L5e:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
                r7.<init>()     // Catch: java.lang.Throwable -> L65
                throw r7     // Catch: java.lang.Throwable -> L65
            L64:
                return r2
            L65:
                r7 = move-exception
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.s.f35500a
                r2.compareAndSet(r0, r3, r1)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.s.a.c(kotlinx.coroutines.internal.d):java.lang.Object");
        }

        protected abstract Object e(s sVar);

        protected abstract void f(s sVar, s sVar2);

        public abstract void g(c cVar);

        protected abstract s h();

        protected abstract s i();

        public Object j(c cVar) {
            g(cVar);
            return null;
        }

        public void k(s sVar) {
        }

        protected abstract boolean l(s sVar, Object obj);

        protected abstract s m(a0 a0Var);

        public abstract Object n(s sVar, s sVar2);
    }

    /* loaded from: classes5.dex */
    public static abstract class b extends kotlinx.coroutines.internal.d<s> {

        /* renamed from: b  reason: collision with root package name */
        public final s f35503b;

        /* renamed from: c  reason: collision with root package name */
        public s f35504c;

        public b(s sVar) {
            this.f35503b = sVar;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: j */
        public void d(s sVar, Object obj) {
            boolean z11 = obj == null;
            s sVar2 = z11 ? this.f35503b : this.f35504c;
            if (sVar2 != null && s.f35500a.compareAndSet(sVar, this, sVar2) && z11) {
                s sVar3 = this.f35503b;
                s sVar4 = this.f35504c;
                kotlin.jvm.internal.s.e(sVar4);
                sVar3.E(sVar4);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final s f35505a;

        /* renamed from: b  reason: collision with root package name */
        public final s f35506b;

        /* renamed from: c  reason: collision with root package name */
        public final a f35507c;

        public c(s sVar, s sVar2, a aVar) {
            this.f35505a = sVar;
            this.f35506b = sVar2;
            this.f35507c = aVar;
        }

        @Override // kotlinx.coroutines.internal.a0
        public kotlinx.coroutines.internal.d<?> a() {
            return this.f35507c.b();
        }

        @Override // kotlinx.coroutines.internal.a0
        public Object c(Object obj) {
            Object f11;
            Object obj2;
            if (r0.a()) {
                if (!(obj == this.f35505a)) {
                    throw new AssertionError();
                }
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            s sVar = (s) obj;
            Object j11 = this.f35507c.j(this);
            Object obj3 = t.f35511a;
            if (j11 == obj3) {
                s sVar2 = this.f35506b;
                if (s.f35500a.compareAndSet(sVar, this, sVar2.Q())) {
                    this.f35507c.k(sVar);
                    sVar2.A(null);
                }
                return obj3;
            }
            if (j11 != null) {
                f11 = a().e(j11);
            } else {
                f11 = a().f();
            }
            if (f11 == kotlinx.coroutines.internal.c.f35450a) {
                obj2 = a();
            } else if (f11 == null) {
                obj2 = this.f35507c.n(sVar, this.f35506b);
            } else {
                obj2 = this.f35506b;
            }
            s.f35500a.compareAndSet(sVar, this, obj2);
            return null;
        }

        public final void d() {
            this.f35507c.g(this);
        }

        @Override // kotlinx.coroutines.internal.a0
        public String toString() {
            return "PrepareOp(op=" + a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes5.dex */
    public static class d<T> extends a {

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f35508c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_affectedNode");

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f35509d = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b  reason: collision with root package name */
        public final s f35510b;

        public d(s sVar) {
            this.f35510b = sVar;
        }

        @Override // kotlinx.coroutines.internal.s.a
        protected Object e(s sVar) {
            if (sVar == this.f35510b) {
                return r.b();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.s.a
        protected final void f(s sVar, s sVar2) {
            sVar2.A(null);
        }

        @Override // kotlinx.coroutines.internal.s.a
        public void g(c cVar) {
            f35508c.compareAndSet(this, null, cVar.f35505a);
            f35509d.compareAndSet(this, null, cVar.f35506b);
        }

        @Override // kotlinx.coroutines.internal.s.a
        protected final s h() {
            return (s) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.s.a
        protected final s i() {
            return (s) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.s.a
        protected final boolean l(s sVar, Object obj) {
            if (obj instanceof b0) {
                ((b0) obj).f35449a.K();
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.internal.s.a
        protected final s m(a0 a0Var) {
            s sVar = this.f35510b;
            while (true) {
                Object obj = sVar._next;
                if (obj instanceof a0) {
                    a0 a0Var2 = (a0) obj;
                    if (a0Var.b(a0Var2)) {
                        return null;
                    }
                    a0Var2.c(this.f35510b);
                } else {
                    return (s) obj;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.s.a
        public final Object n(s sVar, s sVar2) {
            return sVar2.Q();
        }

        public final T o() {
            T t11 = (T) h();
            kotlin.jvm.internal.s.e(t11);
            return t11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (kotlinx.coroutines.internal.s.f35500a.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.b0) r4).f35449a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.s A(kotlinx.coroutines.internal.a0 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.s r0 = (kotlinx.coroutines.internal.s) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.s.f35501b
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.M()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.a0
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.a0 r0 = (kotlinx.coroutines.internal.a0) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.a0 r4 = (kotlinx.coroutines.internal.a0) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.b0
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.s.f35500a
            kotlinx.coroutines.internal.b0 r4 = (kotlinx.coroutines.internal.b0) r4
            kotlinx.coroutines.internal.s r4 = r4.f35449a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.s r2 = (kotlinx.coroutines.internal.s) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.s r3 = (kotlinx.coroutines.internal.s) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.s.A(kotlinx.coroutines.internal.a0):kotlinx.coroutines.internal.s");
    }

    private final s B(s sVar) {
        while (sVar.M()) {
            sVar = (s) sVar._prev;
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(s sVar) {
        s sVar2;
        do {
            sVar2 = (s) sVar._prev;
            if (F() != sVar) {
                return;
            }
        } while (!f35501b.compareAndSet(sVar, sVar2, this));
        if (M()) {
            sVar.A(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 Q() {
        b0 b0Var = (b0) this._removedRef;
        if (b0Var == null) {
            b0 b0Var2 = new b0(this);
            f35502c.lazySet(this, b0Var2);
            return b0Var2;
        }
        return b0Var;
    }

    public final Object F() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof a0)) {
                return obj;
            }
            ((a0) obj).c(this);
        }
    }

    public final s G() {
        return r.c(F());
    }

    public final s H() {
        s A = A(null);
        return A == null ? B((s) this._prev) : A;
    }

    public final void I() {
        ((b0) F()).f35449a.K();
    }

    public final void K() {
        s sVar = this;
        while (true) {
            Object F = sVar.F();
            if (!(F instanceof b0)) {
                sVar.A(null);
                return;
            }
            sVar = ((b0) F).f35449a;
        }
    }

    public boolean M() {
        return F() instanceof b0;
    }

    public boolean N() {
        return P() == null;
    }

    public final s O() {
        while (true) {
            s sVar = (s) F();
            if (sVar == this) {
                return null;
            }
            if (sVar.N()) {
                return sVar;
            }
            sVar.I();
        }
    }

    public final s P() {
        Object F;
        s sVar;
        do {
            F = F();
            if (F instanceof b0) {
                return ((b0) F).f35449a;
            }
            if (F == this) {
                return (s) F;
            }
            sVar = (s) F;
        } while (!f35500a.compareAndSet(this, F, sVar.Q()));
        sVar.A(null);
        return null;
    }

    public final int R(s sVar, s sVar2, b bVar) {
        f35501b.lazySet(sVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35500a;
        atomicReferenceFieldUpdater.lazySet(sVar, sVar2);
        bVar.f35504c = sVar2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, sVar2, bVar)) {
            return bVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new kotlin.jvm.internal.d0(this) { // from class: kotlinx.coroutines.internal.s.e
            @Override // n00.n
            public Object get() {
                return s0.a(this.receiver);
            }
        } + '@' + s0.b(this);
    }

    public final void x(s sVar) {
        do {
        } while (!H().y(sVar, this));
    }

    public final boolean y(s sVar, s sVar2) {
        f35501b.lazySet(sVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35500a;
        atomicReferenceFieldUpdater.lazySet(sVar, sVar2);
        if (atomicReferenceFieldUpdater.compareAndSet(this, sVar2, sVar)) {
            sVar.E(sVar2);
            return true;
        }
        return false;
    }

    public final boolean z(s sVar) {
        f35501b.lazySet(sVar, this);
        f35500a.lazySet(sVar, this);
        while (F() == this) {
            if (f35500a.compareAndSet(this, this, sVar)) {
                sVar.E(this);
                return true;
            }
        }
        return false;
    }
}