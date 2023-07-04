package com.tesla.TeslaV4.reactnative.module;

import io.grpc.p0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class z {
    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 b() {
        String v02;
        String t02;
        v02 = kotlin.text.w.v0(yu.a0.f59768c.c(), "/");
        t02 = kotlin.text.w.t0(v02, "https://");
        mx.e j11 = mx.e.e(t02).j();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        p0 a11 = j11.g(30L, timeUnit).h(3L, timeUnit).i(true).a();
        kotlin.jvm.internal.s.f(a11, "builder.build()");
        return a11;
    }
}