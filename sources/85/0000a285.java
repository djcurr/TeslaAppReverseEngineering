package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat384;

/* loaded from: classes4.dex */
public class SecP384R1Point extends ECPoint.AbstractFp {
    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f43708x;
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f43709y;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) eCPoint.getXCoord();
        SecP384R1FieldElement secP384R1FieldElement4 = (SecP384R1FieldElement) eCPoint.getYCoord();
        SecP384R1FieldElement secP384R1FieldElement5 = (SecP384R1FieldElement) this.f43710zs[0];
        SecP384R1FieldElement secP384R1FieldElement6 = (SecP384R1FieldElement) eCPoint.getZCoord(0);
        int[] create = Nat.create(24);
        int[] create2 = Nat.create(24);
        int[] create3 = Nat.create(12);
        int[] create4 = Nat.create(12);
        boolean isOne = secP384R1FieldElement5.isOne();
        if (isOne) {
            iArr = secP384R1FieldElement3.f43735x;
            iArr2 = secP384R1FieldElement4.f43735x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement5.f43735x, create3);
            SecP384R1Field.multiply(create3, secP384R1FieldElement3.f43735x, create2);
            SecP384R1Field.multiply(create3, secP384R1FieldElement5.f43735x, create3);
            SecP384R1Field.multiply(create3, secP384R1FieldElement4.f43735x, create3);
            iArr = create2;
            iArr2 = create3;
        }
        boolean isOne2 = secP384R1FieldElement6.isOne();
        if (isOne2) {
            iArr3 = secP384R1FieldElement.f43735x;
            iArr4 = secP384R1FieldElement2.f43735x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement6.f43735x, create4);
            SecP384R1Field.multiply(create4, secP384R1FieldElement.f43735x, create);
            SecP384R1Field.multiply(create4, secP384R1FieldElement6.f43735x, create4);
            SecP384R1Field.multiply(create4, secP384R1FieldElement2.f43735x, create4);
            iArr3 = create;
            iArr4 = create4;
        }
        int[] create5 = Nat.create(12);
        SecP384R1Field.subtract(iArr3, iArr, create5);
        int[] create6 = Nat.create(12);
        SecP384R1Field.subtract(iArr4, iArr2, create6);
        if (Nat.isZero(12, create5)) {
            if (Nat.isZero(12, create6)) {
                return twice();
            }
            return curve.getInfinity();
        }
        SecP384R1Field.square(create5, create3);
        int[] create7 = Nat.create(12);
        SecP384R1Field.multiply(create3, create5, create7);
        SecP384R1Field.multiply(create3, iArr3, create3);
        SecP384R1Field.negate(create7, create7);
        Nat384.mul(iArr4, create7, create);
        SecP384R1Field.reduce32(Nat.addBothTo(12, create3, create3, create7), create7);
        SecP384R1FieldElement secP384R1FieldElement7 = new SecP384R1FieldElement(create4);
        SecP384R1Field.square(create6, secP384R1FieldElement7.f43735x);
        int[] iArr5 = secP384R1FieldElement7.f43735x;
        SecP384R1Field.subtract(iArr5, create7, iArr5);
        SecP384R1FieldElement secP384R1FieldElement8 = new SecP384R1FieldElement(create7);
        SecP384R1Field.subtract(create3, secP384R1FieldElement7.f43735x, secP384R1FieldElement8.f43735x);
        Nat384.mul(secP384R1FieldElement8.f43735x, create6, create2);
        SecP384R1Field.addExt(create, create2, create);
        SecP384R1Field.reduce(create, secP384R1FieldElement8.f43735x);
        SecP384R1FieldElement secP384R1FieldElement9 = new SecP384R1FieldElement(create5);
        if (!isOne) {
            int[] iArr6 = secP384R1FieldElement9.f43735x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement5.f43735x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = secP384R1FieldElement9.f43735x;
            SecP384R1Field.multiply(iArr7, secP384R1FieldElement6.f43735x, iArr7);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement7, secP384R1FieldElement8, new ECFieldElement[]{secP384R1FieldElement9}, this.withCompression);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    protected ECPoint detach() {
        return new SecP384R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP384R1Point(this.curve, this.f43708x, this.f43709y.negate(), this.f43710zs, this.withCompression);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f43709y.isZero()) ? this : twice().add(this);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f43709y;
        if (secP384R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f43708x;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) this.f43710zs[0];
        int[] create = Nat.create(12);
        int[] create2 = Nat.create(12);
        int[] create3 = Nat.create(12);
        SecP384R1Field.square(secP384R1FieldElement.f43735x, create3);
        int[] create4 = Nat.create(12);
        SecP384R1Field.square(create3, create4);
        boolean isOne = secP384R1FieldElement3.isOne();
        int[] iArr = secP384R1FieldElement3.f43735x;
        if (!isOne) {
            SecP384R1Field.square(iArr, create2);
            iArr = create2;
        }
        SecP384R1Field.subtract(secP384R1FieldElement2.f43735x, iArr, create);
        SecP384R1Field.add(secP384R1FieldElement2.f43735x, iArr, create2);
        SecP384R1Field.multiply(create2, create, create2);
        SecP384R1Field.reduce32(Nat.addBothTo(12, create2, create2, create2), create2);
        SecP384R1Field.multiply(create3, secP384R1FieldElement2.f43735x, create3);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, create3, 2, 0), create3);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, create4, 3, 0, create), create);
        SecP384R1FieldElement secP384R1FieldElement4 = new SecP384R1FieldElement(create4);
        SecP384R1Field.square(create2, secP384R1FieldElement4.f43735x);
        int[] iArr2 = secP384R1FieldElement4.f43735x;
        SecP384R1Field.subtract(iArr2, create3, iArr2);
        int[] iArr3 = secP384R1FieldElement4.f43735x;
        SecP384R1Field.subtract(iArr3, create3, iArr3);
        SecP384R1FieldElement secP384R1FieldElement5 = new SecP384R1FieldElement(create3);
        SecP384R1Field.subtract(create3, secP384R1FieldElement4.f43735x, secP384R1FieldElement5.f43735x);
        int[] iArr4 = secP384R1FieldElement5.f43735x;
        SecP384R1Field.multiply(iArr4, create2, iArr4);
        int[] iArr5 = secP384R1FieldElement5.f43735x;
        SecP384R1Field.subtract(iArr5, create, iArr5);
        SecP384R1FieldElement secP384R1FieldElement6 = new SecP384R1FieldElement(create2);
        SecP384R1Field.twice(secP384R1FieldElement.f43735x, secP384R1FieldElement6.f43735x);
        if (!isOne) {
            int[] iArr6 = secP384R1FieldElement6.f43735x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement3.f43735x, iArr6);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement4, secP384R1FieldElement5, new ECFieldElement[]{secP384R1FieldElement6}, this.withCompression);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        if (this == eCPoint) {
            return threeTimes();
        }
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        return this.f43709y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z11) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) == (eCFieldElement2 == null)) {
            this.withCompression = z11;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z11) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z11;
    }
}