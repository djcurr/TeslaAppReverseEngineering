package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.w;
import java.util.Objects;

/* loaded from: classes7.dex */
public interface e extends k, Comparable {
    default f a() {
        Objects.requireNonNull((j$.time.f) ((ZonedDateTime) this).l());
        return g.f32874a;
    }

    @Override // j$.time.temporal.k
    default int b(l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            int i11 = d.f32873a[((j$.time.temporal.a) lVar).ordinal()];
            if (i11 != 1) {
                return i11 != 2 ? ((LocalDateTime) ((ZonedDateTime) this).m()).b(lVar) : ((ZonedDateTime) this).h().n();
            }
            throw new w("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return super.b(lVar);
    }

    @Override // java.lang.Comparable
    default int compareTo(Object obj) {
        e eVar = (e) obj;
        int compare = Long.compare(f(), eVar.f());
        if (compare == 0) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) this;
            ZonedDateTime zonedDateTime2 = (ZonedDateTime) eVar;
            int k11 = zonedDateTime.n().k() - zonedDateTime2.n().k();
            if (k11 == 0) {
                k11 = ((LocalDateTime) zonedDateTime.m()).compareTo(zonedDateTime2.m());
                if (k11 == 0) {
                    int compareTo = zonedDateTime.i().h().compareTo(zonedDateTime2.i().h());
                    if (compareTo == 0) {
                        a();
                        g gVar = g.f32874a;
                        eVar.a();
                        return 0;
                    }
                    return compareTo;
                }
            }
            return k11;
        }
        return compare;
    }

    default long f() {
        ZonedDateTime zonedDateTime = (ZonedDateTime) this;
        return ((((j$.time.f) zonedDateTime.l()).t() * 86400) + zonedDateTime.n().p()) - zonedDateTime.h().n();
    }
}