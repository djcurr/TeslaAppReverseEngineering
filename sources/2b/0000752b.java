package ic;

/* loaded from: classes.dex */
public class i0 extends cc.h<j0> {
    public i0(j0 j0Var) {
        super(j0Var);
    }

    public String A() {
        return u(0, 4);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            switch (i11) {
                case 264:
                    return v();
                case 265:
                    return x();
                case 266:
                    return y();
                case 267:
                    return w();
                case 268:
                    return z();
                default:
                    return super.f(i11);
            }
        }
        return A();
    }

    public String v() {
        return m(264, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    public String w() {
        Integer l11 = ((j0) this.f9060a).l(267);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 6 || intValue == 8) {
                    return "Edited (Portrait)";
                }
                return "Unknown (" + l11 + ")";
            }
            return "Edited (Landscape)";
        }
        return "Original";
    }

    public String x() {
        return m(265, "High Speed", "High Function", "Advanced High Speed", "Advanced High Function");
    }

    public String y() {
        Integer l11 = ((j0) this.f9060a).l(266);
        if (l11 == null) {
            return null;
        }
        if (l11.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb2 = new StringBuilder();
        int intValue = l11.intValue();
        if ((intValue & 1) != 0) {
            sb2.append("Noise Reduction, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb2.append("Noise Filter, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb2.append("Noise Filter (ISO Boost), ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    public String z() {
        Integer l11 = ((j0) this.f9060a).l(268);
        if (l11 == null) {
            return null;
        }
        if (l11.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb2 = new StringBuilder();
        int intValue = l11.intValue();
        if ((intValue & 1) != 0) {
            sb2.append("WB Color Temp, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb2.append("WB Gray Point, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb2.append("Saturation, ");
        }
        if (((intValue >> 3) & 1) != 0) {
            sb2.append("Contrast, ");
        }
        if (((intValue >> 4) & 1) != 0) {
            sb2.append("Sharpness, ");
        }
        if (((intValue >> 5) & 1) != 0) {
            sb2.append("Color Space, ");
        }
        if (((intValue >> 6) & 1) != 0) {
            sb2.append("High Function, ");
        }
        if (((intValue >> 7) & 1) != 0) {
            sb2.append("Noise Reduction, ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }
}