package org.spongycastle.crypto.modes;

import java.util.Vector;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class OCBBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] Checksum;
    private Vector L;
    private byte[] L_Asterisk;
    private byte[] L_Dollar;
    private byte[] OffsetHASH;
    private byte[] Sum;
    private boolean forEncryption;
    private byte[] hashBlock;
    private long hashBlockCount;
    private int hashBlockPos;
    private BlockCipher hashCipher;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private byte[] mainBlock;
    private long mainBlockCount;
    private int mainBlockPos;
    private BlockCipher mainCipher;
    private byte[] KtopInput = null;
    private byte[] Stretch = new byte[24];
    private byte[] OffsetMAIN_0 = new byte[16];
    private byte[] OffsetMAIN = new byte[16];

    public OCBBlockCipher(BlockCipher blockCipher, BlockCipher blockCipher2) {
        if (blockCipher != null) {
            if (blockCipher.getBlockSize() != 16) {
                throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
            }
            if (blockCipher2 != null) {
                if (blockCipher2.getBlockSize() == 16) {
                    if (blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
                        this.hashCipher = blockCipher;
                        this.mainCipher = blockCipher2;
                        return;
                    }
                    throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
                }
                throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
            }
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        throw new IllegalArgumentException("'hashCipher' cannot be null");
    }

    protected static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - shiftLeft(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    protected static void OCB_extend(byte[] bArr, int i11) {
        bArr[i11] = Byte.MIN_VALUE;
        while (true) {
            i11++;
            if (i11 >= 16) {
                return;
            }
            bArr[i11] = 0;
        }
    }

    protected static int OCB_ntz(long j11) {
        if (j11 == 0) {
            return 64;
        }
        int i11 = 0;
        while ((1 & j11) == 0) {
            i11++;
            j11 >>>= 1;
        }
        return i11;
    }

    protected static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i11 = 16;
        int i12 = 0;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            int i13 = bArr[i11] & 255;
            bArr2[i11] = (byte) (i12 | (i13 << 1));
            i12 = (i13 >>> 7) & 1;
        }
    }

    protected static void xor(byte[] bArr, byte[] bArr2) {
        for (int i11 = 15; i11 >= 0; i11--) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
    }

    protected void clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i11) {
        byte[] bArr2;
        if (this.forEncryption) {
            bArr2 = null;
        } else {
            int i12 = this.mainBlockPos;
            int i13 = this.macSize;
            if (i12 >= i13) {
                int i14 = i12 - i13;
                this.mainBlockPos = i14;
                bArr2 = new byte[i13];
                System.arraycopy(this.mainBlock, i14, bArr2, 0, i13);
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        }
        int i15 = this.hashBlockPos;
        if (i15 > 0) {
            OCB_extend(this.hashBlock, i15);
            updateHASH(this.L_Asterisk);
        }
        int i16 = this.mainBlockPos;
        if (i16 > 0) {
            if (this.forEncryption) {
                OCB_extend(this.mainBlock, i16);
                xor(this.Checksum, this.mainBlock);
            }
            xor(this.OffsetMAIN, this.L_Asterisk);
            byte[] bArr3 = new byte[16];
            this.hashCipher.processBlock(this.OffsetMAIN, 0, bArr3, 0);
            xor(this.mainBlock, bArr3);
            int length = bArr.length;
            int i17 = this.mainBlockPos;
            if (length >= i11 + i17) {
                System.arraycopy(this.mainBlock, 0, bArr, i11, i17);
                if (!this.forEncryption) {
                    OCB_extend(this.mainBlock, this.mainBlockPos);
                    xor(this.Checksum, this.mainBlock);
                }
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        }
        xor(this.Checksum, this.OffsetMAIN);
        xor(this.Checksum, this.L_Dollar);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr4 = this.Checksum;
        blockCipher.processBlock(bArr4, 0, bArr4, 0);
        xor(this.Checksum, this.Sum);
        int i18 = this.macSize;
        byte[] bArr5 = new byte[i18];
        this.macBlock = bArr5;
        System.arraycopy(this.Checksum, 0, bArr5, 0, i18);
        int i19 = this.mainBlockPos;
        if (this.forEncryption) {
            int length2 = bArr.length;
            int i21 = i11 + i19;
            int i22 = this.macSize;
            if (length2 >= i21 + i22) {
                System.arraycopy(this.macBlock, 0, bArr, i21, i22);
                i19 += this.macSize;
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (!Arrays.constantTimeAreEqual(this.macBlock, bArr2)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        reset(false);
        return i19;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.mainCipher.getAlgorithmName() + "/OCB";
    }

    protected byte[] getLSub(int i11) {
        while (i11 >= this.L.size()) {
            Vector vector = this.L;
            vector.addElement(OCB_double((byte[]) vector.lastElement()));
        }
        return (byte[]) this.L.elementAt(i11);
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
        int i12 = i11 + this.mainBlockPos;
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
        return this.mainCipher;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.mainBlockPos;
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
        boolean z12 = this.forEncryption;
        this.forEncryption = z11;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize >= 64 && macSize <= 128 && macSize % 8 == 0) {
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
            throw new IllegalArgumentException("invalid parameters passed to OCB");
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[z11 ? 16 : this.macSize + 16];
        if (iv2 == null) {
            iv2 = new byte[0];
        }
        if (iv2.length <= 15) {
            if (keyParameter != null) {
                this.hashCipher.init(true, keyParameter);
                this.mainCipher.init(z11, keyParameter);
                this.KtopInput = null;
            } else if (z12 != z11) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            }
            byte[] bArr = new byte[16];
            this.L_Asterisk = bArr;
            this.hashCipher.processBlock(bArr, 0, bArr, 0);
            this.L_Dollar = OCB_double(this.L_Asterisk);
            Vector vector = new Vector();
            this.L = vector;
            vector.addElement(OCB_double(this.L_Dollar));
            int processNonce = processNonce(iv2);
            int i11 = processNonce % 8;
            int i12 = processNonce / 8;
            if (i11 == 0) {
                System.arraycopy(this.Stretch, i12, this.OffsetMAIN_0, 0, 16);
            } else {
                for (int i13 = 0; i13 < 16; i13++) {
                    byte[] bArr2 = this.Stretch;
                    i12++;
                    this.OffsetMAIN_0[i13] = (byte) (((bArr2[i12] & 255) >>> (8 - i11)) | ((bArr2[i12] & 255) << i11));
                }
            }
            this.hashBlockPos = 0;
            this.mainBlockPos = 0;
            this.hashBlockCount = 0L;
            this.mainBlockCount = 0L;
            this.OffsetHASH = new byte[16];
            this.Sum = new byte[16];
            System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
            this.Checksum = new byte[16];
            byte[] bArr3 = this.initialAssociatedText;
            if (bArr3 != null) {
                processAADBytes(bArr3, 0, bArr3.length);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("IV must be no more than 15 bytes");
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b11) {
        byte[] bArr = this.hashBlock;
        int i11 = this.hashBlockPos;
        bArr[i11] = b11;
        int i12 = i11 + 1;
        this.hashBlockPos = i12;
        if (i12 == bArr.length) {
            processHashBlock();
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr2 = this.hashBlock;
            int i14 = this.hashBlockPos;
            bArr2[i14] = bArr[i11 + i13];
            int i15 = i14 + 1;
            this.hashBlockPos = i15;
            if (i15 == bArr2.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        byte[] bArr2 = this.mainBlock;
        int i12 = this.mainBlockPos;
        bArr2[i12] = b11;
        int i13 = i12 + 1;
        this.mainBlockPos = i13;
        if (i13 == bArr2.length) {
            processMainBlock(bArr, i11);
            return 16;
        }
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (bArr.length >= i11 + i12) {
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                byte[] bArr3 = this.mainBlock;
                int i16 = this.mainBlockPos;
                bArr3[i16] = bArr[i11 + i15];
                int i17 = i16 + 1;
                this.mainBlockPos = i17;
                if (i17 == bArr3.length) {
                    processMainBlock(bArr2, i13 + i14);
                    i14 += 16;
                }
            }
            return i14;
        }
        throw new DataLengthException("Input buffer too short");
    }

    protected void processHashBlock() {
        long j11 = this.hashBlockCount + 1;
        this.hashBlockCount = j11;
        updateHASH(getLSub(OCB_ntz(j11)));
        this.hashBlockPos = 0;
    }

    protected void processMainBlock(byte[] bArr, int i11) {
        if (bArr.length >= i11 + 16) {
            if (this.forEncryption) {
                xor(this.Checksum, this.mainBlock);
                this.mainBlockPos = 0;
            }
            byte[] bArr2 = this.OffsetMAIN;
            long j11 = this.mainBlockCount + 1;
            this.mainBlockCount = j11;
            xor(bArr2, getLSub(OCB_ntz(j11)));
            xor(this.mainBlock, this.OffsetMAIN);
            BlockCipher blockCipher = this.mainCipher;
            byte[] bArr3 = this.mainBlock;
            blockCipher.processBlock(bArr3, 0, bArr3, 0);
            xor(this.mainBlock, this.OffsetMAIN);
            System.arraycopy(this.mainBlock, 0, bArr, i11, 16);
            if (this.forEncryption) {
                return;
            }
            xor(this.Checksum, this.mainBlock);
            byte[] bArr4 = this.mainBlock;
            System.arraycopy(bArr4, 16, bArr4, 0, this.macSize);
            this.mainBlockPos = this.macSize;
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    protected int processNonce(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i11 = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.macSize << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        int i12 = bArr2[15] & 63;
        bArr2[15] = (byte) (bArr2[15] & 192);
        byte[] bArr3 = this.KtopInput;
        if (bArr3 == null || !Arrays.areEqual(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.KtopInput = bArr2;
            this.hashCipher.processBlock(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.Stretch, 0, 16);
            while (i11 < 8) {
                byte[] bArr5 = this.Stretch;
                int i13 = i11 + 16;
                byte b11 = bArr4[i11];
                i11++;
                bArr5[i13] = (byte) (b11 ^ bArr4[i11]);
            }
        }
        return i12;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        reset(true);
    }

    protected void updateHASH(byte[] bArr) {
        xor(this.OffsetHASH, bArr);
        xor(this.hashBlock, this.OffsetHASH);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr2 = this.hashBlock;
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        xor(this.Sum, this.hashBlock);
    }

    protected void reset(boolean z11) {
        this.hashCipher.reset();
        this.mainCipher.reset();
        clear(this.hashBlock);
        clear(this.mainBlock);
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        clear(this.OffsetHASH);
        clear(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        clear(this.Checksum);
        if (z11) {
            this.macBlock = null;
        }
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}