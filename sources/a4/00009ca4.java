package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class KeyParameter implements CipherParameters {
    private byte[] key;

    public KeyParameter(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] getKey() {
        return this.key;
    }

    public KeyParameter(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.key = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
    }
}