package gv;

/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f28158a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f28159b = com.tesla.logging.g.f21878b.a("PassiveAuthRepository");

    private k() {
    }

    private final String a(String str) {
        return "PASSIVE_AUTH_DISABLED_" + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        r2 = kotlin.text.w.c1(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(java.lang.String r2) {
        /*
            java.lang.String r0 = "vin"
            kotlin.jvm.internal.s.g(r2, r0)
            ct.i r0 = ct.i.i()
            gv.k r1 = gv.k.f28158a
            java.lang.String r2 = r1.a(r2)
            java.lang.String r2 = r0.g(r2)
            r0 = 0
            if (r2 != 0) goto L17
            goto L22
        L17:
            java.lang.Boolean r2 = kotlin.text.m.c1(r2)
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            boolean r0 = r2.booleanValue()
        L22:
            r2 = r0 ^ 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gv.k.b(java.lang.String):boolean");
    }

    public static final void c(String vin, boolean z11) {
        kotlin.jvm.internal.s.g(vin, "vin");
        com.tesla.logging.g gVar = f28159b;
        gVar.i("Setting passive auth enabled to " + z11 + " for VIN " + vin);
        ct.i.i().t(f28158a.a(vin), String.valueOf(z11 ^ true));
    }
}