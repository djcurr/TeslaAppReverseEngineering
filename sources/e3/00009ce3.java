package org.spongycastle.crypto.signers;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.SignerWithRecovery;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.ParametersWithSalt;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class ISO9796d2PSSSigner implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int hLen;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private int preMStart;
    private byte[] preSig;
    private int preTLength;
    private SecureRandom random;
    private byte[] recoveredMessage;
    private int saltLength;
    private byte[] standardSalt;
    private int trailer;

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i11, boolean z11) {
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        this.hLen = digest.getDigestSize();
        this.saltLength = i11;
        if (z11) {
            this.trailer = 188;
            return;
        }
        Integer trailer = ISOTrailers.getTrailer(digest);
        if (trailer != null) {
            this.trailer = trailer.intValue();
            return;
        }
        throw new IllegalArgumentException("no valid trailer for digest: " + digest.getAlgorithmName());
    }

    private void ItoOSP(int i11, byte[] bArr) {
        bArr[0] = (byte) (i11 >>> 24);
        bArr[1] = (byte) (i11 >>> 16);
        bArr[2] = (byte) (i11 >>> 8);
        bArr[3] = (byte) (i11 >>> 0);
    }

    private void LtoOSP(long j11, byte[] bArr) {
        bArr[0] = (byte) (j11 >>> 56);
        bArr[1] = (byte) (j11 >>> 48);
        bArr[2] = (byte) (j11 >>> 40);
        bArr[3] = (byte) (j11 >>> 32);
        bArr[4] = (byte) (j11 >>> 24);
        bArr[5] = (byte) (j11 >>> 16);
        bArr[6] = (byte) (j11 >>> 8);
        bArr[7] = (byte) (j11 >>> 0);
    }

    private void clearBlock(byte[] bArr) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z11 = this.messageLength == bArr2.length;
        for (int i11 = 0; i11 != bArr2.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                z11 = false;
            }
        }
        return z11;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i11, int i12, int i13) {
        int i14;
        byte[] bArr2 = new byte[i13];
        byte[] bArr3 = new byte[this.hLen];
        byte[] bArr4 = new byte[4];
        this.digest.reset();
        int i15 = 0;
        while (true) {
            i14 = this.hLen;
            if (i15 >= i13 / i14) {
                break;
            }
            ItoOSP(i15, bArr4);
            this.digest.update(bArr, i11, i12);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i16 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i15 * i16, i16);
            i15++;
        }
        if (i14 * i15 < i13) {
            ItoOSP(i15, bArr4);
            this.digest.update(bArr, i11, i12);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i17 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i15 * i17, i13 - (i15 * i17));
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.digest.doFinal(bArr, 0);
        byte[] bArr2 = new byte[8];
        LtoOSP(this.messageLength * 8, bArr2);
        this.digest.update(bArr2, 0, 8);
        this.digest.update(this.mBuf, 0, this.messageLength);
        this.digest.update(bArr, 0, digestSize);
        byte[] bArr3 = this.standardSalt;
        if (bArr3 == null) {
            bArr3 = new byte[this.saltLength];
            this.random.nextBytes(bArr3);
        }
        this.digest.update(bArr3, 0, bArr3.length);
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        this.digest.doFinal(bArr4, 0);
        int i11 = this.trailer == 188 ? 1 : 2;
        byte[] bArr5 = this.block;
        int length = bArr5.length;
        int i12 = this.messageLength;
        int length2 = ((((length - i12) - bArr3.length) - this.hLen) - i11) - 1;
        bArr5[length2] = 1;
        int i13 = length2 + 1;
        System.arraycopy(this.mBuf, 0, bArr5, i13, i12);
        System.arraycopy(bArr3, 0, this.block, i13 + this.messageLength, bArr3.length);
        byte[] maskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, digestSize2, (this.block.length - this.hLen) - i11);
        for (int i14 = 0; i14 != maskGeneratorFunction1.length; i14++) {
            byte[] bArr6 = this.block;
            bArr6[i14] = (byte) (bArr6[i14] ^ maskGeneratorFunction1[i14]);
        }
        byte[] bArr7 = this.block;
        int length3 = bArr7.length;
        int i15 = this.hLen;
        System.arraycopy(bArr4, 0, bArr7, (length3 - i15) - i11, i15);
        int i16 = this.trailer;
        if (i16 == 188) {
            byte[] bArr8 = this.block;
            bArr8[bArr8.length - 1] = PSSSigner.TRAILER_IMPLICIT;
        } else {
            byte[] bArr9 = this.block;
            bArr9[bArr9.length - 2] = (byte) (i16 >>> 8);
            bArr9[bArr9.length - 1] = (byte) i16;
        }
        byte[] bArr10 = this.block;
        bArr10[0] = (byte) (bArr10[0] & Byte.MAX_VALUE);
        byte[] processBlock = this.cipher.processBlock(bArr10, 0, bArr10.length);
        int i17 = this.messageLength;
        byte[] bArr11 = new byte[i17];
        this.recoveredMessage = bArr11;
        byte[] bArr12 = this.mBuf;
        this.fullMessage = i17 <= bArr12.length;
        System.arraycopy(bArr12, 0, bArr11, 0, bArr11.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
        this.messageLength = 0;
        return processBlock;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.recoveredMessage;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.fullMessage;
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters;
        int i11 = this.saltLength;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithRandom.getParameters();
            if (z11) {
                this.random = parametersWithRandom.getRandom();
            }
        } else if (cipherParameters instanceof ParametersWithSalt) {
            ParametersWithSalt parametersWithSalt = (ParametersWithSalt) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithSalt.getParameters();
            byte[] salt = parametersWithSalt.getSalt();
            this.standardSalt = salt;
            i11 = salt.length;
            if (salt.length != this.saltLength) {
                throw new IllegalArgumentException("Fixed salt is of wrong length");
            }
        } else {
            rSAKeyParameters = (RSAKeyParameters) cipherParameters;
            if (z11) {
                this.random = new SecureRandom();
            }
        }
        this.cipher.init(z11, rSAKeyParameters);
        int bitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = bitLength;
        byte[] bArr = new byte[(bitLength + 7) / 8];
        this.block = bArr;
        if (this.trailer == 188) {
            this.mBuf = new byte[(((bArr.length - this.digest.getDigestSize()) - i11) - 1) - 1];
        } else {
            this.mBuf = new byte[(((bArr.length - this.digest.getDigestSize()) - i11) - 1) - 2];
        }
        reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        byte[] bArr = this.mBuf;
        if (bArr != null) {
            clearBlock(bArr);
        }
        byte[] bArr2 = this.recoveredMessage;
        if (bArr2 != null) {
            clearBlock(bArr2);
            this.recoveredMessage = null;
        }
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b11) {
        if (this.preSig == null) {
            int i11 = this.messageLength;
            byte[] bArr = this.mBuf;
            if (i11 < bArr.length) {
                this.messageLength = i11 + 1;
                bArr[i11] = b11;
                return;
            }
        }
        this.digest.update(b11);
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) {
        byte[] processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        int length = processBlock.length;
        int i11 = this.keyBits;
        if (length < (i11 + 7) / 8) {
            int i12 = (i11 + 7) / 8;
            byte[] bArr2 = new byte[i12];
            System.arraycopy(processBlock, 0, bArr2, i12 - processBlock.length, processBlock.length);
            clearBlock(processBlock);
            processBlock = bArr2;
        }
        int i13 = 2;
        if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
            i13 = 1;
        } else {
            int i14 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer != null) {
                if (i14 != trailer.intValue()) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i14);
                }
            } else {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
        }
        this.digest.doFinal(new byte[this.hLen], 0);
        int length2 = processBlock.length;
        int i15 = this.hLen;
        byte[] maskGeneratorFunction1 = maskGeneratorFunction1(processBlock, (length2 - i15) - i13, i15, (processBlock.length - i15) - i13);
        for (int i16 = 0; i16 != maskGeneratorFunction1.length; i16++) {
            processBlock[i16] = (byte) (processBlock[i16] ^ maskGeneratorFunction1[i16]);
        }
        processBlock[0] = (byte) (processBlock[0] & Byte.MAX_VALUE);
        int i17 = 0;
        while (i17 != processBlock.length && processBlock[i17] != 1) {
            i17++;
        }
        int i18 = i17 + 1;
        if (i18 >= processBlock.length) {
            clearBlock(processBlock);
        }
        this.fullMessage = i18 > 1;
        byte[] bArr3 = new byte[(maskGeneratorFunction1.length - i18) - this.saltLength];
        this.recoveredMessage = bArr3;
        System.arraycopy(processBlock, i18, bArr3, 0, bArr3.length);
        byte[] bArr4 = this.recoveredMessage;
        System.arraycopy(bArr4, 0, this.mBuf, 0, bArr4.length);
        this.preSig = bArr;
        this.preBlock = processBlock;
        this.preMStart = i18;
        this.preTLength = i13;
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        int i11 = this.hLen;
        byte[] bArr2 = new byte[i11];
        this.digest.doFinal(bArr2, 0);
        byte[] bArr3 = this.preSig;
        if (bArr3 == null) {
            try {
                updateWithRecoveredMessage(bArr);
            } catch (Exception unused) {
                return false;
            }
        } else if (!Arrays.areEqual(bArr3, bArr)) {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        byte[] bArr4 = this.preBlock;
        int i12 = this.preMStart;
        int i13 = this.preTLength;
        this.preSig = null;
        this.preBlock = null;
        byte[] bArr5 = new byte[8];
        LtoOSP(this.recoveredMessage.length * 8, bArr5);
        this.digest.update(bArr5, 0, 8);
        byte[] bArr6 = this.recoveredMessage;
        if (bArr6.length != 0) {
            this.digest.update(bArr6, 0, bArr6.length);
        }
        this.digest.update(bArr2, 0, i11);
        byte[] bArr7 = this.standardSalt;
        if (bArr7 != null) {
            this.digest.update(bArr7, 0, bArr7.length);
        } else {
            this.digest.update(bArr4, i12 + this.recoveredMessage.length, this.saltLength);
        }
        int digestSize = this.digest.getDigestSize();
        byte[] bArr8 = new byte[digestSize];
        this.digest.doFinal(bArr8, 0);
        int length = (bArr4.length - i13) - digestSize;
        boolean z11 = true;
        for (int i14 = 0; i14 != digestSize; i14++) {
            if (bArr8[i14] != bArr4[length + i14]) {
                z11 = false;
            }
        }
        clearBlock(bArr4);
        clearBlock(bArr8);
        if (!z11) {
            this.fullMessage = false;
            clearBlock(this.recoveredMessage);
            return false;
        }
        if (this.messageLength != 0) {
            if (!isSameAs(this.mBuf, this.recoveredMessage)) {
                clearBlock(this.mBuf);
                return false;
            }
            this.messageLength = 0;
        }
        clearBlock(this.mBuf);
        return true;
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        if (this.preSig == null) {
            while (i12 > 0 && this.messageLength < this.mBuf.length) {
                update(bArr[i11]);
                i11++;
                i12--;
            }
        }
        if (i12 > 0) {
            this.digest.update(bArr, i11, i12);
        }
    }

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i11) {
        this(asymmetricBlockCipher, digest, i11, false);
    }
}