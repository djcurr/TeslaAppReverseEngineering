package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.DSAParameterGenerationParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAValidationParameters;
import org.spongycastle.crypto.util.DigestFactory;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes4.dex */
public class DSAParametersGenerator {
    private int L;
    private int N;
    private int certainty;
    private Digest digest;
    private int iterations;
    private SecureRandom random;
    private int usageIndex;
    private boolean use186_3;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    public DSAParametersGenerator() {
        this(DigestFactory.createSHA1());
    }

    private static BigInteger calculateGenerator_FIPS186_2(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger divide = bigInteger.subtract(ONE).divide(bigInteger2);
        BigInteger subtract = bigInteger.subtract(TWO);
        do {
            modPow = BigIntegers.createRandomInRange(TWO, subtract, secureRandom).modPow(divide, bigInteger);
        } while (modPow.bitLength() <= 1);
        return modPow;
    }

    private static BigInteger calculateGenerator_FIPS186_3_Unverifiable(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return calculateGenerator_FIPS186_2(bigInteger, bigInteger2, secureRandom);
    }

    private static BigInteger calculateGenerator_FIPS186_3_Verifiable(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i11) {
        BigInteger divide = bigInteger.subtract(ONE).divide(bigInteger2);
        byte[] decode = Hex.decode("6767656E");
        int length = bArr.length + decode.length + 1 + 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decode, 0, bArr2, bArr.length, decode.length);
        bArr2[length - 3] = (byte) i11;
        byte[] bArr3 = new byte[digest.getDigestSize()];
        for (int i12 = 1; i12 < 65536; i12++) {
            inc(bArr2);
            hash(digest, bArr2, bArr3, 0);
            BigInteger modPow = new BigInteger(1, bArr3).modPow(divide, bigInteger);
            if (modPow.compareTo(TWO) >= 0) {
                return modPow;
            }
        }
        return null;
    }

    private DSAParameters generateParameters_FIPS186_2() {
        int i11 = 20;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[20];
        byte[] bArr4 = new byte[20];
        int i12 = this.L;
        int i13 = (i12 - 1) / 160;
        int i14 = i12 / 8;
        byte[] bArr5 = new byte[i14];
        if (!(this.digest instanceof SHA1Digest)) {
            throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
        }
        while (true) {
            this.random.nextBytes(bArr);
            hash(this.digest, bArr, bArr2, 0);
            System.arraycopy(bArr, 0, bArr3, 0, i11);
            inc(bArr3);
            hash(this.digest, bArr3, bArr3, 0);
            for (int i15 = 0; i15 != i11; i15++) {
                bArr4[i15] = (byte) (bArr2[i15] ^ bArr3[i15]);
            }
            bArr4[0] = (byte) (bArr4[0] | Byte.MIN_VALUE);
            bArr4[19] = (byte) (bArr4[19] | 1);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            if (isProbablePrime(bigInteger)) {
                byte[] clone = Arrays.clone(bArr);
                inc(clone);
                int i16 = 0;
                while (i16 < 4096) {
                    for (int i17 = 1; i17 <= i13; i17++) {
                        inc(clone);
                        hash(this.digest, clone, bArr5, i14 - (i17 * 20));
                    }
                    int i18 = i14 - (i13 * 20);
                    inc(clone);
                    hash(this.digest, clone, bArr2, 0);
                    System.arraycopy(bArr2, 20 - i18, bArr5, 0, i18);
                    bArr5[0] = (byte) (bArr5[0] | Byte.MIN_VALUE);
                    BigInteger bigInteger2 = new BigInteger(1, bArr5);
                    BigInteger subtract = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(ONE));
                    if (subtract.bitLength() == this.L && isProbablePrime(subtract)) {
                        return new DSAParameters(subtract, bigInteger, calculateGenerator_FIPS186_2(subtract, bigInteger, this.random), new DSAValidationParameters(bArr, i16));
                    }
                    i16++;
                    i11 = 20;
                }
                continue;
            }
        }
    }

    private DSAParameters generateParameters_FIPS186_3() {
        BigInteger bit;
        int i11;
        BigInteger subtract;
        BigInteger calculateGenerator_FIPS186_3_Verifiable;
        Digest digest = this.digest;
        int digestSize = digest.getDigestSize() * 8;
        byte[] bArr = new byte[this.N / 8];
        int i12 = this.L;
        int i13 = (i12 - 1) / digestSize;
        int i14 = (i12 - 1) % digestSize;
        int i15 = i12 / 8;
        byte[] bArr2 = new byte[i15];
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        loop0: while (true) {
            this.random.nextBytes(bArr);
            int i16 = 0;
            hash(digest, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(ONE.shiftLeft(this.N - 1)).setBit(0).setBit(this.N - 1);
            if (isProbablePrime(bit)) {
                byte[] clone = Arrays.clone(bArr);
                int i17 = this.L * 4;
                i11 = 0;
                while (i11 < i17) {
                    for (int i18 = 1; i18 <= i13; i18++) {
                        inc(clone);
                        hash(digest, clone, bArr2, i15 - (i18 * digestSize2));
                    }
                    int i19 = i15 - (i13 * digestSize2);
                    inc(clone);
                    hash(digest, clone, bArr3, i16);
                    System.arraycopy(bArr3, digestSize2 - i19, bArr2, i16, i19);
                    bArr2[i16] = (byte) (bArr2[i16] | Byte.MIN_VALUE);
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    subtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(ONE));
                    if (subtract.bitLength() == this.L && isProbablePrime(subtract)) {
                        break loop0;
                    }
                    i11++;
                    i16 = 0;
                }
                continue;
            }
        }
        int i21 = this.usageIndex;
        if (i21 >= 0 && (calculateGenerator_FIPS186_3_Verifiable = calculateGenerator_FIPS186_3_Verifiable(digest, subtract, bit, bArr, i21)) != null) {
            return new DSAParameters(subtract, bit, calculateGenerator_FIPS186_3_Verifiable, new DSAValidationParameters(bArr, i11, this.usageIndex));
        }
        return new DSAParameters(subtract, bit, calculateGenerator_FIPS186_3_Unverifiable(subtract, bit, this.random), new DSAValidationParameters(bArr, i11));
    }

    private static int getDefaultN(int i11) {
        return i11 > 1024 ? 256 : 160;
    }

    private static int getMinimumIterations(int i11) {
        if (i11 <= 1024) {
            return 40;
        }
        return (((i11 - 1) / 1024) * 8) + 48;
    }

    private static void hash(Digest digest, byte[] bArr, byte[] bArr2, int i11) {
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, i11);
    }

    private static void inc(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b11 = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b11;
            if (b11 != 0) {
                return;
            }
        }
    }

    private boolean isProbablePrime(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.certainty);
    }

    public DSAParameters generateParameters() {
        if (this.use186_3) {
            return generateParameters_FIPS186_3();
        }
        return generateParameters_FIPS186_2();
    }

    public void init(int i11, int i12, SecureRandom secureRandom) {
        this.L = i11;
        this.N = getDefaultN(i11);
        this.certainty = i12;
        this.iterations = Math.max(getMinimumIterations(this.L), (i12 + 1) / 2);
        this.random = secureRandom;
        this.use186_3 = false;
        this.usageIndex = -1;
    }

    public DSAParametersGenerator(Digest digest) {
        this.digest = digest;
    }

    public void init(DSAParameterGenerationParameters dSAParameterGenerationParameters) {
        int l11 = dSAParameterGenerationParameters.getL();
        int n11 = dSAParameterGenerationParameters.getN();
        if (l11 < 1024 || l11 > 3072 || l11 % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (l11 == 1024 && n11 != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (l11 == 2048 && n11 != 224 && n11 != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (l11 == 3072 && n11 != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.digest.getDigestSize() * 8 >= n11) {
            this.L = l11;
            this.N = n11;
            this.certainty = dSAParameterGenerationParameters.getCertainty();
            this.iterations = Math.max(getMinimumIterations(l11), (this.certainty + 1) / 2);
            this.random = dSAParameterGenerationParameters.getRandom();
            this.use186_3 = true;
            this.usageIndex = dSAParameterGenerationParameters.getUsageIndex();
            return;
        }
        throw new IllegalStateException("Digest output size too small for value of N");
    }
}