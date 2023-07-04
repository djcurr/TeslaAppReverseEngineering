package org.spongycastle.pqc.math.ntru.polynomial;

import java.lang.reflect.Array;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class LongPolynomial5 {
    private long[] coeffs;
    private int numCoeffs;

    public LongPolynomial5(IntegerPolynomial integerPolynomial) {
        int length = integerPolynomial.coeffs.length;
        this.numCoeffs = length;
        this.coeffs = new long[(length + 4) / 5];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.numCoeffs; i13++) {
            long[] jArr = this.coeffs;
            jArr[i11] = jArr[i11] | (integerPolynomial.coeffs[i13] << i12);
            i12 += 12;
            if (i12 >= 60) {
                i11++;
                i12 = 0;
            }
        }
    }

    public LongPolynomial5 mult(TernaryPolynomial ternaryPolynomial) {
        long j11;
        int i11;
        long[][] jArr = (long[][]) Array.newInstance(long.class, 5, (this.coeffs.length + ((ternaryPolynomial.size() + 4) / 5)) - 1);
        int[] ones = ternaryPolynomial.getOnes();
        for (int i12 = 0; i12 != ones.length; i12++) {
            int i13 = ones[i12];
            int i14 = i13 / 5;
            int i15 = i13 - (i14 * 5);
            int i16 = 0;
            while (true) {
                long[] jArr2 = this.coeffs;
                if (i16 < jArr2.length) {
                    jArr[i15][i14] = (jArr[i15][i14] + jArr2[i16]) & 576319980446939135L;
                    i14++;
                    i16++;
                }
            }
        }
        int[] negOnes = ternaryPolynomial.getNegOnes();
        for (int i17 = 0; i17 != negOnes.length; i17++) {
            int i18 = negOnes[i17];
            int i19 = i18 / 5;
            int i21 = i18 - (i19 * 5);
            int i22 = 0;
            while (true) {
                long[] jArr3 = this.coeffs;
                if (i22 < jArr3.length) {
                    jArr[i21][i19] = ((jArr[i21][i19] + 576601524159907840L) - jArr3[i22]) & 576319980446939135L;
                    i19++;
                    i22++;
                }
            }
        }
        long[] copyOf = Arrays.copyOf(jArr[0], jArr[0].length + 1);
        for (int i23 = 1; i23 <= 4; i23++) {
            int i24 = i23 * 12;
            int i25 = 60 - i24;
            long j12 = (1 << i25) - 1;
            int length = jArr[i23].length;
            int i26 = 0;
            while (i26 < length) {
                copyOf[i26] = (copyOf[i26] + ((jArr[i23][i26] & j12) << i24)) & 576319980446939135L;
                i26++;
                copyOf[i26] = (copyOf[i26] + (jArr[i23][i26] >> i25)) & 576319980446939135L;
            }
        }
        int i27 = (this.numCoeffs % 5) * 12;
        for (int length2 = this.coeffs.length - 1; length2 < copyOf.length; length2++) {
            long[] jArr4 = this.coeffs;
            if (length2 == jArr4.length - 1) {
                j11 = this.numCoeffs == 5 ? 0L : copyOf[length2] >> i27;
                i11 = 0;
            } else {
                j11 = copyOf[length2];
                i11 = (length2 * 5) - this.numCoeffs;
            }
            int i28 = i11 / 5;
            int i29 = i11 - (i28 * 5);
            long j13 = j11 << (i29 * 12);
            long j14 = j11 >> ((5 - i29) * 12);
            copyOf[i28] = (copyOf[i28] + j13) & 576319980446939135L;
            int i31 = i28 + 1;
            if (i31 < jArr4.length) {
                copyOf[i31] = (copyOf[i31] + j14) & 576319980446939135L;
            }
        }
        return new LongPolynomial5(copyOf, this.numCoeffs);
    }

    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.numCoeffs];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.numCoeffs; i13++) {
            iArr[i13] = (int) ((this.coeffs[i11] >> i12) & 2047);
            i12 += 12;
            if (i12 >= 60) {
                i11++;
                i12 = 0;
            }
        }
        return new IntegerPolynomial(iArr);
    }

    private LongPolynomial5(long[] jArr, int i11) {
        this.coeffs = jArr;
        this.numCoeffs = i11;
    }
}