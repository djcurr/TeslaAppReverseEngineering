package a0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Handler f97a;

    private i() {
    }

    public static Handler a() {
        if (f97a != null) {
            return f97a;
        }
        synchronized (i.class) {
            if (f97a == null) {
                f97a = r3.f.a(Looper.getMainLooper());
            }
        }
        return f97a;
    }
}