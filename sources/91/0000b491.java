package t50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class c implements a {
    @Override // t50.a
    public int addPadding(byte[] bArr, int i11) {
        int length = bArr.length - i11;
        bArr[i11] = Byte.MIN_VALUE;
        while (true) {
            i11++;
            if (i11 >= bArr.length) {
                return length;
            }
            bArr[i11] = 0;
        }
    }

    @Override // t50.a
    public void init(SecureRandom secureRandom) {
    }

    @Override // t50.a
    public int padCount(byte[] bArr) {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == Byte.MIN_VALUE) {
            return bArr.length - length;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}