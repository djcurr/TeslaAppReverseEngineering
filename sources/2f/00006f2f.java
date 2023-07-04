package g1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x {
    public static final /* synthetic */ Object[] a(Object[] objArr, int i11, Object obj, Object obj2) {
        return g(objArr, i11, obj, obj2);
    }

    public static final /* synthetic */ Object[] b(Object[] objArr, int i11) {
        return h(objArr, i11);
    }

    public static final /* synthetic */ Object[] c(Object[] objArr, int i11) {
        return i(objArr, i11);
    }

    public static final /* synthetic */ Object[] d(Object[] objArr, int i11, int i12, t tVar) {
        return j(objArr, i11, i12, tVar);
    }

    public static final /* synthetic */ Object[] e(Object[] objArr, int i11, int i12, Object obj, Object obj2) {
        return k(objArr, i11, i12, obj, obj2);
    }

    public static final int f(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    public static final <K, V> Object[] g(Object[] objArr, int i11, K k11, V v11) {
        Object[] objArr2 = new Object[objArr.length + 2];
        wz.o.o(objArr, objArr2, 0, 0, i11, 6, null);
        wz.l.k(objArr, objArr2, i11 + 2, i11, objArr.length);
        objArr2[i11] = k11;
        objArr2[i11 + 1] = v11;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[objArr.length - 2];
        wz.o.o(objArr, objArr2, 0, 0, i11, 6, null);
        wz.l.k(objArr, objArr2, i11, i11 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[objArr.length - 1];
        wz.o.o(objArr, objArr2, 0, 0, i11, 6, null);
        wz.l.k(objArr, objArr2, i11, i11 + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i11, int i12, t<?, ?> tVar) {
        int i13 = i12 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        wz.o.o(objArr, objArr2, 0, 0, i11, 6, null);
        wz.l.k(objArr, objArr2, i11, i11 + 2, i12);
        objArr2[i13] = tVar;
        wz.l.k(objArr, objArr2, i13 + 1, i12, objArr.length);
        return objArr2;
    }

    public static final <K, V> Object[] k(Object[] objArr, int i11, int i12, K k11, V v11) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        wz.l.k(copyOf, copyOf, i11 + 2, i11 + 1, objArr.length);
        wz.l.k(copyOf, copyOf, i12 + 2, i12, i11);
        copyOf[i12] = k11;
        copyOf[i12 + 1] = v11;
        return copyOf;
    }
}