package t50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class h implements a {
    @Override // t50.a
    public int addPadding(byte[] bArr, int i11) {
        int length = bArr.length - i11;
        while (i11 < bArr.length) {
            bArr[i11] = 0;
            i11++;
        }
        return length;
    }

    @Override // t50.a
    public void init(SecureRandom secureRandom) {
    }

    @Override // t50.a
    public int padCount(byte[] bArr) {
        int length = bArr.length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return bArr.length - length;
    }
}