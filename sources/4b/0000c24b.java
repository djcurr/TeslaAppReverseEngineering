package ya;

@Deprecated
/* loaded from: classes.dex */
public abstract class i<Z> extends a<Z> {
    private final int height;
    private final int width;

    public i() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // ya.k
    public final void getSize(j jVar) {
        if (bb.k.t(this.width, this.height)) {
            jVar.e(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
    }

    @Override // ya.k
    public void removeCallback(j jVar) {
    }

    public i(int i11, int i12) {
        this.width = i11;
        this.height = i12;
    }
}