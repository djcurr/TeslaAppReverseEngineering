package net.time4j.engine;

import net.time4j.engine.m;

/* loaded from: classes5.dex */
public abstract class m<U, D extends m<U, D>> extends i0<U, D> implements g {
    private k<D> K() {
        return r().m();
    }

    private <T> T P(k<T> kVar, String str) {
        long b11 = b();
        if (kVar.c() <= b11 && kVar.a() >= b11) {
            return kVar.b(b11);
        }
        throw new ArithmeticException("Cannot transform <" + b11 + "> to: " + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int I(g gVar) {
        int i11 = (b() > gVar.b() ? 1 : (b() == gVar.b() ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        return i11 == 0 ? 0 : 1;
    }

    @Override // net.time4j.engine.i0, java.lang.Comparable
    /* renamed from: J */
    public int compareTo(D d11) {
        if (r().p() == d11.r().p()) {
            return I(d11);
        }
        throw new ClassCastException("Cannot compare different types of dates, use instance of EpochDays as comparator instead.");
    }

    public boolean M(g gVar) {
        return I(gVar) > 0;
    }

    public boolean N(g gVar) {
        return I(gVar) < 0;
    }

    public D O(h hVar) {
        long f11 = net.time4j.base.c.f(b(), hVar.b());
        try {
            return K().b(f11);
        } catch (IllegalArgumentException e11) {
            ArithmeticException arithmeticException = new ArithmeticException("Out of range: " + f11);
            arithmeticException.initCause(e11);
            throw arithmeticException;
        }
    }

    public <T extends l<T>> T Q(Class<T> cls, String str) {
        String name = cls.getName();
        w x11 = w.x(cls);
        if (x11 != null) {
            return (T) P(x11.o(str), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    public <T extends m<?, T>> T S(Class<T> cls) {
        String name = cls.getName();
        w x11 = w.x(cls);
        if (x11 != null) {
            return (T) P(x11.m(), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    public long b() {
        return K().transform((D) s());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            return r().p() == mVar.r().p() && b() == mVar.b();
        }
        return false;
    }

    public int hashCode() {
        long b11 = b();
        return (int) (b11 ^ (b11 >>> 32));
    }
}