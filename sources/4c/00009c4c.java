package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;

/* loaded from: classes4.dex */
class MacCFBBlockCipher {
    private byte[] IV;
    private int blockSize;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;

    public MacCFBBlockCipher(BlockCipher blockCipher, int i11) {
        this.cipher = null;
        this.cipher = blockCipher;
        this.blockSize = i11 / 8;
        this.IV = new byte[blockCipher.getBlockSize()];
        this.cfbV = new byte[blockCipher.getBlockSize()];
        this.cfbOutV = new byte[blockCipher.getBlockSize()];
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CFB" + (this.blockSize * 8);
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getMacBlock(byte[] bArr) {
        this.cipher.processBlock(this.cfbV, 0, bArr, 0);
    }

    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            int length = iv2.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv2, 0, bArr, bArr.length - iv2.length, iv2.length);
            } else {
                System.arraycopy(iv2, 0, bArr, 0, bArr.length);
            }
            reset();
            this.cipher.init(true, parametersWithIV.getParameters());
            return;
        }
        reset();
        this.cipher.init(true, cipherParameters);
    }

    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.blockSize;
        if (i11 + i13 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
                int i14 = 0;
                while (true) {
                    int i15 = this.blockSize;
                    if (i14 < i15) {
                        bArr2[i12 + i14] = (byte) (this.cfbOutV[i14] ^ bArr[i11 + i14]);
                        i14++;
                    } else {
                        byte[] bArr3 = this.cfbV;
                        System.arraycopy(bArr3, i15, bArr3, 0, bArr3.length - i15);
                        byte[] bArr4 = this.cfbV;
                        int length = bArr4.length;
                        int i16 = this.blockSize;
                        System.arraycopy(bArr2, i12, bArr4, length - i16, i16);
                        return this.blockSize;
                    }
                }
            } else {
                throw new DataLengthException("output buffer too short");
            }
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cfbV, 0, bArr.length);
        this.cipher.reset();
    }
}