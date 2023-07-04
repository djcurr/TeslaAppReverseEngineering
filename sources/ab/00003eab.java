package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;

/* loaded from: classes2.dex */
class x {

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17736a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            f17736a = iArr;
            try {
                iArr[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17736a[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17736a[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17736a[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17736a[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17736a[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17736a[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17736a[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17736a[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17736a[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17736a[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double a(SVGLength sVGLength, double d11, double d12, double d13, double d14) {
        double d15;
        if (sVGLength == null) {
            return d12;
        }
        SVGLength.UnitType unitType = sVGLength.f17528b;
        double d16 = sVGLength.f17527a;
        switch (a.f17736a[unitType.ordinal()]) {
            case 1:
            case 2:
                d14 = 1.0d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 3:
                d15 = (d16 / 100.0d) * d11;
                break;
            case 4:
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 5:
                d14 /= 2.0d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 6:
                d14 = 35.43307d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 7:
                d14 = 3.543307d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 8:
                d14 = 90.0d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 9:
                d14 = 1.25d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 10:
                d14 = 15.0d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            default:
                d15 = d16 * d13;
                break;
        }
        return d15 + d12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double b(String str, double d11, double d12, double d13) {
        double doubleValue;
        String trim = str.trim();
        int length = trim.length();
        int i11 = length - 1;
        if (length == 0 || trim.equals("normal")) {
            return 0.0d;
        }
        if (trim.codePointAt(i11) == 37) {
            return (Double.valueOf(trim.substring(0, i11)).doubleValue() / 100.0d) * d11;
        }
        int i12 = length - 2;
        if (i12 > 0) {
            String substring = trim.substring(i12);
            substring.hashCode();
            char c11 = 65535;
            switch (substring.hashCode()) {
                case 3178:
                    if (substring.equals("cm")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (substring.equals("em")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3365:
                    if (substring.equals("in")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 3488:
                    if (substring.equals("mm")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 3571:
                    if (substring.equals("pc")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 3588:
                    if (substring.equals("pt")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 3592:
                    if (substring.equals("px")) {
                        c11 = 6;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    d13 = 35.43307d;
                    length = i12;
                    break;
                case 1:
                    length = i12;
                    break;
                case 2:
                    d13 = 90.0d;
                    length = i12;
                    break;
                case 3:
                    d13 = 3.543307d;
                    length = i12;
                    break;
                case 4:
                    d13 = 15.0d;
                    length = i12;
                    break;
                case 5:
                    d13 = 1.25d;
                    length = i12;
                    break;
                case 6:
                    length = i12;
                    d13 = 1.0d;
                    break;
                default:
                    d13 = 1.0d;
                    break;
            }
            doubleValue = Double.valueOf(trim.substring(0, length)).doubleValue() * d13;
        } else {
            doubleValue = Double.valueOf(trim).doubleValue();
        }
        return doubleValue * d12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(ReadableArray readableArray, float[] fArr, float f11) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f11;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f11;
        return 6;
    }
}