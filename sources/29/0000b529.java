package ti;

import android.util.SparseArray;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import ji.v;
import ti.i0;

/* loaded from: classes3.dex */
public final class a0 implements ji.h {

    /* renamed from: a */
    private final ak.g0 f51955a;

    /* renamed from: b */
    private final SparseArray<a> f51956b;

    /* renamed from: c */
    private final ak.v f51957c;

    /* renamed from: d */
    private final y f51958d;

    /* renamed from: e */
    private boolean f51959e;

    /* renamed from: f */
    private boolean f51960f;

    /* renamed from: g */
    private boolean f51961g;

    /* renamed from: h */
    private long f51962h;

    /* renamed from: i */
    private x f51963i;

    /* renamed from: j */
    private ji.j f51964j;

    /* renamed from: k */
    private boolean f51965k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final m f51966a;

        /* renamed from: b */
        private final ak.g0 f51967b;

        /* renamed from: c */
        private final ak.u f51968c = new ak.u(new byte[64]);

        /* renamed from: d */
        private boolean f51969d;

        /* renamed from: e */
        private boolean f51970e;

        /* renamed from: f */
        private boolean f51971f;

        /* renamed from: g */
        private int f51972g;

        /* renamed from: h */
        private long f51973h;

        public a(m mVar, ak.g0 g0Var) {
            this.f51966a = mVar;
            this.f51967b = g0Var;
        }

        private void b() {
            this.f51968c.r(8);
            this.f51969d = this.f51968c.g();
            this.f51970e = this.f51968c.g();
            this.f51968c.r(6);
            this.f51972g = this.f51968c.h(8);
        }

        private void c() {
            this.f51973h = 0L;
            if (this.f51969d) {
                this.f51968c.r(4);
                this.f51968c.r(1);
                this.f51968c.r(1);
                long h11 = (this.f51968c.h(3) << 30) | (this.f51968c.h(15) << 15) | this.f51968c.h(15);
                this.f51968c.r(1);
                if (!this.f51971f && this.f51970e) {
                    this.f51968c.r(4);
                    this.f51968c.r(1);
                    this.f51968c.r(1);
                    this.f51968c.r(1);
                    this.f51967b.b((this.f51968c.h(3) << 30) | (this.f51968c.h(15) << 15) | this.f51968c.h(15));
                    this.f51971f = true;
                }
                this.f51973h = this.f51967b.b(h11);
            }
        }

        public void a(ak.v vVar) {
            vVar.j(this.f51968c.f539a, 0, 3);
            this.f51968c.p(0);
            b();
            vVar.j(this.f51968c.f539a, 0, this.f51972g);
            this.f51968c.p(0);
            c();
            this.f51966a.f(this.f51973h, 4);
            this.f51966a.c(vVar);
            this.f51966a.d();
        }

        public void d() {
            this.f51971f = false;
            this.f51966a.a();
        }
    }

    static {
        z zVar = new ji.l() { // from class: ti.z
            @Override // ji.l
            public final ji.h[] b() {
                return a0.c();
            }
        };
    }

    public a0() {
        this(new ak.g0(0L));
    }

    public static /* synthetic */ ji.h[] c() {
        return f();
    }

    public static /* synthetic */ ji.h[] f() {
        return new ji.h[]{new a0()};
    }

    private void g(long j11) {
        if (this.f51965k) {
            return;
        }
        this.f51965k = true;
        if (this.f51958d.c() != -9223372036854775807L) {
            x xVar = new x(this.f51958d.d(), this.f51958d.c(), j11);
            this.f51963i = xVar;
            this.f51964j.p(xVar.b());
            return;
        }
        this.f51964j.p(new v.b(this.f51958d.c()));
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        if ((this.f51955a.e() == -9223372036854775807L) || (this.f51955a.c() != 0 && this.f51955a.c() != j12)) {
            this.f51955a.g();
            this.f51955a.h(j12);
        }
        x xVar = this.f51963i;
        if (xVar != null) {
            xVar.h(j12);
        }
        for (int i11 = 0; i11 < this.f51956b.size(); i11++) {
            this.f51956b.valueAt(i11).d();
        }
    }

    @Override // ji.h
    public void b(ji.j jVar) {
        this.f51964j = jVar;
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        byte[] bArr = new byte[14];
        iVar.n(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            iVar.g(bArr[13] & 7);
            iVar.n(bArr, 0, 3);
            return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
        }
        return false;
    }

    @Override // ji.h
    public int e(ji.i iVar, ji.u uVar) {
        ak.a.h(this.f51964j);
        long length = iVar.getLength();
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if ((i11 != 0) && !this.f51958d.e()) {
            return this.f51958d.g(iVar, uVar);
        }
        g(length);
        x xVar = this.f51963i;
        if (xVar != null && xVar.d()) {
            return this.f51963i.c(iVar, uVar);
        }
        iVar.d();
        long f11 = i11 != 0 ? length - iVar.f() : -1L;
        if ((f11 == -1 || f11 >= 4) && iVar.a(this.f51957c.d(), 0, 4, true)) {
            this.f51957c.O(0);
            int m11 = this.f51957c.m();
            if (m11 == 441) {
                return -1;
            }
            if (m11 == 442) {
                iVar.n(this.f51957c.d(), 0, 10);
                this.f51957c.O(9);
                iVar.k((this.f51957c.C() & 7) + 14);
                return 0;
            } else if (m11 == 443) {
                iVar.n(this.f51957c.d(), 0, 2);
                this.f51957c.O(0);
                iVar.k(this.f51957c.I() + 6);
                return 0;
            } else if (((m11 & (-256)) >> 8) != 1) {
                iVar.k(1);
                return 0;
            } else {
                int i12 = m11 & 255;
                a aVar = this.f51956b.get(i12);
                if (!this.f51959e) {
                    if (aVar == null) {
                        m mVar = null;
                        if (i12 == 189) {
                            mVar = new c();
                            this.f51960f = true;
                            this.f51962h = iVar.getPosition();
                        } else if ((i12 & 224) == 192) {
                            mVar = new t();
                            this.f51960f = true;
                            this.f51962h = iVar.getPosition();
                        } else if ((i12 & 240) == 224) {
                            mVar = new n();
                            this.f51961g = true;
                            this.f51962h = iVar.getPosition();
                        }
                        if (mVar != null) {
                            mVar.e(this.f51964j, new i0.d(i12, 256));
                            aVar = new a(mVar, this.f51955a);
                            this.f51956b.put(i12, aVar);
                        }
                    }
                    if (iVar.getPosition() > ((this.f51960f && this.f51961g) ? this.f51962h + FileAppender.DEFAULT_BUFFER_SIZE : FileSize.MB_COEFFICIENT)) {
                        this.f51959e = true;
                        this.f51964j.s();
                    }
                }
                iVar.n(this.f51957c.d(), 0, 2);
                this.f51957c.O(0);
                int I = this.f51957c.I() + 6;
                if (aVar == null) {
                    iVar.k(I);
                } else {
                    this.f51957c.K(I);
                    iVar.readFully(this.f51957c.d(), 0, I);
                    this.f51957c.O(6);
                    aVar.a(this.f51957c);
                    ak.v vVar = this.f51957c;
                    vVar.N(vVar.b());
                }
                return 0;
            }
        }
        return -1;
    }

    @Override // ji.h
    public void release() {
    }

    public a0(ak.g0 g0Var) {
        this.f51955a = g0Var;
        this.f51957c = new ak.v(4096);
        this.f51956b = new SparseArray<>();
        this.f51958d = new y();
    }
}