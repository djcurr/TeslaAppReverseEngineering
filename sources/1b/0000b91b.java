package v20;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
final class y1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54015f = AtomicIntegerFieldUpdater.newUpdater(y1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: e  reason: collision with root package name */
    private final h00.l<Throwable, vz.b0> f54016e;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(h00.l<? super Throwable, vz.b0> lVar) {
        this.f54016e = lVar;
    }

    @Override // v20.e0
    public void V(Throwable th2) {
        if (f54015f.compareAndSet(this, 0, 1)) {
            this.f54016e.invoke(th2);
        }
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        V(th2);
        return vz.b0.f54756a;
    }
}