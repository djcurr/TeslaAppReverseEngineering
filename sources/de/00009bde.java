package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;

/* loaded from: classes4.dex */
public class DESedeEngine extends DESEngine {
    protected static final int BLOCK_SIZE = 8;
    private boolean forEncryption;
    private int[] workingKey1 = null;
    private int[] workingKey2 = null;
    private int[] workingKey3 = null;

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            if (key.length != 24 && key.length != 16) {
                throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
            }
            this.forEncryption = z11;
            byte[] bArr = new byte[8];
            System.arraycopy(key, 0, bArr, 0, 8);
            this.workingKey1 = generateWorkingKey(z11, bArr);
            byte[] bArr2 = new byte[8];
            System.arraycopy(key, 8, bArr2, 0, 8);
            this.workingKey2 = generateWorkingKey(!z11, bArr2);
            if (key.length == 24) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(key, 16, bArr3, 0, 8);
                this.workingKey3 = generateWorkingKey(z11, bArr3);
                return;
            }
            this.workingKey3 = this.workingKey1;
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to DESede init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = this.workingKey1;
        if (iArr != null) {
            if (i11 + 8 <= bArr.length) {
                if (i12 + 8 <= bArr2.length) {
                    byte[] bArr3 = new byte[8];
                    if (this.forEncryption) {
                        desFunc(iArr, bArr, i11, bArr3, 0);
                        desFunc(this.workingKey2, bArr3, 0, bArr3, 0);
                        desFunc(this.workingKey3, bArr3, 0, bArr2, i12);
                    } else {
                        desFunc(this.workingKey3, bArr, i11, bArr3, 0);
                        desFunc(this.workingKey2, bArr3, 0, bArr3, 0);
                        desFunc(this.workingKey1, bArr3, 0, bArr2, i12);
                    }
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("DESede engine not initialised");
    }

    @Override // org.spongycastle.crypto.engines.DESEngine, org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}