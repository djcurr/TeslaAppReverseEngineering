package m30;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class d implements Iterable<b>, Comparator<b> {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f38392f = Boolean.getBoolean("net.time4j.scale.leapseconds.suppressed");

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f38393g = Boolean.getBoolean("net.time4j.scale.leapseconds.final");

    /* renamed from: h  reason: collision with root package name */
    private static final m30.a[] f38394h;

    /* renamed from: i  reason: collision with root package name */
    private static final d f38395i;

    /* renamed from: a  reason: collision with root package name */
    private final c f38396a;

    /* renamed from: b  reason: collision with root package name */
    private final List<m30.a> f38397b;

    /* renamed from: c  reason: collision with root package name */
    private final m30.a[] f38398c;

    /* renamed from: d  reason: collision with root package name */
    private volatile m30.a[] f38399d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f38400e;

    static {
        System.getProperty("net.time4j.scale.leapseconds.path", "data/leapseconds.data");
        f38394h = new m30.a[0];
        f38395i = new d();
    }

    private d() {
        c cVar;
        int i11;
        net.time4j.base.a key;
        boolean z11 = false;
        if (f38392f) {
            cVar = null;
            i11 = 0;
        } else {
            cVar = null;
            i11 = 0;
            for (c cVar2 : net.time4j.base.d.c().g(c.class)) {
                int size = cVar2.e().size();
                if (size > i11) {
                    cVar = cVar2;
                    i11 = size;
                }
            }
        }
        if (cVar != null && i11 != 0) {
            TreeSet treeSet = new TreeSet(this);
            for (Map.Entry<net.time4j.base.a, Integer> entry : cVar.e().entrySet()) {
                treeSet.add(new a(entry.getKey(), Long.MIN_VALUE, (x(key) - 62985600) - 1, entry.getValue().intValue()));
            }
            i(treeSet);
            boolean z12 = f38393g;
            if (z12) {
                this.f38397b = Collections.unmodifiableList(new ArrayList(treeSet));
            } else {
                this.f38397b = new CopyOnWriteArrayList(treeSet);
            }
            m30.a[] s11 = s();
            this.f38398c = s11;
            this.f38399d = s11;
            this.f38396a = cVar;
            if (z12) {
                boolean b11 = cVar.b();
                if (b11) {
                    Iterator<m30.a> it2 = this.f38397b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().a() < 0) {
                                z11 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    b11 = z11;
                }
                this.f38400e = b11;
                return;
            }
            this.f38400e = true;
            return;
        }
        this.f38396a = null;
        this.f38397b = Collections.emptyList();
        m30.a[] aVarArr = f38394h;
        this.f38398c = aVarArr;
        this.f38399d = aVarArr;
        this.f38400e = false;
    }

    private static void i(SortedSet<m30.a> sortedSet) {
        ArrayList arrayList = new ArrayList(sortedSet.size());
        int i11 = 0;
        for (m30.a aVar : sortedSet) {
            if (aVar.b() == Long.MIN_VALUE) {
                i11 += aVar.a();
                arrayList.add(new a(aVar, i11));
            } else {
                arrayList.add(aVar);
            }
        }
        sortedSet.clear();
        sortedSet.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(net.time4j.base.a aVar) {
        return String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(aVar.getYear()), Integer.valueOf(aVar.getMonth()), Integer.valueOf(aVar.n()));
    }

    private m30.a[] o() {
        if (!f38392f && !f38393g) {
            return this.f38399d;
        }
        return this.f38398c;
    }

    public static d p() {
        return f38395i;
    }

    private m30.a[] s() {
        ArrayList arrayList = new ArrayList(this.f38397b.size());
        arrayList.addAll(this.f38397b);
        Collections.reverse(arrayList);
        return (m30.a[]) arrayList.toArray(new m30.a[arrayList.size()]);
    }

    private static long x(net.time4j.base.a aVar) {
        return net.time4j.base.c.i(net.time4j.base.c.m(net.time4j.base.b.k(aVar), 40587L), 86400L);
    }

    @Override // java.util.Comparator
    /* renamed from: c */
    public int compare(b bVar, b bVar2) {
        net.time4j.base.a date = bVar.getDate();
        net.time4j.base.a date2 = bVar2.getDate();
        int year = date.getYear();
        int year2 = date2.getYear();
        if (year < year2) {
            return -1;
        }
        if (year > year2) {
            return 1;
        }
        int month = date.getMonth();
        int month2 = date2.getMonth();
        if (month < month2) {
            return -1;
        }
        if (month > month2) {
            return 1;
        }
        int n11 = date.n();
        int n12 = date2.n();
        if (n11 < n12) {
            return -1;
        }
        return n11 == n12 ? 0 : 1;
    }

    public long f(long j11) {
        m30.a[] o11;
        long j12 = j11 - 63072000;
        if (j11 <= 0) {
            return j12;
        }
        for (m30.a aVar : o()) {
            if (aVar.c() < j12) {
                return net.time4j.base.c.f(j12, aVar.b() - aVar.c());
            }
        }
        return j12;
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return Collections.unmodifiableList(Arrays.asList(o())).iterator();
    }

    public net.time4j.base.a m() {
        if (t()) {
            return this.f38396a.d();
        }
        throw new IllegalStateException("Leap seconds not activated.");
    }

    public b q(long j11) {
        m30.a[] o11 = o();
        m30.a aVar = null;
        int i11 = 0;
        while (i11 < o11.length) {
            m30.a aVar2 = o11[i11];
            if (j11 >= aVar2.b()) {
                break;
            }
            i11++;
            aVar = aVar2;
        }
        return aVar;
    }

    public int r(long j11) {
        m30.a[] o11;
        if (j11 <= 0) {
            return 0;
        }
        for (m30.a aVar : o()) {
            if (j11 > aVar.b()) {
                return 0;
            }
            long b11 = aVar.b() - aVar.a();
            if (j11 > b11) {
                return (int) (j11 - b11);
            }
        }
        return 0;
    }

    public boolean t() {
        return !this.f38397b.isEmpty();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(2048);
        sb2.append("[PROVIDER=");
        sb2.append(this.f38396a);
        if (this.f38396a != null) {
            sb2.append(",EXPIRES=");
            sb2.append(j(m()));
        }
        sb2.append(",EVENTS=[");
        if (t()) {
            boolean z11 = true;
            for (m30.a aVar : this.f38397b) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append('|');
                }
                sb2.append(aVar);
            }
        } else {
            sb2.append("NOT SUPPORTED");
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public boolean u(long j11) {
        if (j11 <= 0) {
            return false;
        }
        m30.a[] o11 = o();
        for (int i11 = 0; i11 < o11.length; i11++) {
            int i12 = (o11[i11].b() > j11 ? 1 : (o11[i11].b() == j11 ? 0 : -1));
            if (i12 == 0) {
                return o11[i11].a() == 1;
            } else if (i12 < 0) {
                break;
            }
        }
        return false;
    }

    public long v(long j11) {
        if (j11 <= 0) {
            return j11 + 63072000;
        }
        m30.a[] o11 = o();
        boolean z11 = this.f38400e;
        for (m30.a aVar : o11) {
            if (aVar.b() - aVar.a() < j11 || (z11 && aVar.a() < 0 && aVar.b() < j11)) {
                j11 = net.time4j.base.c.f(j11, aVar.c() - aVar.b());
                break;
            }
        }
        return j11 + 63072000;
    }

    public boolean w() {
        return this.f38400e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a implements m30.a, Serializable {
        private static final long serialVersionUID = 5986185471610524587L;
        private final long _raw;
        private final long _utc;
        private final net.time4j.base.a date;
        private final int shift;

        a(net.time4j.base.a aVar, long j11, long j12, int i11) {
            this.date = aVar;
            this.shift = i11;
            this._utc = j11;
            this._raw = j12;
        }

        @Override // m30.b
        public int a() {
            return this.shift;
        }

        @Override // m30.a
        public long b() {
            return this._utc;
        }

        @Override // m30.a
        public long c() {
            return this._raw;
        }

        @Override // m30.b
        public net.time4j.base.a getDate() {
            return this.date;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(b.class.getName());
            sb2.append('[');
            sb2.append(d.j(this.date));
            sb2.append(": utc=");
            sb2.append(this._utc);
            sb2.append(", raw=");
            sb2.append(this._raw);
            sb2.append(" (shift=");
            sb2.append(this.shift);
            sb2.append(")]");
            return sb2.toString();
        }

        a(m30.a aVar, int i11) {
            this.date = aVar.getDate();
            this.shift = aVar.a();
            this._utc = aVar.c() + i11;
            this._raw = aVar.c();
        }
    }
}