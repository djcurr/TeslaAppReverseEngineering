package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public interface AEADBlockCipher {
    int doFinal(byte[] bArr, int i11);

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i11);

    BlockCipher getUnderlyingCipher();

    int getUpdateOutputSize(int i11);

    void init(boolean z11, CipherParameters cipherParameters);

    void processAADByte(byte b11);

    void processAADBytes(byte[] bArr, int i11, int i12);

    int processByte(byte b11, byte[] bArr, int i11);

    int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    void reset();
}