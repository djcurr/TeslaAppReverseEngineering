package k30;

/* loaded from: classes5.dex */
public class d {
    public static String a(String str) {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i12 = 0;
        boolean z11 = false;
        while (i12 < length) {
            char charAt = str.charAt(i12);
            if (charAt == '\'') {
                int i13 = i12 + 1;
                if (i13 >= length || str.charAt(i13) != '\'') {
                    z11 = !z11;
                } else {
                    sb2.append(charAt);
                    i12 = i13;
                }
                sb2.append(charAt);
            } else if (z11) {
                sb2.append(charAt);
            } else if (charAt != 'z' && charAt != 'Z' && charAt != 'v' && charAt != 'V' && charAt != 'x' && charAt != 'X') {
                sb2.append(charAt);
            }
            i12++;
        }
        int i14 = 0;
        while (i14 < sb2.length()) {
            char charAt2 = sb2.charAt(i14);
            if (charAt2 == ' ' && (i11 = i14 + 1) < sb2.length() && sb2.charAt(i11) == ' ') {
                sb2.deleteCharAt(i14);
            } else if (charAt2 == '[' || charAt2 == ']' || charAt2 == '(' || charAt2 == ')') {
                sb2.deleteCharAt(i14);
            } else {
                i14++;
            }
            i14--;
            i14++;
        }
        String trim = sb2.toString().trim();
        if (!trim.endsWith(" '")) {
            return trim.endsWith(",") ? trim.substring(0, trim.length() - 1) : trim;
        }
        return trim.substring(0, trim.length() - 2) + "'";
    }
}