package com.google.common.collect;

/* loaded from: classes3.dex */
public final class k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, int i11) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i11);
        throw new NullPointerException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            a(objArr[i12], i12);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i11) {
        return (T[]) m0.b(tArr, i11);
    }
}