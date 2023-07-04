package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;

/* loaded from: classes4.dex */
public class PaddedBlockCipher extends BufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i11) {
        int i12;
        int i13;
        int blockSize = this.cipher.getBlockSize();
        if (this.forEncryption) {
            if (this.bufOff != blockSize) {
                i13 = 0;
            } else if ((blockSize * 2) + i11 <= bArr.length) {
                i13 = this.cipher.processBlock(this.buf, 0, bArr, i11);
                this.bufOff = 0;
            } else {
                throw new DataLengthException("output buffer too short");
            }
            byte b11 = (byte) (blockSize - this.bufOff);
            while (true) {
                int i14 = this.bufOff;
                if (i14 >= blockSize) {
                    break;
                }
                this.buf[i14] = b11;
                this.bufOff = i14 + 1;
            }
            i12 = i13 + this.cipher.processBlock(this.buf, 0, bArr, i11 + i13);
        } else if (this.bufOff == blockSize) {
            BlockCipher blockCipher = this.cipher;
            byte[] bArr2 = this.buf;
            int processBlock = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            this.bufOff = 0;
            byte[] bArr3 = this.buf;
            int i15 = bArr3[blockSize - 1] & 255;
            if (i15 >= 0 && i15 <= blockSize) {
                i12 = processBlock - i15;
                System.arraycopy(bArr3, 0, bArr, i11, i12);
            } else {
                throw new InvalidCipherTextException("pad block corrupted");
            }
        } else {
            throw new DataLengthException("last block incomplete in decryption");
        }
        reset();
        return i12;
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
        return length == 0 ? i12 - bArr.length : i12 - length;
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
                throw new DataLengthException("output buffer too short");
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
}