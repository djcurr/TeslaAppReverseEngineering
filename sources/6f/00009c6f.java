package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

/* loaded from: classes4.dex */
public class PKCS7Padding implements BlockCipherPadding {
    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i11) {
        byte length = (byte) (bArr.length - i11);
        while (i11 < bArr.length) {
            bArr[i11] = length;
            i11++;
        }
        return length;
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "PKCS7";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
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