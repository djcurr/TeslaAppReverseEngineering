package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
final class m0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] a(Object[] objArr, int i11, int i12, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i11, i12, tArr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] b(T[] tArr, int i11) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> Map<K, V> c(int i11) {
        return j.y(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> Map<K, V> d() {
        return j.t();
    }
}