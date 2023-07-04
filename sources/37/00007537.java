package ic;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class o0 extends cc.h<p0> {
    public o0(p0 p0Var) {
        super(p0Var);
    }

    public String A() {
        return l(3, 2, "Custom", "Auto");
    }

    public String B() {
        Integer l11 = ((p0) this.f9060a).l(20);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 10) {
            if (intValue != 16) {
                if (intValue != 100) {
                    if (intValue != 200) {
                        return "Unknown (" + l11 + ")";
                    }
                    return "ISO 200";
                }
                return "ISO 100";
            }
            return "ISO 200";
        }
        return "ISO 100";
    }

    public String C() {
        return m(2, "Good", "Better", "Best");
    }

    public String D() {
        return m(13, "Normal", "Low", "High");
    }

    public String E() {
        return m(11, "Normal", "Soft", "Hard");
    }

    public String F() {
        return m(7, "Auto", "Daylight", "Shade", "Tungsten", "Fluorescent", "Manual");
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 7) {
                            if (i11 != 20) {
                                if (i11 != 23) {
                                    switch (i11) {
                                        case 10:
                                            return y();
                                        case 11:
                                            return E();
                                        case 12:
                                            return x();
                                        case 13:
                                            return D();
                                        default:
                                            return super.f(i11);
                                    }
                                }
                                return w();
                            }
                            return B();
                        }
                        return F();
                    }
                    return z();
                }
                return A();
            }
            return C();
        }
        return v();
    }

    public String v() {
        return m(1, "Auto", "Night-scene", "Manual", null, "Multiple");
    }

    public String w() {
        return l(23, 1, "Normal", "Black & White", "Sepia");
    }

    public String x() {
        return m(12, "Normal", "Low", "High");
    }

    public String y() {
        Float i11 = ((p0) this.f9060a).i(10);
        if (i11 == null) {
            return null;
        }
        return i11.floatValue() == BitmapDescriptorFactory.HUE_RED ? "Off" : Float.toString(i11.floatValue());
    }

    public String z() {
        return l(4, 1, "Auto", "Flash On", null, "Flash Off", null, "Red-eye Reduction");
    }
}