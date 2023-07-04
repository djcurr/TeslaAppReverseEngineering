package io.grpc;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final p f31572a;

    /* renamed from: b  reason: collision with root package name */
    private final f1 f31573b;

    private q(p pVar, f1 f1Var) {
        this.f31572a = (p) com.google.common.base.u.p(pVar, "state is null");
        this.f31573b = (f1) com.google.common.base.u.p(f1Var, "status is null");
    }

    public static q a(p pVar) {
        com.google.common.base.u.e(pVar != p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new q(pVar, f1.f30562f);
    }

    public static q b(f1 f1Var) {
        com.google.common.base.u.e(!f1Var.p(), "The error status must not be OK");
        return new q(p.TRANSIENT_FAILURE, f1Var);
    }

    public p c() {
        return this.f31572a;
    }

    public f1 d() {
        return this.f31573b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f31572a.equals(qVar.f31572a) && this.f31573b.equals(qVar.f31573b);
        }
        return false;
    }

    public int hashCode() {
        return this.f31572a.hashCode() ^ this.f31573b.hashCode();
    }

    public String toString() {
        if (this.f31573b.p()) {
            return this.f31572a.toString();
        }
        return this.f31572a + "(" + this.f31573b + ")";
    }
}