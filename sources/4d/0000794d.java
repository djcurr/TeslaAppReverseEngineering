package io.sentry;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
final class d4 {

    /* renamed from: a  reason: collision with root package name */
    private final g3 f32246a;

    /* renamed from: b  reason: collision with root package name */
    private final SecureRandom f32247b;

    public d4(g3 g3Var) {
        this((g3) rz.j.a(g3Var, "options are required"), new SecureRandom());
    }

    private boolean b(Double d11) {
        return d11.doubleValue() >= this.f32247b.nextDouble();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(t1 t1Var) {
        Double a11;
        if (t1Var.a().d() != null) {
            return t1Var.a().d().booleanValue();
        }
        if (this.f32246a.getTracesSampler() != null && (a11 = this.f32246a.getTracesSampler().a(t1Var)) != null) {
            return b(a11);
        }
        if (t1Var.a().n() != null) {
            return t1Var.a().n().booleanValue();
        }
        if (this.f32246a.getTracesSampleRate() != null) {
            return b(this.f32246a.getTracesSampleRate());
        }
        return false;
    }

    d4(g3 g3Var, SecureRandom secureRandom) {
        this.f32246a = g3Var;
        this.f32247b = secureRandom;
    }
}