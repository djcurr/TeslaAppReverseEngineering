package net.time4j.base;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class b {
    public static void a(int i11, int i12, int i13) {
        if (i11 < -999999999 || i11 > 999999999) {
            throw new IllegalArgumentException("YEAR out of range: " + i11);
        } else if (i12 < 1 || i12 > 12) {
            throw new IllegalArgumentException("MONTH out of range: " + i12);
        } else if (i13 >= 1 && i13 <= 31) {
            if (i13 <= d(i11, i12)) {
                return;
            }
            throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + m(i11, i12, i13));
        } else {
            throw new IllegalArgumentException("DAY_OF_MONTH out of range: " + i13);
        }
    }

    private static int b(int i11) {
        switch (i11) {
            case 1:
                return 28;
            case 2:
                return 31;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 7;
            case 6:
                return 10;
            case 7:
                return 12;
            case 8:
                return 15;
            case 9:
                return 18;
            case 10:
                return 20;
            case 11:
                return 23;
            case 12:
                return 25;
            default:
                throw new IllegalArgumentException("Month out of range: " + i11);
        }
    }

    public static int c(int i11, int i12, int i13) {
        if (i13 >= 1 && i13 <= 31) {
            if (i13 <= d(i11, i12)) {
                int b11 = b(i12);
                int i14 = i11 % 100;
                int a11 = c.a(i11, 100);
                if (i14 < 0) {
                    i14 += 100;
                }
                if (i12 <= 2 && i14 - 1 < 0) {
                    i14 = 99;
                    a11--;
                }
                int a12 = (((((i13 + b11) + i14) + (i14 / 4)) + c.a(a11, 4)) - (a11 * 2)) % 7;
                return a12 <= 0 ? a12 + 7 : a12;
            }
            throw new IllegalArgumentException("Day exceeds month length: " + m(i11, i12, i13));
        }
        throw new IllegalArgumentException("Day out of range: " + i13);
    }

    public static int d(int i11, int i12) {
        switch (i12) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return e(i11) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid month: " + i12);
        }
    }

    public static boolean e(int i11) {
        return (i11 <= 1900 || i11 >= 2100) ? ((i11 & 3) == 0 && i11 % 100 != 0) || i11 % 400 == 0 : (i11 & 3) == 0;
    }

    public static boolean f(int i11, int i12, int i13) {
        return i11 >= -999999999 && i11 <= 999999999 && i12 >= 1 && i12 <= 12 && i13 >= 1 && i13 <= d(i11, i12);
    }

    public static int g(long j11) {
        return (int) (j11 & 255);
    }

    public static int h(long j11) {
        return (int) ((j11 >> 16) & 255);
    }

    public static int i(long j11) {
        return (int) (j11 >> 32);
    }

    public static long j(int i11, int i12, int i13) {
        a(i11, i12, i13);
        long j11 = i11;
        if (i12 < 3) {
            j11--;
            i12 += 12;
        }
        return (((((((365 * j11) + c.b(j11, 4)) - c.b(j11, 100)) + c.b(j11, 400)) + (((i12 + 1) * 153) / 5)) - 123) + i13) - 678881;
    }

    public static long k(a aVar) {
        return j(aVar.getYear(), aVar.getMonth(), aVar.n());
    }

    public static long l(long j11) {
        long j12;
        long f11 = c.f(j11, 678881L);
        long b11 = c.b(f11, 146097);
        int d11 = c.d(f11, 146097);
        int i11 = 29;
        int i12 = 2;
        if (d11 == 146096) {
            j12 = (b11 + 1) * 400;
        } else {
            int i13 = d11 / 36524;
            int i14 = d11 % 36524;
            int i15 = i14 / 1461;
            int i16 = i14 % 1461;
            if (i16 == 1460) {
                j12 = (b11 * 400) + (i13 * 100) + ((i15 + 1) * 4);
            } else {
                int i17 = i16 / 365;
                int i18 = i16 % 365;
                j12 = (b11 * 400) + (i13 * 100) + (i15 * 4) + i17;
                i12 = 2 + (((i18 + 31) * 5) / 153);
                i11 = (i18 - (((i12 + 1) * 153) / 5)) + 123;
                if (i12 > 12) {
                    j12++;
                    i12 -= 12;
                }
            }
        }
        if (j12 >= -999999999 && j12 <= 999999999) {
            return i11 | (j12 << 32) | (i12 << 16);
        }
        throw new IllegalArgumentException("Year out of range: " + j12);
    }

    static String m(int i11, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(CoreConstants.DASH_CHAR);
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        sb2.append(CoreConstants.DASH_CHAR);
        if (i13 < 10) {
            sb2.append('0');
        }
        sb2.append(i13);
        return sb2.toString();
    }
}