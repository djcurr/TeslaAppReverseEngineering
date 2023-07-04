package xc;

/* loaded from: classes.dex */
public class n extends cc.h<o> {
    public n(o oVar) {
        super(oVar);
    }

    private String v() {
        Integer l11 = ((o) this.f9060a).l(113);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue == -1) {
            Integer l12 = ((o) this.f9060a).l(109);
            return (l12 != null && l12.intValue() < 16) ? "Default" : "None";
        } else if (intValue != 0) {
            return "Unknown (" + l11 + ")";
        } else {
            return "Color table within file";
        }
    }

    private String w() {
        Integer l11 = ((o) this.f9060a).l(109);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 34 && intValue != 36 && intValue != 40) {
            return "Unknown (" + l11 + ")";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l11.intValue() - 32);
        sb2.append("-bit grayscale");
        return sb2.toString();
    }

    private String x() {
        Integer l11 = ((o) this.f9060a).l(111);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 32) {
                if (intValue != 36) {
                    if (intValue != 64) {
                        switch (intValue) {
                            case 256:
                                return "Straight alpha";
                            case 257:
                                return "Premul white alpha";
                            case 258:
                                return "Premul black alpha";
                            case 259:
                                return "Composition (dither copy)";
                            case 260:
                                return "Straight alpha blend";
                            default:
                                return "Unknown (" + l11 + ")";
                        }
                    }
                    return "Dither copy";
                }
                return "Transparent";
            }
            return "Blend";
        }
        return "Copy";
    }

    private String y(int i11) {
        String r11 = ((o) this.f9060a).r(i11);
        if (r11 == null) {
            return null;
        }
        return r11 + " pixels";
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 == 104 || i11 == 105) {
            return y(i11);
        }
        if (i11 != 109) {
            if (i11 != 111) {
                if (i11 != 113) {
                    return super.f(i11);
                }
                return v();
            }
            return x();
        }
        return w();
    }
}