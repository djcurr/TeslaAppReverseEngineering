package ud;

/* loaded from: classes.dex */
public class a {
    public static int a(int i11, int i12) {
        return ((i11 + 31) * 31) + i12;
    }

    public static int b(int i11, int i12, int i13, int i14, int i15, int i16) {
        return ((((((((((i11 + 31) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16;
    }

    public static int c(Object obj, Object obj2) {
        return a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }

    public static int d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return b(obj == null ? 0 : obj.hashCode(), obj2 == null ? 0 : obj2.hashCode(), obj3 == null ? 0 : obj3.hashCode(), obj4 == null ? 0 : obj4.hashCode(), obj5 == null ? 0 : obj5.hashCode(), obj6 != null ? obj6.hashCode() : 0);
    }
}