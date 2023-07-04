package wz;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class c0 extends b0 {
    public static <T> List<T> M(List<T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        return new u0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int N(java.util.List<?> r4, int r5) {
        /*
            r0 = 0
            if (r5 < 0) goto Lb
            int r1 = wz.u.k(r4)
            if (r5 > r1) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = r0
        Lc:
            if (r1 == 0) goto L14
            int r4 = wz.u.k(r4)
            int r4 = r4 - r5
            return r4
        L14:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Element index "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " must be in range ["
            r2.append(r5)
            m00.i r5 = new m00.i
            int r4 = wz.u.k(r4)
            r5.<init>(r0, r4)
            r2.append(r5)
            java.lang.String r4 = "]."
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wz.c0.N(java.util.List, int):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(List<?> list, int i11) {
        if (i11 >= 0 && i11 <= list.size()) {
            return list.size() - i11;
        }
        throw new IndexOutOfBoundsException("Position index " + i11 + " must be in range [" + new m00.i(0, list.size()) + "].");
    }
}