package q70;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public final class e {
    static {
        BigInteger.valueOf(0L);
        BigInteger.valueOf(1L);
        BigInteger.valueOf(2L);
        BigInteger.valueOf(4L);
    }

    public static int a(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 < 0) {
            i11 = -i11;
        }
        int i12 = 0;
        while (i11 > 0) {
            i12++;
            i11 >>>= 8;
        }
        return i12;
    }
}