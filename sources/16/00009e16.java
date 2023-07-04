package org.spongycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.agreement.kdf.DHKEKGenerator;
import org.spongycastle.crypto.util.DigestFactory;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.spongycastle.jcajce.spec.UserKeyingMaterialSpec;

/* loaded from: classes4.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: g  reason: collision with root package name */
    private BigInteger f43636g;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43637p;
    private BigInteger result;

    /* renamed from: x  reason: collision with root package name */
    private BigInteger f43638x;

    /* loaded from: classes4.dex */
    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new DHKEKGenerator(DigestFactory.createSHA1()));
        }
    }

    public KeyAgreementSpi() {
        super("Diffie-Hellman", null);
    }

    protected byte[] bigIntToBytes(BigInteger bigInteger) {
        int bitLength = (this.f43637p.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == bitLength) {
            return byteArray;
        }
        if (byteArray[0] == 0 && byteArray.length == bitLength + 1) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(byteArray, 0, bArr2, bitLength - byteArray.length, byteArray.length);
        return bArr2;
    }

    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return bigIntToBytes(this.result);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z11) {
        if (this.f43638x != null) {
            if (key instanceof DHPublicKey) {
                DHPublicKey dHPublicKey = (DHPublicKey) key;
                if (dHPublicKey.getParams().getG().equals(this.f43636g) && dHPublicKey.getParams().getP().equals(this.f43637p)) {
                    BigInteger y11 = dHPublicKey.getY();
                    if (y11 != null && y11.compareTo(TWO) >= 0) {
                        BigInteger bigInteger = this.f43637p;
                        BigInteger bigInteger2 = ONE;
                        if (y11.compareTo(bigInteger.subtract(bigInteger2)) < 0) {
                            BigInteger modPow = y11.modPow(this.f43638x, this.f43637p);
                            this.result = modPow;
                            if (modPow.compareTo(bigInteger2) != 0) {
                                if (z11) {
                                    return null;
                                }
                                return new BCDHPublicKey(this.result, dHPublicKey.getParams());
                            }
                            throw new InvalidKeyException("Shared key can't be 1");
                        }
                    }
                    throw new InvalidKeyException("Invalid DH PublicKey");
                }
                throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
            }
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        if (this.f43638x != null) {
            return super.engineGenerateSecret();
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            if (algorithmParameterSpec != null) {
                if (algorithmParameterSpec instanceof DHParameterSpec) {
                    DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                    this.f43637p = dHParameterSpec.getP();
                    this.f43636g = dHParameterSpec.getG();
                } else if (algorithmParameterSpec instanceof UserKeyingMaterialSpec) {
                    this.f43637p = dHPrivateKey.getParams().getP();
                    this.f43636g = dHPrivateKey.getParams().getG();
                    this.ukmParameters = ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial();
                } else {
                    throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
                }
            } else {
                this.f43637p = dHPrivateKey.getParams().getP();
                this.f43636g = dHPrivateKey.getParams().getG();
            }
            BigInteger x11 = dHPrivateKey.getX();
            this.result = x11;
            this.f43638x = x11;
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
    }

    public KeyAgreementSpi(String str, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i11) {
        if (this.f43638x != null) {
            return super.engineGenerateSecret(bArr, i11);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        if (this.f43638x != null) {
            byte[] bigIntToBytes = bigIntToBytes(this.result);
            if (str.equals("TlsPremasterSecret")) {
                return new SecretKeySpec(BaseAgreementSpi.trimZeroes(bigIntToBytes), str);
            }
            return super.engineGenerateSecret(str);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            this.f43637p = dHPrivateKey.getParams().getP();
            this.f43636g = dHPrivateKey.getParams().getG();
            BigInteger x11 = dHPrivateKey.getX();
            this.result = x11;
            this.f43638x = x11;
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
    }
}