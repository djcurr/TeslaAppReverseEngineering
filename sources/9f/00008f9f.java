package okio;

/* loaded from: classes5.dex */
public final class g0 {
    public static final long a(String utf8Size, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.s.g(utf8Size, "$this$utf8Size");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 >= i11) {
            if (!(i12 <= utf8Size.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + utf8Size.length()).toString());
            }
            long j11 = 0;
            while (i11 < i12) {
                char charAt = utf8Size.charAt(i11);
                if (charAt < 128) {
                    j11++;
                } else {
                    if (charAt < 2048) {
                        i13 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i13 = 3;
                    } else {
                        int i14 = i11 + 1;
                        char charAt2 = i14 < i12 ? utf8Size.charAt(i14) : (char) 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j11++;
                            i11 = i14;
                        } else {
                            j11 += 4;
                            i11 += 2;
                        }
                    }
                    j11 += i13;
                }
                i11++;
            }
            return j11;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
    }

    public static /* synthetic */ long b(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return a(str, i11, i12);
    }
}