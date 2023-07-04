package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v20.r0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35572b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35573c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35574d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35575e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<h> f35576a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ h b(n nVar, h hVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return nVar.a(hVar, z11);
    }

    private final h c(h hVar) {
        if (hVar.f35561b.b() == 1) {
            f35575e.incrementAndGet(this);
        }
        if (e() == 127) {
            return hVar;
        }
        int i11 = this.producerIndex & 127;
        while (this.f35576a.get(i11) != null) {
            Thread.yield();
        }
        this.f35576a.lazySet(i11, hVar);
        f35573c.incrementAndGet(this);
        return null;
    }

    private final void d(h hVar) {
        if (hVar != null) {
            if (hVar.f35561b.b() == 1) {
                int decrementAndGet = f35575e.decrementAndGet(this);
                if (r0.a()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final h i() {
        h andSet;
        while (true) {
            int i11 = this.consumerIndex;
            if (i11 - this.producerIndex == 0) {
                return null;
            }
            int i12 = i11 & 127;
            if (f35574d.compareAndSet(this, i11, i11 + 1) && (andSet = this.f35576a.getAndSet(i12, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h i11 = i();
        if (i11 == null) {
            return false;
        }
        dVar.a(i11);
        return true;
    }

    private final long m(n nVar, boolean z11) {
        h hVar;
        do {
            hVar = (h) nVar.lastScheduledTask;
            if (hVar == null) {
                return -2L;
            }
            if (z11) {
                if (!(hVar.f35561b.b() == 1)) {
                    return -2L;
                }
            }
            long a11 = l.f35568e.a() - hVar.f35560a;
            long j11 = l.f35564a;
            if (a11 < j11) {
                return j11 - a11;
            }
        } while (!f35572b.compareAndSet(nVar, hVar, null));
        b(this, hVar, false, 2, null);
        return -1L;
    }

    public final h a(h hVar, boolean z11) {
        if (z11) {
            return c(hVar);
        }
        h hVar2 = (h) f35572b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return c(hVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        h hVar = (h) f35572b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h h() {
        h hVar = (h) f35572b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final long k(n nVar) {
        if (r0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        int i11 = nVar.producerIndex;
        AtomicReferenceArray<h> atomicReferenceArray = nVar.f35576a;
        for (int i12 = nVar.consumerIndex; i12 != i11; i12++) {
            int i13 = i12 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            h hVar = atomicReferenceArray.get(i13);
            if (hVar != null) {
                if ((hVar.f35561b.b() == 1) && atomicReferenceArray.compareAndSet(i13, hVar, null)) {
                    f35575e.decrementAndGet(nVar);
                    b(this, hVar, false, 2, null);
                    return -1L;
                }
            }
        }
        return m(nVar, true);
    }

    public final long l(n nVar) {
        if (r0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        h i11 = nVar.i();
        if (i11 != null) {
            h b11 = b(this, i11, false, 2, null);
            if (r0.a()) {
                if (b11 == null) {
                    return -1L;
                }
                throw new AssertionError();
            }
            return -1L;
        }
        return m(nVar, false);
    }
}