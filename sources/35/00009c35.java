package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.RSAKeyGenerationParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.spongycastle.math.Primes;
import org.spongycastle.math.ec.WNafUtil;

/* loaded from: classes4.dex */
public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private int iterations;
    private RSAKeyGenerationParameters param;

    private static int getNumberOfIterations(int i11, int i12) {
        if (i11 >= 1536) {
            if (i12 <= 100) {
                return 3;
            }
            if (i12 <= 128) {
                return 4;
            }
            return 4 + (((i12 - 128) + 1) / 2);
        } else if (i11 >= 1024) {
            if (i12 <= 100) {
                return 4;
            }
            if (i12 <= 112) {
                return 5;
            }
            return (((i12 - 112) + 1) / 2) + 5;
        } else if (i11 < 512) {
            if (i12 <= 80) {
                return 40;
            }
            return 40 + (((i12 - 80) + 1) / 2);
        } else if (i12 <= 80) {
            return 5;
        } else {
            if (i12 <= 100) {
                return 7;
            }
            return (((i12 - 100) + 1) / 2) + 7;
        }
    }

    protected BigInteger chooseRandomPrime(int i11, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i12 = 0; i12 != i11 * 5; i12++) {
            BigInteger bigInteger3 = new BigInteger(i11, 1, this.param.getRandom());
            BigInteger mod = bigInteger3.mod(bigInteger);
            BigInteger bigInteger4 = ONE;
            if (!mod.equals(bigInteger4) && bigInteger3.multiply(bigInteger3).compareTo(bigInteger2) >= 0 && isProbablePrime(bigInteger3) && bigInteger.gcd(bigInteger3.subtract(bigInteger4)).equals(bigInteger4)) {
                return bigInteger3;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger chooseRandomPrime;
        BigInteger multiply;
        BigInteger bigInteger;
        RSAKeyPairGenerator rSAKeyPairGenerator = this;
        int strength = rSAKeyPairGenerator.param.getStrength();
        int i11 = (strength + 1) / 2;
        int i12 = strength - i11;
        int i13 = strength / 2;
        int i14 = i13 - 100;
        int i15 = strength / 3;
        if (i14 < i15) {
            i14 = i15;
        }
        int i16 = strength >> 2;
        BigInteger pow = BigInteger.valueOf(2L).pow(i13);
        BigInteger bigInteger2 = ONE;
        BigInteger shiftLeft = bigInteger2.shiftLeft(strength - 1);
        BigInteger shiftLeft2 = bigInteger2.shiftLeft(i14);
        AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
        boolean z11 = false;
        while (!z11) {
            BigInteger publicExponent = rSAKeyPairGenerator.param.getPublicExponent();
            BigInteger chooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(i11, publicExponent, shiftLeft);
            while (true) {
                chooseRandomPrime = rSAKeyPairGenerator.chooseRandomPrime(i12, publicExponent, shiftLeft);
                BigInteger abs = chooseRandomPrime.subtract(chooseRandomPrime2).abs();
                if (abs.bitLength() >= i14 && abs.compareTo(shiftLeft2) > 0) {
                    multiply = chooseRandomPrime2.multiply(chooseRandomPrime);
                    if (multiply.bitLength() != strength) {
                        chooseRandomPrime2 = chooseRandomPrime2.max(chooseRandomPrime);
                    } else if (WNafUtil.getNafWeight(multiply) >= i16) {
                        break;
                    } else {
                        chooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(i11, publicExponent, shiftLeft);
                    }
                } else {
                    rSAKeyPairGenerator = this;
                    strength = strength;
                }
            }
            if (chooseRandomPrime2.compareTo(chooseRandomPrime) < 0) {
                bigInteger = chooseRandomPrime2;
                chooseRandomPrime2 = chooseRandomPrime;
            } else {
                bigInteger = chooseRandomPrime;
            }
            BigInteger bigInteger3 = ONE;
            BigInteger subtract = chooseRandomPrime2.subtract(bigInteger3);
            BigInteger subtract2 = bigInteger.subtract(bigInteger3);
            int i17 = strength;
            BigInteger modInverse = publicExponent.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) <= 0) {
                rSAKeyPairGenerator = this;
                strength = i17;
            } else {
                asymmetricCipherKeyPair = new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RSAKeyParameters(false, multiply, publicExponent), (AsymmetricKeyParameter) new RSAPrivateCrtKeyParameters(multiply, publicExponent, modInverse, chooseRandomPrime2, bigInteger, modInverse.remainder(subtract), modInverse.remainder(subtract2), bigInteger.modInverse(chooseRandomPrime2)));
                z11 = true;
                strength = i17;
                rSAKeyPairGenerator = this;
            }
        }
        return asymmetricCipherKeyPair;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        RSAKeyGenerationParameters rSAKeyGenerationParameters = (RSAKeyGenerationParameters) keyGenerationParameters;
        this.param = rSAKeyGenerationParameters;
        this.iterations = getNumberOfIterations(rSAKeyGenerationParameters.getStrength(), this.param.getCertainty());
    }

    protected boolean isProbablePrime(BigInteger bigInteger) {
        return !Primes.hasAnySmallFactors(bigInteger) && Primes.isMRProbablePrime(bigInteger, this.param.getRandom(), this.iterations);
    }
}