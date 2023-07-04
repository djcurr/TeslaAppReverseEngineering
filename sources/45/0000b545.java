package ti;

import ci.i;
import java.util.List;
import ti.i0;

/* loaded from: classes3.dex */
final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<ci.i> f52113a;

    /* renamed from: b  reason: collision with root package name */
    private final ji.x[] f52114b;

    public k0(List<ci.i> list) {
        this.f52113a = list;
        this.f52114b = new ji.x[list.size()];
    }

    public void a(long j11, ak.v vVar) {
        if (vVar.a() < 9) {
            return;
        }
        int m11 = vVar.m();
        int m12 = vVar.m();
        int C = vVar.C();
        if (m11 == 434 && m12 == 1195456820 && C == 3) {
            ji.b.b(j11, vVar, this.f52114b);
        }
    }

    public void b(ji.j jVar, i0.d dVar) {
        for (int i11 = 0; i11 < this.f52114b.length; i11++) {
            dVar.a();
            ji.x f11 = jVar.f(dVar.c(), 3);
            ci.i iVar = this.f52113a.get(i11);
            String str = iVar.f9205l;
            boolean z11 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            ak.a.b(z11, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            f11.d(new i.b().S(dVar.b()).e0(str).g0(iVar.f9197d).V(iVar.f9196c).F(iVar.K).T(iVar.f9207n).E());
            this.f52114b[i11] = f11;
        }
    }
}