package h2;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class n0 extends c1.a<k> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(k root) {
        super(root);
        kotlin.jvm.internal.s.g(root, "root");
    }

    @Override // c1.e
    public void b(int i11, int i12, int i13) {
        a().z0(i11, i12, i13);
    }

    @Override // c1.e
    public void c(int i11, int i12) {
        a().K0(i11, i12);
    }

    @Override // c1.a, c1.e
    public void e() {
        super.e();
        f0 d02 = j().d0();
        AndroidComposeView androidComposeView = d02 instanceof AndroidComposeView ? (AndroidComposeView) d02 : null;
        if (androidComposeView == null) {
            return;
        }
        androidComposeView.G();
    }

    @Override // c1.a
    protected void k() {
        j().J0();
    }

    @Override // c1.e
    /* renamed from: m */
    public void f(int i11, k instance) {
        kotlin.jvm.internal.s.g(instance, "instance");
        a().q0(i11, instance);
    }

    @Override // c1.e
    /* renamed from: n */
    public void d(int i11, k instance) {
        kotlin.jvm.internal.s.g(instance, "instance");
    }
}