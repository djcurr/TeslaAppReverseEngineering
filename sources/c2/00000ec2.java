package c1;

/* loaded from: classes.dex */
public final class a0<T> extends w0<T> {

    /* renamed from: b  reason: collision with root package name */
    private final m1<T> f8386b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(m1<T> policy, h00.a<? extends T> defaultFactory) {
        super(defaultFactory);
        kotlin.jvm.internal.s.g(policy, "policy");
        kotlin.jvm.internal.s.g(defaultFactory, "defaultFactory");
        this.f8386b = policy;
    }

    @Override // c1.q
    public v1<T> b(T t11, i iVar, int i11) {
        iVar.x(-1007657376);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == i.f8486a.a()) {
            y11 = n1.f(t11, this.f8386b);
            iVar.p(y11);
        }
        iVar.N();
        o0 o0Var = (o0) y11;
        o0Var.setValue(t11);
        iVar.N();
        return o0Var;
    }
}