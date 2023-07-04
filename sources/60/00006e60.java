package fl;

import com.google.common.base.u;

/* loaded from: classes3.dex */
public final class f {
    public static int a(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    public static long b(long... jArr) {
        u.d(jArr.length > 0);
        long j11 = jArr[0];
        for (int i11 = 1; i11 < jArr.length; i11++) {
            if (jArr[i11] > j11) {
                j11 = jArr[i11];
            }
        }
        return j11;
    }
}