package w30;

/* loaded from: classes5.dex */
public class b {
    public static boolean a(CharSequence charSequence) {
        if (charSequence == null || c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isLowerCase(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence == null || c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isUpperCase(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean d(CharSequence charSequence) {
        if (c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isDigit(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }
}