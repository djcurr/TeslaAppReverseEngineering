package kotlinx.coroutines.scheduling;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.f0;
import v20.r0;
import v20.s0;
import vz.b0;

/* loaded from: classes5.dex */
public final class a implements Executor, Closeable {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f35531h;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f35532i;

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35533j;

    /* renamed from: k  reason: collision with root package name */
    public static final f0 f35534k;
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f35535a;

    /* renamed from: b  reason: collision with root package name */
    public final int f35536b;

    /* renamed from: c  reason: collision with root package name */
    public final long f35537c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f35538d;

    /* renamed from: e  reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f35539e;

    /* renamed from: f  reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f35540f;

    /* renamed from: g  reason: collision with root package name */
    public final c0<c> f35541g;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0673a {
        private C0673a() {
        }

        public /* synthetic */ C0673a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35542a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f35542a = iArr;
        }
    }

    /* loaded from: classes5.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        new C0673a(null);
        f35534k = new f0("NOT_IN_STACK");
        f35531h = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
        f35532i = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
        f35533j = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    }

    public a(int i11, int i12, long j11, String str) {
        this.f35535a = i11;
        this.f35536b = i12;
        this.f35537c = j11;
        this.f35538d = str;
        if (!(i11 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i11 + " should be at least 1").toString());
        }
        if (!(i12 >= i11)) {
            throw new IllegalArgumentException(("Max pool size " + i12 + " should be greater than or equals to core pool size " + i11).toString());
        }
        if (!(i12 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i12 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j11 > 0) {
            this.f35539e = new kotlinx.coroutines.scheduling.d();
            this.f35540f = new kotlinx.coroutines.scheduling.d();
            this.parkedWorkersStack = 0L;
            this.f35541g = new c0<>(i11 + 1);
            this.controlState = i11 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j11 + " must be positive").toString());
    }

    private final int C(c cVar) {
        Object h11 = cVar.h();
        while (h11 != f35534k) {
            if (h11 == null) {
                return 0;
            }
            c cVar2 = (c) h11;
            int g11 = cVar2.g();
            if (g11 != 0) {
                return g11;
            }
            h11 = cVar2.h();
        }
        return -1;
    }

    private final boolean C0() {
        c D;
        do {
            D = D();
            if (D == null) {
                return false;
            }
        } while (!c.f35543h.compareAndSet(D, -1, 0));
        LockSupport.unpark(D);
        return true;
    }

    private final c D() {
        while (true) {
            long j11 = this.parkedWorkersStack;
            c b11 = this.f35541g.b((int) (2097151 & j11));
            if (b11 == null) {
                return null;
            }
            long j12 = (2097152 + j11) & (-2097152);
            int C = C(b11);
            if (C >= 0 && f35531h.compareAndSet(this, j11, C | j12)) {
                b11.p(f35534k);
                return b11;
            }
        }
    }

    private final boolean a(h hVar) {
        if (hVar.f35561b.b() == 1) {
            return this.f35540f.a(hVar);
        }
        return this.f35539e.a(hVar);
    }

    private final void e0(boolean z11) {
        long addAndGet = f35532i.addAndGet(this, 2097152L);
        if (z11 || C0() || t0(addAndGet)) {
            return;
        }
        C0();
    }

    private final int g() {
        int d11;
        synchronized (this.f35541g) {
            if (isTerminated()) {
                return -1;
            }
            long j11 = this.controlState;
            int i11 = (int) (j11 & 2097151);
            d11 = m00.l.d(i11 - ((int) ((j11 & 4398044413952L) >> 21)), 0);
            if (d11 >= this.f35535a) {
                return 0;
            }
            if (i11 >= this.f35536b) {
                return 0;
            }
            int i12 = ((int) (this.controlState & 2097151)) + 1;
            if (i12 > 0 && this.f35541g.b(i12) == null) {
                c cVar = new c(i12);
                this.f35541g.c(i12, cVar);
                if (i12 == ((int) (2097151 & f35532i.incrementAndGet(this)))) {
                    cVar.start();
                    return d11 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final c l() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && s.c(a.this, this)) {
            return cVar;
        }
        return null;
    }

    public static /* synthetic */ void p(a aVar, Runnable runnable, i iVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            iVar = l.f35569f;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        aVar.m(runnable, iVar, z11);
    }

    private final h p0(c cVar, h hVar, boolean z11) {
        if (cVar == null || cVar.f35545b == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f35561b.b() == 0 && cVar.f35545b == d.BLOCKING) {
            return hVar;
        }
        cVar.f35549f = true;
        return cVar.f35544a.a(hVar, z11);
    }

    private final boolean t0(long j11) {
        int d11;
        d11 = m00.l.d(((int) (2097151 & j11)) - ((int) ((j11 & 4398044413952L) >> 21)), 0);
        if (d11 < this.f35535a) {
            int g11 = g();
            if (g11 == 1 && this.f35535a > 1) {
                g();
            }
            if (g11 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean u0(a aVar, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aVar.controlState;
        }
        return aVar.t0(j11);
    }

    public final boolean J(c cVar) {
        long j11;
        long j12;
        int g11;
        if (cVar.h() != f35534k) {
            return false;
        }
        do {
            j11 = this.parkedWorkersStack;
            int i11 = (int) (2097151 & j11);
            j12 = (2097152 + j11) & (-2097152);
            g11 = cVar.g();
            if (r0.a()) {
                if (!(g11 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.p(this.f35541g.b(i11));
        } while (!f35531h.compareAndSet(this, j11, g11 | j12));
        return true;
    }

    public final void L(c cVar, int i11, int i12) {
        while (true) {
            long j11 = this.parkedWorkersStack;
            int i13 = (int) (2097151 & j11);
            long j12 = (2097152 + j11) & (-2097152);
            if (i13 == i11) {
                i13 = i12 == 0 ? C(cVar) : i12;
            }
            if (i13 >= 0 && f35531h.compareAndSet(this, j11, j12 | i13)) {
                return;
            }
        }
    }

    public final void R(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void a0(long j11) {
        int i11;
        if (f35533j.compareAndSet(this, 0, 1)) {
            c l11 = l();
            synchronized (this.f35541g) {
                i11 = (int) (this.controlState & 2097151);
            }
            if (1 <= i11) {
                int i12 = 1;
                while (true) {
                    int i13 = i12 + 1;
                    c b11 = this.f35541g.b(i12);
                    s.e(b11);
                    c cVar = b11;
                    if (cVar != l11) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j11);
                        }
                        d dVar = cVar.f35545b;
                        if (r0.a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f35544a.g(this.f35540f);
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12 = i13;
                }
            }
            this.f35540f.b();
            this.f35539e.b();
            while (true) {
                h f11 = l11 == null ? null : l11.f(true);
                if (f11 == null && (f11 = this.f35539e.d()) == null && (f11 = this.f35540f.d()) == null) {
                    break;
                }
                R(f11);
            }
            if (l11 != null) {
                l11.s(d.TERMINATED);
            }
            if (r0.a()) {
                if (!(((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f35535a)) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a0(AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        p(this, runnable, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final h j(Runnable runnable, i iVar) {
        long a11 = l.f35568e.a();
        if (runnable instanceof h) {
            h hVar = (h) runnable;
            hVar.f35560a = a11;
            hVar.f35561b = iVar;
            return hVar;
        }
        return new k(runnable, a11, iVar);
    }

    public final void m(Runnable runnable, i iVar, boolean z11) {
        v20.c.a();
        h j11 = j(runnable, iVar);
        c l11 = l();
        h p02 = p0(l11, j11, z11);
        if (p02 != null && !a(p02)) {
            throw new RejectedExecutionException(s.p(this.f35538d, " was terminated"));
        }
        boolean z12 = z11 && l11 != null;
        if (j11.f35561b.b() != 0) {
            e0(z12);
        } else if (z12) {
        } else {
            n0();
        }
    }

    public final void n0() {
        if (C0() || u0(this, 0L, 1, null)) {
            return;
        }
        C0();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a11 = this.f35541g.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i16 < a11) {
            int i17 = i16 + 1;
            c b11 = this.f35541g.b(i16);
            if (b11 != null) {
                int f11 = b11.f35544a.f();
                int i18 = b.f35542a[b11.f35545b.ordinal()];
                if (i18 == 1) {
                    i13++;
                } else if (i18 == 2) {
                    i12++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f11);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i18 == 3) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(f11);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i18 == 4) {
                    i14++;
                    if (f11 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(f11);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i18 == 5) {
                    i15++;
                }
            }
            i16 = i17;
        }
        long j11 = this.controlState;
        return this.f35538d + '@' + s0.b(this) + "[Pool Size {core = " + this.f35535a + ", max = " + this.f35536b + "}, Worker States {CPU = " + i11 + ", blocking = " + i12 + ", parked = " + i13 + ", dormant = " + i14 + ", terminated = " + i15 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f35539e.c() + ", global blocking queue size = " + this.f35540f.c() + ", Control State {created workers= " + ((int) (2097151 & j11)) + ", blocking tasks = " + ((int) ((4398044413952L & j11) >> 21)) + ", CPUs acquired = " + (this.f35535a - ((int) ((9223367638808264704L & j11) >> 42))) + "}]";
    }

    /* loaded from: classes5.dex */
    public final class c extends Thread {

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f35543h = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final n f35544a;

        /* renamed from: b  reason: collision with root package name */
        public d f35545b;

        /* renamed from: c  reason: collision with root package name */
        private long f35546c;

        /* renamed from: d  reason: collision with root package name */
        private long f35547d;

        /* renamed from: e  reason: collision with root package name */
        private int f35548e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f35549f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f35544a = new n();
            this.f35545b = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f35534k;
            this.f35548e = k00.c.f34202a.c();
        }

        private final void b(int i11) {
            if (i11 == 0) {
                return;
            }
            a.f35532i.addAndGet(a.this, -2097152L);
            d dVar = this.f35545b;
            if (dVar != d.TERMINATED) {
                if (r0.a()) {
                    if (!(dVar == d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f35545b = d.DORMANT;
            }
        }

        private final void c(int i11) {
            if (i11 != 0 && s(d.BLOCKING)) {
                a.this.n0();
            }
        }

        private final void d(h hVar) {
            int b11 = hVar.f35561b.b();
            i(b11);
            c(b11);
            a.this.R(hVar);
            b(b11);
        }

        private final h e(boolean z11) {
            h m11;
            h m12;
            if (z11) {
                boolean z12 = k(a.this.f35535a * 2) == 0;
                if (z12 && (m12 = m()) != null) {
                    return m12;
                }
                h h11 = this.f35544a.h();
                if (h11 != null) {
                    return h11;
                }
                if (!z12 && (m11 = m()) != null) {
                    return m11;
                }
            } else {
                h m13 = m();
                if (m13 != null) {
                    return m13;
                }
            }
            return t(false);
        }

        private final void i(int i11) {
            this.f35546c = 0L;
            if (this.f35545b == d.PARKING) {
                if (r0.a()) {
                    if (!(i11 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f35545b = d.BLOCKING;
            }
        }

        private final boolean j() {
            return this.nextParkedWorker != a.f35534k;
        }

        private final void l() {
            if (this.f35546c == 0) {
                this.f35546c = System.nanoTime() + a.this.f35537c;
            }
            LockSupport.parkNanos(a.this.f35537c);
            if (System.nanoTime() - this.f35546c >= 0) {
                this.f35546c = 0L;
                u();
            }
        }

        private final h m() {
            if (k(2) == 0) {
                h d11 = a.this.f35539e.d();
                return d11 == null ? a.this.f35540f.d() : d11;
            }
            h d12 = a.this.f35540f.d();
            return d12 == null ? a.this.f35539e.d() : d12;
        }

        private final void n() {
            loop0: while (true) {
                boolean z11 = false;
                while (!a.this.isTerminated() && this.f35545b != d.TERMINATED) {
                    h f11 = f(this.f35549f);
                    if (f11 != null) {
                        this.f35547d = 0L;
                        d(f11);
                    } else {
                        this.f35549f = false;
                        if (this.f35547d == 0) {
                            r();
                        } else if (z11) {
                            s(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f35547d);
                            this.f35547d = 0L;
                        } else {
                            z11 = true;
                        }
                    }
                }
            }
            s(d.TERMINATED);
        }

        private final boolean q() {
            boolean z11;
            if (this.f35545b != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j11 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j11) >> 42)) != 0) {
                        if (a.f35532i.compareAndSet(aVar, j11, j11 - 4398046511104L)) {
                            z11 = true;
                            break;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    return false;
                }
                this.f35545b = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void r() {
            if (!j()) {
                a.this.J(this);
                return;
            }
            if (r0.a()) {
                if (!(this.f35544a.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (j() && this.workerCtl == -1 && !a.this.isTerminated() && this.f35545b != d.TERMINATED) {
                s(d.PARKING);
                Thread.interrupted();
                l();
            }
        }

        private final h t(boolean z11) {
            long l11;
            if (r0.a()) {
                if (!(this.f35544a.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i11 = (int) (a.this.controlState & 2097151);
            if (i11 < 2) {
                return null;
            }
            int k11 = k(i11);
            a aVar = a.this;
            int i12 = 0;
            long j11 = Long.MAX_VALUE;
            while (i12 < i11) {
                i12++;
                k11++;
                if (k11 > i11) {
                    k11 = 1;
                }
                c b11 = aVar.f35541g.b(k11);
                if (b11 != null && b11 != this) {
                    if (r0.a()) {
                        if (!(this.f35544a.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z11) {
                        l11 = this.f35544a.k(b11.f35544a);
                    } else {
                        l11 = this.f35544a.l(b11.f35544a);
                    }
                    if (l11 == -1) {
                        return this.f35544a.h();
                    }
                    if (l11 > 0) {
                        j11 = Math.min(j11, l11);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f35547d = j11;
            return null;
        }

        private final void u() {
            a aVar = a.this;
            synchronized (aVar.f35541g) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f35535a) {
                    return;
                }
                if (f35543h.compareAndSet(this, -1, 1)) {
                    int g11 = g();
                    o(0);
                    aVar.L(this, g11, 0);
                    int andDecrement = (int) (a.f35532i.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != g11) {
                        c b11 = aVar.f35541g.b(andDecrement);
                        s.e(b11);
                        c cVar = b11;
                        aVar.f35541g.c(g11, cVar);
                        cVar.o(g11);
                        aVar.L(cVar, andDecrement, g11);
                    }
                    aVar.f35541g.c(andDecrement, null);
                    b0 b0Var = b0.f54756a;
                    this.f35545b = d.TERMINATED;
                }
            }
        }

        public final h f(boolean z11) {
            h d11;
            if (q()) {
                return e(z11);
            }
            if (z11) {
                d11 = this.f35544a.h();
                if (d11 == null) {
                    d11 = a.this.f35540f.d();
                }
            } else {
                d11 = a.this.f35540f.d();
            }
            return d11 == null ? t(true) : d11;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final int k(int i11) {
            int i12 = this.f35548e;
            int i13 = i12 ^ (i12 << 13);
            int i14 = i13 ^ (i13 >> 17);
            int i15 = i14 ^ (i14 << 5);
            this.f35548e = i15;
            int i16 = i11 - 1;
            return (i16 & i11) == 0 ? i15 & i16 : (i15 & Integer.MAX_VALUE) % i11;
        }

        public final void o(int i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f35538d);
            sb2.append("-worker-");
            sb2.append(i11 == 0 ? "TERMINATED" : String.valueOf(i11));
            setName(sb2.toString());
            this.indexInArray = i11;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean s(d dVar) {
            d dVar2 = this.f35545b;
            boolean z11 = dVar2 == d.CPU_ACQUIRED;
            if (z11) {
                a.f35532i.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f35545b = dVar;
            }
            return z11;
        }

        public c(int i11) {
            this();
            o(i11);
        }
    }
}