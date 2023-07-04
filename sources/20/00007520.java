package ic;

/* loaded from: classes.dex */
public class e extends cc.h<f> {
    public e(f fVar) {
        super(fVar);
    }

    public String A() {
        return l(3, 2, "Macro", "Auto focus", "Manual focus", "Infinity");
    }

    public String B() {
        Integer l11 = ((f) this.f9060a).l(6);
        if (l11 == null) {
            return null;
        }
        return cc.h.i(l11.intValue());
    }

    public String C() {
        return l(2, 1, "Economy", "Normal", "Fine");
    }

    public String D() {
        return l(1, 1, "Single shutter", "Panorama", "Night scene", "Portrait", "Landscape");
    }

    public String E() {
        return m(13, "Normal", "Low", "High");
    }

    public String F() {
        return m(11, "Normal", "Soft", "Hard");
    }

    public String G() {
        Integer l11 = ((f) this.f9060a).l(7);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue != 5) {
                            if (intValue != 129) {
                                return "Unknown (" + l11 + ")";
                            }
                            return "Manual";
                        }
                        return "Shade";
                    }
                    return "Florescent";
                }
                return "Daylight";
            }
            return "Tungsten";
        }
        return "Auto";
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 20) {
            switch (i11) {
                case 1:
                    return D();
                case 2:
                    return C();
                case 3:
                    return A();
                case 4:
                    return z();
                case 5:
                    return y();
                case 6:
                    return B();
                case 7:
                    return G();
                default:
                    switch (i11) {
                        case 10:
                            return x();
                        case 11:
                            return F();
                        case 12:
                            return w();
                        case 13:
                            return E();
                        default:
                            return super.f(i11);
                    }
            }
        }
        return v();
    }

    public String v() {
        Integer l11 = ((f) this.f9060a).l(20);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 64) {
            if (intValue != 80) {
                if (intValue != 100) {
                    if (intValue != 125) {
                        if (intValue != 244) {
                            if (intValue != 250) {
                                return "Unknown (" + l11 + ")";
                            }
                            return "+2.0";
                        }
                        return "+3.0";
                    }
                    return "+1.0";
                }
                return "High";
            }
            return "Normal (ISO 80 equivalent)";
        }
        return "Normal";
    }

    public String w() {
        return m(12, "Normal", "Low", "High");
    }

    public String x() {
        Integer l11 = ((f) this.f9060a).l(10);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 65536) {
            if (intValue == 65537 || intValue == 131072) {
                return "2x digital zoom";
            }
            if (intValue != 262144) {
                return "Unknown (" + l11 + ")";
            }
            return "4x digital zoom";
        }
        return "No digital zoom";
    }

    public String y() {
        Integer l11 = ((f) this.f9060a).l(5);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 11) {
            if (intValue != 13) {
                if (intValue != 15) {
                    return "Unknown (" + l11 + ")";
                }
                return "Strong";
            }
            return "Normal";
        }
        return "Weak";
    }

    public String z() {
        return l(4, 1, "Auto", "On", "Off", "Red eye reduction");
    }
}