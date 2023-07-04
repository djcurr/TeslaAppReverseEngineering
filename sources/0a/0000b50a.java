package tc;

/* loaded from: classes.dex */
public class q extends rc.b {
    public q(r rVar) {
        super(rVar);
    }

    private String A() {
        Integer l11 = ((rc.d) this.f9060a).l(11);
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

    private String B(int i11) {
        String r11 = ((rc.d) this.f9060a).r(i11);
        if (r11 == null) {
            return null;
        }
        return r11 + " pixels";
    }

    private String y(int i11) {
        Integer l11 = ((rc.d) this.f9060a).l(i11);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue == -1) {
            return ((rc.d) this.f9060a).l(9).intValue() < 16 ? "Default" : "None";
        } else if (intValue != 0) {
            return "Unknown (" + l11 + ")";
        } else {
            return "Color table within file";
        }
    }

    private String z(int i11) {
        Integer l11 = ((rc.d) this.f9060a).l(i11);
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

    @Override // rc.b, cc.h
    public String f(int i11) {
        if (i11 == 4 || i11 == 5) {
            return B(i11);
        }
        if (i11 != 9) {
            if (i11 != 11) {
                if (i11 != 13) {
                    return super.f(i11);
                }
                return y(i11);
            }
            return A();
        }
        return z(i11);
    }
}