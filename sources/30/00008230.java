package l2;

import java.util.ArrayList;
import java.util.List;
import l2.f;
import wz.a0;
import wz.e0;

/* loaded from: classes.dex */
public final class w {
    public static final h2.k a(h2.k kVar, h00.l<? super h2.k, Boolean> predicate) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(predicate, "predicate");
        if (predicate.invoke(kVar).booleanValue()) {
            return kVar;
        }
        List<h2.k> J = kVar.J();
        int i11 = 0;
        int size = J.size();
        while (i11 < size) {
            int i12 = i11 + 1;
            h2.k a11 = a(J.get(i11), predicate);
            if (a11 != null) {
                return a11;
            }
            i11 = i12;
        }
        return null;
    }

    public static final List<x> b(h2.k kVar, List<x> list) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(list, "list");
        if (kVar.u0()) {
            ArrayList arrayList = new ArrayList();
            List<h2.k> J = kVar.J();
            int size = J.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                h2.k kVar2 = J.get(i12);
                if (kVar2.u0()) {
                    arrayList.add(new f(kVar, kVar2));
                }
                i12 = i13;
            }
            List<f> d11 = d(arrayList);
            ArrayList arrayList2 = new ArrayList(d11.size());
            int size2 = d11.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList2.add(d11.get(i14).c());
            }
            int size3 = arrayList2.size();
            while (i11 < size3) {
                int i15 = i11 + 1;
                h2.k kVar3 = (h2.k) arrayList2.get(i11);
                x j11 = q.j(kVar3);
                if (j11 != null) {
                    list.add(j11);
                } else {
                    b(kVar3, list);
                }
                i11 = i15;
            }
            return list;
        }
        return list;
    }

    public static /* synthetic */ List c(h2.k kVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        return b(kVar, list);
    }

    private static final List<f> d(List<f> list) {
        List<f> Q0;
        List<f> Q02;
        try {
            f.f36395e.a(f.b.Stripe);
            Q02 = e0.Q0(list);
            a0.x(Q02);
            return Q02;
        } catch (IllegalArgumentException unused) {
            f.f36395e.a(f.b.Location);
            Q0 = e0.Q0(list);
            a0.x(Q0);
            return Q0;
        }
    }

    public static final h2.o e(h2.k kVar) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        x i11 = q.i(kVar);
        if (i11 == null) {
            x j11 = q.j(kVar);
            return j11 == null ? kVar.P() : j11;
        }
        return i11;
    }
}