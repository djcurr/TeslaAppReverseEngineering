package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.i0;
import v20.j0;
import v20.q1;

/* loaded from: classes5.dex */
public final class b extends q1 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final b f35551b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final j0 f35552c;

    static {
        int d11;
        int d12;
        m mVar = m.f35571b;
        d11 = m00.l.d(64, g0.a());
        d12 = i0.d("kotlinx.coroutines.io.parallelism", d11, 0, 0, 12, null);
        f35552c = mVar.Q0(d12);
    }

    private b() {
    }

    @Override // v20.j0
    public void I0(zz.g gVar, Runnable runnable) {
        f35552c.I0(gVar, runnable);
    }

    @Override // v20.j0
    public void J0(zz.g gVar, Runnable runnable) {
        f35552c.J0(gVar, runnable);
    }

    @Override // v20.j0
    public j0 Q0(int i11) {
        return m.f35571b.Q0(i11);
    }

    @Override // v20.q1
    public Executor R0() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        I0(zz.h.f61280a, runnable);
    }

    @Override // v20.j0
    public String toString() {
        return "Dispatchers.IO";
    }
}