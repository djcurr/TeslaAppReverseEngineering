package b1;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final float f7239a = x2.g.f(10);

    public static final float a(x2.d getRippleEndRadius, boolean z11, long j11) {
        s.g(getRippleEndRadius, "$this$getRippleEndRadius");
        float k11 = s1.f.k(s1.g.a(s1.l.i(j11), s1.l.g(j11))) / 2.0f;
        return z11 ? k11 + getRippleEndRadius.i0(f7239a) : k11;
    }

    public static final float b(long j11) {
        return Math.max(s1.l.i(j11), s1.l.g(j11)) * 0.3f;
    }
}