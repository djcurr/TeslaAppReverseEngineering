package org.spongycastle.pqc.math.ntru.polynomial;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class LongPolynomial2 {
    private long[] coeffs;
    private int numCoeffs;

    public LongPolynomial2(IntegerPolynomial integerPolynomial) {
        int i11;
        long j11;
        int length = integerPolynomial.coeffs.length;
        this.numCoeffs = length;
        this.coeffs = new long[(length + 1) / 2];
        int i12 = 0;
        for (int i13 = 0; i13 < this.numCoeffs; i13 = i11) {
            i11 = i13 + 1;
            int i14 = integerPolynomial.coeffs[i13];
            while (i14 < 0) {
                i14 += 2048;
            }
            if (i11 < this.numCoeffs) {
                i11++;
                j11 = integerPolynomial.coeffs[i11];
            } else {
                j11 = 0;
            }
            while (j11 < 0) {
                j11 += ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
            }
            this.coeffs[i12] = i14 + (j11 << 24);
            i12++;
        }
    }

    private void add(LongPolynomial2 longPolynomial2) {
        long[] jArr = longPolynomial2.coeffs;
        int length = jArr.length;
        long[] jArr2 = this.coeffs;
        if (length > jArr2.length) {
            this.coeffs = Arrays.copyOf(jArr2, jArr.length);
        }
        int i11 = 0;
        while (true) {
            long[] jArr3 = longPolynomial2.coeffs;
            if (i11 >= jArr3.length) {
                return;
            }
            long[] jArr4 = this.coeffs;
            jArr4[i11] = (jArr4[i11] + jArr3[i11]) & 34342963199L;
            i11++;
        }
    }

    private LongPolynomial2 multRecursive(LongPolynomial2 longPolynomial2) {
        long[] jArr = this.coeffs;
        long[] jArr2 = longPolynomial2.coeffs;
        int length = jArr2.length;
        int i11 = 0;
        if (length <= 32) {
            int i12 = length * 2;
            LongPolynomial2 longPolynomial22 = new LongPolynomial2(new long[i12]);
            for (int i13 = 0; i13 < i12; i13++) {
                for (int max = Math.max(0, (i13 - length) + 1); max <= Math.min(i13, length - 1); max++) {
                    long j11 = jArr[i13 - max] * jArr2[max];
                    long[] jArr3 = longPolynomial22.coeffs;
                    jArr3[i13] = (jArr3[i13] + (j11 & ((j11 & 2047) + 34342961152L))) & 34342963199L;
                    int i14 = i13 + 1;
                    jArr3[i14] = (jArr3[i14] + ((j11 >>> 48) & 2047)) & 34342963199L;
                }
            }
            return longPolynomial22;
        }
        int i15 = length / 2;
        LongPolynomial2 longPolynomial23 = new LongPolynomial2(Arrays.copyOf(jArr, i15));
        LongPolynomial2 longPolynomial24 = new LongPolynomial2(Arrays.copyOfRange(jArr, i15, length));
        LongPolynomial2 longPolynomial25 = new LongPolynomial2(Arrays.copyOf(jArr2, i15));
        LongPolynomial2 longPolynomial26 = new LongPolynomial2(Arrays.copyOfRange(jArr2, i15, length));
        LongPolynomial2 longPolynomial27 = (LongPolynomial2) longPolynomial23.clone();
        longPolynomial27.add(longPolynomial24);
        LongPolynomial2 longPolynomial28 = (LongPolynomial2) longPolynomial25.clone();
        longPolynomial28.add(longPolynomial26);
        LongPolynomial2 multRecursive = longPolynomial23.multRecursive(longPolynomial25);
        LongPolynomial2 multRecursive2 = longPolynomial24.multRecursive(longPolynomial26);
        LongPolynomial2 multRecursive3 = longPolynomial27.multRecursive(longPolynomial28);
        multRecursive3.sub(multRecursive);
        multRecursive3.sub(multRecursive2);
        LongPolynomial2 longPolynomial29 = new LongPolynomial2(length * 2);
        int i16 = 0;
        while (true) {
            long[] jArr4 = multRecursive.coeffs;
            if (i16 >= jArr4.length) {
                break;
            }
            longPolynomial29.coeffs[i16] = jArr4[i16] & 34342963199L;
            i16++;
        }
        int i17 = 0;
        while (true) {
            long[] jArr5 = multRecursive3.coeffs;
            if (i17 >= jArr5.length) {
                break;
            }
            long[] jArr6 = longPolynomial29.coeffs;
            int i18 = i15 + i17;
            jArr6[i18] = (jArr6[i18] + jArr5[i17]) & 34342963199L;
            i17++;
        }
        while (true) {
            long[] jArr7 = multRecursive2.coeffs;
            if (i11 >= jArr7.length) {
                return longPolynomial29;
            }
            long[] jArr8 = longPolynomial29.coeffs;
            int i19 = (i15 * 2) + i11;
            jArr8[i19] = (jArr8[i19] + jArr7[i11]) & 34342963199L;
            i11++;
        }
    }

    private void sub(LongPolynomial2 longPolynomial2) {
        long[] jArr = longPolynomial2.coeffs;
        int length = jArr.length;
        long[] jArr2 = this.coeffs;
        if (length > jArr2.length) {
            this.coeffs = Arrays.copyOf(jArr2, jArr.length);
        }
        int i11 = 0;
        while (true) {
            long[] jArr3 = longPolynomial2.coeffs;
            if (i11 >= jArr3.length) {
                return;
            }
            long[] jArr4 = this.coeffs;
            jArr4[i11] = 34342963199L & ((jArr4[i11] + 140737496743936L) - jArr3[i11]);
            i11++;
        }
    }

    public Object clone() {
        LongPolynomial2 longPolynomial2 = new LongPolynomial2((long[]) this.coeffs.clone());
        longPolynomial2.numCoeffs = this.numCoeffs;
        return longPolynomial2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongPolynomial2) {
            return Arrays.areEqual(this.coeffs, ((LongPolynomial2) obj).coeffs);
        }
        return false;
    }

    public LongPolynomial2 mult(LongPolynomial2 longPolynomial2) {
        long[] jArr;
        long[] jArr2;
        int length = this.coeffs.length;
        if (longPolynomial2.coeffs.length == length && this.numCoeffs == longPolynomial2.numCoeffs) {
            LongPolynomial2 multRecursive = multRecursive(longPolynomial2);
            if (multRecursive.coeffs.length > length) {
                if (this.numCoeffs % 2 == 0) {
                    int i11 = length;
                    while (true) {
                        jArr2 = multRecursive.coeffs;
                        if (i11 >= jArr2.length) {
                            break;
                        }
                        int i12 = i11 - length;
                        jArr2[i12] = (jArr2[i12] + jArr2[i11]) & 34342963199L;
                        i11++;
                    }
                    multRecursive.coeffs = Arrays.copyOf(jArr2, length);
                } else {
                    int i13 = length;
                    while (true) {
                        jArr = multRecursive.coeffs;
                        if (i13 >= jArr.length) {
                            break;
                        }
                        int i14 = i13 - length;
                        jArr[i14] = jArr[i14] + (jArr[i13 - 1] >> 24);
                        jArr[i14] = jArr[i14] + ((2047 & jArr[i13]) << 24);
                        jArr[i14] = jArr[i14] & 34342963199L;
                        i13++;
                    }
                    long[] copyOf = Arrays.copyOf(jArr, length);
                    multRecursive.coeffs = copyOf;
                    int length2 = copyOf.length - 1;
                    copyOf[length2] = copyOf[length2] & 2047;
                }
            }
            LongPolynomial2 longPolynomial22 = new LongPolynomial2(multRecursive.coeffs);
            longPolynomial22.numCoeffs = this.numCoeffs;
            return longPolynomial22;
        }
        throw new IllegalArgumentException("Number of coefficients must be the same");
    }

    public void mult2And(int i11) {
        long j11 = i11;
        long j12 = (j11 << 24) + j11;
        int i12 = 0;
        while (true) {
            long[] jArr = this.coeffs;
            if (i12 >= jArr.length) {
                return;
            }
            jArr[i12] = (jArr[i12] << 1) & j12;
            i12++;
        }
    }

    public void subAnd(LongPolynomial2 longPolynomial2, int i11) {
        long j11 = i11;
        long j12 = (j11 << 24) + j11;
        int i12 = 0;
        while (true) {
            long[] jArr = longPolynomial2.coeffs;
            if (i12 >= jArr.length) {
                return;
            }
            long[] jArr2 = this.coeffs;
            jArr2[i12] = ((jArr2[i12] + 140737496743936L) - jArr[i12]) & j12;
            i12++;
        }
    }

    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.numCoeffs];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long[] jArr = this.coeffs;
            if (i11 < jArr.length) {
                int i13 = i12 + 1;
                iArr[i12] = (int) (jArr[i11] & 2047);
                if (i13 < this.numCoeffs) {
                    i12 = i13 + 1;
                    iArr[i13] = (int) ((jArr[i11] >> 24) & 2047);
                } else {
                    i12 = i13;
                }
                i11++;
            } else {
                return new IntegerPolynomial(iArr);
            }
        }
    }

    private LongPolynomial2(long[] jArr) {
        this.coeffs = jArr;
    }

    private LongPolynomial2(int i11) {
        this.coeffs = new long[i11];
    }
}