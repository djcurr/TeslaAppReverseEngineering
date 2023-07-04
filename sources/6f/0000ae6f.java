package qs;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48438a = new a();

    private a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:3:0x000c, B:11:0x0022, B:14:0x003b, B:16:0x0054, B:17:0x007d, B:19:0x0083, B:20:0x009b, B:6:0x0015, B:9:0x001c), top: B:26:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ot.c a(android.content.Context r10, ot.c r11) {
        /*
            r9 = this;
            java.lang.String r0 = "CommandDecorator"
            java.lang.String r1 = "context"
            kotlin.jvm.internal.s.g(r10, r1)
            java.lang.String r1 = "request"
            kotlin.jvm.internal.s.g(r11, r1)
            ot.b r1 = r11.c()     // Catch: java.lang.Exception -> Lb0
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r1 = r2
            goto L20
        L15:
            lt.j2 r1 = r1.c()     // Catch: java.lang.Exception -> Lb0
            if (r1 != 0) goto L1c
            goto L13
        L1c:
            lt.h2 r1 = r1.f0()     // Catch: java.lang.Exception -> Lb0
        L20:
            if (r1 == 0) goto Lb8
            com.tesla.data.oapi.JsCalendarSyncParametersJsonAdapter r3 = new com.tesla.data.oapi.JsCalendarSyncParametersJsonAdapter     // Catch: java.lang.Exception -> Lb0
            com.tesla.data.oapi.a r4 = com.tesla.data.oapi.a.f21724a     // Catch: java.lang.Exception -> Lb0
            com.squareup.moshi.p r4 = r4.a()     // Catch: java.lang.Exception -> Lb0
            r3.<init>(r4)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = r1.c()     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r1 = r3.c(r1)     // Catch: java.lang.Exception -> Lb0
            com.tesla.data.oapi.JsCalendarSyncParameters r1 = (com.tesla.data.oapi.JsCalendarSyncParameters) r1     // Catch: java.lang.Exception -> Lb0
            if (r1 != 0) goto L3b
            goto Lb8
        L3b:
            xs.b r3 = xs.b.f57689a     // Catch: java.lang.Exception -> Lb0
            java.lang.String r4 = r11.j()     // Catch: java.lang.Exception -> Lb0
            ot.d r7 = r11.h()     // Catch: java.lang.Exception -> Lb0
            java.lang.String r5 = r1.b()     // Catch: java.lang.Exception -> Lb0
            boolean r6 = r1.a()     // Catch: java.lang.Exception -> Lb0
            r8 = r10
            ot.c r10 = r3.f(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Lb0
            if (r10 != 0) goto Lae
            com.tesla.logging.TeslaLog r10 = com.tesla.logging.TeslaLog.INSTANCE     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r3.<init>()     // Catch: java.lang.Exception -> Lb0
            java.lang.String r4 = "Could not decorate with params "
            r3.append(r4)     // Catch: java.lang.Exception -> Lb0
            r3.append(r1)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> Lb0
            ht.a r3 = ht.a.f29422a     // Catch: java.lang.Exception -> Lb0
            vz.p r3 = vz.v.a(r0, r1)     // Catch: java.lang.Exception -> Lb0
            java.util.Map r3 = wz.p0.f(r3)     // Catch: java.lang.Exception -> Lb0
            com.google.firebase.crashlytics.FirebaseCrashlytics r4 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()     // Catch: java.lang.Exception -> Lb0
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Exception -> Lb0
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> Lb0
        L7d:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Exception -> Lb0
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Exception -> Lb0
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Exception -> Lb0
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> Lb0
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lb0
            ht.a r7 = ht.a.f29422a     // Catch: java.lang.Exception -> Lb0
            r7.a(r6, r5)     // Catch: java.lang.Exception -> Lb0
            goto L7d
        L9b:
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Lb0
            r3.<init>(r1)     // Catch: java.lang.Exception -> Lb0
            r4.recordException(r3)     // Catch: java.lang.Exception -> Lb0
            r3 = 2
            r4 = 0
            com.tesla.logging.TeslaLog.setTag$default(r10, r0, r4, r3, r2)     // Catch: java.lang.Exception -> Lb0
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Lb0
            n80.a.a(r1, r10)     // Catch: java.lang.Exception -> Lb0
            goto Lb8
        Lae:
            r11 = r10
            goto Lb8
        Lb0:
            r10 = move-exception
            com.tesla.logging.TeslaLog r1 = com.tesla.logging.TeslaLog.INSTANCE
            java.lang.String r2 = "Exception thrown decorating request"
            r1.fatal(r0, r2, r10)
        Lb8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qs.a.a(android.content.Context, ot.c):ot.c");
    }
}