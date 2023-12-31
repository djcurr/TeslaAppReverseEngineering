package xz;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c {
    public static final <E> E[] d(int i11) {
        if (i11 >= 0) {
            return (E[]) new Object[i11];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final <T> T[] e(T[] tArr, int i11) {
        s.g(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i11);
        s.f(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    public static final <E> void f(E[] eArr, int i11) {
        s.g(eArr, "<this>");
        eArr[i11] = null;
    }

    public static final <E> void g(E[] eArr, int i11, int i12) {
        s.g(eArr, "<this>");
        while (i11 < i12) {
            f(eArr, i11);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean h(T[] tArr, int i11, int i12, List<?> list) {
        if (i12 != list.size()) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!s.c(tArr[i11 + i13], list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int i(T[] tArr, int i11, int i12) {
        int i13 = 1;
        for (int i14 = 0; i14 < i12; i14++) {
            T t11 = tArr[i11 + i14];
            i13 = (i13 * 31) + (t11 != null ? t11.hashCode() : 0);
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String j(T[] tArr, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder((i12 * 3) + 2);
        sb2.append("[");
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(", ");
            }
            sb2.append(tArr[i11 + i13]);
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        s.f(sb3, "sb.toString()");
        return sb3;
    }
}