package androidx.lifecycle;

import v20.e1;

/* loaded from: classes.dex */
public final class i0 extends v20.j0 {

    /* renamed from: b  reason: collision with root package name */
    public final h f5145b = new h();

    @Override // v20.j0
    public void I0(zz.g context, Runnable block) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(block, "block");
        this.f5145b.c(context, block);
    }

    @Override // v20.j0
    public boolean P0(zz.g context) {
        kotlin.jvm.internal.s.g(context, "context");
        if (e1.c().R0().P0(context)) {
            return true;
        }
        return !this.f5145b.b();
    }
}