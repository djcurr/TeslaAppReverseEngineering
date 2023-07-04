package x1;

/* loaded from: classes.dex */
public final class k extends c1.a<j> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j root) {
        super(root);
        kotlin.jvm.internal.s.g(root, "root");
    }

    private final b m(j jVar) {
        if (jVar instanceof b) {
            return (b) jVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // c1.e
    public void b(int i11, int i12, int i13) {
        m(a()).i(i11, i12, i13);
    }

    @Override // c1.e
    public void c(int i11, int i12) {
        m(a()).j(i11, i12);
    }

    @Override // c1.a
    protected void k() {
        b m11 = m(j());
        m11.j(0, m11.f());
    }

    @Override // c1.e
    /* renamed from: n */
    public void f(int i11, j instance) {
        kotlin.jvm.internal.s.g(instance, "instance");
    }

    @Override // c1.e
    /* renamed from: o */
    public void d(int i11, j instance) {
        kotlin.jvm.internal.s.g(instance, "instance");
        m(a()).h(i11, instance);
    }
}