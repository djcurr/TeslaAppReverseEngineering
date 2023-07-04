package g6;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f {
    public static final void a(k log, String tag, Throwable throwable) {
        s.g(log, "$this$log");
        s.g(tag, "tag");
        s.g(throwable, "throwable");
        if (log.getLevel() <= 6) {
            log.a(tag, 6, null, throwable);
        }
    }
}