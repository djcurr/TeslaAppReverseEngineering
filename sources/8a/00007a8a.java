package j$.time;

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
import java.util.Objects;

/* loaded from: classes7.dex */
public final class ZonedDateTime implements j$.time.chrono.e, Serializable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f32868a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f32869b;

    /* renamed from: c  reason: collision with root package name */
    private final k f32870c;

    /* loaded from: classes7.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f32871a;

        static {
            int[] iArr = new int[j$.time.temporal.a.values().length];
            f32871a = iArr;
            try {
                iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32871a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, k kVar) {
        this.f32868a = localDateTime;
        this.f32869b = zoneOffset;
        this.f32870c = kVar;
    }

    public static ZonedDateTime k(Instant instant, k kVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(kVar, "zone");
        long epochSecond = instant.getEpochSecond();
        int nano = instant.getNano();
        ZoneOffset c11 = kVar.i().c(Instant.ofEpochSecond(epochSecond, nano));
        return new ZonedDateTime(LocalDateTime.m(epochSecond, nano, c11), c11, kVar);
    }

    @Override // j$.time.chrono.e, j$.time.temporal.k
    public int b(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            int i11 = a.f32871a[((j$.time.temporal.a) lVar).ordinal()];
            if (i11 != 1) {
                return i11 != 2 ? this.f32868a.b(lVar) : this.f32869b.n();
            }
            throw new w("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return super.b(lVar);
    }

    @Override // j$.time.temporal.k
    public boolean c(j$.time.temporal.l lVar) {
        return (lVar instanceof j$.time.temporal.a) || (lVar != null && lVar.h(this));
    }

    @Override // j$.time.temporal.k
    public Object d(u uVar) {
        int i11 = t.f32969a;
        if (uVar == r.f32967a) {
            return this.f32868a.n();
        }
        if (uVar == q.f32966a || uVar == m.f32962a) {
            return this.f32870c;
        }
        if (uVar == p.f32965a) {
            return this.f32869b;
        }
        if (uVar == s.f32968a) {
            return n();
        }
        if (uVar != n.f32963a) {
            return uVar == o.f32964a ? j$.time.temporal.b.NANOS : uVar.a(this);
        }
        a();
        return j$.time.chrono.g.f32874a;
    }

    @Override // j$.time.temporal.k
    public long e(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            int i11 = a.f32871a[((j$.time.temporal.a) lVar).ordinal()];
            return i11 != 1 ? i11 != 2 ? this.f32868a.e(lVar) : this.f32869b.n() : f();
        }
        return lVar.d(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            return this.f32868a.equals(zonedDateTime.f32868a) && this.f32869b.equals(zonedDateTime.f32869b) && this.f32870c.equals(zonedDateTime.f32870c);
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public x g(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? lVar.g() : this.f32868a.g(lVar) : lVar.c(this);
    }

    public ZoneOffset h() {
        return this.f32869b;
    }

    public int hashCode() {
        return (this.f32868a.hashCode() ^ this.f32869b.hashCode()) ^ Integer.rotateLeft(this.f32870c.hashCode(), 3);
    }

    public k i() {
        return this.f32870c;
    }

    public j$.time.chrono.b l() {
        return this.f32868a.n();
    }

    public j$.time.chrono.c m() {
        return this.f32868a;
    }

    public h n() {
        return this.f32868a.p();
    }

    public String toString() {
        String str = this.f32868a.toString() + this.f32869b.toString();
        if (this.f32869b != this.f32870c) {
            return str + '[' + this.f32870c.toString() + ']';
        }
        return str;
    }
}