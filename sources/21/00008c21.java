package net.time4j.tz;

import ch.qos.logback.core.CoreConstants;
import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h extends l {
    private static final long serialVersionUID = -8432968264242113551L;

    /* renamed from: id  reason: collision with root package name */
    private final k f41529id;
    private final boolean strict;

    /* renamed from: tz  reason: collision with root package name */
    private final TimeZone f41530tz;

    /* renamed from: y  reason: collision with root package name */
    private final transient p f41531y;

    h() {
        this.f41529id = null;
        this.f41530tz = null;
        this.strict = false;
        this.f41531y = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TimeZone R(String str) {
        if (str.equals("Z")) {
            return DesugarTimeZone.getTimeZone("GMT+00:00");
        }
        if (str.startsWith("UTC")) {
            return DesugarTimeZone.getTimeZone("GMT" + str.substring(3));
        } else if (str.startsWith("UT")) {
            return DesugarTimeZone.getTimeZone("GMT" + str.substring(2));
        } else {
            return DesugarTimeZone.getTimeZone(str);
        }
    }

    private static p S(int i11) {
        return p.s(net.time4j.base.c.a(i11, 1000));
    }

    private Object readResolve() {
        k kVar = this.f41529id;
        if (kVar == null) {
            return new h();
        }
        return new h(kVar, this.f41530tz, this.strict);
    }

    @Override // net.time4j.tz.l
    public p A(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        int i11;
        int i12;
        int i13;
        TimeZone timeZone;
        p pVar = this.f41531y;
        if (pVar != null) {
            return pVar;
        }
        int year = aVar.getYear();
        int month = aVar.getMonth();
        int n11 = aVar.n();
        if (gVar.p() == 24) {
            long l11 = net.time4j.base.b.l(net.time4j.base.c.f(net.time4j.base.b.k(aVar), 1L));
            int i14 = net.time4j.base.b.i(l11);
            int h11 = net.time4j.base.b.h(l11);
            i11 = net.time4j.base.b.g(l11);
            month = h11;
            year = i14;
        } else {
            i11 = n11;
        }
        if (year > 0) {
            i13 = year;
            i12 = 1;
        } else {
            i12 = 0;
            i13 = 1 - year;
        }
        int c11 = net.time4j.base.b.c(year, month, i11) + 1;
        int i15 = c11 == 8 ? 1 : c11;
        int p11 = gVar.p() != 24 ? (((gVar.p() * 3600) + (gVar.m() * 60) + gVar.j()) * 1000) + (gVar.a() / 1000000) : 0;
        if (this.f41529id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f41530tz;
        }
        return S(timeZone.getOffset(i12, i13, month - 1, i11, i15, p11));
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        TimeZone timeZone;
        if (this.f41529id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            p pVar = this.f41531y;
            if (pVar != null) {
                return pVar;
            }
            timeZone = this.f41530tz;
        }
        return S(timeZone.getOffset(fVar.g() * 1000));
    }

    @Override // net.time4j.tz.l
    public o E() {
        return this.strict ? l.f41538d : l.f41537c;
    }

    @Override // net.time4j.tz.l
    public boolean I(net.time4j.base.f fVar) {
        TimeZone timeZone;
        if (this.f41531y != null) {
            return false;
        }
        if (this.f41529id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f41530tz;
        }
        return timeZone.inDaylightTime(new Date(fVar.g() * 1000));
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return this.f41531y != null;
    }

    @Override // net.time4j.tz.l
    public boolean K(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        TimeZone timeZone;
        if (this.f41531y != null) {
            return false;
        }
        int year = aVar.getYear();
        int month = aVar.getMonth();
        int n11 = aVar.n();
        int p11 = gVar.p();
        int m11 = gVar.m();
        int j11 = gVar.j();
        int a11 = gVar.a() / 1000000;
        if (this.f41529id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f41530tz;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.set(14, a11);
        gregorianCalendar.set(year, month - 1, n11, p11, m11, j11);
        return (gregorianCalendar.get(1) == year && gregorianCalendar.get(2) + 1 == month && gregorianCalendar.get(5) == n11 && gregorianCalendar.get(11) == p11 && gregorianCalendar.get(12) == m11 && gregorianCalendar.get(13) == j11 && gregorianCalendar.get(14) == a11) ? false : true;
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        if (this.f41529id == null || E() == oVar) {
            return this;
        }
        if (oVar == l.f41537c) {
            return new h(this.f41529id, this.f41530tz, false);
        }
        if (oVar == l.f41538d) {
            return new h(this.f41529id, this.f41530tz, true);
        }
        throw new UnsupportedOperationException(oVar.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean T() {
        TimeZone timeZone;
        if (this.f41529id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f41530tz;
        }
        return timeZone.getID().equals("GMT");
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f41529id == null) {
                return hVar.f41529id == null;
            } else if (this.f41530tz.equals(hVar.f41530tz) && this.strict == hVar.strict) {
                p pVar = this.f41531y;
                if (pVar == null) {
                    return hVar.f41531y == null;
                }
                return pVar.equals(hVar.f41531y);
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f41529id == null) {
            return 0;
        }
        return this.f41530tz.hashCode();
    }

    public String toString() {
        TimeZone timeZone;
        if (this.f41529id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f41530tz;
        }
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append('[');
        sb2.append(h.class.getName());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(timeZone);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public String w(d dVar, Locale locale) {
        TimeZone timeZone;
        if (this.f41529id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f41530tz;
        }
        return timeZone.getDisplayName(dVar.isDaylightSaving(), !dVar.isAbbreviation(), locale);
    }

    @Override // net.time4j.tz.l
    public m y() {
        p pVar = this.f41531y;
        if (pVar == null) {
            return null;
        }
        return pVar.l();
    }

    @Override // net.time4j.tz.l
    public k z() {
        k kVar = this.f41529id;
        return kVar == null ? new e(TimeZone.getDefault().getID()) : kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(k kVar) {
        this(kVar, TimeZone.getDefault(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(k kVar, String str) {
        this(kVar, R(str), false);
    }

    private h(k kVar, TimeZone timeZone, boolean z11) {
        this.f41529id = kVar;
        TimeZone timeZone2 = (TimeZone) timeZone.clone();
        this.f41530tz = timeZone2;
        this.strict = z11;
        if (timeZone2.useDaylightTime()) {
            this.f41531y = null;
            return;
        }
        String id2 = timeZone2.getID();
        if (id2.startsWith("GMT") || id2.startsWith("Etc/") || id2.equals("Greenwich") || id2.equals("UCT") || id2.equals("UTC") || id2.equals("Universal") || id2.equals("Zulu")) {
            this.f41531y = S(timeZone2.getOffset(System.currentTimeMillis()));
        } else {
            this.f41531y = null;
        }
    }
}