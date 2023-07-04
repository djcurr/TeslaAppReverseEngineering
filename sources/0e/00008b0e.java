package net.time4j.engine;

import java.io.Serializable;
import net.time4j.engine.l;

/* loaded from: classes5.dex */
public abstract class l<D extends l<D>> extends q<D> implements g, m0, Comparable<D>, Serializable {
    private <T> T G(k<T> kVar, String str) {
        long b11 = b();
        if (kVar.c() <= b11 && kVar.a() >= b11) {
            return kVar.b(b11);
        }
        throw new ArithmeticException("Cannot transform <" + b11 + "> to: " + str);
    }

    @Override // java.lang.Comparable
    /* renamed from: B */
    public int compareTo(D d11) {
        int i11 = (b() > d11.b() ? 1 : (b() == d11.b() ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        if (i11 > 0) {
            return 1;
        }
        return i().compareTo(d11.i());
    }

    protected k<D> D() {
        return r().o(i());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* renamed from: E */
    public abstract j<D> r();

    public D F(h hVar) {
        long f11 = net.time4j.base.c.f(b(), hVar.b());
        try {
            return D().b(f11);
        } catch (IllegalArgumentException e11) {
            ArithmeticException arithmeticException = new ArithmeticException("Out of range: " + f11);
            arithmeticException.initCause(e11);
            throw arithmeticException;
        }
    }

    public <T extends m<?, T>> T H(Class<T> cls) {
        String name = cls.getName();
        w x11 = w.x(cls);
        if (x11 != null) {
            return (T) G(x11.m(), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    @Override // net.time4j.engine.g
    public long b() {
        return D().transform((D) s());
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.engine.q
    public <V> y<D, V> u(p<V> pVar) {
        if (pVar instanceof z) {
            return ((z) z.class.cast(pVar)).derive(D());
        }
        return super.u(pVar);
    }
}