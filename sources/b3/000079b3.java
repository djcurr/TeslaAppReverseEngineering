package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class g implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f32422a;

    /* loaded from: classes5.dex */
    public static final class a implements n0<g> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public g a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            t0Var.p0();
            g gVar = new g(t0Var.y1().floatValue());
            t0Var.C();
            return gVar;
        }
    }

    public g(float f11) {
        this.f32422a = f11;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0("value").u0(this.f32422a);
        v0Var.C();
    }
}