package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes4.dex */
public abstract class GF2nField {
    protected GF2Polynomial fieldPolynomial;
    protected java.util.Vector fields;
    protected int mDegree;
    protected java.util.Vector matrices;
    protected final SecureRandom random;

    /* JADX INFO: Access modifiers changed from: protected */
    public GF2nField(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void computeCOBMatrix(GF2nField gF2nField);

    protected abstract void computeFieldPolynomial();

    public final GF2nElement convert(GF2nElement gF2nElement, GF2nField gF2nField) {
        if (gF2nField == this) {
            return (GF2nElement) gF2nElement.clone();
        }
        if (this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            return (GF2nElement) gF2nElement.clone();
        }
        if (this.mDegree == gF2nField.mDegree) {
            int indexOf = this.fields.indexOf(gF2nField);
            if (indexOf == -1) {
                computeCOBMatrix(gF2nField);
                indexOf = this.fields.indexOf(gF2nField);
            }
            GF2Polynomial[] gF2PolynomialArr = (GF2Polynomial[]) this.matrices.elementAt(indexOf);
            GF2nElement gF2nElement2 = (GF2nElement) gF2nElement.clone();
            if (gF2nElement2 instanceof GF2nONBElement) {
                ((GF2nONBElement) gF2nElement2).reverseOrder();
            }
            GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, gF2nElement2.toFlexiBigInt());
            gF2Polynomial.expandN(this.mDegree);
            GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree);
            for (int i11 = 0; i11 < this.mDegree; i11++) {
                if (gF2Polynomial.vectorMult(gF2PolynomialArr[i11])) {
                    gF2Polynomial2.setBit((this.mDegree - 1) - i11);
                }
            }
            if (gF2nField instanceof GF2nPolynomialField) {
                return new GF2nPolynomialElement((GF2nPolynomialField) gF2nField, gF2Polynomial2);
            }
            if (gF2nField instanceof GF2nONBField) {
                GF2nONBElement gF2nONBElement = new GF2nONBElement((GF2nONBField) gF2nField, gF2Polynomial2.toFlexiBigInt());
                gF2nONBElement.reverseOrder();
                return gF2nONBElement;
            }
            throw new RuntimeException("GF2nField.convert: B1 must be an instance of GF2nPolynomialField or GF2nONBField!");
        }
        throw new RuntimeException("GF2nField.convert: B1 has a different degree and thus cannot be coverted to!");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nField)) {
            return false;
        }
        GF2nField gF2nField = (GF2nField) obj;
        if (gF2nField.mDegree == this.mDegree && this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            if (!(this instanceof GF2nPolynomialField) || (gF2nField instanceof GF2nPolynomialField)) {
                return !(this instanceof GF2nONBField) || (gF2nField instanceof GF2nONBField);
            }
            return false;
        }
        return false;
    }

    public final int getDegree() {
        return this.mDegree;
    }

    public final GF2Polynomial getFieldPolynomial() {
        if (this.fieldPolynomial == null) {
            computeFieldPolynomial();
        }
        return new GF2Polynomial(this.fieldPolynomial);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial);

    public int hashCode() {
        return this.mDegree + this.fieldPolynomial.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final GF2Polynomial[] invertMatrix(GF2Polynomial[] gF2PolynomialArr) {
        GF2Polynomial[] gF2PolynomialArr2 = new GF2Polynomial[gF2PolynomialArr.length];
        GF2Polynomial[] gF2PolynomialArr3 = new GF2Polynomial[gF2PolynomialArr.length];
        int i11 = 0;
        for (int i12 = 0; i12 < this.mDegree; i12++) {
            try {
                gF2PolynomialArr2[i12] = new GF2Polynomial(gF2PolynomialArr[i12]);
                gF2PolynomialArr3[i12] = new GF2Polynomial(this.mDegree);
                gF2PolynomialArr3[i12].setBit((this.mDegree - 1) - i12);
            } catch (RuntimeException e11) {
                e11.printStackTrace();
            }
        }
        while (true) {
            int i13 = this.mDegree;
            if (i11 >= i13 - 1) {
                for (int i14 = i13 - 1; i14 > 0; i14--) {
                    for (int i15 = i14 - 1; i15 >= 0; i15--) {
                        if (gF2PolynomialArr2[i15].testBit((this.mDegree - 1) - i14)) {
                            gF2PolynomialArr2[i15].addToThis(gF2PolynomialArr2[i14]);
                            gF2PolynomialArr3[i15].addToThis(gF2PolynomialArr3[i14]);
                        }
                    }
                }
                return gF2PolynomialArr3;
            }
            int i16 = i11;
            while (true) {
                int i17 = this.mDegree;
                if (i16 >= i17 || gF2PolynomialArr2[i16].testBit((i17 - 1) - i11)) {
                    break;
                }
                i16++;
            }
            if (i16 >= this.mDegree) {
                throw new RuntimeException("GF2nField.invertMatrix: Matrix cannot be inverted!");
            }
            if (i11 != i16) {
                GF2Polynomial gF2Polynomial = gF2PolynomialArr2[i11];
                gF2PolynomialArr2[i11] = gF2PolynomialArr2[i16];
                gF2PolynomialArr2[i16] = gF2Polynomial;
                GF2Polynomial gF2Polynomial2 = gF2PolynomialArr3[i11];
                gF2PolynomialArr3[i11] = gF2PolynomialArr3[i16];
                gF2PolynomialArr3[i16] = gF2Polynomial2;
            }
            int i18 = i11 + 1;
            int i19 = i18;
            while (true) {
                int i21 = this.mDegree;
                if (i19 < i21) {
                    if (gF2PolynomialArr2[i19].testBit((i21 - 1) - i11)) {
                        gF2PolynomialArr2[i19].addToThis(gF2PolynomialArr2[i11]);
                        gF2PolynomialArr3[i19].addToThis(gF2PolynomialArr3[i11]);
                    }
                    i19++;
                }
            }
            i11 = i18;
        }
    }
}