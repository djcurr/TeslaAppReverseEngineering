package be;

import android.content.Context;
import jf.h;
import jf.i;
import jf.l;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f7626a = c.class;

    /* renamed from: b  reason: collision with root package name */
    private static f f7627b = null;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f7628c = false;

    private c() {
    }

    public static h a() {
        return b().j();
    }

    public static l b() {
        return l.l();
    }

    public static void c(Context context, i iVar) {
        d(context, iVar, null);
    }

    public static void d(Context context, i iVar, b bVar) {
        e(context, iVar, bVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (tf.b.d() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (tf.b.d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (tf.b.d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (tf.b.d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (tf.b.d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        tf.b.b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.content.Context r5, jf.i r6, be.b r7, boolean r8) {
        /*
            boolean r0 = tf.b.d()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Fresco#initialize"
            tf.b.a(r0)
        Lb:
            boolean r0 = be.c.f7628c
            r1 = 1
            if (r0 == 0) goto L18
            java.lang.Class<?> r0 = be.c.f7626a
            java.lang.String r2 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            nd.a.C(r0, r2)
            goto L1a
        L18:
            be.c.f7628c = r1
        L1a:
            jf.m.b(r8)
            boolean r8 = yg.a.c()
            if (r8 != 0) goto L97
            boolean r8 = tf.b.d()
            if (r8 == 0) goto L2e
            java.lang.String r8 = "Fresco.initialize->SoLoader.init"
            tf.b.a(r8)
        L2e:
            java.lang.Class<com.facebook.imagepipeline.nativecode.NativeCodeInitializer> r8 = com.facebook.imagepipeline.nativecode.NativeCodeInitializer.class
            java.lang.String r0 = "init"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            java.lang.reflect.Method r8 = r8.getMethod(r0, r2)     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            r1[r4] = r5     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            r8.invoke(r0, r1)     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            boolean r8 = tf.b.d()
            if (r8 == 0) goto L97
            goto L89
        L4c:
            r5 = move-exception
            goto L8d
        L4e:
            yg.c r8 = new yg.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            yg.a.b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = tf.b.d()
            if (r8 == 0) goto L97
            goto L89
        L5d:
            yg.c r8 = new yg.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            yg.a.b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = tf.b.d()
            if (r8 == 0) goto L97
            goto L89
        L6c:
            yg.c r8 = new yg.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            yg.a.b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = tf.b.d()
            if (r8 == 0) goto L97
            goto L89
        L7b:
            yg.c r8 = new yg.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            yg.a.b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = tf.b.d()
            if (r8 == 0) goto L97
        L89:
            tf.b.b()
            goto L97
        L8d:
            boolean r6 = tf.b.d()
            if (r6 == 0) goto L96
            tf.b.b()
        L96:
            throw r5
        L97:
            android.content.Context r5 = r5.getApplicationContext()
            if (r6 != 0) goto La1
            jf.l.u(r5)
            goto La4
        La1:
            jf.l.v(r6)
        La4:
            f(r5, r7)
            boolean r5 = tf.b.d()
            if (r5 == 0) goto Lb0
            tf.b.b()
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: be.c.e(android.content.Context, jf.i, be.b, boolean):void");
    }

    private static void f(Context context, b bVar) {
        if (tf.b.d()) {
            tf.b.a("Fresco.initializeDrawee");
        }
        f fVar = new f(context, bVar);
        f7627b = fVar;
        com.facebook.drawee.view.e.g(fVar);
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    public static e g() {
        return f7627b.get();
    }
}