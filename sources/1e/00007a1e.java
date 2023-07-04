package io.sentry;

import java.util.Date;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public final class z implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final z f32724a = new z();

    private z() {
    }

    public static z a() {
        return f32724a;
    }

    @Override // io.sentry.c0
    public void close() {
        c2.e();
    }

    @Override // io.sentry.c0
    public void d(long j11) {
        c2.h(j11);
    }

    @Override // io.sentry.c0
    @ApiStatus.Internal
    public io.sentry.protocol.o f(i2 i2Var, t tVar) {
        return c2.i().f(i2Var, tVar);
    }

    @Override // io.sentry.c0
    public g3 getOptions() {
        return c2.i().getOptions();
    }

    @Override // io.sentry.c0
    public void h(c cVar, t tVar) {
        c2.b(cVar, tVar);
    }

    @Override // io.sentry.c0
    public void i(v1 v1Var) {
        c2.f(v1Var);
    }

    @Override // io.sentry.c0
    public boolean isEnabled() {
        return c2.m();
    }

    @Override // io.sentry.c0
    public void j(Throwable th2, i0 i0Var, String str) {
        c2.i().j(th2, i0Var, str);
    }

    @Override // io.sentry.c0
    @ApiStatus.Internal
    public j0 k(e4 e4Var, e eVar, boolean z11, Date date, boolean z12, Long l11, boolean z13, f4 f4Var) {
        return c2.p(e4Var, eVar, z11, date, z12, l11, z13, f4Var);
    }

    @Override // io.sentry.c0
    public void n() {
        c2.g();
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.o o(b3 b3Var, t tVar) {
        return c2.c(b3Var, tVar);
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.o q(Throwable th2, t tVar) {
        return c2.d(th2, tVar);
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.o r(io.sentry.protocol.v vVar, c4 c4Var, t tVar, q1 q1Var) {
        return c2.i().r(vVar, c4Var, tVar, q1Var);
    }

    @Override // io.sentry.c0
    public void s() {
        c2.o();
    }

    @Override // io.sentry.c0
    /* renamed from: clone */
    public c0 m619clone() {
        return c2.i().clone();
    }
}