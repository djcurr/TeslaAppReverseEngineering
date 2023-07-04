package xy;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public abstract class b<T> extends AtomicLong implements ny.e<T> {
    @Override // ny.h
    public final boolean offer(T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}