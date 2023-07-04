package gh;

/* loaded from: classes3.dex */
public final class b {
    public static String a(String str) {
        int i11 = 0;
        while (i11 < str.length() && Character.isWhitespace(str.charAt(i11))) {
            i11++;
        }
        return str.substring(i11);
    }

    public static String b(String str) {
        int length = str.length() - 1;
        while (length >= 0 && Character.isWhitespace(str.charAt(length))) {
            length--;
        }
        return str.substring(0, length + 1);
    }
}