package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public class q extends s {
    @Override // kotlinx.coroutines.internal.s
    public boolean M() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.s
    public /* bridge */ /* synthetic */ boolean N() {
        return ((Boolean) W()).booleanValue();
    }

    public final boolean V() {
        return F() == this;
    }

    public final Void W() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}