package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface p {
    int doFinal(byte[] bArr, int i11);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b11);

    void update(byte[] bArr, int i11, int i12);
}