package el;

/* loaded from: classes3.dex */
final class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z11, String str, int i11, int i12) {
        if (z11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(")");
        throw new ArithmeticException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(boolean z11, String str, long j11, long j12) {
        if (z11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 54);
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(j11);
        sb2.append(", ");
        sb2.append(j12);
        sb2.append(")");
        throw new ArithmeticException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(String str, int i11) {
        if (i11 > 0) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i11);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(boolean z11) {
        if (!z11) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}