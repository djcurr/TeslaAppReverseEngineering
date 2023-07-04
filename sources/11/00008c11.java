package net.time4j;

import net.time4j.engine.q;

/* loaded from: classes5.dex */
final class r<T extends net.time4j.engine.q<T>> implements net.time4j.engine.u<T> {

    /* renamed from: a  reason: collision with root package name */
    private final char f41499a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f41500b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(char c11, boolean z11) {
        this.f41499a = c11;
        this.f41500b = z11;
    }

    @Override // net.time4j.engine.u
    /* renamed from: a */
    public T apply(T t11) {
        if (this.f41499a == '9') {
            return t11;
        }
        k0<Integer, h0> k0Var = h0.H;
        int intValue = ((Integer) t11.l(k0Var)).intValue();
        int intValue2 = ((Integer) t11.e(k0Var)).intValue();
        char c11 = this.f41499a;
        if (c11 == '3') {
            return (T) t11.x(k0Var, Math.min(intValue2, ((intValue / 1000000) * 1000000) + (this.f41500b ? 999999 : 0)));
        } else if (c11 == '6') {
            return (T) t11.x(k0Var, Math.min(intValue2, ((intValue / 1000) * 1000) + (this.f41500b ? 999 : 0)));
        } else {
            throw new UnsupportedOperationException("Unknown: " + this.f41499a);
        }
    }
}