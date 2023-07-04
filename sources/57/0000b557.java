package ti;

import ci.i;
import ti.i0;

/* loaded from: classes3.dex */
public final class v implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private ci.i f52289a;

    /* renamed from: b  reason: collision with root package name */
    private ak.g0 f52290b;

    /* renamed from: c  reason: collision with root package name */
    private ji.x f52291c;

    public v(String str) {
        this.f52289a = new i.b().e0(str).E();
    }

    private void a() {
        ak.a.h(this.f52290b);
        ak.k0.j(this.f52291c);
    }

    @Override // ti.b0
    public void b(ak.g0 g0Var, ji.j jVar, i0.d dVar) {
        this.f52290b = g0Var;
        dVar.a();
        ji.x f11 = jVar.f(dVar.c(), 5);
        this.f52291c = f11;
        f11.d(this.f52289a);
    }

    @Override // ti.b0
    public void c(ak.v vVar) {
        a();
        long e11 = this.f52290b.e();
        if (e11 == -9223372036854775807L) {
            return;
        }
        ci.i iVar = this.f52289a;
        if (e11 != iVar.f9209p) {
            ci.i E = iVar.a().i0(e11).E();
            this.f52289a = E;
            this.f52291c.d(E);
        }
        int a11 = vVar.a();
        this.f52291c.e(vVar, a11);
        this.f52291c.f(this.f52290b.d(), 1, a11, 0, null);
    }
}