package ti;

import ti.i0;

/* loaded from: classes3.dex */
public final class k implements m {

    /* renamed from: b  reason: collision with root package name */
    private final String f52103b;

    /* renamed from: c  reason: collision with root package name */
    private String f52104c;

    /* renamed from: d  reason: collision with root package name */
    private ji.x f52105d;

    /* renamed from: f  reason: collision with root package name */
    private int f52107f;

    /* renamed from: g  reason: collision with root package name */
    private int f52108g;

    /* renamed from: h  reason: collision with root package name */
    private long f52109h;

    /* renamed from: i  reason: collision with root package name */
    private ci.i f52110i;

    /* renamed from: j  reason: collision with root package name */
    private int f52111j;

    /* renamed from: k  reason: collision with root package name */
    private long f52112k;

    /* renamed from: a  reason: collision with root package name */
    private final ak.v f52102a = new ak.v(new byte[18]);

    /* renamed from: e  reason: collision with root package name */
    private int f52106e = 0;

    public k(String str) {
        this.f52103b = str;
    }

    private boolean b(ak.v vVar, byte[] bArr, int i11) {
        int min = Math.min(vVar.a(), i11 - this.f52107f);
        vVar.j(bArr, this.f52107f, min);
        int i12 = this.f52107f + min;
        this.f52107f = i12;
        return i12 == i11;
    }

    private void g() {
        byte[] d11 = this.f52102a.d();
        if (this.f52110i == null) {
            ci.i g11 = ei.r.g(d11, this.f52104c, this.f52103b, null);
            this.f52110i = g11;
            this.f52105d.d(g11);
        }
        this.f52111j = ei.r.a(d11);
        this.f52109h = (int) ((ei.r.f(d11) * 1000000) / this.f52110i.E);
    }

    private boolean h(ak.v vVar) {
        while (vVar.a() > 0) {
            int i11 = this.f52108g << 8;
            this.f52108g = i11;
            int C = i11 | vVar.C();
            this.f52108g = C;
            if (ei.r.d(C)) {
                byte[] d11 = this.f52102a.d();
                int i12 = this.f52108g;
                d11[0] = (byte) ((i12 >> 24) & 255);
                d11[1] = (byte) ((i12 >> 16) & 255);
                d11[2] = (byte) ((i12 >> 8) & 255);
                d11[3] = (byte) (i12 & 255);
                this.f52107f = 4;
                this.f52108g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // ti.m
    public void a() {
        this.f52106e = 0;
        this.f52107f = 0;
        this.f52108g = 0;
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        ak.a.h(this.f52105d);
        while (vVar.a() > 0) {
            int i11 = this.f52106e;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int min = Math.min(vVar.a(), this.f52111j - this.f52107f);
                        this.f52105d.e(vVar, min);
                        int i12 = this.f52107f + min;
                        this.f52107f = i12;
                        int i13 = this.f52111j;
                        if (i12 == i13) {
                            this.f52105d.f(this.f52112k, 1, i13, 0, null);
                            this.f52112k += this.f52109h;
                            this.f52106e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (b(vVar, this.f52102a.d(), 18)) {
                    g();
                    this.f52102a.O(0);
                    this.f52105d.e(this.f52102a, 18);
                    this.f52106e = 2;
                }
            } else if (h(vVar)) {
                this.f52106e = 1;
            }
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f52104c = dVar.b();
        this.f52105d = jVar.f(dVar.c(), 1);
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f52112k = j11;
    }
}