package wz;

/* loaded from: classes5.dex */
public final class z0 {
    public static final void a(int i11, int i12) {
        String str;
        if (i11 > 0 && i12 > 0) {
            return;
        }
        if (i11 != i12) {
            str = "Both size " + i11 + " and step " + i12 + " must be greater than zero.";
        } else {
            str = "size " + i11 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }
}