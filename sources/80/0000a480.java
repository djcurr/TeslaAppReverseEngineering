package org.spongycastle.pqc.math.ntru.polynomial;

import java.math.BigDecimal;

/* loaded from: classes4.dex */
public class BigDecimalPolynomial {
    BigDecimal[] coeffs;
    private static final BigDecimal ZERO = new BigDecimal("0");
    private static final BigDecimal ONE_HALF = new BigDecimal("0.5");

    /* JADX INFO: Access modifiers changed from: package-private */
    public BigDecimalPolynomial(int i11) {
        this.coeffs = new BigDecimal[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.coeffs[i12] = ZERO;
        }
    }

    private BigDecimal[] copyOf(BigDecimal[] bigDecimalArr, int i11) {
        BigDecimal[] bigDecimalArr2 = new BigDecimal[i11];
        if (bigDecimalArr.length < i11) {
            i11 = bigDecimalArr.length;
        }
        System.arraycopy(bigDecimalArr, 0, bigDecimalArr2, 0, i11);
        return bigDecimalArr2;
    }

    private BigDecimal[] copyOfRange(BigDecimal[] bigDecimalArr, int i11, int i12) {
        int i13 = i12 - i11;
        BigDecimal[] bigDecimalArr2 = new BigDecimal[i13];
        if (bigDecimalArr.length - i11 < i13) {
            i13 = bigDecimalArr.length - i11;
        }
        System.arraycopy(bigDecimalArr, i11, bigDecimalArr2, 0, i13);
        return bigDecimalArr2;
    }

    private BigDecimalPolynomial multRecursive(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = this.coeffs;
        BigDecimal[] bigDecimalArr2 = bigDecimalPolynomial.coeffs;
        int length = bigDecimalArr2.length;
        int i11 = 0;
        if (length <= 1) {
            BigDecimal[] bigDecimalArr3 = (BigDecimal[]) bigDecimalArr.clone();
            for (int i12 = 0; i12 < this.coeffs.length; i12++) {
                bigDecimalArr3[i12] = bigDecimalArr3[i12].multiply(bigDecimalPolynomial.coeffs[0]);
            }
            return new BigDecimalPolynomial(bigDecimalArr3);
        }
        int i13 = length / 2;
        BigDecimalPolynomial bigDecimalPolynomial2 = new BigDecimalPolynomial(copyOf(bigDecimalArr, i13));
        BigDecimalPolynomial bigDecimalPolynomial3 = new BigDecimalPolynomial(copyOfRange(bigDecimalArr, i13, length));
        BigDecimalPolynomial bigDecimalPolynomial4 = new BigDecimalPolynomial(copyOf(bigDecimalArr2, i13));
        BigDecimalPolynomial bigDecimalPolynomial5 = new BigDecimalPolynomial(copyOfRange(bigDecimalArr2, i13, length));
        BigDecimalPolynomial bigDecimalPolynomial6 = (BigDecimalPolynomial) bigDecimalPolynomial2.clone();
        bigDecimalPolynomial6.add(bigDecimalPolynomial3);
        BigDecimalPolynomial bigDecimalPolynomial7 = (BigDecimalPolynomial) bigDecimalPolynomial4.clone();
        bigDecimalPolynomial7.add(bigDecimalPolynomial5);
        BigDecimalPolynomial multRecursive = bigDecimalPolynomial2.multRecursive(bigDecimalPolynomial4);
        BigDecimalPolynomial multRecursive2 = bigDecimalPolynomial3.multRecursive(bigDecimalPolynomial5);
        BigDecimalPolynomial multRecursive3 = bigDecimalPolynomial6.multRecursive(bigDecimalPolynomial7);
        multRecursive3.sub(multRecursive);
        multRecursive3.sub(multRecursive2);
        BigDecimalPolynomial bigDecimalPolynomial8 = new BigDecimalPolynomial((length * 2) - 1);
        int i14 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr4 = multRecursive.coeffs;
            if (i14 >= bigDecimalArr4.length) {
                break;
            }
            bigDecimalPolynomial8.coeffs[i14] = bigDecimalArr4[i14];
            i14++;
        }
        int i15 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr5 = multRecursive3.coeffs;
            if (i15 >= bigDecimalArr5.length) {
                break;
            }
            BigDecimal[] bigDecimalArr6 = bigDecimalPolynomial8.coeffs;
            int i16 = i13 + i15;
            bigDecimalArr6[i16] = bigDecimalArr6[i16].add(bigDecimalArr5[i15]);
            i15++;
        }
        while (true) {
            BigDecimal[] bigDecimalArr7 = multRecursive2.coeffs;
            if (i11 >= bigDecimalArr7.length) {
                return bigDecimalPolynomial8;
            }
            BigDecimal[] bigDecimalArr8 = bigDecimalPolynomial8.coeffs;
            int i17 = (i13 * 2) + i11;
            bigDecimalArr8[i17] = bigDecimalArr8[i17].add(bigDecimalArr7[i11]);
            i11++;
        }
    }

    public void add(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = bigDecimalPolynomial.coeffs;
        int length = bigDecimalArr.length;
        BigDecimal[] bigDecimalArr2 = this.coeffs;
        if (length > bigDecimalArr2.length) {
            int length2 = bigDecimalArr2.length;
            this.coeffs = copyOf(bigDecimalArr2, bigDecimalArr.length);
            while (true) {
                BigDecimal[] bigDecimalArr3 = this.coeffs;
                if (length2 >= bigDecimalArr3.length) {
                    break;
                }
                bigDecimalArr3[length2] = ZERO;
                length2++;
            }
        }
        int i11 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr4 = bigDecimalPolynomial.coeffs;
            if (i11 >= bigDecimalArr4.length) {
                return;
            }
            BigDecimal[] bigDecimalArr5 = this.coeffs;
            bigDecimalArr5[i11] = bigDecimalArr5[i11].add(bigDecimalArr4[i11]);
            i11++;
        }
    }

    public Object clone() {
        return new BigDecimalPolynomial((BigDecimal[]) this.coeffs.clone());
    }

    public BigDecimal[] getCoeffs() {
        BigDecimal[] bigDecimalArr = this.coeffs;
        BigDecimal[] bigDecimalArr2 = new BigDecimal[bigDecimalArr.length];
        System.arraycopy(bigDecimalArr, 0, bigDecimalArr2, 0, bigDecimalArr.length);
        return bigDecimalArr2;
    }

    public void halve() {
        int i11 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr = this.coeffs;
            if (i11 >= bigDecimalArr.length) {
                return;
            }
            bigDecimalArr[i11] = bigDecimalArr[i11].multiply(ONE_HALF);
            i11++;
        }
    }

    public BigDecimalPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        return mult(new BigDecimalPolynomial(bigIntPolynomial));
    }

    public BigIntPolynomial round() {
        int length = this.coeffs.length;
        BigIntPolynomial bigIntPolynomial = new BigIntPolynomial(length);
        for (int i11 = 0; i11 < length; i11++) {
            bigIntPolynomial.coeffs[i11] = this.coeffs[i11].setScale(0, 6).toBigInteger();
        }
        return bigIntPolynomial;
    }

    void sub(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = bigDecimalPolynomial.coeffs;
        int length = bigDecimalArr.length;
        BigDecimal[] bigDecimalArr2 = this.coeffs;
        if (length > bigDecimalArr2.length) {
            int length2 = bigDecimalArr2.length;
            this.coeffs = copyOf(bigDecimalArr2, bigDecimalArr.length);
            while (true) {
                BigDecimal[] bigDecimalArr3 = this.coeffs;
                if (length2 >= bigDecimalArr3.length) {
                    break;
                }
                bigDecimalArr3[length2] = ZERO;
                length2++;
            }
        }
        int i11 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr4 = bigDecimalPolynomial.coeffs;
            if (i11 >= bigDecimalArr4.length) {
                return;
            }
            BigDecimal[] bigDecimalArr5 = this.coeffs;
            bigDecimalArr5[i11] = bigDecimalArr5[i11].subtract(bigDecimalArr4[i11]);
            i11++;
        }
    }

    public BigDecimalPolynomial mult(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr;
        int length = this.coeffs.length;
        if (bigDecimalPolynomial.coeffs.length == length) {
            BigDecimalPolynomial multRecursive = multRecursive(bigDecimalPolynomial);
            if (multRecursive.coeffs.length > length) {
                int i11 = length;
                while (true) {
                    bigDecimalArr = multRecursive.coeffs;
                    if (i11 >= bigDecimalArr.length) {
                        break;
                    }
                    int i12 = i11 - length;
                    bigDecimalArr[i12] = bigDecimalArr[i12].add(bigDecimalArr[i11]);
                    i11++;
                }
                multRecursive.coeffs = copyOf(bigDecimalArr, length);
            }
            return multRecursive;
        }
        throw new IllegalArgumentException("Number of coefficients must be the same");
    }

    BigDecimalPolynomial(BigDecimal[] bigDecimalArr) {
        this.coeffs = bigDecimalArr;
    }

    public BigDecimalPolynomial(BigIntPolynomial bigIntPolynomial) {
        int length = bigIntPolynomial.coeffs.length;
        this.coeffs = new BigDecimal[length];
        for (int i11 = 0; i11 < length; i11++) {
            this.coeffs[i11] = new BigDecimal(bigIntPolynomial.coeffs[i11]);
        }
    }
}