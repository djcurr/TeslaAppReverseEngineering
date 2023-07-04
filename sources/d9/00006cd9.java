package f2;

/* loaded from: classes.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(long j11, long j12) {
        return s1.l.g(j12) / s1.l.g(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j11, long j12) {
        return Math.max(h(j11, j12), e(j11, j12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(long j11, long j12) {
        return Math.min(h(j11, j12), e(j11, j12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(long j11, long j12) {
        return s1.l.i(j12) / s1.l.i(j11);
    }
}