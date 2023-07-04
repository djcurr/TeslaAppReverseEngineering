package v20;

/* loaded from: classes5.dex */
public class c2 extends h2 implements a0 {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f53903b;

    public c2(a2 a2Var) {
        super(true);
        h0(a2Var);
        this.f53903b = W0();
    }

    private final boolean W0() {
        u c02 = c0();
        v vVar = c02 instanceof v ? (v) c02 : null;
        h2 W = vVar == null ? null : vVar.W();
        if (W == null) {
            return false;
        }
        while (!W.Y()) {
            u c03 = W.c0();
            v vVar2 = c03 instanceof v ? (v) c03 : null;
            if (vVar2 == null) {
                W = null;
                continue;
            } else {
                W = vVar2.W();
                continue;
            }
            if (W == null) {
                return false;
            }
        }
        return true;
    }

    @Override // v20.h2
    public boolean Y() {
        return this.f53903b;
    }

    @Override // v20.h2
    public boolean Z() {
        return true;
    }

    @Override // v20.a0
    public boolean g(Throwable th2) {
        return q0(new c0(th2, false, 2, null));
    }
}