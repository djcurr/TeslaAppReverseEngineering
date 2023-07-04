package k20;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class d0 implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.a, m20.i {

    /* renamed from: a */
    private int f34233a;

    private d0() {
    }

    public /* synthetic */ d0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int F0() {
        if (f0.a(this)) {
            return super.hashCode();
        }
        return (((H0().hashCode() * 31) + G0().hashCode()) * 31) + (I0() ? 1 : 0);
    }

    public abstract List<y0> G0();

    public abstract w0 H0();

    public abstract boolean I0();

    public abstract d0 J0(kotlin.reflect.jvm.internal.impl.types.checker.h hVar);

    public abstract j1 K0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return I0() == d0Var.I0() && kotlin.reflect.jvm.internal.impl.types.checker.s.f35178a.a(K0(), d0Var.K0());
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f34233a;
        if (i11 != 0) {
            return i11;
        }
        int F0 = F0();
        this.f34233a = F0;
        return F0;
    }

    public abstract d20.h m();
}