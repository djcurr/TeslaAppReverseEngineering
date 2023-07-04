package org.spongycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;

/* loaded from: classes4.dex */
public class GF2mMatrix extends Matrix {
    protected GF2mField field;
    protected int[][] matrix;

    public GF2mMatrix(GF2mField gF2mField, byte[] bArr) {
        this.field = gF2mField;
        int i11 = 8;
        int i12 = 1;
        while (gF2mField.getDegree() > i11) {
            i12++;
            i11 += 8;
        }
        if (bArr.length >= 5) {
            int i13 = ((((bArr[3] & 255) << 24) ^ ((bArr[2] & 255) << 16)) ^ ((bArr[1] & 255) << 8)) ^ (bArr[0] & 255);
            this.numRows = i13;
            int i14 = i12 * i13;
            if (i13 > 0) {
                int i15 = 4;
                if ((bArr.length - 4) % i14 == 0) {
                    int length = (bArr.length - 4) / i14;
                    this.numColumns = length;
                    this.matrix = (int[][]) Array.newInstance(int.class, i13, length);
                    for (int i16 = 0; i16 < this.numRows; i16++) {
                        for (int i17 = 0; i17 < this.numColumns; i17++) {
                            int i18 = 0;
                            while (i18 < i11) {
                                int[] iArr = this.matrix[i16];
                                iArr[i17] = iArr[i17] ^ ((bArr[i15] & 255) << i18);
                                i18 += 8;
                                i15++;
                            }
                            if (!this.field.isElementOfThisField(this.matrix[i16][i17])) {
                                throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
                            }
                        }
                    }
                    return;
                }
            }
            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
        }
        throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
    }

    private void addToRow(int[] iArr, int[] iArr2) {
        for (int length = iArr2.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.add(iArr[length], iArr2[length]);
        }
    }

    private int[] multRowWithElement(int[] iArr, int i11) {
        int[] iArr2 = new int[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.mult(iArr[length], i11);
        }
        return iArr2;
    }

    private void multRowWithElementThis(int[] iArr, int i11) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = this.field.mult(iArr[length], i11);
        }
    }

    private static void swapColumns(int[][] iArr, int i11, int i12) {
        int[] iArr2 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = iArr2;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i11;
        int i12 = this.numRows;
        if (i12 == this.numColumns) {
            int[][] iArr = (int[][]) Array.newInstance(int.class, i12, i12);
            for (int i13 = this.numRows - 1; i13 >= 0; i13--) {
                iArr[i13] = IntUtils.clone(this.matrix[i13]);
            }
            int i14 = this.numRows;
            int[][] iArr2 = (int[][]) Array.newInstance(int.class, i14, i14);
            for (int i15 = this.numRows - 1; i15 >= 0; i15--) {
                iArr2[i15][i15] = 1;
            }
            for (int i16 = 0; i16 < this.numRows; i16++) {
                if (iArr[i16][i16] == 0) {
                    int i17 = i16 + 1;
                    boolean z11 = false;
                    while (i17 < this.numRows) {
                        if (iArr[i17][i16] != 0) {
                            swapColumns(iArr, i16, i17);
                            swapColumns(iArr2, i16, i17);
                            i17 = this.numRows;
                            z11 = true;
                        }
                        i17++;
                    }
                    if (!z11) {
                        throw new ArithmeticException("Matrix is not invertible.");
                    }
                }
                int inverse = this.field.inverse(iArr[i16][i16]);
                multRowWithElementThis(iArr[i16], inverse);
                multRowWithElementThis(iArr2[i16], inverse);
                for (int i18 = 0; i18 < this.numRows; i18++) {
                    if (i18 != i16 && (i11 = iArr[i18][i16]) != 0) {
                        int[] multRowWithElement = multRowWithElement(iArr[i16], i11);
                        int[] multRowWithElement2 = multRowWithElement(iArr2[i16], i11);
                        addToRow(multRowWithElement, iArr[i18]);
                        addToRow(multRowWithElement2, iArr2[i18]);
                    }
                }
            }
            return new GF2mMatrix(this.field, iArr2);
        }
        throw new ArithmeticException("Matrix is not invertible.");
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mMatrix)) {
            GF2mMatrix gF2mMatrix = (GF2mMatrix) obj;
            if (this.field.equals(gF2mMatrix.field)) {
                int i11 = gF2mMatrix.numRows;
                int i12 = this.numColumns;
                if (i11 == i12 && gF2mMatrix.numColumns == i12) {
                    for (int i13 = 0; i13 < this.numRows; i13++) {
                        for (int i14 = 0; i14 < this.numColumns; i14++) {
                            if (this.matrix[i13][i14] != gF2mMatrix.matrix[i13][i14]) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i11 = 8;
        int i12 = 1;
        while (this.field.getDegree() > i11) {
            i12++;
            i11 += 8;
        }
        int i13 = this.numRows;
        int i14 = this.numColumns * i13 * i12;
        int i15 = 4;
        byte[] bArr = new byte[i14 + 4];
        bArr[0] = (byte) (i13 & 255);
        bArr[1] = (byte) ((i13 >>> 8) & 255);
        bArr[2] = (byte) ((i13 >>> 16) & 255);
        bArr[3] = (byte) ((i13 >>> 24) & 255);
        for (int i16 = 0; i16 < this.numRows; i16++) {
            for (int i17 = 0; i17 < this.numColumns; i17++) {
                int i18 = 0;
                while (i18 < i11) {
                    bArr[i15] = (byte) (this.matrix[i16][i17] >>> i18);
                    i18 += 8;
                    i15++;
                }
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = (((this.field.hashCode() * 31) + this.numRows) * 31) + this.numColumns;
        for (int i11 = 0; i11 < this.numRows; i11++) {
            for (int i12 = 0; i12 < this.numColumns; i12++) {
                hashCode = (hashCode * 31) + this.matrix[i11][i12];
            }
        }
        return hashCode;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i11 = 0; i11 < this.numRows; i11++) {
            for (int i12 = 0; i12 < this.numColumns; i12++) {
                if (this.matrix[i11][i12] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public String toString() {
        String str = this.numRows + " x " + this.numColumns + " Matrix over " + this.field.toString() + ": \n";
        for (int i11 = 0; i11 < this.numRows; i11++) {
            for (int i12 = 0; i12 < this.numColumns; i12++) {
                str = str + this.field.elementToStr(this.matrix[i11][i12]) + " : ";
            }
            str = str + "\n";
        }
        return str;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }

    public GF2mMatrix(GF2mMatrix gF2mMatrix) {
        int i11 = gF2mMatrix.numRows;
        this.numRows = i11;
        this.numColumns = gF2mMatrix.numColumns;
        this.field = gF2mMatrix.field;
        this.matrix = new int[i11];
        for (int i12 = 0; i12 < this.numRows; i12++) {
            this.matrix[i12] = IntUtils.clone(gF2mMatrix.matrix[i12]);
        }
    }

    protected GF2mMatrix(GF2mField gF2mField, int[][] iArr) {
        this.field = gF2mField;
        this.matrix = iArr;
        this.numRows = iArr.length;
        this.numColumns = iArr[0].length;
    }
}