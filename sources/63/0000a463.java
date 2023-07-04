package org.spongycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class GF2Matrix extends Matrix {
    private int length;
    private int[][] matrix;

    public GF2Matrix(byte[] bArr) {
        if (bArr.length >= 9) {
            this.numRows = LittleEndianConversions.OS2IP(bArr, 0);
            int OS2IP = LittleEndianConversions.OS2IP(bArr, 4);
            this.numColumns = OS2IP;
            int i11 = this.numRows;
            int i12 = ((OS2IP + 7) >>> 3) * i11;
            if (i11 > 0) {
                int i13 = 8;
                if (i12 == bArr.length - 8) {
                    int i14 = (OS2IP + 31) >>> 5;
                    this.length = i14;
                    this.matrix = (int[][]) Array.newInstance(int.class, i11, i14);
                    int i15 = this.numColumns;
                    int i16 = i15 >> 5;
                    int i17 = i15 & 31;
                    for (int i18 = 0; i18 < this.numRows; i18++) {
                        int i19 = 0;
                        while (i19 < i16) {
                            this.matrix[i18][i19] = LittleEndianConversions.OS2IP(bArr, i13);
                            i19++;
                            i13 += 4;
                        }
                        int i21 = 0;
                        while (i21 < i17) {
                            int[] iArr = this.matrix[i18];
                            iArr[i16] = ((bArr[i13] & 255) << i21) ^ iArr[i16];
                            i21 += 8;
                            i13++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    private static void addToRow(int[] iArr, int[] iArr2, int i11) {
        for (int length = iArr2.length - 1; length >= i11; length--) {
            iArr2[length] = iArr[length] ^ iArr2[length];
        }
    }

    private void assignRandomLowerTriangularMatrix(int i11, SecureRandom secureRandom) {
        this.numRows = i11;
        this.numColumns = i11;
        int i12 = (i11 + 31) >>> 5;
        this.length = i12;
        this.matrix = (int[][]) Array.newInstance(int.class, i11, i12);
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int i14 = i13 >>> 5;
            int i15 = i13 & 31;
            int i16 = 31 - i15;
            int i17 = 1 << i15;
            for (int i18 = 0; i18 < i14; i18++) {
                this.matrix[i13][i18] = secureRandom.nextInt();
            }
            this.matrix[i13][i14] = i17 | (secureRandom.nextInt() >>> i16);
            while (true) {
                i14++;
                if (i14 < this.length) {
                    this.matrix[i13][i14] = 0;
                }
            }
        }
    }

    private void assignRandomRegularMatrix(int i11, SecureRandom secureRandom) {
        this.numRows = i11;
        this.numColumns = i11;
        int i12 = (i11 + 31) >>> 5;
        this.length = i12;
        this.matrix = (int[][]) Array.newInstance(int.class, i11, i12);
        GF2Matrix gF2Matrix = (GF2Matrix) new GF2Matrix(i11, Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom).rightMultiply(new GF2Matrix(i11, Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom));
        int[] vector = new Permutation(i11, secureRandom).getVector();
        for (int i13 = 0; i13 < i11; i13++) {
            System.arraycopy(gF2Matrix.matrix[i13], 0, this.matrix[vector[i13]], 0, this.length);
        }
    }

    private void assignRandomUpperTriangularMatrix(int i11, SecureRandom secureRandom) {
        int i12;
        this.numRows = i11;
        this.numColumns = i11;
        int i13 = (i11 + 31) >>> 5;
        this.length = i13;
        this.matrix = (int[][]) Array.newInstance(int.class, i11, i13);
        int i14 = i11 & 31;
        int i15 = i14 == 0 ? -1 : (1 << i14) - 1;
        for (int i16 = 0; i16 < this.numRows; i16++) {
            int i17 = i16 >>> 5;
            int i18 = i16 & 31;
            int i19 = 1 << i18;
            for (int i21 = 0; i21 < i17; i21++) {
                this.matrix[i16][i21] = 0;
            }
            this.matrix[i16][i17] = (secureRandom.nextInt() << i18) | i19;
            while (true) {
                i17++;
                i12 = this.length;
                if (i17 < i12) {
                    this.matrix[i16][i17] = secureRandom.nextInt();
                }
            }
            int[] iArr = this.matrix[i16];
            int i22 = i12 - 1;
            iArr[i22] = iArr[i22] & i15;
        }
    }

    private void assignUnitMatrix(int i11) {
        this.numRows = i11;
        this.numColumns = i11;
        int i12 = (i11 + 31) >>> 5;
        this.length = i12;
        int[] iArr = {i11, i12};
        this.matrix = (int[][]) Array.newInstance(int.class, iArr);
        for (int i13 = 0; i13 < this.numRows; i13++) {
            for (int i14 = 0; i14 < this.length; i14++) {
                this.matrix[i13][i14] = 0;
            }
        }
        for (int i15 = 0; i15 < this.numRows; i15++) {
            this.matrix[i15][i15 >>> 5] = 1 << (i15 & 31);
        }
    }

    private void assignZeroMatrix(int i11, int i12) {
        this.numRows = i11;
        this.numColumns = i12;
        int i13 = (i12 + 31) >>> 5;
        this.length = i13;
        this.matrix = (int[][]) Array.newInstance(int.class, i11, i13);
        for (int i14 = 0; i14 < this.numRows; i14++) {
            for (int i15 = 0; i15 < this.length; i15++) {
                this.matrix[i14][i15] = 0;
            }
        }
    }

    public static GF2Matrix[] createRandomRegularMatrixAndItsInverse(int i11, SecureRandom secureRandom) {
        GF2Matrix[] gF2MatrixArr = new GF2Matrix[2];
        int i12 = (i11 + 31) >> 5;
        GF2Matrix gF2Matrix = new GF2Matrix(i11, Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom);
        GF2Matrix gF2Matrix2 = new GF2Matrix(i11, Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom);
        GF2Matrix gF2Matrix3 = (GF2Matrix) gF2Matrix.rightMultiply(gF2Matrix2);
        Permutation permutation = new Permutation(i11, secureRandom);
        int[] vector = permutation.getVector();
        int i13 = 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i11, i12);
        for (int i14 = 0; i14 < i11; i14++) {
            System.arraycopy(gF2Matrix3.matrix[vector[i14]], 0, iArr[i14], 0, i12);
        }
        gF2MatrixArr[0] = new GF2Matrix(i11, iArr);
        GF2Matrix gF2Matrix4 = new GF2Matrix(i11, 'I');
        int i15 = 0;
        while (i15 < i11) {
            int i16 = i15 >>> 5;
            int i17 = 1 << (i15 & 31);
            int i18 = i15 + 1;
            int i19 = i18;
            while (i19 < i11) {
                if ((gF2Matrix.matrix[i19][i16] & i17) != 0) {
                    for (int i21 = i13; i21 <= i16; i21++) {
                        int[][] iArr2 = gF2Matrix4.matrix;
                        int[] iArr3 = iArr2[i19];
                        iArr3[i21] = iArr3[i21] ^ iArr2[i15][i21];
                    }
                }
                i19++;
                i13 = 0;
            }
            i15 = i18;
        }
        GF2Matrix gF2Matrix5 = new GF2Matrix(i11, 'I');
        for (int i22 = i11 - 1; i22 >= 0; i22--) {
            int i23 = i22 >>> 5;
            int i24 = 1 << (i22 & 31);
            for (int i25 = i22 - 1; i25 >= 0; i25--) {
                if ((gF2Matrix2.matrix[i25][i23] & i24) != 0) {
                    for (int i26 = i23; i26 < i12; i26++) {
                        int[][] iArr4 = gF2Matrix5.matrix;
                        int[] iArr5 = iArr4[i25];
                        iArr5[i26] = iArr4[i22][i26] ^ iArr5[i26];
                    }
                }
            }
        }
        gF2MatrixArr[1] = (GF2Matrix) gF2Matrix5.rightMultiply(gF2Matrix4.rightMultiply(permutation));
        return gF2MatrixArr;
    }

    private static void swapRows(int[][] iArr, int i11, int i12) {
        int[] iArr2 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = iArr2;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i11 = this.numRows;
        if (i11 == this.numColumns) {
            int[][] iArr = (int[][]) Array.newInstance(int.class, i11, this.length);
            for (int i12 = this.numRows - 1; i12 >= 0; i12--) {
                iArr[i12] = IntUtils.clone(this.matrix[i12]);
            }
            int[][] iArr2 = (int[][]) Array.newInstance(int.class, this.numRows, this.length);
            for (int i13 = this.numRows - 1; i13 >= 0; i13--) {
                iArr2[i13][i13 >> 5] = 1 << (i13 & 31);
            }
            for (int i14 = 0; i14 < this.numRows; i14++) {
                int i15 = i14 >> 5;
                int i16 = 1 << (i14 & 31);
                if ((iArr[i14][i15] & i16) == 0) {
                    int i17 = i14 + 1;
                    boolean z11 = false;
                    while (i17 < this.numRows) {
                        if ((iArr[i17][i15] & i16) != 0) {
                            swapRows(iArr, i14, i17);
                            swapRows(iArr2, i14, i17);
                            i17 = this.numRows;
                            z11 = true;
                        }
                        i17++;
                    }
                    if (!z11) {
                        throw new ArithmeticException("Matrix is not invertible.");
                    }
                }
                for (int i18 = this.numRows - 1; i18 >= 0; i18--) {
                    if (i18 != i14 && (iArr[i18][i15] & i16) != 0) {
                        addToRow(iArr[i14], iArr[i18], i15);
                        addToRow(iArr2[i14], iArr2[i18], 0);
                    }
                }
            }
            return new GF2Matrix(this.numColumns, iArr2);
        }
        throw new ArithmeticException("Matrix is not invertible.");
    }

    public Matrix computeTranspose() {
        int[][] iArr = (int[][]) Array.newInstance(int.class, this.numColumns, (this.numRows + 31) >>> 5);
        int i11 = 0;
        while (true) {
            int i12 = this.numRows;
            if (i11 < i12) {
                for (int i13 = 0; i13 < this.numColumns; i13++) {
                    int i14 = i11 >>> 5;
                    int i15 = i11 & 31;
                    if (((this.matrix[i11][i13 >>> 5] >>> (i13 & 31)) & 1) == 1) {
                        int[] iArr2 = iArr[i13];
                        iArr2[i14] = (1 << i15) | iArr2[i14];
                    }
                }
                i11++;
            } else {
                return new GF2Matrix(i12, iArr);
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof GF2Matrix) {
            GF2Matrix gF2Matrix = (GF2Matrix) obj;
            if (this.numRows == gF2Matrix.numRows && this.numColumns == gF2Matrix.numColumns && this.length == gF2Matrix.length) {
                for (int i11 = 0; i11 < this.numRows; i11++) {
                    if (!IntUtils.equals(this.matrix[i11], gF2Matrix.matrix[i11])) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public GF2Matrix extendLeftCompactForm() {
        int i11 = this.numColumns;
        int i12 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i12, i11 + i12);
        int i13 = this.numRows;
        int i14 = (i13 - 1) + this.numColumns;
        int i15 = i13 - 1;
        while (i15 >= 0) {
            System.arraycopy(this.matrix[i15], 0, gF2Matrix.matrix[i15], 0, this.length);
            int[] iArr = gF2Matrix.matrix[i15];
            int i16 = i14 >> 5;
            iArr[i16] = iArr[i16] | (1 << (i14 & 31));
            i15--;
            i14--;
        }
        return gF2Matrix;
    }

    public GF2Matrix extendRightCompactForm() {
        int i11;
        int i12 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i12, this.numColumns + i12);
        int i13 = this.numRows;
        int i14 = i13 >> 5;
        int i15 = i13 & 31;
        for (int i16 = i13 - 1; i16 >= 0; i16--) {
            int[][] iArr = gF2Matrix.matrix;
            int[] iArr2 = iArr[i16];
            int i17 = i16 >> 5;
            iArr2[i17] = iArr2[i17] | (1 << (i16 & 31));
            int i18 = 0;
            if (i15 != 0) {
                int i19 = i14;
                while (true) {
                    i11 = this.length;
                    if (i18 >= i11 - 1) {
                        break;
                    }
                    int i21 = this.matrix[i16][i18];
                    int[][] iArr3 = gF2Matrix.matrix;
                    int[] iArr4 = iArr3[i16];
                    int i22 = i19 + 1;
                    iArr4[i19] = iArr4[i19] | (i21 << i15);
                    int[] iArr5 = iArr3[i16];
                    iArr5[i22] = (i21 >>> (32 - i15)) | iArr5[i22];
                    i18++;
                    i19 = i22;
                }
                int i23 = this.matrix[i16][i11 - 1];
                int[][] iArr6 = gF2Matrix.matrix;
                int[] iArr7 = iArr6[i16];
                int i24 = i19 + 1;
                iArr7[i19] = iArr7[i19] | (i23 << i15);
                if (i24 < gF2Matrix.length) {
                    int[] iArr8 = iArr6[i16];
                    iArr8[i24] = (i23 >>> (32 - i15)) | iArr8[i24];
                }
            } else {
                System.arraycopy(this.matrix[i16], 0, iArr[i16], i14, this.length);
            }
        }
        return gF2Matrix;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i11 = this.numRows;
        int i12 = 8;
        byte[] bArr = new byte[(((this.numColumns + 7) >>> 3) * i11) + 8];
        LittleEndianConversions.I2OSP(i11, bArr, 0);
        LittleEndianConversions.I2OSP(this.numColumns, bArr, 4);
        int i13 = this.numColumns;
        int i14 = i13 >>> 5;
        int i15 = i13 & 31;
        for (int i16 = 0; i16 < this.numRows; i16++) {
            int i17 = 0;
            while (i17 < i14) {
                LittleEndianConversions.I2OSP(this.matrix[i16][i17], bArr, i12);
                i17++;
                i12 += 4;
            }
            int i18 = 0;
            while (i18 < i15) {
                bArr[i12] = (byte) ((this.matrix[i16][i14] >>> i18) & 255);
                i18 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public double getHammingWeight() {
        int i11 = this.numColumns & 31;
        int i12 = i11 == 0 ? this.length : this.length - 1;
        double d11 = 0.0d;
        double d12 = 0.0d;
        for (int i13 = 0; i13 < this.numRows; i13++) {
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = this.matrix[i13][i14];
                for (int i16 = 0; i16 < 32; i16++) {
                    d11 += (i15 >>> i16) & 1;
                    d12 += 1.0d;
                }
            }
            int i17 = this.matrix[i13][this.length - 1];
            for (int i18 = 0; i18 < i11; i18++) {
                d11 += (i17 >>> i18) & 1;
                d12 += 1.0d;
            }
        }
        return d11 / d12;
    }

    public int[][] getIntArray() {
        return this.matrix;
    }

    public GF2Matrix getLeftSubMatrix() {
        int i11 = this.numColumns;
        int i12 = this.numRows;
        if (i11 > i12) {
            int i13 = (i12 + 31) >> 5;
            int[][] iArr = (int[][]) Array.newInstance(int.class, i12, i13);
            int i14 = this.numRows;
            int i15 = (1 << (i14 & 31)) - 1;
            if (i15 == 0) {
                i15 = -1;
            }
            for (int i16 = i14 - 1; i16 >= 0; i16--) {
                System.arraycopy(this.matrix[i16], 0, iArr[i16], 0, i13);
                int[] iArr2 = iArr[i16];
                int i17 = i13 - 1;
                iArr2[i17] = iArr2[i17] & i15;
            }
            return new GF2Matrix(this.numRows, iArr);
        }
        throw new ArithmeticException("empty submatrix");
    }

    public int getLength() {
        return this.length;
    }

    public GF2Matrix getRightSubMatrix() {
        int i11;
        int i12 = this.numColumns;
        int i13 = this.numRows;
        if (i12 > i13) {
            int i14 = i13 >> 5;
            int i15 = i13 & 31;
            GF2Matrix gF2Matrix = new GF2Matrix(i13, i12 - i13);
            for (int i16 = this.numRows - 1; i16 >= 0; i16--) {
                int i17 = 0;
                if (i15 != 0) {
                    int i18 = i14;
                    while (true) {
                        i11 = gF2Matrix.length;
                        if (i17 >= i11 - 1) {
                            break;
                        }
                        int[] iArr = gF2Matrix.matrix[i16];
                        int[][] iArr2 = this.matrix;
                        int i19 = i18 + 1;
                        iArr[i17] = (iArr2[i16][i18] >>> i15) | (iArr2[i16][i19] << (32 - i15));
                        i17++;
                        i18 = i19;
                    }
                    int[][] iArr3 = gF2Matrix.matrix;
                    int[][] iArr4 = this.matrix;
                    int i21 = i18 + 1;
                    iArr3[i16][i11 - 1] = iArr4[i16][i18] >>> i15;
                    if (i21 < this.length) {
                        int[] iArr5 = iArr3[i16];
                        int i22 = i11 - 1;
                        iArr5[i22] = iArr5[i22] | (iArr4[i16][i21] << (32 - i15));
                    }
                } else {
                    System.arraycopy(this.matrix[i16], i14, gF2Matrix.matrix[i16], 0, gF2Matrix.length);
                }
            }
            return gF2Matrix;
        }
        throw new ArithmeticException("empty submatrix");
    }

    public int[] getRow(int i11) {
        return this.matrix[i11];
    }

    public int hashCode() {
        int i11 = (((this.numRows * 31) + this.numColumns) * 31) + this.length;
        for (int i12 = 0; i12 < this.numRows; i12++) {
            i11 = (i11 * 31) + this.matrix[i12].hashCode();
        }
        return i11;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i11 = 0; i11 < this.numRows; i11++) {
            for (int i12 = 0; i12 < this.length; i12++) {
                if (this.matrix[i11][i12] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matrix leftMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i11 = this.numRows;
        if (length == i11) {
            int[][] iArr = new int[i11];
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                iArr[i12] = IntUtils.clone(this.matrix[vector[i12]]);
            }
            return new GF2Matrix(this.numRows, iArr);
        }
        throw new ArithmeticException("length mismatch");
    }

    public Vector leftMultiplyLeftCompactForm(Vector vector) {
        if (vector instanceof GF2Vector) {
            if (vector.length == this.numRows) {
                int[] vecArray = ((GF2Vector) vector).getVecArray();
                int i11 = this.numRows;
                int[] iArr = new int[((this.numColumns + i11) + 31) >>> 5];
                int i12 = i11 >>> 5;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = 1;
                    do {
                        if ((vecArray[i14] & i15) != 0) {
                            for (int i16 = 0; i16 < this.length; i16++) {
                                iArr[i16] = iArr[i16] ^ this.matrix[i13][i16];
                            }
                            int i17 = this.numColumns;
                            int i18 = (i17 + i13) >>> 5;
                            iArr[i18] = (1 << ((i17 + i13) & 31)) | iArr[i18];
                        }
                        i13++;
                        i15 <<= 1;
                    } while (i15 != 0);
                }
                int i19 = 1 << (this.numRows & 31);
                for (int i21 = 1; i21 != i19; i21 <<= 1) {
                    if ((vecArray[i12] & i21) != 0) {
                        for (int i22 = 0; i22 < this.length; i22++) {
                            iArr[i22] = iArr[i22] ^ this.matrix[i13][i22];
                        }
                        int i23 = this.numColumns;
                        int i24 = (i23 + i13) >>> 5;
                        iArr[i24] = (1 << ((i23 + i13) & 31)) | iArr[i24];
                    }
                    i13++;
                }
                return new GF2Vector(iArr, this.numRows + this.numColumns);
            }
            throw new ArithmeticException("length mismatch");
        }
        throw new ArithmeticException("vector is not defined over GF(2)");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        int i11;
        if (matrix instanceof GF2Matrix) {
            if (matrix.numRows == this.numColumns) {
                GF2Matrix gF2Matrix = (GF2Matrix) matrix;
                GF2Matrix gF2Matrix2 = new GF2Matrix(this.numRows, matrix.numColumns);
                int i12 = this.numColumns & 31;
                if (i12 == 0) {
                    i11 = this.length;
                } else {
                    i11 = this.length - 1;
                }
                for (int i13 = 0; i13 < this.numRows; i13++) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < i11; i15++) {
                        int i16 = this.matrix[i13][i15];
                        for (int i17 = 0; i17 < 32; i17++) {
                            if (((1 << i17) & i16) != 0) {
                                for (int i18 = 0; i18 < gF2Matrix.length; i18++) {
                                    int[] iArr = gF2Matrix2.matrix[i13];
                                    iArr[i18] = iArr[i18] ^ gF2Matrix.matrix[i14][i18];
                                }
                            }
                            i14++;
                        }
                    }
                    int i19 = this.matrix[i13][this.length - 1];
                    for (int i21 = 0; i21 < i12; i21++) {
                        if (((1 << i21) & i19) != 0) {
                            for (int i22 = 0; i22 < gF2Matrix.length; i22++) {
                                int[] iArr2 = gF2Matrix2.matrix[i13];
                                iArr2[i22] = iArr2[i22] ^ gF2Matrix.matrix[i14][i22];
                            }
                        }
                        i14++;
                    }
                }
                return gF2Matrix2;
            }
            throw new ArithmeticException("length mismatch");
        }
        throw new ArithmeticException("matrix is not defined over GF(2)");
    }

    public Vector rightMultiplyRightCompactForm(Vector vector) {
        int i11;
        if (vector instanceof GF2Vector) {
            if (vector.length == this.numColumns + this.numRows) {
                int[] vecArray = ((GF2Vector) vector).getVecArray();
                int i12 = this.numRows;
                int[] iArr = new int[(i12 + 31) >>> 5];
                int i13 = i12 >> 5;
                int i14 = i12 & 31;
                int i15 = 0;
                while (true) {
                    int i16 = this.numRows;
                    if (i15 < i16) {
                        int i17 = i15 >> 5;
                        int i18 = i15 & 31;
                        int i19 = (vecArray[i17] >>> i18) & 1;
                        if (i14 != 0) {
                            int i21 = i13;
                            int i22 = 0;
                            while (true) {
                                i11 = this.length;
                                if (i22 >= i11 - 1) {
                                    break;
                                }
                                int i23 = i21 + 1;
                                i19 ^= ((vecArray[i21] >>> i14) | (vecArray[i23] << (32 - i14))) & this.matrix[i15][i22];
                                i22++;
                                i21 = i23;
                            }
                            int i24 = i21 + 1;
                            int i25 = vecArray[i21] >>> i14;
                            if (i24 < vecArray.length) {
                                i25 |= vecArray[i24] << (32 - i14);
                            }
                            i19 ^= this.matrix[i15][i11 - 1] & i25;
                        } else {
                            int i26 = i13;
                            int i27 = 0;
                            while (i27 < this.length) {
                                i19 ^= vecArray[i26] & this.matrix[i15][i27];
                                i27++;
                                i26++;
                            }
                        }
                        int i28 = 0;
                        for (int i29 = 0; i29 < 32; i29++) {
                            i28 ^= i19 & 1;
                            i19 >>>= 1;
                        }
                        if (i28 == 1) {
                            iArr[i17] = iArr[i17] | (1 << i18);
                        }
                        i15++;
                    } else {
                        return new GF2Vector(iArr, i16);
                    }
                }
            } else {
                throw new ArithmeticException("length mismatch");
            }
        } else {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public String toString() {
        int i11 = this.numColumns & 31;
        int i12 = i11 == 0 ? this.length : this.length - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i13 = 0; i13 < this.numRows; i13++) {
            stringBuffer.append(i13 + ": ");
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = this.matrix[i13][i14];
                for (int i16 = 0; i16 < 32; i16++) {
                    if (((i15 >>> i16) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i17 = this.matrix[i13][this.length - 1];
            for (int i18 = 0; i18 < i11; i18++) {
                if (((i17 >>> i18) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        if (vector instanceof GF2Vector) {
            if (vector.length == this.numRows) {
                int[] vecArray = ((GF2Vector) vector).getVecArray();
                int[] iArr = new int[this.length];
                int i11 = this.numRows;
                int i12 = i11 >> 5;
                int i13 = 1 << (i11 & 31);
                int i14 = 0;
                for (int i15 = 0; i15 < i12; i15++) {
                    int i16 = 1;
                    do {
                        if ((vecArray[i15] & i16) != 0) {
                            for (int i17 = 0; i17 < this.length; i17++) {
                                iArr[i17] = iArr[i17] ^ this.matrix[i14][i17];
                            }
                        }
                        i14++;
                        i16 <<= 1;
                    } while (i16 != 0);
                }
                for (int i18 = 1; i18 != i13; i18 <<= 1) {
                    if ((vecArray[i12] & i18) != 0) {
                        for (int i19 = 0; i19 < this.length; i19++) {
                            iArr[i19] = iArr[i19] ^ this.matrix[i14][i19];
                        }
                    }
                    i14++;
                }
                return new GF2Vector(iArr, this.numColumns);
            }
            throw new ArithmeticException("length mismatch");
        }
        throw new ArithmeticException("vector is not defined over GF(2)");
    }

    public GF2Matrix(int i11, int[][] iArr) {
        if (iArr[0].length == ((i11 + 31) >> 5)) {
            this.numColumns = i11;
            this.numRows = iArr.length;
            this.length = iArr[0].length;
            int i12 = i11 & 31;
            int i13 = i12 == 0 ? -1 : (1 << i12) - 1;
            for (int i14 = 0; i14 < this.numRows; i14++) {
                int[] iArr2 = iArr[i14];
                int i15 = this.length - 1;
                iArr2[i15] = iArr2[i15] & i13;
            }
            this.matrix = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i11 = this.numColumns;
        if (length == i11) {
            GF2Matrix gF2Matrix = new GF2Matrix(this.numRows, i11);
            for (int i12 = this.numColumns - 1; i12 >= 0; i12--) {
                int i13 = i12 >>> 5;
                int i14 = i12 & 31;
                int i15 = vector[i12] >>> 5;
                int i16 = vector[i12] & 31;
                for (int i17 = this.numRows - 1; i17 >= 0; i17--) {
                    int[] iArr = gF2Matrix.matrix[i17];
                    iArr[i13] = iArr[i13] | (((this.matrix[i17][i15] >>> i16) & 1) << i14);
                }
            }
            return gF2Matrix;
        }
        throw new ArithmeticException("length mismatch");
    }

    public GF2Matrix(int i11, char c11) {
        this(i11, c11, new SecureRandom());
    }

    public GF2Matrix(int i11, char c11, SecureRandom secureRandom) {
        if (i11 <= 0) {
            throw new ArithmeticException("Size of matrix is non-positive.");
        }
        if (c11 == 'I') {
            assignUnitMatrix(i11);
        } else if (c11 == 'L') {
            assignRandomLowerTriangularMatrix(i11, secureRandom);
        } else if (c11 == 'R') {
            assignRandomRegularMatrix(i11, secureRandom);
        } else if (c11 == 'U') {
            assignRandomUpperTriangularMatrix(i11, secureRandom);
        } else if (c11 == 'Z') {
            assignZeroMatrix(i11, i11);
        } else {
            throw new ArithmeticException("Unknown matrix type.");
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        if (vector instanceof GF2Vector) {
            if (vector.length == this.numColumns) {
                int[] vecArray = ((GF2Vector) vector).getVecArray();
                int[] iArr = new int[(this.numRows + 31) >>> 5];
                int i11 = 0;
                while (true) {
                    int i12 = this.numRows;
                    if (i11 < i12) {
                        int i13 = 0;
                        for (int i14 = 0; i14 < this.length; i14++) {
                            i13 ^= this.matrix[i11][i14] & vecArray[i14];
                        }
                        int i15 = 0;
                        for (int i16 = 0; i16 < 32; i16++) {
                            i15 ^= (i13 >>> i16) & 1;
                        }
                        if (i15 == 1) {
                            int i17 = i11 >>> 5;
                            iArr[i17] = iArr[i17] | (1 << (i11 & 31));
                        }
                        i11++;
                    } else {
                        return new GF2Vector(iArr, i12);
                    }
                }
            } else {
                throw new ArithmeticException("length mismatch");
            }
        } else {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
    }

    public GF2Matrix(GF2Matrix gF2Matrix) {
        this.numColumns = gF2Matrix.getNumColumns();
        this.numRows = gF2Matrix.getNumRows();
        this.length = gF2Matrix.length;
        this.matrix = new int[gF2Matrix.matrix.length];
        int i11 = 0;
        while (true) {
            int[][] iArr = this.matrix;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = IntUtils.clone(gF2Matrix.matrix[i11]);
            i11++;
        }
    }

    private GF2Matrix(int i11, int i12) {
        if (i12 > 0 && i11 > 0) {
            assignZeroMatrix(i11, i12);
            return;
        }
        throw new ArithmeticException("size of matrix is non-positive");
    }
}