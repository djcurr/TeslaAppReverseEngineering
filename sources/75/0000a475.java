package org.spongycastle.pqc.math.linearalgebra;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.d;
import java.math.BigInteger;
import java.security.SecureRandom;
import okhttp3.internal.http.StatusLine;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

/* loaded from: classes4.dex */
public final class IntegerFunctions {
    private static final long SMALL_PRIME_PRODUCT = 152125131763605L;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger FOUR = BigInteger.valueOf(4);
    private static final int[] SMALL_PRIMES = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};

    /* renamed from: sr  reason: collision with root package name */
    private static SecureRandom f43878sr = null;
    private static final int[] jacobiTable = {0, 1, 0, -1, 0, -1, 0, 1};

    private IntegerFunctions() {
    }

    public static BigInteger binomial(int i11, int i12) {
        BigInteger bigInteger = ONE;
        if (i11 == 0) {
            return i12 == 0 ? bigInteger : ZERO;
        }
        if (i12 > (i11 >>> 1)) {
            i12 = i11 - i12;
        }
        for (int i13 = 1; i13 <= i12; i13++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i11 - (i13 - 1))).divide(BigInteger.valueOf(i13));
        }
        return bigInteger;
    }

    public static int bitCount(int i11) {
        int i12 = 0;
        while (i11 != 0) {
            i12 += i11 & 1;
            i11 >>>= 1;
        }
        return i12;
    }

    public static int ceilLog(int i11) {
        int i12 = 1;
        int i13 = 0;
        while (i12 < i11) {
            i12 <<= 1;
            i13++;
        }
        return i13;
    }

    public static int ceilLog(BigInteger bigInteger) {
        int i11 = 0;
        for (BigInteger bigInteger2 = ONE; bigInteger2.compareTo(bigInteger) < 0; bigInteger2 = bigInteger2.shiftLeft(1)) {
            i11++;
        }
        return i11;
    }

    public static int ceilLog256(int i11) {
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

    public static int ceilLog256(long j11) {
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 == 0) {
            return 1;
        }
        if (i11 < 0) {
            j11 = -j11;
        }
        int i12 = 0;
        while (j11 > 0) {
            i12++;
            j11 >>>= 8;
        }
        return i12;
    }

    public static BigInteger divideAndRound(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() < 0) {
            return divideAndRound(bigInteger.negate(), bigInteger2).negate();
        }
        if (bigInteger2.signum() < 0) {
            return divideAndRound(bigInteger, bigInteger2.negate()).negate();
        }
        return bigInteger.shiftLeft(1).add(bigInteger2).divide(bigInteger2.shiftLeft(1));
    }

    public static int[] extGCD(int i11, int i12) {
        BigInteger[] extgcd = extgcd(BigInteger.valueOf(i11), BigInteger.valueOf(i12));
        return new int[]{extgcd[0].intValue(), extgcd[1].intValue(), extgcd[2].intValue()};
    }

    public static BigInteger[] extgcd(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = ONE;
        BigInteger bigInteger4 = ZERO;
        if (bigInteger2.signum() != 0) {
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger2;
            while (bigInteger6.signum() != 0) {
                BigInteger[] divideAndRemainder = bigInteger5.divideAndRemainder(bigInteger6);
                BigInteger bigInteger7 = divideAndRemainder[0];
                BigInteger bigInteger8 = divideAndRemainder[1];
                BigInteger bigInteger9 = bigInteger4;
                bigInteger4 = bigInteger3.subtract(bigInteger7.multiply(bigInteger4));
                bigInteger3 = bigInteger9;
                bigInteger5 = bigInteger6;
                bigInteger6 = bigInteger8;
            }
            bigInteger4 = bigInteger5.subtract(bigInteger.multiply(bigInteger3)).divide(bigInteger2);
            bigInteger = bigInteger5;
        }
        return new BigInteger[]{bigInteger, bigInteger3, bigInteger4};
    }

    public static float floatPow(float f11, int i11) {
        float f12 = 1.0f;
        while (i11 > 0) {
            f12 *= f11;
            i11--;
        }
        return f12;
    }

    public static int floorLog(int i11) {
        if (i11 <= 0) {
            return -1;
        }
        int i12 = 0;
        for (int i13 = i11 >>> 1; i13 > 0; i13 >>>= 1) {
            i12++;
        }
        return i12;
    }

    public static int floorLog(BigInteger bigInteger) {
        int i11 = -1;
        for (BigInteger bigInteger2 = ONE; bigInteger2.compareTo(bigInteger) <= 0; bigInteger2 = bigInteger2.shiftLeft(1)) {
            i11++;
        }
        return i11;
    }

    public static int gcd(int i11, int i12) {
        return BigInteger.valueOf(i11).gcd(BigInteger.valueOf(i12)).intValue();
    }

    public static float intRoot(int i11, int i12) {
        float f11 = i11 / i12;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        while (Math.abs(f12 - f11) > 1.0E-4d) {
            float floatPow = floatPow(f11, i12);
            while (Float.isInfinite(floatPow)) {
                f11 = (f11 + f12) / 2.0f;
                floatPow = floatPow(f11, i12);
            }
            f12 = f11;
            f11 -= (floatPow - i11) / (i12 * floatPow(f11, i12 - 1));
        }
        return f11;
    }

    public static byte[] integerToOctets(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.abs().toByteArray();
        if ((bigInteger.bitLength() & 7) != 0) {
            return byteArray;
        }
        int bitLength = bigInteger.bitLength() >> 3;
        byte[] bArr = new byte[bitLength];
        System.arraycopy(byteArray, 1, bArr, 0, bitLength);
        return bArr;
    }

    public static boolean isIncreasing(int[] iArr) {
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = i11 - 1;
            if (iArr[i12] >= iArr[i11]) {
                System.out.println("a[" + i12 + "] = " + iArr[i12] + " >= " + iArr[i11] + " = a[" + i11 + "]");
                return false;
            }
        }
        return true;
    }

    public static int isPower(int i11, int i12) {
        if (i11 <= 0) {
            return -1;
        }
        int i13 = 0;
        while (i11 > 1) {
            if (i11 % i12 != 0) {
                return -1;
            }
            i11 /= i12;
            i13++;
        }
        return i13;
    }

    public static boolean isPrime(int i11) {
        if (i11 < 2) {
            return false;
        }
        if (i11 == 2) {
            return true;
        }
        if ((i11 & 1) == 0) {
            return false;
        }
        if (i11 < 42) {
            int i12 = 0;
            while (true) {
                int[] iArr = SMALL_PRIMES;
                if (i12 >= iArr.length) {
                    break;
                } else if (i11 == iArr[i12]) {
                    return true;
                } else {
                    i12++;
                }
            }
        }
        if (i11 % 3 == 0 || i11 % 5 == 0 || i11 % 7 == 0 || i11 % 11 == 0 || i11 % 13 == 0 || i11 % 17 == 0 || i11 % 19 == 0 || i11 % 23 == 0 || i11 % 29 == 0 || i11 % 31 == 0 || i11 % 37 == 0 || i11 % 41 == 0) {
            return false;
        }
        return BigInteger.valueOf(i11).isProbablePrime(20);
    }

    public static int jacobi(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = ZERO;
        if (bigInteger2.equals(bigInteger3)) {
            return bigInteger.abs().equals(ONE) ? 1 : 0;
        }
        if (bigInteger.testBit(0) || bigInteger2.testBit(0)) {
            long j11 = 1;
            if (bigInteger2.signum() == -1) {
                bigInteger2 = bigInteger2.negate();
                if (bigInteger.signum() == -1) {
                    j11 = -1;
                }
            }
            while (!bigInteger2.testBit(0)) {
                bigInteger3 = bigInteger3.add(ONE);
                bigInteger2 = bigInteger2.divide(TWO);
            }
            if (bigInteger3.testBit(0)) {
                j11 *= jacobiTable[bigInteger.intValue() & 7];
            }
            if (bigInteger.signum() < 0) {
                if (bigInteger2.testBit(1)) {
                    j11 = -j11;
                }
                bigInteger = bigInteger.negate();
            }
            while (bigInteger.signum() != 0) {
                BigInteger bigInteger4 = ZERO;
                while (!bigInteger.testBit(0)) {
                    bigInteger4 = bigInteger4.add(ONE);
                    bigInteger = bigInteger.divide(TWO);
                }
                if (bigInteger4.testBit(0)) {
                    j11 *= jacobiTable[bigInteger2.intValue() & 7];
                }
                if (bigInteger.compareTo(bigInteger2) >= 0) {
                    BigInteger bigInteger5 = bigInteger2;
                    bigInteger2 = bigInteger;
                    bigInteger = bigInteger5;
                } else if (bigInteger2.testBit(1) && bigInteger.testBit(1)) {
                    j11 = -j11;
                }
                BigInteger subtract = bigInteger2.subtract(bigInteger);
                bigInteger2 = bigInteger;
                bigInteger = subtract;
            }
            if (bigInteger2.equals(ONE)) {
                return (int) j11;
            }
            return 0;
        }
        return 0;
    }

    public static BigInteger leastCommonMultiple(BigInteger[] bigIntegerArr) {
        int length = bigIntegerArr.length;
        BigInteger bigInteger = bigIntegerArr[0];
        for (int i11 = 1; i11 < length; i11++) {
            bigInteger = bigInteger.multiply(bigIntegerArr[i11]).divide(bigInteger.gcd(bigIntegerArr[i11]));
        }
        return bigInteger;
    }

    public static int leastDiv(int i11) {
        if (i11 < 0) {
            i11 = -i11;
        }
        if (i11 == 0) {
            return 1;
        }
        if ((i11 & 1) == 0) {
            return 2;
        }
        for (int i12 = 3; i12 <= i11 / i12; i12 += 2) {
            if (i11 % i12 == 0) {
                return i12;
            }
        }
        return i11;
    }

    public static double log(double d11) {
        double d12 = 1.0d;
        if (d11 > 0.0d && d11 < 1.0d) {
            return -log(1.0d / d11);
        }
        int i11 = 0;
        double d13 = d11;
        while (d13 > 2.0d) {
            d13 /= 2.0d;
            i11++;
            d12 *= 2.0d;
        }
        return i11 + logBKM(d11 / d12);
    }

    private static double logBKM(double d11) {
        double[] dArr = {1.0d, 0.5849625007211562d, 0.32192809488736235d, 0.16992500144231237d, 0.0874628412503394d, 0.044394119358453436d, 0.02236781302845451d, 0.01122725542325412d, 0.005624549193878107d, 0.0028150156070540383d, 0.0014081943928083889d, 7.042690112466433E-4d, 3.5217748030102726E-4d, 1.7609948644250602E-4d, 8.80524301221769E-5d, 4.4026886827316716E-5d, 2.2013611360340496E-5d, 1.1006847667481442E-5d, 5.503434330648604E-6d, 2.751719789561283E-6d, 1.375860550841138E-6d, 6.879304394358497E-7d, 3.4396526072176454E-7d, 1.7198264061184464E-7d, 8.599132286866321E-8d, 4.299566207501687E-8d, 2.1497831197679756E-8d, 1.0748915638882709E-8d, 5.374457829452062E-9d, 2.687228917228708E-9d, 1.3436144592400231E-9d, 6.718072297764289E-10d, 3.3590361492731876E-10d, 1.6795180747343547E-10d, 8.397590373916176E-11d, 4.1987951870191886E-11d, 2.0993975935248694E-11d, 1.0496987967662534E-11d, 5.2484939838408146E-12d, 2.624246991922794E-12d, 1.3121234959619935E-12d, 6.56061747981146E-13d, 3.2803087399061026E-13d, 1.6401543699531447E-13d, 8.200771849765956E-14d, 4.1003859248830365E-14d, 2.0501929624415328E-14d, 1.02509648122077E-14d, 5.1254824061038595E-15d, 2.5627412030519317E-15d, 1.2813706015259665E-15d, 6.406853007629834E-16d, 3.203426503814917E-16d, 1.6017132519074588E-16d, 8.008566259537294E-17d, 4.004283129768647E-17d, 2.0021415648843235E-17d, 1.0010707824421618E-17d, 5.005353912210809E-18d, 2.5026769561054044E-18d, 1.2513384780527022E-18d, 6.256692390263511E-19d, 3.1283461951317555E-19d, 1.5641730975658778E-19d, 7.820865487829389E-20d, 3.9104327439146944E-20d, 1.9552163719573472E-20d, 9.776081859786736E-21d, 4.888040929893368E-21d, 2.444020464946684E-21d, 1.222010232473342E-21d, 6.11005116236671E-22d, 3.055025581183355E-22d, 1.5275127905916775E-22d, 7.637563952958387E-23d, 3.818781976479194E-23d, 1.909390988239597E-23d, 9.546954941197984E-24d, 4.773477470598992E-24d, 2.386738735299496E-24d, 1.193369367649748E-24d, 5.96684683824874E-25d, 2.98342341912437E-25d, 1.491711709562185E-25d, 7.458558547810925E-26d, 3.7292792739054626E-26d, 1.8646396369527313E-26d, 9.323198184763657E-27d, 4.661599092381828E-27d, 2.330799546190914E-27d, 1.165399773095457E-27d, 5.826998865477285E-28d, 2.9134994327386427E-28d, 1.4567497163693213E-28d, 7.283748581846607E-29d, 3.6418742909233034E-29d, 1.8209371454616517E-29d, 9.104685727308258E-30d, 4.552342863654129E-30d, 2.2761714318270646E-30d};
        double d12 = 1.0d;
        double d13 = 0.0d;
        double d14 = 1.0d;
        for (int i11 = 0; i11 < 53; i11++) {
            double d15 = (d12 * d14) + d12;
            if (d15 <= d11) {
                d13 += dArr[i11];
                d12 = d15;
            }
            d14 *= 0.5d;
        }
        return d13;
    }

    public static int maxPower(int i11) {
        int i12 = 0;
        if (i11 != 0) {
            for (int i13 = 1; (i11 & i13) == 0; i13 <<= 1) {
                i12++;
            }
        }
        return i12;
    }

    public static long mod(long j11, long j12) {
        long j13 = j11 % j12;
        return j13 < 0 ? j13 + j12 : j13;
    }

    public static int modInverse(int i11, int i12) {
        return BigInteger.valueOf(i11).modInverse(BigInteger.valueOf(i12)).intValue();
    }

    public static int modPow(int i11, int i12, int i13) {
        if (i13 <= 0 || i13 * i13 > Integer.MAX_VALUE || i12 < 0) {
            return 0;
        }
        int i14 = ((i11 % i13) + i13) % i13;
        int i15 = 1;
        while (i12 > 0) {
            if ((i12 & 1) == 1) {
                i15 = (i15 * i14) % i13;
            }
            i14 = (i14 * i14) % i13;
            i12 >>>= 1;
        }
        return i15;
    }

    public static BigInteger nextPrime(long j11) {
        if (j11 <= 1) {
            return BigInteger.valueOf(2L);
        }
        if (j11 == 2) {
            return BigInteger.valueOf(3L);
        }
        boolean z11 = false;
        long j12 = 0;
        for (long j13 = j11 + 1 + (j11 & 1); j13 <= (j11 << 1) && !z11; j13 += 2) {
            for (long j14 = 3; j14 <= (j13 >> 1) && !z11; j14 += 2) {
                if (j13 % j14 == 0) {
                    z11 = true;
                }
            }
            if (!z11) {
                j12 = j13;
            }
            z11 = !z11;
        }
        return BigInteger.valueOf(j12);
    }

    public static BigInteger nextProbablePrime(BigInteger bigInteger, int i11) {
        if (bigInteger.signum() >= 0 && bigInteger.signum() != 0) {
            BigInteger bigInteger2 = ONE;
            if (!bigInteger.equals(bigInteger2)) {
                BigInteger add = bigInteger.add(bigInteger2);
                if (!add.testBit(0)) {
                    add = add.add(bigInteger2);
                }
                while (true) {
                    if (add.bitLength() > 6) {
                        long longValue = add.remainder(BigInteger.valueOf(SMALL_PRIME_PRODUCT)).longValue();
                        if (longValue % 3 == 0 || longValue % 5 == 0 || longValue % 7 == 0 || longValue % 11 == 0 || longValue % 13 == 0 || longValue % 17 == 0 || longValue % 19 == 0 || longValue % 23 == 0 || longValue % 29 == 0 || longValue % 31 == 0 || longValue % 37 == 0 || longValue % 41 == 0) {
                            add = add.add(TWO);
                        }
                    }
                    if (add.bitLength() < 4 || add.isProbablePrime(i11)) {
                        return add;
                    }
                    add = add.add(TWO);
                }
            }
        }
        return TWO;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0020 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0010 -> B:12:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int nextSmallerPrime(int r4) {
        /*
            r0 = 2
            r1 = 1
            if (r4 > r0) goto L5
            return r1
        L5:
            r2 = 3
            if (r4 != r2) goto L9
            return r0
        L9:
            r0 = r4 & 1
            if (r0 != 0) goto L10
            int r4 = r4 + (-1)
            goto L12
        L10:
            int r4 = r4 + (-2)
        L12:
            if (r4 <= r2) goto L16
            r0 = r1
            goto L17
        L16:
            r0 = 0
        L17:
            boolean r3 = isPrime(r4)
            r3 = r3 ^ r1
            r0 = r0 & r3
            if (r0 == 0) goto L20
            goto L10
        L20:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.pqc.math.linearalgebra.IntegerFunctions.nextSmallerPrime(int):int");
    }

    public static BigInteger octetsToInteger(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12 + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, i11, bArr2, 1, i12);
        return new BigInteger(bArr2);
    }

    public static int order(int i11, int i12) {
        int i13 = i11 % i12;
        if (i13 == 0) {
            throw new IllegalArgumentException(i11 + " is not an element of Z/(" + i12 + "Z)^*; it is not meaningful to compute its order.");
        }
        int i14 = 1;
        while (i13 != 1) {
            i13 = (i13 * i11) % i12;
            if (i13 < 0) {
                i13 += i12;
            }
            i14++;
        }
        return i14;
    }

    public static boolean passesSmallPrimeTest(BigInteger bigInteger) {
        int[] iArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 137, 139, 149, 151, 157, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, StatusLine.HTTP_TEMP_REDIRECT, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, 419, StatusLine.HTTP_MISDIRECTED_REQUEST, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, DownloaderService.STATUS_UNKNOWN_ERROR, DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997, 1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063, 1069, 1087, 1091, 1093, 1097, 1103, 1109, 1117, 1123, 1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, 1201, 1213, 1217, 1223, 1229, 1231, 1237, 1249, 1259, 1277, 1279, 1283, 1289, 1291, 1297, 1301, 1303, 1307, 1319, 1321, 1327, 1361, 1367, 1373, 1381, 1399, 1409, 1423, 1427, 1429, 1433, 1439, 1447, 1451, 1453, 1459, 1471, 1481, 1483, 1487, 1489, 1493, 1499};
        for (int i11 = 0; i11 < 239; i11++) {
            if (bigInteger.mod(BigInteger.valueOf(iArr[i11])).equals(ZERO)) {
                return false;
            }
        }
        return true;
    }

    public static int pow(int i11, int i12) {
        int i13 = 1;
        while (i12 > 0) {
            if ((i12 & 1) == 1) {
                i13 *= i11;
            }
            i11 *= i11;
            i12 >>>= 1;
        }
        return i13;
    }

    public static long pow(long j11, int i11) {
        long j12 = 1;
        while (i11 > 0) {
            if ((i11 & 1) == 1) {
                j12 *= j11;
            }
            j11 *= j11;
            i11 >>>= 1;
        }
        return j12;
    }

    public static BigInteger randomize(BigInteger bigInteger) {
        if (f43878sr == null) {
            f43878sr = new SecureRandom();
        }
        return randomize(bigInteger, f43878sr);
    }

    public static BigInteger reduceInto(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger.subtract(bigInteger2).mod(bigInteger3.subtract(bigInteger2)).add(bigInteger2);
    }

    public static BigInteger ressol(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3;
        BigInteger bigInteger4 = ZERO;
        BigInteger bigInteger5 = bigInteger;
        if (bigInteger5.compareTo(bigInteger4) < 0) {
            bigInteger5 = bigInteger.add(bigInteger2);
        }
        if (bigInteger5.equals(bigInteger4)) {
            return bigInteger4;
        }
        if (bigInteger2.equals(TWO)) {
            return bigInteger5;
        }
        int i11 = 1;
        if (bigInteger2.testBit(0) && bigInteger2.testBit(1)) {
            if (jacobi(bigInteger5, bigInteger2) == 1) {
                return bigInteger5.modPow(bigInteger2.add(ONE).shiftRight(2), bigInteger2);
            }
            throw new IllegalArgumentException("No quadratic residue: " + bigInteger5 + ", " + bigInteger2);
        }
        BigInteger subtract = bigInteger2.subtract(ONE);
        long j11 = 0;
        while (!subtract.testBit(0)) {
            j11++;
            subtract = subtract.shiftRight(1);
        }
        BigInteger bigInteger6 = ONE;
        BigInteger shiftRight = subtract.subtract(bigInteger6).shiftRight(1);
        BigInteger modPow = bigInteger5.modPow(shiftRight, bigInteger2);
        BigInteger remainder = modPow.multiply(modPow).remainder(bigInteger2).multiply(bigInteger5).remainder(bigInteger2);
        BigInteger remainder2 = modPow.multiply(bigInteger5).remainder(bigInteger2);
        if (remainder.equals(bigInteger6)) {
            return remainder2;
        }
        BigInteger bigInteger7 = TWO;
        while (jacobi(bigInteger7, bigInteger2) == 1) {
            bigInteger7 = bigInteger7.add(ONE);
        }
        BigInteger modPow2 = bigInteger7.modPow(shiftRight.multiply(TWO).add(ONE), bigInteger2);
        while (remainder.compareTo(ONE) == i11) {
            long j12 = 0;
            BigInteger bigInteger8 = remainder;
            while (true) {
                bigInteger3 = ONE;
                if (bigInteger8.equals(bigInteger3)) {
                    break;
                }
                bigInteger8 = bigInteger8.multiply(bigInteger8).mod(bigInteger2);
                j12++;
            }
            long j13 = j11 - j12;
            if (j13 != 0) {
                for (long j14 = 0; j14 < j13 - 1; j14++) {
                    bigInteger3 = bigInteger3.shiftLeft(1);
                }
                BigInteger modPow3 = modPow2.modPow(bigInteger3, bigInteger2);
                remainder2 = remainder2.multiply(modPow3).remainder(bigInteger2);
                modPow2 = modPow3.multiply(modPow3).remainder(bigInteger2);
                remainder = remainder.multiply(modPow2).mod(bigInteger2);
                i11 = 1;
                j11 = j12;
            } else {
                throw new IllegalArgumentException("No quadratic residue: " + bigInteger5 + ", " + bigInteger2);
            }
        }
        return remainder2;
    }

    public static BigInteger squareRoot(BigInteger bigInteger) {
        int i11;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = ZERO;
        if (bigInteger.compareTo(bigInteger3) >= 0) {
            int bitLength = bigInteger.bitLength();
            if ((bitLength & 1) != 0) {
                int i12 = bitLength - 1;
                bigInteger2 = bigInteger3;
                bigInteger3 = bigInteger3.add(ONE);
                i11 = i12;
            } else {
                i11 = bitLength;
                bigInteger2 = bigInteger3;
            }
            while (i11 > 0) {
                BigInteger bigInteger4 = FOUR;
                BigInteger multiply = bigInteger2.multiply(bigInteger4);
                int i13 = i11 - 1;
                int i14 = bigInteger.testBit(i13) ? 2 : 0;
                i11 = i13 - 1;
                bigInteger2 = multiply.add(BigInteger.valueOf(i14 + (bigInteger.testBit(i11) ? 1 : 0)));
                BigInteger multiply2 = bigInteger3.multiply(bigInteger4);
                BigInteger bigInteger5 = ONE;
                BigInteger add = multiply2.add(bigInteger5);
                bigInteger3 = bigInteger3.multiply(TWO);
                if (bigInteger2.compareTo(add) != -1) {
                    bigInteger3 = bigInteger3.add(bigInteger5);
                    bigInteger2 = bigInteger2.subtract(add);
                }
            }
            return bigInteger3;
        }
        throw new ArithmeticException("cannot extract root of negative number" + bigInteger + ".");
    }

    public static double log(long j11) {
        int floorLog = floorLog(BigInteger.valueOf(j11));
        return floorLog + logBKM(j11 / (1 << floorLog));
    }

    public static long modInverse(long j11, long j12) {
        return BigInteger.valueOf(j11).modInverse(BigInteger.valueOf(j12)).longValue();
    }

    public static BigInteger randomize(BigInteger bigInteger, SecureRandom secureRandom) {
        int bitLength = bigInteger.bitLength();
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (secureRandom == null && (secureRandom = f43878sr) == null) {
            secureRandom = new SecureRandom();
        }
        for (int i11 = 0; i11 < 20; i11++) {
            valueOf = new BigInteger(bitLength, secureRandom);
            if (valueOf.compareTo(bigInteger) < 0) {
                return valueOf;
            }
        }
        return valueOf.mod(bigInteger);
    }

    public static BigInteger octetsToInteger(byte[] bArr) {
        return octetsToInteger(bArr, 0, bArr.length);
    }

    public static BigInteger[] divideAndRound(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        for (int i11 = 0; i11 < bigIntegerArr.length; i11++) {
            bigIntegerArr2[i11] = divideAndRound(bigIntegerArr[i11], bigInteger);
        }
        return bigIntegerArr2;
    }

    public static BigInteger nextProbablePrime(BigInteger bigInteger) {
        return nextProbablePrime(bigInteger, 20);
    }
}