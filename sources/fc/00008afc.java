package net.time4j.engine;

import java.util.Objects;
import net.time4j.engine.q;

/* loaded from: classes5.dex */
public final class e0<T extends q<T>> implements u<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f40949a;

    /* renamed from: b  reason: collision with root package name */
    private final p<?> f40950b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f40951c;

    private e0(int i11, p<?> pVar) {
        this(i11, pVar, null);
    }

    private static <U, T extends i0<U, T>> T a(i0<U, T> i0Var, p<?> pVar, boolean z11) {
        U E = i0Var.r().E(pVar);
        if (z11) {
            return i0Var.G(1L, E);
        }
        return i0Var.F(1L, E);
    }

    public static <T extends q<T>> u<T> c(p<?> pVar) {
        return new e0(4, pVar);
    }

    public static <T extends q<T>> u<T> d(p<?> pVar) {
        return new e0(3, pVar);
    }

    private <V> T e(q<T> qVar, p<V> pVar) {
        T s11 = qVar.s();
        while (true) {
            pVar = (p<V>) s11.r().u(pVar).getChildAtCeiling(s11);
            if (pVar == null) {
                return s11;
            }
            s11 = q(s11, pVar);
        }
    }

    public static <T extends q<T>> u<T> f(p<?> pVar) {
        return new e0(6, pVar);
    }

    private <V> T g(q<T> qVar, p<V> pVar) {
        T s11 = qVar.s();
        while (true) {
            pVar = (p<V>) s11.r().u(pVar).getChildAtFloor(s11);
            if (pVar == null) {
                return s11;
            }
            s11 = r(s11, pVar);
        }
    }

    public static <T extends q<T>> u<T> h(p<?> pVar) {
        return new e0(7, pVar);
    }

    private <V> T i(q<T> qVar, p<V> pVar) {
        return qVar.z(pVar, qVar.e(pVar));
    }

    public static <T extends q<T>> u<T> j(p<?> pVar) {
        return new e0(2, pVar);
    }

    private <V> T k(q<T> qVar, p<V> pVar) {
        return qVar.z(pVar, qVar.f(pVar));
    }

    public static <T extends q<T>> u<T> l(p<?> pVar) {
        return new e0(1, pVar);
    }

    private T m(T t11, boolean z11) {
        if (t11 instanceof i0) {
            return t11.r().p().cast(a((i0) i0.class.cast(t11), this.f40950b, z11));
        }
        throw new ChronoException("Base units not supported by: " + t11.r().p());
    }

    public static <T extends q<T>, V> u<T> n(V v11, p<V> pVar) {
        return new e0(0, pVar, v11);
    }

    public static <T extends q<T>, V> u<T> o(V v11, p<V> pVar) {
        return new e0(5, pVar, v11);
    }

    private <V> T p(q<T> qVar, p<V> pVar, Object obj, boolean z11) {
        T s11 = qVar.s();
        return s11.r().u(pVar).withValue(s11, pVar.getType().cast(obj), z11);
    }

    private <V> T q(T t11, p<V> pVar) {
        y<T, V> u11 = t11.r().u(pVar);
        return u11.withValue(t11, u11.getMaximum(t11), pVar.isLenient());
    }

    private <V> T r(T t11, p<V> pVar) {
        y<T, V> u11 = t11.r().u(pVar);
        return u11.withValue(t11, u11.getMinimum(t11), pVar.isLenient());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.u
    /* renamed from: b */
    public T apply(T t11) {
        switch (this.f40949a) {
            case 0:
                return p(t11, this.f40950b, this.f40951c, false);
            case 1:
                return k(t11, this.f40950b);
            case 2:
                return i(t11, this.f40950b);
            case 3:
                return g(t11, this.f40950b);
            case 4:
                return e(t11, this.f40950b);
            case 5:
                return p(t11, this.f40950b, this.f40951c, true);
            case 6:
                return m(t11, false);
            case 7:
                return m(t11, true);
            default:
                throw new UnsupportedOperationException("Unknown mode: " + this.f40949a);
        }
    }

    private e0(int i11, p<?> pVar, Object obj) {
        Objects.requireNonNull(pVar, "Missing chronological element.");
        this.f40949a = i11;
        this.f40950b = pVar;
        this.f40951c = obj;
    }
}