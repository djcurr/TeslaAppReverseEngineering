package pi;

import ak.k0;
import ak.v;
import bj.h;
import bj.k;
import bj.m;
import ci.i;
import ei.s;
import java.io.EOFException;
import ji.j;
import ji.l;
import ji.r;
import ji.u;
import ji.x;
import pi.g;
import wi.a;

/* loaded from: classes3.dex */
public final class f implements ji.h {

    /* renamed from: u */
    private static final h.a f46547u;

    /* renamed from: a */
    private final int f46548a;

    /* renamed from: b */
    private final long f46549b;

    /* renamed from: c */
    private final v f46550c;

    /* renamed from: d */
    private final s.a f46551d;

    /* renamed from: e */
    private final r f46552e;

    /* renamed from: f */
    private final ji.s f46553f;

    /* renamed from: g */
    private final x f46554g;

    /* renamed from: h */
    private j f46555h;

    /* renamed from: i */
    private x f46556i;

    /* renamed from: j */
    private x f46557j;

    /* renamed from: k */
    private int f46558k;

    /* renamed from: l */
    private wi.a f46559l;

    /* renamed from: m */
    private long f46560m;

    /* renamed from: n */
    private long f46561n;

    /* renamed from: o */
    private long f46562o;

    /* renamed from: p */
    private int f46563p;

    /* renamed from: q */
    private g f46564q;

    /* renamed from: r */
    private boolean f46565r;

    /* renamed from: s */
    private boolean f46566s;

    /* renamed from: t */
    private long f46567t;

    static {
        e eVar = new l() { // from class: pi.e
            @Override // ji.l
            public final ji.h[] b() {
                return f.c();
            }
        };
        f46547u = new h.a() { // from class: pi.d
            @Override // bj.h.a
            public final boolean a(int i11, int i12, int i13, int i14, int i15) {
                return f.f(i11, i12, i13, i14, i15);
            }
        };
    }

    public f() {
        this(0);
    }

    public static /* synthetic */ ji.h[] c() {
        return o();
    }

    public static /* synthetic */ boolean f(int i11, int i12, int i13, int i14, int i15) {
        return p(i11, i12, i13, i14, i15);
    }

    private void g() {
        ak.a.h(this.f46556i);
        k0.j(this.f46555h);
    }

    private g h(ji.i iVar) {
        long l11;
        long j11;
        long i11;
        long g11;
        g r11 = r(iVar);
        c q11 = q(this.f46559l, iVar.getPosition());
        if (this.f46565r) {
            return new g.a();
        }
        if ((this.f46548a & 2) != 0) {
            if (q11 != null) {
                i11 = q11.i();
                g11 = q11.g();
            } else if (r11 != null) {
                i11 = r11.i();
                g11 = r11.g();
            } else {
                l11 = l(this.f46559l);
                j11 = -1;
                r11 = new b(l11, iVar.getPosition(), j11);
            }
            j11 = g11;
            l11 = i11;
            r11 = new b(l11, iVar.getPosition(), j11);
        } else if (q11 != null) {
            r11 = q11;
        } else if (r11 == null) {
            r11 = null;
        }
        return (r11 == null || !(r11.h() || (this.f46548a & 1) == 0)) ? k(iVar) : r11;
    }

    private long i(long j11) {
        return this.f46560m + ((j11 * 1000000) / this.f46551d.f25181d);
    }

    private g k(ji.i iVar) {
        iVar.n(this.f46550c.d(), 0, 4);
        this.f46550c.O(0);
        this.f46551d.a(this.f46550c.m());
        return new a(iVar.getLength(), iVar.getPosition(), this.f46551d);
    }

    private static long l(wi.a aVar) {
        if (aVar != null) {
            int d11 = aVar.d();
            for (int i11 = 0; i11 < d11; i11++) {
                a.b c11 = aVar.c(i11);
                if (c11 instanceof m) {
                    m mVar = (m) c11;
                    if (mVar.f7697a.equals("TLEN")) {
                        return ci.b.c(Long.parseLong(mVar.f7709c));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private static int m(v vVar, int i11) {
        if (vVar.f() >= i11 + 4) {
            vVar.O(i11);
            int m11 = vVar.m();
            if (m11 == 1483304551 || m11 == 1231971951) {
                return m11;
            }
        }
        if (vVar.f() >= 40) {
            vVar.O(36);
            return vVar.m() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    private static boolean n(int i11, long j11) {
        return ((long) (i11 & (-128000))) == (j11 & (-128000));
    }

    public static /* synthetic */ ji.h[] o() {
        return new ji.h[]{new f()};
    }

    public static /* synthetic */ boolean p(int i11, int i12, int i13, int i14, int i15) {
        return (i12 == 67 && i13 == 79 && i14 == 77 && (i15 == 77 || i11 == 2)) || (i12 == 77 && i13 == 76 && i14 == 76 && (i15 == 84 || i11 == 2));
    }

    private static c q(wi.a aVar, long j11) {
        if (aVar != null) {
            int d11 = aVar.d();
            for (int i11 = 0; i11 < d11; i11++) {
                a.b c11 = aVar.c(i11);
                if (c11 instanceof k) {
                    return c.a(j11, (k) c11, l(aVar));
                }
            }
            return null;
        }
        return null;
    }

    private g r(ji.i iVar) {
        v vVar = new v(this.f46551d.f25180c);
        iVar.n(vVar.d(), 0, this.f46551d.f25180c);
        s.a aVar = this.f46551d;
        int i11 = 21;
        if ((aVar.f25178a & 1) != 0) {
            if (aVar.f25182e != 1) {
                i11 = 36;
            }
        } else if (aVar.f25182e == 1) {
            i11 = 13;
        }
        int i12 = i11;
        int m11 = m(vVar, i12);
        if (m11 != 1483304551 && m11 != 1231971951) {
            if (m11 == 1447187017) {
                h a11 = h.a(iVar.getLength(), iVar.getPosition(), this.f46551d, vVar);
                iVar.k(this.f46551d.f25180c);
                return a11;
            }
            iVar.d();
            return null;
        }
        i a12 = i.a(iVar.getLength(), iVar.getPosition(), this.f46551d, vVar);
        if (a12 != null && !this.f46552e.a()) {
            iVar.d();
            iVar.g(i12 + 141);
            iVar.n(this.f46550c.d(), 0, 3);
            this.f46550c.O(0);
            this.f46552e.d(this.f46550c.F());
        }
        iVar.k(this.f46551d.f25180c);
        return (a12 == null || a12.h() || m11 != 1231971951) ? a12 : k(iVar);
    }

    private boolean s(ji.i iVar) {
        g gVar = this.f46564q;
        if (gVar != null) {
            long g11 = gVar.g();
            if (g11 != -1 && iVar.f() > g11 - 4) {
                return true;
            }
        }
        try {
            return !iVar.a(this.f46550c.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int t(ji.i iVar) {
        if (this.f46558k == 0) {
            try {
                v(iVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f46564q == null) {
            g h11 = h(iVar);
            this.f46564q = h11;
            this.f46555h.p(h11);
            this.f46557j.d(new i.b().e0(this.f46551d.f25179b).W(4096).H(this.f46551d.f25182e).f0(this.f46551d.f25181d).M(this.f46552e.f33763a).N(this.f46552e.f33764b).X((this.f46548a & 4) != 0 ? null : this.f46559l).E());
            this.f46562o = iVar.getPosition();
        } else if (this.f46562o != 0) {
            long position = iVar.getPosition();
            long j11 = this.f46562o;
            if (position < j11) {
                iVar.k((int) (j11 - position));
            }
        }
        return u(iVar);
    }

    private int u(ji.i iVar) {
        s.a aVar;
        if (this.f46563p == 0) {
            iVar.d();
            if (s(iVar)) {
                return -1;
            }
            this.f46550c.O(0);
            int m11 = this.f46550c.m();
            if (n(m11, this.f46558k) && s.j(m11) != -1) {
                this.f46551d.a(m11);
                if (this.f46560m == -9223372036854775807L) {
                    this.f46560m = this.f46564q.c(iVar.getPosition());
                    if (this.f46549b != -9223372036854775807L) {
                        this.f46560m += this.f46549b - this.f46564q.c(0L);
                    }
                }
                this.f46563p = this.f46551d.f25180c;
                g gVar = this.f46564q;
                if (gVar instanceof b) {
                    b bVar = (b) gVar;
                    bVar.b(i(this.f46561n + aVar.f25184g), iVar.getPosition() + this.f46551d.f25180c);
                    if (this.f46566s && bVar.a(this.f46567t)) {
                        this.f46566s = false;
                        this.f46557j = this.f46556i;
                    }
                }
            } else {
                iVar.k(1);
                this.f46558k = 0;
                return 0;
            }
        }
        int a11 = this.f46557j.a(iVar, this.f46563p, true);
        if (a11 == -1) {
            return -1;
        }
        int i11 = this.f46563p - a11;
        this.f46563p = i11;
        if (i11 > 0) {
            return 0;
        }
        this.f46557j.f(i(this.f46561n), 1, this.f46551d.f25180c, 0, null);
        this.f46561n += this.f46551d.f25184g;
        this.f46563p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x009d, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x009f, code lost:
        r12.k(r1 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00a4, code lost:
        r12.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00a7, code lost:
        r11.f46558k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00a9, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean v(ji.i r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.d()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 4
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L41
            int r1 = r11.f46548a
            r1 = r1 & r2
            if (r1 != 0) goto L1f
            r1 = r3
            goto L20
        L1f:
            r1 = r4
        L20:
            if (r1 == 0) goto L24
            r1 = 0
            goto L26
        L24:
            bj.h$a r1 = pi.f.f46547u
        L26:
            ji.s r5 = r11.f46553f
            wi.a r1 = r5.a(r12, r1)
            r11.f46559l = r1
            if (r1 == 0) goto L35
            ji.r r5 = r11.f46552e
            r5.c(r1)
        L35:
            long r5 = r12.f()
            int r1 = (int) r5
            if (r13 != 0) goto L3f
            r12.k(r1)
        L3f:
            r5 = r4
            goto L43
        L41:
            r1 = r4
            r5 = r1
        L43:
            r6 = r5
            r7 = r6
        L45:
            boolean r8 = r11.s(r12)
            if (r8 == 0) goto L54
            if (r6 <= 0) goto L4e
            goto L9d
        L4e:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L54:
            ak.v r8 = r11.f46550c
            r8.O(r4)
            ak.v r8 = r11.f46550c
            int r8 = r8.m()
            if (r5 == 0) goto L68
            long r9 = (long) r5
            boolean r9 = n(r8, r9)
            if (r9 == 0) goto L6f
        L68:
            int r9 = ei.s.j(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L6f:
            int r5 = r7 + 1
            if (r7 != r0) goto L7e
            if (r13 == 0) goto L76
            return r4
        L76:
            com.google.android.exoplayer2.ParserException r12 = new com.google.android.exoplayer2.ParserException
            java.lang.String r13 = "Searched too many bytes."
            r12.<init>(r13)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.d()
            int r6 = r1 + r5
            r12.g(r6)
            goto L8c
        L89:
            r12.k(r3)
        L8c:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L45
        L90:
            int r6 = r6 + 1
            if (r6 != r3) goto L9b
            ei.s$a r5 = r11.f46551d
            r5.a(r8)
            r5 = r8
            goto Laa
        L9b:
            if (r6 != r2) goto Laa
        L9d:
            if (r13 == 0) goto La4
            int r1 = r1 + r7
            r12.k(r1)
            goto La7
        La4:
            r12.d()
        La7:
            r11.f46558k = r5
            return r3
        Laa:
            int r9 = r9 + (-4)
            r12.g(r9)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.f.v(ji.i, boolean):boolean");
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        this.f46558k = 0;
        this.f46560m = -9223372036854775807L;
        this.f46561n = 0L;
        this.f46563p = 0;
        this.f46567t = j12;
        g gVar = this.f46564q;
        if (!(gVar instanceof b) || ((b) gVar).a(j12)) {
            return;
        }
        this.f46566s = true;
        this.f46557j = this.f46554g;
    }

    @Override // ji.h
    public void b(j jVar) {
        this.f46555h = jVar;
        x f11 = jVar.f(0, 1);
        this.f46556i = f11;
        this.f46557j = f11;
        this.f46555h.s();
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        return v(iVar, true);
    }

    @Override // ji.h
    public int e(ji.i iVar, u uVar) {
        g();
        int t11 = t(iVar);
        if (t11 == -1 && (this.f46564q instanceof b)) {
            long i11 = i(this.f46561n);
            if (this.f46564q.i() != i11) {
                ((b) this.f46564q).d(i11);
                this.f46555h.p(this.f46564q);
            }
        }
        return t11;
    }

    public void j() {
        this.f46565r = true;
    }

    @Override // ji.h
    public void release() {
    }

    public f(int i11) {
        this(i11, -9223372036854775807L);
    }

    public f(int i11, long j11) {
        this.f46548a = i11;
        this.f46549b = j11;
        this.f46550c = new v(10);
        this.f46551d = new s.a();
        this.f46552e = new r();
        this.f46560m = -9223372036854775807L;
        this.f46553f = new ji.s();
        ji.g gVar = new ji.g();
        this.f46554g = gVar;
        this.f46557j = gVar;
    }
}