package ic;

/* loaded from: classes.dex */
public class k extends cc.h<l> {
    public k(l lVar) {
        super(lVar);
    }

    public String A() {
        return l(9, 1, "Fine", "Normal");
    }

    public String B() {
        return m(107, "Normal");
    }

    public String C() {
        Integer l11 = ((l) this.f9060a).l(27);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 8) {
                if (intValue != 32) {
                    return "Unknown (" + l11 + ")";
                }
                return "Manual";
            }
            return "Aperture Priority";
        }
        return "Auto";
    }

    public String D() {
        return m(64, "Auto", "Flash", "Tungsten", "Daylight");
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 9) {
            if (i11 != 10) {
                if (i11 != 27) {
                    if (i11 != 56) {
                        if (i11 != 64) {
                            if (i11 != 102) {
                                if (i11 != 107) {
                                    if (i11 != 92) {
                                        if (i11 != 93) {
                                            return super.f(i11);
                                        }
                                        return x();
                                    }
                                    return y();
                                }
                                return B();
                            }
                            return w();
                        }
                        return D();
                    }
                    return z();
                }
                return C();
            }
            return v();
        }
        return A();
    }

    public String v() {
        return m(10, "Off", "On");
    }

    public String w() {
        Integer l11 = ((l) this.f9060a).l(102);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue != 32) {
                            if (intValue != 64) {
                                if (intValue != 256) {
                                    if (intValue != 512) {
                                        if (intValue != 8192) {
                                            if (intValue != 16384) {
                                                return "Unknown (" + l11 + ")";
                                            }
                                            return "Sepia";
                                        }
                                        return "B&W";
                                    }
                                    return "Neutral Color";
                                }
                                return "Saturated Color";
                            }
                            return "Neutral Color";
                        }
                        return "Saturated Color";
                    }
                    return "B&W Red Filter";
                }
                return "B&W Yellow Filter";
            }
            return "Sepia";
        }
        return "B&W";
    }

    public String x() {
        return m(93, "No", "Yes");
    }

    public String y() {
        Integer l11 = ((l) this.f9060a).l(92);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 16) {
                            if (intValue != 32) {
                                if (intValue != 64) {
                                    return "Unknown (" + l11 + ")";
                                }
                                return "Red Eye";
                            }
                            return "Off";
                        }
                        return "Fill Flash";
                    }
                    return "Red Eye";
                }
                return "Off";
            }
            return "Fill Flash";
        }
        return "Auto";
    }

    public String z() {
        return m(56, "Normal", null, "Macro");
    }
}