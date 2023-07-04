package x0;

/* loaded from: classes.dex */
public final class l {
    public static final long a(int i11, int i12, boolean z11, boolean z12) {
        if (i12 == 0) {
            return n2.z.b(i11, i11);
        }
        if (i11 == 0) {
            if (z11) {
                return n2.z.b(1, 0);
            }
            return n2.z.b(0, 1);
        } else if (i11 == i12) {
            if (z11) {
                return n2.z.b(i12 - 1, i12);
            }
            return n2.z.b(i12, i12 - 1);
        } else if (z11) {
            if (!z12) {
                return n2.z.b(i11 - 1, i11);
            }
            return n2.z.b(i11 + 1, i11);
        } else if (!z12) {
            return n2.z.b(i11, i11 + 1);
        } else {
            return n2.z.b(i11, i11 - 1);
        }
    }
}