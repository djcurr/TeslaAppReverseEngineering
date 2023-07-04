package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;

/* loaded from: classes4.dex */
public class NullEngine implements BlockCipher {
    protected static final int DEFAULT_BLOCK_SIZE = 1;
    private final int blockSize;
    private boolean initialised;

    public NullEngine() {
        this(1);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Null";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.initialised) {
            int i13 = this.blockSize;
            if (i11 + i13 <= bArr.length) {
                if (i13 + i12 > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                int i14 = 0;
                while (true) {
                    int i15 = this.blockSize;
                    if (i14 >= i15) {
                        return i15;
                    }
                    bArr2[i12 + i14] = bArr[i11 + i14];
                    i14++;
                }
            } else {
                throw new DataLengthException("input buffer too short");
            }
        } else {
            throw new IllegalStateException("Null engine not initialised");
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    public NullEngine(int i11) {
        this.blockSize = i11;
    }
}