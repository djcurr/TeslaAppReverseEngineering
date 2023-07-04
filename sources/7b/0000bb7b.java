package w0;

/* loaded from: classes.dex */
public final class z {
    public static final int a(CharSequence charSequence, int i11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        int i12 = i11 + 1;
        int length = charSequence.length();
        while (i12 < length) {
            int i13 = i12 + 1;
            if (charSequence.charAt(i12) == '\n') {
                return i12;
            }
            i12 = i13;
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        int i12 = i11 - 1;
        if (1 > i12) {
            return 0;
        }
        while (true) {
            int i13 = i12 - 1;
            if (charSequence.charAt(i12 - 1) == '\n') {
                return i12;
            }
            if (1 > i13) {
                return 0;
            }
            i12 = i13;
        }
    }

    public static final long c(CharSequence charSequence, int i11) {
        kotlin.jvm.internal.s.g(charSequence, "<this>");
        return n2.z.b(b(charSequence, i11), a(charSequence, i11));
    }
}