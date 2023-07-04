package v20;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v20.x0;

/* loaded from: classes5.dex */
public abstract class l1 extends m1 implements x0 {

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f53967e = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_queue");

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f53968f = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes5.dex */
    private final class a extends c {

        /* renamed from: d  reason: collision with root package name */
        private final o<vz.b0> f53969d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j11, o<? super vz.b0> oVar) {
            super(j11);
            this.f53969d = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f53969d.v(l1.this, vz.b0.f54756a);
        }

        @Override // v20.l1.c
        public String toString() {
            return kotlin.jvm.internal.s.p(super.toString(), this.f53969d);
        }
    }

    /* loaded from: classes5.dex */
    private static final class b extends c {

        /* renamed from: d  reason: collision with root package name */
        private final Runnable f53971d;

        public b(long j11, Runnable runnable) {
            super(j11);
            this.f53971d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f53971d.run();
        }

        @Override // v20.l1.c
        public String toString() {
            return kotlin.jvm.internal.s.p(super.toString(), this.f53971d);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c implements Runnable, Comparable<c>, g1, kotlinx.coroutines.internal.l0 {

        /* renamed from: a  reason: collision with root package name */
        public long f53972a;

        /* renamed from: b  reason: collision with root package name */
        private Object f53973b;

        /* renamed from: c  reason: collision with root package name */
        private int f53974c = -1;

        public c(long j11) {
            this.f53972a = j11;
        }

        @Override // kotlinx.coroutines.internal.l0
        public void a(kotlinx.coroutines.internal.k0<?> k0Var) {
            kotlinx.coroutines.internal.f0 f0Var;
            Object obj = this.f53973b;
            f0Var = o1.f53981a;
            if (obj != f0Var) {
                this.f53973b = k0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.l0
        public kotlinx.coroutines.internal.k0<?> b() {
            Object obj = this.f53973b;
            if (obj instanceof kotlinx.coroutines.internal.k0) {
                return (kotlinx.coroutines.internal.k0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(c cVar) {
            int i11 = ((this.f53972a - cVar.f53972a) > 0L ? 1 : ((this.f53972a - cVar.f53972a) == 0L ? 0 : -1));
            if (i11 > 0) {
                return 1;
            }
            return i11 < 0 ? -1 : 0;
        }

        @Override // v20.g1
        public final synchronized void dispose() {
            kotlinx.coroutines.internal.f0 f0Var;
            kotlinx.coroutines.internal.f0 f0Var2;
            Object obj = this.f53973b;
            f0Var = o1.f53981a;
            if (obj == f0Var) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                dVar.g(this);
            }
            f0Var2 = o1.f53981a;
            this.f53973b = f0Var2;
        }

        public final synchronized int e(long j11, d dVar, l1 l1Var) {
            kotlinx.coroutines.internal.f0 f0Var;
            Object obj = this.f53973b;
            f0Var = o1.f53981a;
            if (obj == f0Var) {
                return 2;
            }
            synchronized (dVar) {
                c b11 = dVar.b();
                if (l1Var.R1()) {
                    return 1;
                }
                if (b11 == null) {
                    dVar.f53975b = j11;
                } else {
                    long j12 = b11.f53972a;
                    if (j12 - j11 < 0) {
                        j11 = j12;
                    }
                    if (j11 - dVar.f53975b > 0) {
                        dVar.f53975b = j11;
                    }
                }
                long j13 = this.f53972a;
                long j14 = dVar.f53975b;
                if (j13 - j14 < 0) {
                    this.f53972a = j14;
                }
                dVar.a(this);
                return 0;
            }
        }

        public final boolean f(long j11) {
            return j11 - this.f53972a >= 0;
        }

        @Override // kotlinx.coroutines.internal.l0
        public int getIndex() {
            return this.f53974c;
        }

        @Override // kotlinx.coroutines.internal.l0
        public void setIndex(int i11) {
            this.f53974c = i11;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f53972a + ']';
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlinx.coroutines.internal.k0<c> {

        /* renamed from: b  reason: collision with root package name */
        public long f53975b;

        public d(long j11) {
            this.f53975b = j11;
        }
    }

    private final void N1() {
        kotlinx.coroutines.internal.f0 f0Var;
        kotlinx.coroutines.internal.f0 f0Var2;
        if (r0.a() && !R1()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53967e;
                f0Var = o1.f53982b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, f0Var)) {
                    return;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.v)) {
                f0Var2 = o1.f53982b;
                if (obj == f0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.v vVar = new kotlinx.coroutines.internal.v(8, true);
                vVar.a((Runnable) obj);
                if (f53967e.compareAndSet(this, obj, vVar)) {
                    return;
                }
            } else {
                ((kotlinx.coroutines.internal.v) obj).d();
                return;
            }
        }
    }

    private final Runnable O1() {
        kotlinx.coroutines.internal.f0 f0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.v)) {
                f0Var = o1.f53982b;
                if (obj == f0Var) {
                    return null;
                }
                if (f53967e.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                kotlinx.coroutines.internal.v vVar = (kotlinx.coroutines.internal.v) obj;
                Object j11 = vVar.j();
                if (j11 != kotlinx.coroutines.internal.v.f35516h) {
                    return (Runnable) j11;
                }
                f53967e.compareAndSet(this, obj, vVar.i());
            }
        }
    }

    private final boolean Q1(Runnable runnable) {
        kotlinx.coroutines.internal.f0 f0Var;
        while (true) {
            Object obj = this._queue;
            if (R1()) {
                return false;
            }
            if (obj == null) {
                if (f53967e.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.v)) {
                f0Var = o1.f53982b;
                if (obj == f0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.v vVar = new kotlinx.coroutines.internal.v(8, true);
                vVar.a((Runnable) obj);
                vVar.a(runnable);
                if (f53967e.compareAndSet(this, obj, vVar)) {
                    return true;
                }
            } else {
                kotlinx.coroutines.internal.v vVar2 = (kotlinx.coroutines.internal.v) obj;
                int a11 = vVar2.a(runnable);
                if (a11 == 0) {
                    return true;
                }
                if (a11 == 1) {
                    f53967e.compareAndSet(this, obj, vVar2.i());
                } else if (a11 == 2) {
                    return false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean R1() {
        return this._isCompleted;
    }

    private final void T1() {
        v20.c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            c i11 = dVar == null ? null : dVar.i();
            if (i11 == null) {
                return;
            }
            K1(nanoTime, i11);
        }
    }

    private final int W1(long j11, c cVar) {
        if (R1()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            f53968f.compareAndSet(this, null, new d(j11));
            Object obj = this._delayed;
            kotlin.jvm.internal.s.e(obj);
            dVar = (d) obj;
        }
        return cVar.e(j11, dVar, this);
    }

    private final void Y1(boolean z11) {
        this._isCompleted = z11 ? 1 : 0;
    }

    private final boolean Z1(c cVar) {
        d dVar = (d) this._delayed;
        return (dVar == null ? null : dVar.e()) == cVar;
    }

    @Override // v20.j0
    public final void I0(zz.g gVar, Runnable runnable) {
        P1(runnable);
    }

    @Override // v20.x0
    public void J(long j11, o<? super vz.b0> oVar) {
        long c11 = o1.c(j11);
        if (c11 < 4611686018427387903L) {
            v20.c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c11 + nanoTime, oVar);
            r.a(oVar, aVar);
            V1(nanoTime, aVar);
        }
    }

    public void P1(Runnable runnable) {
        if (Q1(runnable)) {
            L1();
        } else {
            t0.f54000g.P1(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean S1() {
        kotlinx.coroutines.internal.f0 f0Var;
        if (v1()) {
            d dVar = (d) this._delayed;
            if (dVar == null || dVar.d()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof kotlinx.coroutines.internal.v) {
                        return ((kotlinx.coroutines.internal.v) obj).g();
                    }
                    f0Var = o1.f53982b;
                    if (obj != f0Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U1() {
        this._queue = null;
        this._delayed = null;
    }

    public final void V1(long j11, c cVar) {
        int W1 = W1(j11, cVar);
        if (W1 == 0) {
            if (Z1(cVar)) {
                L1();
            }
        } else if (W1 == 1) {
            K1(j11, cVar);
        } else if (W1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final g1 X1(long j11, Runnable runnable) {
        long c11 = o1.c(j11);
        if (c11 < 4611686018427387903L) {
            v20.c.a();
            long nanoTime = System.nanoTime();
            b bVar = new b(c11 + nanoTime, runnable);
            V1(nanoTime, bVar);
            return bVar;
        }
        return n2.f53980a;
    }

    @Override // v20.k1
    protected long b1() {
        long e11;
        kotlinx.coroutines.internal.f0 f0Var;
        if (super.b1() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.v)) {
                f0Var = o1.f53982b;
                return obj == f0Var ? Long.MAX_VALUE : 0L;
            } else if (!((kotlinx.coroutines.internal.v) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        c e12 = dVar == null ? null : dVar.e();
        if (e12 == null) {
            return Long.MAX_VALUE;
        }
        long j11 = e12.f53972a;
        v20.c.a();
        e11 = m00.l.e(j11 - System.nanoTime(), 0L);
        return e11;
    }

    @Override // v20.x0
    public g1 l(long j11, Runnable runnable, zz.g gVar) {
        return x0.a.a(this, j11, runnable, gVar);
    }

    @Override // v20.k1
    public void shutdown() {
        a3.f53889a.c();
        Y1(true);
        N1();
        do {
        } while (y1() <= 0);
        T1();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    @Override // v20.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long y1() {
        /*
            r9 = this;
            boolean r0 = r9.z1()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            v20.l1$d r0 = (v20.l1.d) r0
            if (r0 == 0) goto L45
            boolean r3 = r0.d()
            if (r3 != 0) goto L45
            v20.c.a()
            long r3 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.l0 r5 = r0.b()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r5 != 0) goto L26
            monitor-exit(r0)
            goto L3d
        L26:
            v20.l1$c r5 = (v20.l1.c) r5     // Catch: java.lang.Throwable -> L42
            boolean r7 = r5.f(r3)     // Catch: java.lang.Throwable -> L42
            r8 = 0
            if (r7 == 0) goto L34
            boolean r5 = r9.Q1(r5)     // Catch: java.lang.Throwable -> L42
            goto L35
        L34:
            r5 = r8
        L35:
            if (r5 == 0) goto L3c
            kotlinx.coroutines.internal.l0 r5 = r0.h(r8)     // Catch: java.lang.Throwable -> L42
            r6 = r5
        L3c:
            monitor-exit(r0)
        L3d:
            v20.l1$c r6 = (v20.l1.c) r6
            if (r6 != 0) goto L1c
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L45:
            java.lang.Runnable r0 = r9.O1()
            if (r0 == 0) goto L4f
            r0.run()
            return r1
        L4f:
            long r0 = r9.b1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v20.l1.y1():long");
    }
}