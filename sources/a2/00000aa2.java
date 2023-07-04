package atd.i0;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {
    public static BigInteger a(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] a(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            byte[] byteArray = bigInteger.toByteArray();
            return (bigInteger.bitLength() % 8 == 0 && byteArray[0] == 0 && byteArray.length > 1) ? Arrays.copyOfRange(byteArray, 1, byteArray.length) : byteArray;
        }
        throw new IllegalArgumentException(atd.s0.a.a(-797677169994304L));
    }
}