package v5;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.s;
import okio.e0;
import okio.l;
import v20.o;
import vz.b0;

/* loaded from: classes.dex */
public final class i extends l implements h00.l<Throwable, b0> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f54070a;

    /* renamed from: b  reason: collision with root package name */
    private final Thread f54071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o<?> continuation, e0 delegate) {
        super(delegate);
        int i11;
        s.g(continuation, "continuation");
        s.g(delegate, "delegate");
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.f54070a = atomicInteger;
        this.f54071b = Thread.currentThread();
        continuation.T(this);
        do {
            i11 = atomicInteger.get();
            if (i11 != 1) {
                if (i11 == 3 || i11 == 4 || i11 == 5) {
                    return;
                }
                g(i11);
                throw new KotlinNothingValueException();
            }
        } while (!this.f54070a.compareAndSet(i11, 1));
    }

    private final Void g(int i11) {
        throw new IllegalStateException(("Illegal state: " + i11).toString());
    }

    private final void l(boolean z11) {
        AtomicInteger atomicInteger = this.f54070a;
        while (true) {
            int i11 = atomicInteger.get();
            if (i11 == 0 || i11 == 1) {
                if (this.f54070a.compareAndSet(i11, 1 ^ (z11 ? 1 : 0))) {
                    return;
                }
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 == 5) {
                        Thread.interrupted();
                        return;
                    } else {
                        g(i11);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (this.f54070a.compareAndSet(i11, 4)) {
                this.f54071b.interrupt();
                this.f54070a.set(5);
                return;
            }
        }
    }

    public final void a() {
        AtomicInteger atomicInteger = this.f54070a;
        while (true) {
            int i11 = atomicInteger.get();
            if (i11 == 0 || i11 == 3) {
                if (this.f54070a.compareAndSet(i11, 2)) {
                    return;
                }
            } else if (i11 != 4) {
                if (i11 == 5) {
                    Thread.interrupted();
                    return;
                } else {
                    g(i11);
                    throw new KotlinNothingValueException();
                }
            }
        }
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
        j(th2);
        return b0.f54756a;
    }

    public void j(Throwable th2) {
        AtomicInteger atomicInteger = this.f54070a;
        while (true) {
            int i11 = atomicInteger.get();
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
                        return;
                    }
                    g(i11);
                    throw new KotlinNothingValueException();
                } else if (this.f54070a.compareAndSet(i11, 3)) {
                    return;
                }
            } else if (this.f54070a.compareAndSet(i11, 4)) {
                this.f54071b.interrupt();
                this.f54070a.set(5);
                return;
            }
        }
    }

    @Override // okio.l, okio.e0
    public long read(okio.f sink, long j11) {
        s.g(sink, "sink");
        try {
            l(false);
            return super.read(sink, j11);
        } finally {
            l(true);
        }
    }
}