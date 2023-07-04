package yf;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class i {
    public static long a() {
        return System.currentTimeMillis();
    }

    public static long b() {
        return System.nanoTime();
    }

    public static long c() {
        return SystemClock.uptimeMillis();
    }
}