package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.DataLengthException;

/* loaded from: classes4.dex */
public class NISTCTSBlockCipher extends BufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;
    private final int blockSize;
    private final int type;

    public NISTCTSBlockCipher(int i11, BlockCipher blockCipher) {
        this.type = i11;
        this.cipher = new CBCBlockCipher(blockCipher);
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buf = new byte[blockSize * 2];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i11) {
        if (this.bufOff + i11 <= bArr.length) {
            int blockSize = this.cipher.getBlockSize();
            int i12 = this.bufOff;
            int i13 = i12 - blockSize;
            byte[] bArr2 = new byte[blockSize];
            if (this.forEncryption) {
                if (i12 < blockSize) {
                    throw new DataLengthException("need at least one block of input for NISTCTS");
                }
                if (i12 > blockSize) {
                    byte[] bArr3 = new byte[blockSize];
                    int i14 = this.type;
                    if (i14 != 2 && i14 != 3) {
                        System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                        this.cipher.processBlock(bArr2, 0, bArr2, 0);
                        System.arraycopy(bArr2, 0, bArr, i11, i13);
                        System.arraycopy(this.buf, this.bufOff - i13, bArr3, 0, i13);
                        this.cipher.processBlock(bArr3, 0, bArr3, 0);
                        System.arraycopy(bArr3, 0, bArr, i11 + i13, blockSize);
                    } else {
                        this.cipher.processBlock(this.buf, 0, bArr2, 0);
                        System.arraycopy(this.buf, blockSize, bArr3, 0, i13);
                        this.cipher.processBlock(bArr3, 0, bArr3, 0);
                        if (this.type == 2 && i13 == blockSize) {
                            System.arraycopy(bArr2, 0, bArr, i11, blockSize);
                            System.arraycopy(bArr3, 0, bArr, i11 + blockSize, i13);
                        } else {
                            System.arraycopy(bArr3, 0, bArr, i11, blockSize);
                            System.arraycopy(bArr2, 0, bArr, i11 + blockSize, i13);
                        }
                    }
                } else {
                    this.cipher.processBlock(this.buf, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i11, blockSize);
                }
            } else if (i12 >= blockSize) {
                byte[] bArr4 = new byte[blockSize];
                if (i12 > blockSize) {
                    int i15 = this.type;
                    if (i15 != 3 && (i15 != 2 || (this.buf.length - i12) % blockSize == 0)) {
                        ((CBCBlockCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, this.bufOff - blockSize, bArr4, 0);
                        System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                        if (i13 != blockSize) {
                            System.arraycopy(bArr4, i13, bArr2, i13, blockSize - i13);
                        }
                        this.cipher.processBlock(bArr2, 0, bArr2, 0);
                        System.arraycopy(bArr2, 0, bArr, i11, blockSize);
                        for (int i16 = 0; i16 != i13; i16++) {
                            bArr4[i16] = (byte) (bArr4[i16] ^ this.buf[i16]);
                        }
                        System.arraycopy(bArr4, 0, bArr, i11 + blockSize, i13);
                    } else {
                        BlockCipher blockCipher = this.cipher;
                        if (blockCipher instanceof CBCBlockCipher) {
                            ((CBCBlockCipher) blockCipher).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
                        } else {
                            blockCipher.processBlock(this.buf, 0, bArr2, 0);
                        }
                        for (int i17 = blockSize; i17 != this.bufOff; i17++) {
                            int i18 = i17 - blockSize;
                            bArr4[i18] = (byte) (bArr2[i18] ^ this.buf[i17]);
                        }
                        System.arraycopy(this.buf, blockSize, bArr2, 0, i13);
                        this.cipher.processBlock(bArr2, 0, bArr, i11);
                        System.arraycopy(bArr4, 0, bArr, i11 + blockSize, i13);
                    }
                } else {
                    this.cipher.processBlock(this.buf, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i11, blockSize);
                }
            } else {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            int i19 = this.bufOff;
            reset();
            return i19;
        }
        throw new DataLengthException("output buffer to small in doFinal");
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i11) {
        return i11 + this.bufOff;
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
            byte[] bArr3 = this.buf;
            int i14 = this.blockSize;
            System.arraycopy(bArr3, i14, bArr3, 0, i14);
            this.bufOff = this.blockSize;
            i13 = processBlock;
        }
        byte[] bArr4 = this.buf;
        int i15 = this.bufOff;
        this.bufOff = i15 + 1;
        bArr4[i15] = b11;
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
                int processBlock = this.cipher.processBlock(this.buf, 0, bArr2, i13) + 0;
                byte[] bArr4 = this.buf;
                System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
                this.bufOff = blockSize;
                i12 -= i15;
                i11 += i15;
                while (i12 > blockSize) {
                    System.arraycopy(bArr, i11, this.buf, this.bufOff, blockSize);
                    processBlock += this.cipher.processBlock(this.buf, 0, bArr2, i13 + processBlock);
                    byte[] bArr5 = this.buf;
                    System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                    i12 -= blockSize;
                    i11 += blockSize;
                }
                i16 = processBlock;
            }
            System.arraycopy(bArr, i11, this.buf, this.bufOff, i12);
            this.bufOff += i12;
            return i16;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}