package androidx.lifecycle;

import androidx.lifecycle.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements s {

    /* renamed from: a  reason: collision with root package name */
    private final n f5096a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleGeneratedAdapterObserver(n nVar) {
        this.f5096a = nVar;
    }

    @Override // androidx.lifecycle.s
    public void g(v vVar, p.b bVar) {
        this.f5096a.a(vVar, bVar, false, null);
        this.f5096a.a(vVar, bVar, true, null);
    }
}