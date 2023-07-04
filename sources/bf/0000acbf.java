package q30;

import kotlin.jvm.internal.s;
import okio.b0;

/* loaded from: classes5.dex */
public final class c {
    public static final int a(int[] binarySearch, int i11, int i12, int i13) {
        s.g(binarySearch, "$this$binarySearch");
        int i14 = i13 - 1;
        while (i12 <= i14) {
            int i15 = (i12 + i14) >>> 1;
            int i16 = binarySearch[i15];
            if (i16 < i11) {
                i12 = i15 + 1;
            } else if (i16 <= i11) {
                return i15;
            } else {
                i14 = i15 - 1;
            }
        }
        return (-i12) - 1;
    }

    public static final int b(b0 segment, int i11) {
        s.g(segment, "$this$segment");
        int a11 = a(segment.H(), i11 + 1, 0, segment.I().length);
        return a11 >= 0 ? a11 : ~a11;
    }
}