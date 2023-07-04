package ic;

/* loaded from: classes.dex */
public class k0 extends cc.h<l0> {
    public k0(l0 l0Var) {
        super(l0Var);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            if (i11 != 512) {
                if (i11 != 1537) {
                    if (i11 != 4096) {
                        return super.f(i11);
                    }
                    return w();
                }
                return x();
            }
            return v();
        }
        return u(0, 4);
    }

    public String v() {
        int[] k11 = ((l0) this.f9060a).k(512);
        if (k11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < k11.length; i11++) {
            sb2.append((int) ((short) k11[i11]));
            if (i11 < k11.length - 1) {
                sb2.append(" ");
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public String w() {
        Integer l11 = ((l0) this.f9060a).l(4096);
        if (l11 == null) {
            return null;
        }
        short shortValue = l11.shortValue();
        if (shortValue != 0) {
            if (shortValue != 20) {
                if (shortValue != 22) {
                    if (shortValue != 256) {
                        if (shortValue != 512) {
                            switch (shortValue) {
                                case 16:
                                    return "Shade";
                                case 17:
                                    return "Cloudy";
                                case 18:
                                    return "Fine Weather";
                                default:
                                    switch (shortValue) {
                                        case 33:
                                            return "Daylight Fluorescent";
                                        case 34:
                                            return "Day White Fluorescent";
                                        case 35:
                                            return "Cool White Fluorescent";
                                        case 36:
                                            return "White Fluorescent";
                                        default:
                                            return "Unknown (" + l11 + ")";
                                    }
                            }
                        }
                        return "Custom 1-4";
                    }
                    return "One Touch White Balance";
                }
                return "Evening Sunlight";
            }
            return "Tungsten (Incandescent)";
        }
        return "Unknown";
    }

    public String x() {
        int[] k11 = ((l0) this.f9060a).k(1537);
        if (k11 == null) {
            return null;
        }
        int length = k11.length / 2;
        bc.k[] kVarArr = new bc.k[length];
        for (int i11 = 0; i11 < k11.length / 2; i11++) {
            int i12 = i11 * 2;
            kVarArr[i11] = new bc.k((short) k11[i12], (short) k11[i12 + 1]);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < length; i13++) {
            sb2.append(kVarArr[i13].doubleValue());
            if (i13 < length - 1) {
                sb2.append(" ");
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }
}