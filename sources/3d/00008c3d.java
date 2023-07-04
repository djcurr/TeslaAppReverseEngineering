package net.time4j.tz;

import j$.util.DesugarTimeZone;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class n implements o, Serializable {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Integer, n> f41586c = new HashMap();
    private static final long serialVersionUID = 1790434289322009750L;

    /* renamed from: a  reason: collision with root package name */
    private final transient b f41587a;

    /* renamed from: b  reason: collision with root package name */
    private final transient g f41588b;

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41589a;

        static {
            int[] iArr = new int[b.values().length];
            f41589a = iArr;
            try {
                iArr[b.PUSH_FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41589a[b.NEXT_VALID_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41589a[b.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        b[] values;
        g[] values2;
        for (b bVar : b.values()) {
            for (g gVar : g.values()) {
                f41586c.put(Integer.valueOf((bVar.ordinal() * 2) + gVar.ordinal()), new n(bVar, gVar));
            }
        }
    }

    private n(b bVar, g gVar) {
        this.f41587a = bVar;
        this.f41588b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n d(b bVar, g gVar) {
        return f41586c.get(Integer.valueOf((bVar.ordinal() * 2) + gVar.ordinal()));
    }

    private static void e(net.time4j.base.a aVar, net.time4j.base.g gVar, l lVar) {
        throw new IllegalArgumentException("Invalid local timestamp due to timezone transition: local-date=" + aVar + ", local-time=" + gVar + " [" + lVar.z().a() + "]");
    }

    private static long f(int i11, int i12, int i13, int i14, int i15, int i16) {
        return net.time4j.base.c.i(net.time4j.base.c.m(net.time4j.base.b.j(i11, i12, i13), 40587L), 86400L) + (i14 * 3600) + (i15 * 60) + i16;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 13);
    }

    @Override // net.time4j.tz.o
    public o a(g gVar) {
        return gVar == this.f41588b ? this : this.f41587a.and(gVar);
    }

    @Override // net.time4j.tz.o
    public long b(net.time4j.base.a aVar, net.time4j.base.g gVar, l lVar) {
        long f11;
        int k11;
        long f12;
        int i11;
        b bVar;
        int year = aVar.getYear();
        int month = aVar.getMonth();
        int n11 = aVar.n();
        int p11 = gVar.p();
        int m11 = gVar.m();
        int j11 = gVar.j();
        m y11 = lVar.y();
        if (y11 == null && this.f41588b == g.LATER_OFFSET && ((bVar = this.f41587a) == b.PUSH_FORWARD || bVar == b.ABORT)) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone(lVar.z().a()));
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(year, month - 1, n11, p11, m11, j11);
            int i12 = gregorianCalendar.get(1);
            int i13 = gregorianCalendar.get(2) + 1;
            int i14 = gregorianCalendar.get(5);
            int i15 = gregorianCalendar.get(11);
            int i16 = gregorianCalendar.get(12);
            int i17 = gregorianCalendar.get(13);
            if (this.f41587a == b.ABORT && (year != i12 || month != i13 || n11 != i14 || p11 != i15 || m11 != i16 || j11 != i17)) {
                e(aVar, gVar, lVar);
            }
            f11 = f(i12, i13, i14, i15, i16, i17);
            k11 = lVar.A(aVar, gVar).k();
        } else if (y11 != null) {
            q a11 = y11.a(aVar, gVar);
            if (a11 != null) {
                if (a11.k()) {
                    int i18 = a.f41589a[this.f41587a.ordinal()];
                    if (i18 == 1) {
                        f12 = f(year, month, n11, p11, m11, j11) + a11.g();
                        i11 = a11.i();
                        return f12 - i11;
                    } else if (i18 == 2) {
                        return a11.e();
                    } else {
                        if (i18 == 3) {
                            e(aVar, gVar, lVar);
                        } else {
                            throw new UnsupportedOperationException(this.f41587a.name());
                        }
                    }
                } else if (a11.l()) {
                    f12 = f(year, month, n11, p11, m11, j11);
                    i11 = a11.i();
                    if (this.f41588b == g.EARLIER_OFFSET) {
                        i11 = a11.f();
                    }
                    return f12 - i11;
                }
            }
            f11 = f(year, month, n11, p11, m11, j11);
            k11 = y11.e(aVar, gVar).get(0).k();
        } else {
            throw new UnsupportedOperationException("Timezone provider does not expose its transition history.");
        }
        return f11 - k11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return (this.f41587a.ordinal() * 2) + this.f41588b.ordinal();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(n.class.getName());
        sb2.append(":[gap=");
        sb2.append(this.f41587a);
        sb2.append(",overlap=");
        sb2.append(this.f41588b);
        sb2.append(']');
        return sb2.toString();
    }
}