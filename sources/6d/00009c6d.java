package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

/* loaded from: classes4.dex */
public class ISO10126d2Padding implements BlockCipherPadding {
    SecureRandom random;

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i11) {
        byte length = (byte) (bArr.length - i11);
        while (i11 < bArr.length - 1) {
            bArr[i11] = (byte) this.random.nextInt();
            i11++;
        }
        bArr[i11] = length;
        return length;
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO10126-2";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.random = secureRandom;
        } else {
            this.random = new SecureRandom();
        }
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) {
        int i11 = bArr[bArr.length - 1] & 255;
        if (i11 <= bArr.length) {
            return i11;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}