package ye;

/* loaded from: classes3.dex */
public class c {
    public static boolean a(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    public static boolean b(char c11) {
        return (c11 >= 'a' && c11 <= 'z') || (c11 >= 'A' && c11 <= 'Z');
    }

    public static boolean c(char c11) {
        return b(c11) || a(c11);
    }

    public static boolean d(CharSequence charSequence, int i11, int i12, int i13, int i14) {
        int i15;
        if (i12 < charSequence.length() && (i15 = (i12 - i11) + 1) >= i13 && i15 <= i14) {
            while (i11 <= i12) {
                if (!b(charSequence.charAt(i11))) {
                    return false;
                }
                i11++;
            }
            return true;
        }
        return false;
    }

    public static boolean e(CharSequence charSequence, int i11, int i12, int i13, int i14) {
        int i15;
        if (i12 < charSequence.length() && (i15 = (i12 - i11) + 1) >= i13 && i15 <= i14) {
            while (i11 <= i12) {
                if (!c(charSequence.charAt(i11))) {
                    return false;
                }
                i11++;
            }
            return true;
        }
        return false;
    }

    public static boolean f(CharSequence charSequence, int i11, int i12, int i13, int i14) {
        int i15;
        if (i12 < charSequence.length() && (i15 = (i12 - i11) + 1) >= i13 && i15 <= i14) {
            while (i11 <= i12) {
                if (!a(charSequence.charAt(i11))) {
                    return false;
                }
                i11++;
            }
            return true;
        }
        return false;
    }

    public static boolean g(CharSequence charSequence, int i11, int i12) {
        return (i12 - i11) + 1 == 4 && b(charSequence.charAt(i11)) && e(charSequence, i11 + 1, i12, 3, 3);
    }

    public static boolean h(CharSequence charSequence, int i11, int i12) {
        return e(charSequence, i11, i12, 1, 1);
    }

    public static boolean i(CharSequence charSequence, int i11, int i12) {
        return e(charSequence, i11, i12, 2, 8);
    }

    public static boolean j(CharSequence charSequence, int i11, int i12) {
        return e(charSequence, i11, i12, 1, 8);
    }

    public static boolean k(CharSequence charSequence, int i11, int i12) {
        return i12 == i11 + 1 && b(charSequence.charAt(i11)) && a(charSequence.charAt(i12));
    }

    public static boolean l(CharSequence charSequence, int i11, int i12) {
        return e(charSequence, i11, i12, 3, 8);
    }

    public static boolean m(CharSequence charSequence, int i11, int i12) {
        return e(charSequence, i11, i12, 3, 8);
    }

    public static boolean n(CharSequence charSequence, int i11, int i12) {
        return i12 == i11 + 1 && c(charSequence.charAt(i11)) && b(charSequence.charAt(i12));
    }

    public static boolean o(CharSequence charSequence, int i11, int i12) {
        return e(charSequence, i11, i12, 3, 8);
    }

    public static boolean p(CharSequence charSequence, int i11, int i12) {
        if (d(charSequence, i11, i12, 2, 3) || d(charSequence, i11, i12, 5, 8)) {
            return true;
        }
        return (i12 - i11) + 1 == 4 && charSequence.charAt(i11) == 'r' && charSequence.charAt(i11 + 1) == 'o' && charSequence.charAt(i11 + 2) == 'o' && charSequence.charAt(i11 + 3) == 't';
    }

    public static boolean q(CharSequence charSequence, int i11, int i12) {
        return d(charSequence, i11, i12, 2, 2) || f(charSequence, i11, i12, 3, 3);
    }

    public static boolean r(CharSequence charSequence, int i11, int i12) {
        return d(charSequence, i11, i12, 4, 4);
    }

    public static boolean s(CharSequence charSequence, int i11, int i12) {
        return e(charSequence, i11, i12, 5, 8) || g(charSequence, i11, i12);
    }
}