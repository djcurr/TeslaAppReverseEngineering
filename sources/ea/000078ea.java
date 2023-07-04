package io.sentry;

import io.sentry.x1;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class a2 implements x1.c {

    /* renamed from: a  reason: collision with root package name */
    private final x1.b f32019a;

    public a2(x1.b bVar) {
        this.f32019a = (x1.b) rz.j.a(bVar, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.x1.c
    public x1.a d(c0 c0Var, g3 g3Var) {
        rz.j.a(c0Var, "Hub is required");
        rz.j.a(g3Var, "SentryOptions is required");
        String a11 = this.f32019a.a();
        if (a11 != null && e(a11, g3Var.getLogger())) {
            return a(new o1(c0Var, g3Var.getEnvelopeReader(), g3Var.getSerializer(), g3Var.getLogger(), g3Var.getFlushTimeoutMillis()), a11, g3Var.getLogger());
        }
        g3Var.getLogger().c(f3.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }
}