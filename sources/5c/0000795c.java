package io.sentry;

import java.util.Locale;

/* loaded from: classes5.dex */
public enum f3 implements x0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    /* loaded from: classes5.dex */
    static final class a implements n0<f3> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public f3 a(t0 t0Var, d0 d0Var) {
            return f3.valueOf(t0Var.D0().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.G0(name().toLowerCase(Locale.ROOT));
    }
}