package v20;

/* loaded from: classes5.dex */
public final class u1 implements v1 {

    /* renamed from: a  reason: collision with root package name */
    private final m2 f54007a;

    public u1(m2 m2Var) {
        this.f54007a = m2Var;
    }

    @Override // v20.v1
    public boolean a() {
        return false;
    }

    @Override // v20.v1
    public m2 d() {
        return this.f54007a;
    }

    public String toString() {
        return r0.c() ? d().X("New") : super.toString();
    }
}