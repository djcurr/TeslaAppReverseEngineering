package ef;

/* loaded from: classes3.dex */
public class a {
    public void a(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] < 11) {
                iArr[i11] = 100;
            }
        }
    }

    public int[] b(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr2[i12] = i11;
            i11 += iArr[i12];
        }
        return iArr2;
    }

    public int c(int[] iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        return i11;
    }
}