package q4;

import h00.q;
import java.util.List;
import p4.n;
import p4.s;
import q4.d;
import vz.b0;
import wz.w;

/* loaded from: classes.dex */
public final class h {
    public static final void a(s sVar, String route, List<p4.d> arguments, List<n> deepLinks, q<? super p4.i, ? super c1.i, ? super Integer, b0> content) {
        kotlin.jvm.internal.s.g(sVar, "<this>");
        kotlin.jvm.internal.s.g(route, "route");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        kotlin.jvm.internal.s.g(deepLinks, "deepLinks");
        kotlin.jvm.internal.s.g(content, "content");
        d.b bVar = new d.b((d) sVar.g().d(d.class), content);
        bVar.v(route);
        for (p4.d dVar : arguments) {
            bVar.b(dVar.a(), dVar.b());
        }
        for (n nVar : deepLinks) {
            bVar.e(nVar);
        }
        sVar.e(bVar);
    }

    public static /* synthetic */ void b(s sVar, String str, List list, List list2, q qVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = w.i();
        }
        if ((i11 & 4) != 0) {
            list2 = w.i();
        }
        a(sVar, str, list, list2, qVar);
    }
}