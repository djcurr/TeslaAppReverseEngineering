package a0;

import android.os.Looper;

/* loaded from: classes.dex */
public final class j {
    public static void a() {
        v3.h.i(b(), "Not in application's main thread");
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}