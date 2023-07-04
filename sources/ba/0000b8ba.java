package v20;

/* loaded from: classes5.dex */
public abstract class g2 extends e0 implements g1, v1 {

    /* renamed from: d */
    public h2 f53924d;

    public final h2 W() {
        h2 h2Var = this.f53924d;
        if (h2Var != null) {
            return h2Var;
        }
        kotlin.jvm.internal.s.x("job");
        return null;
    }

    public final void X(h2 h2Var) {
        this.f53924d = h2Var;
    }

    @Override // v20.v1
    public boolean a() {
        return true;
    }

    @Override // v20.v1
    public m2 d() {
        return null;
    }

    @Override // v20.g1
    public void dispose() {
        W().J0(this);
    }

    @Override // kotlinx.coroutines.internal.s
    public String toString() {
        return s0.a(this) + '@' + s0.b(this) + "[job@" + s0.b(W()) + ']';
    }
}