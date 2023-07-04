package org.spongycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.prng.DigestRandomGenerator;
import org.spongycastle.pqc.crypto.MessageEncryptor;
import org.spongycastle.pqc.math.linearalgebra.ByteUtils;
import org.spongycastle.pqc.math.linearalgebra.GF2Vector;
import org.spongycastle.pqc.math.linearalgebra.IntegerFunctions;

/* loaded from: classes4.dex */
public class McElieceKobaraImaiCipher implements MessageEncryptor {
    private static final String DEFAULT_PRNG_NAME = "SHA1PRNG";
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.3";
    public static final byte[] PUBLIC_CONSTANT = "a predetermined public constant".getBytes();
    private boolean forEncryption;

    /* renamed from: k  reason: collision with root package name */
    private int f43796k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* renamed from: n  reason: collision with root package name */
    private int f43797n;

    /* renamed from: sr  reason: collision with root package name */
    private SecureRandom f43798sr;

    /* renamed from: t  reason: collision with root package name */
    private int f43799t;

    private void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PublicKeyParameters.getDigest());
        this.f43797n = mcElieceCCA2PublicKeyParameters.getN();
        this.f43796k = mcElieceCCA2PublicKeyParameters.getK();
        this.f43799t = mcElieceCCA2PublicKeyParameters.getT();
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.f43798sr = parametersWithRandom.getRandom();
                McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
                this.key = mcElieceCCA2PublicKeyParameters;
                initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
                return;
            }
            this.f43798sr = new SecureRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PublicKeyParameters2;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters2);
            return;
        }
        McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
        this.key = mcElieceCCA2PrivateKeyParameters;
        initCipherDecrypt(mcElieceCCA2PrivateKeyParameters);
    }

    public void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PrivateKeyParameters.getDigest());
        this.f43797n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f43796k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f43799t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) {
        byte[] bArr2;
        if (!this.forEncryption) {
            int i11 = this.f43797n >> 3;
            if (bArr.length >= i11) {
                int digestSize = this.messDigest.getDigestSize();
                int i12 = this.f43796k >> 3;
                int length = bArr.length - i11;
                if (length > 0) {
                    byte[][] split = ByteUtils.split(bArr, length);
                    bArr2 = split[0];
                    bArr = split[1];
                } else {
                    bArr2 = new byte[0];
                }
                GF2Vector[] decryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f43797n, bArr));
                byte[] encoded = decryptionPrimitive[0].getEncoded();
                GF2Vector gF2Vector = decryptionPrimitive[1];
                if (encoded.length > i12) {
                    encoded = ByteUtils.subArray(encoded, 0, i12);
                }
                byte[] concatenate = ByteUtils.concatenate(ByteUtils.concatenate(bArr2, Conversions.decode(this.f43797n, this.f43799t, gF2Vector)), encoded);
                int length2 = concatenate.length - digestSize;
                byte[][] split2 = ByteUtils.split(concatenate, digestSize);
                byte[] bArr3 = split2[0];
                byte[] bArr4 = split2[1];
                byte[] bArr5 = new byte[this.messDigest.getDigestSize()];
                this.messDigest.update(bArr4, 0, bArr4.length);
                this.messDigest.doFinal(bArr5, 0);
                for (int i13 = digestSize - 1; i13 >= 0; i13--) {
                    bArr5[i13] = (byte) (bArr5[i13] ^ bArr3[i13]);
                }
                DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
                digestRandomGenerator.addSeedMaterial(bArr5);
                byte[] bArr6 = new byte[length2];
                digestRandomGenerator.nextBytes(bArr6);
                for (int i14 = length2 - 1; i14 >= 0; i14--) {
                    bArr6[i14] = (byte) (bArr6[i14] ^ bArr4[i14]);
                }
                byte[] bArr7 = PUBLIC_CONSTANT;
                byte[][] split3 = ByteUtils.split(bArr6, length2 - bArr7.length);
                byte[] bArr8 = split3[0];
                if (ByteUtils.equals(split3[1], bArr7)) {
                    return bArr8;
                }
                throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
            }
            throw new InvalidCipherTextException("Bad Padding: Ciphertext too short.");
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (this.forEncryption) {
            int digestSize = this.messDigest.getDigestSize();
            int i11 = this.f43796k >> 3;
            int bitLength = (IntegerFunctions.binomial(this.f43797n, this.f43799t).bitLength() - 1) >> 3;
            byte[] bArr2 = PUBLIC_CONSTANT;
            int length = ((i11 + bitLength) - digestSize) - bArr2.length;
            if (bArr.length > length) {
                length = bArr.length;
            }
            int length2 = bArr2.length + length;
            int i12 = ((length2 + digestSize) - i11) - bitLength;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
            byte[] bArr4 = new byte[digestSize];
            this.f43798sr.nextBytes(bArr4);
            DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
            digestRandomGenerator.addSeedMaterial(bArr4);
            byte[] bArr5 = new byte[length2];
            digestRandomGenerator.nextBytes(bArr5);
            for (int i13 = length2 - 1; i13 >= 0; i13--) {
                bArr5[i13] = (byte) (bArr5[i13] ^ bArr3[i13]);
            }
            byte[] bArr6 = new byte[this.messDigest.getDigestSize()];
            this.messDigest.update(bArr5, 0, length2);
            this.messDigest.doFinal(bArr6, 0);
            for (int i14 = digestSize - 1; i14 >= 0; i14--) {
                bArr6[i14] = (byte) (bArr6[i14] ^ bArr4[i14]);
            }
            byte[] concatenate = ByteUtils.concatenate(bArr6, bArr5);
            byte[] bArr7 = new byte[0];
            if (i12 > 0) {
                bArr7 = new byte[i12];
                System.arraycopy(concatenate, 0, bArr7, 0, i12);
            }
            byte[] bArr8 = new byte[bitLength];
            System.arraycopy(concatenate, i12, bArr8, 0, bitLength);
            byte[] bArr9 = new byte[i11];
            System.arraycopy(concatenate, bitLength + i12, bArr9, 0, i11);
            byte[] encoded = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, GF2Vector.OS2VP(this.f43796k, bArr9), Conversions.encode(this.f43797n, this.f43799t, bArr8)).getEncoded();
            return i12 > 0 ? ByteUtils.concatenate(bArr7, encoded) : encoded;
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }
}