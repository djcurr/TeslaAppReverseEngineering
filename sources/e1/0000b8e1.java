package v20;

/* loaded from: classes5.dex */
public abstract class l2 extends j0 {
    @Override // v20.j0
    public j0 Q0(int i11) {
        kotlinx.coroutines.internal.p.a(i11);
        return this;
    }

    public abstract l2 R0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String S0() {
        l2 l2Var;
        l2 c11 = e1.c();
        if (this == c11) {
            return "Dispatchers.Main";
        }
        try {
            l2Var = c11.R0();
        } catch (UnsupportedOperationException unused) {
            l2Var = null;
        }
        if (this == l2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // v20.j0
    public String toString() {
        String S0 = S0();
        if (S0 == null) {
            return s0.a(this) + '@' + s0.b(this);
        }
        return S0;
    }
}