package g30;

/* loaded from: classes5.dex */
public abstract class j1<Array> {
    public static /* synthetic */ void c(j1 j1Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i12 & 1) != 0) {
            i11 = j1Var.d() + 1;
        }
        j1Var.b(i11);
    }

    public abstract Array a();

    public abstract void b(int i11);

    public abstract int d();
}