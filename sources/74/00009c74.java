package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class AEADParameters implements CipherParameters {
    private byte[] associatedText;
    private KeyParameter key;
    private int macSize;
    private byte[] nonce;

    public AEADParameters(KeyParameter keyParameter, int i11, byte[] bArr) {
        this(keyParameter, i11, bArr, null);
    }

    public byte[] getAssociatedText() {
        return this.associatedText;
    }

    public KeyParameter getKey() {
        return this.key;
    }

    public int getMacSize() {
        return this.macSize;
    }

    public byte[] getNonce() {
        return this.nonce;
    }

    public AEADParameters(KeyParameter keyParameter, int i11, byte[] bArr, byte[] bArr2) {
        this.key = keyParameter;
        this.nonce = bArr;
        this.macSize = i11;
        this.associatedText = bArr2;
    }
}