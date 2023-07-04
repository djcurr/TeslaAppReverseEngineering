package com.wix.reactnativenotifications;

import com.tesla.logging.TeslaLog;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {
    static {
        new c();
    }

    private c() {
    }

    public static final void a(String tag, String message) {
        s.g(tag, "tag");
        s.g(message, "message");
        TeslaLog.INSTANCE.i(tag, message);
    }
}