package org.spongycastle.crypto.prng.drbg;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.prng.EntropySource;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes4.dex */
public class CTRSP800DRBG implements SP80090DRBG {
    private static final int AES_MAX_BITS_REQUEST = 262144;
    private static final long AES_RESEED_MAX = 140737488355328L;
    private static final byte[] K_BITS = Hex.decode("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    private static final int TDEA_MAX_BITS_REQUEST = 4096;
    private static final long TDEA_RESEED_MAX = 2147483648L;
    private byte[] _Key;
    private byte[] _V;
    private BlockCipher _engine;
    private EntropySource _entropySource;
    private boolean _isTDEA;
    private int _keySizeInBits;
    private long _reseedCounter = 0;
    private int _securityStrength;
    private int _seedLength;

    public CTRSP800DRBG(BlockCipher blockCipher, int i11, int i12, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this._isTDEA = false;
        this._entropySource = entropySource;
        this._engine = blockCipher;
        this._keySizeInBits = i11;
        this._securityStrength = i12;
        this._seedLength = (blockCipher.getBlockSize() * 8) + i11;
        this._isTDEA = isTDEA(blockCipher);
        if (i12 <= 256) {
            if (getMaxSecurityStrength(blockCipher, i11) >= i12) {
                if (entropySource.entropySize() >= i12) {
                    CTR_DRBG_Instantiate_algorithm(getEntropy(), bArr2, bArr);
                    return;
                }
                throw new IllegalArgumentException("Not enough entropy for security strength required");
            }
            throw new IllegalArgumentException("Requested security strength is not supported by block cipher and key size");
        }
        throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
    }

    private void BCC(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int blockSize = this._engine.getBlockSize();
        byte[] bArr5 = new byte[blockSize];
        int length = bArr4.length / blockSize;
        byte[] bArr6 = new byte[blockSize];
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        this._engine.processBlock(bArr3, 0, bArr5, 0);
        for (int i11 = 0; i11 < length; i11++) {
            XOR(bArr6, bArr5, bArr4, i11 * blockSize);
            this._engine.processBlock(bArr6, 0, bArr5, 0);
        }
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
    }

    private byte[] Block_Cipher_df(byte[] bArr, int i11) {
        int blockSize = this._engine.getBlockSize();
        int length = bArr.length;
        int i12 = length + 8;
        byte[] bArr2 = new byte[((((i12 + 1) + blockSize) - 1) / blockSize) * blockSize];
        copyIntToByteArray(bArr2, length, 0);
        copyIntToByteArray(bArr2, i11 / 8, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[i12] = Byte.MIN_VALUE;
        int i13 = this._keySizeInBits;
        int i14 = (i13 / 8) + blockSize;
        byte[] bArr3 = new byte[i14];
        byte[] bArr4 = new byte[blockSize];
        byte[] bArr5 = new byte[blockSize];
        int i15 = i13 / 8;
        byte[] bArr6 = new byte[i15];
        System.arraycopy(K_BITS, 0, bArr6, 0, i15);
        int i16 = 0;
        while (true) {
            int i17 = i16 * blockSize;
            if (i17 * 8 >= this._keySizeInBits + (blockSize * 8)) {
                break;
            }
            copyIntToByteArray(bArr5, i16, 0);
            BCC(bArr4, bArr6, bArr5, bArr2);
            int i18 = i14 - i17;
            if (i18 > blockSize) {
                i18 = blockSize;
            }
            System.arraycopy(bArr4, 0, bArr3, i17, i18);
            i16++;
        }
        byte[] bArr7 = new byte[blockSize];
        System.arraycopy(bArr3, 0, bArr6, 0, i15);
        System.arraycopy(bArr3, i15, bArr7, 0, blockSize);
        int i19 = i11 / 2;
        byte[] bArr8 = new byte[i19];
        this._engine.init(true, new KeyParameter(expandKey(bArr6)));
        int i21 = 0;
        while (true) {
            int i22 = i21 * blockSize;
            if (i22 >= i19) {
                return bArr8;
            }
            this._engine.processBlock(bArr7, 0, bArr7, 0);
            int i23 = i19 - i22;
            if (i23 > blockSize) {
                i23 = blockSize;
            }
            System.arraycopy(bArr7, 0, bArr8, i22, i23);
            i21++;
        }
    }

    private void CTR_DRBG_Instantiate_algorithm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] Block_Cipher_df = Block_Cipher_df(Arrays.concatenate(bArr, bArr2, bArr3), this._seedLength);
        int blockSize = this._engine.getBlockSize();
        byte[] bArr4 = new byte[(this._keySizeInBits + 7) / 8];
        this._Key = bArr4;
        byte[] bArr5 = new byte[blockSize];
        this._V = bArr5;
        CTR_DRBG_Update(Block_Cipher_df, bArr4, bArr5);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Reseed_algorithm(byte[] bArr) {
        CTR_DRBG_Update(Block_Cipher_df(Arrays.concatenate(getEntropy(), bArr), this._seedLength), this._Key, this._V);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this._engine.getBlockSize()];
        int blockSize = this._engine.getBlockSize();
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        int i11 = 0;
        while (true) {
            int i12 = i11 * blockSize;
            if (i12 < bArr.length) {
                addOneTo(bArr3);
                this._engine.processBlock(bArr3, 0, bArr5, 0);
                int i13 = length - i12;
                if (i13 > blockSize) {
                    i13 = blockSize;
                }
                System.arraycopy(bArr5, 0, bArr4, i12, i13);
                i11++;
            } else {
                XOR(bArr4, bArr, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                return;
            }
        }
    }

    private void XOR(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        for (int i12 = 0; i12 < bArr.length; i12++) {
            bArr[i12] = (byte) (bArr2[i12] ^ bArr3[i12 + i11]);
        }
    }

    private void addOneTo(byte[] bArr) {
        int i11 = 1;
        for (int i12 = 1; i12 <= bArr.length; i12++) {
            int i13 = (bArr[bArr.length - i12] & 255) + i11;
            i11 = i13 > 255 ? 1 : 0;
            bArr[bArr.length - i12] = (byte) i13;
        }
    }

    private void copyIntToByteArray(byte[] bArr, int i11, int i12) {
        bArr[i12 + 0] = (byte) (i11 >> 24);
        bArr[i12 + 1] = (byte) (i11 >> 16);
        bArr[i12 + 2] = (byte) (i11 >> 8);
        bArr[i12 + 3] = (byte) i11;
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private int getMaxSecurityStrength(BlockCipher blockCipher, int i11) {
        if (isTDEA(blockCipher) && i11 == 168) {
            return 112;
        }
        if (blockCipher.getAlgorithmName().equals("AES")) {
            return i11;
        }
        return -1;
    }

    private boolean isTDEA(BlockCipher blockCipher) {
        return blockCipher.getAlgorithmName().equals("DESede") || blockCipher.getAlgorithmName().equals("TDEA");
    }

    private void padKey(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = i11 + 0;
        bArr2[i12 + 0] = (byte) (bArr[i13] & 254);
        int i14 = i11 + 1;
        bArr2[i12 + 1] = (byte) ((bArr[i13] << 7) | ((bArr[i14] & 252) >>> 1));
        int i15 = i11 + 2;
        bArr2[i12 + 2] = (byte) ((bArr[i14] << 6) | ((bArr[i15] & 248) >>> 2));
        int i16 = i11 + 3;
        bArr2[i12 + 3] = (byte) ((bArr[i15] << 5) | ((bArr[i16] & 240) >>> 3));
        int i17 = i11 + 4;
        bArr2[i12 + 4] = (byte) ((bArr[i16] << 4) | ((bArr[i17] & 224) >>> 4));
        int i18 = i11 + 5;
        bArr2[i12 + 5] = (byte) ((bArr[i17] << 3) | ((bArr[i18] & 192) >>> 5));
        int i19 = i11 + 6;
        bArr2[i12 + 6] = (byte) ((bArr[i18] << 2) | ((bArr[i19] & 128) >>> 6));
        int i21 = i12 + 7;
        bArr2[i21] = (byte) (bArr[i19] << 1);
        while (i12 <= i21) {
            byte b11 = bArr2[i12];
            bArr2[i12] = (byte) (((((b11 >> 7) ^ ((((((b11 >> 1) ^ (b11 >> 2)) ^ (b11 >> 3)) ^ (b11 >> 4)) ^ (b11 >> 5)) ^ (b11 >> 6))) ^ 1) & 1) | (b11 & 254));
            i12++;
        }
    }

    byte[] expandKey(byte[] bArr) {
        if (this._isTDEA) {
            byte[] bArr2 = new byte[24];
            padKey(bArr, 0, bArr2, 0);
            padKey(bArr, 7, bArr2, 8);
            padKey(bArr, 14, bArr2, 16);
            return bArr2;
        }
        return bArr;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z11) {
        byte[] bArr3;
        if (this._isTDEA) {
            if (this._reseedCounter > TDEA_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else if (this._reseedCounter > AES_RESEED_MAX) {
            return -1;
        } else {
            if (Utils.isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z11) {
            CTR_DRBG_Reseed_algorithm(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            bArr3 = Block_Cipher_df(bArr2, this._seedLength);
            CTR_DRBG_Update(bArr3, this._Key, this._V);
        } else {
            bArr3 = new byte[this._seedLength];
        }
        int length = this._V.length;
        byte[] bArr4 = new byte[length];
        this._engine.init(true, new KeyParameter(expandKey(this._Key)));
        for (int i11 = 0; i11 <= bArr.length / length; i11++) {
            int i12 = i11 * length;
            int length2 = bArr.length - i12 > length ? length : bArr.length - (this._V.length * i11);
            if (length2 != 0) {
                addOneTo(this._V);
                this._engine.processBlock(this._V, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr, i12, length2);
            }
        }
        CTR_DRBG_Update(bArr3, this._Key, this._V);
        this._reseedCounter++;
        return bArr.length * 8;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._V.length * 8;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        CTR_DRBG_Reseed_algorithm(bArr);
    }
}