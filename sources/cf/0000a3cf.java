package org.spongycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.crypto.MessageEncryptor;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2Vector;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.GoppaCode;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* loaded from: classes4.dex */
public class McElieceCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    public int cipherTextSize;
    private boolean forEncryption;

    /* renamed from: k  reason: collision with root package name */
    private int f43785k;
    private McElieceKeyParameters key;
    public int maxPlainTextSize;

    /* renamed from: n  reason: collision with root package name */
    private int f43786n;

    /* renamed from: sr  reason: collision with root package name */
    private SecureRandom f43787sr;

    /* renamed from: t  reason: collision with root package name */
    private int f43788t;

    private byte[] computeMessage(GF2Vector gF2Vector) {
        byte[] encoded = gF2Vector.getEncoded();
        int length = encoded.length - 1;
        while (length >= 0 && encoded[length] == 0) {
            length--;
        }
        if (length >= 0 && encoded[length] == 1) {
            byte[] bArr = new byte[length];
            System.arraycopy(encoded, 0, bArr, 0, length);
            return bArr;
        }
        throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
    }

    private GF2Vector computeMessageRepresentative(byte[] bArr) {
        byte[] bArr2 = new byte[this.maxPlainTextSize + ((this.f43785k & 7) != 0 ? 1 : 0)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = 1;
        return GF2Vector.OS2VP(this.f43785k, bArr2);
    }

    public int getKeySize(McElieceKeyParameters mcElieceKeyParameters) {
        if (mcElieceKeyParameters instanceof McEliecePublicKeyParameters) {
            return ((McEliecePublicKeyParameters) mcElieceKeyParameters).getN();
        }
        if (mcElieceKeyParameters instanceof McEliecePrivateKeyParameters) {
            return ((McEliecePrivateKeyParameters) mcElieceKeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.f43787sr = parametersWithRandom.getRandom();
                McEliecePublicKeyParameters mcEliecePublicKeyParameters = (McEliecePublicKeyParameters) parametersWithRandom.getParameters();
                this.key = mcEliecePublicKeyParameters;
                initCipherEncrypt(mcEliecePublicKeyParameters);
                return;
            }
            this.f43787sr = new SecureRandom();
            McEliecePublicKeyParameters mcEliecePublicKeyParameters2 = (McEliecePublicKeyParameters) cipherParameters;
            this.key = mcEliecePublicKeyParameters2;
            initCipherEncrypt(mcEliecePublicKeyParameters2);
            return;
        }
        McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) cipherParameters;
        this.key = mcEliecePrivateKeyParameters;
        initCipherDecrypt(mcEliecePrivateKeyParameters);
    }

    public void initCipherDecrypt(McEliecePrivateKeyParameters mcEliecePrivateKeyParameters) {
        this.f43786n = mcEliecePrivateKeyParameters.getN();
        int k11 = mcEliecePrivateKeyParameters.getK();
        this.f43785k = k11;
        this.maxPlainTextSize = k11 >> 3;
        this.cipherTextSize = this.f43786n >> 3;
    }

    public void initCipherEncrypt(McEliecePublicKeyParameters mcEliecePublicKeyParameters) {
        SecureRandom secureRandom = this.f43787sr;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        this.f43787sr = secureRandom;
        this.f43786n = mcEliecePublicKeyParameters.getN();
        this.f43785k = mcEliecePublicKeyParameters.getK();
        this.f43788t = mcEliecePublicKeyParameters.getT();
        this.cipherTextSize = this.f43786n >> 3;
        this.maxPlainTextSize = this.f43785k >> 3;
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) {
        if (!this.forEncryption) {
            GF2Vector OS2VP = GF2Vector.OS2VP(this.f43786n, bArr);
            McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) this.key;
            GF2mField field = mcEliecePrivateKeyParameters.getField();
            PolynomialGF2mSmallM goppaPoly = mcEliecePrivateKeyParameters.getGoppaPoly();
            GF2Matrix sInv = mcEliecePrivateKeyParameters.getSInv();
            Permutation p12 = mcEliecePrivateKeyParameters.getP1();
            Permutation p22 = mcEliecePrivateKeyParameters.getP2();
            GF2Matrix h11 = mcEliecePrivateKeyParameters.getH();
            PolynomialGF2mSmallM[] qInv = mcEliecePrivateKeyParameters.getQInv();
            Permutation rightMultiply = p12.rightMultiply(p22);
            GF2Vector gF2Vector = (GF2Vector) OS2VP.multiply(rightMultiply.computeInverse());
            GF2Vector syndromeDecode = GoppaCode.syndromeDecode((GF2Vector) h11.rightMultiply(gF2Vector), field, goppaPoly, qInv);
            GF2Vector gF2Vector2 = (GF2Vector) syndromeDecode.multiply(rightMultiply);
            return computeMessage((GF2Vector) sInv.leftMultiply(((GF2Vector) ((GF2Vector) gF2Vector.add(syndromeDecode)).multiply(p12)).extractRightVector(this.f43785k)));
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (this.forEncryption) {
            GF2Vector computeMessageRepresentative = computeMessageRepresentative(bArr);
            return ((GF2Vector) ((McEliecePublicKeyParameters) this.key).getG().leftMultiply(computeMessageRepresentative).add(new GF2Vector(this.f43786n, this.f43788t, this.f43787sr))).getEncoded();
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }
}