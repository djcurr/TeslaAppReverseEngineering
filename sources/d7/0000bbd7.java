package w00;

/* loaded from: classes5.dex */
public abstract class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f55353a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55354b;

    /* JADX INFO: Access modifiers changed from: protected */
    public z0(String name, boolean z11) {
        kotlin.jvm.internal.s.g(name, "name");
        this.f55353a = name;
        this.f55354b = z11;
    }

    public Integer a(z0 visibility) {
        kotlin.jvm.internal.s.g(visibility, "visibility");
        return y0.f55331a.a(this, visibility);
    }

    public String b() {
        return this.f55353a;
    }

    public final boolean c() {
        return this.f55354b;
    }

    public z0 d() {
        return this;
    }

    public final String toString() {
        return b();
    }
}