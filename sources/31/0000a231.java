package org.spongycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.ec.endo.ECEndomorphism;
import org.spongycastle.math.ec.endo.GLVEndomorphism;
import org.spongycastle.math.field.FiniteField;
import org.spongycastle.math.field.FiniteFields;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
public abstract class ECCurve {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;

    /* renamed from: a */
    protected ECFieldElement f43693a;

    /* renamed from: b */
    protected ECFieldElement f43694b;
    protected BigInteger cofactor;
    protected FiniteField field;
    protected BigInteger order;
    protected int coord = 0;
    protected ECEndomorphism endomorphism = null;
    protected ECMultiplier multiplier = null;

    /* loaded from: classes4.dex */
    public static abstract class AbstractF2m extends ECCurve {

        /* renamed from: si */
        private BigInteger[] f43695si;

        public AbstractF2m(int i11, int i12, int i13, int i14) {
            super(buildField(i11, i12, i13, i14));
            this.f43695si = null;
        }

        private static FiniteField buildField(int i11, int i12, int i13, int i14) {
            if (i12 != 0) {
                if (i13 == 0) {
                    if (i14 == 0) {
                        return FiniteFields.getBinaryExtensionField(new int[]{0, i12, i11});
                    }
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                } else if (i13 > i12) {
                    if (i14 > i13) {
                        return FiniteFields.getBinaryExtensionField(new int[]{0, i12, i13, i14, i11});
                    }
                    throw new IllegalArgumentException("k3 must be > k2");
                } else {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
            }
            throw new IllegalArgumentException("k1 must be > 0");
        }

        public static BigInteger inverse(int i11, int[] iArr, BigInteger bigInteger) {
            return new LongArray(bigInteger).modInverse(i11, iArr).toBigInteger();
        }

        private ECFieldElement solveQuadraticEquation(ECFieldElement eCFieldElement) {
            ECFieldElement eCFieldElement2;
            if (eCFieldElement.isZero()) {
                return eCFieldElement;
            }
            ECFieldElement fromBigInteger = fromBigInteger(ECConstants.ZERO);
            int fieldSize = getFieldSize();
            Random random = new Random();
            do {
                ECFieldElement fromBigInteger2 = fromBigInteger(new BigInteger(fieldSize, random));
                ECFieldElement eCFieldElement3 = eCFieldElement;
                eCFieldElement2 = fromBigInteger;
                for (int i11 = 1; i11 < fieldSize; i11++) {
                    ECFieldElement square = eCFieldElement3.square();
                    eCFieldElement2 = eCFieldElement2.square().add(square.multiply(fromBigInteger2));
                    eCFieldElement3 = square.add(eCFieldElement);
                }
                if (!eCFieldElement3.isZero()) {
                    return null;
                }
            } while (eCFieldElement2.square().add(eCFieldElement2).isZero());
            return eCFieldElement2;
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z11) {
            ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement fromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (fromBigInteger.isZero()) {
                    if (!fromBigInteger2.square().equals(getB())) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    fromBigInteger2 = fromBigInteger2.divide(fromBigInteger).add(fromBigInteger);
                }
            }
            return createRawPoint(fromBigInteger, fromBigInteger2, z11);
        }

        @Override // org.spongycastle.math.ec.ECCurve
        protected ECPoint decompressPoint(int i11, BigInteger bigInteger) {
            ECFieldElement eCFieldElement;
            ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            if (fromBigInteger.isZero()) {
                eCFieldElement = getB().sqrt();
            } else {
                ECFieldElement solveQuadraticEquation = solveQuadraticEquation(fromBigInteger.square().invert().multiply(getB()).add(getA()).add(fromBigInteger));
                if (solveQuadraticEquation != null) {
                    if (solveQuadraticEquation.testBitZero() != (i11 == 1)) {
                        solveQuadraticEquation = solveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    if (coordinateSystem != 5 && coordinateSystem != 6) {
                        eCFieldElement = solveQuadraticEquation.multiply(fromBigInteger);
                    } else {
                        eCFieldElement = solveQuadraticEquation.add(fromBigInteger);
                    }
                } else {
                    eCFieldElement = null;
                }
            }
            if (eCFieldElement != null) {
                return createRawPoint(fromBigInteger, eCFieldElement, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public synchronized BigInteger[] getSi() {
            if (this.f43695si == null) {
                this.f43695si = Tnaf.getSi(this);
            }
            return this.f43695si;
        }

        public boolean isKoblitz() {
            return this.order != null && this.cofactor != null && this.f43694b.isOne() && (this.f43693a.isZero() || this.f43693a.isOne());
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class AbstractFp extends ECCurve {
        public AbstractFp(BigInteger bigInteger) {
            super(FiniteFields.getPrimeField(bigInteger));
        }

        @Override // org.spongycastle.math.ec.ECCurve
        protected ECPoint decompressPoint(int i11, BigInteger bigInteger) {
            ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement sqrt = fromBigInteger.square().add(this.f43693a).multiply(fromBigInteger).add(this.f43694b).sqrt();
            if (sqrt != null) {
                if (sqrt.testBitZero() != (i11 == 1)) {
                    sqrt = sqrt.negate();
                }
                return createRawPoint(fromBigInteger, sqrt, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getField().getCharacteristic()) < 0;
        }
    }

    /* loaded from: classes4.dex */
    public class Config {
        protected int coord;
        protected ECEndomorphism endomorphism;
        protected ECMultiplier multiplier;

        Config(int i11, ECEndomorphism eCEndomorphism, ECMultiplier eCMultiplier) {
            ECCurve.this = r1;
            this.coord = i11;
            this.endomorphism = eCEndomorphism;
            this.multiplier = eCMultiplier;
        }

        public ECCurve create() {
            if (ECCurve.this.supportsCoordinateSystem(this.coord)) {
                ECCurve cloneCurve = ECCurve.this.cloneCurve();
                if (cloneCurve != ECCurve.this) {
                    synchronized (cloneCurve) {
                        cloneCurve.coord = this.coord;
                        cloneCurve.endomorphism = this.endomorphism;
                        cloneCurve.multiplier = this.multiplier;
                    }
                    return cloneCurve;
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        public Config setCoordinateSystem(int i11) {
            this.coord = i11;
            return this;
        }

        public Config setEndomorphism(ECEndomorphism eCEndomorphism) {
            this.endomorphism = eCEndomorphism;
            return this;
        }

        public Config setMultiplier(ECMultiplier eCMultiplier) {
            this.multiplier = eCMultiplier;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static class F2m extends AbstractF2m {
        private static final int F2M_DEFAULT_COORDS = 6;
        private ECPoint.F2m infinity;

        /* renamed from: k1 */
        private int f43696k1;

        /* renamed from: k2 */
        private int f43697k2;

        /* renamed from: k3 */
        private int f43698k3;

        /* renamed from: m */
        private int f43699m;

        public F2m(int i11, int i12, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i11, i12, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        @Override // org.spongycastle.math.ec.ECCurve
        protected ECCurve cloneCurve() {
            return new F2m(this.f43699m, this.f43696k1, this.f43697k2, this.f43698k3, this.f43693a, this.f43694b, this.order, this.cofactor);
        }

        @Override // org.spongycastle.math.ec.ECCurve
        protected ECMultiplier createDefaultMultiplier() {
            if (isKoblitz()) {
                return new WTauNafMultiplier();
            }
            return super.createDefaultMultiplier();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.spongycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z11) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, z11);
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return new ECFieldElement.F2m(this.f43699m, this.f43696k1, this.f43697k2, this.f43698k3, bigInteger);
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f43699m;
        }

        public BigInteger getH() {
            return this.cofactor;
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public int getK1() {
            return this.f43696k1;
        }

        public int getK2() {
            return this.f43697k2;
        }

        public int getK3() {
            return this.f43698k3;
        }

        public int getM() {
            return this.f43699m;
        }

        public BigInteger getN() {
            return this.order;
        }

        public boolean isTrinomial() {
            return this.f43697k2 == 0 && this.f43698k3 == 0;
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i11) {
            return i11 == 0 || i11 == 1 || i11 == 6;
        }

        public F2m(int i11, int i12, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i11, i12, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.spongycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z11) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z11);
        }

        public F2m(int i11, int i12, int i13, int i14, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i11, i12, i13, i14, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int i11, int i12, int i13, int i14, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i11, i12, i13, i14);
            this.f43699m = i11;
            this.f43696k1 = i12;
            this.f43697k2 = i13;
            this.f43698k3 = i14;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f43693a = fromBigInteger(bigInteger);
            this.f43694b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        protected F2m(int i11, int i12, int i13, int i14, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i11, i12, i13, i14);
            this.f43699m = i11;
            this.f43696k1 = i12;
            this.f43697k2 = i13;
            this.f43698k3 = i14;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f43693a = eCFieldElement;
            this.f43694b = eCFieldElement2;
            this.coord = 6;
        }
    }

    /* loaded from: classes4.dex */
    public static class Fp extends AbstractFp {
        private static final int FP_DEFAULT_COORDS = 4;
        ECPoint.Fp infinity;

        /* renamed from: q */
        BigInteger f43700q;

        /* renamed from: r */
        BigInteger f43701r;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // org.spongycastle.math.ec.ECCurve
        protected ECCurve cloneCurve() {
            return new Fp(this.f43700q, this.f43701r, this.f43693a, this.f43694b, this.order, this.cofactor);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.spongycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z11) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2, z11);
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return new ECFieldElement.Fp(this.f43700q, this.f43701r, bigInteger);
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f43700q.bitLength();
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public BigInteger getQ() {
            return this.f43700q;
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public ECPoint importPoint(ECPoint eCPoint) {
            int coordinateSystem;
            if (this != eCPoint.getCurve() && getCoordinateSystem() == 2 && !eCPoint.isInfinity() && ((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                return new ECPoint.Fp(this, fromBigInteger(eCPoint.f43708x.toBigInteger()), fromBigInteger(eCPoint.f43709y.toBigInteger()), new ECFieldElement[]{fromBigInteger(eCPoint.f43710zs[0].toBigInteger())}, eCPoint.withCompression);
            }
            return super.importPoint(eCPoint);
        }

        @Override // org.spongycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i11) {
            return i11 == 0 || i11 == 1 || i11 == 2 || i11 == 4;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f43700q = bigInteger;
            this.f43701r = ECFieldElement.Fp.calculateResidue(bigInteger);
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f43693a = fromBigInteger(bigInteger2);
            this.f43694b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.spongycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z11) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z11);
        }

        protected Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(bigInteger, bigInteger2, eCFieldElement, eCFieldElement2, null, null);
        }

        protected Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f43700q = bigInteger;
            this.f43701r = bigInteger2;
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f43693a = eCFieldElement;
            this.f43694b = eCFieldElement2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }
    }

    protected ECCurve(FiniteField finiteField) {
        this.field = finiteField;
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    protected void checkPoint(ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    protected void checkPoints(ECPoint[] eCPointArr) {
        checkPoints(eCPointArr, 0, eCPointArr.length);
    }

    protected abstract ECCurve cloneCurve();

    public synchronized Config configure() {
        return new Config(this.coord, this.endomorphism, this.multiplier);
    }

    protected ECMultiplier createDefaultMultiplier() {
        ECEndomorphism eCEndomorphism = this.endomorphism;
        if (eCEndomorphism instanceof GLVEndomorphism) {
            return new GLVMultiplier(this, (GLVEndomorphism) eCEndomorphism);
        }
        return new WNafL2RMultiplier();
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createPoint(bigInteger, bigInteger2, false);
    }

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z11);

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z11);

    public ECPoint decodePoint(byte[] bArr) {
        ECPoint infinity;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b11 = bArr[0];
        if (b11 != 0) {
            if (b11 == 2 || b11 == 3) {
                if (bArr.length == fieldSize + 1) {
                    infinity = decompressPoint(b11 & 1, BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize));
                    if (!infinity.satisfiesCofactor()) {
                        throw new IllegalArgumentException("Invalid point");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
            } else if (b11 != 4) {
                if (b11 != 6 && b11 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b11, 16));
                } else if (bArr.length == (fieldSize * 2) + 1) {
                    BigInteger fromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize);
                    BigInteger fromUnsignedByteArray2 = BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize);
                    if (fromUnsignedByteArray2.testBit(0) == (b11 == 7)) {
                        infinity = validatePoint(fromUnsignedByteArray, fromUnsignedByteArray2);
                    } else {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
            } else if (bArr.length == (fieldSize * 2) + 1) {
                infinity = validatePoint(BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize), BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize));
            } else {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            }
        } else if (bArr.length == 1) {
            infinity = getInfinity();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b11 == 0 || !infinity.isInfinity()) {
            return infinity;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    protected abstract ECPoint decompressPoint(int i11, BigInteger bigInteger);

    public boolean equals(ECCurve eCCurve) {
        return this == eCCurve || (eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger()));
    }

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    public ECFieldElement getA() {
        return this.f43693a;
    }

    public ECFieldElement getB() {
        return this.f43694b;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }

    public FiniteField getField() {
        return this.field;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();

    public synchronized ECMultiplier getMultiplier() {
        if (this.multiplier == null) {
            this.multiplier = createDefaultMultiplier();
        }
        return this.multiplier;
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public PreCompInfo getPreCompInfo(ECPoint eCPoint, String str) {
        PreCompInfo preCompInfo;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            Hashtable hashtable = eCPoint.preCompTable;
            preCompInfo = hashtable == null ? null : (PreCompInfo) hashtable.get(str);
        }
        return preCompInfo;
    }

    public int hashCode() {
        return (getField().hashCode() ^ Integers.rotateLeft(getA().toBigInteger().hashCode(), 8)) ^ Integers.rotateLeft(getB().toBigInteger().hashCode(), 16);
    }

    public ECPoint importPoint(ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        ECPoint normalize = eCPoint.normalize();
        return validatePoint(normalize.getXCoord().toBigInteger(), normalize.getYCoord().toBigInteger(), normalize.withCompression);
    }

    public abstract boolean isValidFieldElement(BigInteger bigInteger);

    public void normalizeAll(ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }

    public void setPreCompInfo(ECPoint eCPoint, String str, PreCompInfo preCompInfo) {
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            Hashtable hashtable = eCPoint.preCompTable;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                eCPoint.preCompTable = hashtable;
            }
            hashtable.put(str, preCompInfo);
        }
    }

    public boolean supportsCoordinateSystem(int i11) {
        return i11 == 0;
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2) {
        ECPoint createPoint = createPoint(bigInteger, bigInteger2);
        if (createPoint.isValid()) {
            return createPoint;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    protected void checkPoints(ECPoint[] eCPointArr, int i11, int i12) {
        if (eCPointArr != null) {
            if (i11 < 0 || i12 < 0 || i11 > eCPointArr.length - i12) {
                throw new IllegalArgumentException("invalid range specified for 'points'");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                ECPoint eCPoint = eCPointArr[i11 + i13];
                if (eCPoint != null && this != eCPoint.getCurve()) {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
            return;
        }
        throw new IllegalArgumentException("'points' cannot be null");
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z11) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2), z11);
    }

    public void normalizeAll(ECPoint[] eCPointArr, int i11, int i12, ECFieldElement eCFieldElement) {
        checkPoints(eCPointArr, i11, i12);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (eCFieldElement != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[i12];
        int[] iArr = new int[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i11 + i14;
            ECPoint eCPoint = eCPointArr[i15];
            if (eCPoint != null && (eCFieldElement != null || !eCPoint.isNormalized())) {
                eCFieldElementArr[i13] = eCPoint.getZCoord(0);
                iArr[i13] = i15;
                i13++;
            }
        }
        if (i13 == 0) {
            return;
        }
        ECAlgorithms.montgomeryTrick(eCFieldElementArr, 0, i13, eCFieldElement);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = iArr[i16];
            eCPointArr[i17] = eCPointArr[i17].normalize(eCFieldElementArr[i16]);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ECCurve) && equals((ECCurve) obj));
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z11) {
        ECPoint createPoint = createPoint(bigInteger, bigInteger2, z11);
        if (createPoint.isValid()) {
            return createPoint;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }
}