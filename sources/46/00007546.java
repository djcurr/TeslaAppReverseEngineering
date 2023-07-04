package ic;

import ch.qos.logback.core.net.SyslogConstants;
import java.text.DecimalFormat;
import java.util.HashMap;

/* loaded from: classes.dex */
public class w extends cc.h<x> {

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<Integer, String> f30346b;

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<Integer, String> f30347c;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30346b = hashMap;
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        f30347c = hashMap2;
        hashMap2.put(0, "Off");
        hashMap2.put(1, "Soft Focus");
        hashMap2.put(2, "Pop Art");
        hashMap2.put(3, "Pale & Light Color");
        hashMap2.put(4, "Light Tone");
        hashMap2.put(5, "Pin Hole");
        hashMap2.put(6, "Grainy Film");
        hashMap2.put(9, "Diorama");
        hashMap2.put(10, "Cross Process");
        hashMap2.put(12, "Fish Eye");
        hashMap2.put(13, "Drawing");
        hashMap2.put(14, "Gentle Sepia");
        hashMap2.put(15, "Pale & Light Color II");
        hashMap2.put(16, "Pop Art II");
        hashMap2.put(17, "Pin Hole II");
        hashMap2.put(18, "Pin Hole III");
        hashMap2.put(19, "Grainy Film II");
        hashMap2.put(20, "Dramatic Tone");
        hashMap2.put(21, "Punk");
        hashMap2.put(22, "Soft Focus 2");
        hashMap2.put(23, "Sparkle");
        hashMap2.put(24, "Watercolor");
        hashMap2.put(25, "Key Line");
        hashMap2.put(26, "Key Line II");
        hashMap2.put(27, "Miniature");
        hashMap2.put(28, "Reflection");
        hashMap2.put(29, "Fragmented");
        hashMap2.put(31, "Cross Process II");
        hashMap2.put(32, "Dramatic Tone II");
        hashMap2.put(33, "Watercolor I");
        hashMap2.put(34, "Watercolor II");
        hashMap2.put(35, "Diorama II");
        hashMap2.put(36, "Vintage");
        hashMap2.put(37, "Vintage II");
        hashMap2.put(38, "Vintage III");
        hashMap2.put(39, "Partial Color");
        hashMap2.put(40, "Partial Color II");
        hashMap2.put(41, "Partial Color III");
        hashMap.put(0, "0");
        hashMap.put(-31999, "Highlights ");
        hashMap.put(-31998, "Shadows ");
        hashMap.put(-31997, "Midtones ");
    }

    public w(x xVar) {
        super(xVar);
    }

    private String N(int i11) {
        int[] k11 = ((x) this.f9060a).k(i11);
        if (k11 == null || k11.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < k11.length; i12++) {
            if (i12 == 0) {
                HashMap<Integer, String> hashMap = f30347c;
                sb2.append(hashMap.containsKey(Integer.valueOf(k11[i12])) ? hashMap.get(Integer.valueOf(k11[i12])) : "[unknown]");
            } else {
                sb2.append(k11[i12]);
            }
            sb2.append("; ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    private String x0(int i11) {
        int[] k11 = ((x) this.f9060a).k(i11);
        if (k11 == null || k11.length < 3) {
            return null;
        }
        return String.format("%d (min %d, max %d)", Integer.valueOf(k11[0]), Integer.valueOf(k11[1]), Integer.valueOf(k11[2]));
    }

    public String A() {
        return N(1321);
    }

    public String B() {
        int[] k11 = ((x) this.f9060a).k(1327);
        if (k11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < k11.length; i11++) {
            if (i11 == 0) {
                HashMap<Integer, String> hashMap = f30347c;
                sb2.append(hashMap.containsKey(Integer.valueOf(k11[i11])) ? hashMap.get(Integer.valueOf(k11[i11])) : "[unknown]");
                sb2.append("; ");
            } else if (i11 == 3) {
                sb2.append("Partial Color ");
                sb2.append(k11[i11]);
                sb2.append("; ");
            } else if (i11 == 4) {
                switch (k11[i11]) {
                    case 0:
                        sb2.append("No Effect");
                        break;
                    case 32784:
                        sb2.append("Star Light");
                        break;
                    case 32800:
                        sb2.append("Pin Hole");
                        break;
                    case 32816:
                        sb2.append("Frame");
                        break;
                    case 32832:
                        sb2.append("Soft Focus");
                        break;
                    case 32848:
                        sb2.append("White Edge");
                        break;
                    case 32864:
                        sb2.append("B&W");
                        break;
                    default:
                        sb2.append("Unknown (");
                        sb2.append(k11[i11]);
                        sb2.append(")");
                        break;
                }
                sb2.append("; ");
            } else if (i11 == 6) {
                int i12 = k11[i11];
                if (i12 == 0) {
                    sb2.append("No Color Filter");
                } else if (i12 == 1) {
                    sb2.append("Yellow Color Filter");
                } else if (i12 == 2) {
                    sb2.append("Orange Color Filter");
                } else if (i12 == 3) {
                    sb2.append("Red Color Filter");
                } else if (i12 != 4) {
                    sb2.append("Unknown (");
                    sb2.append(k11[i11]);
                    sb2.append(")");
                } else {
                    sb2.append("Green Color Filter");
                }
                sb2.append("; ");
            } else {
                sb2.append(k11[i11]);
                sb2.append("; ");
            }
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    public String C() {
        return u(0, 4);
    }

    public String D() {
        int[] k11 = ((x) this.f9060a).k(1330);
        if (k11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < k11.length; i11++) {
            if (i11 == 0) {
                sb2.append("Color ");
                sb2.append(k11[i11]);
                sb2.append("; ");
            } else if (i11 == 3) {
                sb2.append("Strength ");
                sb2.append(k11[i11]);
                sb2.append("; ");
            } else {
                sb2.append(k11[i11]);
                sb2.append("; ");
            }
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    public String E() {
        return m(1287, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    public String F() {
        return x0(1285);
    }

    public String G() {
        return x0(1283);
    }

    public String H() {
        Object o11 = ((x) this.f9060a).o(2312);
        if (o11 == null) {
            return null;
        }
        return o11.toString();
    }

    public String I() {
        return m(1291, "Off", "On");
    }

    public String J() {
        int[] k11 = ((x) this.f9060a).k(1536);
        if (k11 == null) {
            return null;
        }
        if (k11.length == 0 || k11[0] == 0) {
            return "Single Shot";
        }
        StringBuilder sb2 = new StringBuilder();
        if (k11[0] == 5 && k11.length >= 3) {
            int i11 = k11[2];
            if ((i11 & 1) > 0) {
                sb2.append("AE");
            }
            if (((i11 >> 1) & 1) > 0) {
                sb2.append("WB");
            }
            if (((i11 >> 2) & 1) > 0) {
                sb2.append("FL");
            }
            if (((i11 >> 3) & 1) > 0) {
                sb2.append("MF");
            }
            if (((i11 >> 6) & 1) > 0) {
                sb2.append("Focus");
            }
            sb2.append(" Bracketing");
        } else {
            int i12 = k11[0];
            if (i12 == 1) {
                sb2.append("Continuous Shooting");
            } else if (i12 == 2) {
                sb2.append("Exposure Bracketing");
            } else if (i12 == 3) {
                sb2.append("White Balance Bracketing");
            } else if (i12 != 4) {
                sb2.append("Unknown (");
                sb2.append(k11[0]);
                sb2.append(")");
            } else {
                sb2.append("Exposure+WB Bracketing");
            }
        }
        sb2.append(", Shot ");
        sb2.append(k11[1]);
        return sb2.toString();
    }

    public String K() {
        return l(512, 1, "Manual", "Program", "Aperture-priority AE", "Shutter speed priority", "Program-shift");
    }

    public String L() {
        return q(515);
    }

    public String M() {
        return m(2306, "Off", "On");
    }

    public String O() {
        int[] k11 = ((x) this.f9060a).k(1028);
        if (k11 == null || k11.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = k11[0];
        if (i11 == 0) {
            sb2.append("Off");
        } else if (i11 == 3) {
            sb2.append("TTL");
        } else if (i11 == 4) {
            sb2.append("Auto");
        } else if (i11 != 5) {
            sb2.append("Unknown (");
            sb2.append(k11[0]);
            sb2.append(")");
        } else {
            sb2.append("Manual");
        }
        for (int i12 = 1; i12 < k11.length; i12++) {
            sb2.append("; ");
            sb2.append(k11[i12]);
        }
        return sb2.toString();
    }

    public String P() {
        bc.k[] q11 = ((x) this.f9060a).q(1029);
        if (q11 == null || q11.length == 0) {
            return null;
        }
        if (q11.length == 3) {
            if (q11[0].d() == 0 && q11[1].d() == 0 && q11[2].d() == 0) {
                return "n/a";
            }
        } else if (q11.length == 4 && q11[0].d() == 0 && q11[1].d() == 0 && q11[2].d() == 0 && q11[3].d() == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb2 = new StringBuilder();
        for (bc.k kVar : q11) {
            sb2.append(kVar);
            sb2.append(", ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    public String Q() {
        Integer l11 = ((x) this.f9060a).l(1024);
        if (l11 == null) {
            return null;
        }
        if (l11.intValue() == 0) {
            return "Off";
        }
        StringBuilder sb2 = new StringBuilder();
        int intValue = l11.intValue();
        if ((intValue & 1) != 0) {
            sb2.append("On, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb2.append("Fill-in, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb2.append("Red-eye, ");
        }
        if (((intValue >> 3) & 1) != 0) {
            sb2.append("Slow-sync, ");
        }
        if (((intValue >> 4) & 1) != 0) {
            sb2.append("Forced On, ");
        }
        if (((intValue >> 5) & 1) != 0) {
            sb2.append("2nd Curtain, ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    public String R() {
        Integer l11 = ((x) this.f9060a).l(1027);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            switch (intValue) {
                                case 9:
                                    return "Channel 1, Mid";
                                case 10:
                                    return "Channel 2, Mid";
                                case 11:
                                    return "Channel 3, Mid";
                                case 12:
                                    return "Channel 4, Mid";
                                default:
                                    switch (intValue) {
                                        case 17:
                                            return "Channel 1, High";
                                        case 18:
                                            return "Channel 2, High";
                                        case 19:
                                            return "Channel 3, High";
                                        case 20:
                                            return "Channel 4, High";
                                        default:
                                            return "Unknown (" + l11 + ")";
                                    }
                            }
                        }
                        return "Channel 4, Low";
                    }
                    return "Channel 3, Low";
                }
                return "Channel 2, Low";
            }
            return "Channel 1, Low";
        }
        return "Off";
    }

    public String S() {
        int[] k11 = ((x) this.f9060a).k(769);
        if (k11 == null) {
            Integer l11 = ((x) this.f9060a).l(769);
            if (l11 == null) {
                return null;
            }
            k11 = new int[]{l11.intValue()};
        }
        if (k11.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = k11[0];
        if (i11 == 0) {
            sb2.append("Single AF");
        } else if (i11 == 1) {
            sb2.append("Sequential shooting AF");
        } else if (i11 == 2) {
            sb2.append("Continuous AF");
        } else if (i11 == 3) {
            sb2.append("Multi AF");
        } else if (i11 == 4) {
            sb2.append("Face detect");
        } else if (i11 != 10) {
            sb2.append("Unknown (" + k11[0] + ")");
        } else {
            sb2.append("MF");
        }
        if (k11.length > 1) {
            sb2.append("; ");
            int i12 = k11[1];
            if (i12 == 0) {
                sb2.append("(none)");
            } else {
                if ((i12 & 1) > 0) {
                    sb2.append("S-AF, ");
                }
                if (((i12 >> 2) & 1) > 0) {
                    sb2.append("C-AF, ");
                }
                if (((i12 >> 4) & 1) > 0) {
                    sb2.append("MF, ");
                }
                if (((i12 >> 5) & 1) > 0) {
                    sb2.append("Face detect, ");
                }
                if (((i12 >> 6) & 1) > 0) {
                    sb2.append("Imager AF, ");
                }
                if (((i12 >> 7) & 1) > 0) {
                    sb2.append("Live View Magnification Frame, ");
                }
                if (((i12 >> 8) & 1) > 0) {
                    sb2.append("AF sensor, ");
                }
                sb2.setLength(sb2.length() - 2);
            }
        }
        return sb2.toString();
    }

    public String T() {
        int[] k11 = ((x) this.f9060a).k(770);
        if (k11 == null) {
            Integer l11 = ((x) this.f9060a).l(770);
            if (l11 == null) {
                return null;
            }
            k11 = new int[]{l11.intValue()};
        }
        if (k11.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = k11[0];
        if (i11 == 0) {
            sb2.append("AF not used");
        } else if (i11 != 1) {
            sb2.append("Unknown (" + k11[0] + ")");
        } else {
            sb2.append("AF used");
        }
        if (k11.length > 1) {
            sb2.append("; " + k11[1]);
        }
        return sb2.toString();
    }

    public String U() {
        String str;
        int[] k11 = ((x) this.f9060a).k(1295);
        if (k11 == null || k11.length < 3) {
            return null;
        }
        String format = String.format("%d %d %d", Integer.valueOf(k11[0]), Integer.valueOf(k11[1]), Integer.valueOf(k11[2]));
        if (format.equals("0 0 0")) {
            str = "n/a";
        } else if (format.equals("-1 -1 1")) {
            str = "Low Key";
        } else if (format.equals("0 -1 1")) {
            str = "Normal";
        } else if (format.equals("1 -1 1")) {
            str = "High Key";
        } else {
            str = "Unknown (" + format + ")";
        }
        if (k11.length > 3) {
            if (k11[3] == 0) {
                return str + "; User-Selected";
            } else if (k11[3] == 1) {
                return str + "; Auto-Override";
            } else {
                return str;
            }
        }
        return str;
    }

    public String V() {
        return l(1539, 1, "SQ", "HQ", "SHQ", "RAW", "SQ (5)");
    }

    public String W() {
        return m(1540, "Off", "On, Mode 1", "On, Mode 2", "On, Mode 3", "On, Mode 4");
    }

    public String X() {
        return m(768, "Off", "On", "Super Macro");
    }

    public String Y() {
        return N(1324);
    }

    public String Z() {
        Integer l11 = ((x) this.f9060a).l(2304);
        if (l11 == null) {
            return null;
        }
        return String.format("%s kPa", new DecimalFormat("#.##").format(l11.intValue() / 10.0d));
    }

    public String a0() {
        int[] k11 = ((x) this.f9060a).k(2305);
        if (k11 == null || k11.length < 2) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s m, %s ft", decimalFormat.format(k11[0] / 10.0d), decimalFormat.format(k11[1] / 10.0d));
    }

    public String b0() {
        bc.k[] q11 = ((x) this.f9060a).q(1030);
        if (q11 == null || q11.length == 0) {
            return "n/a";
        }
        if (q11.length == 3) {
            if (q11[0].d() == 0 && q11[1].d() == 0 && q11[2].d() == 0) {
                return "n/a";
            }
        } else if (q11.length == 4 && q11[0].d() == 0 && q11[1].d() == 0 && q11[2].d() == 0 && q11[3].d() == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb2 = new StringBuilder();
        for (bc.k kVar : q11) {
            sb2.append(kVar);
            sb2.append(", ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    public String c0() {
        Integer l11 = ((x) this.f9060a).l(SyslogConstants.SYSLOG_PORT);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 2) {
            if (intValue != 3) {
                if (intValue != 5) {
                    if (intValue != 261) {
                        if (intValue != 515) {
                            if (intValue != 1027) {
                                return "Unknown (" + l11 + ")";
                            }
                            return "Spot+Shadow control";
                        }
                        return "Spot+Highlight control";
                    }
                    return "Pattern+AF";
                }
                return "ESP";
            }
            return "Spot";
        }
        return "Center-weighted average";
    }

    public String d0() {
        return m(1284, "Off", "CM1 (Red Enhance)", "CM2 (Green Enhance)", "CM3 (Blue Enhance)", "CM4 (Skin Tones)");
    }

    public String e0() {
        return m(516, "Off", "On");
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            if (i11 != 1280) {
                if (i11 != 1281) {
                    if (i11 != 1312) {
                        if (i11 != 1313) {
                            if (i11 != 1536) {
                                if (i11 != 1537) {
                                    switch (i11) {
                                        case 0:
                                            break;
                                        case 256:
                                            return q0();
                                        case 768:
                                            return X();
                                        case 769:
                                            return S();
                                        case 770:
                                            return T();
                                        case 771:
                                            return z();
                                        case 772:
                                            return w();
                                        case 773:
                                            return y();
                                        case 774:
                                            return x();
                                        case 1024:
                                            return Q();
                                        case 1295:
                                            return U();
                                        case 1321:
                                            return A();
                                        case 1330:
                                            return D();
                                        case 1539:
                                            return V();
                                        case 1540:
                                            return W();
                                        case 2052:
                                            return v0();
                                        case 2304:
                                            return Z();
                                        case 2305:
                                            return a0();
                                        case 2306:
                                            return M();
                                        case 2307:
                                            return r0();
                                        case 2308:
                                            return p0();
                                        case 2312:
                                            return H();
                                        default:
                                            switch (i11) {
                                                case 512:
                                                    return K();
                                                case 513:
                                                    return v();
                                                case SyslogConstants.SYSLOG_PORT /* 514 */:
                                                    return c0();
                                                case 515:
                                                    return L();
                                                case 516:
                                                    return e0();
                                                default:
                                                    switch (i11) {
                                                        case 1027:
                                                            return R();
                                                        case 1028:
                                                            return O();
                                                        case 1029:
                                                            return P();
                                                        case 1030:
                                                            return b0();
                                                        default:
                                                            switch (i11) {
                                                                case 1283:
                                                                    return G();
                                                                case 1284:
                                                                    return d0();
                                                                case 1285:
                                                                    return F();
                                                                case 1286:
                                                                    return u0();
                                                                case 1287:
                                                                    return E();
                                                                default:
                                                                    switch (i11) {
                                                                        case 1289:
                                                                            return s0();
                                                                        case 1290:
                                                                            return g0();
                                                                        case 1291:
                                                                            return I();
                                                                        case 1292:
                                                                            return t0();
                                                                        default:
                                                                            switch (i11) {
                                                                                case 1315:
                                                                                    return j0();
                                                                                case 1316:
                                                                                    return n0();
                                                                                case 1317:
                                                                                    return i0();
                                                                                case 1318:
                                                                                    return o0();
                                                                                case 1319:
                                                                                    return f0();
                                                                                default:
                                                                                    switch (i11) {
                                                                                        case 1324:
                                                                                            return Y();
                                                                                        case 1325:
                                                                                            return l0();
                                                                                        case 1326:
                                                                                            return w0();
                                                                                        case 1327:
                                                                                            return B();
                                                                                        default:
                                                                                            return super.f(i11);
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    return h0();
                                }
                            } else {
                                return J();
                            }
                        } else {
                            return m0();
                        }
                    } else {
                        return k0();
                    }
                } else {
                    return z0();
                }
            } else {
                return y0();
            }
        }
        return C();
    }

    public String f0() {
        int[] k11 = ((x) this.f9060a).k(1319);
        if (k11 == null) {
            return null;
        }
        String format = String.format("%d %d %d", Integer.valueOf(k11[0]), Integer.valueOf(k11[1]), Integer.valueOf(k11[2]));
        if (format.equals("0 0 0")) {
            return "n/a";
        }
        if (format.equals("-2 -2 1")) {
            return "Off";
        }
        if (format.equals("-1 -2 1")) {
            return "Low";
        }
        if (format.equals("0 -2 1")) {
            return "Standard";
        }
        if (format.equals("1 -2 1")) {
            return "High";
        }
        return "Unknown (" + format + ")";
    }

    public String g0() {
        Integer l11 = ((x) this.f9060a).l(1290);
        if (l11 == null) {
            return null;
        }
        if (l11.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb2 = new StringBuilder();
        int intValue = l11.intValue();
        if ((intValue & 1) != 0) {
            sb2.append("Noise Reduction, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb2.append("Noise Filter, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb2.append("Noise Filter (ISO Boost), ");
        }
        if (((intValue >> 3) & 1) != 0) {
            sb2.append("Auto, ");
        }
        return sb2.length() != 0 ? sb2.substring(0, sb2.length() - 2) : "(none)";
    }

    public String h0() {
        String str;
        int[] k11 = ((x) this.f9060a).k(1537);
        if (k11 == null) {
            return null;
        }
        if (k11.length == 0 || k11[0] == 0) {
            return "Off";
        }
        int i11 = k11[0];
        if (i11 == 1) {
            str = "Left to Right";
        } else if (i11 == 2) {
            str = "Right to Left";
        } else if (i11 == 3) {
            str = "Bottom to Top";
        } else if (i11 != 4) {
            str = "Unknown (" + k11[0] + ")";
        } else {
            str = "Top to Bottom";
        }
        return String.format("%s, Shot %d", str, Integer.valueOf(k11[1]));
    }

    public String i0() {
        return m(1317, "n/a", "Neutral", "Yellow", "Orange", "Red", "Green");
    }

    public String j0() {
        return x0(1315);
    }

    public String k0() {
        int[] k11 = ((x) this.f9060a).k(1312);
        if (k11 == null) {
            Integer l11 = ((x) this.f9060a).l(1290);
            if (l11 == null) {
                return null;
            }
            k11 = new int[]{l11.intValue()};
        }
        if (k11.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = k11[0];
        if (i11 == 1) {
            sb2.append("Vivid");
        } else if (i11 == 2) {
            sb2.append("Natural");
        } else if (i11 == 3) {
            sb2.append("Muted");
        } else if (i11 == 4) {
            sb2.append("Portrait");
        } else if (i11 == 5) {
            sb2.append("i-Enhance");
        } else if (i11 == 256) {
            sb2.append("Monotone");
        } else if (i11 != 512) {
            sb2.append("Unknown (");
            sb2.append(k11[0]);
            sb2.append(")");
        } else {
            sb2.append("Sepia");
        }
        if (k11.length > 1) {
            sb2.append("; ");
            sb2.append(k11[1]);
        }
        return sb2.toString();
    }

    public String l0() {
        int[] k11 = ((x) this.f9060a).k(1325);
        if (k11 == null) {
            return null;
        }
        String format = String.format("%d %d %d", Integer.valueOf(k11[0]), Integer.valueOf(k11[1]), Integer.valueOf(k11[2]));
        if (format.equals("0 0 0")) {
            return "n/a";
        }
        if (format.equals("-1 -1 1")) {
            return "Low";
        }
        if (format.equals("0 -1 1")) {
            return "Standard";
        }
        if (format.equals("1 -1 1")) {
            return "High";
        }
        return "Unknown (" + format + ")";
    }

    public String m0() {
        return x0(1313);
    }

    public String n0() {
        return x0(1316);
    }

    public String o0() {
        return m(1318, "n/a", "Neutral", "Sepia", "Blue", "Purple", "Green");
    }

    public String p0() {
        int[] k11 = ((x) this.f9060a).k(2308);
        if (k11 == null || k11.length < 2) {
            return null;
        }
        return String.format("%s %d", k11[0] != 0 ? Double.toString(k11[0] / 10.0d) : "n/a", Integer.valueOf(k11[1]));
    }

    public String q0() {
        return m(256, "No", "Yes");
    }

    public String r0() {
        int[] k11 = ((x) this.f9060a).k(2307);
        if (k11 == null || k11.length < 2) {
            return null;
        }
        return String.format("%s %d", k11[0] != 0 ? Double.toString((-k11[0]) / 10.0d) : "n/a", Integer.valueOf(k11[1]));
    }

    public String s0() {
        Integer l11 = ((x) this.f9060a).l(1289);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 54) {
                if (intValue != 57) {
                    if (intValue != 142) {
                        if (intValue != 154) {
                            if (intValue != 59) {
                                if (intValue != 60) {
                                    switch (intValue) {
                                        case 6:
                                            return "Auto";
                                        case 7:
                                            return "Sport";
                                        case 8:
                                            return "Portrait";
                                        case 9:
                                            return "Landscape+Portrait";
                                        case 10:
                                            return "Landscape";
                                        case 11:
                                            return "Night Scene";
                                        case 12:
                                            return "Self Portrait";
                                        case 13:
                                            return "Panorama";
                                        case 14:
                                            return "2 in 1";
                                        case 15:
                                            return "Movie";
                                        case 16:
                                            return "Landscape+Portrait";
                                        case 17:
                                            return "Night+Portrait";
                                        case 18:
                                            return "Indoor";
                                        case 19:
                                            return "Fireworks";
                                        case 20:
                                            return "Sunset";
                                        case 21:
                                            return "Beauty Skin";
                                        case 22:
                                            return "Macro";
                                        case 23:
                                            return "Super Macro";
                                        case 24:
                                            return "Food";
                                        case 25:
                                            return "Documents";
                                        case 26:
                                            return "Museum";
                                        case 27:
                                            return "Shoot & Select";
                                        case 28:
                                            return "Beach & Snow";
                                        case 29:
                                            return "Self Portrait+Timer";
                                        case 30:
                                            return "Candle";
                                        case 31:
                                            return "Available Light";
                                        case 32:
                                            return "Behind Glass";
                                        case 33:
                                            return "My Mode";
                                        case 34:
                                            return "Pet";
                                        case 35:
                                            return "Underwater Wide1";
                                        case 36:
                                            return "Underwater Macro";
                                        case 37:
                                            return "Shoot & Select1";
                                        case 38:
                                            return "Shoot & Select2";
                                        case 39:
                                            return "High Key";
                                        case 40:
                                            return "Digital Image Stabilization";
                                        case 41:
                                            return "Auction";
                                        case 42:
                                            return "Beach";
                                        case 43:
                                            return "Snow";
                                        case 44:
                                            return "Underwater Wide2";
                                        case 45:
                                            return "Low Key";
                                        case 46:
                                            return "Children";
                                        case 47:
                                            return "Vivid";
                                        case 48:
                                            return "Nature Macro";
                                        case 49:
                                            return "Underwater Snapshot";
                                        case 50:
                                            return "Shooting Guide";
                                        default:
                                            switch (intValue) {
                                                case 63:
                                                    return "Slow Shutter";
                                                case 64:
                                                    return "Bird Watching";
                                                case 65:
                                                    return "Multiple Exposure";
                                                case 66:
                                                    return "e-Portrait";
                                                case 67:
                                                    return "Soft Background Shot";
                                                default:
                                                    return "Unknown (" + l11 + ")";
                                            }
                                    }
                                }
                                return "Quick Shutter";
                            }
                            return "Smile Shot";
                        }
                        return "HDR";
                    }
                    return "Hand-held Starlight";
                }
                return "Bulb";
            }
            return "Face Portrait";
        }
        return "Standard";
    }

    public String t0() {
        return m(1292, "Off", "On");
    }

    public String u0() {
        return x0(1286);
    }

    public String v() {
        return m(513, "Off", "On");
    }

    public String v0() {
        int[] k11 = ((x) this.f9060a).k(2052);
        if (k11 == null || k11.length < 2) {
            return null;
        }
        int i11 = k11[0];
        int i12 = k11[1];
        return (i11 == 0 && i12 == 0) ? "No" : (i11 == 9 && i12 == 8) ? "Focus-stacked (8 images)" : String.format("Unknown (%d %d)", Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public String w() {
        long[] jArr;
        Object o11 = ((x) this.f9060a).o(772);
        if (o11 == null || !(o11 instanceof long[])) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (long j11 : (long[]) o11) {
            if (j11 != 0) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                if (j11 == 913916549) {
                    sb2.append("Left ");
                } else if (j11 == 2038007173) {
                    sb2.append("Center ");
                } else if (j11 == 3178875269L) {
                    sb2.append("Right ");
                }
                sb2.append(String.format("(%d/255,%d/255)-(%d/255,%d/255)", Long.valueOf((j11 >> 24) & 255), Long.valueOf((j11 >> 16) & 255), Long.valueOf((j11 >> 8) & 255), Long.valueOf(j11 & 255)));
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public String w0() {
        int[] k11 = ((x) this.f9060a).k(1326);
        if (k11 == null || k11.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < k11.length; i11++) {
            if (i11 != 0 && i11 != 4 && i11 != 8 && i11 != 12 && i11 != 16 && i11 != 20 && i11 != 24) {
                sb2.append(k11[i11]);
                sb2.append("; ");
            } else {
                sb2.append(f30346b.get(Integer.valueOf(k11[i11])));
                sb2.append("; ");
            }
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    public String x() {
        return m(774, "Off", "On");
    }

    public String y() {
        bc.k[] q11 = ((x) this.f9060a).q(773);
        if (q11 == null) {
            return "n/a";
        }
        if (q11.length < 4) {
            return null;
        }
        int i11 = (q11.length == 5 && q11[0].longValue() == 0) ? 1 : 0;
        int doubleValue = (int) (q11[i11].doubleValue() * 100.0d);
        int doubleValue2 = (int) (q11[i11 + 1].doubleValue() * 100.0d);
        int doubleValue3 = (int) (q11[i11 + 2].doubleValue() * 100.0d);
        int doubleValue4 = (int) (q11[i11 + 3].doubleValue() * 100.0d);
        return ((doubleValue + doubleValue2) + doubleValue3) + doubleValue4 == 0 ? "n/a" : String.format("(%d%%,%d%%) (%d%%,%d%%)", Integer.valueOf(doubleValue), Integer.valueOf(doubleValue2), Integer.valueOf(doubleValue3), Integer.valueOf(doubleValue4));
    }

    public String y0() {
        Integer l11 = ((x) this.f9060a).l(1280);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 48) {
                    if (intValue != 67) {
                        switch (intValue) {
                            case 16:
                                return "7500K (Fine Weather with Shade)";
                            case 17:
                                return "6000K (Cloudy)";
                            case 18:
                                return "5300K (Fine Weather)";
                            default:
                                switch (intValue) {
                                    case 20:
                                        return "3000K (Tungsten light)";
                                    case 21:
                                        return "3600K (Tungsten light-like)";
                                    case 22:
                                        return "Auto Setup";
                                    case 23:
                                        return "5500K (Flash)";
                                    default:
                                        switch (intValue) {
                                            case 33:
                                                return "6600K (Daylight fluorescent)";
                                            case 34:
                                                return "4500K (Neutral white fluorescent)";
                                            case 35:
                                                return "4000K (Cool white fluorescent)";
                                            case 36:
                                                return "White Fluorescent";
                                            default:
                                                switch (intValue) {
                                                    case 256:
                                                        return "One Touch WB 1";
                                                    case 257:
                                                        return "One Touch WB 2";
                                                    case 258:
                                                        return "One Touch WB 3";
                                                    case 259:
                                                        return "One Touch WB 4";
                                                    default:
                                                        switch (intValue) {
                                                            case 512:
                                                                return "Custom WB 1";
                                                            case 513:
                                                                return "Custom WB 2";
                                                            case SyslogConstants.SYSLOG_PORT /* 514 */:
                                                                return "Custom WB 3";
                                                            case 515:
                                                                return "Custom WB 4";
                                                            default:
                                                                return "Unknown (" + l11 + ")";
                                                        }
                                                }
                                        }
                                }
                        }
                    }
                    return "Underwater";
                }
                return "3600K (Tungsten light-like)";
            }
            return "Auto (Keep Warm Color Off)";
        }
        return "Auto";
    }

    public String z() {
        return m(771, "Not Ready", "Ready");
    }

    public String z0() {
        Integer l11 = ((x) this.f9060a).l(1281);
        if (l11 == null) {
            return null;
        }
        return l11.intValue() == 0 ? "Auto" : l11.toString();
    }
}