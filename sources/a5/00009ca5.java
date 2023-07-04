package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;

/* loaded from: classes4.dex */
public class MGFParameters implements DerivationParameters {
    byte[] seed;

    public MGFParameters(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public MGFParameters(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.seed = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
    }
}