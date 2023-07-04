package ic;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class g extends cc.h<h> {
    public g(h hVar) {
        super(hVar);
    }

    public String A() {
        return m(12311, "Off");
    }

    public String B() {
        return m(8244, "Off");
    }

    public String C() {
        Double h11 = ((h) this.f9060a).h(29);
        if (h11 == null) {
            return null;
        }
        return cc.h.i(h11.doubleValue() / 10.0d);
    }

    public String D() {
        return m(13, "Normal", "Macro");
    }

    public String E() {
        Integer l11 = ((h) this.f9060a).l(12291);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 1) {
            if (intValue != 6) {
                return "Unknown (" + l11 + ")";
            }
            return "Multi-Area Focus";
        }
        return "Fixation";
    }

    public String F() {
        Integer l11 = ((h) this.f9060a).l(9);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 36) {
                if (intValue != 4) {
                    if (intValue != 5) {
                        switch (intValue) {
                            case 20:
                                return "2288 x 1712 pixels";
                            case 21:
                                return "2592 x 1944 pixels";
                            case 22:
                                return "2304 x 1728 pixels";
                            default:
                                return "Unknown (" + l11 + ")";
                        }
                    }
                    return "2048 x 1536 pixels";
                }
                return "1600 x 1200 pixels";
            }
            return "3008 x 2008 pixels";
        }
        return "640 x 480 pixels";
    }

    public String G() {
        Integer l11 = ((h) this.f9060a).l(20);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 3) {
            if (intValue != 4) {
                if (intValue != 6) {
                    if (intValue != 9) {
                        return "Unknown (" + l11 + ")";
                    }
                    return "200";
                }
                return "100";
            }
            return "64";
        }
        return "50";
    }

    public String H() {
        Integer l11 = ((h) this.f9060a).l(8226);
        if (l11 == null) {
            return null;
        }
        return Integer.toString(l11.intValue()) + " mm";
    }

    public String I() {
        return l(12290, 3, "Fine");
    }

    public String J() {
        return l(8, 1, "Fine", "Super Fine");
    }

    public String K() {
        return l(12288, 2, "Normal");
    }

    public String L() {
        return m(31, "-1", "Normal", "+1");
    }

    public String M() {
        return l(12289, 1, "Off");
    }

    public String N() {
        return m(33, "-1", "Normal", "+1");
    }

    public String O() {
        int[] k11 = ((h) this.f9060a).k(2);
        if (k11 != null && k11.length == 2) {
            return k11[0] + " x " + k11[1] + " pixels";
        }
        return ((h) this.f9060a).r(2);
    }

    public String P() {
        return ((h) this.f9060a).r(4);
    }

    public String Q() {
        Integer l11 = ((h) this.f9060a).l(3);
        if (l11 == null) {
            return null;
        }
        return Integer.toString(l11.intValue()) + " bytes";
    }

    public String R() {
        return ((h) this.f9060a).r(12294);
    }

    public String S() {
        return m(25, "Auto", "Daylight", "Shade", "Tungsten", "Florescent", "Manual");
    }

    public String T() {
        Integer l11 = ((h) this.f9060a).l(8210);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 4 || intValue == 12) {
                    return "Flash";
                }
                return "Unknown (" + l11 + ")";
            }
            return "Auto";
        }
        return "Manual";
    }

    public String U() {
        return ((h) this.f9060a).r(8209);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 8) {
                        if (i11 != 9) {
                            if (i11 != 13) {
                                if (i11 != 20) {
                                    if (i11 != 25) {
                                        if (i11 != 29) {
                                            if (i11 != 8192) {
                                                if (i11 != 8226) {
                                                    if (i11 != 8244) {
                                                        if (i11 != 12294) {
                                                            if (i11 != 8209) {
                                                                if (i11 != 8210) {
                                                                    switch (i11) {
                                                                        case 31:
                                                                            return L();
                                                                        case 32:
                                                                            return y();
                                                                        case 33:
                                                                            return N();
                                                                        default:
                                                                            switch (i11) {
                                                                                case 12288:
                                                                                    return K();
                                                                                case 12289:
                                                                                    return M();
                                                                                case 12290:
                                                                                    return I();
                                                                                case 12291:
                                                                                    return E();
                                                                                default:
                                                                                    switch (i11) {
                                                                                        case 12308:
                                                                                            return w();
                                                                                        case 12309:
                                                                                            return x();
                                                                                        case 12310:
                                                                                            return z();
                                                                                        case 12311:
                                                                                            return A();
                                                                                        default:
                                                                                            return super.f(i11);
                                                                                    }
                                                                            }
                                                                    }
                                                                }
                                                                return T();
                                                            }
                                                            return U();
                                                        }
                                                        return R();
                                                    }
                                                    return B();
                                                }
                                                return H();
                                            }
                                            return v();
                                        }
                                        return C();
                                    }
                                    return S();
                                }
                                return G();
                            }
                            return D();
                        }
                        return F();
                    }
                    return J();
                }
                return P();
            }
            return Q();
        }
        return O();
    }

    public String v() {
        byte[] e11 = ((h) this.f9060a).e(PKIFailureInfo.certRevoked);
        if (e11 == null) {
            return null;
        }
        return "<" + e11.length + " bytes of image data>";
    }

    public String w() {
        return m(12308, "Off", "On");
    }

    public String x() {
        return m(12309, "Off");
    }

    public String y() {
        return m(32, "-1", "Normal", "+1");
    }

    public String z() {
        return m(12310, "Off");
    }
}