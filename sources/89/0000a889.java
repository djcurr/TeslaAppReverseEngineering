package oy;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class b<T> extends AtomicInteger implements ny.c<T> {
    @Override // ny.h
    public final boolean offer(T t11) {
        throw new UnsupportedOperationException("Should not be called");
    }
}