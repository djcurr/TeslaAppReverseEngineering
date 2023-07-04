package org.bson.types;

import ch.qos.logback.core.CoreConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes5.dex */
public final class Decimal128 extends Number implements Comparable<Decimal128> {

    /* renamed from: a  reason: collision with root package name */
    private final long f43225a;

    /* renamed from: b  reason: collision with root package name */
    private final long f43226b;

    static {
        new BigInteger("10");
        new BigInteger("1");
        new BigInteger("0");
        new HashSet(Collections.singletonList("nan"));
        new HashSet(Collections.singletonList("-nan"));
        new HashSet(Arrays.asList("inf", "+inf", "infinity", "+infinity"));
        new HashSet(Arrays.asList("-inf", "-infinity"));
        fromIEEE754BIDEncoding(8646911284551352320L, 0L);
        fromIEEE754BIDEncoding(-576460752303423488L, 0L);
        fromIEEE754BIDEncoding(-288230376151711744L, 0L);
        fromIEEE754BIDEncoding(8935141660703064064L, 0L);
        fromIEEE754BIDEncoding(3476778912330022912L, 0L);
        fromIEEE754BIDEncoding(-5746593124524752896L, 0L);
    }

    private Decimal128(long j11, long j12) {
        this.f43225a = j11;
        this.f43226b = j12;
    }

    private BigDecimal a() {
        int i11 = -d();
        if (o()) {
            return BigDecimal.valueOf(0L, i11);
        }
        return new BigDecimal(new BigInteger(k() ? -1 : 1, c()), i11);
    }

    private byte[] c() {
        byte[] bArr = new byte[15];
        long j11 = 255;
        long j12 = 255;
        for (int i11 = 14; i11 >= 7; i11--) {
            bArr[i11] = (byte) ((this.f43226b & j12) >>> ((14 - i11) << 3));
            j12 <<= 8;
        }
        for (int i12 = 6; i12 >= 1; i12--) {
            bArr[i12] = (byte) ((this.f43225a & j11) >>> ((6 - i12) << 3));
            j11 <<= 8;
        }
        bArr[0] = (byte) ((281474976710656L & this.f43225a) >>> 48);
        return bArr;
    }

    private int d() {
        long j11;
        char c11;
        if (o()) {
            j11 = this.f43225a & 2305807824841605120L;
            c11 = '/';
        } else {
            j11 = this.f43225a & 9223231299366420480L;
            c11 = '1';
        }
        return ((int) (j11 >>> c11)) - 6176;
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j11, long j12) {
        return new Decimal128(j11, j12);
    }

    private boolean g(BigDecimal bigDecimal) {
        return k() && bigDecimal.signum() == 0;
    }

    private boolean l(BigDecimal bigDecimal) {
        return (i() || h() || bigDecimal.compareTo(BigDecimal.ZERO) != 0) ? false : true;
    }

    private String n() {
        StringBuilder sb2 = new StringBuilder();
        BigDecimal a11 = a();
        String bigInteger = a11.unscaledValue().abs().toString();
        if (k()) {
            sb2.append(CoreConstants.DASH_CHAR);
        }
        int i11 = -a11.scale();
        int length = (bigInteger.length() - 1) + i11;
        if (i11 > 0 || length < -6) {
            sb2.append(bigInteger.charAt(0));
            if (bigInteger.length() > 1) {
                sb2.append(CoreConstants.DOT);
                sb2.append((CharSequence) bigInteger, 1, bigInteger.length());
            }
            sb2.append('E');
            if (length > 0) {
                sb2.append('+');
            }
            sb2.append(length);
        } else if (i11 == 0) {
            sb2.append(bigInteger);
        } else {
            int length2 = (-i11) - bigInteger.length();
            if (length2 >= 0) {
                sb2.append('0');
                sb2.append(CoreConstants.DOT);
                for (int i12 = 0; i12 < length2; i12++) {
                    sb2.append('0');
                }
                sb2.append((CharSequence) bigInteger, 0, bigInteger.length());
            } else {
                int i13 = -length2;
                sb2.append((CharSequence) bigInteger, 0, i13);
                sb2.append(CoreConstants.DOT);
                sb2.append((CharSequence) bigInteger, i13, i13 - i11);
            }
        }
        return sb2.toString();
    }

    private boolean o() {
        return (this.f43225a & 6917529027641081856L) == 6917529027641081856L;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(Decimal128 decimal128) {
        if (i()) {
            return !decimal128.i();
        }
        if (h()) {
            if (k()) {
                return (decimal128.h() && decimal128.k()) ? 0 : -1;
            } else if (decimal128.i()) {
                return -1;
            } else {
                return (!decimal128.h() || decimal128.k()) ? 1 : 0;
            }
        }
        BigDecimal a11 = a();
        BigDecimal a12 = decimal128.a();
        if (l(a11) && decimal128.l(a12)) {
            if (g(a11)) {
                return decimal128.g(a12) ? 0 : -1;
            } else if (decimal128.g(a12)) {
                return 1;
            }
        }
        if (decimal128.i()) {
            return -1;
        }
        if (decimal128.h()) {
            return decimal128.k() ? 1 : -1;
        }
        return a11.compareTo(a12);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        if (i()) {
            return Double.NaN;
        }
        if (h()) {
            return k() ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        BigDecimal a11 = a();
        if (g(a11)) {
            return -0.0d;
        }
        return a11.doubleValue();
    }

    public long e() {
        return this.f43225a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Decimal128.class != obj.getClass()) {
            return false;
        }
        Decimal128 decimal128 = (Decimal128) obj;
        return this.f43225a == decimal128.f43225a && this.f43226b == decimal128.f43226b;
    }

    public long f() {
        return this.f43226b;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public boolean h() {
        return (this.f43225a & 8646911284551352320L) == 8646911284551352320L;
    }

    public int hashCode() {
        long j11 = this.f43226b;
        long j12 = this.f43225a;
        return (((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public boolean i() {
        return (this.f43225a & 8935141660703064064L) == 8935141660703064064L;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) doubleValue();
    }

    public boolean k() {
        return (this.f43225a & Long.MIN_VALUE) == Long.MIN_VALUE;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) doubleValue();
    }

    public String toString() {
        if (i()) {
            return "NaN";
        }
        if (h()) {
            return k() ? "-Infinity" : "Infinity";
        }
        return n();
    }
}