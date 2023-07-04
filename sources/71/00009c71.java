package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class TBCPadding implements BlockCipherPadding {
    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i11) {
        int length = bArr.length - i11;
        int i12 = 255;
        if (i11 <= 0 ? (bArr[bArr.length - 1] & 1) != 0 : (bArr[i11 - 1] & 1) != 0) {
            i12 = 0;
        }
        byte b11 = (byte) i12;
        while (i11 < bArr.length) {
            bArr[i11] = b11;
            i11++;
        }
        return length;
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "TBC";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) {
        byte b11 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        while (length > 0 && bArr[length - 1] == b11) {
            length--;
        }
        return bArr.length - length;
    }
}