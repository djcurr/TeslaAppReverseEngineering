package vz;

import vz.q;

/* loaded from: classes5.dex */
public final class r {
    public static final Object a(Throwable exception) {
        kotlin.jvm.internal.s.g(exception, "exception");
        return new q.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof q.b) {
            throw ((q.b) obj).f54774a;
        }
    }
}