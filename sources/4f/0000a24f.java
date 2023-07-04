package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class Tnaf {
    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte POW_2_WIDTH = 16;
    public static final byte WIDTH = 4;
    public static final ZTauElement[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final ZTauElement[] alpha1;
    public static final byte[][] alpha1Tnaf;

    static {
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger negate = bigInteger.negate();
        MINUS_ONE = negate;
        MINUS_TWO = ECConstants.TWO.negate();
        BigInteger negate2 = ECConstants.THREE.negate();
        MINUS_THREE = negate2;
        BigInteger bigInteger2 = ECConstants.ZERO;
        alpha0 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger2), null, new ZTauElement(negate2, negate), null, new ZTauElement(negate, negate), null, new ZTauElement(bigInteger, negate), null};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger2), null, new ZTauElement(negate2, bigInteger), null, new ZTauElement(negate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    Tnaf() {
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b11, int i11, int i12) {
        int i13 = ((i11 + 5) / 2) + i12;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i11 - i13) - 2) + b11));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i11)));
        int i14 = i13 - i12;
        BigInteger shiftRight = add.shiftRight(i14);
        if (add.testBit(i14 - 1)) {
            shiftRight = shiftRight.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(shiftRight, i12);
    }

    public static BigInteger[] getLucas(byte b11, int i11, boolean z11) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b11 == 1 || b11 == -1) {
            if (z11) {
                bigInteger = ECConstants.TWO;
                bigInteger2 = BigInteger.valueOf(b11);
            } else {
                bigInteger = ECConstants.ZERO;
                bigInteger2 = ECConstants.ONE;
            }
            int i12 = 1;
            while (i12 < i11) {
                i12++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b11 == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static byte getMu(int i11) {
        return (byte) (i11 == 0 ? -1 : 1);
    }

    public static byte getMu(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return abstractF2m.getA().isZero() ? (byte) -1 : (byte) 1;
        }
        throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
    }

    public static ECPoint.AbstractF2m[] getPreComp(ECPoint.AbstractF2m abstractF2m, byte b11) {
        byte[][] bArr = b11 == 0 ? alpha0Tnaf : alpha1Tnaf;
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[(bArr.length + 1) >>> 1];
        abstractF2mArr[0] = abstractF2m;
        int length = bArr.length;
        for (int i11 = 3; i11 < length; i11 += 2) {
            abstractF2mArr[i11 >>> 1] = multiplyFromTnaf(abstractF2m, bArr[i11]);
        }
        abstractF2m.getCurve().normalizeAll(abstractF2mArr);
        return abstractF2mArr;
    }

    protected static int getShiftsForCofactor(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(ECConstants.TWO)) {
                return 1;
            }
            if (bigInteger.equals(ECConstants.FOUR)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] getSi(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            int fieldSize = abstractF2m.getFieldSize();
            int intValue = abstractF2m.getA().toBigInteger().intValue();
            byte mu2 = getMu(intValue);
            int shiftsForCofactor = getShiftsForCofactor(abstractF2m.getCofactor());
            BigInteger[] lucas = getLucas(mu2, (fieldSize + 3) - intValue, false);
            if (mu2 == 1) {
                lucas[0] = lucas[0].negate();
                lucas[1] = lucas[1].negate();
            }
            BigInteger bigInteger = ECConstants.ONE;
            return new BigInteger[]{bigInteger.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    public static BigInteger getTw(byte b11, int i11) {
        if (i11 == 4) {
            if (b11 == 1) {
                return BigInteger.valueOf(6L);
            }
            return BigInteger.valueOf(10L);
        }
        BigInteger[] lucas = getLucas(b11, i11, false);
        BigInteger bit = ECConstants.ZERO.setBit(i11);
        return ECConstants.TWO.multiply(lucas[0]).multiply(lucas[1].modInverse(bit)).mod(bit);
    }

    public static ECPoint.AbstractF2m multiplyFromTnaf(ECPoint.AbstractF2m abstractF2m, byte[] bArr) {
        ECPoint.AbstractF2m abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.negate();
        int i11 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i11++;
            byte b11 = bArr[length];
            if (b11 != 0) {
                abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m2.tauPow(i11).add(b11 > 0 ? abstractF2m : abstractF2m3);
                i11 = 0;
            }
        }
        return i11 > 0 ? abstractF2m2.tauPow(i11) : abstractF2m2;
    }

    public static ECPoint.AbstractF2m multiplyRTnaf(ECPoint.AbstractF2m abstractF2m, BigInteger bigInteger) {
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int fieldSize = abstractF2m2.getFieldSize();
        int intValue = abstractF2m2.getA().toBigInteger().intValue();
        return multiplyTnaf(abstractF2m, partModReduction(bigInteger, fieldSize, (byte) intValue, abstractF2m2.getSi(), getMu(intValue), (byte) 10));
    }

    public static ECPoint.AbstractF2m multiplyTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement) {
        return multiplyFromTnaf(abstractF2m, tauAdicNaf(getMu(((ECCurve.AbstractF2m) abstractF2m.getCurve()).getA()), zTauElement));
    }

    public static BigInteger norm(byte b11, ZTauElement zTauElement) {
        BigInteger bigInteger = zTauElement.f43711u;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger multiply2 = zTauElement.f43711u.multiply(zTauElement.f43712v);
        BigInteger bigInteger2 = zTauElement.f43712v;
        BigInteger shiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b11 == 1) {
            return multiply.add(multiply2).add(shiftLeft);
        }
        if (b11 == -1) {
            return multiply.subtract(multiply2).add(shiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static ZTauElement partModReduction(BigInteger bigInteger, int i11, byte b11, BigInteger[] bigIntegerArr, byte b12, byte b13) {
        BigInteger subtract;
        if (b12 == 1) {
            subtract = bigIntegerArr[0].add(bigIntegerArr[1]);
        } else {
            subtract = bigIntegerArr[0].subtract(bigIntegerArr[1]);
        }
        BigInteger bigInteger2 = getLucas(b12, i11, true)[1];
        ZTauElement round = round(approximateDivisionByN(bigInteger, bigIntegerArr[0], bigInteger2, b11, i11, b13), approximateDivisionByN(bigInteger, bigIntegerArr[1], bigInteger2, b11, i11, b13), b12);
        return new ZTauElement(bigInteger.subtract(subtract.multiply(round.f43711u)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(round.f43712v)), bigIntegerArr[1].multiply(round.f43711u).subtract(bigIntegerArr[0].multiply(round.f43712v)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r5.compareTo(org.spongycastle.math.ec.Tnaf.MINUS_ONE) < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
        if (r5.compareTo(r9) >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r8.compareTo(org.spongycastle.math.ec.Tnaf.MINUS_TWO) < 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.spongycastle.math.ec.ZTauElement round(org.spongycastle.math.ec.SimpleBigDecimal r8, org.spongycastle.math.ec.SimpleBigDecimal r9, byte r10) {
        /*
            int r0 = r8.getScale()
            int r1 = r9.getScale()
            if (r1 != r0) goto La7
            r0 = -1
            r1 = 1
            if (r10 == r1) goto L19
            if (r10 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "mu must be 1 or -1"
            r8.<init>(r9)
            throw r8
        L19:
            java.math.BigInteger r2 = r8.round()
            java.math.BigInteger r3 = r9.round()
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r8.subtract(r2)
            org.spongycastle.math.ec.SimpleBigDecimal r9 = r9.subtract(r3)
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r8.add(r8)
            if (r10 != r1) goto L34
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r4.add(r9)
            goto L38
        L34:
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r4.subtract(r9)
        L38:
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r9.add(r9)
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r5.add(r9)
            org.spongycastle.math.ec.SimpleBigDecimal r9 = r5.add(r9)
            if (r10 != r1) goto L4f
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r8.subtract(r5)
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r8.add(r9)
            goto L57
        L4f:
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r8.add(r5)
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r8.subtract(r9)
        L57:
            java.math.BigInteger r9 = org.spongycastle.math.ec.ECConstants.ONE
            int r6 = r4.compareTo(r9)
            r7 = 0
            if (r6 < 0) goto L69
            java.math.BigInteger r6 = org.spongycastle.math.ec.Tnaf.MINUS_ONE
            int r6 = r5.compareTo(r6)
            if (r6 >= 0) goto L75
            goto L71
        L69:
            java.math.BigInteger r1 = org.spongycastle.math.ec.ECConstants.TWO
            int r1 = r8.compareTo(r1)
            if (r1 < 0) goto L74
        L71:
            r1 = r7
            r7 = r10
            goto L75
        L74:
            r1 = r7
        L75:
            java.math.BigInteger r6 = org.spongycastle.math.ec.Tnaf.MINUS_ONE
            int r4 = r4.compareTo(r6)
            if (r4 >= 0) goto L84
            int r8 = r5.compareTo(r9)
            if (r8 < 0) goto L8f
            goto L8c
        L84:
            java.math.BigInteger r9 = org.spongycastle.math.ec.Tnaf.MINUS_TWO
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L8e
        L8c:
            int r8 = -r10
            byte r7 = (byte) r8
        L8e:
            r0 = r1
        L8f:
            long r8 = (long) r0
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r2.add(r8)
            long r9 = (long) r7
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r9 = r3.add(r9)
            org.spongycastle.math.ec.ZTauElement r10 = new org.spongycastle.math.ec.ZTauElement
            r10.<init>(r8, r9)
            return r10
        La7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "lambda0 and lambda1 do not have same scale"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.math.ec.Tnaf.round(org.spongycastle.math.ec.SimpleBigDecimal, org.spongycastle.math.ec.SimpleBigDecimal, byte):org.spongycastle.math.ec.ZTauElement");
    }

    public static ECPoint.AbstractF2m tau(ECPoint.AbstractF2m abstractF2m) {
        return abstractF2m.tau();
    }

    public static byte[] tauAdicNaf(byte b11, ZTauElement zTauElement) {
        BigInteger subtract;
        if (b11 != 1 && b11 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int bitLength = norm(b11, zTauElement).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 : 34];
        BigInteger bigInteger = zTauElement.f43711u;
        BigInteger bigInteger2 = zTauElement.f43712v;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            BigInteger bigInteger3 = ECConstants.ZERO;
            if (bigInteger.equals(bigInteger3) && bigInteger2.equals(bigInteger3)) {
                int i13 = i11 + 1;
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, 0, bArr2, 0, i13);
                return bArr2;
            }
            if (bigInteger.testBit(0)) {
                bArr[i12] = (byte) ECConstants.TWO.subtract(bigInteger.subtract(bigInteger2.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                if (bArr[i12] == 1) {
                    bigInteger = bigInteger.clearBit(0);
                } else {
                    bigInteger = bigInteger.add(ECConstants.ONE);
                }
                i11 = i12;
            } else {
                bArr[i12] = 0;
            }
            BigInteger shiftRight = bigInteger.shiftRight(1);
            if (b11 == 1) {
                subtract = bigInteger2.add(shiftRight);
            } else {
                subtract = bigInteger2.subtract(shiftRight);
            }
            BigInteger negate = bigInteger.shiftRight(1).negate();
            i12++;
            bigInteger = subtract;
            bigInteger2 = negate;
        }
    }

    public static byte[] tauAdicWNaf(byte b11, ZTauElement zTauElement, byte b12, BigInteger bigInteger, BigInteger bigInteger2, ZTauElement[] zTauElementArr) {
        BigInteger subtract;
        int intValue;
        boolean z11;
        if (b11 != 1 && b11 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int bitLength = norm(b11, zTauElement).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 + b12 : b12 + 34];
        BigInteger shiftRight = bigInteger.shiftRight(1);
        BigInteger bigInteger3 = zTauElement.f43711u;
        BigInteger bigInteger4 = zTauElement.f43712v;
        int i11 = 0;
        while (true) {
            BigInteger bigInteger5 = ECConstants.ZERO;
            if (bigInteger3.equals(bigInteger5) && bigInteger4.equals(bigInteger5)) {
                return bArr;
            }
            if (bigInteger3.testBit(0)) {
                BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                if (mod.compareTo(shiftRight) >= 0) {
                    intValue = mod.subtract(bigInteger).intValue();
                } else {
                    intValue = mod.intValue();
                }
                byte b13 = (byte) intValue;
                bArr[i11] = b13;
                if (b13 < 0) {
                    b13 = (byte) (-b13);
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    bigInteger3 = bigInteger3.subtract(zTauElementArr[b13].f43711u);
                    bigInteger4 = bigInteger4.subtract(zTauElementArr[b13].f43712v);
                } else {
                    bigInteger3 = bigInteger3.add(zTauElementArr[b13].f43711u);
                    bigInteger4 = bigInteger4.add(zTauElementArr[b13].f43712v);
                }
            } else {
                bArr[i11] = 0;
            }
            if (b11 == 1) {
                subtract = bigInteger4.add(bigInteger3.shiftRight(1));
            } else {
                subtract = bigInteger4.subtract(bigInteger3.shiftRight(1));
            }
            BigInteger negate = bigInteger3.shiftRight(1).negate();
            i11++;
            bigInteger3 = subtract;
            bigInteger4 = negate;
        }
    }

    public static byte getMu(ECFieldElement eCFieldElement) {
        return (byte) (eCFieldElement.isZero() ? -1 : 1);
    }

    public static SimpleBigDecimal norm(byte b11, SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2) {
        SimpleBigDecimal multiply = simpleBigDecimal.multiply(simpleBigDecimal);
        SimpleBigDecimal multiply2 = simpleBigDecimal.multiply(simpleBigDecimal2);
        SimpleBigDecimal shiftLeft = simpleBigDecimal2.multiply(simpleBigDecimal2).shiftLeft(1);
        if (b11 == 1) {
            return multiply.add(multiply2).add(shiftLeft);
        }
        if (b11 == -1) {
            return multiply.subtract(multiply2).add(shiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static BigInteger[] getSi(int i11, int i12, BigInteger bigInteger) {
        byte mu2 = getMu(i12);
        int shiftsForCofactor = getShiftsForCofactor(bigInteger);
        BigInteger[] lucas = getLucas(mu2, (i11 + 3) - i12, false);
        if (mu2 == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        BigInteger bigInteger2 = ECConstants.ONE;
        return new BigInteger[]{bigInteger2.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger2.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }
}