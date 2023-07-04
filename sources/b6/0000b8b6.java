package v20;

/* loaded from: classes5.dex */
public final class f3 extends j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final f3 f53921b = new f3();

    private f3() {
    }

    @Override // v20.j0
    public void I0(zz.g gVar, Runnable runnable) {
        i3 i3Var = (i3) gVar.get(i3.f53955b);
        if (i3Var != null) {
            i3Var.f53956a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // v20.j0
    public boolean P0(zz.g gVar) {
        return false;
    }

    @Override // v20.j0
    public j0 Q0(int i11) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // v20.j0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}