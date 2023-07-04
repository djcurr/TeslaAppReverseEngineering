package k20;

/* loaded from: classes5.dex */
public abstract class k implements w0 {

    /* renamed from: a  reason: collision with root package name */
    private int f34295a;

    private final boolean c(w00.e eVar) {
        return (v.r(eVar) || w10.d.E(eVar)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(w00.e first, w00.e second) {
        kotlin.jvm.internal.s.g(first, "first");
        kotlin.jvm.internal.s.g(second, "second");
        if (kotlin.jvm.internal.s.c(first.getName(), second.getName())) {
            w00.i b11 = first.b();
            for (w00.i b12 = second.b(); b11 != null && b12 != null; b12 = b12.b()) {
                if (b11 instanceof w00.x) {
                    return b12 instanceof w00.x;
                }
                if (b12 instanceof w00.x) {
                    return false;
                }
                if (b11 instanceof w00.a0) {
                    return (b12 instanceof w00.a0) && kotlin.jvm.internal.s.c(((w00.a0) b11).e(), ((w00.a0) b12).e());
                } else if ((b12 instanceof w00.a0) || !kotlin.jvm.internal.s.c(b11.getName(), b12.getName())) {
                    return false;
                } else {
                    b11 = b11.b();
                }
            }
            return true;
        }
        return false;
    }

    protected abstract boolean d(w00.e eVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w0) && obj.hashCode() == hashCode()) {
            w0 w0Var = (w0) obj;
            if (w0Var.getParameters().size() != getParameters().size()) {
                return false;
            }
            w00.e n11 = n();
            w00.e n12 = w0Var.n();
            if (n12 != null && c(n11) && c(n12)) {
                return d(n12);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int identityHashCode;
        int i11 = this.f34295a;
        if (i11 != 0) {
            return i11;
        }
        w00.e n11 = n();
        if (c(n11)) {
            identityHashCode = w10.d.m(n11).hashCode();
        } else {
            identityHashCode = System.identityHashCode(this);
        }
        this.f34295a = identityHashCode;
        return identityHashCode;
    }

    @Override // k20.w0
    public abstract w00.e n();
}