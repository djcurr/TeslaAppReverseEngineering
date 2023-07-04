package r70;

/* loaded from: classes5.dex */
public class e {
    private static boolean a(String str, int i11) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt >= 0 && parseInt <= i11;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean b(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String str2 = str + ".";
        int i11 = 0;
        int i12 = 0;
        while (i11 < str2.length() && (indexOf = str2.indexOf(46, i11)) > i11) {
            if (i12 == 4) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(str2.substring(i11, indexOf));
                if (parseInt >= 0 && parseInt <= 255) {
                    i11 = indexOf + 1;
                    i12++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return i12 == 4;
    }

    public static boolean c(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        if (indexOf <= 0 || !b(str.substring(0, indexOf))) {
            return false;
        }
        return b(substring) || a(substring, 32);
    }

    public static boolean d(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String str2 = str + ":";
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        while (i11 < str2.length() && (indexOf = str2.indexOf(58, i11)) >= i11) {
            if (i12 == 8) {
                return false;
            }
            if (i11 != indexOf) {
                String substring = str2.substring(i11, indexOf);
                if (indexOf != str2.length() - 1 || substring.indexOf(46) <= 0) {
                    try {
                        int parseInt = Integer.parseInt(str2.substring(i11, indexOf), 16);
                        if (parseInt >= 0 && parseInt <= 65535) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return false;
                } else if (!b(substring)) {
                    return false;
                } else {
                    i12++;
                }
            } else if (indexOf != 1 && indexOf != str2.length() - 1 && z11) {
                return false;
            } else {
                z11 = true;
            }
            i11 = indexOf + 1;
            i12++;
        }
        return i12 == 8 || z11;
    }

    public static boolean e(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        if (indexOf <= 0 || !d(str.substring(0, indexOf))) {
            return false;
        }
        return d(substring) || a(substring, 128);
    }
}