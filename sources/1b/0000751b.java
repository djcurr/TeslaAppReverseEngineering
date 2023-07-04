package ic;

/* loaded from: classes.dex */
public class c0 extends cc.h<d0> {
    public c0(d0 d0Var) {
        super(d0Var);
    }

    public String A() {
        return m(6401, "Vertical", "Horizontal");
    }

    public String B() {
        int[] k11 = ((d0) this.f9060a).k(4124);
        if (k11 == null) {
            Integer l11 = ((d0) this.f9060a).l(4124);
            if (l11 == null) {
                return null;
            }
            k11 = new int[]{l11.intValue()};
        }
        if (k11.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        short s11 = (short) k11[0];
        if (s11 == 0) {
            sb2.append("Off");
        } else if (s11 == 2) {
            sb2.append("On (2 frames)");
        } else if (s11 != 3) {
            sb2.append("Unknown (");
            sb2.append((int) ((short) k11[0]));
            sb2.append(")");
        } else {
            sb2.append("On (3 frames)");
        }
        if (k11.length > 1) {
            sb2.append("; ");
            sb2.append((int) ((short) k11[1]));
        }
        return sb2.toString();
    }

    public String C() {
        Integer l11 = ((d0) this.f9060a).l(4112);
        if (l11 == null) {
            return null;
        }
        if (l11.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb2 = new StringBuilder();
        short shortValue = l11.shortValue();
        if ((shortValue & 1) != 0) {
            sb2.append("Noise Reduction, ");
        }
        if (((shortValue >> 1) & 1) != 0) {
            sb2.append("Noise Filter, ");
        }
        if (((shortValue >> 2) & 1) != 0) {
            sb2.append("Noise Filter (ISO Boost), ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    public String D() {
        return m(4114, "Off", "On");
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            if (i11 != 512) {
                if (i11 != 4124) {
                    if (i11 != 4370) {
                        if (i11 != 6400) {
                            if (i11 != 6401) {
                                switch (i11) {
                                    case 4112:
                                        return C();
                                    case 4113:
                                        return x();
                                    case 4114:
                                        return D();
                                    default:
                                        return super.f(i11);
                                }
                            }
                            return A();
                        }
                        return z();
                    }
                    return v();
                }
                return B();
            }
            return w();
        }
        return y();
    }

    public String v() {
        byte[] e11 = ((d0) this.f9060a).e(4370);
        if (e11 == null || e11.length < 2) {
            return null;
        }
        String format = String.format("%d %d", Byte.valueOf(e11[0]), Byte.valueOf(e11[1]));
        if (format.equals("1 1")) {
            return "4:3";
        }
        if (format.equals("1 4")) {
            return "1:1";
        }
        if (format.equals("2 1")) {
            return "3:2 (RAW)";
        }
        if (format.equals("2 2")) {
            return "3:2";
        }
        if (format.equals("3 1")) {
            return "16:9 (RAW)";
        }
        if (format.equals("3 3")) {
            return "16:9";
        }
        if (format.equals("4 1")) {
            return "1:1 (RAW)";
        }
        if (format.equals("4 4")) {
            return "6:6";
        }
        if (format.equals("5 5")) {
            return "5:4";
        }
        if (format.equals("6 6")) {
            return "7:6";
        }
        if (format.equals("7 7")) {
            return "6:5";
        }
        if (format.equals("8 8")) {
            return "7:5";
        }
        if (format.equals("9 1")) {
            return "3:4 (RAW)";
        }
        if (format.equals("9 9")) {
            return "3:4";
        }
        return "Unknown (" + format + ")";
    }

    public String w() {
        int[] k11 = ((d0) this.f9060a).k(512);
        if (k11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < k11.length; i11++) {
            if (i11 != 0) {
                sb2.append(" ");
            }
            sb2.append((int) ((short) k11[i11]));
        }
        return sb2.toString();
    }

    public String x() {
        return m(4113, "Off", "On");
    }

    public String y() {
        return u(0, 4);
    }

    public String z() {
        byte[] e11 = ((d0) this.f9060a).e(6400);
        if (e11 == null || e11.length < 2) {
            return null;
        }
        String format = String.format("%d %d", Byte.valueOf(e11[0]), Byte.valueOf(e11[1]));
        if (format.equals("0 0")) {
            return "Off";
        }
        if (format.equals("0 1")) {
            return "On";
        }
        return "Unknown (" + format + ")";
    }
}