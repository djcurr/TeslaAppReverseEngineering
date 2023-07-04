package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;

/* loaded from: classes4.dex */
public class OpenPGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;

    public OpenPGPCFBBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14;
        int i15 = this.blockSize;
        if (i11 + i15 <= bArr.length) {
            if (i12 + i15 <= bArr2.length) {
                int i16 = this.count;
                int i17 = 2;
                int i18 = 0;
                if (i16 > i15) {
                    byte b11 = bArr[i11];
                    this.FR[i15 - 2] = b11;
                    bArr2[i12] = encryptByte(b11, i15 - 2);
                    byte b12 = bArr[i11 + 1];
                    byte[] bArr3 = this.FR;
                    int i19 = this.blockSize;
                    bArr3[i19 - 1] = b12;
                    bArr2[i12 + 1] = encryptByte(b12, i19 - 1);
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (i17 < this.blockSize) {
                        byte b13 = bArr[i11 + i17];
                        int i21 = i17 - 2;
                        this.FR[i21] = b13;
                        bArr2[i12 + i17] = encryptByte(b13, i21);
                        i17++;
                    }
                } else if (i16 == 0) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (true) {
                        i14 = this.blockSize;
                        if (i18 >= i14) {
                            break;
                        }
                        int i22 = i11 + i18;
                        this.FR[i18] = bArr[i22];
                        bArr2[i18] = encryptByte(bArr[i22], i18);
                        i18++;
                    }
                    this.count += i14;
                } else if (i16 == i15) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    byte b14 = bArr[i11];
                    byte b15 = bArr[i11 + 1];
                    bArr2[i12] = encryptByte(b14, 0);
                    bArr2[i12 + 1] = encryptByte(b15, 1);
                    byte[] bArr4 = this.FR;
                    System.arraycopy(bArr4, 2, bArr4, 0, this.blockSize - 2);
                    byte[] bArr5 = this.FR;
                    int i23 = this.blockSize;
                    bArr5[i23 - 2] = b14;
                    bArr5[i23 - 1] = b15;
                    this.cipher.processBlock(bArr5, 0, this.FRE, 0);
                    while (true) {
                        i13 = this.blockSize;
                        if (i17 >= i13) {
                            break;
                        }
                        byte b16 = bArr[i11 + i17];
                        int i24 = i17 - 2;
                        this.FR[i24] = b16;
                        bArr2[i12 + i17] = encryptByte(b16, i24);
                        i17++;
                    }
                    this.count += i13;
                }
                return this.blockSize;
            }
            throw new DataLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14;
        int i15 = this.blockSize;
        if (i11 + i15 <= bArr.length) {
            if (i12 + i15 <= bArr2.length) {
                int i16 = this.count;
                int i17 = 2;
                int i18 = 0;
                if (i16 > i15) {
                    byte[] bArr3 = this.FR;
                    int i19 = i15 - 2;
                    byte encryptByte = encryptByte(bArr[i11], i15 - 2);
                    bArr2[i12] = encryptByte;
                    bArr3[i19] = encryptByte;
                    byte[] bArr4 = this.FR;
                    int i21 = this.blockSize;
                    int i22 = i21 - 1;
                    byte encryptByte2 = encryptByte(bArr[i11 + 1], i21 - 1);
                    bArr2[i12 + 1] = encryptByte2;
                    bArr4[i22] = encryptByte2;
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (i17 < this.blockSize) {
                        byte[] bArr5 = this.FR;
                        int i23 = i17 - 2;
                        byte encryptByte3 = encryptByte(bArr[i11 + i17], i23);
                        bArr2[i12 + i17] = encryptByte3;
                        bArr5[i23] = encryptByte3;
                        i17++;
                    }
                } else if (i16 == 0) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (true) {
                        i14 = this.blockSize;
                        if (i18 >= i14) {
                            break;
                        }
                        byte[] bArr6 = this.FR;
                        byte encryptByte4 = encryptByte(bArr[i11 + i18], i18);
                        bArr2[i12 + i18] = encryptByte4;
                        bArr6[i18] = encryptByte4;
                        i18++;
                    }
                    this.count += i14;
                } else if (i16 == i15) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    bArr2[i12] = encryptByte(bArr[i11], 0);
                    bArr2[i12 + 1] = encryptByte(bArr[i11 + 1], 1);
                    byte[] bArr7 = this.FR;
                    System.arraycopy(bArr7, 2, bArr7, 0, this.blockSize - 2);
                    System.arraycopy(bArr2, i12, this.FR, this.blockSize - 2, 2);
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (true) {
                        i13 = this.blockSize;
                        if (i17 >= i13) {
                            break;
                        }
                        byte[] bArr8 = this.FR;
                        int i24 = i17 - 2;
                        byte encryptByte5 = encryptByte(bArr[i11 + i17], i24);
                        bArr2[i12 + i17] = encryptByte5;
                        bArr8[i24] = encryptByte5;
                        i17++;
                    }
                    this.count += i13;
                }
                return this.blockSize;
            }
            throw new DataLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    private byte encryptByte(byte b11, int i11) {
        return (byte) (b11 ^ this.FRE[i11]);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.forEncryption ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        byte[] bArr = this.IV;
        byte[] bArr2 = this.FR;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.cipher.reset();
    }
}