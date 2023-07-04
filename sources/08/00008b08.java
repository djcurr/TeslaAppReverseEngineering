package net.time4j.engine;

import java.io.Serializable;
import net.time4j.engine.i0;

/* loaded from: classes5.dex */
public abstract class i0<U, T extends i0<U, T>> extends q<T> implements Comparable<T>, Serializable {
    private k0<T> E(U u11) {
        return r().I(u11);
    }

    @Override // java.lang.Comparable
    /* renamed from: B */
    public abstract int compareTo(T t11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* renamed from: D */
    public abstract f0<U, T> r();

    public T F(long j11, U u11) {
        return G(net.time4j.base.c.k(j11), u11);
    }

    public T G(long j11, U u11) {
        if (j11 == 0) {
            return (T) s();
        }
        try {
            return E(u11).b((T) s(), j11);
        } catch (IllegalArgumentException e11) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e11);
            throw arithmeticException;
        }
    }

    public long H(T t11, U u11) {
        return E(u11).a((T) s(), t11);
    }
}