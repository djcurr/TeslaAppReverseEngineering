package t50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    SecureRandom f51667a = null;

    @Override // t50.a
    public int addPadding(byte[] bArr, int i11) {
        byte length = (byte) (bArr.length - i11);
        while (i11 < bArr.length - 1) {
            SecureRandom secureRandom = this.f51667a;
            if (secureRandom == null) {
                bArr[i11] = 0;
            } else {
                bArr[i11] = (byte) secureRandom.nextInt();
            }
            i11++;
        }
        bArr[i11] = length;
        return length;
    }

    @Override // t50.a
    public void init(SecureRandom secureRandom) {
        this.f51667a = secureRandom;
    }

    @Override // t50.a
    public int padCount(byte[] bArr) {
        int i11 = bArr[bArr.length - 1] & 255;
        if (i11 <= bArr.length) {
            return i11;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}