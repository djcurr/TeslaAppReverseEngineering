package org.spongycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Random;

/* loaded from: classes4.dex */
public class GF2nONBField extends GF2nField {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    int[][] mMult;
    private int mType;

    public GF2nONBField(int i11, SecureRandom secureRandom) {
        super(secureRandom);
        if (i11 >= 3) {
            this.mDegree = i11;
            int i12 = i11 / 64;
            this.mLength = i12;
            int i13 = i11 & 63;
            this.mBit = i13;
            if (i13 == 0) {
                this.mBit = 64;
            } else {
                this.mLength = i12 + 1;
            }
            computeType();
            if (this.mType < 3) {
                this.mMult = (int[][]) Array.newInstance(int.class, this.mDegree, 2);
                for (int i14 = 0; i14 < this.mDegree; i14++) {
                    int[][] iArr = this.mMult;
                    iArr[i14][0] = -1;
                    iArr[i14][1] = -1;
                }
                computeMultMatrix();
                computeFieldPolynomial();
                this.fields = new java.util.Vector();
                this.matrices = new java.util.Vector();
                return;
            }
            throw new RuntimeException("\nThe type of this field is " + this.mType);
        }
        throw new IllegalArgumentException("k must be at least 3");
    }

    private void computeMultMatrix() {
        int i11;
        int i12;
        int i13 = this.mType;
        if ((i13 & 7) != 0) {
            int i14 = (this.mDegree * i13) + 1;
            int[] iArr = new int[i14];
            if (i13 == 1) {
                i11 = 1;
            } else {
                i11 = i13 == 2 ? i14 - 1 : elementOfOrder(i13, i14);
            }
            int i15 = 1;
            int i16 = 0;
            while (true) {
                i12 = this.mType;
                if (i16 >= i12) {
                    break;
                }
                int i17 = i15;
                for (int i18 = 0; i18 < this.mDegree; i18++) {
                    iArr[i17] = i18;
                    i17 = (i17 << 1) % i14;
                    if (i17 < 0) {
                        i17 += i14;
                    }
                }
                i15 = (i15 * i11) % i14;
                if (i15 < 0) {
                    i15 += i14;
                }
                i16++;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new RuntimeException("only type 1 or type 2 implemented");
                }
                int i19 = 1;
                while (i19 < i14 - 1) {
                    int[][] iArr2 = this.mMult;
                    int i21 = i19 + 1;
                    if (iArr2[iArr[i21]][0] == -1) {
                        iArr2[iArr[i21]][0] = iArr[i14 - i19];
                    } else {
                        iArr2[iArr[i21]][1] = iArr[i14 - i19];
                    }
                    i19 = i21;
                }
                return;
            }
            int i22 = 1;
            while (i22 < i14 - 1) {
                int[][] iArr3 = this.mMult;
                int i23 = i22 + 1;
                if (iArr3[iArr[i23]][0] == -1) {
                    iArr3[iArr[i23]][0] = iArr[i14 - i22];
                } else {
                    iArr3[iArr[i23]][1] = iArr[i14 - i22];
                }
                i22 = i23;
            }
            int i24 = this.mDegree >> 1;
            for (int i25 = 1; i25 <= i24; i25++) {
                int[][] iArr4 = this.mMult;
                int i26 = i25 - 1;
                if (iArr4[i26][0] == -1) {
                    iArr4[i26][0] = (i24 + i25) - 1;
                } else {
                    iArr4[i26][1] = (i24 + i25) - 1;
                }
                int i27 = (i24 + i25) - 1;
                if (iArr4[i27][0] == -1) {
                    iArr4[i27][0] = i26;
                } else {
                    iArr4[i27][1] = i26;
                }
            }
            return;
        }
        throw new RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
    }

    private void computeType() {
        if ((this.mDegree & 7) != 0) {
            this.mType = 1;
            int i11 = 0;
            while (i11 != 1) {
                int i12 = (this.mType * this.mDegree) + 1;
                if (IntegerFunctions.isPrime(i12)) {
                    int order = IntegerFunctions.order(2, i12);
                    int i13 = this.mType;
                    int i14 = this.mDegree;
                    i11 = IntegerFunctions.gcd((i13 * i14) / order, i14);
                }
                this.mType++;
            }
            int i15 = this.mType - 1;
            this.mType = i15;
            if (i15 == 1) {
                int i16 = (this.mDegree << 1) + 1;
                if (IntegerFunctions.isPrime(i16)) {
                    int order2 = IntegerFunctions.order(2, i16);
                    int i17 = this.mDegree;
                    if (IntegerFunctions.gcd((i17 << 1) / order2, i17) == 1) {
                        this.mType++;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("The extension degree is divisible by 8!");
    }

    private int elementOfOrder(int i11, int i12) {
        Random random = new Random();
        int i13 = 0;
        while (i13 == 0) {
            int i14 = i12 - 1;
            i13 = random.nextInt() % i14;
            if (i13 < 0) {
                i13 += i14;
            }
        }
        int order = IntegerFunctions.order(i13, i12);
        while (true) {
            if (order % i11 == 0 && order != 0) {
                break;
            }
            while (i13 == 0) {
                int i15 = i12 - 1;
                i13 = random.nextInt() % i15;
                if (i13 < 0) {
                    i13 += i15;
                }
            }
            order = IntegerFunctions.order(i13, i12);
        }
        int i16 = i13;
        for (int i17 = 2; i17 <= i11 / order; i17++) {
            i16 *= i13;
        }
        return i16;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        int i11 = this.mDegree;
        if (i11 == gF2nField.mDegree) {
            GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i11];
            for (int i12 = 0; i12 < this.mDegree; i12++) {
                gF2PolynomialArr[i12] = new GF2Polynomial(this.mDegree);
            }
            do {
                randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
            } while (randomRoot.isZero());
            GF2nElement[] gF2nElementArr = new GF2nPolynomialElement[this.mDegree];
            gF2nElementArr[0] = (GF2nElement) randomRoot.clone();
            for (int i13 = 1; i13 < this.mDegree; i13++) {
                gF2nElementArr[i13] = gF2nElementArr[i13 - 1].square();
            }
            for (int i14 = 0; i14 < this.mDegree; i14++) {
                for (int i15 = 0; i15 < this.mDegree; i15++) {
                    if (gF2nElementArr[i14].testBit(i15)) {
                        int i16 = this.mDegree;
                        gF2PolynomialArr[(i16 - i15) - 1].setBit((i16 - i14) - 1);
                    }
                }
            }
            this.fields.addElement(gF2nField);
            this.matrices.addElement(gF2PolynomialArr);
            gF2nField.fields.addElement(this);
            gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
            return;
        }
        throw new IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected void computeFieldPolynomial() {
        int i11 = this.mType;
        if (i11 == 1) {
            this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1, "ALL");
        } else if (i11 == 2) {
            GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1, "ONE");
            GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 1, "X");
            gF2Polynomial2.addToThis(gF2Polynomial);
            GF2Polynomial gF2Polynomial3 = gF2Polynomial;
            GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            int i12 = 1;
            while (i12 < this.mDegree) {
                GF2Polynomial shiftLeft = gF2Polynomial4.shiftLeft();
                shiftLeft.addToThis(gF2Polynomial3);
                i12++;
                gF2Polynomial3 = gF2Polynomial4;
                gF2Polynomial4 = shiftLeft;
            }
            this.fieldPolynomial = gF2Polynomial4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getONBBit() {
        return this.mBit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getONBLength() {
        return this.mLength;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        int degree3 = gF2nPolynomial.getDegree();
        while (degree3 > 1) {
            while (true) {
                GF2nONBElement gF2nONBElement = new GF2nONBElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nONBElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nONBElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i11 = 1; i11 <= this.mDegree - 1; i11++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            if ((degree << 1) > degree2) {
                gF2nPolynomial = gF2nPolynomial.quotient(gcd);
            } else {
                gF2nPolynomial = new GF2nPolynomial(gcd);
            }
            degree3 = gF2nPolynomial.getDegree();
        }
        return gF2nPolynomial.at(0);
    }

    int[][] invMatrix(int[][] iArr) {
        int i11 = this.mDegree;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, i11, i11);
        int i12 = this.mDegree;
        int[][] iArr3 = (int[][]) Array.newInstance(int.class, i12, i12);
        for (int i13 = 0; i13 < this.mDegree; i13++) {
            iArr3[i13][i13] = 1;
        }
        for (int i14 = 0; i14 < this.mDegree; i14++) {
            int i15 = i14;
            while (true) {
                int i16 = this.mDegree;
                if (i15 < i16) {
                    iArr[(i16 - 1) - i14][i15] = iArr[i14][i14];
                    i15++;
                }
            }
        }
        return null;
    }
}