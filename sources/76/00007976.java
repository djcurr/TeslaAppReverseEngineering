package io.sentry;

import java.util.Date;

/* loaded from: classes5.dex */
public final class i1 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final i1 f32287a = new i1();

    private i1() {
    }

    public static i1 i() {
        return f32287a;
    }

    @Override // io.sentry.i0
    public boolean a() {
        return true;
    }

    @Override // io.sentry.j0
    public io.sentry.protocol.o b() {
        return io.sentry.protocol.o.f32468b;
    }

    @Override // io.sentry.i0
    public i0 c(String str, String str2, Date date) {
        return h1.i();
    }

    @Override // io.sentry.i0
    public c4 d() {
        return new c4(io.sentry.protocol.o.f32468b, "");
    }

    @Override // io.sentry.i0
    public void e(x3 x3Var) {
    }

    @Override // io.sentry.j0
    public t3 f() {
        return null;
    }

    @Override // io.sentry.i0
    public void finish() {
    }

    @Override // io.sentry.j0
    public void g() {
    }

    @Override // io.sentry.j0
    public String getName() {
        return "";
    }

    @Override // io.sentry.i0
    public x3 getStatus() {
        return null;
    }

    @Override // io.sentry.i0
    public u3 h() {
        return new u3(io.sentry.protocol.o.f32468b, w3.f32701b, "op", null, null);
    }
}