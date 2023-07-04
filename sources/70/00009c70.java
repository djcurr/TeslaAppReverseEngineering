package org.spongycastle.crypto.paddings;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.ParametersWithRandom;

/* loaded from: classes4.dex */
public class PaddedBufferedBlockCipher extends BufferedBlockCipher {
    BlockCipherPadding padding;

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this.cipher = blockCipher;
        this.padding = blockCipherPadding;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i11) {
        int i12;
        int blockSize = this.cipher.getBlockSize();
        if (this.forEncryption) {
            if (this.bufOff != blockSize) {
                i12 = 0;
            } else if ((blockSize * 2) + i11 <= bArr.length) {
                i12 = this.cipher.processBlock(this.buf, 0, bArr, i11);
                this.bufOff = 0;
            } else {
                reset();
                throw new OutputLengthException("output buffer too short");
            }
            this.padding.addPadding(this.buf, this.bufOff);
            return i12 + this.cipher.processBlock(this.buf, 0, bArr, i11 + i12);
        } else if (this.bufOff == blockSize) {
            BlockCipher blockCipher = this.cipher;
            byte[] bArr2 = this.buf;
            int processBlock = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            this.bufOff = 0;
            try {
                int padCount = processBlock - this.padding.padCount(this.buf);
                System.arraycopy(this.buf, 0, bArr, i11, padCount);
                return padCount;
            } finally {
                reset();
            }
        } else {
            reset();
            throw new DataLengthException("last block incomplete in decryption");
        }
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i11) {
        int length;
        int i12 = i11 + this.bufOff;
        byte[] bArr = this.buf;
        int length2 = i12 % bArr.length;
        if (length2 == 0) {
            if (!this.forEncryption) {
                return i12;
            }
            length = bArr.length;
        } else {
            i12 -= length2;
            length = bArr.length;
        }
        return i12 + length;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.bufOff;
        byte[] bArr = this.buf;
        int length = i12 % bArr.length;
        return length == 0 ? Math.max(0, i12 - bArr.length) : i12 - length;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        reset();
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.padding.init(parametersWithRandom.getRandom());
            this.cipher.init(z11, parametersWithRandom.getParameters());
            return;
        }
        this.padding.init(null);
        this.cipher.init(z11, cipherParameters);
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        int i12 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i13 = 0;
        if (i12 == bArr2.length) {
            int processBlock = this.cipher.processBlock(bArr2, 0, bArr, i11);
            this.bufOff = 0;
            i13 = processBlock;
        }
        byte[] bArr3 = this.buf;
        int i14 = this.bufOff;
        this.bufOff = i14 + 1;
        bArr3[i14] = b11;
        return i13;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i12 >= 0) {
            int blockSize = getBlockSize();
            int updateOutputSize = getUpdateOutputSize(i12);
            if (updateOutputSize > 0 && updateOutputSize + i13 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            byte[] bArr3 = this.buf;
            int length = bArr3.length;
            int i14 = this.bufOff;
            int i15 = length - i14;
            int i16 = 0;
            if (i12 > i15) {
                System.arraycopy(bArr, i11, bArr3, i14, i15);
                this.bufOff = 0;
                i12 -= i15;
                i11 += i15;
                i16 = this.cipher.processBlock(this.buf, 0, bArr2, i13) + 0;
                while (i12 > this.buf.length) {
                    i16 += this.cipher.processBlock(bArr, i11, bArr2, i13 + i16);
                    i12 -= blockSize;
                    i11 += blockSize;
                }
            }
            System.arraycopy(bArr, i11, this.buf, this.bufOff, i12);
            this.bufOff += i12;
            return i16;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }
}