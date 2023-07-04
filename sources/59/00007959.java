package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public interface f0 {
    io.sentry.protocol.o a(b3 b3Var, u1 u1Var, t tVar);

    void b(q3 q3Var, t tVar);

    @ApiStatus.Internal
    io.sentry.protocol.o c(io.sentry.protocol.v vVar, c4 c4Var, u1 u1Var, t tVar, q1 q1Var);

    void close();

    void d(long j11);

    io.sentry.protocol.o f(i2 i2Var, t tVar);
}