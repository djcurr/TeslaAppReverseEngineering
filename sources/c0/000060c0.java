package com.tesla.logging;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import eu.b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import kotlin.text.w;
import wz.r0;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f21875a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f21876b;

    private e() {
    }

    public static final void b(Context context) {
        boolean M;
        String str;
        Map f11;
        String T0;
        s.g(context, "context");
        if (f21876b) {
            return;
        }
        f21876b = true;
        String a11 = f.a(context);
        M = w.M(a11, ":", false, 2, null);
        if (M) {
            T0 = w.T0(a11, ":", null, 2, null);
            str = v.D(T0, "svc", "ble", false, 4, null);
        } else {
            str = "main";
        }
        eu.b bVar = eu.b.f25250c;
        Context applicationContext = context.getApplicationContext();
        s.f(applicationContext, "context.applicationContext");
        b.a n11 = bVar.n(applicationContext, str, str);
        List<String> a12 = n11.a();
        String b11 = n11.b();
        n80.a.d(bVar);
        g a13 = g.f21878b.a("Logging");
        for (String str2 : a12) {
            a13.i(str2);
        }
        if (b11 != null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = a13.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, b11));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(b11));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(b11, new Object[0]);
        }
        a13.i("Logging initialized for process `" + a11 + "`");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
        r7 = kotlin.text.v.D(r14, "[[", "[", false, 4, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L4
            goto L1e
        L4:
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r2 = "[["
            java.lang.String r3 = "["
            r1 = r14
            java.lang.String r7 = kotlin.text.m.D(r1, r2, r3, r4, r5, r6)
            if (r7 != 0) goto L13
            goto L1e
        L13:
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r8 = "]]"
            java.lang.String r9 = "]"
            java.lang.String r0 = kotlin.text.m.D(r7, r8, r9, r10, r11, r12)
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.logging.e.a(java.lang.String):java.lang.String");
    }

    public final String c(String tag) {
        s.g(tag, "tag");
        return tag + "_NATIVE_ONLY_LOG";
    }
}