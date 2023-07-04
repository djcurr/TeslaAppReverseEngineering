package ti;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import ji.v;
import ti.i0;

/* loaded from: classes3.dex */
public final class h implements ji.h {

    /* renamed from: a */
    private final int f52029a;

    /* renamed from: b */
    private final i f52030b;

    /* renamed from: c */
    private final ak.v f52031c;

    /* renamed from: d */
    private final ak.v f52032d;

    /* renamed from: e */
    private final ak.u f52033e;

    /* renamed from: f */
    private ji.j f52034f;

    /* renamed from: g */
    private long f52035g;

    /* renamed from: h */
    private long f52036h;

    /* renamed from: i */
    private int f52037i;

    /* renamed from: j */
    private boolean f52038j;

    /* renamed from: k */
    private boolean f52039k;

    /* renamed from: l */
    private boolean f52040l;

    static {
        g gVar = new ji.l() { // from class: ti.g
            @Override // ji.l
            public final ji.h[] b() {
                return h.c();
            }
        };
    }

    public h() {
        this(0);
    }

    public static /* synthetic */ ji.h[] c() {
        return i();
    }

    private void f(ji.i iVar) {
        int h11;
        if (this.f52038j) {
            return;
        }
        this.f52037i = -1;
        iVar.d();
        long j11 = 0;
        if (iVar.getPosition() == 0) {
            k(iVar);
        }
        int i11 = 0;
        int i12 = 0;
        do {
            try {
                if (!iVar.a(this.f52032d.d(), 0, 2, true)) {
                    break;
                }
                this.f52032d.O(0);
                if (!i.m(this.f52032d.I())) {
                    break;
                } else if (!iVar.a(this.f52032d.d(), 0, 4, true)) {
                    break;
                } else {
                    this.f52033e.p(14);
                    h11 = this.f52033e.h(13);
                    if (h11 <= 6) {
                        this.f52038j = true;
                        throw new ParserException("Malformed ADTS stream");
                    }
                    j11 += h11;
                    i12++;
                    if (i12 == 1000) {
                        break;
                    }
                }
            } catch (EOFException unused) {
            }
        } while (iVar.l(h11 - 6, true));
        i11 = i12;
        iVar.d();
        if (i11 > 0) {
            this.f52037i = (int) (j11 / i11);
        } else {
            this.f52037i = -1;
        }
        this.f52038j = true;
    }

    private static int g(int i11, long j11) {
        return (int) (((i11 * 8) * 1000000) / j11);
    }

    private ji.v h(long j11) {
        return new ji.d(j11, this.f52036h, g(this.f52037i, this.f52030b.k()), this.f52037i);
    }

    public static /* synthetic */ ji.h[] i() {
        return new ji.h[]{new h()};
    }

    private void j(long j11, boolean z11, boolean z12) {
        if (this.f52040l) {
            return;
        }
        boolean z13 = z11 && this.f52037i > 0;
        if (z13 && this.f52030b.k() == -9223372036854775807L && !z12) {
            return;
        }
        if (z13 && this.f52030b.k() != -9223372036854775807L) {
            this.f52034f.p(h(j11));
        } else {
            this.f52034f.p(new v.b(-9223372036854775807L));
        }
        this.f52040l = true;
    }

    private int k(ji.i iVar) {
        int i11 = 0;
        while (true) {
            iVar.n(this.f52032d.d(), 0, 10);
            this.f52032d.O(0);
            if (this.f52032d.F() != 4801587) {
                break;
            }
            this.f52032d.P(3);
            int B = this.f52032d.B();
            i11 += B + 10;
            iVar.g(B);
        }
        iVar.d();
        iVar.g(i11);
        if (this.f52036h == -1) {
            this.f52036h = i11;
        }
        return i11;
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        this.f52039k = false;
        this.f52030b.a();
        this.f52035g = j12;
    }

    @Override // ji.h
    public void b(ji.j jVar) {
        this.f52034f = jVar;
        this.f52030b.e(jVar, new i0.d(0, 1));
        jVar.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0023, code lost:
        r9.d();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
        if ((r3 - r0) < 8192) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
        return false;
     */
    @Override // ji.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(ji.i r9) {
        /*
            r8 = this;
            int r0 = r8.k(r9)
            r1 = 0
            r3 = r0
        L6:
            r2 = r1
            r4 = r2
        L8:
            ak.v r5 = r8.f52032d
            byte[] r5 = r5.d()
            r6 = 2
            r9.n(r5, r1, r6)
            ak.v r5 = r8.f52032d
            r5.O(r1)
            ak.v r5 = r8.f52032d
            int r5 = r5.I()
            boolean r5 = ti.i.m(r5)
            if (r5 != 0) goto L33
            r9.d()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L2f
            return r1
        L2f:
            r9.g(r3)
            goto L6
        L33:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L3d
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L3d
            return r5
        L3d:
            ak.v r5 = r8.f52032d
            byte[] r5 = r5.d()
            r9.n(r5, r1, r6)
            ak.u r5 = r8.f52033e
            r6 = 14
            r5.p(r6)
            ak.u r5 = r8.f52033e
            r6 = 13
            int r5 = r5.h(r6)
            r6 = 6
            if (r5 > r6) goto L59
            return r1
        L59:
            int r6 = r5 + (-6)
            r9.g(r6)
            int r4 = r4 + r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.h.d(ji.i):boolean");
    }

    @Override // ji.h
    public int e(ji.i iVar, ji.u uVar) {
        ak.a.h(this.f52034f);
        long length = iVar.getLength();
        boolean z11 = ((this.f52029a & 1) == 0 || length == -1) ? false : true;
        if (z11) {
            f(iVar);
        }
        int read = iVar.read(this.f52031c.d(), 0, 2048);
        boolean z12 = read == -1;
        j(length, z11, z12);
        if (z12) {
            return -1;
        }
        this.f52031c.O(0);
        this.f52031c.N(read);
        if (!this.f52039k) {
            this.f52030b.f(this.f52035g, 4);
            this.f52039k = true;
        }
        this.f52030b.c(this.f52031c);
        return 0;
    }

    @Override // ji.h
    public void release() {
    }

    public h(int i11) {
        this.f52029a = i11;
        this.f52030b = new i(true);
        this.f52031c = new ak.v(2048);
        this.f52037i = -1;
        this.f52036h = -1L;
        ak.v vVar = new ak.v(10);
        this.f52032d = vVar;
        this.f52033e = new ak.u(vVar.d());
    }
}