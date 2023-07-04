package q7;

/* loaded from: classes.dex */
public final class d {
    public static boolean a(String str, char... cArr) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (!Character.isDigit(charAt)) {
                return false;
            }
            for (char c11 : cArr) {
                if (c11 != charAt) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String b(String str, char... cArr) {
        return str.replaceAll("[\\s" + new String(cArr) + "]", "");
    }
}