package org.spongycastle.crypto;

/* loaded from: classes4.dex */
public interface Mac {
    int doFinal(byte[] bArr, int i11);

    String getAlgorithmName();

    int getMacSize();

    void init(CipherParameters cipherParameters);

    void reset();

    void update(byte b11);

    void update(byte[] bArr, int i11, int i12);
}