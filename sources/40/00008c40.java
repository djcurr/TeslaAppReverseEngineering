package net.time4j.tz;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public final class p implements Comparable<p>, k, Serializable {

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<Integer, p> f41590d;

    /* renamed from: e  reason: collision with root package name */
    private static final BigDecimal f41591e;

    /* renamed from: f  reason: collision with root package name */
    private static final BigDecimal f41592f;

    /* renamed from: g  reason: collision with root package name */
    private static final BigDecimal f41593g;

    /* renamed from: h  reason: collision with root package name */
    private static final BigDecimal f41594h;

    /* renamed from: i  reason: collision with root package name */
    private static final BigDecimal f41595i;

    /* renamed from: j  reason: collision with root package name */
    private static final BigDecimal f41596j;

    /* renamed from: k  reason: collision with root package name */
    public static final p f41597k;
    private static final long serialVersionUID = -1410512619471503090L;

    /* renamed from: a  reason: collision with root package name */
    private final transient int f41598a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f41599b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f41600c;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f41590d = concurrentHashMap;
        f41591e = new BigDecimal(60);
        f41592f = new BigDecimal(3600);
        f41593g = new BigDecimal(-180);
        f41594h = new BigDecimal((int) CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
        f41595i = new BigDecimal(240);
        f41596j = new BigDecimal((int) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        p pVar = new p(0, 0);
        f41597k = pVar;
        concurrentHashMap.put(0, pVar);
    }

    private p(int i11, int i12) {
        if (i12 == 0) {
            if (i11 < -64800 || i11 > 64800) {
                throw new IllegalArgumentException("Total seconds out of range: " + i11);
            }
        } else if (Math.abs(i12) > 999999999) {
            throw new IllegalArgumentException("Fraction out of range: " + i12);
        } else if (i11 < -39600 || i11 > 39600) {
            throw new IllegalArgumentException("Total seconds out of range while fraction is non-zero: " + i11);
        } else if ((i11 < 0 && i12 > 0) || (i11 > 0 && i12 < 0)) {
            throw new IllegalArgumentException("Different signs: offset=" + i11 + ", fraction=" + i12);
        }
        boolean z11 = i11 < 0 || i12 < 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z11 ? CoreConstants.DASH_CHAR : '+');
        int abs = Math.abs(i11);
        int i13 = abs / 3600;
        int i14 = (abs / 60) % 60;
        int i15 = abs % 60;
        if (i13 < 10) {
            sb2.append('0');
        }
        sb2.append(i13);
        sb2.append(CoreConstants.COLON_CHAR);
        if (i14 < 10) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i15 != 0 || i12 != 0) {
            sb2.append(CoreConstants.COLON_CHAR);
            if (i15 < 10) {
                sb2.append('0');
            }
            sb2.append(i15);
            if (i12 != 0) {
                sb2.append(CoreConstants.DOT);
                String valueOf = String.valueOf(Math.abs(i12));
                int length = 9 - valueOf.length();
                for (int i16 = 0; i16 < length; i16++) {
                    sb2.append('0');
                }
                sb2.append(valueOf);
            }
        }
        this.f41600c = sb2.toString();
        this.f41598a = i11;
        this.f41599b = i12;
    }

    public static p b(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(f41594h) <= 0 && bigDecimal.compareTo(f41593g) >= 0) {
            BigDecimal multiply = bigDecimal.multiply(f41595i);
            BigDecimal scale = multiply.setScale(0, RoundingMode.DOWN);
            BigDecimal multiply2 = multiply.subtract(scale).setScale(9, RoundingMode.HALF_UP).multiply(f41596j);
            int intValueExact = scale.intValueExact();
            int intValueExact2 = multiply2.intValueExact();
            if (intValueExact2 == 0) {
                return s(intValueExact);
            }
            if (intValueExact2 == 1000000000) {
                return s(intValueExact + 1);
            }
            if (intValueExact2 == -1000000000) {
                return s(intValueExact - 1);
            }
            return new p(intValueExact, intValueExact2);
        }
        throw new IllegalArgumentException("Out of range: " + bigDecimal);
    }

    public static p c(f fVar, int i11, int i12, double d11) {
        Objects.requireNonNull(fVar, "Missing sign.");
        if (i11 < 0 || i11 > 180) {
            throw new IllegalArgumentException("Degrees of longitude out of range (0 <= degrees <= 180).");
        }
        if (i12 >= 0 && i12 <= 59) {
            if (Double.compare(d11, 0.0d) >= 0 && Double.compare(d11, 60.0d) < 0) {
                BigDecimal valueOf = BigDecimal.valueOf(i11);
                if (i12 != 0) {
                    valueOf = valueOf.add(BigDecimal.valueOf(i12).setScale(15, RoundingMode.UNNECESSARY).divide(f41591e, RoundingMode.HALF_UP));
                }
                if (d11 != 0.0d) {
                    valueOf = valueOf.add(BigDecimal.valueOf(d11).setScale(15, RoundingMode.FLOOR).divide(f41592f, RoundingMode.HALF_UP));
                }
                if (fVar == f.BEHIND_UTC) {
                    valueOf = valueOf.negate();
                }
                return b(valueOf);
            }
            throw new IllegalArgumentException("Arc second out of range (0.0 <= arcSeconds < 60.0).");
        }
        throw new IllegalArgumentException("Arc minute out of range (0 <= arcMinutes <= 59).");
    }

    private static String e(int i11, int i12) {
        return "[hours=" + i11 + ",minutes=" + i12 + ']';
    }

    public static p q(f fVar, int i11) {
        return r(fVar, i11, 0);
    }

    public static p r(f fVar, int i11, int i12) {
        Objects.requireNonNull(fVar, "Missing sign.");
        if (i11 < 0 || i11 > 18) {
            throw new IllegalArgumentException("Hour part out of range (0 <= hours <= 18) in: " + e(i11, i12));
        } else if (i12 < 0 || i12 > 59) {
            throw new IllegalArgumentException("Minute part out of range (0 <= minutes <= 59) in: " + e(i11, i12));
        } else if (i11 == 18 && i12 != 0) {
            throw new IllegalArgumentException("Time zone offset out of range (-18:00:00 <= offset <= 18:00:00) in: " + e(i11, i12));
        } else {
            int i13 = (i11 * 3600) + (i12 * 60);
            if (fVar == f.BEHIND_UTC) {
                i13 = -i13;
            }
            return s(i13);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    public static p s(int i11) {
        return t(i11, 0);
    }

    public static p t(int i11, int i12) {
        if (i12 != 0) {
            return new p(i11, i12);
        }
        if (i11 == 0) {
            return f41597k;
        }
        if (i11 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i11);
            ConcurrentMap<Integer, p> concurrentMap = f41590d;
            p pVar = concurrentMap.get(valueOf);
            if (pVar == null) {
                concurrentMap.putIfAbsent(valueOf, new p(i11, 0));
                return concurrentMap.get(valueOf);
            }
            return pVar;
        }
        return new p(i11, 0);
    }

    private static int u(String str, int i11, int i12) {
        int min = Math.min(str.length() - i11, i12);
        int i13 = -1;
        for (int i14 = 0; i14 < min; i14++) {
            char charAt = str.charAt(i11 + i14);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i13 = i13 == -1 ? charAt - '0' : (i13 * 10) + (charAt - '0');
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static net.time4j.tz.p v(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.tz.p.v(java.lang.String, boolean):net.time4j.tz.p");
    }

    private Object writeReplace() {
        return new SPX(this, 15);
    }

    @Override // net.time4j.tz.k
    public String a() {
        if (this.f41598a == 0 && this.f41599b == 0) {
            return "Z";
        }
        return "UTC" + this.f41600c;
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(p pVar) {
        int i11 = this.f41598a;
        int i12 = pVar.f41598a;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        int i13 = this.f41599b - pVar.f41599b;
        if (i13 < 0) {
            return -1;
        }
        return i13 == 0 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f41598a == pVar.f41598a && this.f41599b == pVar.f41599b;
        }
        return false;
    }

    public int f() {
        return Math.abs(this.f41598a) / 3600;
    }

    public int g() {
        return (Math.abs(this.f41598a) / 60) % 60;
    }

    public int h() {
        return Math.abs(this.f41598a) % 60;
    }

    public int hashCode() {
        return (~this.f41598a) + (this.f41599b % 64000);
    }

    public int i() {
        return this.f41599b;
    }

    public int k() {
        return this.f41598a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j l() {
        return j.R(this);
    }

    public f n() {
        return (this.f41598a < 0 || this.f41599b < 0) ? f.BEHIND_UTC : f.AHEAD_OF_UTC;
    }

    public String o(Locale locale) {
        boolean z11 = this.f41598a == 0 && this.f41599b == 0;
        try {
            return l.f41553w.d(z11, locale);
        } catch (Throwable unused) {
            return z11 ? "GMT" : "GMT±hh:mm";
        }
    }

    public String toString() {
        return this.f41600c;
    }
}