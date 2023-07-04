package io.sentry.android.core;

import io.sentry.b3;
import io.sentry.u3;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class n0 implements io.sentry.r {

    /* renamed from: a  reason: collision with root package name */
    private boolean f32107a = false;

    /* renamed from: b  reason: collision with root package name */
    private final c f32108b;

    /* renamed from: c  reason: collision with root package name */
    private final SentryAndroidOptions f32109c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(SentryAndroidOptions sentryAndroidOptions, c cVar) {
        this.f32109c = (SentryAndroidOptions) rz.j.a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f32108b = (c) rz.j.a(cVar, "ActivityFramesTracker is required");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(java.util.List<io.sentry.protocol.r> r4) {
        /*
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.next()
            io.sentry.protocol.r r0 = (io.sentry.protocol.r) r0
            java.lang.String r1 = r0.b()
            java.lang.String r2 = "app.start.cold"
            boolean r1 = r1.contentEquals(r2)
            if (r1 != 0) goto L28
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "app.start.warm"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L4
        L28:
            r4 = 1
            return r4
        L2a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.n0.b(java.util.List):boolean");
    }

    @Override // io.sentry.r
    public b3 a(b3 b3Var, io.sentry.t tVar) {
        return b3Var;
    }

    @Override // io.sentry.r
    public synchronized io.sentry.protocol.v g(io.sentry.protocol.v vVar, io.sentry.t tVar) {
        Map<String, io.sentry.protocol.g> e11;
        Long a11;
        if (this.f32109c.isTracingEnabled()) {
            if (!this.f32107a && b(vVar.j0()) && (a11 = y.c().a()) != null) {
                vVar.i0().put(y.c().d().booleanValue() ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.g((float) a11.longValue()));
                this.f32107a = true;
            }
            io.sentry.protocol.o E = vVar.E();
            u3 f11 = vVar.B().f();
            if (E != null && f11 != null && f11.b().contentEquals("ui.load") && (e11 = this.f32108b.e(E)) != null) {
                vVar.i0().putAll(e11);
            }
            return vVar;
        }
        return vVar;
    }
}