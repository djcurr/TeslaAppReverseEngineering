package f8;

import g8.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class u {

    /* renamed from: a  reason: collision with root package name */
    static c.a f26110a = c.a.a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<i8.a<T>> a(g8.c cVar, v7.d dVar, float f11, m0<T> m0Var, boolean z11) {
        ArrayList arrayList = new ArrayList();
        if (cVar.e0() == c.b.STRING) {
            dVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.j();
        while (cVar.p()) {
            if (cVar.p0(f26110a) != 0) {
                cVar.u0();
            } else if (cVar.e0() == c.b.BEGIN_ARRAY) {
                cVar.g();
                if (cVar.e0() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, dVar, f11, m0Var, false, z11));
                } else {
                    while (cVar.p()) {
                        arrayList.add(t.c(cVar, dVar, f11, m0Var, true, z11));
                    }
                }
                cVar.l();
            } else {
                arrayList.add(t.c(cVar, dVar, f11, m0Var, false, z11));
            }
        }
        cVar.m();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends i8.a<T>> list) {
        int i11;
        T t11;
        int size = list.size();
        int i12 = 0;
        while (true) {
            i11 = size - 1;
            if (i12 >= i11) {
                break;
            }
            i8.a<T> aVar = list.get(i12);
            i12++;
            i8.a<T> aVar2 = list.get(i12);
            aVar.f30194h = Float.valueOf(aVar2.f30193g);
            if (aVar.f30189c == null && (t11 = aVar2.f30188b) != null) {
                aVar.f30189c = t11;
                if (aVar instanceof y7.i) {
                    ((y7.i) aVar).i();
                }
            }
        }
        i8.a<T> aVar3 = list.get(i11);
        if ((aVar3.f30188b == null || aVar3.f30189c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}