package kotlinx.coroutines.internal;

import v20.g1;
import v20.u0;
import v20.x0;

/* loaded from: classes5.dex */
public final class o extends v20.j0 implements Runnable, x0 {

    /* renamed from: b  reason: collision with root package name */
    private final v20.j0 f35493b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35494c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ x0 f35495d;

    /* renamed from: e  reason: collision with root package name */
    private final u<Runnable> f35496e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f35497f;
    private volatile int runningWorkers;

    public o(v20.j0 j0Var, int i11) {
        this.f35493b = j0Var;
        this.f35494c = i11;
        x0 x0Var = j0Var instanceof x0 ? (x0) j0Var : null;
        this.f35495d = x0Var == null ? u0.a() : x0Var;
        this.f35496e = new u<>(false);
        this.f35497f = new Object();
    }

    private final boolean R0(Runnable runnable) {
        this.f35496e.a(runnable);
        return this.runningWorkers >= this.f35494c;
    }

    private final boolean S0() {
        synchronized (this.f35497f) {
            if (this.runningWorkers >= this.f35494c) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // v20.j0
    public void I0(zz.g gVar, Runnable runnable) {
        if (!R0(runnable) && S0()) {
            this.f35493b.I0(this, this);
        }
    }

    @Override // v20.x0
    public void J(long j11, v20.o<? super vz.b0> oVar) {
        this.f35495d.J(j11, oVar);
    }

    @Override // v20.j0
    public void J0(zz.g gVar, Runnable runnable) {
        if (!R0(runnable) && S0()) {
            this.f35493b.J0(this, this);
        }
    }

    @Override // v20.j0
    public v20.j0 Q0(int i11) {
        p.a(i11);
        return i11 >= this.f35494c ? this : super.Q0(i11);
    }

    @Override // v20.x0
    public g1 l(long j11, Runnable runnable, zz.g gVar) {
        return this.f35495d.l(j11, runnable, gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f35497f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f35496e.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = vz.b0.f54756a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.u<java.lang.Runnable> r2 = r4.f35496e
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            zz.h r3 = zz.h.f61280a
            v20.l0.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            v20.j0 r2 = r4.f35493b
            boolean r2 = r2.P0(r4)
            if (r2 == 0) goto L2
            v20.j0 r0 = r4.f35493b
            r0.I0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f35497f
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.u<java.lang.Runnable> r2 = r4.f35496e     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            vz.b0 r2 = vz.b0.f54756a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.o.run():void");
    }
}