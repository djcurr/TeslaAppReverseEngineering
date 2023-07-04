package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECMultiplier;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.ec.FixedPointCombMultiplier;

/* loaded from: classes4.dex */
public class ECDSASigner implements ECConstants, DSA {
    private final DSAKCalculator kCalculator;
    private ECKeyParameters key;
    private SecureRandom random;

    public ECDSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    protected BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
    }

    protected ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n11 = parameters.getN();
        BigInteger calculateE = calculateE(n11, bArr);
        BigInteger d11 = ((ECPrivateKeyParameters) this.key).getD();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(n11, d11, bArr);
        } else {
            this.kCalculator.init(n11, this.random);
        }
        ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger nextK = this.kCalculator.nextK();
            BigInteger mod = createBasePointMultiplier.multiply(parameters.getG(), nextK).normalize().getAffineXCoord().toBigInteger().mod(n11);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!mod.equals(bigInteger)) {
                BigInteger mod2 = nextK.modInverse(n11).multiply(calculateE.add(d11.multiply(mod))).mod(n11);
                if (!mod2.equals(bigInteger)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }

    protected ECFieldElement getDenominator(int i11, ECPoint eCPoint) {
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3 || i11 == 4) {
                return eCPoint.getZCoord(0).square();
            }
            if (i11 != 6 && i11 != 7) {
                return null;
            }
        }
        return eCPoint.getZCoord(0);
    }

    @Override // org.spongycastle.crypto.DSA
    public void init(boolean z11, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (ECPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
                this.random = initSecureRandom((z11 || this.kCalculator.isDeterministic()) ? false : true, secureRandom);
            }
            this.key = (ECPrivateKeyParameters) cipherParameters;
        } else {
            this.key = (ECPublicKeyParameters) cipherParameters;
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
        BigInteger cofactor;
        ECFieldElement denominator;
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n11 = parameters.getN();
        BigInteger calculateE = calculateE(n11, bArr);
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n11) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n11) >= 0) {
            return false;
        }
        BigInteger modInverse = bigInteger2.modInverse(n11);
        ECPoint sumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), calculateE.multiply(modInverse).mod(n11), ((ECPublicKeyParameters) this.key).getQ(), bigInteger.multiply(modInverse).mod(n11));
        if (sumOfTwoMultiplies.isInfinity()) {
            return false;
        }
        ECCurve curve = sumOfTwoMultiplies.getCurve();
        if (curve != null && (cofactor = curve.getCofactor()) != null && cofactor.compareTo(ECConstants.EIGHT) <= 0 && (denominator = getDenominator(curve.getCoordinateSystem(), sumOfTwoMultiplies)) != null && !denominator.isZero()) {
            ECFieldElement xCoord = sumOfTwoMultiplies.getXCoord();
            while (curve.isValidFieldElement(bigInteger)) {
                if (curve.fromBigInteger(bigInteger).multiply(denominator).equals(xCoord)) {
                    return true;
                }
                bigInteger = bigInteger.add(n11);
            }
            return false;
        }
        return sumOfTwoMultiplies.normalize().getAffineXCoord().toBigInteger().mod(n11).equals(bigInteger);
    }

    public ECDSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}