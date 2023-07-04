package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class WNafUtil {
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, 2305};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final ECPoint[] EMPTY_POINTS = new ECPoint[0];
    public static final String PRECOMP_NAME = "bc_wnaf";

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) == 0) {
            if (bigInteger.signum() == 0) {
                return EMPTY_INTS;
            }
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength();
            int i11 = bitLength >> 1;
            int[] iArr = new int[i11];
            BigInteger xor = add.xor(bigInteger);
            int i12 = bitLength - 1;
            int i13 = 0;
            int i14 = 1;
            int i15 = 0;
            while (i14 < i12) {
                if (xor.testBit(i14)) {
                    iArr[i13] = i15 | ((bigInteger.testBit(i14) ? -1 : 1) << 16);
                    i14++;
                    i15 = 1;
                    i13++;
                } else {
                    i15++;
                }
                i14++;
            }
            int i16 = i13 + 1;
            iArr[i13] = 65536 | i15;
            return i11 > i16 ? trim(iArr, i16) : iArr;
        }
        throw new IllegalArgumentException("'k' must have bitlength < 2^16");
    }

    public static int[] generateCompactWindowNaf(int i11, BigInteger bigInteger) {
        if (i11 == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i11 >= 2 && i11 <= 16) {
            if ((bigInteger.bitLength() >>> 16) == 0) {
                if (bigInteger.signum() == 0) {
                    return EMPTY_INTS;
                }
                int bitLength = (bigInteger.bitLength() / i11) + 1;
                int[] iArr = new int[bitLength];
                int i12 = 1 << i11;
                int i13 = i12 - 1;
                int i14 = i12 >>> 1;
                int i15 = 0;
                int i16 = 0;
                boolean z11 = false;
                while (i15 <= bigInteger.bitLength()) {
                    if (bigInteger.testBit(i15) == z11) {
                        i15++;
                    } else {
                        bigInteger = bigInteger.shiftRight(i15);
                        int intValue = bigInteger.intValue() & i13;
                        if (z11) {
                            intValue++;
                        }
                        z11 = (intValue & i14) != 0;
                        if (z11) {
                            intValue -= i12;
                        }
                        if (i16 > 0) {
                            i15--;
                        }
                        iArr[i16] = i15 | (intValue << 16);
                        i15 = i11;
                        i16++;
                    }
                }
                return bitLength > i16 ? trim(iArr, i16) : iArr;
            }
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        throw new IllegalArgumentException("'width' must be in the range [2, 16]");
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int max = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[max];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if ((i11 | i12) == 0 && bigInteger.bitLength() <= i13 && bigInteger2.bitLength() <= i13) {
                break;
            }
            int intValue = ((bigInteger.intValue() >>> i13) + i11) & 7;
            int intValue2 = ((bigInteger2.intValue() >>> i13) + i12) & 7;
            int i15 = intValue & 1;
            if (i15 != 0) {
                i15 -= intValue & 2;
                if (intValue + i15 == 4 && (intValue2 & 3) == 2) {
                    i15 = -i15;
                }
            }
            int i16 = intValue2 & 1;
            if (i16 != 0) {
                i16 -= intValue2 & 2;
                if (intValue2 + i16 == 4 && (intValue & 3) == 2) {
                    i16 = -i16;
                }
            }
            if ((i11 << 1) == i15 + 1) {
                i11 ^= 1;
            }
            if ((i12 << 1) == i16 + 1) {
                i12 ^= 1;
            }
            i13++;
            if (i13 == 30) {
                bigInteger = bigInteger.shiftRight(30);
                bigInteger2 = bigInteger2.shiftRight(30);
                i13 = 0;
            }
            bArr[i14] = (byte) ((i15 << 4) | (i16 & 15));
            i14++;
        }
        return max > i14 ? trim(bArr, i14) : bArr;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength() - 1;
        byte[] bArr = new byte[bitLength];
        BigInteger xor = add.xor(bigInteger);
        int i11 = 1;
        while (i11 < bitLength) {
            if (xor.testBit(i11)) {
                bArr[i11 - 1] = (byte) (bigInteger.testBit(i11) ? -1 : 1);
                i11++;
            }
            i11++;
        }
        bArr[bitLength - 1] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i11, BigInteger bigInteger) {
        if (i11 == 2) {
            return generateNaf(bigInteger);
        }
        if (i11 >= 2 && i11 <= 8) {
            if (bigInteger.signum() == 0) {
                return EMPTY_BYTES;
            }
            int bitLength = bigInteger.bitLength() + 1;
            byte[] bArr = new byte[bitLength];
            int i12 = 1 << i11;
            int i13 = i12 - 1;
            int i14 = i12 >>> 1;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            while (i15 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i15) == z11) {
                    i15++;
                } else {
                    bigInteger = bigInteger.shiftRight(i15);
                    int intValue = bigInteger.intValue() & i13;
                    if (z11) {
                        intValue++;
                    }
                    z11 = (intValue & i14) != 0;
                    if (z11) {
                        intValue -= i12;
                    }
                    if (i16 > 0) {
                        i15--;
                    }
                    int i17 = i16 + i15;
                    bArr[i17] = (byte) intValue;
                    i16 = i17 + 1;
                    i15 = i11;
                }
            }
            return bitLength > i16 ? trim(bArr, i16) : bArr;
        }
        throw new IllegalArgumentException("'width' must be in the range [2, 8]");
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, PRECOMP_NAME));
    }

    public static int getWindowSize(int i11) {
        return getWindowSize(i11, DEFAULT_WINDOW_SIZE_CUTOFFS);
    }

    public static ECPoint mapPointWithPrecomp(ECPoint eCPoint, int i11, boolean z11, ECPointMap eCPointMap) {
        ECCurve curve = eCPoint.getCurve();
        WNafPreCompInfo precompute = precompute(eCPoint, i11, z11);
        ECPoint map = eCPointMap.map(eCPoint);
        WNafPreCompInfo wNafPreCompInfo = getWNafPreCompInfo(curve.getPreCompInfo(map, PRECOMP_NAME));
        ECPoint twice = precompute.getTwice();
        if (twice != null) {
            wNafPreCompInfo.setTwice(eCPointMap.map(twice));
        }
        ECPoint[] preComp = precompute.getPreComp();
        int length = preComp.length;
        ECPoint[] eCPointArr = new ECPoint[length];
        for (int i12 = 0; i12 < preComp.length; i12++) {
            eCPointArr[i12] = eCPointMap.map(preComp[i12]);
        }
        wNafPreCompInfo.setPreComp(eCPointArr);
        if (z11) {
            ECPoint[] eCPointArr2 = new ECPoint[length];
            for (int i13 = 0; i13 < length; i13++) {
                eCPointArr2[i13] = eCPointArr[i13].negate();
            }
            wNafPreCompInfo.setPreCompNeg(eCPointArr2);
        }
        curve.setPreCompInfo(map, PRECOMP_NAME, wNafPreCompInfo);
        return map;
    }

    public static WNafPreCompInfo precompute(ECPoint eCPoint, int i11, boolean z11) {
        int length;
        int i12;
        int coordinateSystem;
        ECCurve curve = eCPoint.getCurve();
        WNafPreCompInfo wNafPreCompInfo = getWNafPreCompInfo(curve.getPreCompInfo(eCPoint, PRECOMP_NAME));
        int i13 = 0;
        int max = 1 << Math.max(0, i11 - 2);
        ECPoint[] preComp = wNafPreCompInfo.getPreComp();
        if (preComp == null) {
            preComp = EMPTY_POINTS;
            length = 0;
        } else {
            length = preComp.length;
        }
        if (length < max) {
            preComp = resizeTable(preComp, max);
            if (max == 1) {
                preComp[0] = eCPoint.normalize();
            } else {
                if (length == 0) {
                    preComp[0] = eCPoint;
                    i12 = 1;
                } else {
                    i12 = length;
                }
                ECFieldElement eCFieldElement = null;
                if (max == 2) {
                    preComp[1] = eCPoint.threeTimes();
                } else {
                    ECPoint twice = wNafPreCompInfo.getTwice();
                    ECPoint eCPoint2 = preComp[i12 - 1];
                    if (twice == null) {
                        twice = preComp[0].twice();
                        wNafPreCompInfo.setTwice(twice);
                        if (!twice.isInfinity() && ECAlgorithms.isFpCurve(curve) && curve.getFieldSize() >= 64 && ((coordinateSystem = curve.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                            ECFieldElement zCoord = twice.getZCoord(0);
                            twice = curve.createPoint(twice.getXCoord().toBigInteger(), twice.getYCoord().toBigInteger());
                            ECFieldElement square = zCoord.square();
                            eCPoint2 = eCPoint2.scaleX(square).scaleY(square.multiply(zCoord));
                            if (length == 0) {
                                preComp[0] = eCPoint2;
                            }
                            eCFieldElement = zCoord;
                        }
                    }
                    while (i12 < max) {
                        eCPoint2 = eCPoint2.add(twice);
                        preComp[i12] = eCPoint2;
                        i12++;
                    }
                }
                curve.normalizeAll(preComp, length, max - length, eCFieldElement);
            }
        }
        wNafPreCompInfo.setPreComp(preComp);
        if (z11) {
            ECPoint[] preCompNeg = wNafPreCompInfo.getPreCompNeg();
            if (preCompNeg == null) {
                preCompNeg = new ECPoint[max];
            } else {
                i13 = preCompNeg.length;
                if (i13 < max) {
                    preCompNeg = resizeTable(preCompNeg, max);
                }
            }
            while (i13 < max) {
                preCompNeg[i13] = preComp[i13].negate();
                i13++;
            }
            wNafPreCompInfo.setPreCompNeg(preCompNeg);
        }
        curve.setPreCompInfo(eCPoint, PRECOMP_NAME, wNafPreCompInfo);
        return wNafPreCompInfo;
    }

    private static ECPoint[] resizeTable(ECPoint[] eCPointArr, int i11) {
        ECPoint[] eCPointArr2 = new ECPoint[i11];
        System.arraycopy(eCPointArr, 0, eCPointArr2, 0, eCPointArr.length);
        return eCPointArr2;
    }

    private static byte[] trim(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo != null && (preCompInfo instanceof WNafPreCompInfo)) {
            return (WNafPreCompInfo) preCompInfo;
        }
        return new WNafPreCompInfo();
    }

    public static int getWindowSize(int i11, int[] iArr) {
        int i12 = 0;
        while (i12 < iArr.length && i11 >= iArr[i12]) {
            i12++;
        }
        return i12 + 2;
    }

    private static int[] trim(int[] iArr, int i11) {
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        return iArr2;
    }
}