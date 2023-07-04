package org.spongycastle.crypto;

/* loaded from: classes4.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i11, int i12);

    void init(DerivationParameters derivationParameters);
}