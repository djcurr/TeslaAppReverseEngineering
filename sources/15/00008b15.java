package net.time4j.engine;

import java.util.Objects;
import java.util.Set;
import net.time4j.engine.q;

/* loaded from: classes5.dex */
public abstract class q<T extends q<T>> implements o {
    public T A(u<T> uVar) {
        return uVar.apply(s());
    }

    @Override // net.time4j.engine.o
    public boolean c() {
        return false;
    }

    @Override // net.time4j.engine.o
    public <V> V e(p<V> pVar) {
        return u(pVar).getMaximum(s());
    }

    @Override // net.time4j.engine.o
    public <V> V f(p<V> pVar) {
        return u(pVar).getMinimum(s());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.o
    public int h(p<Integer> pVar) {
        b0<T> s11 = r().s(pVar);
        try {
            if (s11 == null) {
                return ((Integer) l(pVar)).intValue();
            }
            return s11.b(s());
        } catch (ChronoException unused) {
            return Integer.MIN_VALUE;
        }
    }

    @Override // net.time4j.engine.o
    public <V> V l(p<V> pVar) {
        return u(pVar).getValue(s());
    }

    @Override // net.time4j.engine.o
    public net.time4j.tz.k o() {
        throw new ChronoException("Timezone not available: " + this);
    }

    @Override // net.time4j.engine.o
    public boolean q(p<?> pVar) {
        return r().w(pVar);
    }

    public abstract w<T> r();

    public T s() {
        w<T> r11 = r();
        Class<T> p11 = r11.p();
        if (p11.isInstance(this)) {
            return p11.cast(this);
        }
        for (p<?> pVar : r11.t()) {
            if (p11 == pVar.getType()) {
                return p11.cast(l(pVar));
            }
        }
        throw new IllegalStateException("Implementation error: Cannot find entity context.");
    }

    public Set<p<?>> t() {
        return r().t();
    }

    public <V> y<T, V> u(p<V> pVar) {
        return r().u(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean v(p<Long> pVar, long j11) {
        return w(pVar, Long.valueOf(j11));
    }

    public <V> boolean w(p<V> pVar, V v11) {
        Objects.requireNonNull(pVar, "Missing chronological element.");
        return q(pVar) && u(pVar).isValid(s(), v11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T x(p<Integer> pVar, int i11) {
        b0<T> s11 = r().s(pVar);
        if (s11 != null) {
            return s11.a(s(), i11, pVar.isLenient());
        }
        return z(pVar, Integer.valueOf(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T y(p<Long> pVar, long j11) {
        return z(pVar, Long.valueOf(j11));
    }

    public <V> T z(p<V> pVar, V v11) {
        return u(pVar).withValue(s(), v11, pVar.isLenient());
    }
}