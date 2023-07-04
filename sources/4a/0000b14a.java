package s0;

import java.util.List;

/* loaded from: classes.dex */
public final class d {
    private static final <T> int a(List<b<T>> list, int i11) {
        int k11;
        k11 = wz.w.k(list);
        int i12 = 0;
        while (i12 < k11) {
            int i13 = ((k11 - i12) / 2) + i12;
            int c11 = list.get(i13).c();
            if (c11 == i11) {
                return i13;
            }
            if (c11 < i11) {
                i12 = i13 + 1;
                if (i11 < list.get(i12).c()) {
                    return i13;
                }
            } else {
                k11 = i13 - 1;
            }
        }
        return i12;
    }

    public static final <T> b<T> b(c<T> cVar, int i11) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        return cVar.a().get(c(cVar, i11));
    }

    public static final <T> int c(c<T> cVar, int i11) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        if (i11 >= 0 && i11 < cVar.b()) {
            return a(cVar.a(), i11);
        }
        throw new IndexOutOfBoundsException("Index " + i11 + ", size " + cVar.b());
    }
}