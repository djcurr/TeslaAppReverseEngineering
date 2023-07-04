package c1;

/* loaded from: classes.dex */
public final class h {
    public static final int a(i iVar, int i11) {
        return iVar.K();
    }

    public static final y0 b(i iVar, int i11) {
        y0 v11 = iVar.v();
        if (v11 != null) {
            iVar.g(v11);
            return v11;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final m d(i iVar, int i11) {
        iVar.x(-1359197906);
        m L = iVar.L();
        iVar.N();
        return L;
    }
}