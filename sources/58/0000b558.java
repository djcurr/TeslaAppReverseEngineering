package ti;

import ti.i0;

/* loaded from: classes3.dex */
public final class w implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final m f52292a;

    /* renamed from: b  reason: collision with root package name */
    private final ak.u f52293b = new ak.u(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f52294c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f52295d;

    /* renamed from: e  reason: collision with root package name */
    private ak.g0 f52296e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f52297f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f52298g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f52299h;

    /* renamed from: i  reason: collision with root package name */
    private int f52300i;

    /* renamed from: j  reason: collision with root package name */
    private int f52301j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f52302k;

    /* renamed from: l  reason: collision with root package name */
    private long f52303l;

    public w(m mVar) {
        this.f52292a = mVar;
    }

    private boolean d(ak.v vVar, byte[] bArr, int i11) {
        int min = Math.min(vVar.a(), i11 - this.f52295d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            vVar.P(min);
        } else {
            vVar.j(bArr, this.f52295d, min);
        }
        int i12 = this.f52295d + min;
        this.f52295d = i12;
        return i12 == i11;
    }

    private boolean e() {
        this.f52293b.p(0);
        int h11 = this.f52293b.h(24);
        if (h11 != 1) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unexpected start code prefix: ");
            sb2.append(h11);
            ak.o.h("PesReader", sb2.toString());
            this.f52301j = -1;
            return false;
        }
        this.f52293b.r(8);
        int h12 = this.f52293b.h(16);
        this.f52293b.r(5);
        this.f52302k = this.f52293b.g();
        this.f52293b.r(2);
        this.f52297f = this.f52293b.g();
        this.f52298g = this.f52293b.g();
        this.f52293b.r(6);
        int h13 = this.f52293b.h(8);
        this.f52300i = h13;
        if (h12 == 0) {
            this.f52301j = -1;
        } else {
            int i11 = ((h12 + 6) - 9) - h13;
            this.f52301j = i11;
            if (i11 < 0) {
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("Found negative packet payload size: ");
                sb3.append(i11);
                ak.o.h("PesReader", sb3.toString());
                this.f52301j = -1;
            }
        }
        return true;
    }

    private void f() {
        this.f52293b.p(0);
        this.f52303l = -9223372036854775807L;
        if (this.f52297f) {
            this.f52293b.r(4);
            this.f52293b.r(1);
            this.f52293b.r(1);
            long h11 = (this.f52293b.h(3) << 30) | (this.f52293b.h(15) << 15) | this.f52293b.h(15);
            this.f52293b.r(1);
            if (!this.f52299h && this.f52298g) {
                this.f52293b.r(4);
                this.f52293b.r(1);
                this.f52293b.r(1);
                this.f52293b.r(1);
                this.f52296e.b((this.f52293b.h(3) << 30) | (this.f52293b.h(15) << 15) | this.f52293b.h(15));
                this.f52299h = true;
            }
            this.f52303l = this.f52296e.b(h11);
        }
    }

    private void g(int i11) {
        this.f52294c = i11;
        this.f52295d = 0;
    }

    @Override // ti.i0
    public final void a() {
        this.f52294c = 0;
        this.f52295d = 0;
        this.f52299h = false;
        this.f52292a.a();
    }

    @Override // ti.i0
    public void b(ak.g0 g0Var, ji.j jVar, i0.d dVar) {
        this.f52296e = g0Var;
        this.f52292a.e(jVar, dVar);
    }

    @Override // ti.i0
    public final void c(ak.v vVar, int i11) {
        ak.a.h(this.f52296e);
        if ((i11 & 1) != 0) {
            int i12 = this.f52294c;
            if (i12 != 0 && i12 != 1) {
                if (i12 == 2) {
                    ak.o.h("PesReader", "Unexpected start indicator reading extended header");
                } else if (i12 == 3) {
                    int i13 = this.f52301j;
                    if (i13 != -1) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i13);
                        sb2.append(" more bytes");
                        ak.o.h("PesReader", sb2.toString());
                    }
                    this.f52292a.d();
                } else {
                    throw new IllegalStateException();
                }
            }
            g(1);
        }
        while (vVar.a() > 0) {
            int i14 = this.f52294c;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        if (d(vVar, this.f52293b.f539a, Math.min(10, this.f52300i)) && d(vVar, null, this.f52300i)) {
                            f();
                            i11 |= this.f52302k ? 4 : 0;
                            this.f52292a.f(this.f52303l, i11);
                            g(3);
                        }
                    } else if (i14 == 3) {
                        int a11 = vVar.a();
                        int i15 = this.f52301j;
                        int i16 = i15 != -1 ? a11 - i15 : 0;
                        if (i16 > 0) {
                            a11 -= i16;
                            vVar.N(vVar.e() + a11);
                        }
                        this.f52292a.c(vVar);
                        int i17 = this.f52301j;
                        if (i17 != -1) {
                            int i18 = i17 - a11;
                            this.f52301j = i18;
                            if (i18 == 0) {
                                this.f52292a.d();
                                g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(vVar, this.f52293b.f539a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                vVar.P(vVar.a());
            }
        }
    }
}