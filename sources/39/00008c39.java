package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.b0;
import net.time4j.engine.z;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j extends l {

    /* renamed from: f  reason: collision with root package name */
    private static final int f41579f = net.time4j.base.b.i(net.time4j.base.b.l(z.MODIFIED_JULIAN_DATE.transform(l.f(100), z.UNIX)));
    private static final long serialVersionUID = 2456700806862862287L;

    /* renamed from: a  reason: collision with root package name */
    private final transient q f41580a;

    /* renamed from: b  reason: collision with root package name */
    private final transient List<d> f41581b;

    /* renamed from: c  reason: collision with root package name */
    private final transient ConcurrentMap<Integer, List<q>> f41582c;

    /* renamed from: d  reason: collision with root package name */
    private final transient List<q> f41583d;

    /* renamed from: e  reason: collision with root package name */
    private final transient boolean f41584e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41585a;

        static {
            int[] iArr = new int[i.values().length];
            f41585a = iArr;
            try {
                iArr[i.UTC_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41585a[i.STANDARD_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41585a[i.WALL_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(p pVar, List<d> list, boolean z11) {
        this(new q(Long.MIN_VALUE, pVar.k(), pVar.k(), 0), list, z11);
    }

    private static q m(long j11, q qVar, List<d> list) {
        long max = Math.max(j11, qVar.e());
        int h11 = qVar.h();
        int size = list.size();
        int i11 = Integer.MIN_VALUE;
        q qVar2 = null;
        int i12 = 0;
        while (qVar2 == null) {
            int i13 = i12 % size;
            d dVar = list.get(i13);
            d dVar2 = list.get(((i12 - 1) + size) % size);
            int o11 = o(dVar, h11, dVar2.e());
            if (i12 == 0) {
                i11 = u(dVar, o11 + max);
            } else if (i13 == 0) {
                i11++;
            }
            long p11 = p(dVar, i11, o11);
            if (p11 > max) {
                qVar2 = new q(p11, h11 + dVar2.e(), h11 + dVar.e(), dVar.e());
            }
            i12++;
        }
        return qVar2;
    }

    private static int o(d dVar, int i11, int i12) {
        i d11 = dVar.d();
        int i13 = a.f41585a[d11.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    return i11 + i12;
                }
                throw new UnsupportedOperationException(d11.name());
            }
            return i11;
        }
        return 0;
    }

    private static long p(d dVar, int i11, int i12) {
        return dVar.b(i11).o0(dVar.f()).N(p.s(i12)).g();
    }

    private List<q> q(int i11) {
        List<q> putIfAbsent;
        Integer valueOf = Integer.valueOf(i11);
        List<q> list = this.f41582c.get(valueOf);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            int h11 = this.f41580a.h();
            int size = this.f41581b.size();
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = this.f41581b.get(i12);
                d dVar2 = this.f41581b.get(((i12 - 1) + size) % size);
                arrayList.add(new q(p(dVar, i11, o(dVar, h11, dVar2.e())), h11 + dVar2.e(), h11 + dVar.e(), dVar.e()));
            }
            List<q> unmodifiableList = Collections.unmodifiableList(arrayList);
            return (i11 > f41579f || !this.f41584e || (putIfAbsent = this.f41582c.putIfAbsent(valueOf, unmodifiableList)) == null) ? unmodifiableList : putIfAbsent;
        }
        return list;
    }

    private List<q> r(net.time4j.base.a aVar) {
        return q(this.f41581b.get(0).i(aVar));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<q> s(q qVar, List<d> list, long j11, long j12) {
        int i11;
        long e11 = qVar.e();
        int i12 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
        if (i12 > 0) {
            throw new IllegalArgumentException("Start after end.");
        }
        if (j12 > e11 && i12 != 0) {
            ArrayList arrayList = new ArrayList();
            int i13 = Integer.MIN_VALUE;
            int size = list.size();
            int i14 = 0;
            int h11 = qVar.h();
            while (true) {
                int i15 = i14 % size;
                d dVar = list.get(i15);
                d dVar2 = list.get(((i14 - 1) + size) % size);
                int o11 = o(dVar, h11, dVar2.e());
                if (i14 == 0) {
                    i11 = size;
                    i13 = u(dVar, Math.max(j11, e11) + o11);
                } else {
                    i11 = size;
                    if (i15 == 0) {
                        i13++;
                    }
                }
                long p11 = p(dVar, i13, o11);
                i14++;
                if (p11 >= j12) {
                    return Collections.unmodifiableList(arrayList);
                }
                if (p11 >= j11 && p11 > e11) {
                    arrayList.add(new q(p11, h11 + dVar2.e(), h11 + dVar.e(), dVar.e()));
                }
                size = i11;
            }
        } else {
            return Collections.emptyList();
        }
    }

    private static int u(d dVar, long j11) {
        return dVar.h(z.MODIFIED_JULIAN_DATE.transform(net.time4j.base.c.b(j11, 86400), z.UNIX));
    }

    private Object writeReplace() {
        return new SPX(this, 125);
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return k(aVar, l.j(aVar, gVar));
    }

    @Override // net.time4j.tz.m
    public q b(net.time4j.base.f fVar) {
        d dVar;
        q qVar;
        long e11 = this.f41580a.e();
        q qVar2 = null;
        if (fVar.g() <= e11) {
            return null;
        }
        int h11 = this.f41580a.h();
        int size = this.f41581b.size();
        int i11 = size - 1;
        int u11 = u(this.f41581b.get(0), fVar.g() + o(dVar, h11, this.f41581b.get(i11).e()));
        List<q> q11 = q(u11);
        for (int i12 = 0; i12 < size; i12++) {
            q qVar3 = q11.get(i12);
            long e12 = qVar3.e();
            if (fVar.g() < e12) {
                if (qVar2 == null) {
                    if (i12 == 0) {
                        qVar = q(u11 - 1).get(i11);
                    } else {
                        qVar = q11.get(i12 - 1);
                    }
                    return qVar.e() > e11 ? qVar : qVar2;
                }
                return qVar2;
            }
            if (e12 > e11) {
                qVar2 = qVar3;
            }
        }
        return qVar2;
    }

    @Override // net.time4j.tz.m
    public boolean c() {
        for (d dVar : this.f41581b) {
            if (dVar.e() < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.tz.m
    public p d() {
        return p.s(this.f41580a.i());
    }

    @Override // net.time4j.tz.m
    public List<p> e(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return t(aVar, l.j(aVar, gVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f41580a.equals(jVar.f41580a) && this.f41581b.equals(jVar.f41581b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f41580a.hashCode() * 17) + (this.f41581b.hashCode() * 37);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q k(net.time4j.base.a aVar, long j11) {
        if (j11 <= this.f41580a.e() + Math.max(this.f41580a.f(), this.f41580a.i())) {
            return null;
        }
        for (q qVar : r(aVar)) {
            long e11 = qVar.e();
            if (qVar.k()) {
                if (j11 < qVar.f() + e11) {
                    return null;
                }
                if (j11 < e11 + qVar.i()) {
                    return qVar;
                }
            } else if (!qVar.l()) {
                continue;
            } else if (j11 < qVar.i() + e11) {
                return null;
            } else {
                if (j11 < e11 + qVar.f()) {
                    return qVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q l() {
        return this.f41580a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<d> n() {
        return this.f41581b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<p> t(net.time4j.base.a aVar, long j11) {
        long e11 = this.f41580a.e();
        int i11 = this.f41580a.i();
        if (j11 <= e11 + Math.max(this.f41580a.f(), i11)) {
            return l.h(i11);
        }
        for (q qVar : r(aVar)) {
            long e12 = qVar.e();
            int i12 = qVar.i();
            if (qVar.k()) {
                if (j11 < qVar.f() + e12) {
                    return l.h(qVar.f());
                }
                if (j11 < e12 + i12) {
                    return Collections.emptyList();
                }
            } else if (!qVar.l()) {
                continue;
            } else if (j11 < i12 + e12) {
                return l.h(qVar.f());
            } else {
                if (j11 < e12 + qVar.f()) {
                    return l.i(i12, qVar.f());
                }
            }
            i11 = i12;
        }
        return l.h(i11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(j.class.getName());
        sb2.append("[initial=");
        sb2.append(this.f41580a);
        sb2.append(",rules=");
        sb2.append(this.f41581b);
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(q qVar, List<d> list, boolean z11) {
        q qVar2;
        this.f41582c = new ConcurrentHashMap();
        if (!list.isEmpty()) {
            if (list.size() < 128) {
                list = z11 ? new ArrayList(list) : list;
                Collections.sort(list, k.INSTANCE);
                String str = null;
                if (list.size() > 1) {
                    for (d dVar : list) {
                        if (str == null) {
                            str = dVar.a();
                        } else if (!str.equals(dVar.a())) {
                            throw new IllegalArgumentException("Rules with different calendar systems not permitted.");
                        }
                    }
                }
                this.f41584e = "iso8601".equals(str);
                if (qVar.e() == Long.MIN_VALUE) {
                    if (qVar.d() == 0) {
                        qVar2 = new q(b0.Q().H().g(), qVar.h(), qVar.h(), 0);
                    } else {
                        throw new IllegalArgumentException("Initial transition must not have any dst-offset: " + qVar);
                    }
                } else {
                    if (qVar.i() != m(qVar.e(), qVar, list).f()) {
                        throw new IllegalArgumentException("Inconsistent model: " + qVar + " / " + list);
                    }
                    qVar2 = qVar;
                }
                this.f41580a = qVar2;
                List<d> unmodifiableList = Collections.unmodifiableList(list);
                this.f41581b = unmodifiableList;
                this.f41583d = s(qVar2, unmodifiableList, 0L, l.f(1));
                return;
            }
            throw new IllegalArgumentException("Too many daylight saving rules: " + list);
        }
        throw new IllegalArgumentException("Missing daylight saving rules.");
    }
}