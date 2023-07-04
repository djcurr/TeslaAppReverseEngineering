package ti;

import ci.i;
import java.util.List;
import ti.i0;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<ci.i> f51996a;

    /* renamed from: b  reason: collision with root package name */
    private final ji.x[] f51997b;

    public d0(List<ci.i> list) {
        this.f51996a = list;
        this.f51997b = new ji.x[list.size()];
    }

    public void a(long j11, ak.v vVar) {
        ji.b.a(j11, vVar, this.f51997b);
    }

    public void b(ji.j jVar, i0.d dVar) {
        for (int i11 = 0; i11 < this.f51997b.length; i11++) {
            dVar.a();
            ji.x f11 = jVar.f(dVar.c(), 3);
            ci.i iVar = this.f51996a.get(i11);
            String str = iVar.f9205l;
            boolean z11 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            ak.a.b(z11, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = iVar.f9194a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            f11.d(new i.b().S(str2).e0(str).g0(iVar.f9197d).V(iVar.f9196c).F(iVar.K).T(iVar.f9207n).E());
            this.f51997b[i11] = f11;
        }
    }
}