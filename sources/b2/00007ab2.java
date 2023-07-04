package j$.time;

import ch.qos.logback.core.CoreConstants;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import j$.time.temporal.x;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes7.dex */
public final class h implements j$.time.temporal.k, Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final h f32937e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f32938f;

    /* renamed from: g  reason: collision with root package name */
    private static final h[] f32939g = new h[24];

    /* renamed from: a  reason: collision with root package name */
    private final byte f32940a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f32941b;

    /* renamed from: c  reason: collision with root package name */
    private final byte f32942c;

    /* renamed from: d  reason: collision with root package name */
    private final int f32943d;

    static {
        int i11 = 0;
        while (true) {
            h[] hVarArr = f32939g;
            if (i11 >= hVarArr.length) {
                h hVar = hVarArr[0];
                h hVar2 = hVarArr[12];
                f32937e = hVarArr[0];
                f32938f = new h(23, 59, 59, 999999999);
                return;
            }
            hVarArr[i11] = new h(i11, 0, 0, 0);
            i11++;
        }
    }

    private h(int i11, int i12, int i13, int i14) {
        this.f32940a = (byte) i11;
        this.f32941b = (byte) i12;
        this.f32942c = (byte) i13;
        this.f32943d = i14;
    }

    private int i(j$.time.temporal.l lVar) {
        switch (g.f32935a[((j$.time.temporal.a) lVar).ordinal()]) {
            case 1:
                return this.f32943d;
            case 2:
                throw new w("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f32943d / 1000;
            case 4:
                throw new w("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f32943d / 1000000;
            case 6:
                return (int) (o() / 1000000);
            case 7:
                return this.f32942c;
            case 8:
                return p();
            case 9:
                return this.f32941b;
            case 10:
                return (this.f32940a * 60) + this.f32941b;
            case 11:
                return this.f32940a % 12;
            case 12:
                int i11 = this.f32940a % 12;
                if (i11 % 12 == 0) {
                    return 12;
                }
                return i11;
            case 13:
                return this.f32940a;
            case 14:
                byte b11 = this.f32940a;
                if (b11 == 0) {
                    return 24;
                }
                return b11;
            case 15:
                return this.f32940a / 12;
            default:
                throw new w("Unsupported field: " + lVar);
        }
    }

    public static h m(int i11, int i12) {
        j$.time.temporal.a.HOUR_OF_DAY.l(i11);
        if (i12 == 0) {
            return f32939g[i11];
        }
        j$.time.temporal.a.MINUTE_OF_HOUR.l(i12);
        return new h(i11, i12, 0, 0);
    }

    public static h n(long j11) {
        j$.time.temporal.a.NANO_OF_DAY.l(j11);
        int i11 = (int) (j11 / 3600000000000L);
        long j12 = j11 - (i11 * 3600000000000L);
        int i12 = (int) (j12 / 60000000000L);
        long j13 = j12 - (i12 * 60000000000L);
        int i13 = (int) (j13 / 1000000000);
        int i14 = (int) (j13 - (i13 * 1000000000));
        return ((i12 | i13) | i14) == 0 ? f32939g[i11] : new h(i11, i12, i13, i14);
    }

    @Override // j$.time.temporal.k
    public int b(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? i(lVar) : super.b(lVar);
    }

    @Override // j$.time.temporal.k
    public boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar.i() : lVar != null && lVar.h(this);
    }

    @Override // j$.time.temporal.k
    public Object d(u uVar) {
        int i11 = t.f32969a;
        if (uVar == n.f32963a || uVar == m.f32962a || uVar == q.f32966a || uVar == p.f32965a) {
            return null;
        }
        if (uVar == s.f32968a) {
            return this;
        }
        if (uVar == r.f32967a) {
            return null;
        }
        return uVar == o.f32964a ? j$.time.temporal.b.NANOS : uVar.a(this);
    }

    @Override // j$.time.temporal.k
    public long e(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.NANO_OF_DAY ? o() : lVar == j$.time.temporal.a.MICRO_OF_DAY ? o() / 1000 : i(lVar) : lVar.d(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f32940a == hVar.f32940a && this.f32941b == hVar.f32941b && this.f32942c == hVar.f32942c && this.f32943d == hVar.f32943d;
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public x g(j$.time.temporal.l lVar) {
        return super.g(lVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(h hVar) {
        int compare = Integer.compare(this.f32940a, hVar.f32940a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.f32941b, hVar.f32941b);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.f32942c, hVar.f32942c);
                return compare3 == 0 ? Integer.compare(this.f32943d, hVar.f32943d) : compare3;
            }
            return compare2;
        }
        return compare;
    }

    public int hashCode() {
        long o11 = o();
        return (int) (o11 ^ (o11 >>> 32));
    }

    public int k() {
        return this.f32943d;
    }

    public int l() {
        return this.f32942c;
    }

    public long o() {
        return (this.f32942c * 1000000000) + (this.f32941b * 60000000000L) + (this.f32940a * 3600000000000L) + this.f32943d;
    }

    public int p() {
        return (this.f32941b * 60) + (this.f32940a * Tnaf.POW_2_WIDTH) + this.f32942c;
    }

    public String toString() {
        int i11;
        StringBuilder sb2 = new StringBuilder(18);
        byte b11 = this.f32940a;
        byte b12 = this.f32941b;
        byte b13 = this.f32942c;
        int i12 = this.f32943d;
        sb2.append(b11 < 10 ? "0" : "");
        sb2.append((int) b11);
        sb2.append(b12 < 10 ? ":0" : ":");
        sb2.append((int) b12);
        if (b13 > 0 || i12 > 0) {
            sb2.append(b13 >= 10 ? ":" : ":0");
            sb2.append((int) b13);
            if (i12 > 0) {
                sb2.append(CoreConstants.DOT);
                int i13 = 1000000;
                if (i12 % 1000000 == 0) {
                    i11 = (i12 / 1000000) + 1000;
                } else {
                    if (i12 % 1000 == 0) {
                        i12 /= 1000;
                    } else {
                        i13 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
                    i11 = i12 + i13;
                }
                sb2.append(Integer.toString(i11).substring(1));
            }
        }
        return sb2.toString();
    }
}