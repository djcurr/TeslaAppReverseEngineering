package kd;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: b  reason: collision with root package name */
    private static h f34572b;

    private h() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static h g() {
        if (f34572b == null) {
            f34572b = new h();
        }
        return f34572b;
    }

    @Override // kd.d, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}