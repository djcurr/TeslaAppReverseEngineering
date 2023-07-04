package i2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l2.k;
import l2.l;
import l2.p;
import s1.f;
import s1.g;
import w3.c;
import wz.w;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0570a extends u implements h00.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0570a f29691a = new C0570a();

        C0570a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements h00.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f29692a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<p> list) {
        List i11;
        int k11;
        long t11;
        int k12;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() != 0 && list.size() != 1) {
            i11 = new ArrayList();
            p pVar = list.get(0);
            k12 = w.k(list);
            int i12 = 0;
            while (i12 < k12) {
                i12++;
                p pVar2 = list.get(i12);
                p pVar3 = pVar2;
                p pVar4 = pVar;
                i11.add(f.d(g.a(Math.abs(f.l(pVar4.f().g()) - f.l(pVar3.f().g())), Math.abs(f.m(pVar4.f().g()) - f.m(pVar3.f().g())))));
                pVar = pVar2;
            }
        } else {
            i11 = w.i();
        }
        if (i11.size() == 1) {
            t11 = ((f) wz.u.b0(i11)).t();
        } else if (!i11.isEmpty()) {
            Object b02 = wz.u.b0(i11);
            k11 = w.k(i11);
            if (1 <= k11) {
                int i13 = 1;
                while (true) {
                    int i14 = i13 + 1;
                    b02 = f.d(f.q(((f) b02).t(), ((f) i11.get(i13)).t()));
                    if (i13 == k11) {
                        break;
                    }
                    i13 = i14;
                }
            }
            t11 = ((f) b02).t();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        return f.f(t11) < f.e(t11);
    }

    public static final boolean b(p pVar) {
        s.g(pVar, "<this>");
        k h11 = pVar.h();
        l2.s sVar = l2.s.f36459a;
        return (l.a(h11, sVar.a()) == null && l.a(pVar.h(), sVar.t()) == null) ? false : true;
    }

    private static final boolean c(l2.b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(p node, c info) {
        s.g(node, "node");
        s.g(info, "info");
        k h11 = node.h();
        l2.s sVar = l2.s.f36459a;
        l2.b bVar = (l2.b) l.a(h11, sVar.a());
        if (bVar != null) {
            info.e0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (l.a(node.h(), sVar.t()) != null) {
            List<p> p11 = node.p();
            int size = p11.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                p pVar = p11.get(i11);
                if (pVar.h().e(l2.s.f36459a.u())) {
                    arrayList.add(pVar);
                }
                i11 = i12;
            }
        }
        if (!arrayList.isEmpty()) {
            boolean a11 = a(arrayList);
            info.e0(c.b.a(a11 ? 1 : arrayList.size(), a11 ? arrayList.size() : 1, false, 0));
        }
    }

    public static final void e(p node, c info) {
        s.g(node, "node");
        s.g(info, "info");
        k h11 = node.h();
        l2.s sVar = l2.s.f36459a;
        l2.c cVar = (l2.c) l.a(h11, sVar.b());
        if (cVar != null) {
            info.f0(g(cVar, node));
        }
        p n11 = node.n();
        if (n11 == null || l.a(n11.h(), sVar.t()) == null) {
            return;
        }
        l2.b bVar = (l2.b) l.a(n11.h(), sVar.a());
        if ((bVar == null || !c(bVar)) && node.h().e(sVar.u())) {
            ArrayList arrayList = new ArrayList();
            List<p> p11 = n11.p();
            int size = p11.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                p pVar = p11.get(i11);
                if (pVar.h().e(l2.s.f36459a.u())) {
                    arrayList.add(pVar);
                }
                i11 = i12;
            }
            if (!arrayList.isEmpty()) {
                boolean a11 = a(arrayList);
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    int i14 = i13 + 1;
                    p pVar2 = (p) arrayList.get(i13);
                    if (pVar2.i() == node.i()) {
                        c.C1263c b11 = c.C1263c.b(a11 ? 0 : i13, 1, a11 ? i13 : 0, 1, false, ((Boolean) pVar2.h().i(l2.s.f36459a.u(), C0570a.f29691a)).booleanValue());
                        if (b11 != null) {
                            info.f0(b11);
                        }
                    }
                    i13 = i14;
                }
            }
        }
    }

    private static final c.b f(l2.b bVar) {
        return c.b.a(bVar.b(), bVar.a(), false, 0);
    }

    private static final c.C1263c g(l2.c cVar, p pVar) {
        return c.C1263c.b(cVar.c(), cVar.d(), cVar.a(), cVar.b(), false, ((Boolean) pVar.h().i(l2.s.f36459a.u(), b.f29692a)).booleanValue());
    }
}