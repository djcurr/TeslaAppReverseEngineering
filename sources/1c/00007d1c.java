package k20;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class l1 extends d0 {
    public l1() {
        super(null);
    }

    @Override // k20.d0
    public List<y0> G0() {
        return L0().G0();
    }

    @Override // k20.d0
    public w0 H0() {
        return L0().H0();
    }

    @Override // k20.d0
    public boolean I0() {
        return L0().I0();
    }

    @Override // k20.d0
    public final j1 K0() {
        d0 L0 = L0();
        while (L0 instanceof l1) {
            L0 = ((l1) L0).L0();
        }
        return (j1) L0;
    }

    protected abstract d0 L0();

    public boolean M0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return L0().getAnnotations();
    }

    @Override // k20.d0
    public d20.h m() {
        return L0().m();
    }

    public String toString() {
        return M0() ? L0().toString() : "<Not computed yet>";
    }
}