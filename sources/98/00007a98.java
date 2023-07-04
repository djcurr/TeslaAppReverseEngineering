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
public final class f implements j$.time.temporal.k, j$.time.chrono.b, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final f f32879d = q(-999999999, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    public static final f f32880e = q(999999999, 12, 31);

    /* renamed from: a  reason: collision with root package name */
    private final int f32881a;

    /* renamed from: b  reason: collision with root package name */
    private final short f32882b;

    /* renamed from: c  reason: collision with root package name */
    private final short f32883c;

    private f(int i11, int i12, int i13) {
        this.f32881a = i11;
        this.f32882b = (short) i12;
        this.f32883c = (short) i13;
    }

    public static f k(j$.time.temporal.k kVar) {
        Objects.requireNonNull(kVar, "temporal");
        int i11 = t.f32969a;
        f fVar = (f) kVar.d(r.f32967a);
        if (fVar != null) {
            return fVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + kVar + " of type " + kVar.getClass().getName());
    }

    private int l(j$.time.temporal.l lVar) {
        switch (e.f32877a[((j$.time.temporal.a) lVar).ordinal()]) {
            case 1:
                return this.f32883c;
            case 2:
                return n();
            case 3:
                return ((this.f32883c - 1) / 7) + 1;
            case 4:
                int i11 = this.f32881a;
                return i11 >= 1 ? i11 : 1 - i11;
            case 5:
                return m().h();
            case 6:
                return ((this.f32883c - 1) % 7) + 1;
            case 7:
                return ((n() - 1) % 7) + 1;
            case 8:
                throw new w("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((n() - 1) / 7) + 1;
            case 10:
                return this.f32882b;
            case 11:
                throw new w("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f32881a;
            case 13:
                return this.f32881a >= 1 ? 1 : 0;
            default:
                throw new w("Unsupported field: " + lVar);
        }
    }

    public static f q(int i11, int i12, int i13) {
        long j11 = i11;
        j$.time.temporal.a.YEAR.l(j11);
        j$.time.temporal.a.MONTH_OF_YEAR.l(i12);
        j$.time.temporal.a.DAY_OF_MONTH.l(i13);
        int i14 = 28;
        if (i13 > 28) {
            if (i12 != 2) {
                i14 = (i12 == 4 || i12 == 6 || i12 == 9 || i12 == 11) ? 30 : 31;
            } else if (j$.time.chrono.g.f32874a.c(j11)) {
                i14 = 29;
            }
            if (i13 > i14) {
                if (i13 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i11 + "' is not a leap year");
                }
                throw new c("Invalid date '" + j.k(i12).name() + " " + i13 + "'");
            }
        }
        return new f(i11, i12, i13);
    }

    public static f r(long j11) {
        long j12;
        long j13 = (j11 + 719528) - 60;
        if (j13 < 0) {
            long j14 = ((j13 + 1) / 146097) - 1;
            j12 = j14 * 400;
            j13 += (-j14) * 146097;
        } else {
            j12 = 0;
        }
        long j15 = ((j13 * 400) + 591) / 146097;
        long j16 = j13 - ((j15 / 400) + (((j15 / 4) + (j15 * 365)) - (j15 / 100)));
        if (j16 < 0) {
            j15--;
            j16 = j13 - ((j15 / 400) + (((j15 / 4) + (365 * j15)) - (j15 / 100)));
        }
        int i11 = (int) j16;
        int i12 = ((i11 * 5) + 2) / 153;
        return new f(j$.time.temporal.a.YEAR.k(j15 + j12 + (i12 / 10)), ((i12 + 2) % 12) + 1, (i11 - (((i12 * 306) + 5) / 10)) + 1);
    }

    @Override // j$.time.temporal.k
    public int b(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? l(lVar) : super.b(lVar);
    }

    @Override // j$.time.temporal.k
    public boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar.e() : lVar != null && lVar.h(this);
    }

    @Override // j$.time.temporal.k
    public Object d(u uVar) {
        int i11 = t.f32969a;
        if (uVar == r.f32967a) {
            return this;
        }
        if (uVar == m.f32962a || uVar == q.f32966a || uVar == p.f32965a || uVar == s.f32968a) {
            return null;
        }
        if (uVar == n.f32963a) {
            return j$.time.chrono.g.f32874a;
        }
        return uVar == o.f32964a ? j$.time.temporal.b.DAYS : uVar.a(this);
    }

    @Override // j$.time.temporal.k
    public long e(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar == j$.time.temporal.a.EPOCH_DAY) {
                return t();
            }
            if (lVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return ((this.f32881a * 12) + this.f32882b) - 1;
            }
            return l(lVar);
        }
        return lVar.d(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && i((f) obj) == 0;
    }

    @Override // j$.time.temporal.k
    public x g(j$.time.temporal.l lVar) {
        int i11;
        if (lVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
            if (!aVar.e()) {
                throw new w("Unsupported field: " + lVar);
            }
            int i12 = e.f32877a[aVar.ordinal()];
            if (i12 == 1) {
                short s11 = this.f32882b;
                i11 = s11 != 2 ? (s11 == 4 || s11 == 6 || s11 == 9 || s11 == 11) ? 30 : 31 : p() ? 29 : 28;
            } else if (i12 != 2) {
                if (i12 == 3) {
                    return x.i(1L, (j.k(this.f32882b) != j.FEBRUARY || p()) ? 5L : 4L);
                } else if (i12 != 4) {
                    return lVar.g();
                } else {
                    return x.i(1L, this.f32881a <= 0 ? 1000000000L : 999999999L);
                }
            } else {
                i11 = p() ? 366 : 365;
            }
            return x.i(1L, i11);
        }
        return lVar.c(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof f) {
            return i((f) bVar);
        }
        int compare = Long.compare(t(), ((f) bVar).t());
        if (compare == 0) {
            j$.time.chrono.g gVar = j$.time.chrono.g.f32874a;
            return 0;
        }
        return compare;
    }

    public int hashCode() {
        int i11 = this.f32881a;
        return (((i11 << 11) + (this.f32882b << 6)) + this.f32883c) ^ (i11 & (-2048));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(f fVar) {
        int i11 = this.f32881a - fVar.f32881a;
        if (i11 == 0) {
            int i12 = this.f32882b - fVar.f32882b;
            return i12 == 0 ? this.f32883c - fVar.f32883c : i12;
        }
        return i11;
    }

    public d m() {
        return d.i(((int) Math.floorMod(t() + 3, 7L)) + 1);
    }

    public int n() {
        return (j.k(this.f32882b).h(p()) + this.f32883c) - 1;
    }

    public int o() {
        return this.f32881a;
    }

    public boolean p() {
        return j$.time.chrono.g.f32874a.c(this.f32881a);
    }

    public f s(long j11) {
        int i11;
        if (j11 == 0) {
            return this;
        }
        int k11 = j$.time.temporal.a.YEAR.k(this.f32881a + j11);
        short s11 = this.f32882b;
        int i12 = this.f32883c;
        if (s11 != 2) {
            if (s11 == 4 || s11 == 6 || s11 == 9 || s11 == 11) {
                i11 = 30;
            }
            return new f(k11, s11, i12);
        }
        i11 = j$.time.chrono.g.f32874a.c((long) k11) ? 29 : 28;
        i12 = Math.min(i12, i11);
        return new f(k11, s11, i12);
    }

    public long t() {
        long j11;
        long j12 = this.f32881a;
        long j13 = this.f32882b;
        long j14 = (365 * j12) + 0;
        if (j12 >= 0) {
            j11 = ((j12 + 399) / 400) + (((3 + j12) / 4) - ((99 + j12) / 100)) + j14;
        } else {
            j11 = j14 - ((j12 / (-400)) + ((j12 / (-4)) - (j12 / (-100))));
        }
        long j15 = (((367 * j13) - 362) / 12) + j11 + (this.f32883c - 1);
        if (j13 > 2) {
            j15--;
            if (!p()) {
                j15--;
            }
        }
        return j15 - 719528;
    }

    public String toString() {
        int i11;
        int i12 = this.f32881a;
        short s11 = this.f32882b;
        short s12 = this.f32883c;
        int abs = Math.abs(i12);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs < 1000) {
            if (i12 < 0) {
                sb2.append(i12 - 10000);
                i11 = 1;
            } else {
                sb2.append(i12 + 10000);
                i11 = 0;
            }
            sb2.deleteCharAt(i11);
        } else {
            if (i12 > 9999) {
                sb2.append('+');
            }
            sb2.append(i12);
        }
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        sb2.append(s12 >= 10 ? "-" : "-0");
        sb2.append((int) s12);
        return sb2.toString();
    }

    public f u(int i11) {
        if (n() == i11) {
            return this;
        }
        int i12 = this.f32881a;
        long j11 = i12;
        j$.time.temporal.a.YEAR.l(j11);
        j$.time.temporal.a.DAY_OF_YEAR.l(i11);
        boolean c11 = j$.time.chrono.g.f32874a.c(j11);
        if (i11 == 366 && !c11) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i12 + "' is not a leap year");
        }
        int i13 = 31;
        j k11 = j.k(((i11 - 1) / 31) + 1);
        int h11 = k11.h(c11);
        int i14 = i.f32944a[k11.ordinal()];
        if (i14 == 1) {
            i13 = c11 ? 29 : 28;
        } else if (i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5) {
            i13 = 30;
        }
        if (i11 > (h11 + i13) - 1) {
            k11 = k11.l(1L);
        }
        return new f(i12, k11.i(), (i11 - k11.h(c11)) + 1);
    }
}