package com.facebook.common.time;

import android.os.SystemClock;
import md.d;
import td.b;

@d
/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements b {
    @d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // td.b
    @d
    public long now() {
        return SystemClock.uptimeMillis();
    }

    @d
    public long nowNanos() {
        return System.nanoTime();
    }
}