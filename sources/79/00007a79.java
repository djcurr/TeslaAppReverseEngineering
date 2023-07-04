package iy;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
abstract class d<T> extends AtomicReference<T> implements b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(T t11) {
        super(t11);
        Objects.requireNonNull(t11, "value is null");
    }

    protected abstract void a(T t11);

    @Override // iy.b
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // iy.b
    public final boolean isDisposed() {
        return get() == null;
    }
}