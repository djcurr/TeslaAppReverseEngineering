package com.facebook.common.time;

import android.os.SystemClock;
import md.d;
import td.b;

@d
/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final RealtimeSinceBootClock f11058a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f11058a;
    }

    @Override // td.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}