package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.x;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class LocalDateTime implements j$.time.chrono.c, Serializable, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final LocalDateTime f32855c;

    /* renamed from: d  reason: collision with root package name */
    public static final LocalDateTime f32856d;

    /* renamed from: a  reason: collision with root package name */
    private final f f32857a;

    /* renamed from: b  reason: collision with root package name */
    private final h f32858b;

    static {
        f fVar = f.f32879d;
        h hVar = h.f32937e;
        Objects.requireNonNull(fVar, "date");
        Objects.requireNonNull(hVar, "time");
        f32855c = new LocalDateTime(fVar, hVar);
        f fVar2 = f.f32880e;
        h hVar2 = h.f32938f;
        Objects.requireNonNull(fVar2, "date");
        Objects.requireNonNull(hVar2, "time");
        f32856d = new LocalDateTime(fVar2, hVar2);
    }

    private LocalDateTime(f fVar, h hVar) {
        this.f32857a = fVar;
        this.f32858b = hVar;
    }

    public static LocalDateTime l(int i11, int i12, int i13, int i14, int i15) {
        return new LocalDateTime(f.q(i11, i12, i13), h.m(i14, i15));
    }

    public static LocalDateTime m(long j11, int i11, ZoneOffset zoneOffset) {
        long n11;
        Objects.requireNonNull(zoneOffset, "offset");
        long j12 = i11;
        j$.time.temporal.a.NANO_OF_SECOND.l(j12);
        return new LocalDateTime(f.r(Math.floorDiv(j11 + zoneOffset.n(), 86400L)), h.n((((int) Math.floorMod(n11, 86400L)) * 1000000000) + j12));
    }

    @Override // j$.time.temporal.k
    public int b(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).i() ? this.f32858b.b(lVar) : this.f32857a.b(lVar) : super.b(lVar);
    }

    @Override // j$.time.temporal.k
    public boolean c(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar != null && lVar.h(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        return aVar.e() || aVar.i();
    }

    @Override // j$.time.temporal.k
    public Object d(u uVar) {
        int i11 = t.f32969a;
        if (uVar == r.f32967a) {
            return this.f32857a;
        }
        if (uVar == m.f32962a || uVar == q.f32966a || uVar == p.f32965a) {
            return null;
        }
        if (uVar == s.f32968a) {
            return p();
        }
        if (uVar != n.f32963a) {
            return uVar == o.f32964a ? j$.time.temporal.b.NANOS : uVar.a(this);
        }
        a();
        return j$.time.chrono.g.f32874a;
    }

    @Override // j$.time.temporal.k
    public long e(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).i() ? this.f32858b.e(lVar) : this.f32857a.e(lVar) : lVar.d(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.f32857a.equals(localDateTime.f32857a) && this.f32858b.equals(localDateTime.f32858b);
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.temporal.k
    public x g(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).i() ? this.f32858b.g(lVar) : this.f32857a.g(lVar) : lVar.c(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(j$.time.chrono.c cVar) {
        if (cVar instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) cVar;
            int i11 = this.f32857a.i(localDateTime.f32857a);
            return i11 == 0 ? this.f32858b.compareTo(localDateTime.f32858b) : i11;
        }
        LocalDateTime localDateTime2 = (LocalDateTime) cVar;
        int compareTo = ((f) o()).compareTo(localDateTime2.o());
        if (compareTo == 0) {
            int compareTo2 = p().compareTo(localDateTime2.p());
            if (compareTo2 == 0) {
                a();
                j$.time.chrono.g gVar = j$.time.chrono.g.f32874a;
                localDateTime2.a();
                return 0;
            }
            return compareTo2;
        }
        return compareTo;
    }

    public int hashCode() {
        return this.f32857a.hashCode() ^ this.f32858b.hashCode();
    }

    public int i() {
        return this.f32858b.l();
    }

    public int k() {
        return this.f32857a.o();
    }

    public f n() {
        return this.f32857a;
    }

    public j$.time.chrono.b o() {
        return this.f32857a;
    }

    public h p() {
        return this.f32858b;
    }

    public String toString() {
        return this.f32857a.toString() + 'T' + this.f32858b.toString();
    }
}