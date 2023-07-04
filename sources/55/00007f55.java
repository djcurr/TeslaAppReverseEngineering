package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class b {
    public static int a(int i11) {
        boolean z11 = false;
        if (2 <= i11 && i11 < 37) {
            z11 = true;
        }
        if (z11) {
            return i11;
        }
        throw new IllegalArgumentException("radix " + i11 + " was not in valid range " + new m00.i(2, 36));
    }

    public static final int b(char c11, int i11) {
        return Character.digit((int) c11, i11);
    }

    public static boolean c(char c11) {
        return Character.isWhitespace(c11) || Character.isSpaceChar(c11);
    }
}