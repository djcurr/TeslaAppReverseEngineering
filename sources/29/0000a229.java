package org.spongycastle.math;

import com.plaid.internal.d;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;

/* loaded from: classes4.dex */
public abstract class Primes {
    public static final int SMALL_FACTOR_LIMIT = 211;
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger THREE = BigInteger.valueOf(3);

    /* loaded from: classes4.dex */
    public static class MROutput {
        private BigInteger factor;
        private boolean provablyComposite;

        private MROutput(boolean z11, BigInteger bigInteger) {
            this.provablyComposite = z11;
            this.factor = bigInteger;
        }

        static /* synthetic */ MROutput access$000() {
            return probablyPrime();
        }

        static /* synthetic */ MROutput access$200() {
            return provablyCompositeNotPrimePower();
        }

        private static MROutput probablyPrime() {
            return new MROutput(false, null);
        }

        private static MROutput provablyCompositeNotPrimePower() {
            return new MROutput(true, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MROutput provablyCompositeWithFactor(BigInteger bigInteger) {
            return new MROutput(true, bigInteger);
        }

        public BigInteger getFactor() {
            return this.factor;
        }

        public boolean isNotPrimePower() {
            return this.provablyComposite && this.factor == null;
        }

        public boolean isProvablyComposite() {
            return this.provablyComposite;
        }
    }

    /* loaded from: classes4.dex */
    public static class STOutput {
        private BigInteger prime;
        private int primeGenCounter;
        private byte[] primeSeed;

        public BigInteger getPrime() {
            return this.prime;
        }

        public int getPrimeGenCounter() {
            return this.primeGenCounter;
        }

        public byte[] getPrimeSeed() {
            return this.primeSeed;
        }

        private STOutput(BigInteger bigInteger, byte[] bArr, int i11) {
            this.prime = bigInteger;
            this.primeSeed = bArr;
            this.primeGenCounter = i11;
        }
    }

    private static void checkCandidate(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() < 1 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException("'" + str + "' must be non-null and >= 2");
        }
    }

    public static MROutput enhancedMRProbablePrimeTest(BigInteger bigInteger, SecureRandom secureRandom, int i11) {
        boolean z11;
        BigInteger bigInteger2;
        checkCandidate(bigInteger, "candidate");
        if (secureRandom != null) {
            if (i11 >= 1) {
                if (bigInteger.bitLength() == 2) {
                    return MROutput.access$000();
                }
                if (!bigInteger.testBit(0)) {
                    return MROutput.provablyCompositeWithFactor(TWO);
                }
                BigInteger subtract = bigInteger.subtract(ONE);
                BigInteger subtract2 = bigInteger.subtract(TWO);
                int lowestSetBit = subtract.getLowestSetBit();
                BigInteger shiftRight = subtract.shiftRight(lowestSetBit);
                for (int i12 = 0; i12 < i11; i12++) {
                    BigInteger createRandomInRange = BigIntegers.createRandomInRange(TWO, subtract2, secureRandom);
                    BigInteger gcd = createRandomInRange.gcd(bigInteger);
                    BigInteger bigInteger3 = ONE;
                    if (gcd.compareTo(bigInteger3) > 0) {
                        return MROutput.provablyCompositeWithFactor(gcd);
                    }
                    BigInteger modPow = createRandomInRange.modPow(shiftRight, bigInteger);
                    if (!modPow.equals(bigInteger3) && !modPow.equals(subtract)) {
                        int i13 = 1;
                        while (true) {
                            if (i13 >= lowestSetBit) {
                                z11 = false;
                                bigInteger2 = modPow;
                                break;
                            }
                            bigInteger2 = modPow.modPow(TWO, bigInteger);
                            if (bigInteger2.equals(subtract)) {
                                z11 = true;
                                break;
                            } else if (bigInteger2.equals(ONE)) {
                                z11 = false;
                                break;
                            } else {
                                i13++;
                                modPow = bigInteger2;
                            }
                        }
                        if (!z11) {
                            BigInteger bigInteger4 = ONE;
                            if (!bigInteger2.equals(bigInteger4)) {
                                modPow = bigInteger2.modPow(TWO, bigInteger);
                                if (modPow.equals(bigInteger4)) {
                                    modPow = bigInteger2;
                                }
                            }
                            BigInteger gcd2 = modPow.subtract(bigInteger4).gcd(bigInteger);
                            if (gcd2.compareTo(bigInteger4) > 0) {
                                return MROutput.provablyCompositeWithFactor(gcd2);
                            }
                            return MROutput.access$200();
                        }
                    }
                }
                return MROutput.access$000();
            }
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        throw new IllegalArgumentException("'random' cannot be null");
    }

    private static int extract32(byte[] bArr) {
        int min = Math.min(4, bArr.length);
        int i11 = 0;
        int i12 = 0;
        while (i11 < min) {
            int i13 = i11 + 1;
            i12 |= (bArr[bArr.length - i13] & 255) << (i11 * 8);
            i11 = i13;
        }
        return i12;
    }

    public static STOutput generateSTRandomPrime(Digest digest, int i11, byte[] bArr) {
        if (digest != null) {
            if (i11 >= 2) {
                if (bArr != null && bArr.length != 0) {
                    return implSTRandomPrime(digest, i11, Arrays.clone(bArr));
                }
                throw new IllegalArgumentException("'inputSeed' cannot be null or empty");
            }
            throw new IllegalArgumentException("'length' must be >= 2");
        }
        throw new IllegalArgumentException("'hash' cannot be null");
    }

    public static boolean hasAnySmallFactors(BigInteger bigInteger) {
        checkCandidate(bigInteger, "candidate");
        return implHasAnySmallFactors(bigInteger);
    }

    private static void hash(Digest digest, byte[] bArr, byte[] bArr2, int i11) {
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, i11);
    }

    private static BigInteger hashGen(Digest digest, byte[] bArr, int i11) {
        int digestSize = digest.getDigestSize();
        int i12 = i11 * digestSize;
        byte[] bArr2 = new byte[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            i12 -= digestSize;
            hash(digest, bArr, bArr2, i12);
            inc(bArr, 1);
        }
        return new BigInteger(1, bArr2);
    }

    private static boolean implHasAnySmallFactors(BigInteger bigInteger) {
        int intValue = bigInteger.mod(BigInteger.valueOf(223092870)).intValue();
        if (intValue % 2 != 0 && intValue % 3 != 0 && intValue % 5 != 0 && intValue % 7 != 0 && intValue % 11 != 0 && intValue % 13 != 0 && intValue % 17 != 0 && intValue % 19 != 0 && intValue % 23 != 0) {
            int intValue2 = bigInteger.mod(BigInteger.valueOf(58642669)).intValue();
            if (intValue2 % 29 != 0 && intValue2 % 31 != 0 && intValue2 % 37 != 0 && intValue2 % 41 != 0 && intValue2 % 43 != 0) {
                int intValue3 = bigInteger.mod(BigInteger.valueOf(600662303)).intValue();
                if (intValue3 % 47 != 0 && intValue3 % 53 != 0 && intValue3 % 59 != 0 && intValue3 % 61 != 0 && intValue3 % 67 != 0) {
                    int intValue4 = bigInteger.mod(BigInteger.valueOf(33984931)).intValue();
                    if (intValue4 % 71 != 0 && intValue4 % 73 != 0 && intValue4 % 79 != 0 && intValue4 % 83 != 0) {
                        int intValue5 = bigInteger.mod(BigInteger.valueOf(89809099)).intValue();
                        if (intValue5 % 89 != 0 && intValue5 % 97 != 0 && intValue5 % 101 != 0 && intValue5 % 103 != 0) {
                            int intValue6 = bigInteger.mod(BigInteger.valueOf(167375713)).intValue();
                            if (intValue6 % 107 != 0 && intValue6 % 109 != 0 && intValue6 % 113 != 0 && intValue6 % 127 != 0) {
                                int intValue7 = bigInteger.mod(BigInteger.valueOf(371700317)).intValue();
                                if (intValue7 % d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE != 0 && intValue7 % 137 != 0 && intValue7 % 139 != 0 && intValue7 % 149 != 0) {
                                    int intValue8 = bigInteger.mod(BigInteger.valueOf(645328247)).intValue();
                                    if (intValue8 % 151 != 0 && intValue8 % 157 != 0 && intValue8 % CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 != 0 && intValue8 % CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 != 0) {
                                        int intValue9 = bigInteger.mod(BigInteger.valueOf(1070560157)).intValue();
                                        if (intValue9 % CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 != 0 && intValue9 % CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 != 0 && intValue9 % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 != 0 && intValue9 % CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 != 0) {
                                            int intValue10 = bigInteger.mod(BigInteger.valueOf(1596463769)).intValue();
                                            if (intValue10 % 193 != 0 && intValue10 % 197 != 0 && intValue10 % 199 != 0 && intValue10 % SMALL_FACTOR_LIMIT != 0) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean implMRProbablePrimeToBase(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11, BigInteger bigInteger4) {
        BigInteger modPow = bigInteger4.modPow(bigInteger3, bigInteger);
        if (modPow.equals(ONE) || modPow.equals(bigInteger2)) {
            return true;
        }
        for (int i12 = 1; i12 < i11; i12++) {
            modPow = modPow.modPow(TWO, bigInteger);
            if (modPow.equals(bigInteger2)) {
                return true;
            }
            if (modPow.equals(ONE)) {
                return false;
            }
        }
        return false;
    }

    private static STOutput implSTRandomPrime(Digest digest, int i11, byte[] bArr) {
        Object obj;
        int digestSize = digest.getDigestSize();
        Object obj2 = null;
        int i12 = 1;
        if (i11 < 33) {
            byte[] bArr2 = new byte[digestSize];
            byte[] bArr3 = new byte[digestSize];
            int i13 = 0;
            do {
                hash(digest, bArr, bArr2, 0);
                inc(bArr, 1);
                hash(digest, bArr, bArr3, 0);
                inc(bArr, 1);
                i13++;
                long extract32 = (((extract32(bArr2) ^ extract32(bArr3)) & ((-1) >>> (32 - i11))) | (1 << (i11 - 1)) | 1) & 4294967295L;
                if (isPrime32(extract32)) {
                    return new STOutput(BigInteger.valueOf(extract32), bArr, i13);
                }
            } while (i13 <= i11 * 4);
            throw new IllegalStateException("Too many iterations in Shawe-Taylor Random_Prime Routine");
        }
        STOutput implSTRandomPrime = implSTRandomPrime(digest, (i11 + 3) / 2, bArr);
        BigInteger prime = implSTRandomPrime.getPrime();
        byte[] primeSeed = implSTRandomPrime.getPrimeSeed();
        int primeGenCounter = implSTRandomPrime.getPrimeGenCounter();
        int i14 = i11 - 1;
        int i15 = (i14 / (digestSize * 8)) + 1;
        BigInteger hashGen = hashGen(digest, primeSeed, i15);
        BigInteger bigInteger = ONE;
        BigInteger bit = hashGen.mod(bigInteger.shiftLeft(i14)).setBit(i14);
        BigInteger shiftLeft = prime.shiftLeft(1);
        BigInteger shiftLeft2 = bit.subtract(bigInteger).divide(shiftLeft).add(bigInteger).shiftLeft(1);
        BigInteger add = shiftLeft2.multiply(prime).add(bigInteger);
        int i16 = primeGenCounter;
        int i17 = 0;
        while (true) {
            if (add.bitLength() > i11) {
                BigInteger bigInteger2 = ONE;
                shiftLeft2 = bigInteger2.shiftLeft(i14).subtract(bigInteger2).divide(shiftLeft).add(bigInteger2).shiftLeft(i12);
                add = shiftLeft2.multiply(prime).add(bigInteger2);
            }
            i16 += i12;
            if (!implHasAnySmallFactors(add)) {
                BigInteger add2 = hashGen(digest, primeSeed, i15).mod(add.subtract(THREE)).add(TWO);
                BigInteger add3 = shiftLeft2.add(BigInteger.valueOf(i17));
                BigInteger modPow = add2.modPow(add3, add);
                BigInteger bigInteger3 = ONE;
                if (add.gcd(modPow.subtract(bigInteger3)).equals(bigInteger3) && modPow.modPow(prime, add).equals(bigInteger3)) {
                    return new STOutput(add, primeSeed, i16);
                }
                obj = null;
                shiftLeft2 = add3;
                i17 = 0;
            } else {
                obj = obj2;
                inc(primeSeed, i15);
            }
            if (i16 < (i11 * 4) + primeGenCounter) {
                i17 += 2;
                add = add.add(shiftLeft);
                obj2 = obj;
                i12 = 1;
            } else {
                throw new IllegalStateException("Too many iterations in Shawe-Taylor Random_Prime Routine");
            }
        }
    }

    private static void inc(byte[] bArr, int i11) {
        int length = bArr.length;
        while (i11 > 0) {
            length--;
            if (length < 0) {
                return;
            }
            int i12 = i11 + (bArr[length] & 255);
            bArr[length] = (byte) i12;
            i11 = i12 >>> 8;
        }
    }

    public static boolean isMRProbablePrime(BigInteger bigInteger, SecureRandom secureRandom, int i11) {
        checkCandidate(bigInteger, "candidate");
        if (secureRandom != null) {
            if (i11 >= 1) {
                if (bigInteger.bitLength() == 2) {
                    return true;
                }
                if (bigInteger.testBit(0)) {
                    BigInteger subtract = bigInteger.subtract(ONE);
                    BigInteger subtract2 = bigInteger.subtract(TWO);
                    int lowestSetBit = subtract.getLowestSetBit();
                    BigInteger shiftRight = subtract.shiftRight(lowestSetBit);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (!implMRProbablePrimeToBase(bigInteger, subtract, shiftRight, lowestSetBit, BigIntegers.createRandomInRange(TWO, subtract2, secureRandom))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        throw new IllegalArgumentException("'random' cannot be null");
    }

    public static boolean isMRProbablePrimeToBase(BigInteger bigInteger, BigInteger bigInteger2) {
        checkCandidate(bigInteger, "candidate");
        checkCandidate(bigInteger2, "base");
        BigInteger bigInteger3 = ONE;
        if (bigInteger2.compareTo(bigInteger.subtract(bigInteger3)) < 0) {
            if (bigInteger.bitLength() == 2) {
                return true;
            }
            BigInteger subtract = bigInteger.subtract(bigInteger3);
            int lowestSetBit = subtract.getLowestSetBit();
            return implMRProbablePrimeToBase(bigInteger, subtract, subtract.shiftRight(lowestSetBit), lowestSetBit, bigInteger2);
        }
        throw new IllegalArgumentException("'base' must be < ('candidate' - 1)");
    }

    private static boolean isPrime32(long j11) {
        if ((j11 >>> 32) != 0) {
            throw new IllegalArgumentException("Size limit exceeded");
        }
        int i11 = (j11 > 5L ? 1 : (j11 == 5L ? 0 : -1));
        if (i11 <= 0) {
            return j11 == 2 || j11 == 3 || i11 == 0;
        } else if ((1 & j11) == 0 || j11 % 3 == 0 || j11 % 5 == 0) {
            return false;
        } else {
            long[] jArr = {1, 7, 11, 13, 17, 19, 23, 29};
            long j12 = 0;
            int i12 = 1;
            while (true) {
                if (i12 >= 8) {
                    j12 += 30;
                    if (j12 * j12 >= j11) {
                        return true;
                    }
                    i12 = 0;
                } else if (j11 % (jArr[i12] + j12) == 0) {
                    return j11 < 30;
                } else {
                    i12++;
                }
            }
        }
    }
}