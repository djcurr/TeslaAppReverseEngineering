package io.sentry;

import java.util.Date;

/* loaded from: classes5.dex */
public final class b1 implements c0 {

    /* renamed from: b  reason: collision with root package name */
    private static final b1 f32188b = new b1();

    /* renamed from: a  reason: collision with root package name */
    private final g3 f32189a = g3.empty();

    private b1() {
    }

    public static b1 a() {
        return f32188b;
    }

    @Override // io.sentry.c0
    public void close() {
    }

    @Override // io.sentry.c0
    public void d(long j11) {
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.o f(i2 i2Var, t tVar) {
        return io.sentry.protocol.o.f32468b;
    }

    @Override // io.sentry.c0
    public g3 getOptions() {
        return this.f32189a;
    }

    @Override // io.sentry.c0
    public void h(c cVar, t tVar) {
    }

    @Override // io.sentry.c0
    public void i(v1 v1Var) {
    }

    @Override // io.sentry.c0
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.c0
    public void j(Throwable th2, i0 i0Var, String str) {
    }

    @Override // io.sentry.c0
    public j0 k(e4 e4Var, e eVar, boolean z11, Date date, boolean z12, Long l11, boolean z13, f4 f4Var) {
        return i1.i();
    }

    @Override // io.sentry.c0
    public void n() {
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.o o(b3 b3Var, t tVar) {
        return io.sentry.protocol.o.f32468b;
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.o q(Throwable th2, t tVar) {
        return io.sentry.protocol.o.f32468b;
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.o r(io.sentry.protocol.v vVar, c4 c4Var, t tVar, q1 q1Var) {
        return io.sentry.protocol.o.f32468b;
    }

    @Override // io.sentry.c0
    public void s() {
    }

    @Override // io.sentry.c0
    /* renamed from: clone */
    public c0 m617clone() {
        return f32188b;
    }
}