package qz;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final a f48855a;

    /* loaded from: classes5.dex */
    private static final class a extends AbstractQueuedSynchronizer {
        a(int i11) {
            setState(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int e() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i11) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i11) {
            int state;
            int i12;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i12 = state - 1;
            } while (!compareAndSetState(state, i12));
            return i12 == 0;
        }
    }

    public z(int i11) {
        if (i11 >= 0) {
            this.f48855a = new a(i11);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i11 + "' is not allowed");
    }

    public void a() {
        this.f48855a.d();
    }

    public int b() {
        return this.f48855a.e();
    }

    public void c() {
        this.f48855a.f();
    }

    public boolean d(long j11, TimeUnit timeUnit) {
        return this.f48855a.tryAcquireSharedNanos(1, timeUnit.toNanos(j11));
    }

    public z() {
        this(0);
    }
}