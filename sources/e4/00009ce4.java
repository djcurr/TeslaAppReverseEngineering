package org.spongycastle.crypto.signers;

import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.SignerWithRecovery;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
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
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private byte[] preSig;
    private byte[] recoveredMessage;
    private int trailer;

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z11) {
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
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

    private void clearBlock(byte[] bArr) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z11;
        int i11 = this.messageLength;
        byte[] bArr3 = this.mBuf;
        if (i11 > bArr3.length) {
            z11 = bArr3.length <= bArr2.length;
            for (int i12 = 0; i12 != this.mBuf.length; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    z11 = false;
                }
            }
        } else {
            z11 = i11 == bArr2.length;
            for (int i13 = 0; i13 != bArr2.length; i13++) {
                if (bArr[i13] != bArr2[i13]) {
                    z11 = false;
                }
            }
        }
        return z11;
    }

    private boolean returnFalse(byte[] bArr) {
        clearBlock(this.mBuf);
        clearBlock(bArr);
        return false;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() {
        int i11;
        int i12;
        byte b11;
        int i13;
        int digestSize = this.digest.getDigestSize();
        if (this.trailer == 188) {
            byte[] bArr = this.block;
            i12 = (bArr.length - digestSize) - 1;
            this.digest.doFinal(bArr, i12);
            byte[] bArr2 = this.block;
            bArr2[bArr2.length - 1] = PSSSigner.TRAILER_IMPLICIT;
            i11 = 8;
        } else {
            i11 = 16;
            byte[] bArr3 = this.block;
            int length = (bArr3.length - digestSize) - 2;
            this.digest.doFinal(bArr3, length);
            byte[] bArr4 = this.block;
            int i14 = this.trailer;
            bArr4[bArr4.length - 2] = (byte) (i14 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i14;
            i12 = length;
        }
        int i15 = this.messageLength;
        int i16 = ((((digestSize + i15) * 8) + i11) + 4) - this.keyBits;
        if (i16 > 0) {
            int i17 = i15 - ((i16 + 7) / 8);
            b11 = 96;
            i13 = i12 - i17;
            System.arraycopy(this.mBuf, 0, this.block, i13, i17);
            this.recoveredMessage = new byte[i17];
        } else {
            b11 = 64;
            i13 = i12 - i15;
            System.arraycopy(this.mBuf, 0, this.block, i13, i15);
            this.recoveredMessage = new byte[this.messageLength];
        }
        int i18 = i13 - 1;
        if (i18 > 0) {
            for (int i19 = i18; i19 != 0; i19--) {
                this.block[i19] = -69;
            }
            byte[] bArr5 = this.block;
            bArr5[i18] = (byte) (bArr5[i18] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (bArr5[0] | b11);
        } else {
            byte[] bArr6 = this.block;
            bArr6[0] = 10;
            bArr6[0] = (byte) (bArr6[0] | b11);
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr7 = this.block;
        byte[] processBlock = asymmetricBlockCipher.processBlock(bArr7, 0, bArr7.length);
        this.fullMessage = (b11 & 32) == 0;
        byte[] bArr8 = this.mBuf;
        byte[] bArr9 = this.recoveredMessage;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
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
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.cipher.init(z11, rSAKeyParameters);
        int bitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = bitLength;
        byte[] bArr = new byte[(bitLength + 7) / 8];
        this.block = bArr;
        if (this.trailer == 188) {
            this.mBuf = new byte[(bArr.length - this.digest.getDigestSize()) - 2];
        } else {
            this.mBuf = new byte[(bArr.length - this.digest.getDigestSize()) - 3];
        }
        reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        clearBlock(this.mBuf);
        byte[] bArr = this.recoveredMessage;
        if (bArr != null) {
            clearBlock(bArr);
        }
        this.recoveredMessage = null;
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b11) {
        this.digest.update(b11);
        int i11 = this.messageLength;
        byte[] bArr = this.mBuf;
        if (i11 < bArr.length) {
            bArr[i11] = b11;
        }
        this.messageLength = i11 + 1;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) {
        byte[] processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        if (((processBlock[0] & 192) ^ 64) == 0) {
            if (((processBlock[processBlock.length - 1] & 15) ^ 12) == 0) {
                int i11 = 2;
                if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
                    i11 = 1;
                } else {
                    int i12 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
                    Integer trailer = ISOTrailers.getTrailer(this.digest);
                    if (trailer != null) {
                        if (i12 != trailer.intValue()) {
                            throw new IllegalStateException("signer initialised with wrong digest for trailer " + i12);
                        }
                    } else {
                        throw new IllegalArgumentException("unrecognised hash in signature");
                    }
                }
                int i13 = 0;
                while (i13 != processBlock.length && ((processBlock[i13] & 15) ^ 10) != 0) {
                    i13++;
                }
                int i14 = i13 + 1;
                int length = ((processBlock.length - i11) - this.digest.getDigestSize()) - i14;
                if (length > 0) {
                    if ((processBlock[0] & 32) == 0) {
                        this.fullMessage = true;
                        byte[] bArr2 = new byte[length];
                        this.recoveredMessage = bArr2;
                        System.arraycopy(processBlock, i14, bArr2, 0, bArr2.length);
                    } else {
                        this.fullMessage = false;
                        byte[] bArr3 = new byte[length];
                        this.recoveredMessage = bArr3;
                        System.arraycopy(processBlock, i14, bArr3, 0, bArr3.length);
                    }
                    this.preSig = bArr;
                    this.preBlock = processBlock;
                    Digest digest = this.digest;
                    byte[] bArr4 = this.recoveredMessage;
                    digest.update(bArr4, 0, bArr4.length);
                    byte[] bArr5 = this.recoveredMessage;
                    this.messageLength = bArr5.length;
                    System.arraycopy(bArr5, 0, this.mBuf, 0, bArr5.length);
                    return;
                }
                throw new InvalidCipherTextException("malformed block");
            }
            throw new InvalidCipherTextException("malformed signature");
        }
        throw new InvalidCipherTextException("malformed signature");
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] processBlock;
        byte[] bArr2 = this.preSig;
        if (bArr2 == null) {
            try {
                processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else if (Arrays.areEqual(bArr2, bArr)) {
            processBlock = this.preBlock;
            this.preSig = null;
            this.preBlock = null;
        } else {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        if (((processBlock[0] & 192) ^ 64) != 0) {
            return returnFalse(processBlock);
        }
        if (((processBlock[processBlock.length - 1] & 15) ^ 12) != 0) {
            return returnFalse(processBlock);
        }
        int i11 = 2;
        if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
            i11 = 1;
        } else {
            int i12 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer != null) {
                if (i12 != trailer.intValue()) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i12);
                }
            } else {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
        }
        int i13 = 0;
        while (i13 != processBlock.length && ((processBlock[i13] & 15) ^ 10) != 0) {
            i13++;
        }
        int i14 = i13 + 1;
        int digestSize = this.digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int length = (processBlock.length - i11) - digestSize;
        int i15 = length - i14;
        if (i15 <= 0) {
            return returnFalse(processBlock);
        }
        if ((processBlock[0] & 32) == 0) {
            this.fullMessage = true;
            if (this.messageLength > i15) {
                return returnFalse(processBlock);
            }
            this.digest.reset();
            this.digest.update(processBlock, i14, i15);
            this.digest.doFinal(bArr3, 0);
            boolean z11 = true;
            for (int i16 = 0; i16 != digestSize; i16++) {
                int i17 = length + i16;
                processBlock[i17] = (byte) (processBlock[i17] ^ bArr3[i16]);
                if (processBlock[i17] != 0) {
                    z11 = false;
                }
            }
            if (!z11) {
                return returnFalse(processBlock);
            }
            byte[] bArr4 = new byte[i15];
            this.recoveredMessage = bArr4;
            System.arraycopy(processBlock, i14, bArr4, 0, bArr4.length);
        } else {
            this.fullMessage = false;
            this.digest.doFinal(bArr3, 0);
            boolean z12 = true;
            for (int i18 = 0; i18 != digestSize; i18++) {
                int i19 = length + i18;
                processBlock[i19] = (byte) (processBlock[i19] ^ bArr3[i18]);
                if (processBlock[i19] != 0) {
                    z12 = false;
                }
            }
            if (!z12) {
                return returnFalse(processBlock);
            }
            byte[] bArr5 = new byte[i15];
            this.recoveredMessage = bArr5;
            System.arraycopy(processBlock, i14, bArr5, 0, bArr5.length);
        }
        if (this.messageLength != 0 && !isSameAs(this.mBuf, this.recoveredMessage)) {
            return returnFalse(processBlock);
        }
        clearBlock(this.mBuf);
        clearBlock(processBlock);
        return true;
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        while (i12 > 0 && this.messageLength < this.mBuf.length) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
        this.digest.update(bArr, i11, i12);
        this.messageLength += i12;
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }
}