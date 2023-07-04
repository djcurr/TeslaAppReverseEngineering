package kotlinx.coroutines.internal;

import v20.s0;

/* loaded from: classes5.dex */
public abstract class a0 {
    public abstract d<?> a();

    public final boolean b(a0 a0Var) {
        d<?> a11;
        d<?> a12 = a();
        return (a12 == null || (a11 = a0Var.a()) == null || a12.g() >= a11.g()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return s0.a(this) + '@' + s0.b(this);
    }
}