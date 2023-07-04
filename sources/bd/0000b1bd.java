package s2;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f50103a;

    /* renamed from: b  reason: collision with root package name */
    private final v f50104b;

    public h0(c0 textInputService, v platformTextInputService) {
        kotlin.jvm.internal.s.g(textInputService, "textInputService");
        kotlin.jvm.internal.s.g(platformTextInputService, "platformTextInputService");
        this.f50103a = textInputService;
        this.f50104b = platformTextInputService;
    }

    public final void a() {
        this.f50103a.e(this);
    }

    public final boolean b() {
        boolean c11 = c();
        if (c11) {
            this.f50104b.d();
        }
        return c11;
    }

    public final boolean c() {
        return kotlin.jvm.internal.s.c(this.f50103a.a(), this);
    }

    public final boolean d(s1.h rect) {
        kotlin.jvm.internal.s.g(rect, "rect");
        boolean c11 = c();
        if (c11) {
            this.f50104b.c(rect);
        }
        return c11;
    }

    public final boolean e() {
        boolean c11 = c();
        if (c11) {
            this.f50104b.e();
        }
        return c11;
    }

    public final boolean f(a0 a0Var, a0 newValue) {
        kotlin.jvm.internal.s.g(newValue, "newValue");
        boolean c11 = c();
        if (c11) {
            this.f50104b.a(a0Var, newValue);
        }
        return c11;
    }
}