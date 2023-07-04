package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<j1> f2316a = new ArrayList();

    private static void b(List<int[]> list, int i11, int[] iArr, int i12) {
        boolean z11;
        if (i12 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            while (true) {
                if (i14 >= i12) {
                    z11 = false;
                    break;
                } else if (i13 == iArr[i14]) {
                    z11 = true;
                    break;
                } else {
                    i14++;
                }
            }
            if (!z11) {
                iArr[i12] = i13;
                b(list, i11, iArr, i12 + 1);
            }
        }
    }

    private List<int[]> c(int i11) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i11, new int[i11], 0);
        return arrayList;
    }

    public boolean a(j1 j1Var) {
        return this.f2316a.add(j1Var);
    }

    public boolean d(List<j1> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f2316a.size()) {
            return false;
        }
        for (int[] iArr : c(this.f2316a.size())) {
            boolean z11 = true;
            for (int i11 = 0; i11 < this.f2316a.size() && (iArr[i11] >= list.size() || ((z11 = z11 & this.f2316a.get(i11).d(list.get(iArr[i11]))))); i11++) {
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }
}