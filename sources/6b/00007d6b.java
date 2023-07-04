package k5;

import androidx.work.a0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: s  reason: collision with root package name */
    private static final String f34403s = androidx.work.q.f("WorkSpec");

    /* renamed from: t  reason: collision with root package name */
    public static final p.a<List<c>, List<a0>> f34404t = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f34405a;

    /* renamed from: b  reason: collision with root package name */
    public a0.a f34406b;

    /* renamed from: c  reason: collision with root package name */
    public String f34407c;

    /* renamed from: d  reason: collision with root package name */
    public String f34408d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.e f34409e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.e f34410f;

    /* renamed from: g  reason: collision with root package name */
    public long f34411g;

    /* renamed from: h  reason: collision with root package name */
    public long f34412h;

    /* renamed from: i  reason: collision with root package name */
    public long f34413i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.work.c f34414j;

    /* renamed from: k  reason: collision with root package name */
    public int f34415k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.work.a f34416l;

    /* renamed from: m  reason: collision with root package name */
    public long f34417m;

    /* renamed from: n  reason: collision with root package name */
    public long f34418n;

    /* renamed from: o  reason: collision with root package name */
    public long f34419o;

    /* renamed from: p  reason: collision with root package name */
    public long f34420p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f34421q;

    /* renamed from: r  reason: collision with root package name */
    public androidx.work.u f34422r;

    /* loaded from: classes.dex */
    class a implements p.a<List<c>, List<a0>> {
        a() {
        }

        @Override // p.a
        /* renamed from: a */
        public List<a0> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (c cVar : list) {
                arrayList.add(cVar.a());
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f34423a;

        /* renamed from: b  reason: collision with root package name */
        public a0.a f34424b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f34424b != bVar.f34424b) {
                    return false;
                }
                return this.f34423a.equals(bVar.f34423a);
            }
            return false;
        }

        public int hashCode() {
            return (this.f34423a.hashCode() * 31) + this.f34424b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f34425a;

        /* renamed from: b  reason: collision with root package name */
        public a0.a f34426b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.work.e f34427c;

        /* renamed from: d  reason: collision with root package name */
        public int f34428d;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f34429e;

        /* renamed from: f  reason: collision with root package name */
        public List<androidx.work.e> f34430f;

        public a0 a() {
            androidx.work.e eVar;
            List<androidx.work.e> list = this.f34430f;
            if (list != null && !list.isEmpty()) {
                eVar = this.f34430f.get(0);
            } else {
                eVar = androidx.work.e.f6542c;
            }
            return new a0(UUID.fromString(this.f34425a), this.f34426b, this.f34427c, this.f34429e, eVar, this.f34428d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f34428d != cVar.f34428d) {
                    return false;
                }
                String str = this.f34425a;
                if (str == null ? cVar.f34425a == null : str.equals(cVar.f34425a)) {
                    if (this.f34426b != cVar.f34426b) {
                        return false;
                    }
                    androidx.work.e eVar = this.f34427c;
                    if (eVar == null ? cVar.f34427c == null : eVar.equals(cVar.f34427c)) {
                        List<String> list = this.f34429e;
                        if (list == null ? cVar.f34429e == null : list.equals(cVar.f34429e)) {
                            List<androidx.work.e> list2 = this.f34430f;
                            List<androidx.work.e> list3 = cVar.f34430f;
                            return list2 != null ? list2.equals(list3) : list3 == null;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f34425a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            a0.a aVar = this.f34426b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.e eVar = this.f34427c;
            int hashCode3 = (((hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f34428d) * 31;
            List<String> list = this.f34429e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.e> list2 = this.f34430f;
            return hashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public p(String str, String str2) {
        this.f34406b = a0.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f6542c;
        this.f34409e = eVar;
        this.f34410f = eVar;
        this.f34414j = androidx.work.c.f6513i;
        this.f34416l = androidx.work.a.EXPONENTIAL;
        this.f34417m = 30000L;
        this.f34420p = -1L;
        this.f34422r = androidx.work.u.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f34405a = str;
        this.f34407c = str2;
    }

    public long a() {
        long scalb;
        if (c()) {
            if (this.f34416l == androidx.work.a.LINEAR) {
                scalb = this.f34417m * this.f34415k;
            } else {
                scalb = Math.scalb((float) this.f34417m, this.f34415k - 1);
            }
            return this.f34418n + Math.min(18000000L, scalb);
        }
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.f34418n;
            long j12 = j11 == 0 ? currentTimeMillis + this.f34411g : j11;
            long j13 = this.f34413i;
            long j14 = this.f34412h;
            if (j13 != j14) {
                return j12 + j14 + (j11 == 0 ? j13 * (-1) : 0L);
            }
            return j12 + (j11 != 0 ? j14 : 0L);
        }
        long j15 = this.f34418n;
        if (j15 == 0) {
            j15 = System.currentTimeMillis();
        }
        return j15 + this.f34411g;
    }

    public boolean b() {
        return !androidx.work.c.f6513i.equals(this.f34414j);
    }

    public boolean c() {
        return this.f34406b == a0.a.ENQUEUED && this.f34415k > 0;
    }

    public boolean d() {
        return this.f34412h != 0;
    }

    public void e(long j11) {
        if (j11 > 18000000) {
            androidx.work.q.c().h(f34403s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j11 = 18000000;
        }
        if (j11 < AbstractComponentTracker.LINGERING_TIMEOUT) {
            androidx.work.q.c().h(f34403s, "Backoff delay duration less than minimum value", new Throwable[0]);
            j11 = 10000;
        }
        this.f34417m = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f34411g == pVar.f34411g && this.f34412h == pVar.f34412h && this.f34413i == pVar.f34413i && this.f34415k == pVar.f34415k && this.f34417m == pVar.f34417m && this.f34418n == pVar.f34418n && this.f34419o == pVar.f34419o && this.f34420p == pVar.f34420p && this.f34421q == pVar.f34421q && this.f34405a.equals(pVar.f34405a) && this.f34406b == pVar.f34406b && this.f34407c.equals(pVar.f34407c)) {
            String str = this.f34408d;
            if (str == null ? pVar.f34408d == null : str.equals(pVar.f34408d)) {
                return this.f34409e.equals(pVar.f34409e) && this.f34410f.equals(pVar.f34410f) && this.f34414j.equals(pVar.f34414j) && this.f34416l == pVar.f34416l && this.f34422r == pVar.f34422r;
            }
            return false;
        }
        return false;
    }

    public void f(long j11, long j12) {
        if (j11 < 900000) {
            androidx.work.q.c().h(f34403s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j11 = 900000;
        }
        if (j12 < 300000) {
            androidx.work.q.c().h(f34403s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            j12 = 300000;
        }
        if (j12 > j11) {
            androidx.work.q.c().h(f34403s, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j11)), new Throwable[0]);
            j12 = j11;
        }
        this.f34412h = j11;
        this.f34413i = j12;
    }

    public int hashCode() {
        int hashCode = ((((this.f34405a.hashCode() * 31) + this.f34406b.hashCode()) * 31) + this.f34407c.hashCode()) * 31;
        String str = this.f34408d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j11 = this.f34411g;
        long j12 = this.f34412h;
        long j13 = this.f34413i;
        long j14 = this.f34417m;
        long j15 = this.f34418n;
        long j16 = this.f34419o;
        long j17 = this.f34420p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f34409e.hashCode()) * 31) + this.f34410f.hashCode()) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f34414j.hashCode()) * 31) + this.f34415k) * 31) + this.f34416l.hashCode()) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + ((int) (j17 ^ (j17 >>> 32)))) * 31) + (this.f34421q ? 1 : 0)) * 31) + this.f34422r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f34405a + "}";
    }

    public p(p pVar) {
        this.f34406b = a0.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f6542c;
        this.f34409e = eVar;
        this.f34410f = eVar;
        this.f34414j = androidx.work.c.f6513i;
        this.f34416l = androidx.work.a.EXPONENTIAL;
        this.f34417m = 30000L;
        this.f34420p = -1L;
        this.f34422r = androidx.work.u.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f34405a = pVar.f34405a;
        this.f34407c = pVar.f34407c;
        this.f34406b = pVar.f34406b;
        this.f34408d = pVar.f34408d;
        this.f34409e = new androidx.work.e(pVar.f34409e);
        this.f34410f = new androidx.work.e(pVar.f34410f);
        this.f34411g = pVar.f34411g;
        this.f34412h = pVar.f34412h;
        this.f34413i = pVar.f34413i;
        this.f34414j = new androidx.work.c(pVar.f34414j);
        this.f34415k = pVar.f34415k;
        this.f34416l = pVar.f34416l;
        this.f34417m = pVar.f34417m;
        this.f34418n = pVar.f34418n;
        this.f34419o = pVar.f34419o;
        this.f34420p = pVar.f34420p;
        this.f34421q = pVar.f34421q;
        this.f34422r = pVar.f34422r;
    }
}