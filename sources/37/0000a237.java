package org.spongycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;

/* loaded from: classes4.dex */
public abstract class ECFieldElement implements ECConstants {

    /* loaded from: classes4.dex */
    public static class Fp extends ECFieldElement {

        /* renamed from: q */
        BigInteger f43705q;

        /* renamed from: r */
        BigInteger f43706r;

        /* renamed from: x */
        BigInteger f43707x;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, calculateResidue(bigInteger), bigInteger2);
        }

        public static BigInteger calculateResidue(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return ECConstants.ONE.shiftLeft(bitLength).subtract(bigInteger);
        }

        private ECFieldElement checkSqrt(ECFieldElement eCFieldElement) {
            if (eCFieldElement.square().equals(this)) {
                return eCFieldElement;
            }
            return null;
        }

        private BigInteger[] lucasSequence(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = ECConstants.ONE;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = ECConstants.TWO;
            BigInteger bigInteger8 = bigInteger6;
            for (int i11 = bitLength - 1; i11 >= lowestSetBit + 1; i11--) {
                bigInteger4 = modMult(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i11)) {
                    bigInteger8 = modMult(bigInteger4, bigInteger2);
                    bigInteger6 = modMult(bigInteger6, bigInteger5);
                    bigInteger7 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = modReduce(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger modReduce = modReduce(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger modReduce2 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = modReduce(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = modReduce2;
                    bigInteger6 = modReduce;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger modMult = modMult(bigInteger4, bigInteger8);
            BigInteger modMult2 = modMult(modMult, bigInteger2);
            BigInteger modReduce3 = modReduce(bigInteger6.multiply(bigInteger7).subtract(modMult));
            BigInteger modReduce4 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(modMult)));
            BigInteger modMult3 = modMult(modMult, modMult2);
            for (int i12 = 1; i12 <= lowestSetBit; i12++) {
                modReduce3 = modMult(modReduce3, modReduce4);
                modReduce4 = modReduce(modReduce4.multiply(modReduce4).subtract(modMult3.shiftLeft(1)));
                modMult3 = modMult(modMult3, modMult3);
            }
            return new BigInteger[]{modReduce3, modReduce4};
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new Fp(this.f43705q, this.f43706r, modAdd(this.f43707x, eCFieldElement.toBigInteger()));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger add = this.f43707x.add(ECConstants.ONE);
            if (add.compareTo(this.f43705q) == 0) {
                add = ECConstants.ZERO;
            }
            return new Fp(this.f43705q, this.f43706r, add);
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new Fp(this.f43705q, this.f43706r, modMult(this.f43707x, modInverse(eCFieldElement.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Fp) {
                Fp fp2 = (Fp) obj;
                return this.f43705q.equals(fp2.f43705q) && this.f43707x.equals(fp2.f43707x);
            }
            return false;
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "Fp";
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f43705q.bitLength();
        }

        public BigInteger getQ() {
            return this.f43705q;
        }

        public int hashCode() {
            return this.f43705q.hashCode() ^ this.f43707x.hashCode();
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            return new Fp(this.f43705q, this.f43706r, modInverse(this.f43707x));
        }

        protected BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f43705q) >= 0 ? add.subtract(this.f43705q) : add;
        }

        protected BigInteger modDouble(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f43705q) >= 0 ? shiftLeft.subtract(this.f43705q) : shiftLeft;
        }

        protected BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f43705q.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        protected BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f43705q.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        protected BigInteger modInverse(BigInteger bigInteger) {
            int fieldSize = getFieldSize();
            int i11 = (fieldSize + 31) >> 5;
            int[] fromBigInteger = Nat.fromBigInteger(fieldSize, this.f43705q);
            int[] fromBigInteger2 = Nat.fromBigInteger(fieldSize, bigInteger);
            int[] create = Nat.create(i11);
            Mod.invert(fromBigInteger, fromBigInteger2, create);
            return Nat.toBigInteger(i11, create);
        }

        protected BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        protected BigInteger modReduce(BigInteger bigInteger) {
            if (this.f43706r != null) {
                boolean z11 = bigInteger.signum() < 0;
                if (z11) {
                    bigInteger = bigInteger.abs();
                }
                int bitLength = this.f43705q.bitLength();
                boolean equals = this.f43706r.equals(ECConstants.ONE);
                while (bigInteger.bitLength() > bitLength + 1) {
                    BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                    BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                    if (!equals) {
                        shiftRight = shiftRight.multiply(this.f43706r);
                    }
                    bigInteger = shiftRight.add(subtract);
                }
                while (bigInteger.compareTo(this.f43705q) >= 0) {
                    bigInteger = bigInteger.subtract(this.f43705q);
                }
                return (!z11 || bigInteger.signum() == 0) ? bigInteger : this.f43705q.subtract(bigInteger);
            }
            return bigInteger.mod(this.f43705q);
        }

        protected BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f43705q) : subtract;
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new Fp(this.f43705q, this.f43706r, modMult(this.f43707x, eCFieldElement.toBigInteger()));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f43707x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f43705q, this.f43706r, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f43707x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f43705q, this.f43706r, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            if (this.f43707x.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f43705q;
            return new Fp(bigInteger, this.f43706r, bigInteger.subtract(this.f43707x));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            if (isZero() || isOne()) {
                return this;
            }
            if (this.f43705q.testBit(0)) {
                if (this.f43705q.testBit(1)) {
                    BigInteger add = this.f43705q.shiftRight(2).add(ECConstants.ONE);
                    BigInteger bigInteger = this.f43705q;
                    return checkSqrt(new Fp(bigInteger, this.f43706r, this.f43707x.modPow(add, bigInteger)));
                } else if (this.f43705q.testBit(2)) {
                    BigInteger modPow = this.f43707x.modPow(this.f43705q.shiftRight(3), this.f43705q);
                    BigInteger modMult = modMult(modPow, this.f43707x);
                    if (modMult(modMult, modPow).equals(ECConstants.ONE)) {
                        return checkSqrt(new Fp(this.f43705q, this.f43706r, modMult));
                    }
                    return checkSqrt(new Fp(this.f43705q, this.f43706r, modMult(modMult, ECConstants.TWO.modPow(this.f43705q.shiftRight(2), this.f43705q))));
                } else {
                    BigInteger shiftRight = this.f43705q.shiftRight(1);
                    BigInteger modPow2 = this.f43707x.modPow(shiftRight, this.f43705q);
                    BigInteger bigInteger2 = ECConstants.ONE;
                    if (!modPow2.equals(bigInteger2)) {
                        return null;
                    }
                    BigInteger bigInteger3 = this.f43707x;
                    BigInteger modDouble = modDouble(modDouble(bigInteger3));
                    BigInteger add2 = shiftRight.add(bigInteger2);
                    BigInteger subtract = this.f43705q.subtract(bigInteger2);
                    Random random = new Random();
                    while (true) {
                        BigInteger bigInteger4 = new BigInteger(this.f43705q.bitLength(), random);
                        if (bigInteger4.compareTo(this.f43705q) < 0 && modReduce(bigInteger4.multiply(bigInteger4).subtract(modDouble)).modPow(shiftRight, this.f43705q).equals(subtract)) {
                            BigInteger[] lucasSequence = lucasSequence(bigInteger4, bigInteger3, add2);
                            BigInteger bigInteger5 = lucasSequence[0];
                            BigInteger bigInteger6 = lucasSequence[1];
                            if (modMult(bigInteger6, bigInteger6).equals(modDouble)) {
                                return new Fp(this.f43705q, this.f43706r, modHalfAbs(bigInteger6));
                            }
                            if (!bigInteger5.equals(ECConstants.ONE) && !bigInteger5.equals(subtract)) {
                                return null;
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("not done yet");
            }
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f43705q;
            BigInteger bigInteger2 = this.f43706r;
            BigInteger bigInteger3 = this.f43707x;
            return new Fp(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f43707x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f43705q, this.f43706r, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f43707x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f43705q, this.f43706r, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new Fp(this.f43705q, this.f43706r, modSubtract(this.f43707x, eCFieldElement.toBigInteger()));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f43707x;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 != null && bigInteger3.signum() >= 0 && bigInteger3.compareTo(bigInteger) < 0) {
                this.f43705q = bigInteger;
                this.f43706r = bigInteger2;
                this.f43707x = bigInteger3;
                return;
            }
            throw new IllegalArgumentException("x value invalid in Fp field element");
        }
    }

    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public byte[] getEncoded() {
        return BigIntegers.asUnsignedByteArray((getFieldSize() + 7) / 8, toBigInteger());
    }

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public boolean isOne() {
        return bitLength() == 1;
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract ECFieldElement multiply(ECFieldElement eCFieldElement);

    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).subtract(eCFieldElement2.multiply(eCFieldElement3));
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).add(eCFieldElement2.multiply(eCFieldElement3));
    }

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().subtract(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().add(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePow(int i11) {
        ECFieldElement eCFieldElement = this;
        for (int i12 = 0; i12 < i11; i12++) {
            eCFieldElement = eCFieldElement.square();
        }
        return eCFieldElement;
    }

    public abstract ECFieldElement subtract(ECFieldElement eCFieldElement);

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }

    /* loaded from: classes4.dex */
    public static class F2m extends ECFieldElement {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;

        /* renamed from: ks */
        private int[] f43702ks;

        /* renamed from: m */
        private int f43703m;
        private int representation;

        /* renamed from: x */
        private LongArray f43704x;

        public F2m(int i11, int i12, int i13, int i14, BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= i11) {
                if (i13 == 0 && i14 == 0) {
                    this.representation = 2;
                    this.f43702ks = new int[]{i12};
                } else if (i13 >= i14) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                } else {
                    if (i13 > 0) {
                        this.representation = 3;
                        this.f43702ks = new int[]{i12, i13, i14};
                    } else {
                        throw new IllegalArgumentException("k2 must be larger than 0");
                    }
                }
                this.f43703m = i11;
                this.f43704x = new LongArray(bigInteger);
                return;
            }
            throw new IllegalArgumentException("x value invalid in F2m field element");
        }

        public static void checkFieldElements(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            if ((eCFieldElement instanceof F2m) && (eCFieldElement2 instanceof F2m)) {
                F2m f2m = (F2m) eCFieldElement;
                F2m f2m2 = (F2m) eCFieldElement2;
                if (f2m.representation == f2m2.representation) {
                    if (f2m.f43703m != f2m2.f43703m || !Arrays.areEqual(f2m.f43702ks, f2m2.f43702ks)) {
                        throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
                    }
                    return;
                }
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            LongArray longArray = (LongArray) this.f43704x.clone();
            longArray.addShiftedByWords(((F2m) eCFieldElement).f43704x, 0);
            return new F2m(this.f43703m, this.f43702ks, longArray);
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            return new F2m(this.f43703m, this.f43702ks, this.f43704x.addOne());
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public int bitLength() {
            return this.f43704x.degree();
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return multiply(eCFieldElement.invert());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof F2m) {
                F2m f2m = (F2m) obj;
                return this.f43703m == f2m.f43703m && this.representation == f2m.representation && Arrays.areEqual(this.f43702ks, f2m.f43702ks) && this.f43704x.equals(f2m.f43704x);
            }
            return false;
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "F2m";
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f43703m;
        }

        public int getK1() {
            return this.f43702ks[0];
        }

        public int getK2() {
            int[] iArr = this.f43702ks;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.f43702ks;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f43703m;
        }

        public int getRepresentation() {
            return this.representation;
        }

        public int hashCode() {
            return (this.f43704x.hashCode() ^ this.f43703m) ^ Arrays.hashCode(this.f43702ks);
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            int i11 = this.f43703m;
            int[] iArr = this.f43702ks;
            return new F2m(i11, iArr, this.f43704x.modInverse(i11, iArr));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public boolean isOne() {
            return this.f43704x.isOne();
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public boolean isZero() {
            return this.f43704x.isZero();
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i11 = this.f43703m;
            int[] iArr = this.f43702ks;
            return new F2m(i11, iArr, this.f43704x.modMultiply(((F2m) eCFieldElement).f43704x, i11, iArr));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            LongArray longArray = this.f43704x;
            LongArray longArray2 = ((F2m) eCFieldElement).f43704x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f43704x;
            LongArray longArray4 = ((F2m) eCFieldElement3).f43704x;
            LongArray multiply = longArray.multiply(longArray2, this.f43703m, this.f43702ks);
            LongArray multiply2 = longArray3.multiply(longArray4, this.f43703m, this.f43702ks);
            if (multiply == longArray || multiply == longArray2) {
                multiply = (LongArray) multiply.clone();
            }
            multiply.addShiftedByWords(multiply2, 0);
            multiply.reduce(this.f43703m, this.f43702ks);
            return new F2m(this.f43703m, this.f43702ks, multiply);
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            return (this.f43704x.isZero() || this.f43704x.isOne()) ? this : squarePow(this.f43703m - 1);
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            int i11 = this.f43703m;
            int[] iArr = this.f43702ks;
            return new F2m(i11, iArr, this.f43704x.modSquare(i11, iArr));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            LongArray longArray = this.f43704x;
            LongArray longArray2 = ((F2m) eCFieldElement).f43704x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f43704x;
            LongArray square = longArray.square(this.f43703m, this.f43702ks);
            LongArray multiply = longArray2.multiply(longArray3, this.f43703m, this.f43702ks);
            if (square == longArray) {
                square = (LongArray) square.clone();
            }
            square.addShiftedByWords(multiply, 0);
            square.reduce(this.f43703m, this.f43702ks);
            return new F2m(this.f43703m, this.f43702ks, square);
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement squarePow(int i11) {
            if (i11 < 1) {
                return this;
            }
            int i12 = this.f43703m;
            int[] iArr = this.f43702ks;
            return new F2m(i12, iArr, this.f43704x.modSquareN(i11, i12, iArr));
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public boolean testBitZero() {
            return this.f43704x.testBitZero();
        }

        @Override // org.spongycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f43704x.toBigInteger();
        }

        public F2m(int i11, int i12, BigInteger bigInteger) {
            this(i11, i12, 0, 0, bigInteger);
        }

        private F2m(int i11, int[] iArr, LongArray longArray) {
            this.f43703m = i11;
            this.representation = iArr.length == 1 ? 2 : 3;
            this.f43702ks = iArr;
            this.f43704x = longArray;
        }
    }
}