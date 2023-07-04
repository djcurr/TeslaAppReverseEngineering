package u50;

/* loaded from: classes5.dex */
public class m0 extends b {

    /* renamed from: b  reason: collision with root package name */
    private n0 f53245b;

    /* JADX INFO: Access modifiers changed from: protected */
    public m0(boolean z11, n0 n0Var) {
        super(z11);
        this.f53245b = n0Var;
    }

    public n0 b() {
        return this.f53245b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m0) {
            n0 n0Var = this.f53245b;
            n0 b11 = ((m0) obj).b();
            return n0Var == null ? b11 == null : n0Var.equals(b11);
        }
        return false;
    }

    public int hashCode() {
        n0 n0Var = this.f53245b;
        if (n0Var != null) {
            return n0Var.hashCode();
        }
        return 0;
    }
}