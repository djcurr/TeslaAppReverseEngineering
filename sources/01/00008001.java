package kotlinx.coroutines.internal;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final /* synthetic */ class i0 {
    public static final int a(String str, int i11, int i12, int i13) {
        return (int) g0.c(str, i11, i12, i13);
    }

    public static final long b(String str, long j11, long j12, long j13) {
        Long p11;
        String d11 = g0.d(str);
        if (d11 == null) {
            return j11;
        }
        p11 = kotlin.text.u.p(d11);
        if (p11 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d11 + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        long longValue = p11.longValue();
        boolean z11 = false;
        if (j12 <= longValue && longValue <= j13) {
            z11 = true;
        }
        if (z11) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j12 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + j13 + ", but is '" + longValue + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    public static final boolean c(String str, boolean z11) {
        String d11 = g0.d(str);
        return d11 == null ? z11 : Boolean.parseBoolean(d11);
    }

    public static /* synthetic */ int d(String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = 1;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return g0.b(str, i11, i12, i13);
    }

    public static /* synthetic */ long e(String str, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j12 = 1;
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            j13 = Long.MAX_VALUE;
        }
        return g0.c(str, j11, j14, j13);
    }
}