package com.tesla.logging;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class g {

    /* renamed from: b */
    public static final a f21878b = new a(null);

    /* renamed from: a */
    private final String f21879a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(String tag) {
            s.g(tag, "tag");
            return new g("[" + tag + "]", null);
        }
    }

    private g(String str) {
        this.f21879a = str;
    }

    public /* synthetic */ g(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final g g(String str) {
        return f21878b.a(str);
    }

    public static /* synthetic */ void k(g gVar, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        gVar.j(str, z11, z12);
    }

    public final void a(String msg) {
        s.g(msg, "msg");
        TeslaLog.INSTANCE.d(this.f21879a, msg);
    }

    public final void b(String msg, boolean z11) {
        s.g(msg, "msg");
        TeslaLog.INSTANCE.d(this.f21879a, msg, z11);
    }

    public final void c(String msg) {
        Map f11;
        s.g(msg, "msg");
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String h11 = h();
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(h11, msg));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(msg));
        TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
        n80.a.a(msg, new Object[0]);
    }

    public final void d(String msg, Throwable th2) {
        Map f11;
        s.g(msg, "msg");
        if (th2 == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, msg));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(msg));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(msg, new Object[0]);
            return;
        }
        TeslaLog.INSTANCE.e(this.f21879a, msg, th2);
    }

    public final void e(String msg) {
        Map f11;
        s.g(msg, "msg");
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String h11 = h();
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(h11, msg));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(msg));
        TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
        n80.a.a(msg, new Object[0]);
    }

    public final void f(String msg, Throwable th2) {
        Map f11;
        s.g(msg, "msg");
        if (th2 == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, msg));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(msg));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(msg, new Object[0]);
            return;
        }
        TeslaLog.INSTANCE.fatal(this.f21879a, msg, th2);
    }

    public final String h() {
        return this.f21879a;
    }

    public final void i(String msg) {
        s.g(msg, "msg");
        j(msg, true, false);
    }

    public final void j(String msg, boolean z11, boolean z12) {
        s.g(msg, "msg");
        TeslaLog.INSTANCE.i(this.f21879a, msg, z11, z12);
    }

    public final void l(String msg) {
        s.g(msg, "msg");
        TeslaLog.INSTANCE.v(this.f21879a, msg);
    }

    public final void m(String msg) {
        s.g(msg, "msg");
        TeslaLog.INSTANCE.w(this.f21879a, msg);
    }

    public final g n(String tag) {
        s.g(tag, "tag");
        String str = this.f21879a;
        return new g(str + "[" + tag + "]");
    }

    public final void o(String msg) {
        s.g(msg, "msg");
        TeslaLog.INSTANCE.wtf(this.f21879a, msg);
    }
}