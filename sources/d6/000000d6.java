package ak;

/* loaded from: classes3.dex */
public final class x {
    public static int a(int i11, int i12) {
        for (int i13 = 1; i13 <= 2; i13++) {
            int i14 = (i11 + i13) % 3;
            if (b(i14, i12)) {
                return i14;
            }
        }
        return i11;
    }

    public static boolean b(int i11, int i12) {
        if (i11 != 0) {
            return i11 != 1 ? i11 == 2 && (i12 & 2) != 0 : (i12 & 1) != 0;
        }
        return true;
    }
}