package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

/* loaded from: classes4.dex */
public class ISO7816d4Padding implements BlockCipherPadding {
    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
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

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO7816-4";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
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