package org.spongycastle.pqc.math.ntru.polynomial;

import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.pqc.math.ntru.util.ArrayEncoder;
import org.spongycastle.pqc.math.ntru.util.Util;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class SparseTernaryPolynomial implements TernaryPolynomial {
    private static final int BITS_PER_INDEX = 11;
    private int N;
    private int[] negOnes;
    private int[] ones;

    SparseTernaryPolynomial(int i11, int[] iArr, int[] iArr2) {
        this.N = i11;
        this.ones = iArr;
        this.negOnes = iArr2;
    }

    public static SparseTernaryPolynomial fromBinary(InputStream inputStream, int i11, int i12, int i13) {
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(2047);
        return new SparseTernaryPolynomial(i11, ArrayEncoder.decodeModQ(Util.readFullLength(inputStream, ((i12 * numberOfLeadingZeros) + 7) / 8), i12, 2048), ArrayEncoder.decodeModQ(Util.readFullLength(inputStream, ((numberOfLeadingZeros * i13) + 7) / 8), i13, 2048));
    }

    public static SparseTernaryPolynomial generateRandom(int i11, int i12, int i13, SecureRandom secureRandom) {
        return new SparseTernaryPolynomial(Util.generateRandomTernary(i11, i12, i13, secureRandom));
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public void clear() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.ones;
            if (i11 >= iArr.length) {
                break;
            }
            iArr[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.negOnes;
            if (i12 >= iArr2.length) {
                return;
            }
            iArr2[i12] = 0;
            i12++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SparseTernaryPolynomial sparseTernaryPolynomial = (SparseTernaryPolynomial) obj;
            return this.N == sparseTernaryPolynomial.N && Arrays.areEqual(this.negOnes, sparseTernaryPolynomial.negOnes) && Arrays.areEqual(this.ones, sparseTernaryPolynomial.ones);
        }
        return false;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int[] getNegOnes() {
        return this.negOnes;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int[] getOnes() {
        return this.ones;
    }

    public int hashCode() {
        return ((((this.N + 31) * 31) + Arrays.hashCode(this.negOnes)) * 31) + Arrays.hashCode(this.ones);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial, org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        int[] iArr = integerPolynomial.coeffs;
        int length = iArr.length;
        int i11 = this.N;
        if (length == i11) {
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr3 = this.ones;
                if (i13 == iArr3.length) {
                    break;
                }
                int i14 = iArr3[i13];
                int i15 = this.N;
                int i16 = (i15 - 1) - i14;
                for (int i17 = i15 - 1; i17 >= 0; i17--) {
                    iArr2[i17] = iArr2[i17] + iArr[i16];
                    i16--;
                    if (i16 < 0) {
                        i16 = this.N - 1;
                    }
                }
                i13++;
            }
            while (true) {
                int[] iArr4 = this.negOnes;
                if (i12 != iArr4.length) {
                    int i18 = iArr4[i12];
                    int i19 = this.N;
                    int i21 = (i19 - 1) - i18;
                    for (int i22 = i19 - 1; i22 >= 0; i22--) {
                        iArr2[i22] = iArr2[i22] - iArr[i21];
                        i21--;
                        if (i21 < 0) {
                            i21 = this.N - 1;
                        }
                    }
                    i12++;
                } else {
                    return new IntegerPolynomial(iArr2);
                }
            }
        } else {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int size() {
        return this.N;
    }

    public byte[] toBinary() {
        byte[] encodeModQ = ArrayEncoder.encodeModQ(this.ones, 2048);
        byte[] encodeModQ2 = ArrayEncoder.encodeModQ(this.negOnes, 2048);
        byte[] copyOf = Arrays.copyOf(encodeModQ, encodeModQ.length + encodeModQ2.length);
        System.arraycopy(encodeModQ2, 0, copyOf, encodeModQ.length, encodeModQ2.length);
        return copyOf;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.N];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.ones;
            if (i12 == iArr2.length) {
                break;
            }
            iArr[iArr2[i12]] = 1;
            i12++;
        }
        while (true) {
            int[] iArr3 = this.negOnes;
            if (i11 != iArr3.length) {
                iArr[iArr3[i11]] = -1;
                i11++;
            } else {
                return new IntegerPolynomial(iArr);
            }
        }
    }

    public SparseTernaryPolynomial(IntegerPolynomial integerPolynomial) {
        this(integerPolynomial.coeffs);
    }

    public SparseTernaryPolynomial(int[] iArr) {
        int length = iArr.length;
        this.N = length;
        this.ones = new int[length];
        this.negOnes = new int[length];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.N; i13++) {
            int i14 = iArr[i13];
            if (i14 == -1) {
                this.negOnes[i12] = i13;
                i12++;
            } else if (i14 == 0) {
                continue;
            } else if (i14 == 1) {
                this.ones[i11] = i13;
                i11++;
            } else {
                throw new IllegalArgumentException("Illegal value: " + i14 + ", must be one of {-1, 0, 1}");
            }
        }
        this.ones = Arrays.copyOf(this.ones, i11);
        this.negOnes = Arrays.copyOf(this.negOnes, i12);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i11) {
        IntegerPolynomial mult = mult(integerPolynomial);
        mult.mod(i11);
        return mult;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        int length = bigIntegerArr.length;
        int i11 = this.N;
        if (length == i11) {
            BigInteger[] bigIntegerArr2 = new BigInteger[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.N; i13++) {
                bigIntegerArr2[i13] = BigInteger.ZERO;
            }
            int i14 = 0;
            while (true) {
                int[] iArr = this.ones;
                if (i14 == iArr.length) {
                    break;
                }
                int i15 = iArr[i14];
                int i16 = this.N;
                int i17 = (i16 - 1) - i15;
                for (int i18 = i16 - 1; i18 >= 0; i18--) {
                    bigIntegerArr2[i18] = bigIntegerArr2[i18].add(bigIntegerArr[i17]);
                    i17--;
                    if (i17 < 0) {
                        i17 = this.N - 1;
                    }
                }
                i14++;
            }
            while (true) {
                int[] iArr2 = this.negOnes;
                if (i12 != iArr2.length) {
                    int i19 = iArr2[i12];
                    int i21 = this.N;
                    int i22 = (i21 - 1) - i19;
                    for (int i23 = i21 - 1; i23 >= 0; i23--) {
                        bigIntegerArr2[i23] = bigIntegerArr2[i23].subtract(bigIntegerArr[i22]);
                        i22--;
                        if (i22 < 0) {
                            i22 = this.N - 1;
                        }
                    }
                    i12++;
                } else {
                    return new BigIntPolynomial(bigIntegerArr2);
                }
            }
        } else {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
    }
}