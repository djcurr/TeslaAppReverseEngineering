package ic;

/* loaded from: classes.dex */
public class s extends cc.h<t> {
    public s(t tVar) {
        super(tVar);
    }

    public String A() {
        return m(5, "Normal", "Bright +", "Bright -", "Contrast +", "Contrast -");
    }

    public String B() {
        return l(3, 1, "VGA Basic", "VGA Normal", "VGA Fine", "SXGA Basic", "SXGA Normal", "SXGA Fine");
    }

    public String C() {
        return m(7, "Auto", "Preset", "Daylight", "Incandescence", "Florescence", "Cloudy", "SpeedLight");
    }

    @Override // cc.h
    public String f(int i11) {
        switch (i11) {
            case 3:
                return B();
            case 4:
                return w();
            case 5:
                return A();
            case 6:
                return v();
            case 7:
                return C();
            case 8:
                return z();
            case 9:
            default:
                return super.f(i11);
            case 10:
                return y();
            case 11:
                return x();
        }
    }

    public String v() {
        return m(6, "ISO80", null, "ISO160", null, "ISO320", "ISO100");
    }

    public String w() {
        return l(4, 1, "Color", "Monochrome");
    }

    public String x() {
        return m(11, "None", "Fisheye converter");
    }

    public String y() {
        bc.k p11 = ((t) this.f9060a).p(10);
        if (p11 == null) {
            return null;
        }
        if (p11.e() == 0) {
            return "No digital zoom";
        }
        return p11.k(true) + "x digital zoom";
    }

    public String z() {
        bc.k p11 = ((t) this.f9060a).p(8);
        if (p11 == null) {
            return null;
        }
        return (p11.e() == 1 && p11.d() == 0) ? "Infinite" : p11.k(true);
    }
}