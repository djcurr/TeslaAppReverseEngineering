package androidx.camera.core;

/* loaded from: classes.dex */
final class d1 extends m {

    /* renamed from: c  reason: collision with root package name */
    private boolean f2191c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(g0 g0Var) {
        super(g0Var);
        this.f2191c = false;
    }

    @Override // androidx.camera.core.m, androidx.camera.core.g0, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f2191c) {
            this.f2191c = true;
            super.close();
        }
    }
}