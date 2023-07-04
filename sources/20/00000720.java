package androidx.lifecycle;

import androidx.lifecycle.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements s {

    /* renamed from: a  reason: collision with root package name */
    private final n[] f5023a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(n[] nVarArr) {
        this.f5023a = nVarArr;
    }

    @Override // androidx.lifecycle.s
    public void g(v vVar, p.b bVar) {
        e0 e0Var = new e0();
        for (n nVar : this.f5023a) {
            nVar.a(vVar, bVar, false, e0Var);
        }
        for (n nVar2 : this.f5023a) {
            nVar2.a(vVar, bVar, true, e0Var);
        }
    }
}