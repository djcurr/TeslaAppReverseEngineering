package v20;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class c3 {
    public static /* synthetic */ Thread a(int i11, String str, AtomicInteger atomicInteger, Runnable runnable) {
        return c(i11, str, atomicInteger, runnable);
    }

    public static final q1 b(final int i11, final String str) {
        if (i11 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return s1.c(Executors.newScheduledThreadPool(i11, new ThreadFactory() { // from class: v20.b3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return c3.a(i11, str, atomicInteger, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i11 + " specified").toString());
    }

    public static final Thread c(int i11, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i11 != 1) {
            str = str + CoreConstants.DASH_CHAR + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    public static final q1 d(String str) {
        return b(1, str);
    }
}