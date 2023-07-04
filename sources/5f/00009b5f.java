package org.spongycastle.crypto;

/* loaded from: classes4.dex */
public interface Wrapper {
    String getAlgorithmName();

    void init(boolean z11, CipherParameters cipherParameters);

    byte[] unwrap(byte[] bArr, int i11, int i12);

    byte[] wrap(byte[] bArr, int i11, int i12);
}