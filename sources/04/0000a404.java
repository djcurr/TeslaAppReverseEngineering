package org.spongycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;

/* loaded from: classes4.dex */
public class ComputeInField {
    private short[][] A;

    /* renamed from: x  reason: collision with root package name */
    short[] f43857x;

    private void computeZerosAbove() {
        for (int length = this.A.length - 1; length > 0; length--) {
            for (int i11 = length - 1; i11 >= 0; i11--) {
                short[][] sArr = this.A;
                short s11 = sArr[i11][length];
                short invElem = GF2Field.invElem(sArr[length][length]);
                if (invElem == 0) {
                    throw new RuntimeException("The matrix is not invertible");
                }
                int i12 = length;
                while (true) {
                    short[][] sArr2 = this.A;
                    if (i12 < sArr2.length * 2) {
                        short multElem = GF2Field.multElem(s11, GF2Field.multElem(sArr2[length][i12], invElem));
                        short[][] sArr3 = this.A;
                        sArr3[i11][i12] = GF2Field.addElem(sArr3[i11][i12], multElem);
                        i12++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void computeZerosUnder(boolean r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L8
            short[][] r10 = r9.A
            int r10 = r10.length
            int r10 = r10 * 2
            goto Ld
        L8:
            short[][] r10 = r9.A
            int r10 = r10.length
            int r10 = r10 + 1
        Ld:
            r0 = 0
        Le:
            short[][] r1 = r9.A
            int r1 = r1.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L5a
            int r1 = r0 + 1
            r2 = r1
        L18:
            short[][] r3 = r9.A
            int r4 = r3.length
            if (r2 >= r4) goto L58
            r4 = r3[r2]
            short r4 = r4[r0]
            r3 = r3[r0]
            short r3 = r3[r0]
            short r3 = org.spongycastle.pqc.crypto.rainbow.util.GF2Field.invElem(r3)
            if (r3 == 0) goto L50
            r5 = r0
        L2c:
            if (r5 >= r10) goto L4d
            short[][] r6 = r9.A
            r6 = r6[r0]
            short r6 = r6[r5]
            short r6 = org.spongycastle.pqc.crypto.rainbow.util.GF2Field.multElem(r6, r3)
            short r6 = org.spongycastle.pqc.crypto.rainbow.util.GF2Field.multElem(r4, r6)
            short[][] r7 = r9.A
            r8 = r7[r2]
            r7 = r7[r2]
            short r7 = r7[r5]
            short r6 = org.spongycastle.pqc.crypto.rainbow.util.GF2Field.addElem(r7, r6)
            r8[r5] = r6
            int r5 = r5 + 1
            goto L2c
        L4d:
            int r2 = r2 + 1
            goto L18
        L50:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "Matrix not invertible! We have to choose another one!"
            r10.<init>(r0)
            throw r10
        L58:
            r0 = r1
            goto Le
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.pqc.crypto.rainbow.util.ComputeInField.computeZerosUnder(boolean):void");
    }

    private void substitute() {
        short[][] sArr;
        short invElem = GF2Field.invElem(this.A[sArr.length - 1][sArr.length - 1]);
        if (invElem != 0) {
            short[] sArr2 = this.f43857x;
            short[][] sArr3 = this.A;
            sArr2[sArr3.length - 1] = GF2Field.multElem(sArr3[sArr3.length - 1][sArr3.length], invElem);
            for (int length = this.A.length - 2; length >= 0; length--) {
                short[][] sArr4 = this.A;
                short s11 = sArr4[length][sArr4.length];
                for (int length2 = sArr4.length - 1; length2 > length; length2--) {
                    s11 = GF2Field.addElem(s11, GF2Field.multElem(this.A[length][length2], this.f43857x[length2]));
                }
                short invElem2 = GF2Field.invElem(this.A[length][length]);
                if (invElem2 != 0) {
                    this.f43857x[length] = GF2Field.multElem(s11, invElem2);
                } else {
                    throw new RuntimeException("Not solvable equation system");
                }
            }
            return;
        }
        throw new RuntimeException("The equation system is not solvable");
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length == sArr2.length && sArr[0].length == sArr2[0].length) {
            short[][] sArr3 = (short[][]) Array.newInstance(short.class, sArr.length, sArr.length);
            for (int i11 = 0; i11 < sArr.length; i11++) {
                for (int i12 = 0; i12 < sArr2.length; i12++) {
                    sArr3[i11][i12] = GF2Field.addElem(sArr[i11][i12], sArr2[i11][i12]);
                }
            }
            return sArr3;
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length == sArr2.length) {
            int length = sArr.length;
            short[] sArr3 = new short[length];
            for (int i11 = 0; i11 < length; i11++) {
                sArr3[i11] = GF2Field.addElem(sArr[i11], sArr2[i11]);
            }
            return sArr3;
        }
        throw new RuntimeException("Multiplication is not possible!");
    }

    public short[][] inverse(short[][] sArr) {
        try {
            int i11 = 0;
            this.A = (short[][]) Array.newInstance(short.class, sArr.length, sArr.length * 2);
            if (sArr.length == sArr[0].length) {
                for (int i12 = 0; i12 < sArr.length; i12++) {
                    for (int i13 = 0; i13 < sArr.length; i13++) {
                        this.A[i12][i13] = sArr[i12][i13];
                    }
                    for (int length = sArr.length; length < sArr.length * 2; length++) {
                        this.A[i12][length] = 0;
                    }
                    short[][] sArr2 = this.A;
                    sArr2[i12][sArr2.length + i12] = 1;
                }
                computeZerosUnder(true);
                int i14 = 0;
                while (true) {
                    short[][] sArr3 = this.A;
                    if (i14 >= sArr3.length) {
                        break;
                    }
                    short invElem = GF2Field.invElem(sArr3[i14][i14]);
                    int i15 = i14;
                    while (true) {
                        short[][] sArr4 = this.A;
                        if (i15 < sArr4.length * 2) {
                            sArr4[i14][i15] = GF2Field.multElem(sArr4[i14][i15], invElem);
                            i15++;
                        }
                    }
                    i14++;
                }
                computeZerosAbove();
                short[][] sArr5 = this.A;
                short[][] sArr6 = (short[][]) Array.newInstance(short.class, sArr5.length, sArr5.length);
                while (true) {
                    short[][] sArr7 = this.A;
                    if (i11 >= sArr7.length) {
                        return sArr6;
                    }
                    int length2 = sArr7.length;
                    while (true) {
                        short[][] sArr8 = this.A;
                        if (length2 < sArr8.length * 2) {
                            sArr6[i11][length2 - sArr8.length] = sArr8[i11][length2];
                            length2++;
                        }
                    }
                    i11++;
                }
            } else {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s11, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance(short.class, sArr.length, sArr[0].length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr[0].length; i12++) {
                sArr2[i11][i12] = GF2Field.multElem(s11, sArr[i11][i12]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s11, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i11 = 0; i11 < length; i11++) {
            sArr2[i11] = GF2Field.multElem(s11, sArr[i11]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length == sArr2.length) {
            short[][] sArr3 = (short[][]) Array.newInstance(short.class, sArr.length, sArr2.length);
            for (int i11 = 0; i11 < sArr.length; i11++) {
                for (int i12 = 0; i12 < sArr2.length; i12++) {
                    sArr3[i11][i12] = GF2Field.multElem(sArr[i11], sArr2[i12]);
                }
            }
            return sArr3;
        }
        throw new RuntimeException("Multiplication is not possible!");
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length == sArr2.length) {
            this.A = (short[][]) Array.newInstance(short.class, sArr.length, sArr2[0].length);
            for (int i11 = 0; i11 < sArr.length; i11++) {
                for (int i12 = 0; i12 < sArr2.length; i12++) {
                    for (int i13 = 0; i13 < sArr2[0].length; i13++) {
                        short multElem = GF2Field.multElem(sArr[i11][i12], sArr2[i12][i13]);
                        short[][] sArr3 = this.A;
                        sArr3[i11][i13] = GF2Field.addElem(sArr3[i11][i13], multElem);
                    }
                }
            }
            return this.A;
        }
        throw new RuntimeException("Multiplication is not possible!");
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        try {
            if (sArr.length == sArr2.length) {
                this.A = (short[][]) Array.newInstance(short.class, sArr.length, sArr.length + 1);
                this.f43857x = new short[sArr.length];
                for (int i11 = 0; i11 < sArr.length; i11++) {
                    for (int i12 = 0; i12 < sArr[0].length; i12++) {
                        this.A[i11][i12] = sArr[i11][i12];
                    }
                }
                for (int i13 = 0; i13 < sArr2.length; i13++) {
                    short[][] sArr3 = this.A;
                    sArr3[i13][sArr2.length] = GF2Field.addElem(sArr2[i13], sArr3[i13][sArr2.length]);
                }
                computeZerosUnder(false);
                substitute();
                return this.f43857x;
            }
            throw new RuntimeException("The equation system is not solvable");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) {
        if (sArr[0].length == sArr2.length) {
            short[] sArr3 = new short[sArr.length];
            for (int i11 = 0; i11 < sArr.length; i11++) {
                for (int i12 = 0; i12 < sArr2.length; i12++) {
                    sArr3[i11] = GF2Field.addElem(sArr3[i11], GF2Field.multElem(sArr[i11][i12], sArr2[i12]));
                }
            }
            return sArr3;
        }
        throw new RuntimeException("Multiplication is not possible!");
    }
}