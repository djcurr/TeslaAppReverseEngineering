package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes7.dex */
public final class c implements Serializable {

    /* renamed from: h */
    private static final long[] f32977h = new long[0];

    /* renamed from: i */
    private static final b[] f32978i = new b[0];

    /* renamed from: j */
    private static final a[] f32979j = new a[0];

    /* renamed from: a */
    private final long[] f32980a;

    /* renamed from: b */
    private final ZoneOffset[] f32981b;

    /* renamed from: c */
    private final long[] f32982c;

    /* renamed from: d */
    private final ZoneOffset[] f32983d;

    /* renamed from: e */
    private final b[] f32984e;

    /* renamed from: f */
    private final TimeZone f32985f;

    /* renamed from: g */
    private final transient ConcurrentMap f32986g = new ConcurrentHashMap();

    private c(ZoneOffset zoneOffset) {
        this.f32981b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f32977h;
        this.f32980a = jArr;
        this.f32982c = jArr;
        this.f32983d = zoneOffsetArr;
        this.f32984e = f32978i;
        this.f32985f = null;
    }

    public c(TimeZone timeZone) {
        this.f32981b = r0;
        ZoneOffset[] zoneOffsetArr = {f(timeZone.getRawOffset())};
        long[] jArr = f32977h;
        this.f32980a = jArr;
        this.f32982c = jArr;
        this.f32983d = zoneOffsetArr;
        this.f32984e = f32978i;
        this.f32985f = timeZone;
    }

    private a[] a(int i11) {
        Integer valueOf = Integer.valueOf(i11);
        a[] aVarArr = (a[]) this.f32986g.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        if (this.f32985f == null) {
            b[] bVarArr = this.f32984e;
            a[] aVarArr2 = new a[bVarArr.length];
            if (bVarArr.length > 0) {
                b bVar = bVarArr[0];
                throw null;
            }
            if (i11 < 2100) {
                this.f32986g.putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        } else if (i11 < 1800) {
            return f32979j;
        } else {
            long j11 = LocalDateTime.l(i11 - 1, 12, 31, 0, 0).j(this.f32981b[0]);
            long j12 = 1000;
            int offset = this.f32985f.getOffset(j11 * 1000);
            long j13 = 31968000 + j11;
            a[] aVarArr3 = f32979j;
            while (j11 < j13) {
                long j14 = 7776000 + j11;
                long j15 = j11;
                if (offset != this.f32985f.getOffset(j14 * j12)) {
                    j11 = j15;
                    while (j14 - j11 > 1) {
                        long j16 = j13;
                        long floorDiv = Math.floorDiv(j14 + j11, 2L);
                        long j17 = j14;
                        if (this.f32985f.getOffset(floorDiv * 1000) == offset) {
                            j11 = floorDiv;
                            j12 = 1000;
                            j14 = j17;
                        } else {
                            j14 = floorDiv;
                            j12 = 1000;
                        }
                        j13 = j16;
                    }
                    long j18 = j13;
                    long j19 = j14;
                    long j21 = j12;
                    if (this.f32985f.getOffset(j11 * j21) == offset) {
                        j11 = j19;
                    }
                    ZoneOffset f11 = f(offset);
                    int offset2 = this.f32985f.getOffset(j11 * j21);
                    ZoneOffset f12 = f(offset2);
                    if (b(j11, f12) == i11) {
                        aVarArr3 = (a[]) Arrays.copyOf(aVarArr3, aVarArr3.length + 1);
                        aVarArr3[aVarArr3.length - 1] = new a(j11, f11, f12);
                    }
                    offset = offset2;
                    j12 = j21;
                    j13 = j18;
                } else {
                    j11 = j14;
                }
            }
            if (1916 <= i11 && i11 < 2100) {
                this.f32986g.putIfAbsent(valueOf, aVarArr3);
            }
            return aVarArr3;
        }
    }

    private int b(long j11, ZoneOffset zoneOffset) {
        return j$.time.f.r(Math.floorDiv(j11 + zoneOffset.n(), 86400L)).o();
    }

    public static c e(ZoneOffset zoneOffset) {
        return new c(zoneOffset);
    }

    private static ZoneOffset f(int i11) {
        return ZoneOffset.q(i11 / 1000);
    }

    public ZoneOffset c(Instant instant) {
        long[] jArr;
        ZoneOffset[] zoneOffsetArr;
        TimeZone timeZone = this.f32985f;
        if (timeZone != null) {
            return f(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f32982c.length == 0) {
            return this.f32981b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f32984e.length > 0) {
            if (epochSecond > this.f32982c[jArr.length - 1]) {
                a[] a11 = a(b(epochSecond, this.f32983d[zoneOffsetArr.length - 1]));
                a aVar = null;
                for (int i11 = 0; i11 < a11.length; i11++) {
                    aVar = a11[i11];
                    if (epochSecond < aVar.f()) {
                        return aVar.e();
                    }
                }
                return aVar.d();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f32982c, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f32983d[binarySearch + 1];
    }

    public boolean d() {
        TimeZone timeZone = this.f32985f;
        if (timeZone == null) {
            return this.f32982c.length == 0;
        } else if (timeZone.useDaylightTime() || this.f32985f.getDSTSavings() != 0) {
            return false;
        } else {
            Instant now = Instant.now();
            a aVar = null;
            if (this.f32985f != null) {
                long epochSecond = now.getEpochSecond();
                if (now.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int b11 = b(epochSecond, c(now));
                a[] a11 = a(b11);
                int length = a11.length - 1;
                while (true) {
                    if (length >= 0) {
                        if (epochSecond > a11[length].f()) {
                            aVar = a11[length];
                            break;
                        }
                        length--;
                    } else if (b11 > 1800) {
                        a[] a12 = a(b11 - 1);
                        int length2 = a12.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                long min = Math.min(epochSecond - 31104000, (j$.time.b.b().a() / 1000) + 31968000);
                                int offset = this.f32985f.getOffset((epochSecond - 1) * 1000);
                                long t11 = j$.time.f.q(1800, 1, 1).t() * 86400;
                                while (true) {
                                    if (t11 > min) {
                                        break;
                                    }
                                    int offset2 = this.f32985f.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int b12 = b(min, f(offset2));
                                        a[] a13 = a(b12 + 1);
                                        int length3 = a13.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                a[] a14 = a(b12);
                                                aVar = a14[a14.length - 1];
                                                break;
                                            } else if (epochSecond > a13[length3].f()) {
                                                aVar = a13[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    } else {
                                        min -= 7776000;
                                    }
                                }
                            } else if (epochSecond > a12[length2].f()) {
                                aVar = a12[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                }
            } else if (this.f32982c.length != 0) {
                long epochSecond2 = now.getEpochSecond();
                if (now.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.f32982c;
                long j11 = jArr[jArr.length - 1];
                if (this.f32984e.length > 0 && epochSecond2 > j11) {
                    ZoneOffset[] zoneOffsetArr = this.f32983d;
                    ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
                    int b13 = b(epochSecond2, zoneOffset);
                    a[] a15 = a(b13);
                    int length4 = a15.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i11 = b13 - 1;
                            if (i11 > b(j11, zoneOffset)) {
                                a[] a16 = a(i11);
                                aVar = a16[a16.length - 1];
                            }
                        } else if (epochSecond2 > a15[length4].f()) {
                            aVar = a15[length4];
                            break;
                        } else {
                            length4--;
                        }
                    }
                }
                int binarySearch = Arrays.binarySearch(this.f32982c, epochSecond2);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                if (binarySearch > 0) {
                    int i12 = binarySearch - 1;
                    long j12 = this.f32982c[i12];
                    ZoneOffset[] zoneOffsetArr2 = this.f32983d;
                    aVar = new a(j12, zoneOffsetArr2[i12], zoneOffsetArr2[binarySearch]);
                }
            }
            return aVar == null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return Objects.equals(this.f32985f, cVar.f32985f) && Arrays.equals(this.f32980a, cVar.f32980a) && Arrays.equals(this.f32981b, cVar.f32981b) && Arrays.equals(this.f32982c, cVar.f32982c) && Arrays.equals(this.f32983d, cVar.f32983d) && Arrays.equals(this.f32984e, cVar.f32984e);
        }
        return false;
    }

    public int hashCode() {
        return ((((Objects.hashCode(this.f32985f) ^ Arrays.hashCode(this.f32980a)) ^ Arrays.hashCode(this.f32981b)) ^ Arrays.hashCode(this.f32982c)) ^ Arrays.hashCode(this.f32983d)) ^ Arrays.hashCode(this.f32984e);
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f32985f != null) {
            sb2 = new StringBuilder();
            sb2.append("ZoneRules[timeZone=");
            sb2.append(this.f32985f.getID());
        } else {
            sb2 = new StringBuilder();
            sb2.append("ZoneRules[currentStandardOffset=");
            ZoneOffset[] zoneOffsetArr = this.f32981b;
            sb2.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        }
        sb2.append("]");
        return sb2.toString();
    }
}