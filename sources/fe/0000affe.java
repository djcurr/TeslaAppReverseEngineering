package r2;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class m {
    public static final l a(l start, l stop, float f11) {
        int m11;
        s.g(start, "start");
        s.g(stop, "stop");
        m11 = m00.l.m(y2.a.b(start.k(), stop.k(), f11), 1, 1000);
        return new l(m11);
    }
}