package v20;

import java.util.concurrent.Future;

/* loaded from: classes5.dex */
final class f1 implements g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Future<?> f53920a;

    public f1(Future<?> future) {
        this.f53920a = future;
    }

    @Override // v20.g1
    public void dispose() {
        this.f53920a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f53920a + ']';
    }
}