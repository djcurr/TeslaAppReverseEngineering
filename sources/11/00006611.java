package dq;

/* loaded from: classes2.dex */
public class a {
    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i11 |= bArr[i12] ^ bArr2[i12];
        }
        return i11 == 0;
    }
}