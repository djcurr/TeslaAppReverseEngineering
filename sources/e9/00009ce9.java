package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;

/* loaded from: classes4.dex */
public class X931Signer implements Signer {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA224 = 14540;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private RSAKeyParameters kParam;
    private int keyBits;
    private int trailer;

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z11) {
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

    private void createSignatureBlock() {
        int length;
        byte[] bArr;
        int digestSize = this.digest.getDigestSize();
        if (this.trailer == 188) {
            byte[] bArr2 = this.block;
            length = (bArr2.length - digestSize) - 1;
            this.digest.doFinal(bArr2, length);
            this.block[bArr.length - 1] = PSSSigner.TRAILER_IMPLICIT;
        } else {
            byte[] bArr3 = this.block;
            length = (bArr3.length - digestSize) - 2;
            this.digest.doFinal(bArr3, length);
            byte[] bArr4 = this.block;
            int i11 = this.trailer;
            bArr4[bArr4.length - 2] = (byte) (i11 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i11;
        }
        this.block[0] = 107;
        for (int i12 = length - 2; i12 != 0; i12--) {
            this.block[i12] = -69;
        }
        this.block[length - 1] = -70;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() {
        createSignatureBlock();
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr = this.block;
        BigInteger bigInteger = new BigInteger(1, asymmetricBlockCipher.processBlock(bArr, 0, bArr.length));
        clearBlock(this.block);
        return BigIntegers.asUnsignedByteArray((this.kParam.getModulus().bitLength() + 7) / 8, bigInteger.min(this.kParam.getModulus().subtract(bigInteger)));
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.kParam = rSAKeyParameters;
        this.cipher.init(z11, rSAKeyParameters);
        int bitLength = this.kParam.getModulus().bitLength();
        this.keyBits = bitLength;
        this.block = new byte[(bitLength + 7) / 8];
        reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b11) {
        this.digest.update(b11);
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        try {
            this.block = this.cipher.processBlock(bArr, 0, bArr.length);
            BigInteger bigInteger = new BigInteger(1, this.block);
            if ((bigInteger.intValue() & 15) != 12) {
                bigInteger = this.kParam.getModulus().subtract(bigInteger);
                if ((bigInteger.intValue() & 15) != 12) {
                    return false;
                }
            }
            createSignatureBlock();
            byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.block.length, bigInteger);
            boolean constantTimeAreEqual = Arrays.constantTimeAreEqual(this.block, asUnsignedByteArray);
            clearBlock(this.block);
            clearBlock(asUnsignedByteArray);
            return constantTimeAreEqual;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.digest.update(bArr, i11, i12);
    }

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }
}