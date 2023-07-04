package bc;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static int[] f7602a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean a(int i11, int i12, int i13) {
        if (i11 < 1 || i11 > 9999 || i12 < 0 || i12 > 11) {
            return false;
        }
        int i14 = f7602a[i12];
        if (i12 == 1) {
            if (i11 % 4 == 0 && (i11 % 100 != 0 || i11 % 400 == 0)) {
                i14++;
            }
        }
        return i13 >= 1 && i13 <= i14;
    }

    public static boolean b(int i11, int i12, int i13) {
        return i11 >= 0 && i11 < 24 && i12 >= 0 && i12 < 60 && i13 >= 0 && i13 < 60;
    }
}