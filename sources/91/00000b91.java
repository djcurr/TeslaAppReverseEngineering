package b0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ScheduledExecutorService f7165a;

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService a() {
        if (f7165a != null) {
            return f7165a;
        }
        synchronized (f.class) {
            if (f7165a == null) {
                f7165a = new c(new Handler(Looper.getMainLooper()));
            }
        }
        return f7165a;
    }
}