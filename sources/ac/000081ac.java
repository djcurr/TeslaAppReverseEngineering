package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class w0 {
    public static long a(int i11, int i12) {
        return b(i11 * i12);
    }

    private static long b(long j11) {
        return j11;
    }

    public static /* synthetic */ long c(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            i12 = x0.f36300a.a();
        }
        return a(i11, i12);
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static int e(long j11) {
        return Long.hashCode(j11);
    }
}