package f1;

/* loaded from: classes.dex */
public final class l {
    public static final int a(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    public static final <E> e1.e<E> b() {
        return j.f25503c.a();
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i11) {
        return (i11 - 1) & (-32);
    }
}