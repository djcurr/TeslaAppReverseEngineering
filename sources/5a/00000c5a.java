package bc;

/* loaded from: classes.dex */
public class d {
    public static int a(byte[] bArr, int i11, boolean z11) {
        int i12;
        int i13;
        if (z11) {
            i12 = ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
            i13 = bArr[i11 + 3] & 255;
        } else {
            i12 = (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
            i13 = (bArr[i11 + 3] & 255) << 24;
        }
        return i13 | i12;
    }
}