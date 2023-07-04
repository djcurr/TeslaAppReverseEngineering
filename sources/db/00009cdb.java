package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.DSAKeyParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;

/* loaded from: classes4.dex */
public class DSASigner implements DSA {
    private final DSAKCalculator kCalculator;
    private DSAKeyParameters key;
    private SecureRandom random;

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    private BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new BigInteger(1, bArr2);
    }

    private BigInteger getRandomizer(BigInteger bigInteger, SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        return new BigInteger(7, secureRandom).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // org.spongycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q11 = parameters.getQ();
        BigInteger calculateE = calculateE(q11, bArr);
        BigInteger x11 = ((DSAPrivateKeyParameters) this.key).getX();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(q11, x11, bArr);
        } else {
            this.kCalculator.init(q11, this.random);
        }
        BigInteger nextK = this.kCalculator.nextK();
        BigInteger mod = parameters.getG().modPow(nextK.add(getRandomizer(q11, this.random)), parameters.getP()).mod(q11);
        return new BigInteger[]{mod, nextK.modInverse(q11).multiply(calculateE.add(x11.multiply(mod))).mod(q11)};
    }

    @Override // org.spongycastle.crypto.DSA
    public void init(boolean z11, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
                this.random = initSecureRandom((z11 || this.kCalculator.isDeterministic()) ? false : true, secureRandom);
            }
            this.key = (DSAPrivateKeyParameters) cipherParameters;
        } else {
            this.key = (DSAPublicKeyParameters) cipherParameters;
        }
        secureRandom = null;
        this.random = initSecureRandom((z11 || this.kCalculator.isDeterministic()) ? false : true, secureRandom);
    }

    protected SecureRandom initSecureRandom(boolean z11, SecureRandom secureRandom) {
        if (z11) {
            return secureRandom != null ? secureRandom : new SecureRandom();
        }
        return null;
    }

    @Override // org.spongycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q11 = parameters.getQ();
        BigInteger calculateE = calculateE(q11, bArr);
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || q11.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || q11.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modInverse = bigInteger2.modInverse(q11);
        BigInteger mod = calculateE.multiply(modInverse).mod(q11);
        BigInteger mod2 = bigInteger.multiply(modInverse).mod(q11);
        BigInteger p11 = parameters.getP();
        return parameters.getG().modPow(mod, p11).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(mod2, p11)).mod(p11).mod(q11).equals(bigInteger);
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}