package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.params.GOST3410Parameters;
import org.spongycastle.crypto.params.GOST3410ValidationParameters;

/* loaded from: classes4.dex */
public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    private int procedure_A(int i11, int i12, BigInteger[] bigIntegerArr, int i13) {
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int i14;
        int i15;
        int i16 = i11;
        while (true) {
            if (i16 >= 0 && i16 <= 65536) {
                break;
            }
            i16 = this.init_random.nextInt() / 32768;
        }
        int i17 = i12;
        while (true) {
            if (i17 >= 0 && i17 <= 65536 && i17 / 2 != 0) {
                break;
            }
            i17 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger3 = new BigInteger(Integer.toString(i17));
        BigInteger bigInteger4 = new BigInteger("19381");
        BigInteger bigInteger5 = new BigInteger(Integer.toString(i16));
        int i18 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger5};
        int[] iArr = {i13};
        int i19 = 0;
        int i21 = 0;
        while (iArr[i19] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i21 = i19 + 1;
            iArr[i21] = iArr[i19] / 2;
            i19 = i21;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i21 + 1];
        int i22 = 16;
        bigIntegerArr4[i21] = new BigInteger("8003", 16);
        int i23 = i21 - 1;
        int i24 = 0;
        while (i24 < i21) {
            int i25 = iArr[i23] / i22;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i18, bigIntegerArr5, i18, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i25 + 1];
                System.arraycopy(bigIntegerArr5, i18, bigIntegerArr2, i18, length2);
                int i26 = i18;
                while (i26 < i25) {
                    int i27 = i26 + 1;
                    bigIntegerArr2[i27] = bigIntegerArr2[i26].multiply(bigInteger4).add(bigInteger3).mod(TWO.pow(i22));
                    i26 = i27;
                }
                BigInteger bigInteger6 = new BigInteger("0");
                for (int i28 = i18; i28 < i25; i28++) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i28].multiply(TWO.pow(i28 * 16)));
                }
                bigIntegerArr2[i18] = bigIntegerArr2[i25];
                BigInteger bigInteger7 = TWO;
                int i29 = i23 + 1;
                BigInteger add = bigInteger7.pow(iArr[i23] - 1).divide(bigIntegerArr4[i29]).add(bigInteger7.pow(iArr[i23] - 1).multiply(bigInteger6).divide(bigIntegerArr4[i29].multiply(bigInteger7.pow(i25 * 16))));
                BigInteger mod = add.mod(bigInteger7);
                BigInteger bigInteger8 = ONE;
                if (mod.compareTo(bigInteger8) == 0) {
                    add = add.add(bigInteger8);
                }
                int i31 = 0;
                while (true) {
                    bigInteger = bigInteger3;
                    bigInteger2 = bigInteger4;
                    long j11 = i31;
                    i14 = i21;
                    BigInteger multiply = bigIntegerArr4[i29].multiply(add.add(BigInteger.valueOf(j11)));
                    BigInteger bigInteger9 = ONE;
                    bigIntegerArr4[i23] = multiply.add(bigInteger9);
                    BigInteger bigInteger10 = bigIntegerArr4[i23];
                    BigInteger bigInteger11 = TWO;
                    i15 = i25;
                    if (bigInteger10.compareTo(bigInteger11.pow(iArr[i23])) == 1) {
                        break;
                    }
                    if (bigInteger11.modPow(bigIntegerArr4[i29].multiply(add.add(BigInteger.valueOf(j11))), bigIntegerArr4[i23]).compareTo(bigInteger9) == 0 && bigInteger11.modPow(add.add(BigInteger.valueOf(j11)), bigIntegerArr4[i23]).compareTo(bigInteger9) != 0) {
                        break;
                    }
                    i31 += 2;
                    i21 = i14;
                    bigInteger4 = bigInteger2;
                    bigInteger3 = bigInteger;
                    i25 = i15;
                }
                i21 = i14;
                bigInteger4 = bigInteger2;
                bigIntegerArr3 = bigIntegerArr2;
                bigInteger3 = bigInteger;
                i25 = i15;
                i18 = 0;
                i22 = 16;
            }
            i23--;
            if (i23 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                return bigIntegerArr2[0].intValue();
            }
            i24++;
            i21 = i14;
            bigInteger4 = bigInteger2;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger3 = bigInteger;
            i18 = 0;
            i22 = 16;
        }
        return bigIntegerArr3[i18].intValue();
    }

    private long procedure_Aa(long j11, long j12, BigInteger[] bigIntegerArr, int i11) {
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int i12;
        long j13 = j11;
        while (true) {
            if (j13 >= 0 && j13 <= 4294967296L) {
                break;
            }
            j13 = this.init_random.nextInt() * 2;
        }
        long j14 = j12;
        while (true) {
            if (j14 >= 0 && j14 <= 4294967296L && j14 / 2 != 0) {
                break;
            }
            j14 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger3 = new BigInteger(Long.toString(j14));
        BigInteger bigInteger4 = new BigInteger("97781173");
        BigInteger bigInteger5 = new BigInteger(Long.toString(j13));
        int i13 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger5};
        int[] iArr = {i11};
        int i14 = 0;
        int i15 = 0;
        while (iArr[i14] >= 33) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i15 = i14 + 1;
            iArr[i15] = iArr[i14] / 2;
            i14 = i15;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i15 + 1];
        bigIntegerArr4[i15] = new BigInteger("8000000B", 16);
        int i16 = i15 - 1;
        int i17 = 0;
        while (i17 < i15) {
            int i18 = 32;
            int i19 = iArr[i16] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i13, bigIntegerArr5, i13, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i19 + 1];
                System.arraycopy(bigIntegerArr5, i13, bigIntegerArr2, i13, length2);
                int i21 = i13;
                while (i21 < i19) {
                    int i22 = i21 + 1;
                    bigIntegerArr2[i22] = bigIntegerArr2[i21].multiply(bigInteger4).add(bigInteger3).mod(TWO.pow(i18));
                    i21 = i22;
                }
                BigInteger bigInteger6 = new BigInteger("0");
                for (int i23 = i13; i23 < i19; i23++) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i23].multiply(TWO.pow(i23 * 32)));
                }
                bigIntegerArr2[i13] = bigIntegerArr2[i19];
                BigInteger bigInteger7 = TWO;
                int i24 = i16 + 1;
                BigInteger add = bigInteger7.pow(iArr[i16] - 1).divide(bigIntegerArr4[i24]).add(bigInteger7.pow(iArr[i16] - 1).multiply(bigInteger6).divide(bigIntegerArr4[i24].multiply(bigInteger7.pow(i19 * 32))));
                BigInteger mod = add.mod(bigInteger7);
                BigInteger bigInteger8 = ONE;
                if (mod.compareTo(bigInteger8) == 0) {
                    add = add.add(bigInteger8);
                }
                int i25 = 0;
                while (true) {
                    long j15 = i25;
                    bigInteger = bigInteger3;
                    BigInteger multiply = bigIntegerArr4[i24].multiply(add.add(BigInteger.valueOf(j15)));
                    BigInteger bigInteger9 = ONE;
                    bigIntegerArr4[i16] = multiply.add(bigInteger9);
                    BigInteger bigInteger10 = bigIntegerArr4[i16];
                    bigInteger2 = bigInteger4;
                    BigInteger bigInteger11 = TWO;
                    i12 = i15;
                    if (bigInteger10.compareTo(bigInteger11.pow(iArr[i16])) == 1) {
                        break;
                    }
                    if (bigInteger11.modPow(bigIntegerArr4[i24].multiply(add.add(BigInteger.valueOf(j15))), bigIntegerArr4[i16]).compareTo(bigInteger9) == 0 && bigInteger11.modPow(add.add(BigInteger.valueOf(j15)), bigIntegerArr4[i16]).compareTo(bigInteger9) != 0) {
                        break;
                    }
                    i25 += 2;
                    bigInteger3 = bigInteger;
                    i15 = i12;
                    bigInteger4 = bigInteger2;
                }
                bigInteger3 = bigInteger;
                bigIntegerArr3 = bigIntegerArr2;
                bigInteger4 = bigInteger2;
                i13 = 0;
                i18 = 32;
                i15 = i12;
            }
            i16--;
            if (i16 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                return bigIntegerArr2[0].longValue();
            }
            i17++;
            bigInteger3 = bigInteger;
            i15 = i12;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger4 = bigInteger2;
            i13 = 0;
        }
        return bigIntegerArr3[i13].longValue();
    }

    private void procedure_B(int i11, int i12, BigInteger[] bigIntegerArr) {
        int i13 = i11;
        while (true) {
            if (i13 >= 0 && i13 <= 65536) {
                break;
            }
            i13 = this.init_random.nextInt() / 32768;
        }
        int i14 = i12;
        while (true) {
            if (i14 >= 0 && i14 <= 65536 && i14 / 2 != 0) {
                break;
            }
            i14 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(i14));
        BigInteger bigInteger2 = new BigInteger("19381");
        int procedure_A = procedure_A(i13, i14, bigIntegerArr2, 256);
        int i15 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int procedure_A2 = procedure_A(procedure_A, i14, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(procedure_A2));
        while (true) {
            int i16 = i15;
            while (i16 < 64) {
                int i17 = i16 + 1;
                bigIntegerArr3[i17] = bigIntegerArr3[i16].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i16 = i17;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i18 = i15; i18 < 64; i18++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i18].multiply(TWO.pow(i18 * 16)));
            }
            bigIntegerArr3[i15] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            int i19 = 1024;
            BigInteger add = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger mod = add.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (mod.compareTo(bigInteger7) == 0) {
                add = add.add(bigInteger7);
            }
            BigInteger bigInteger8 = add;
            int i21 = i15;
            while (true) {
                long j11 = i21;
                BigInteger multiply = bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j11)));
                BigInteger bigInteger9 = ONE;
                BigInteger add2 = multiply.add(bigInteger9);
                BigInteger bigInteger10 = TWO;
                if (add2.compareTo(bigInteger10.pow(i19)) == 1) {
                    break;
                } else if (bigInteger10.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j11))), add2).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger3.multiply(bigInteger8.add(BigInteger.valueOf(j11))), add2).compareTo(bigInteger9) != 0) {
                    bigIntegerArr[0] = add2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i21 += 2;
                    i19 = 1024;
                }
            }
            i15 = 0;
        }
    }

    private void procedure_Bb(long j11, long j12, BigInteger[] bigIntegerArr) {
        long j13 = j11;
        while (true) {
            if (j13 >= 0 && j13 <= 4294967296L) {
                break;
            }
            j13 = this.init_random.nextInt() * 2;
        }
        long j14 = j12;
        while (true) {
            if (j14 >= 0 && j14 <= 4294967296L && j14 / 2 != 0) {
                break;
            }
            j14 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(j14));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long j15 = j14;
        long procedure_Aa = procedure_Aa(j13, j15, bigIntegerArr2, 256);
        int i11 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long procedure_Aa2 = procedure_Aa(procedure_Aa, j15, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(procedure_Aa2));
        while (true) {
            int i12 = i11;
            while (i12 < 32) {
                int i13 = i12 + 1;
                bigIntegerArr3[i13] = bigIntegerArr3[i12].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i12 = i13;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i14 = i11; i14 < 32; i14++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i14].multiply(TWO.pow(i14 * 32)));
            }
            bigIntegerArr3[i11] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            int i15 = 1024;
            BigInteger add = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger mod = add.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (mod.compareTo(bigInteger7) == 0) {
                add = add.add(bigInteger7);
            }
            int i16 = i11;
            while (true) {
                long j16 = i16;
                BigInteger multiply = bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j16)));
                BigInteger bigInteger8 = ONE;
                BigInteger add2 = multiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                if (add2.compareTo(bigInteger9.pow(i15)) == 1) {
                    break;
                } else if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j16))), add2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(add.add(BigInteger.valueOf(j16))), add2).compareTo(bigInteger8) != 0) {
                    bigIntegerArr[0] = add2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i16 += 2;
                    i15 = 1024;
                }
            }
            i11 = 0;
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger subtract = bigInteger.subtract(ONE);
        BigInteger divide = subtract.divide(bigInteger2);
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigInteger3 = new BigInteger(bitLength, this.init_random);
            BigInteger bigInteger4 = ONE;
            if (bigInteger3.compareTo(bigInteger4) > 0 && bigInteger3.compareTo(subtract) < 0) {
                BigInteger modPow = bigInteger3.modPow(divide, bigInteger);
                if (modPow.compareTo(bigInteger4) != 0) {
                    return modPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int nextInt = this.init_random.nextInt();
            int nextInt2 = this.init_random.nextInt();
            int i11 = this.size;
            if (i11 == 512) {
                procedure_A(nextInt, nextInt2, bigIntegerArr, 512);
            } else if (i11 == 1024) {
                procedure_B(nextInt, nextInt2, bigIntegerArr);
            } else {
                throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(nextInt, nextInt2));
        }
        long nextLong = this.init_random.nextLong();
        long nextLong2 = this.init_random.nextLong();
        int i12 = this.size;
        if (i12 == 512) {
            procedure_Aa(nextLong, nextLong2, bigIntegerArr, 512);
        } else if (i12 == 1024) {
            procedure_Bb(nextLong, nextLong2, bigIntegerArr);
        } else {
            throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(nextLong, nextLong2));
    }

    public void init(int i11, int i12, SecureRandom secureRandom) {
        this.size = i11;
        this.typeproc = i12;
        this.init_random = secureRandom;
    }
}