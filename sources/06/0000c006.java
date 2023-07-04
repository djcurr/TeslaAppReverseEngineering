package xy;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class a<T> extends AtomicInteger implements ny.e<T> {
    @Override // ny.h
    public final boolean offer(T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}