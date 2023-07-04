package org.spongycastle.crypto;

/* loaded from: classes4.dex */
public interface KeyEncapsulation {
    CipherParameters decrypt(byte[] bArr, int i11, int i12, int i13);

    CipherParameters encrypt(byte[] bArr, int i11, int i12);

    void init(CipherParameters cipherParameters);
}