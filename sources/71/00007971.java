package io.sentry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h3 implements r {

    /* renamed from: a  reason: collision with root package name */
    private final String f32276a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32277b;

    public h3(String str, String str2) {
        this.f32276a = str;
        this.f32277b = str2;
    }

    private <T extends d2> T b(T t11) {
        if (t11.B().e() == null) {
            t11.B().m(new io.sentry.protocol.q());
        }
        io.sentry.protocol.q e11 = t11.B().e();
        if (e11 != null && e11.d() == null && e11.e() == null) {
            e11.f(this.f32277b);
            e11.h(this.f32276a);
        }
        return t11;
    }

    @Override // io.sentry.r
    public b3 a(b3 b3Var, t tVar) {
        return (b3) b(b3Var);
    }

    @Override // io.sentry.r
    public io.sentry.protocol.v g(io.sentry.protocol.v vVar, t tVar) {
        return (io.sentry.protocol.v) b(vVar);
    }

    public h3() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}