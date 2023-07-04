package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat160;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class SecP160R2FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP160R2Curve.f43720q;

    /* renamed from: x  reason: collision with root package name */
    protected int[] f43721x;

    public SecP160R2FieldElement(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(Q) < 0) {
            this.f43721x = SecP160R2Field.fromBigInteger(bigInteger);
            return;
        }
        throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R2Field.add(this.f43721x, ((SecP160R2FieldElement) eCFieldElement).f43721x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat160.create();
        SecP160R2Field.addOne(this.f43721x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        Mod.invert(SecP160R2Field.P, ((SecP160R2FieldElement) eCFieldElement).f43721x, create);
        SecP160R2Field.multiply(create, this.f43721x, create);
        return new SecP160R2FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R2FieldElement) {
            return Nat160.eq(this.f43721x, ((SecP160R2FieldElement) obj).f43721x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP160R2Field";
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f43721x, 0, 5);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat160.create();
        Mod.invert(SecP160R2Field.P, this.f43721x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat160.isOne(this.f43721x);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat160.isZero(this.f43721x);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R2Field.multiply(this.f43721x, ((SecP160R2FieldElement) eCFieldElement).f43721x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat160.create();
        SecP160R2Field.negate(this.f43721x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f43721x;
        if (Nat160.isZero(iArr) || Nat160.isOne(iArr)) {
            return this;
        }
        int[] create = Nat160.create();
        SecP160R2Field.square(iArr, create);
        SecP160R2Field.multiply(create, iArr, create);
        int[] create2 = Nat160.create();
        SecP160R2Field.square(create, create2);
        SecP160R2Field.multiply(create2, iArr, create2);
        int[] create3 = Nat160.create();
        SecP160R2Field.square(create2, create3);
        SecP160R2Field.multiply(create3, iArr, create3);
        int[] create4 = Nat160.create();
        SecP160R2Field.squareN(create3, 3, create4);
        SecP160R2Field.multiply(create4, create2, create4);
        SecP160R2Field.squareN(create4, 7, create3);
        SecP160R2Field.multiply(create3, create4, create3);
        SecP160R2Field.squareN(create3, 3, create4);
        SecP160R2Field.multiply(create4, create2, create4);
        int[] create5 = Nat160.create();
        SecP160R2Field.squareN(create4, 14, create5);
        SecP160R2Field.multiply(create5, create3, create5);
        SecP160R2Field.squareN(create5, 31, create3);
        SecP160R2Field.multiply(create3, create5, create3);
        SecP160R2Field.squareN(create3, 62, create5);
        SecP160R2Field.multiply(create5, create3, create5);
        SecP160R2Field.squareN(create5, 3, create3);
        SecP160R2Field.multiply(create3, create2, create3);
        SecP160R2Field.squareN(create3, 18, create3);
        SecP160R2Field.multiply(create3, create4, create3);
        SecP160R2Field.squareN(create3, 2, create3);
        SecP160R2Field.multiply(create3, iArr, create3);
        SecP160R2Field.squareN(create3, 3, create3);
        SecP160R2Field.multiply(create3, create, create3);
        SecP160R2Field.squareN(create3, 6, create3);
        SecP160R2Field.multiply(create3, create2, create3);
        SecP160R2Field.squareN(create3, 2, create3);
        SecP160R2Field.multiply(create3, iArr, create3);
        SecP160R2Field.square(create3, create);
        if (Nat160.eq(iArr, create)) {
            return new SecP160R2FieldElement(create3);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat160.create();
        SecP160R2Field.square(this.f43721x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R2Field.subtract(this.f43721x, ((SecP160R2FieldElement) eCFieldElement).f43721x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat160.getBit(this.f43721x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.f43721x);
    }

    public SecP160R2FieldElement() {
        this.f43721x = Nat160.create();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SecP160R2FieldElement(int[] iArr) {
        this.f43721x = iArr;
    }
}