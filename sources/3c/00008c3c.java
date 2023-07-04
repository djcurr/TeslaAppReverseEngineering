package net.time4j.tz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.engine.z;
import net.time4j.tz.m;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* loaded from: classes5.dex */
public abstract class l implements m, Serializable {
    static {
        System.getProperty("line.separator");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long f(int i11) {
        return (System.currentTimeMillis() / 1000) + ((long) (i11 * 3.1556952E7d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m g(p pVar, List<q> list, List<d> list2, boolean z11, boolean z12) {
        ArrayList arrayList;
        List<d> list3;
        if (z11) {
            ArrayList arrayList2 = new ArrayList(list);
            list3 = new ArrayList<>(list2);
            Collections.sort(arrayList2);
            Collections.sort(list3, k.INSTANCE);
            arrayList = arrayList2;
        } else {
            arrayList = list;
            list3 = list2;
        }
        int size = arrayList.size();
        if (size == 0) {
            if (list3.isEmpty()) {
                return new e(pVar);
            }
            return new j(pVar, list3, false);
        }
        p s11 = p.s(arrayList.get(0).f());
        if (z12 && !pVar.equals(s11)) {
            throw new IllegalArgumentException("Initial offset " + pVar + " not equal to previous offset of first transition: " + s11);
        } else if (list3.isEmpty()) {
            return new a(arrayList, false, z12);
        } else {
            q qVar = arrayList.get(size - 1);
            long e11 = qVar.e() + 1;
            long f11 = f(1);
            if (e11 < f11) {
                arrayList.addAll(j.s(qVar, list3, e11, f11));
            }
            return new b(size, arrayList, list3, false, z12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<p> h(int i11) {
        return Collections.singletonList(p.s(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<p> i(int i11, int i12) {
        p s11 = p.s(i11);
        p s12 = p.s(i12);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(s11);
        arrayList.add(s12);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long j(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return net.time4j.base.c.i(z.UNIX.transform(net.time4j.base.b.j(aVar.getYear(), aVar.getMonth(), aVar.n()), z.MODIFIED_JULIAN_DATE), 86400L) + (gVar.p() * 3600) + (gVar.m() * 60) + gVar.j();
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return false;
    }
}