package androidx.camera.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends r {

    /* loaded from: classes.dex */
    class a implements c0.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g0 f2507a;

        a(s sVar, g0 g0Var) {
            this.f2507a = g0Var;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r12) {
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            this.f2507a.close();
        }
    }

    @Override // androidx.camera.core.r
    g0 d(androidx.camera.core.impl.r0 r0Var) {
        return r0Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.core.r
    public void g() {
    }

    @Override // androidx.camera.core.r
    void k(g0 g0Var) {
        c0.f.b(e(g0Var), new a(this, g0Var), b0.a.a());
    }
}