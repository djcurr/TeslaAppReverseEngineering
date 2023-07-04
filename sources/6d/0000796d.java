package io.sentry;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class h implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final g3 f32270a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f32271b;

    public h(g3 g3Var, d0 d0Var) {
        this.f32270a = (g3) rz.j.a(g3Var, "SentryOptions is required.");
        this.f32271b = d0Var;
    }

    @Override // io.sentry.d0
    public void a(f3 f3Var, Throwable th2, String str, Object... objArr) {
        if (this.f32271b == null || !d(f3Var)) {
            return;
        }
        this.f32271b.a(f3Var, th2, str, objArr);
    }

    @Override // io.sentry.d0
    public void b(f3 f3Var, String str, Throwable th2) {
        if (this.f32271b == null || !d(f3Var)) {
            return;
        }
        this.f32271b.b(f3Var, str, th2);
    }

    @Override // io.sentry.d0
    public void c(f3 f3Var, String str, Object... objArr) {
        if (this.f32271b == null || !d(f3Var)) {
            return;
        }
        this.f32271b.c(f3Var, str, objArr);
    }

    @Override // io.sentry.d0
    public boolean d(f3 f3Var) {
        return f3Var != null && this.f32270a.isDebug() && f3Var.ordinal() >= this.f32270a.getDiagnosticLevel().ordinal();
    }
}