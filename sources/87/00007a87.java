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
public final class OffsetDateTime implements Comparable<OffsetDateTime>, Serializable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f32859a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f32860b;

    /* loaded from: classes7.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f32861a;

        static {
            int[] iArr = new int[j$.time.temporal.a.values().length];
            f32861a = iArr;
            try {
                iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32861a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new OffsetDateTime(LocalDateTime.f32855c, ZoneOffset.f32865g);
        new OffsetDateTime(LocalDateTime.f32856d, ZoneOffset.f32864f);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f32859a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f32860b = zoneOffset;
    }

    public static OffsetDateTime h(Instant instant, k kVar) {
        Objects.requireNonNull(kVar, "zone");
        ZoneOffset c11 = j$.time.zone.c.e((ZoneOffset) kVar).c(instant);
        return new OffsetDateTime(LocalDateTime.m(instant.getEpochSecond(), instant.getNano(), c11), c11);
    }

    public int b(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            int i11 = a.f32861a[((j$.time.temporal.a) lVar).ordinal()];
            if (i11 != 1) {
                return i11 != 2 ? this.f32859a.b(lVar) : this.f32860b.n();
            }
            throw new w("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return super.b(lVar);
    }

    public boolean c(j$.time.temporal.l lVar) {
        return (lVar instanceof j$.time.temporal.a) || (lVar != null && lVar.h(this));
    }

    @Override // java.lang.Comparable
    public int compareTo(OffsetDateTime offsetDateTime) {
        int compare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f32860b.equals(offsetDateTime2.f32860b)) {
            compare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            compare = Long.compare(f(), offsetDateTime2.f());
            if (compare == 0) {
                compare = i().k() - offsetDateTime2.i().k();
            }
        }
        return compare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : compare;
    }

    public Object d(u uVar) {
        int i11 = t.f32969a;
        if (uVar == p.f32965a || uVar == q.f32966a) {
            return this.f32860b;
        }
        if (uVar == m.f32962a) {
            return null;
        }
        if (uVar == r.f32967a) {
            return this.f32859a.n();
        }
        return uVar == s.f32968a ? i() : uVar == n.f32963a ? j$.time.chrono.g.f32874a : uVar == o.f32964a ? j$.time.temporal.b.NANOS : uVar.a(this);
    }

    public long e(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            int i11 = a.f32861a[((j$.time.temporal.a) lVar).ordinal()];
            return i11 != 1 ? i11 != 2 ? this.f32859a.e(lVar) : this.f32860b.n() : f();
        }
        return lVar.d(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            return this.f32859a.equals(offsetDateTime.f32859a) && this.f32860b.equals(offsetDateTime.f32860b);
        }
        return false;
    }

    public long f() {
        return this.f32859a.j(this.f32860b);
    }

    public x g(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? lVar.g() : this.f32859a.g(lVar) : lVar.c(this);
    }

    public int hashCode() {
        return this.f32859a.hashCode() ^ this.f32860b.hashCode();
    }

    public h i() {
        return this.f32859a.p();
    }

    public LocalDateTime toLocalDateTime() {
        return this.f32859a;
    }

    public String toString() {
        return this.f32859a.toString() + this.f32860b.toString();
    }
}