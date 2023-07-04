package ti;

import ci.i;
import ei.b;
import ti.i0;

/* loaded from: classes3.dex */
public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ak.u f51977a;

    /* renamed from: b  reason: collision with root package name */
    private final ak.v f51978b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51979c;

    /* renamed from: d  reason: collision with root package name */
    private String f51980d;

    /* renamed from: e  reason: collision with root package name */
    private ji.x f51981e;

    /* renamed from: f  reason: collision with root package name */
    private int f51982f;

    /* renamed from: g  reason: collision with root package name */
    private int f51983g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f51984h;

    /* renamed from: i  reason: collision with root package name */
    private long f51985i;

    /* renamed from: j  reason: collision with root package name */
    private ci.i f51986j;

    /* renamed from: k  reason: collision with root package name */
    private int f51987k;

    /* renamed from: l  reason: collision with root package name */
    private long f51988l;

    public c() {
        this(null);
    }

    private boolean b(ak.v vVar, byte[] bArr, int i11) {
        int min = Math.min(vVar.a(), i11 - this.f51983g);
        vVar.j(bArr, this.f51983g, min);
        int i12 = this.f51983g + min;
        this.f51983g = i12;
        return i12 == i11;
    }

    private void g() {
        this.f51977a.p(0);
        b.C0488b e11 = ei.b.e(this.f51977a);
        ci.i iVar = this.f51986j;
        if (iVar == null || e11.f25120c != iVar.C || e11.f25119b != iVar.E || !ak.k0.c(e11.f25118a, iVar.f9205l)) {
            ci.i E = new i.b().S(this.f51980d).e0(e11.f25118a).H(e11.f25120c).f0(e11.f25119b).V(this.f51979c).E();
            this.f51986j = E;
            this.f51981e.d(E);
        }
        this.f51987k = e11.f25121d;
        this.f51985i = (e11.f25122e * 1000000) / this.f51986j.E;
    }

    private boolean h(ak.v vVar) {
        while (true) {
            if (vVar.a() <= 0) {
                return false;
            }
            if (!this.f51984h) {
                this.f51984h = vVar.C() == 11;
            } else {
                int C = vVar.C();
                if (C == 119) {
                    this.f51984h = false;
                    return true;
                }
                this.f51984h = C == 11;
            }
        }
    }

    @Override // ti.m
    public void a() {
        this.f51982f = 0;
        this.f51983g = 0;
        this.f51984h = false;
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        ak.a.h(this.f51981e);
        while (vVar.a() > 0) {
            int i11 = this.f51982f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int min = Math.min(vVar.a(), this.f51987k - this.f51983g);
                        this.f51981e.e(vVar, min);
                        int i12 = this.f51983g + min;
                        this.f51983g = i12;
                        int i13 = this.f51987k;
                        if (i12 == i13) {
                            this.f51981e.f(this.f51988l, 1, i13, 0, null);
                            this.f51988l += this.f51985i;
                            this.f51982f = 0;
                        }
                    }
                } else if (b(vVar, this.f51978b.d(), 128)) {
                    g();
                    this.f51978b.O(0);
                    this.f51981e.e(this.f51978b, 128);
                    this.f51982f = 2;
                }
            } else if (h(vVar)) {
                this.f51982f = 1;
                this.f51978b.d()[0] = 11;
                this.f51978b.d()[1] = 119;
                this.f51983g = 2;
            }
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f51980d = dVar.b();
        this.f51981e = jVar.f(dVar.c(), 1);
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f51988l = j11;
    }

    public c(String str) {
        ak.u uVar = new ak.u(new byte[128]);
        this.f51977a = uVar;
        this.f51978b = new ak.v(uVar.f539a);
        this.f51982f = 0;
        this.f51979c = str;
    }
}