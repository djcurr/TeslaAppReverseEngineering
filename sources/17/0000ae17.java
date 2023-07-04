package qi;

import ak.k0;
import ak.t;
import android.util.Pair;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import ji.u;
import ji.v;
import ji.w;
import ji.x;
import qi.a;
import wi.a;

/* loaded from: classes3.dex */
public final class k implements ji.h, v {

    /* renamed from: a */
    private final int f48252a;

    /* renamed from: b */
    private final ak.v f48253b;

    /* renamed from: c */
    private final ak.v f48254c;

    /* renamed from: d */
    private final ak.v f48255d;

    /* renamed from: e */
    private final ak.v f48256e;

    /* renamed from: f */
    private final ArrayDeque<a.C1029a> f48257f;

    /* renamed from: g */
    private final m f48258g;

    /* renamed from: h */
    private final List<a.b> f48259h;

    /* renamed from: i */
    private int f48260i;

    /* renamed from: j */
    private int f48261j;

    /* renamed from: k */
    private long f48262k;

    /* renamed from: l */
    private int f48263l;

    /* renamed from: m */
    private ak.v f48264m;

    /* renamed from: n */
    private int f48265n;

    /* renamed from: o */
    private int f48266o;

    /* renamed from: p */
    private int f48267p;

    /* renamed from: q */
    private int f48268q;

    /* renamed from: r */
    private ji.j f48269r;

    /* renamed from: s */
    private a[] f48270s;

    /* renamed from: t */
    private long[][] f48271t;

    /* renamed from: u */
    private int f48272u;

    /* renamed from: v */
    private long f48273v;

    /* renamed from: w */
    private int f48274w;

    /* renamed from: x */
    private cj.b f48275x;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public final o f48276a;

        /* renamed from: b */
        public final r f48277b;

        /* renamed from: c */
        public final x f48278c;

        /* renamed from: d */
        public int f48279d;

        public a(o oVar, r rVar, x xVar) {
            this.f48276a = oVar;
            this.f48277b = rVar;
            this.f48278c = xVar;
        }
    }

    static {
        j jVar = new ji.l() { // from class: qi.j
            @Override // ji.l
            public final ji.h[] b() {
                return k.k();
            }
        };
    }

    public k() {
        this(0);
    }

    private boolean A(ji.i iVar, u uVar) {
        boolean z11;
        long j11 = this.f48262k - this.f48263l;
        long position = iVar.getPosition() + j11;
        ak.v vVar = this.f48264m;
        if (vVar != null) {
            iVar.readFully(vVar.d(), this.f48263l, (int) j11);
            if (this.f48261j == 1718909296) {
                this.f48274w = w(vVar);
            } else if (!this.f48257f.isEmpty()) {
                this.f48257f.peek().e(new a.b(this.f48261j, vVar));
            }
        } else if (j11 < 262144) {
            iVar.k((int) j11);
        } else {
            uVar.f33770a = iVar.getPosition() + j11;
            z11 = true;
            u(position);
            return (z11 || this.f48260i == 2) ? false : true;
        }
        z11 = false;
        u(position);
        if (z11) {
        }
    }

    private int B(ji.i iVar, u uVar) {
        long position = iVar.getPosition();
        if (this.f48265n == -1) {
            int p11 = p(position);
            this.f48265n = p11;
            if (p11 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) k0.j(this.f48270s))[this.f48265n];
        x xVar = aVar.f48278c;
        int i11 = aVar.f48279d;
        r rVar = aVar.f48277b;
        long j11 = rVar.f48328c[i11];
        int i12 = rVar.f48329d[i11];
        long j12 = (j11 - position) + this.f48266o;
        if (j12 >= 0 && j12 < 262144) {
            if (aVar.f48276a.f48297g == 1) {
                j12 += 8;
                i12 -= 8;
            }
            iVar.k((int) j12);
            o oVar = aVar.f48276a;
            if (oVar.f48300j != 0) {
                byte[] d11 = this.f48254c.d();
                d11[0] = 0;
                d11[1] = 0;
                d11[2] = 0;
                int i13 = aVar.f48276a.f48300j;
                int i14 = 4 - i13;
                while (this.f48267p < i12) {
                    int i15 = this.f48268q;
                    if (i15 == 0) {
                        iVar.readFully(d11, i14, i13);
                        this.f48266o += i13;
                        this.f48254c.O(0);
                        int m11 = this.f48254c.m();
                        if (m11 >= 0) {
                            this.f48268q = m11;
                            this.f48253b.O(0);
                            xVar.e(this.f48253b, 4);
                            this.f48267p += 4;
                            i12 += i14;
                        } else {
                            throw new ParserException("Invalid NAL length");
                        }
                    } else {
                        int a11 = xVar.a(iVar, i15, false);
                        this.f48266o += a11;
                        this.f48267p += a11;
                        this.f48268q -= a11;
                    }
                }
            } else {
                if ("audio/ac4".equals(oVar.f48296f.f9205l)) {
                    if (this.f48267p == 0) {
                        ei.c.a(i12, this.f48255d);
                        xVar.e(this.f48255d, 7);
                        this.f48267p += 7;
                    }
                    i12 += 7;
                }
                while (true) {
                    int i16 = this.f48267p;
                    if (i16 >= i12) {
                        break;
                    }
                    int a12 = xVar.a(iVar, i12 - i16, false);
                    this.f48266o += a12;
                    this.f48267p += a12;
                    this.f48268q -= a12;
                }
            }
            r rVar2 = aVar.f48277b;
            xVar.f(rVar2.f48331f[i11], rVar2.f48332g[i11], i12, 0, null);
            aVar.f48279d++;
            this.f48265n = -1;
            this.f48266o = 0;
            this.f48267p = 0;
            this.f48268q = 0;
            return 0;
        }
        uVar.f33770a = j11;
        return 1;
    }

    private int C(ji.i iVar, u uVar) {
        int c11 = this.f48258g.c(iVar, uVar, this.f48259h);
        if (c11 == 1 && uVar.f33770a == 0) {
            n();
        }
        return c11;
    }

    private static boolean D(int i11) {
        return i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1701082227 || i11 == 1835365473;
    }

    private static boolean E(int i11) {
        return i11 == 1835296868 || i11 == 1836476516 || i11 == 1751411826 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1937011571 || i11 == 1668576371 || i11 == 1701606260 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1953196132 || i11 == 1718909296 || i11 == 1969517665 || i11 == 1801812339 || i11 == 1768715124;
    }

    private void F(long j11) {
        a[] aVarArr;
        for (a aVar : this.f48270s) {
            r rVar = aVar.f48277b;
            int a11 = rVar.a(j11);
            if (a11 == -1) {
                a11 = rVar.b(j11);
            }
            aVar.f48279d = a11;
        }
    }

    public static /* synthetic */ o j(o oVar) {
        return q(oVar);
    }

    public static /* synthetic */ ji.h[] k() {
        return r();
    }

    private static int l(int i11) {
        if (i11 != 1751476579) {
            return i11 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            jArr[i11] = new long[aVarArr[i11].f48277b.f48327b];
            jArr2[i11] = aVarArr[i11].f48277b.f48331f[0];
        }
        long j11 = 0;
        int i12 = 0;
        while (i12 < aVarArr.length) {
            long j12 = Long.MAX_VALUE;
            int i13 = -1;
            for (int i14 = 0; i14 < aVarArr.length; i14++) {
                if (!zArr[i14] && jArr2[i14] <= j12) {
                    j12 = jArr2[i14];
                    i13 = i14;
                }
            }
            int i15 = iArr[i13];
            jArr[i13][i15] = j11;
            j11 += aVarArr[i13].f48277b.f48329d[i15];
            int i16 = i15 + 1;
            iArr[i13] = i16;
            if (i16 < jArr[i13].length) {
                jArr2[i13] = aVarArr[i13].f48277b.f48331f[i16];
            } else {
                zArr[i13] = true;
                i12++;
            }
        }
        return jArr;
    }

    private void n() {
        this.f48260i = 0;
        this.f48263l = 0;
    }

    private static int o(r rVar, long j11) {
        int a11 = rVar.a(j11);
        return a11 == -1 ? rVar.b(j11) : a11;
    }

    private int p(long j11) {
        int i11 = -1;
        int i12 = -1;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        boolean z12 = true;
        long j14 = Long.MAX_VALUE;
        for (int i13 = 0; i13 < ((a[]) k0.j(this.f48270s)).length; i13++) {
            a aVar = this.f48270s[i13];
            int i14 = aVar.f48279d;
            r rVar = aVar.f48277b;
            if (i14 != rVar.f48327b) {
                long j15 = rVar.f48328c[i14];
                long j16 = ((long[][]) k0.j(this.f48271t))[i13][i14];
                long j17 = j15 - j11;
                boolean z13 = j17 < 0 || j17 >= 262144;
                if ((!z13 && z12) || (z13 == z12 && j17 < j14)) {
                    z12 = z13;
                    j14 = j17;
                    i12 = i13;
                    j13 = j16;
                }
                if (j16 < j12) {
                    z11 = z13;
                    i11 = i13;
                    j12 = j16;
                }
            }
        }
        return (j12 == Long.MAX_VALUE || !z11 || j13 < j12 + SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE) ? i12 : i11;
    }

    public static /* synthetic */ o q(o oVar) {
        return oVar;
    }

    public static /* synthetic */ ji.h[] r() {
        return new ji.h[]{new k()};
    }

    private static long s(r rVar, long j11, long j12) {
        int o11 = o(rVar, j11);
        return o11 == -1 ? j12 : Math.min(rVar.f48328c[o11], j12);
    }

    private void t(ji.i iVar) {
        this.f48255d.K(8);
        iVar.n(this.f48255d.d(), 0, 8);
        b.d(this.f48255d);
        iVar.k(this.f48255d.e());
        iVar.d();
    }

    private void u(long j11) {
        while (!this.f48257f.isEmpty() && this.f48257f.peek().f48168b == j11) {
            a.C1029a pop = this.f48257f.pop();
            if (pop.f48167a == 1836019574) {
                x(pop);
                this.f48257f.clear();
                this.f48260i = 2;
            } else if (!this.f48257f.isEmpty()) {
                this.f48257f.peek().d(pop);
            }
        }
        if (this.f48260i != 2) {
            n();
        }
    }

    private void v() {
        if (this.f48274w != 2 || (this.f48252a & 2) == 0) {
            return;
        }
        ji.j jVar = (ji.j) ak.a.e(this.f48269r);
        jVar.f(0, 4).d(new i.b().X(this.f48275x == null ? null : new wi.a(this.f48275x)).E());
        jVar.s();
        jVar.p(new v.b(-9223372036854775807L));
    }

    private static int w(ak.v vVar) {
        vVar.O(8);
        int l11 = l(vVar.m());
        if (l11 != 0) {
            return l11;
        }
        vVar.P(4);
        while (vVar.a() > 0) {
            int l12 = l(vVar.m());
            if (l12 != 0) {
                return l12;
            }
        }
        return 0;
    }

    private void x(a.C1029a c1029a) {
        wi.a aVar;
        wi.a aVar2;
        ArrayList arrayList;
        List<r> list;
        int i11;
        int i12;
        ArrayList arrayList2 = new ArrayList();
        boolean z11 = this.f48274w == 1;
        ji.r rVar = new ji.r();
        a.b g11 = c1029a.g(1969517665);
        if (g11 != null) {
            Pair<wi.a, wi.a> A = b.A(g11);
            wi.a aVar3 = (wi.a) A.first;
            wi.a aVar4 = (wi.a) A.second;
            if (aVar3 != null) {
                rVar.c(aVar3);
            }
            aVar = aVar4;
            aVar2 = aVar3;
        } else {
            aVar = null;
            aVar2 = null;
        }
        a.C1029a f11 = c1029a.f(1835365473);
        wi.a m11 = f11 != null ? b.m(f11) : null;
        List<r> z12 = b.z(c1029a, rVar, -9223372036854775807L, null, (this.f48252a & 1) != 0, z11, new com.google.common.base.l() { // from class: qi.i
            @Override // com.google.common.base.l
            public final Object apply(Object obj) {
                return k.j((o) obj);
            }
        });
        ji.j jVar = (ji.j) ak.a.e(this.f48269r);
        int size = z12.size();
        int i13 = 0;
        int i14 = -1;
        long j11 = -9223372036854775807L;
        while (i13 < size) {
            r rVar2 = z12.get(i13);
            if (rVar2.f48327b == 0) {
                list = z12;
                i11 = size;
                arrayList = arrayList2;
            } else {
                o oVar = rVar2.f48326a;
                int i15 = i14;
                arrayList = arrayList2;
                long j12 = oVar.f48295e;
                if (j12 == -9223372036854775807L) {
                    j12 = rVar2.f48333h;
                }
                long max = Math.max(j11, j12);
                list = z12;
                i11 = size;
                a aVar5 = new a(oVar, rVar2, jVar.f(i13, oVar.f48292b));
                i.b a11 = oVar.f48296f.a();
                a11.W(rVar2.f48330e + 30);
                if (oVar.f48292b == 2 && j12 > 0 && (i12 = rVar2.f48327b) > 1) {
                    a11.P(i12 / (((float) j12) / 1000000.0f));
                }
                h.k(oVar.f48292b, rVar, a11);
                int i16 = oVar.f48292b;
                wi.a[] aVarArr = new wi.a[2];
                aVarArr[0] = aVar;
                aVarArr[1] = this.f48259h.isEmpty() ? null : new wi.a(this.f48259h);
                h.l(i16, aVar2, m11, a11, aVarArr);
                aVar5.f48278c.d(a11.E());
                if (oVar.f48292b == 2 && i15 == -1) {
                    i14 = arrayList.size();
                    arrayList.add(aVar5);
                    j11 = max;
                }
                i14 = i15;
                arrayList.add(aVar5);
                j11 = max;
            }
            i13++;
            arrayList2 = arrayList;
            z12 = list;
            size = i11;
        }
        this.f48272u = i14;
        this.f48273v = j11;
        a[] aVarArr2 = (a[]) arrayList2.toArray(new a[0]);
        this.f48270s = aVarArr2;
        this.f48271t = m(aVarArr2);
        jVar.s();
        jVar.p(this);
    }

    private void y(long j11) {
        if (this.f48261j == 1836086884) {
            int i11 = this.f48263l;
            this.f48275x = new cj.b(0L, j11, -9223372036854775807L, j11 + i11, this.f48262k - i11);
        }
    }

    private boolean z(ji.i iVar) {
        a.C1029a peek;
        if (this.f48263l == 0) {
            if (!iVar.e(this.f48256e.d(), 0, 8, true)) {
                v();
                return false;
            }
            this.f48263l = 8;
            this.f48256e.O(0);
            this.f48262k = this.f48256e.E();
            this.f48261j = this.f48256e.m();
        }
        long j11 = this.f48262k;
        if (j11 == 1) {
            iVar.readFully(this.f48256e.d(), 8, 8);
            this.f48263l += 8;
            this.f48262k = this.f48256e.H();
        } else if (j11 == 0) {
            long length = iVar.getLength();
            if (length == -1 && (peek = this.f48257f.peek()) != null) {
                length = peek.f48168b;
            }
            if (length != -1) {
                this.f48262k = (length - iVar.getPosition()) + this.f48263l;
            }
        }
        if (this.f48262k >= this.f48263l) {
            if (D(this.f48261j)) {
                long position = iVar.getPosition();
                long j12 = this.f48262k;
                int i11 = this.f48263l;
                long j13 = (position + j12) - i11;
                if (j12 != i11 && this.f48261j == 1835365473) {
                    t(iVar);
                }
                this.f48257f.push(new a.C1029a(this.f48261j, j13));
                if (this.f48262k == this.f48263l) {
                    u(j13);
                } else {
                    n();
                }
            } else if (E(this.f48261j)) {
                ak.a.f(this.f48263l == 8);
                ak.a.f(this.f48262k <= 2147483647L);
                ak.v vVar = new ak.v((int) this.f48262k);
                System.arraycopy(this.f48256e.d(), 0, vVar.d(), 0, 8);
                this.f48264m = vVar;
                this.f48260i = 1;
            } else {
                y(iVar.getPosition() - this.f48263l);
                this.f48264m = null;
                this.f48260i = 1;
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        this.f48257f.clear();
        this.f48263l = 0;
        this.f48265n = -1;
        this.f48266o = 0;
        this.f48267p = 0;
        this.f48268q = 0;
        if (j11 == 0) {
            if (this.f48260i != 3) {
                n();
                return;
            }
            this.f48258g.g();
            this.f48259h.clear();
        } else if (this.f48270s != null) {
            F(j12);
        }
    }

    @Override // ji.h
    public void b(ji.j jVar) {
        this.f48269r = jVar;
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        return n.d(iVar, (this.f48252a & 2) != 0);
    }

    @Override // ji.h
    public int e(ji.i iVar, u uVar) {
        while (true) {
            int i11 = this.f48260i;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            return C(iVar, uVar);
                        }
                        throw new IllegalStateException();
                    }
                    return B(iVar, uVar);
                } else if (A(iVar, uVar)) {
                    return 1;
                }
            } else if (!z(iVar)) {
                return -1;
            }
        }
    }

    @Override // ji.v
    public v.a f(long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        int b11;
        if (((a[]) ak.a.e(this.f48270s)).length == 0) {
            return new v.a(w.f33775c);
        }
        int i11 = this.f48272u;
        if (i11 != -1) {
            r rVar = this.f48270s[i11].f48277b;
            int o11 = o(rVar, j11);
            if (o11 == -1) {
                return new v.a(w.f33775c);
            }
            long j16 = rVar.f48331f[o11];
            j12 = rVar.f48328c[o11];
            if (j16 >= j11 || o11 >= rVar.f48327b - 1 || (b11 = rVar.b(j11)) == -1 || b11 == o11) {
                j15 = -1;
                j14 = -9223372036854775807L;
            } else {
                j14 = rVar.f48331f[b11];
                j15 = rVar.f48328c[b11];
            }
            j13 = j15;
            j11 = j16;
        } else {
            j12 = Long.MAX_VALUE;
            j13 = -1;
            j14 = -9223372036854775807L;
        }
        int i12 = 0;
        while (true) {
            a[] aVarArr = this.f48270s;
            if (i12 >= aVarArr.length) {
                break;
            }
            if (i12 != this.f48272u) {
                r rVar2 = aVarArr[i12].f48277b;
                long s11 = s(rVar2, j11, j12);
                if (j14 != -9223372036854775807L) {
                    j13 = s(rVar2, j14, j13);
                }
                j12 = s11;
            }
            i12++;
        }
        w wVar = new w(j11, j12);
        if (j14 == -9223372036854775807L) {
            return new v.a(wVar);
        }
        return new v.a(wVar, new w(j14, j13));
    }

    @Override // ji.v
    public boolean h() {
        return true;
    }

    @Override // ji.v
    public long i() {
        return this.f48273v;
    }

    @Override // ji.h
    public void release() {
    }

    public k(int i11) {
        this.f48252a = i11;
        this.f48260i = (i11 & 4) != 0 ? 3 : 0;
        this.f48258g = new m();
        this.f48259h = new ArrayList();
        this.f48256e = new ak.v(16);
        this.f48257f = new ArrayDeque<>();
        this.f48253b = new ak.v(t.f519a);
        this.f48254c = new ak.v(4);
        this.f48255d = new ak.v();
        this.f48265n = -1;
    }
}