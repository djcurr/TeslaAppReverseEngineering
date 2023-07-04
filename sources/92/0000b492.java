package t50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class d implements a {
    @Override // t50.a
    public int addPadding(byte[] bArr, int i11) {
        byte length = (byte) (bArr.length - i11);
        while (i11 < bArr.length) {
            bArr[i11] = length;
            i11++;
        }
        return length;
    }

    @Override // t50.a
    public void init(SecureRandom secureRandom) {
    }

    @Override // t50.a
    public int padCount(byte[] bArr) {
        int i11 = bArr[bArr.length - 1] & 255;
        byte b11 = (byte) i11;
        boolean z11 = (i11 > bArr.length) | (i11 == 0);
        for (int i12 = 0; i12 < bArr.length; i12++) {
            z11 |= (bArr.length - i12 <= i11) & (bArr[i12] != b11);
        }
        if (z11) {
            throw new InvalidCipherTextException("pad block corrupted");
        }
        return i11;
    }
}