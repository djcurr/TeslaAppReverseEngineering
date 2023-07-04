package androidx.compose.ui.platform;

/* loaded from: classes.dex */
final class n0 implements n1 {

    /* renamed from: a  reason: collision with root package name */
    private final s2.c0 f3043a;

    public n0(s2.c0 textInputService) {
        kotlin.jvm.internal.s.g(textInputService, "textInputService");
        this.f3043a = textInputService;
    }

    @Override // androidx.compose.ui.platform.n1
    public void hide() {
        this.f3043a.b();
    }

    @Override // androidx.compose.ui.platform.n1
    public void show() {
        this.f3043a.c();
    }
}