package ti;

import ci.i;
import ei.c;
import ti.i0;

/* loaded from: classes3.dex */
public final class f implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ak.u f52005a;

    /* renamed from: b  reason: collision with root package name */
    private final ak.v f52006b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52007c;

    /* renamed from: d  reason: collision with root package name */
    private String f52008d;

    /* renamed from: e  reason: collision with root package name */
    private ji.x f52009e;

    /* renamed from: f  reason: collision with root package name */
    private int f52010f;

    /* renamed from: g  reason: collision with root package name */
    private int f52011g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f52012h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f52013i;

    /* renamed from: j  reason: collision with root package name */
    private long f52014j;

    /* renamed from: k  reason: collision with root package name */
    private ci.i f52015k;

    /* renamed from: l  reason: collision with root package name */
    private int f52016l;

    /* renamed from: m  reason: collision with root package name */
    private long f52017m;

    public f() {
        this(null);
    }

    private boolean b(ak.v vVar, byte[] bArr, int i11) {
        int min = Math.min(vVar.a(), i11 - this.f52011g);
        vVar.j(bArr, this.f52011g, min);
        int i12 = this.f52011g + min;
        this.f52011g = i12;
        return i12 == i11;
    }

    private void g() {
        this.f52005a.p(0);
        c.b d11 = ei.c.d(this.f52005a);
        ci.i iVar = this.f52015k;
        if (iVar == null || d11.f25125b != iVar.C || d11.f25124a != iVar.E || !"audio/ac4".equals(iVar.f9205l)) {
            ci.i E = new i.b().S(this.f52008d).e0("audio/ac4").H(d11.f25125b).f0(d11.f25124a).V(this.f52007c).E();
            this.f52015k = E;
            this.f52009e.d(E);
        }
        this.f52016l = d11.f25126c;
        this.f52014j = (d11.f25127d * 1000000) / this.f52015k.E;
    }

    private boolean h(ak.v vVar) {
        int C;
        while (true) {
            if (vVar.a() <= 0) {
                return false;
            }
            if (!this.f52012h) {
                this.f52012h = vVar.C() == 172;
            } else {
                C = vVar.C();
                this.f52012h = C == 172;
                if (C == 64 || C == 65) {
                    break;
                }
            }
        }
        this.f52013i = C == 65;
        return true;
    }

    @Override // ti.m
    public void a() {
        this.f52010f = 0;
        this.f52011g = 0;
        this.f52012h = false;
        this.f52013i = false;
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        ak.a.h(this.f52009e);
        while (vVar.a() > 0) {
            int i11 = this.f52010f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int min = Math.min(vVar.a(), this.f52016l - this.f52011g);
                        this.f52009e.e(vVar, min);
                        int i12 = this.f52011g + min;
                        this.f52011g = i12;
                        int i13 = this.f52016l;
                        if (i12 == i13) {
                            this.f52009e.f(this.f52017m, 1, i13, 0, null);
                            this.f52017m += this.f52014j;
                            this.f52010f = 0;
                        }
                    }
                } else if (b(vVar, this.f52006b.d(), 16)) {
                    g();
                    this.f52006b.O(0);
                    this.f52009e.e(this.f52006b, 16);
                    this.f52010f = 2;
                }
            } else if (h(vVar)) {
                this.f52010f = 1;
                this.f52006b.d()[0] = -84;
                this.f52006b.d()[1] = (byte) (this.f52013i ? 65 : 64);
                this.f52011g = 2;
            }
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f52008d = dVar.b();
        this.f52009e = jVar.f(dVar.c(), 1);
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f52017m = j11;
    }

    public f(String str) {
        ak.u uVar = new ak.u(new byte[16]);
        this.f52005a = uVar;
        this.f52006b = new ak.v(uVar.f539a);
        this.f52010f = 0;
        this.f52011g = 0;
        this.f52012h = false;
        this.f52013i = false;
        this.f52007c = str;
    }
}