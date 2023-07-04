package v20;

import java.util.concurrent.Future;

/* loaded from: classes5.dex */
final class l extends m {

    /* renamed from: a  reason: collision with root package name */
    private final Future<?> f53966a;

    public l(Future<?> future) {
        this.f53966a = future;
    }

    @Override // v20.n
    public void a(Throwable th2) {
        if (th2 != null) {
            this.f53966a.cancel(false);
        }
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        a(th2);
        return vz.b0.f54756a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f53966a + ']';
    }
}