package dy;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f24365a;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            java.lang.String r2 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lb
            r3 = r1
            goto Le
        Lb:
            r2 = move-exception
            r3 = r2
            r2 = r1
        Le:
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            java.lang.Class<dy.a> r6 = dy.a.class
            java.lang.Class r2 = r2.asSubclass(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<dy.d> r7 = dy.d.class
            r6[r4] = r7     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Constructor r2 = r2.getConstructor(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2f
            dy.d r7 = dy.a.f24363a     // Catch: java.lang.Throwable -> L2f
            r6[r4] = r7     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r2.newInstance(r6)     // Catch: java.lang.Throwable -> L2f
            dy.a r2 = (dy.a) r2     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r2 = move-exception
            r3 = r2
        L31:
            r2 = r1
        L32:
            if (r2 == 0) goto L37
            dy.c.f24365a = r2
            goto L40
        L37:
            dy.a r2 = new dy.a
            dy.d r6 = dy.a.f24363a
            r2.<init>(r6)
            dy.c.f24365a = r2
        L40:
            if (r3 == 0) goto L97
            java.lang.String r2 = "io.perfmark.PerfMark.debug"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L97
            java.lang.String r2 = "java.util.logging.Logger"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = "getLogger"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L97
            r7[r4] = r0     // Catch: java.lang.Throwable -> L97
            java.lang.reflect.Method r6 = r2.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L97
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L97
            java.lang.Class<dy.c> r8 = dy.c.class
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L97
            r7[r4] = r8     // Catch: java.lang.Throwable -> L97
            java.lang.Object r6 = r6.invoke(r1, r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = "java.util.logging.Level"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "FINE"
            java.lang.reflect.Field r8 = r7.getField(r8)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r8.get(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "log"
            r9 = 3
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L97
            r10[r4] = r7     // Catch: java.lang.Throwable -> L97
            r10[r5] = r0     // Catch: java.lang.Throwable -> L97
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r7 = 2
            r10[r7] = r0     // Catch: java.lang.Throwable -> L97
            java.lang.reflect.Method r0 = r2.getMethod(r8, r10)     // Catch: java.lang.Throwable -> L97
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L97
            r2[r4] = r1     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "Error during PerfMark.<clinit>"
            r2[r5] = r1     // Catch: java.lang.Throwable -> L97
            r2[r7] = r3     // Catch: java.lang.Throwable -> L97
            r0.invoke(r6, r2)     // Catch: java.lang.Throwable -> L97
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dy.c.<clinit>():void");
    }

    private c() {
    }

    public static d a(String str) {
        return f24365a.a(str, Long.MIN_VALUE);
    }

    public static d b(String str, long j11) {
        return f24365a.a(str, j11);
    }

    public static void c(String str, d dVar) {
        f24365a.b(str, dVar);
    }

    public static void d(b bVar) {
        f24365a.c(bVar);
    }

    public static b e() {
        return f24365a.d();
    }

    public static void f(String str) {
        f24365a.e(str);
    }

    public static void g(String str, d dVar) {
        f24365a.f(str, dVar);
    }

    public static void h(String str) {
        f24365a.g(str);
    }

    public static void i(String str, d dVar) {
        f24365a.h(str, dVar);
    }
}