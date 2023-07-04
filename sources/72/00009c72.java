package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

/* loaded from: classes4.dex */
public class X923Padding implements BlockCipherPadding {
    SecureRandom random = null;

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i11) {
        byte length = (byte) (bArr.length - i11);
        while (i11 < bArr.length - 1) {
            SecureRandom secureRandom = this.random;
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

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "X9.23";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
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