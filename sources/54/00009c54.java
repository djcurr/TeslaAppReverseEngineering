package org.spongycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class CCMBlockCipher implements AEADBlockCipher {
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private CipherParameters keyParam;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public ExposedByteArrayOutputStream() {
        }

        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public CCMBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.macBlock = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    private int calculateMac(byte[] bArr, int i11, int i12, byte[] bArr2) {
        CBCBlockCipherMac cBCBlockCipherMac = new CBCBlockCipherMac(this.cipher, this.macSize * 8);
        cBCBlockCipherMac.init(this.keyParam);
        byte[] bArr3 = new byte[16];
        if (hasAssociatedText()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i13 = 2;
        bArr3[0] = (byte) (bArr3[0] | ((((cBCBlockCipherMac.getMacSize() - 2) / 2) & 7) << 3));
        byte b11 = bArr3[0];
        byte[] bArr4 = this.nonce;
        bArr3[0] = (byte) (b11 | (((15 - bArr4.length) - 1) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i14 = i12;
        int i15 = 1;
        while (i14 > 0) {
            bArr3[16 - i15] = (byte) (i14 & 255);
            i14 >>>= 8;
            i15++;
        }
        cBCBlockCipherMac.update(bArr3, 0, 16);
        if (hasAssociatedText()) {
            int associatedTextLength = getAssociatedTextLength();
            if (associatedTextLength < 65280) {
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
            } else {
                cBCBlockCipherMac.update((byte) -1);
                cBCBlockCipherMac.update((byte) -2);
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 24));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 16));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
                i13 = 6;
            }
            byte[] bArr5 = this.initialAssociatedText;
            if (bArr5 != null) {
                cBCBlockCipherMac.update(bArr5, 0, bArr5.length);
            }
            if (this.associatedText.size() > 0) {
                cBCBlockCipherMac.update(this.associatedText.getBuffer(), 0, this.associatedText.size());
            }
            int i16 = (i13 + associatedTextLength) % 16;
            if (i16 != 0) {
                while (i16 != 16) {
                    cBCBlockCipherMac.update((byte) 0);
                    i16++;
                }
            }
        }
        cBCBlockCipherMac.update(bArr, i11, i12);
        return cBCBlockCipherMac.doFinal(bArr2, 0);
    }

    private int getAssociatedTextLength() {
        int size = this.associatedText.size();
        byte[] bArr = this.initialAssociatedText;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private boolean hasAssociatedText() {
        return getAssociatedTextLength() > 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i11) {
        int processPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i11);
        reset();
        return processPacket;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CCM";
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
        int size = i11 + this.data.size();
        if (this.forEncryption) {
            return size + this.macSize;
        }
        int i12 = this.macSize;
        if (size < i12) {
            return 0;
        }
        return size - i12;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i11) {
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        CipherParameters parameters;
        this.forEncryption = z11;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.nonce = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.macBlock.length / 2;
            parameters = parametersWithIV.getParameters();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to CCM: " + cipherParameters.getClass().getName());
        }
        if (parameters != null) {
            this.keyParam = parameters;
        }
        byte[] bArr = this.nonce;
        if (bArr != null && bArr.length >= 7 && bArr.length <= 13) {
            reset();
            return;
        }
        throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b11) {
        this.associatedText.write(b11);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        this.associatedText.write(bArr, i11, i12);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        this.data.write(b11);
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (bArr.length >= i11 + i12) {
            this.data.write(bArr, i11, i12);
            return 0;
        }
        throw new DataLengthException("Input buffer too short");
    }

    public byte[] processPacket(byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        if (this.forEncryption) {
            bArr2 = new byte[this.macSize + i12];
        } else {
            int i13 = this.macSize;
            if (i12 >= i13) {
                bArr2 = new byte[i12 - i13];
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        }
        processPacket(bArr, i11, i12, bArr2, 0);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        this.cipher.reset();
        this.associatedText.reset();
        this.data.reset();
    }

    public int processPacket(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        if (this.keyParam != null) {
            byte[] bArr3 = this.nonce;
            int length = 15 - bArr3.length;
            if (length < 4 && i12 >= (1 << (length * 8))) {
                throw new IllegalStateException("CCM packet too large for choice of q.");
            }
            byte[] bArr4 = new byte[this.blockSize];
            bArr4[0] = (byte) ((length - 1) & 7);
            System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
            SICBlockCipher sICBlockCipher = new SICBlockCipher(this.cipher);
            sICBlockCipher.init(this.forEncryption, new ParametersWithIV(this.keyParam, bArr4));
            if (this.forEncryption) {
                int i15 = this.macSize + i12;
                if (bArr2.length >= i15 + i13) {
                    calculateMac(bArr, i11, i12, this.macBlock);
                    byte[] bArr5 = new byte[this.blockSize];
                    sICBlockCipher.processBlock(this.macBlock, 0, bArr5, 0);
                    int i16 = i11;
                    int i17 = i13;
                    while (true) {
                        int i18 = i11 + i12;
                        int i19 = this.blockSize;
                        if (i16 < i18 - i19) {
                            sICBlockCipher.processBlock(bArr, i16, bArr2, i17);
                            int i21 = this.blockSize;
                            i17 += i21;
                            i16 += i21;
                        } else {
                            byte[] bArr6 = new byte[i19];
                            int i22 = i18 - i16;
                            System.arraycopy(bArr, i16, bArr6, 0, i22);
                            sICBlockCipher.processBlock(bArr6, 0, bArr6, 0);
                            System.arraycopy(bArr6, 0, bArr2, i17, i22);
                            System.arraycopy(bArr5, 0, bArr2, i13 + i12, this.macSize);
                            return i15;
                        }
                    }
                } else {
                    throw new OutputLengthException("Output buffer too short.");
                }
            } else {
                int i23 = this.macSize;
                if (i12 >= i23) {
                    int i24 = i12 - i23;
                    if (bArr2.length >= i24 + i13) {
                        int i25 = i11 + i24;
                        System.arraycopy(bArr, i25, this.macBlock, 0, i23);
                        byte[] bArr7 = this.macBlock;
                        sICBlockCipher.processBlock(bArr7, 0, bArr7, 0);
                        int i26 = this.macSize;
                        while (true) {
                            byte[] bArr8 = this.macBlock;
                            if (i26 == bArr8.length) {
                                break;
                            }
                            bArr8[i26] = 0;
                            i26++;
                        }
                        int i27 = i11;
                        int i28 = i13;
                        while (true) {
                            i14 = this.blockSize;
                            if (i27 >= i25 - i14) {
                                break;
                            }
                            sICBlockCipher.processBlock(bArr, i27, bArr2, i28);
                            int i29 = this.blockSize;
                            i28 += i29;
                            i27 += i29;
                        }
                        byte[] bArr9 = new byte[i14];
                        int i31 = i24 - (i27 - i11);
                        System.arraycopy(bArr, i27, bArr9, 0, i31);
                        sICBlockCipher.processBlock(bArr9, 0, bArr9, 0);
                        System.arraycopy(bArr9, 0, bArr2, i28, i31);
                        byte[] bArr10 = new byte[this.blockSize];
                        calculateMac(bArr2, i13, i24, bArr10);
                        if (Arrays.constantTimeAreEqual(this.macBlock, bArr10)) {
                            return i24;
                        }
                        throw new InvalidCipherTextException("mac check in CCM failed");
                    }
                    throw new OutputLengthException("Output buffer too short.");
                }
                throw new InvalidCipherTextException("data too short");
            }
        } else {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
    }
}