package ic;

/* loaded from: classes.dex */
public class a0 extends cc.h<b0> {
    public a0(b0 b0Var) {
        super(b0Var);
    }

    public String A() {
        bc.k p11 = ((b0) this.f9060a).p(773);
        if (p11 == null || p11.e() == 4294967295L || p11.e() == 0) {
            return "inf";
        }
        return (p11.e() / 1000.0d) + " m";
    }

    public String B() {
        return u(0, 4);
    }

    public String C() {
        byte[] e11 = ((b0) this.f9060a).e(5632);
        if (e11 == null) {
            return null;
        }
        if ((e11[0] | e11[1] | e11[2] | e11[3]) == 0) {
            return "Off";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("On, ");
        sb2.append((e11[43] & 1) > 0 ? "Mode 1" : "Mode 2");
        return sb2.toString();
    }

    public String D() {
        return m(4618, "Off", "On");
    }

    public String E() {
        int[] k11 = ((b0) this.f9060a).k(4617);
        if (k11 == null) {
            return null;
        }
        if (((short) k11[0]) == 0) {
            return "Off";
        }
        if (((short) k11[1]) == 1) {
            return "Full";
        }
        return "On (1/" + ((int) ((short) k11[1])) + " strength)";
    }

    public String F() {
        return ((b0) this.f9060a).r(5376);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            if (i11 != 521) {
                if (i11 != 773) {
                    if (i11 != 776) {
                        if (i11 != 4609) {
                            if (i11 != 5376) {
                                if (i11 != 5632) {
                                    if (i11 != 4612) {
                                        if (i11 != 4613) {
                                            if (i11 != 4617) {
                                                if (i11 != 4618) {
                                                    return super.f(i11);
                                                }
                                                return D();
                                            }
                                            return E();
                                        }
                                        return z();
                                    }
                                    return x();
                                }
                                return C();
                            }
                            return F();
                        }
                        return y();
                    }
                    return v();
                }
                return A();
            }
            return w();
        }
        return B();
    }

    public String v() {
        Integer l11 = ((b0) this.f9060a).l(776);
        if (l11 == null) {
            return null;
        }
        return l11.toString();
    }

    public String w() {
        return m(521, "Off", "On");
    }

    public String x() {
        return m(4612, "Bounce or Off", "Direct");
    }

    public String y() {
        int[] k11 = ((b0) this.f9060a).k(4609);
        if (k11 == null || k11.length < 2) {
            return null;
        }
        String format = String.format("%d %d", Short.valueOf((short) k11[0]), Short.valueOf((short) k11[1]));
        if (format.equals("0 0")) {
            return "Off";
        }
        if (format.equals("1 0")) {
            return "On";
        }
        return "Unknown (" + format + ")";
    }

    public String z() {
        int[] k11 = ((b0) this.f9060a).k(4613);
        if (k11 == null) {
            Integer l11 = ((b0) this.f9060a).l(4613);
            if (l11 == null) {
                return null;
            }
            k11 = new int[]{l11.intValue()};
        }
        if (k11.length == 0) {
            return null;
        }
        String format = String.format("%d", Short.valueOf((short) k11[0]));
        if (k11.length > 1) {
            format = format + " " + String.format("%d", Short.valueOf((short) k11[1]));
        }
        if (format.equals("0")) {
            return "Off";
        }
        if (format.equals("1")) {
            return "On";
        }
        if (format.equals("0 0")) {
            return "Off";
        }
        if (format.equals("1 0")) {
            return "On";
        }
        return "Unknown (" + format + ")";
    }
}