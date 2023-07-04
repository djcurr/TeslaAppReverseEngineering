package fi;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private int f26245a;

    public final void e(int i11) {
        this.f26245a = i11 | this.f26245a;
    }

    public void f() {
        this.f26245a = 0;
    }

    public final void g(int i11) {
        this.f26245a = (~i11) & this.f26245a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h(int i11) {
        return (this.f26245a & i11) == i11;
    }

    public final boolean i() {
        return h(268435456);
    }

    public final boolean k() {
        return h(Integer.MIN_VALUE);
    }

    public final boolean l() {
        return h(4);
    }

    public final boolean n() {
        return h(1);
    }

    public final void o(int i11) {
        this.f26245a = i11;
    }
}