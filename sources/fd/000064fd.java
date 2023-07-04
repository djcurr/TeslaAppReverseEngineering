package d2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final long f23409a;

    private /* synthetic */ t(long j11) {
        this.f23409a = j11;
    }

    public static final /* synthetic */ t a(long j11) {
        return new t(j11);
    }

    public static long b(long j11) {
        return j11;
    }

    public static boolean c(long j11, Object obj) {
        return (obj instanceof t) && j11 == ((t) obj).g();
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static int e(long j11) {
        return Long.hashCode(j11);
    }

    public static String f(long j11) {
        return "PointerId(value=" + j11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.f23409a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f23409a;
    }

    public int hashCode() {
        return e(this.f23409a);
    }

    public String toString() {
        return f(this.f23409a);
    }
}