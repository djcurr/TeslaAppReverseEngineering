package org.spongycastle.crypto;

/* loaded from: classes4.dex */
public interface Signer {
    byte[] generateSignature();

    void init(boolean z11, CipherParameters cipherParameters);

    void reset();

    void update(byte b11);

    void update(byte[] bArr, int i11, int i12);

    boolean verifySignature(byte[] bArr);
}