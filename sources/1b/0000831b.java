package li;

import ak.k0;
import ak.v;
import ji.h;
import ji.i;
import ji.j;
import ji.l;
import ji.m;
import ji.n;
import ji.o;
import ji.p;
import ji.u;
import ji.v;
import ji.x;

/* loaded from: classes3.dex */
public final class d implements h {

    /* renamed from: a */
    private final byte[] f37188a;

    /* renamed from: b */
    private final v f37189b;

    /* renamed from: c */
    private final boolean f37190c;

    /* renamed from: d */
    private final m.a f37191d;

    /* renamed from: e */
    private j f37192e;

    /* renamed from: f */
    private x f37193f;

    /* renamed from: g */
    private int f37194g;

    /* renamed from: h */
    private wi.a f37195h;

    /* renamed from: i */
    private p f37196i;

    /* renamed from: j */
    private int f37197j;

    /* renamed from: k */
    private int f37198k;

    /* renamed from: l */
    private b f37199l;

    /* renamed from: m */
    private int f37200m;

    /* renamed from: n */
    private long f37201n;

    static {
        c cVar = new l() { // from class: li.c
            @Override // ji.l
            public final h[] b() {
                return d.c();
            }
        };
    }

    public d() {
        this(0);
    }

    public static /* synthetic */ h[] c() {
        return j();
    }

    private long f(v vVar, boolean z11) {
        boolean z12;
        ak.a.e(this.f37196i);
        int e11 = vVar.e();
        while (e11 <= vVar.f() - 16) {
            vVar.O(e11);
            if (m.d(vVar, this.f37196i, this.f37198k, this.f37191d)) {
                vVar.O(e11);
                return this.f37191d.f33743a;
            }
            e11++;
        }
        if (z11) {
            while (e11 <= vVar.f() - this.f37197j) {
                vVar.O(e11);
                try {
                    z12 = m.d(vVar, this.f37196i, this.f37198k, this.f37191d);
                } catch (IndexOutOfBoundsException unused) {
                    z12 = false;
                }
                if (vVar.e() <= vVar.f() ? z12 : false) {
                    vVar.O(e11);
                    return this.f37191d.f33743a;
                }
                e11++;
            }
            vVar.O(vVar.f());
            return -1L;
        }
        vVar.O(e11);
        return -1L;
    }

    private void g(i iVar) {
        this.f37198k = n.b(iVar);
        ((j) k0.j(this.f37192e)).p(h(iVar.getPosition(), iVar.getLength()));
        this.f37194g = 5;
    }

    private ji.v h(long j11, long j12) {
        ak.a.e(this.f37196i);
        p pVar = this.f37196i;
        if (pVar.f33757k != null) {
            return new o(pVar, j11);
        }
        if (j12 != -1 && pVar.f33756j > 0) {
            b bVar = new b(pVar, this.f37198k, j11, j12);
            this.f37199l = bVar;
            return bVar.b();
        }
        return new v.b(pVar.g());
    }

    private void i(i iVar) {
        byte[] bArr = this.f37188a;
        iVar.n(bArr, 0, bArr.length);
        iVar.d();
        this.f37194g = 2;
    }

    public static /* synthetic */ h[] j() {
        return new h[]{new d()};
    }

    private void k() {
        ((x) k0.j(this.f37193f)).f((this.f37201n * 1000000) / ((p) k0.j(this.f37196i)).f33751e, 1, this.f37200m, 0, null);
    }

    private int l(i iVar, u uVar) {
        boolean z11;
        ak.a.e(this.f37193f);
        ak.a.e(this.f37196i);
        b bVar = this.f37199l;
        if (bVar != null && bVar.d()) {
            return this.f37199l.c(iVar, uVar);
        }
        if (this.f37201n == -1) {
            this.f37201n = m.i(iVar, this.f37196i);
            return 0;
        }
        int f11 = this.f37189b.f();
        if (f11 < 32768) {
            int read = iVar.read(this.f37189b.d(), f11, 32768 - f11);
            z11 = read == -1;
            if (!z11) {
                this.f37189b.N(f11 + read);
            } else if (this.f37189b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z11 = false;
        }
        int e11 = this.f37189b.e();
        int i11 = this.f37200m;
        int i12 = this.f37197j;
        if (i11 < i12) {
            ak.v vVar = this.f37189b;
            vVar.P(Math.min(i12 - i11, vVar.a()));
        }
        long f12 = f(this.f37189b, z11);
        int e12 = this.f37189b.e() - e11;
        this.f37189b.O(e11);
        this.f37193f.e(this.f37189b, e12);
        this.f37200m += e12;
        if (f12 != -1) {
            k();
            this.f37200m = 0;
            this.f37201n = f12;
        }
        if (this.f37189b.a() < 16) {
            int a11 = this.f37189b.a();
            System.arraycopy(this.f37189b.d(), this.f37189b.e(), this.f37189b.d(), 0, a11);
            this.f37189b.O(0);
            this.f37189b.N(a11);
        }
        return 0;
    }

    private void m(i iVar) {
        this.f37195h = n.d(iVar, !this.f37190c);
        this.f37194g = 1;
    }

    private void n(i iVar) {
        n.a aVar = new n.a(this.f37196i);
        boolean z11 = false;
        while (!z11) {
            z11 = n.e(iVar, aVar);
            this.f37196i = (p) k0.j(aVar.f33744a);
        }
        ak.a.e(this.f37196i);
        this.f37197j = Math.max(this.f37196i.f33749c, 6);
        ((x) k0.j(this.f37193f)).d(this.f37196i.h(this.f37188a, this.f37195h));
        this.f37194g = 4;
    }

    private void o(i iVar) {
        n.j(iVar);
        this.f37194g = 3;
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        if (j11 == 0) {
            this.f37194g = 0;
        } else {
            b bVar = this.f37199l;
            if (bVar != null) {
                bVar.h(j12);
            }
        }
        this.f37201n = j12 != 0 ? -1L : 0L;
        this.f37200m = 0;
        this.f37189b.K(0);
    }

    @Override // ji.h
    public void b(j jVar) {
        this.f37192e = jVar;
        this.f37193f = jVar.f(0, 1);
        jVar.s();
    }

    @Override // ji.h
    public boolean d(i iVar) {
        n.c(iVar, false);
        return n.a(iVar);
    }

    @Override // ji.h
    public int e(i iVar, u uVar) {
        int i11 = this.f37194g;
        if (i11 == 0) {
            m(iVar);
            return 0;
        } else if (i11 == 1) {
            i(iVar);
            return 0;
        } else if (i11 == 2) {
            o(iVar);
            return 0;
        } else if (i11 == 3) {
            n(iVar);
            return 0;
        } else if (i11 == 4) {
            g(iVar);
            return 0;
        } else if (i11 == 5) {
            return l(iVar, uVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // ji.h
    public void release() {
    }

    public d(int i11) {
        this.f37188a = new byte[42];
        this.f37189b = new ak.v(new byte[32768], 0);
        this.f37190c = (i11 & 1) != 0;
        this.f37191d = new m.a();
        this.f37194g = 0;
    }
}