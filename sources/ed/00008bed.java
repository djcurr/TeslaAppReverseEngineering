package net.time4j.i18n;

import java.util.Locale;
import java.util.Set;
import net.time4j.engine.p;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.g0;
import net.time4j.history.j;

/* loaded from: classes5.dex */
public class b implements r {
    private static net.time4j.history.d e(Locale locale, net.time4j.engine.d dVar) {
        net.time4j.engine.c<String> cVar = net.time4j.format.a.f40994b;
        if (((String) dVar.b(cVar, "iso8601")).equals("julian")) {
            return net.time4j.history.d.f41365t;
        }
        net.time4j.engine.c<net.time4j.history.d> cVar2 = l30.a.f36567a;
        if (dVar.c(cVar2)) {
            return (net.time4j.history.d) dVar.a(cVar2);
        }
        if (((String) dVar.b(cVar, "iso8601")).equals("historic")) {
            net.time4j.engine.c<String> cVar3 = net.time4j.format.a.f41012t;
            if (dVar.c(cVar3)) {
                return net.time4j.history.d.k((String) dVar.a(cVar3));
            }
        }
        return net.time4j.history.d.D(locale);
    }

    @Override // net.time4j.engine.r
    public q<?> a(q<?> qVar, Locale locale, net.time4j.engine.d dVar) {
        return f(qVar, e(locale, dVar), dVar);
    }

    @Override // net.time4j.engine.r
    public Set<p<?>> b(Locale locale, net.time4j.engine.d dVar) {
        return e(locale, dVar).o();
    }

    @Override // net.time4j.engine.r
    public boolean c(p<?> pVar) {
        return pVar instanceof l30.c;
    }

    @Override // net.time4j.engine.r
    public boolean d(Class<?> cls) {
        return cls == g0.class;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [net.time4j.engine.q<?>, net.time4j.engine.q] */
    /* JADX WARN: Type inference failed for: r9v2, types: [net.time4j.engine.q<?>, net.time4j.engine.q] */
    public q<?> f(q<?> qVar, net.time4j.history.d dVar, net.time4j.engine.d dVar2) {
        j jVar;
        j jVar2;
        if (qVar.q(dVar.j())) {
            jVar2 = (j) qVar.l(dVar.j());
        } else if (((net.time4j.format.g) dVar2.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART)).isLax()) {
            jVar2 = j.AD;
        } else {
            jVar = null;
            if (jVar == null && qVar.q(dVar.M())) {
                int h11 = qVar.h(dVar.M());
                if (qVar.q(dVar.C()) && qVar.q(dVar.g())) {
                    g0 d11 = dVar.d(net.time4j.history.h.g(jVar, h11, qVar.h(dVar.C()), qVar.h(dVar.g()), (net.time4j.history.p) dVar2.b(net.time4j.history.d.f41363p, net.time4j.history.p.DUAL_DATING), dVar.w()));
                    qVar.z(dVar.j(), null);
                    qVar.z(dVar.M(), null);
                    qVar.z(dVar.C(), null);
                    qVar.z(dVar.g(), null);
                    return qVar.z(g0.f41293o, d11);
                } else if (qVar.q(dVar.h())) {
                    int h12 = qVar.h(dVar.h());
                    p<Integer> pVar = l30.c.f36571e;
                    if (qVar.q(pVar)) {
                        h11 = qVar.h(pVar);
                    }
                    return qVar.z(g0.f41293o, (g0) dVar.d(dVar.n(jVar, h11)).x(dVar.h(), h12));
                } else {
                    return qVar;
                }
            }
        }
        jVar = jVar2;
        return jVar == null ? qVar : qVar;
    }
}