package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.modes.gcm.GCMExponentiator;
import org.spongycastle.crypto.modes.gcm.GCMMultiplier;
import org.spongycastle.crypto.modes.gcm.GCMUtil;
import org.spongycastle.crypto.modes.gcm.Tables1kGCMExponentiator;
import org.spongycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class GCMBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] H;
    private byte[] J0;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private int blocksRemaining;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] lastKey;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    private void gCTRBlock(byte[] bArr, byte[] bArr2, int i11) {
        byte[] nextCounterBlock = getNextCounterBlock();
        GCMUtil.xor(nextCounterBlock, bArr);
        System.arraycopy(nextCounterBlock, 0, bArr2, i11, 16);
        byte[] bArr3 = this.S;
        if (this.forEncryption) {
            bArr = nextCounterBlock;
        }
        gHASHBlock(bArr3, bArr);
        this.totalLength += 16;
    }

    private void gCTRPartial(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte[] nextCounterBlock = getNextCounterBlock();
        GCMUtil.xor(nextCounterBlock, bArr, i11, i12);
        System.arraycopy(nextCounterBlock, 0, bArr2, i13, i12);
        byte[] bArr3 = this.S;
        if (this.forEncryption) {
            bArr = nextCounterBlock;
        }
        gHASHPartial(bArr3, bArr, 0, i12);
        this.totalLength += i12;
    }

    private void gHASH(byte[] bArr, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 16) {
            gHASHPartial(bArr, bArr2, i12, Math.min(i11 - i12, 16));
        }
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        GCMUtil.xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i11, int i12) {
        GCMUtil.xor(bArr, bArr2, i11, i12);
        this.multiplier.multiplyH(bArr);
    }

    private byte[] getNextCounterBlock() {
        int i11 = this.blocksRemaining;
        if (i11 != 0) {
            this.blocksRemaining = i11 - 1;
            byte[] bArr = this.counter;
            int i12 = (bArr[15] & 255) + 1;
            bArr[15] = (byte) i12;
            int i13 = (i12 >>> 8) + (bArr[14] & 255);
            bArr[14] = (byte) i13;
            int i14 = (i13 >>> 8) + (bArr[13] & 255);
            bArr[13] = (byte) i14;
            bArr[12] = (byte) ((i14 >>> 8) + (bArr[12] & 255));
            byte[] bArr2 = new byte[16];
            this.cipher.processBlock(bArr, 0, bArr2, 0);
            return bArr2;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    private void initCipher() {
        if (this.atLength > 0) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.atLengthPre = this.atLength;
        }
        int i11 = this.atBlockPos;
        if (i11 > 0) {
            gHASHPartial(this.S_atPre, this.atBlock, 0, i11);
            this.atLengthPre += this.atBlockPos;
        }
        if (this.atLengthPre > 0) {
            System.arraycopy(this.S_atPre, 0, this.S, 0, 16);
        }
    }

    private void outputBlock(byte[] bArr, int i11) {
        if (bArr.length >= i11 + 16) {
            if (this.totalLength == 0) {
                initCipher();
            }
            gCTRBlock(this.bufBlock, bArr, i11);
            if (this.forEncryption) {
                this.bufOff = 0;
                return;
            }
            byte[] bArr2 = this.bufBlock;
            System.arraycopy(bArr2, 16, bArr2, 0, this.macSize);
            this.bufOff = this.macSize;
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i11) {
        if (this.totalLength == 0) {
            initCipher();
        }
        int i12 = this.bufOff;
        if (this.forEncryption) {
            if (bArr.length < i11 + i12 + this.macSize) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else {
            int i13 = this.macSize;
            if (i12 >= i13) {
                i12 -= i13;
                if (bArr.length < i11 + i12) {
                    throw new OutputLengthException("Output buffer too short");
                }
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        }
        if (i12 > 0) {
            gCTRPartial(this.bufBlock, 0, i12, bArr, i11);
        }
        long j11 = this.atLength;
        int i14 = this.atBlockPos;
        long j12 = j11 + i14;
        this.atLength = j12;
        if (j12 > this.atLengthPre) {
            if (i14 > 0) {
                gHASHPartial(this.S_at, this.atBlock, 0, i14);
            }
            if (this.atLengthPre > 0) {
                GCMUtil.xor(this.S_at, this.S_atPre);
            }
            long j13 = ((this.totalLength * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.exp == null) {
                Tables1kGCMExponentiator tables1kGCMExponentiator = new Tables1kGCMExponentiator();
                this.exp = tables1kGCMExponentiator;
                tables1kGCMExponentiator.init(this.H);
            }
            this.exp.exponentiateX(j13, bArr2);
            GCMUtil.multiply(this.S_at, bArr2);
            GCMUtil.xor(this.S, this.S_at);
        }
        byte[] bArr3 = new byte[16];
        Pack.longToBigEndian(this.atLength * 8, bArr3, 0);
        Pack.longToBigEndian(this.totalLength * 8, bArr3, 8);
        gHASHBlock(this.S, bArr3);
        byte[] bArr4 = new byte[16];
        this.cipher.processBlock(this.J0, 0, bArr4, 0);
        GCMUtil.xor(bArr4, this.S);
        int i15 = this.macSize;
        byte[] bArr5 = new byte[i15];
        this.macBlock = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i15);
        if (this.forEncryption) {
            System.arraycopy(this.macBlock, 0, bArr, i11 + this.bufOff, this.macSize);
            i12 += this.macSize;
        } else {
            int i16 = this.macSize;
            byte[] bArr6 = new byte[i16];
            System.arraycopy(this.bufBlock, i12, bArr6, 0, i16);
            if (!Arrays.constantTimeAreEqual(this.macBlock, bArr6)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        reset(false);
        return i12;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCM";
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        if (bArr == null) {
            return new byte[this.macSize];
        }
        return Arrays.clone(bArr);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i11) {
        int i12 = i11 + this.bufOff;
        if (this.forEncryption) {
            return i12 + this.macSize;
        }
        int i13 = this.macSize;
        if (i12 < i13) {
            return 0;
        }
        return i12 - i13;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.bufOff;
        if (!this.forEncryption) {
            int i13 = this.macSize;
            if (i12 < i13) {
                return 0;
            }
            i12 -= i13;
        }
        return i12 - (i12 % 16);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        byte[] iv2;
        KeyParameter keyParameter;
        byte[] bArr;
        this.forEncryption = z11;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize >= 32 && macSize <= 128 && macSize % 8 == 0) {
                this.macSize = macSize / 8;
                keyParameter = aEADParameters.getKey();
            } else {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv2 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        this.bufBlock = new byte[z11 ? 16 : this.macSize + 16];
        if (iv2 != null && iv2.length >= 1) {
            if (z11 && (bArr = this.nonce) != null && Arrays.areEqual(bArr, iv2)) {
                if (keyParameter != null) {
                    byte[] bArr2 = this.lastKey;
                    if (bArr2 != null && Arrays.areEqual(bArr2, keyParameter.getKey())) {
                        throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                    }
                } else {
                    throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                }
            }
            this.nonce = iv2;
            if (keyParameter != null) {
                this.lastKey = keyParameter.getKey();
            }
            if (keyParameter != null) {
                this.cipher.init(true, keyParameter);
                byte[] bArr3 = new byte[16];
                this.H = bArr3;
                this.cipher.processBlock(bArr3, 0, bArr3, 0);
                this.multiplier.init(this.H);
                this.exp = null;
            } else if (this.H == null) {
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
            byte[] bArr4 = new byte[16];
            this.J0 = bArr4;
            byte[] bArr5 = this.nonce;
            if (bArr5.length == 12) {
                System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                this.J0[15] = 1;
            } else {
                gHASH(bArr4, bArr5, bArr5.length);
                byte[] bArr6 = new byte[16];
                Pack.longToBigEndian(this.nonce.length * 8, bArr6, 8);
                gHASHBlock(this.J0, bArr6);
            }
            this.S = new byte[16];
            this.S_at = new byte[16];
            this.S_atPre = new byte[16];
            this.atBlock = new byte[16];
            this.atBlockPos = 0;
            this.atLength = 0L;
            this.atLengthPre = 0L;
            this.counter = Arrays.clone(this.J0);
            this.blocksRemaining = -2;
            this.bufOff = 0;
            this.totalLength = 0L;
            byte[] bArr7 = this.initialAssociatedText;
            if (bArr7 != null) {
                processAADBytes(bArr7, 0, bArr7.length);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("IV must be at least 1 byte");
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b11) {
        byte[] bArr = this.atBlock;
        int i11 = this.atBlockPos;
        bArr[i11] = b11;
        int i12 = i11 + 1;
        this.atBlockPos = i12;
        if (i12 == 16) {
            gHASHBlock(this.S_at, bArr);
            this.atBlockPos = 0;
            this.atLength += 16;
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr2 = this.atBlock;
            int i14 = this.atBlockPos;
            bArr2[i14] = bArr[i11 + i13];
            int i15 = i14 + 1;
            this.atBlockPos = i15;
            if (i15 == 16) {
                gHASHBlock(this.S_at, bArr2);
                this.atBlockPos = 0;
                this.atLength += 16;
            }
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        byte[] bArr2 = this.bufBlock;
        int i12 = this.bufOff;
        bArr2[i12] = b11;
        int i13 = i12 + 1;
        this.bufOff = i13;
        if (i13 == bArr2.length) {
            outputBlock(bArr, i11);
            return 16;
        }
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (bArr.length >= i11 + i12) {
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                byte[] bArr3 = this.bufBlock;
                int i16 = this.bufOff;
                bArr3[i16] = bArr[i11 + i15];
                int i17 = i16 + 1;
                this.bufOff = i17;
                if (i17 == bArr3.length) {
                    outputBlock(bArr2, i13 + i14);
                    i14 += 16;
                }
            }
            return i14;
        }
        throw new DataLengthException("Input buffer too short");
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        reset(true);
    }

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() == 16) {
            gCMMultiplier = gCMMultiplier == null ? new Tables8kGCMMultiplier() : gCMMultiplier;
            this.cipher = blockCipher;
            this.multiplier = gCMMultiplier;
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    private void reset(boolean z11) {
        this.cipher.reset();
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr = this.bufBlock;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z11) {
            this.macBlock = null;
        }
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}