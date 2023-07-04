package r2;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.s;
import r2.l;
import vz.b0;
import wz.w;

/* loaded from: classes.dex */
public class i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    public d a(Iterable<? extends d> fontList, l fontWeight, int i11) {
        int i12;
        Object obj;
        int k11;
        d dVar;
        Object obj2;
        int k12;
        int k13;
        Object obj3;
        int k14;
        int k15;
        Object obj4;
        int k16;
        int k17;
        s.g(fontList, "fontList");
        s.g(fontWeight, "fontWeight");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends d> it2 = fontList.iterator();
        while (true) {
            boolean z11 = false;
            i12 = 1;
            if (!it2.hasNext()) {
                break;
            }
            d next = it2.next();
            d dVar2 = next;
            if (s.c(dVar2.a(), fontWeight) && j.f(dVar2.c(), i11)) {
                z11 = true;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return (d) arrayList.get(0);
        }
        b0 b0Var = b0.f54756a;
        ArrayList arrayList2 = new ArrayList();
        for (d dVar3 : fontList) {
            if (j.f(dVar3.c(), i11)) {
                arrayList2.add(dVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        l.a aVar = l.f49091b;
        d dVar4 = null;
        if (fontWeight.compareTo(aVar.f()) < 0) {
            ArrayList arrayList3 = new ArrayList();
            for (d dVar5 : fontList) {
                if (dVar5.a().compareTo(fontWeight) <= 0) {
                    arrayList3.add(dVar5);
                }
            }
            if (arrayList3.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList3.get(0);
                l a11 = ((d) obj4).a();
                k16 = w.k(arrayList3);
                if (1 <= k16) {
                    int i13 = 1;
                    while (true) {
                        int i14 = i13 + 1;
                        Object obj5 = arrayList3.get(i13);
                        l a12 = ((d) obj5).a();
                        if (a11.compareTo(a12) < 0) {
                            obj4 = obj5;
                            a11 = a12;
                        }
                        if (i13 == k16) {
                            break;
                        }
                        i13 = i14;
                    }
                }
            }
            dVar = (d) obj4;
            if (dVar == null) {
                ArrayList arrayList4 = new ArrayList();
                for (d dVar6 : fontList) {
                    if (dVar6.a().compareTo(fontWeight) > 0) {
                        arrayList4.add(dVar6);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    Object obj6 = arrayList4.get(0);
                    l a13 = ((d) obj6).a();
                    k17 = w.k(arrayList4);
                    Object obj7 = obj6;
                    if (1 <= k17) {
                        while (true) {
                            int i15 = i12 + 1;
                            Object obj8 = arrayList4.get(i12);
                            l a14 = ((d) obj8).a();
                            obj6 = obj7;
                            if (a13.compareTo(a14) > 0) {
                                obj6 = obj8;
                                a13 = a14;
                            }
                            if (i12 == k17) {
                                break;
                            }
                            i12 = i15;
                            obj7 = obj6;
                        }
                    }
                    dVar4 = obj6;
                }
                dVar = dVar4;
            }
        } else if (fontWeight.compareTo(aVar.g()) > 0) {
            ArrayList arrayList5 = new ArrayList();
            for (d dVar7 : fontList) {
                if (dVar7.a().compareTo(fontWeight) >= 0) {
                    arrayList5.add(dVar7);
                }
            }
            if (arrayList5.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList5.get(0);
                l a15 = ((d) obj3).a();
                k14 = w.k(arrayList5);
                if (1 <= k14) {
                    int i16 = 1;
                    while (true) {
                        int i17 = i16 + 1;
                        Object obj9 = arrayList5.get(i16);
                        l a16 = ((d) obj9).a();
                        if (a15.compareTo(a16) > 0) {
                            obj3 = obj9;
                            a15 = a16;
                        }
                        if (i16 == k14) {
                            break;
                        }
                        i16 = i17;
                    }
                }
            }
            dVar = (d) obj3;
            if (dVar == null) {
                ArrayList arrayList6 = new ArrayList();
                for (d dVar8 : fontList) {
                    if (dVar8.a().compareTo(fontWeight) < 0) {
                        arrayList6.add(dVar8);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    Object obj10 = arrayList6.get(0);
                    l a17 = ((d) obj10).a();
                    k15 = w.k(arrayList6);
                    Object obj11 = obj10;
                    if (1 <= k15) {
                        while (true) {
                            int i18 = i12 + 1;
                            Object obj12 = arrayList6.get(i12);
                            l a18 = ((d) obj12).a();
                            obj10 = obj11;
                            if (a17.compareTo(a18) < 0) {
                                obj10 = obj12;
                                a17 = a18;
                            }
                            if (i12 == k15) {
                                break;
                            }
                            i12 = i18;
                            obj11 = obj10;
                        }
                    }
                    dVar4 = obj10;
                }
                dVar = dVar4;
            }
        } else {
            ArrayList arrayList7 = new ArrayList();
            for (d dVar9 : fontList) {
                d dVar10 = dVar9;
                if (dVar10.a().compareTo(fontWeight) >= 0 && dVar10.a().compareTo(l.f49091b.g()) <= 0) {
                    arrayList7.add(dVar9);
                }
            }
            if (arrayList7.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList7.get(0);
                l a19 = ((d) obj).a();
                k11 = w.k(arrayList7);
                if (1 <= k11) {
                    int i19 = 1;
                    while (true) {
                        int i21 = i19 + 1;
                        Object obj13 = arrayList7.get(i19);
                        l a21 = ((d) obj13).a();
                        if (a19.compareTo(a21) > 0) {
                            obj = obj13;
                            a19 = a21;
                        }
                        if (i19 == k11) {
                            break;
                        }
                        i19 = i21;
                    }
                }
            }
            dVar = (d) obj;
            if (dVar == null) {
                ArrayList arrayList8 = new ArrayList();
                for (d dVar11 : fontList) {
                    if (dVar11.a().compareTo(fontWeight) < 0) {
                        arrayList8.add(dVar11);
                    }
                }
                if (arrayList8.isEmpty()) {
                    obj2 = 0;
                } else {
                    obj2 = arrayList8.get(0);
                    l a22 = ((d) obj2).a();
                    k12 = w.k(arrayList8);
                    if (1 <= k12) {
                        int i22 = 1;
                        Object obj14 = obj2;
                        while (true) {
                            int i23 = i22 + 1;
                            Object obj15 = arrayList8.get(i22);
                            l a23 = ((d) obj15).a();
                            obj2 = obj14;
                            if (a22.compareTo(a23) < 0) {
                                obj2 = obj15;
                                a22 = a23;
                            }
                            if (i22 == k12) {
                                break;
                            }
                            i22 = i23;
                            obj14 = obj2;
                        }
                    }
                }
                dVar = obj2;
                if (dVar == null) {
                    ArrayList arrayList9 = new ArrayList();
                    for (d dVar12 : fontList) {
                        if (dVar12.a().compareTo(l.f49091b.g()) > 0) {
                            arrayList9.add(dVar12);
                        }
                    }
                    if (!arrayList9.isEmpty()) {
                        Object obj16 = arrayList9.get(0);
                        l a24 = ((d) obj16).a();
                        k13 = w.k(arrayList9);
                        Object obj17 = obj16;
                        if (1 <= k13) {
                            while (true) {
                                int i24 = i12 + 1;
                                Object obj18 = arrayList9.get(i12);
                                l a25 = ((d) obj18).a();
                                obj16 = obj17;
                                if (a24.compareTo(a25) > 0) {
                                    obj16 = obj18;
                                    a24 = a25;
                                }
                                if (i12 == k13) {
                                    break;
                                }
                                i12 = i24;
                                obj17 = obj16;
                            }
                        }
                        dVar4 = obj16;
                    }
                    dVar = dVar4;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("Cannot match any font");
    }

    public d b(h fontFamily, l fontWeight, int i11) {
        s.g(fontFamily, "fontFamily");
        s.g(fontWeight, "fontWeight");
        return a(fontFamily.i(), fontWeight, i11);
    }
}