package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface b0 {
    String getAlgorithmName();

    void init(boolean z11, i iVar);

    int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    void reset();
}