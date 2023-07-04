package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class SVGLength {

    /* renamed from: a  reason: collision with root package name */
    final double f17527a;

    /* renamed from: b  reason: collision with root package name */
    final UnitType f17528b;

    /* loaded from: classes2.dex */
    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17529a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f17529a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17529a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17529a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f17527a = 0.0d;
        this.f17528b = UnitType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArrayList<SVGLength> a(Dynamic dynamic) {
        int i11 = a.f17529a[dynamic.getType().ordinal()];
        if (i11 == 1) {
            ArrayList<SVGLength> arrayList = new ArrayList<>(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        } else if (i11 == 2) {
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(1);
            arrayList2.add(new SVGLength(dynamic.asString()));
            return arrayList2;
        } else if (i11 != 3) {
            return null;
        } else {
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            ArrayList<SVGLength> arrayList3 = new ArrayList<>(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(b(asArray.getDynamic(i12)));
            }
            return arrayList3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SVGLength b(Dynamic dynamic) {
        int i11 = a.f17529a[dynamic.getType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return new SVGLength();
            }
            return new SVGLength(dynamic.asString());
        }
        return new SVGLength(dynamic.asDouble());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Dynamic dynamic) {
        int i11 = a.f17529a[dynamic.getType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            return dynamic.asString();
        }
        return String.valueOf(dynamic.asDouble());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGLength(double d11) {
        this.f17527a = d11;
        this.f17528b = UnitType.NUMBER;
    }

    private SVGLength(String str) {
        String trim = str.trim();
        int length = trim.length();
        int i11 = length - 1;
        if (length != 0 && !trim.equals("normal")) {
            if (trim.codePointAt(i11) == 37) {
                this.f17528b = UnitType.PERCENTAGE;
                this.f17527a = Double.valueOf(trim.substring(0, i11)).doubleValue();
                return;
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
                    case 3251:
                        if (substring.equals("ex")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 3365:
                        if (substring.equals("in")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 3488:
                        if (substring.equals("mm")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 3571:
                        if (substring.equals("pc")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 3588:
                        if (substring.equals("pt")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 3592:
                        if (substring.equals("px")) {
                            c11 = 7;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        this.f17528b = UnitType.CM;
                        length = i12;
                        break;
                    case 1:
                        this.f17528b = UnitType.EMS;
                        length = i12;
                        break;
                    case 2:
                        this.f17528b = UnitType.EXS;
                        length = i12;
                        break;
                    case 3:
                        this.f17528b = UnitType.IN;
                        length = i12;
                        break;
                    case 4:
                        this.f17528b = UnitType.MM;
                        length = i12;
                        break;
                    case 5:
                        this.f17528b = UnitType.PC;
                        length = i12;
                        break;
                    case 6:
                        this.f17528b = UnitType.PT;
                        length = i12;
                        break;
                    case 7:
                        this.f17528b = UnitType.NUMBER;
                        length = i12;
                        break;
                    default:
                        this.f17528b = UnitType.NUMBER;
                        break;
                }
                this.f17527a = Double.valueOf(trim.substring(0, length)).doubleValue();
                return;
            }
            this.f17528b = UnitType.NUMBER;
            this.f17527a = Double.valueOf(trim).doubleValue();
            return;
        }
        this.f17528b = UnitType.UNKNOWN;
        this.f17527a = 0.0d;
    }
}