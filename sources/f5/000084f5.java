package ly;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class d extends AtomicReference<iy.b> implements iy.b {
    public d() {
    }

    public boolean a(iy.b bVar) {
        return a.replace(this, bVar);
    }

    @Override // iy.b
    public void dispose() {
        a.dispose(this);
    }

    @Override // iy.b
    public boolean isDisposed() {
        return a.isDisposed(get());
    }

    public d(iy.b bVar) {
        lazySet(bVar);
    }
}