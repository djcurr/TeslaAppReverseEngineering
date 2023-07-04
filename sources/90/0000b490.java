package t50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.k;

/* loaded from: classes5.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    SecureRandom f51665a;

    @Override // t50.a
    public int addPadding(byte[] bArr, int i11) {
        byte length = (byte) (bArr.length - i11);
        while (i11 < bArr.length - 1) {
            bArr[i11] = (byte) this.f51665a.nextInt();
            i11++;
        }
        bArr[i11] = length;
        return length;
    }

    @Override // t50.a
    public void init(SecureRandom secureRandom) {
        this.f51665a = k.c(secureRandom);
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