package k20;

import java.util.ArrayDeque;
import java.util.Set;
import k20.g;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f34224a = new c();

    private c() {
    }

    private final boolean c(g gVar, m20.j jVar, m20.m mVar) {
        m20.o j11 = gVar.j();
        if (j11.W(jVar)) {
            return true;
        }
        if (j11.i0(jVar)) {
            return false;
        }
        if (gVar.o() && j11.V(jVar)) {
            return true;
        }
        return j11.u(j11.d(jVar), mVar);
    }

    private final boolean e(g gVar, m20.j jVar, m20.j jVar2) {
        m20.o j11 = gVar.j();
        if (f.f34254b) {
            if (!j11.e(jVar) && !j11.F(j11.d(jVar))) {
                gVar.m(jVar);
            }
            if (!j11.e(jVar2)) {
                gVar.m(jVar2);
            }
        }
        if (j11.i0(jVar2) || j11.A(jVar)) {
            return true;
        }
        if ((jVar instanceof m20.d) && j11.l((m20.d) jVar)) {
            return true;
        }
        c cVar = f34224a;
        if (cVar.a(gVar, jVar, g.b.C0636b.f34266a)) {
            return true;
        }
        if (j11.A(jVar2) || cVar.a(gVar, jVar2, g.b.d.f34268a) || j11.N(jVar)) {
            return false;
        }
        return cVar.b(gVar, jVar, j11.d(jVar2));
    }

    public final boolean a(g gVar, m20.j type, g.b supertypesPolicy) {
        String l02;
        kotlin.jvm.internal.s.g(gVar, "<this>");
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(supertypesPolicy, "supertypesPolicy");
        m20.o j11 = gVar.j();
        if (!((j11.N(type) && !j11.i0(type)) || j11.A(type))) {
            gVar.k();
            ArrayDeque<m20.j> h11 = gVar.h();
            kotlin.jvm.internal.s.e(h11);
            Set<m20.j> i11 = gVar.i();
            kotlin.jvm.internal.s.e(i11);
            h11.push(type);
            while (!h11.isEmpty()) {
                if (i11.size() <= 1000) {
                    m20.j current = h11.pop();
                    kotlin.jvm.internal.s.f(current, "current");
                    if (i11.add(current)) {
                        g.b bVar = j11.i0(current) ? g.b.c.f34267a : supertypesPolicy;
                        if (!(!kotlin.jvm.internal.s.c(bVar, g.b.c.f34267a))) {
                            bVar = null;
                        }
                        if (bVar == null) {
                            continue;
                        } else {
                            m20.o j12 = gVar.j();
                            for (m20.i iVar : j12.P(j12.d(current))) {
                                m20.j a11 = bVar.a(gVar, iVar);
                                if ((j11.N(a11) && !j11.i0(a11)) || j11.A(a11)) {
                                    gVar.e();
                                } else {
                                    h11.add(a11);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Too many supertypes for type: ");
                    sb2.append(type);
                    sb2.append(". Supertypes = ");
                    l02 = wz.e0.l0(i11, null, null, null, 0, null, null, 63, null);
                    sb2.append(l02);
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            gVar.e();
            return false;
        }
        return true;
    }

    public final boolean b(g context, m20.j start, m20.m end) {
        String l02;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(start, "start");
        kotlin.jvm.internal.s.g(end, "end");
        m20.o j11 = context.j();
        if (f34224a.c(context, start, end)) {
            return true;
        }
        context.k();
        ArrayDeque<m20.j> h11 = context.h();
        kotlin.jvm.internal.s.e(h11);
        Set<m20.j> i11 = context.i();
        kotlin.jvm.internal.s.e(i11);
        h11.push(start);
        while (!h11.isEmpty()) {
            if (i11.size() <= 1000) {
                m20.j current = h11.pop();
                kotlin.jvm.internal.s.f(current, "current");
                if (i11.add(current)) {
                    g.b bVar = j11.i0(current) ? g.b.c.f34267a : g.b.C0636b.f34266a;
                    if (!(!kotlin.jvm.internal.s.c(bVar, g.b.c.f34267a))) {
                        bVar = null;
                    }
                    if (bVar == null) {
                        continue;
                    } else {
                        m20.o j12 = context.j();
                        for (m20.i iVar : j12.P(j12.d(current))) {
                            m20.j a11 = bVar.a(context, iVar);
                            if (f34224a.c(context, a11, end)) {
                                context.e();
                                return true;
                            }
                            h11.add(a11);
                        }
                        continue;
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(start);
                sb2.append(". Supertypes = ");
                l02 = wz.e0.l0(i11, null, null, null, 0, null, null, 63, null);
                sb2.append(l02);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        context.e();
        return false;
    }

    public final boolean d(g context, m20.j subType, m20.j superType) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(subType, "subType");
        kotlin.jvm.internal.s.g(superType, "superType");
        return e(context, subType, superType);
    }
}