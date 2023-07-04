package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class IESParameters implements CipherParameters {
    private byte[] derivation;
    private byte[] encoding;
    private int macKeySize;

    public IESParameters(byte[] bArr, byte[] bArr2, int i11) {
        this.derivation = bArr;
        this.encoding = bArr2;
        this.macKeySize = i11;
    }

    public byte[] getDerivationV() {
        return this.derivation;
    }

    public byte[] getEncodingV() {
        return this.encoding;
    }

    public int getMacKeySize() {
        return this.macKeySize;
    }
}