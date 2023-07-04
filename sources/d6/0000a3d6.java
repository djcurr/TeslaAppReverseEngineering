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

/* loaded from: classes4.dex */
public class McEliecePointchevalCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.2";
    private boolean forEncryption;

    /* renamed from: k  reason: collision with root package name */
    private int f43803k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* renamed from: n  reason: collision with root package name */
    private int f43804n;

    /* renamed from: sr  reason: collision with root package name */
    private SecureRandom f43805sr;

    /* renamed from: t  reason: collision with root package name */
    private int f43806t;

    protected int decryptOutputSize(int i11) {
        return 0;
    }

    protected int encryptOutputSize(int i11) {
        return 0;
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
                this.f43805sr = parametersWithRandom.getRandom();
                McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
                this.key = mcElieceCCA2PublicKeyParameters;
                initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
                return;
            }
            this.f43805sr = new SecureRandom();
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
        this.f43804n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f43803k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f43806t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    public void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        SecureRandom secureRandom = this.f43805sr;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        this.f43805sr = secureRandom;
        this.messDigest = Utils.getDigest(mcElieceCCA2PublicKeyParameters.getDigest());
        this.f43804n = mcElieceCCA2PublicKeyParameters.getN();
        this.f43803k = mcElieceCCA2PublicKeyParameters.getK();
        this.f43806t = mcElieceCCA2PublicKeyParameters.getT();
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) {
        if (!this.forEncryption) {
            int i11 = (this.f43804n + 7) >> 3;
            int length = bArr.length - i11;
            byte[][] split = ByteUtils.split(bArr, i11);
            byte[] bArr2 = split[0];
            byte[] bArr3 = split[1];
            GF2Vector[] decryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f43804n, bArr2));
            byte[] encoded = decryptionPrimitive[0].getEncoded();
            GF2Vector gF2Vector = decryptionPrimitive[1];
            DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
            digestRandomGenerator.addSeedMaterial(encoded);
            byte[] bArr4 = new byte[length];
            digestRandomGenerator.nextBytes(bArr4);
            for (int i12 = 0; i12 < length; i12++) {
                bArr4[i12] = (byte) (bArr4[i12] ^ bArr3[i12]);
            }
            this.messDigest.update(bArr4, 0, length);
            byte[] bArr5 = new byte[this.messDigest.getDigestSize()];
            this.messDigest.doFinal(bArr5, 0);
            if (Conversions.encode(this.f43804n, this.f43806t, bArr5).equals(gF2Vector)) {
                return ByteUtils.split(bArr4, length - (this.f43803k >> 3))[0];
            }
            throw new InvalidCipherTextException("Bad Padding: Invalid ciphertext.");
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (this.forEncryption) {
            int i11 = this.f43803k >> 3;
            byte[] bArr2 = new byte[i11];
            this.f43805sr.nextBytes(bArr2);
            GF2Vector gF2Vector = new GF2Vector(this.f43803k, this.f43805sr);
            byte[] encoded = gF2Vector.getEncoded();
            byte[] concatenate = ByteUtils.concatenate(bArr, bArr2);
            this.messDigest.update(concatenate, 0, concatenate.length);
            byte[] bArr3 = new byte[this.messDigest.getDigestSize()];
            this.messDigest.doFinal(bArr3, 0);
            byte[] encoded2 = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, gF2Vector, Conversions.encode(this.f43804n, this.f43806t, bArr3)).getEncoded();
            DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
            digestRandomGenerator.addSeedMaterial(encoded);
            byte[] bArr4 = new byte[bArr.length + i11];
            digestRandomGenerator.nextBytes(bArr4);
            for (int i12 = 0; i12 < bArr.length; i12++) {
                bArr4[i12] = (byte) (bArr4[i12] ^ bArr[i12]);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                int length = bArr.length + i13;
                bArr4[length] = (byte) (bArr4[length] ^ bArr2[i13]);
            }
            return ByteUtils.concatenate(encoded2, bArr4);
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }
}