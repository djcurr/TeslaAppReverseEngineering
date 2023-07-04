package pr;

import kotlin.jvm.internal.m0;

/* loaded from: classes2.dex */
public final class f {
    public static final boolean a(Object me2, Object you) {
        kotlin.jvm.internal.s.g(me2, "me");
        kotlin.jvm.internal.s.g(you, "you");
        if (kotlin.jvm.internal.s.c(m0.b(me2.getClass()), m0.b(you.getClass()))) {
            if (me2 instanceof e) {
                return kotlin.jvm.internal.s.c(((e) me2).a(), ((e) you).a());
            }
            return true;
        }
        return false;
    }
}