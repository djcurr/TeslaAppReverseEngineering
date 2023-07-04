package t9;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static long f51758a = -1;

    public static synchronized boolean a() {
        boolean z11;
        synchronized (b.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - f51758a >= 3000) {
                f51758a = elapsedRealtime;
                z11 = false;
            } else {
                z11 = true;
            }
        }
        return z11;
    }
}