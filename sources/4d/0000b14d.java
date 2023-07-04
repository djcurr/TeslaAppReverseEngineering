package s0;

import java.util.List;

/* loaded from: classes.dex */
public final class g {
    public static final r a(List<r> composedVisibleItems, v itemProvider, List<Integer> headerIndexes, int i11, int i12, int i13) {
        int i14;
        int k11;
        kotlin.jvm.internal.s.g(composedVisibleItems, "composedVisibleItems");
        kotlin.jvm.internal.s.g(itemProvider, "itemProvider");
        kotlin.jvm.internal.s.g(headerIndexes, "headerIndexes");
        int index = ((r) wz.u.b0(composedVisibleItems)).getIndex();
        int size = headerIndexes.size();
        int i15 = 0;
        int i16 = -1;
        int i17 = -1;
        while (i15 < size) {
            int i18 = i15 + 1;
            if (headerIndexes.get(i15).intValue() > index) {
                break;
            }
            i16 = headerIndexes.get(i15).intValue();
            if (i18 >= 0) {
                k11 = wz.w.k(headerIndexes);
                if (i18 <= k11) {
                    i14 = headerIndexes.get(i18);
                    i17 = i14.intValue();
                    i15 = i18;
                }
            }
            i14 = -1;
            i17 = i14.intValue();
            i15 = i18;
        }
        int size2 = composedVisibleItems.size();
        int i19 = Integer.MIN_VALUE;
        int i21 = Integer.MIN_VALUE;
        int i22 = 0;
        int i23 = -1;
        while (i22 < size2) {
            int i24 = i22 + 1;
            r rVar = composedVisibleItems.get(i22);
            if (rVar.getIndex() == i16) {
                i19 = rVar.g();
                i23 = i22;
            } else if (rVar.getIndex() == i17) {
                i21 = rVar.g();
            }
            i22 = i24;
        }
        if (i16 == -1) {
            return null;
        }
        u a11 = itemProvider.a(a.a(i16));
        int max = i19 != Integer.MIN_VALUE ? Math.max(-i11, i19) : -i11;
        if (i21 != Integer.MIN_VALUE) {
            max = Math.min(max, i21 - a11.d());
        }
        r f11 = a11.f(max, i12, i13);
        if (i23 != -1) {
            composedVisibleItems.set(i23, f11);
        } else {
            composedVisibleItems.add(0, f11);
        }
        return f11;
    }
}