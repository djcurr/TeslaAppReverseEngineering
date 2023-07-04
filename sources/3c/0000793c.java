package io.sentry;

import java.util.Date;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public interface c0 {
    c0 clone();

    void close();

    void d(long j11);

    default void e(c cVar) {
        h(cVar, new t());
    }

    io.sentry.protocol.o f(i2 i2Var, t tVar);

    @ApiStatus.Internal
    default io.sentry.protocol.o g(io.sentry.protocol.v vVar, c4 c4Var, t tVar) {
        return r(vVar, c4Var, tVar, null);
    }

    g3 getOptions();

    void h(c cVar, t tVar);

    void i(v1 v1Var);

    boolean isEnabled();

    @ApiStatus.Internal
    void j(Throwable th2, i0 i0Var, String str);

    @ApiStatus.Internal
    j0 k(e4 e4Var, e eVar, boolean z11, Date date, boolean z12, Long l11, boolean z13, f4 f4Var);

    @ApiStatus.Internal
    default j0 l(String str, String str2, Date date, boolean z11, f4 f4Var) {
        return k(new e4(str, str2), null, false, date, z11, null, false, f4Var);
    }

    @ApiStatus.Internal
    default j0 m(String str, String str2, boolean z11, Long l11, boolean z12) {
        return k(new e4(str, str2), null, false, null, z11, l11, z12, null);
    }

    void n();

    io.sentry.protocol.o o(b3 b3Var, t tVar);

    default io.sentry.protocol.o p(Throwable th2) {
        return q(th2, new t());
    }

    io.sentry.protocol.o q(Throwable th2, t tVar);

    @ApiStatus.Internal
    io.sentry.protocol.o r(io.sentry.protocol.v vVar, c4 c4Var, t tVar, q1 q1Var);

    void s();
}