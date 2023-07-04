package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface e {
    String getAlgorithmName();

    int getBlockSize();

    void init(boolean z11, i iVar);

    int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12);

    void reset();
}