package com.tesla.logging;

import androidx.annotation.Keep;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import vz.v;
import wz.r0;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0019\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\bJ\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0019\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\bJ\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/tesla/logging/TeslaLog;", "", "", "tag", "msg", "Lvz/b0;", IntegerTokenConverter.CONVERTER_KEY, "", "logToJs", "logToErrorReporting", "d", "e", "", "tr", "fatal", "v", "w", "wtf", "setTag", "tagTimber", "enable", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "", "MAX_TAG_LENGTH", "I", "<init>", "()V", "logging_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class TeslaLog {
    private static final int MAX_TAG_LENGTH = 40;
    public static final TeslaLog INSTANCE = new TeslaLog();
    private static volatile boolean enable = true;

    private TeslaLog() {
    }

    public static /* synthetic */ void setTag$default(TeslaLog teslaLog, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        teslaLog.setTag(str, z11);
    }

    public final void d(String tag, String msg) {
        s.g(tag, "tag");
        s.g(msg, "msg");
        if (enable) {
            d(tag, msg, true);
        }
    }

    public final void d(String tag, String msg, boolean z11) {
        s.g(tag, "tag");
        s.g(msg, "msg");
    }

    public final void e(String tag, String msg) {
        Map f11;
        s.g(tag, "tag");
        s.g(msg, "msg");
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(tag, msg));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(msg));
        setTag$default(this, tag, false, 2, null);
        n80.a.a(msg, new Object[0]);
    }

    public final void fatal(String tag, String msg, Throwable tr2) {
        s.g(tag, "tag");
        s.g(msg, "msg");
        s.g(tr2, "tr");
        e(tag, msg, tr2);
    }

    public final boolean getEnable() {
        return enable;
    }

    public final void i(String tag, String msg) {
        s.g(tag, "tag");
        s.g(msg, "msg");
        if (enable) {
            i(tag, msg, true, false);
        }
    }

    public final void setEnable(boolean z11) {
        enable = z11;
    }

    public final void setTag(String tag, boolean z11) {
        boolean H;
        s.g(tag, "tag");
        if (!z11) {
            tag = e.f21875a.c(tag);
        }
        H = kotlin.text.v.H(tag, "[", false, 2, null);
        if (!H) {
            tag = "[" + tag + "]";
        }
        tagTimber(tag);
    }

    public final void tagTimber(String tag) {
        String n02;
        s.g(tag, "tag");
        n02 = w.n0(tag, 40, (char) 0, 2, null);
        n80.a.e(n02);
    }

    public final void v(String tag, String msg) {
        s.g(tag, "tag");
        s.g(msg, "msg");
    }

    public final void w(String tag, String msg) {
        s.g(tag, "tag");
        s.g(msg, "msg");
        if (enable) {
            setTag$default(this, tag, false, 2, null);
            n80.a.f(msg, new Object[0]);
        }
    }

    public final void wtf(String tag, String msg) {
        s.g(tag, "tag");
        s.g(msg, "msg");
        if (enable) {
            setTag$default(this, tag, false, 2, null);
            n80.a.g(msg, new Object[0]);
        }
    }

    public final void fatal(String tag, String msg) {
        Map f11;
        s.g(tag, "tag");
        s.g(msg, "msg");
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(tag, msg));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(msg));
        setTag$default(this, tag, false, 2, null);
        n80.a.a(msg, new Object[0]);
    }

    public final void i(String tag, String msg, boolean z11, boolean z12) {
        s.g(tag, "tag");
        s.g(msg, "msg");
        if (enable) {
            if (z12) {
                ht.a.f29422a.a(tag, msg);
            }
            setTag(tag, z11);
            n80.a.c(msg, new Object[0]);
        }
    }

    public final void e(String tag, String msg, Throwable tr2) {
        Map<String, String> f11;
        s.g(tag, "tag");
        s.g(msg, "msg");
        s.g(tr2, "tr");
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(tag, msg));
        aVar.b(f11, tr2);
        setTag$default(this, tag, false, 2, null);
        n80.a.b(tr2, msg, new Object[0]);
    }
}