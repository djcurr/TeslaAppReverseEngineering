package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface z {
    byte[] generateSignature();

    void init(boolean z11, i iVar);

    void update(byte b11);

    void update(byte[] bArr, int i11, int i12);

    boolean verifySignature(byte[] bArr);
}