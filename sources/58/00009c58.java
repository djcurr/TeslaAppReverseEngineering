package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.macs.CMac;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class EAXBlockCipher implements AEADBlockCipher {
    private static final byte cTAG = 2;
    private static final byte hTAG = 1;
    private static final byte nTAG = 0;
    private byte[] associatedTextMac;
    private int blockSize;
    private byte[] bufBlock;
    private int bufOff;
    private SICBlockCipher cipher;
    private boolean cipherInitialized;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private Mac mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonceMac;

    public EAXBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        CMac cMac = new CMac(blockCipher);
        this.mac = cMac;
        this.macBlock = new byte[this.blockSize];
        this.associatedTextMac = new byte[cMac.getMacSize()];
        this.nonceMac = new byte[this.mac.getMacSize()];
        this.cipher = new SICBlockCipher(blockCipher);
    }

    private void calculateMac() {
        byte[] bArr = new byte[this.blockSize];
        int i11 = 0;
        this.mac.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.macBlock;
            if (i11 >= bArr2.length) {
                return;
            }
            bArr2[i11] = (byte) ((this.nonceMac[i11] ^ this.associatedTextMac[i11]) ^ bArr[i11]);
            i11++;
        }
    }

    private void initCipher() {
        if (this.cipherInitialized) {
            return;
        }
        this.cipherInitialized = true;
        this.mac.doFinal(this.associatedTextMac, 0);
        int i11 = this.blockSize;
        byte[] bArr = new byte[i11];
        bArr[i11 - 1] = 2;
        this.mac.update(bArr, 0, i11);
    }

    private int process(byte b11, byte[] bArr, int i11) {
        int processBlock;
        byte[] bArr2 = this.bufBlock;
        int i12 = this.bufOff;
        int i13 = i12 + 1;
        this.bufOff = i13;
        bArr2[i12] = b11;
        if (i13 == bArr2.length) {
            int length = bArr.length;
            int i14 = this.blockSize;
            if (length >= i11 + i14) {
                if (this.forEncryption) {
                    processBlock = this.cipher.processBlock(bArr2, 0, bArr, i11);
                    this.mac.update(bArr, i11, this.blockSize);
                } else {
                    this.mac.update(bArr2, 0, i14);
                    processBlock = this.cipher.processBlock(this.bufBlock, 0, bArr, i11);
                }
                this.bufOff = 0;
                if (!this.forEncryption) {
                    byte[] bArr3 = this.bufBlock;
                    System.arraycopy(bArr3, this.blockSize, bArr3, 0, this.macSize);
                    this.bufOff = this.macSize;
                }
                return processBlock;
            }
            throw new OutputLengthException("Output buffer is too short");
        }
        return 0;
    }

    private boolean verifyMac(byte[] bArr, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < this.macSize; i13++) {
            i12 |= this.macBlock[i13] ^ bArr[i11 + i13];
        }
        return i12 == 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i11) {
        initCipher();
        int i12 = this.bufOff;
        byte[] bArr2 = this.bufBlock;
        byte[] bArr3 = new byte[bArr2.length];
        this.bufOff = 0;
        if (this.forEncryption) {
            int i13 = i11 + i12;
            if (bArr.length >= this.macSize + i13) {
                this.cipher.processBlock(bArr2, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i11, i12);
                this.mac.update(bArr3, 0, i12);
                calculateMac();
                System.arraycopy(this.macBlock, 0, bArr, i13, this.macSize);
                reset(false);
                return i12 + this.macSize;
            }
            throw new OutputLengthException("Output buffer too short");
        }
        int i14 = this.macSize;
        if (i12 >= i14) {
            if (bArr.length >= (i11 + i12) - i14) {
                if (i12 > i14) {
                    this.mac.update(bArr2, 0, i12 - i14);
                    this.cipher.processBlock(this.bufBlock, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i11, i12 - this.macSize);
                }
                calculateMac();
                if (verifyMac(this.bufBlock, i12 - this.macSize)) {
                    reset(false);
                    return i12 - this.macSize;
                }
                throw new InvalidCipherTextException("mac check in EAX failed");
            }
            throw new OutputLengthException("Output buffer too short");
        }
        throw new InvalidCipherTextException("data too short");
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + "/EAX";
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        int i11 = this.macSize;
        byte[] bArr = new byte[i11];
        System.arraycopy(this.macBlock, 0, bArr, 0, i11);
        return bArr;
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
        return this.cipher.getUnderlyingCipher();
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
        return i12 - (i12 % this.blockSize);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        byte[] iv2;
        CipherParameters parameters;
        this.forEncryption = z11;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv2 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.mac.getMacSize() / 2;
            parameters = parametersWithIV.getParameters();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        }
        this.bufBlock = new byte[z11 ? this.blockSize : this.blockSize + this.macSize];
        byte[] bArr = new byte[this.blockSize];
        this.mac.init(parameters);
        int i11 = this.blockSize;
        bArr[i11 - 1] = 0;
        this.mac.update(bArr, 0, i11);
        this.mac.update(iv2, 0, iv2.length);
        this.mac.doFinal(this.nonceMac, 0);
        this.cipher.init(true, new ParametersWithIV(null, this.nonceMac));
        reset();
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b11) {
        if (!this.cipherInitialized) {
            this.mac.update(b11);
            return;
        }
        throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        if (!this.cipherInitialized) {
            this.mac.update(bArr, i11, i12);
            return;
        }
        throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        initCipher();
        return process(b11, bArr, i11);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        initCipher();
        if (bArr.length >= i11 + i12) {
            int i14 = 0;
            for (int i15 = 0; i15 != i12; i15++) {
                i14 += process(bArr[i11 + i15], bArr2, i13 + i14);
            }
            return i14;
        }
        throw new DataLengthException("Input buffer too short");
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z11) {
        this.cipher.reset();
        this.mac.reset();
        this.bufOff = 0;
        Arrays.fill(this.bufBlock, (byte) 0);
        if (z11) {
            Arrays.fill(this.macBlock, (byte) 0);
        }
        int i11 = this.blockSize;
        byte[] bArr = new byte[i11];
        bArr[i11 - 1] = 1;
        this.mac.update(bArr, 0, i11);
        this.cipherInitialized = false;
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}