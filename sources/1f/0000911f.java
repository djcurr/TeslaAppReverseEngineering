package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface c0 {
    String getAlgorithmName();

    void init(boolean z11, i iVar);

    byte[] unwrap(byte[] bArr, int i11, int i12);

    byte[] wrap(byte[] bArr, int i11, int i12);
}