package com.tesla.logging;

import android.content.Context;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f21877a = new f();

    private f() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        r5 = wz.e0.Y(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(android.content.Context r5) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r5, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L15
            java.lang.String r5 = android.app.Application.getProcessName()
            java.lang.String r0 = "{\n      Application.getProcessName()\n    }"
            kotlin.jvm.internal.s.f(r5, r0)
            return r5
        L15:
            int r0 = android.os.Process.myPid()
            java.lang.String r1 = "activity"
            java.lang.Object r5 = r5.getSystemService(r1)
            boolean r1 = r5 instanceof android.app.ActivityManager
            r2 = 0
            if (r1 == 0) goto L27
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            goto L28
        L27:
            r5 = r2
        L28:
            java.lang.String r1 = "default"
            if (r5 != 0) goto L2d
            goto L61
        L2d:
            java.util.List r5 = r5.getRunningAppProcesses()
            if (r5 != 0) goto L34
            goto L61
        L34:
            java.util.List r5 = wz.u.Y(r5)
            if (r5 != 0) goto L3b
            goto L61
        L3b:
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r5.next()
            r4 = r3
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r4 = r4.pid
            if (r4 != r0) goto L52
            r4 = 1
            goto L53
        L52:
            r4 = 0
        L53:
            if (r4 == 0) goto L3f
            r2 = r3
        L56:
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            if (r2 != 0) goto L5b
            goto L61
        L5b:
            java.lang.String r5 = r2.processName
            if (r5 != 0) goto L60
            goto L61
        L60:
            r1 = r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.logging.f.a(android.content.Context):java.lang.String");
    }

    public static final boolean b(Context context) {
        s.g(context, "context");
        String a11 = a(context);
        String packageName = context.getPackageName();
        return s.c(a11, packageName + ":svc");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(android.content.Context r6) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r6, r0)
            java.lang.String r0 = "activity"
            java.lang.Object r6 = r6.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.app.ActivityManager"
            java.util.Objects.requireNonNull(r6, r0)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getAppTasks()
            r0 = 0
            if (r6 != 0) goto L1b
            goto L92
        L1b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L24:
            boolean r2 = r6.hasNext()
            r3 = 1
            if (r2 == 0) goto L42
            java.lang.Object r2 = r6.next()
            r4 = r2
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            android.app.ActivityManager$RecentTaskInfo r4 = r4.getTaskInfo()
            android.content.ComponentName r4 = r4.baseActivity
            if (r4 == 0) goto L3b
            goto L3c
        L3b:
            r3 = r0
        L3c:
            if (r3 == 0) goto L24
            r1.add(r2)
            goto L24
        L42:
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L49
            goto L92
        L49:
            java.util.Iterator r6 = r1.iterator()
        L4d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r6.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            android.content.ComponentName r1 = r1.baseActivity
            if (r1 != 0) goto L63
        L61:
            r1 = r0
            goto L8f
        L63:
            java.lang.String r1 = r1.getClassName()
            if (r1 != 0) goto L6a
            goto L61
        L6a:
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r4 = "ENGLISH"
            kotlin.jvm.internal.s.f(r2, r4)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r5 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.s.f(r1, r5)
            if (r1 != 0) goto L7d
            goto L61
        L7d:
            kotlin.jvm.internal.s.f(r2, r4)
            java.lang.String r4 = "com.teslamotors.TeslaApp.MainActivity"
            java.lang.String r2 = r4.toLowerCase(r2)
            kotlin.jvm.internal.s.f(r2, r5)
            r4 = 2
            r5 = 0
            boolean r1 = kotlin.text.m.M(r1, r2, r0, r4, r5)
        L8f:
            if (r1 == 0) goto L4d
            r0 = r3
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.logging.f.c(android.content.Context):boolean");
    }

    public static final boolean d(Context context) {
        s.g(context, "context");
        return s.c(a(context), context.getPackageName());
    }
}