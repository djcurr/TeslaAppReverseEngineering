package ti;

import ti.i0;

/* loaded from: classes3.dex */
public final class c0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f51989a;

    /* renamed from: b  reason: collision with root package name */
    private final ak.v f51990b = new ak.v(32);

    /* renamed from: c  reason: collision with root package name */
    private int f51991c;

    /* renamed from: d  reason: collision with root package name */
    private int f51992d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f51993e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f51994f;

    public c0(b0 b0Var) {
        this.f51989a = b0Var;
    }

    @Override // ti.i0
    public void a() {
        this.f51994f = true;
    }

    @Override // ti.i0
    public void b(ak.g0 g0Var, ji.j jVar, i0.d dVar) {
        this.f51989a.b(g0Var, jVar, dVar);
        this.f51994f = true;
    }

    @Override // ti.i0
    public void c(ak.v vVar, int i11) {
        boolean z11 = (i11 & 1) != 0;
        int e11 = z11 ? vVar.e() + vVar.C() : -1;
        if (this.f51994f) {
            if (!z11) {
                return;
            }
            this.f51994f = false;
            vVar.O(e11);
            this.f51992d = 0;
        }
        while (vVar.a() > 0) {
            int i12 = this.f51992d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int C = vVar.C();
                    vVar.O(vVar.e() - 1);
                    if (C == 255) {
                        this.f51994f = true;
                        return;
                    }
                }
                int min = Math.min(vVar.a(), 3 - this.f51992d);
                vVar.j(this.f51990b.d(), this.f51992d, min);
                int i13 = this.f51992d + min;
                this.f51992d = i13;
                if (i13 == 3) {
                    this.f51990b.O(0);
                    this.f51990b.N(3);
                    this.f51990b.P(1);
                    int C2 = this.f51990b.C();
                    int C3 = this.f51990b.C();
                    this.f51993e = (C2 & 128) != 0;
                    this.f51991c = (((C2 & 15) << 8) | C3) + 3;
                    int b11 = this.f51990b.b();
                    int i14 = this.f51991c;
                    if (b11 < i14) {
                        this.f51990b.c(Math.min(4098, Math.max(i14, this.f51990b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(vVar.a(), this.f51991c - this.f51992d);
                vVar.j(this.f51990b.d(), this.f51992d, min2);
                int i15 = this.f51992d + min2;
                this.f51992d = i15;
                int i16 = this.f51991c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f51993e) {
                        if (ak.k0.u(this.f51990b.d(), 0, this.f51991c, -1) != 0) {
                            this.f51994f = true;
                            return;
                        }
                        this.f51990b.N(this.f51991c - 4);
                    } else {
                        this.f51990b.N(i16);
                    }
                    this.f51990b.O(0);
                    this.f51989a.c(this.f51990b);
                    this.f51992d = 0;
                }
            }
        }
    }
}