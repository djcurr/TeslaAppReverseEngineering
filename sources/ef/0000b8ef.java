package v20;

/* loaded from: classes5.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.f0 f53981a = new kotlinx.coroutines.internal.f0("REMOVED_TASK");

    /* renamed from: b  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.f0 f53982b = new kotlinx.coroutines.internal.f0("CLOSED_EMPTY");

    public static final long c(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        if (j11 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j11;
    }
}