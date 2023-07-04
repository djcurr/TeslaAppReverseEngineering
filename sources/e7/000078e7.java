package io.sentry;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class a implements l0 {
    @Override // io.sentry.l0
    public qz.p a(g3 g3Var, r1 r1Var) {
        rz.j.a(g3Var, "options is required");
        rz.j.a(r1Var, "requestDetails is required");
        return new qz.d(g3Var, new qz.y(g3Var), g3Var.getTransportGate(), r1Var);
    }
}