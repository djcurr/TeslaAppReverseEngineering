package p4;

import android.os.Bundle;
import java.util.List;
import p4.b0;

@b0.b("navigation")
/* loaded from: classes.dex */
public class t extends b0<r> {

    /* renamed from: c  reason: collision with root package name */
    private final c0 f46150c;

    public t(c0 navigatorProvider) {
        kotlin.jvm.internal.s.g(navigatorProvider, "navigatorProvider");
        this.f46150c = navigatorProvider;
    }

    private final void m(i iVar, w wVar, b0.a aVar) {
        p A;
        List<i> d11;
        r rVar = (r) iVar.f();
        Bundle d12 = iVar.d();
        int F = rVar.F();
        String G = rVar.G();
        if (!((F == 0 && G == null) ? false : true)) {
            throw new IllegalStateException(kotlin.jvm.internal.s.p("no start destination defined via app:startDestination for ", rVar.k()).toString());
        }
        if (G != null) {
            A = rVar.C(G, false);
        } else {
            A = rVar.A(F, false);
        }
        if (A != null) {
            b0 e11 = this.f46150c.e(A.n());
            d11 = wz.v.d(b().a(A, A.f(d12)));
            e11.e(d11, wVar, aVar);
            return;
        }
        String E = rVar.E();
        throw new IllegalArgumentException("navigation destination " + E + " is not a direct child of this NavGraph");
    }

    @Override // p4.b0
    public void e(List<i> entries, w wVar, b0.a aVar) {
        kotlin.jvm.internal.s.g(entries, "entries");
        for (i iVar : entries) {
            m(iVar, wVar, aVar);
        }
    }

    @Override // p4.b0
    /* renamed from: l */
    public r a() {
        return new r(this);
    }
}