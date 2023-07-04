package kz;

import android.os.Looper;
import io.sentry.protocol.u;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class d {
    public static boolean a() {
        return d(Thread.currentThread());
    }

    private static boolean b(long j11) {
        return Looper.getMainLooper().getThread().getId() == j11;
    }

    public static boolean c(u uVar) {
        Long i11 = uVar.i();
        return i11 != null && b(i11.longValue());
    }

    public static boolean d(Thread thread) {
        return b(thread.getId());
    }
}