package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface a {
    int getInputBlockSize();

    int getOutputBlockSize();

    void init(boolean z11, i iVar);

    byte[] processBlock(byte[] bArr, int i11, int i12);
}