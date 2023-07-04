package md;

/* loaded from: classes.dex */
public class i {
    public static int a(int... iArr) {
        k.b(Boolean.valueOf(iArr.length > 0));
        int i11 = iArr[0];
        for (int i12 = 1; i12 < iArr.length; i12++) {
            if (iArr[i12] > i11) {
                i11 = iArr[i12];
            }
        }
        return i11;
    }
}