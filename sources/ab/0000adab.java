package q70;

/* loaded from: classes5.dex */
public final class j {
    public static int a(int i11) {
        int i12 = -1;
        while (i11 != 0) {
            i12++;
            i11 >>>= 1;
        }
        return i12;
    }

    public static int b(int i11, int i12) {
        while (true) {
            int i13 = i12;
            int i14 = i11;
            i11 = i13;
            if (i11 == 0) {
                return i14;
            }
            i12 = e(i14, i11);
        }
    }

    public static boolean c(int i11) {
        if (i11 == 0) {
            return false;
        }
        int a11 = a(i11) >>> 1;
        int i12 = 2;
        for (int i13 = 0; i13 < a11; i13++) {
            i12 = d(i12, i12, i11);
            if (b(i12 ^ 2, i11) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(int i11, int i12, int i13) {
        int e11 = e(i11, i13);
        int e12 = e(i12, i13);
        int i14 = 0;
        if (e12 != 0) {
            int a11 = 1 << a(i13);
            while (e11 != 0) {
                if (((byte) (e11 & 1)) == 1) {
                    i14 ^= e12;
                }
                e11 >>>= 1;
                e12 <<= 1;
                if (e12 >= a11) {
                    e12 ^= i13;
                }
            }
        }
        return i14;
    }

    public static int e(int i11, int i12) {
        if (i12 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (a(i11) >= a(i12)) {
            i11 ^= i12 << (a(i11) - a(i12));
        }
        return i11;
    }
}