package ic;

import ch.qos.logback.core.net.SyslogConstants;
import ezvcard.property.Gender;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e0 extends cc.h<f0> {
    public e0(f0 f0Var) {
        super(f0Var);
    }

    public String A() {
        return m(515, "Off", "On");
    }

    public String A0() {
        Long m11 = ((f0) this.f9060a).m(61472);
        if (m11 == null) {
            return null;
        }
        return Long.toString(m11.longValue() - 3);
    }

    public String B() {
        return super.f(61483);
    }

    public String B0() {
        return m(61474, "Hard", "Normal", "Soft");
    }

    public String C() {
        int[] k11 = ((f0) this.f9060a).k(4120);
        if (k11 == null) {
            return null;
        }
        return String.valueOf(((short) k11[0]) / 256.0d);
    }

    public String C0() {
        return m(4111, "Normal", "Hard", "Soft");
    }

    public String D() {
        return m(61455, "1/3 EV", "2/3 EV", "1 EV");
    }

    public String D0() {
        return m(61447, "Single", "Continuous", "Self Timer", null, "Bracketing", "Interval", "UHS Continuous", "HS Continuous");
    }

    public String E() {
        byte[] e11 = ((f0) this.f9060a).e(521);
        if (e11 == null) {
            return null;
        }
        return new String(e11);
    }

    public String E0() {
        return super.r(4096);
    }

    public String F() {
        return m(61478, "DiMAGE 7", "DiMAGE 5", "DiMAGE S304", "DiMAGE S404", "DiMAGE 7i", "DiMAGE 7Hi", "DiMAGE A1", "DiMAGE S414");
    }

    public String F0() {
        int i11;
        long[] jArr = (long[]) ((f0) this.f9060a).o(512);
        if (jArr == null) {
            return null;
        }
        if (jArr.length < 1) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = (int) jArr[0];
        if (i12 == 0) {
            sb2.append("Normal picture taking mode");
        } else if (i12 == 1) {
            sb2.append("Unknown picture taking mode");
        } else if (i12 == 2) {
            sb2.append("Fast picture taking mode");
        } else if (i12 != 3) {
            sb2.append("Unknown picture taking mode");
        } else {
            sb2.append("Panorama picture taking mode");
        }
        if (jArr.length >= 2 && (i11 = (int) jArr[1]) != 0) {
            if (i11 == 1) {
                sb2.append(" / 1st in a sequence");
            } else if (i11 == 2) {
                sb2.append(" / 2nd in a sequence");
            } else if (i11 != 3) {
                sb2.append(" / ");
                sb2.append(jArr[1]);
                sb2.append("th in a sequence");
            } else {
                sb2.append(" / 3rd in a sequence");
            }
        }
        if (jArr.length >= 3) {
            int i13 = (int) jArr[2];
            if (i13 == 1) {
                sb2.append(" / Left to right panorama direction");
            } else if (i13 == 2) {
                sb2.append(" / Right to left panorama direction");
            } else if (i13 == 3) {
                sb2.append(" / Bottom to top panorama direction");
            } else if (i13 == 4) {
                sb2.append(" / Top to bottom panorama direction");
            }
        }
        return sb2.toString();
    }

    public String G() {
        String r11 = ((f0) this.f9060a).r(519);
        if (r11 == null) {
            return null;
        }
        HashMap<String, String> hashMap = f0.f30326f;
        return hashMap.containsKey(r11) ? hashMap.get(r11) : r11;
    }

    public String G0() {
        return super.f(61486);
    }

    public String H() {
        Long m11 = ((f0) this.f9060a).m(61482);
        if (m11 == null) {
            return null;
        }
        return Long.toString(m11.longValue() - 3);
    }

    public String H0() {
        return super.f(61487);
    }

    public String I() {
        int[] k11 = ((f0) this.f9060a).k(4113);
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

    public String I0() {
        return m(61475, "None", "Portrait", "Text", "Night Portrait", "Sunset", "Sports Action");
    }

    public String J() {
        return m(61481, "Natural Color", "Black & White", "Vivid Color", "Solarization", "AdobeRGB");
    }

    public String J0() {
        Long m11 = ((f0) this.f9060a).m(61463);
        if (m11 == null) {
            return null;
        }
        int longValue = (int) ((m11.longValue() >> 8) & 255);
        int longValue2 = (int) ((m11.longValue() >> 16) & 255);
        int longValue3 = (int) (255 & m11.longValue());
        return !bc.f.b(longValue, longValue2, longValue3) ? "Invalid time" : String.format("%02d:%02d:%02d", Integer.valueOf(longValue), Integer.valueOf(longValue2), Integer.valueOf(longValue3));
    }

    public String K() {
        return m(257, "Natural Colour", "Black & White", "Vivid Colour", "Solarization", "AdobeRGB");
    }

    public String K0() {
        int[] k11 = ((f0) this.f9060a).k(4117);
        if (k11 == null) {
            return null;
        }
        String format = String.format("%d %d", Integer.valueOf(k11[0]), Integer.valueOf(k11[1]));
        if (format.equals("1 0")) {
            return "Auto";
        }
        if (format.equals("1 2")) {
            return "Auto (2)";
        }
        if (format.equals("1 4")) {
            return "Auto (4)";
        }
        if (format.equals("2 2")) {
            return "3000 Kelvin";
        }
        if (format.equals("2 3")) {
            return "3700 Kelvin";
        }
        if (format.equals("2 4")) {
            return "4000 Kelvin";
        }
        if (format.equals("2 5")) {
            return "4500 Kelvin";
        }
        if (format.equals("2 6")) {
            return "5500 Kelvin";
        }
        if (format.equals("2 7")) {
            return "6500 Kelvin";
        }
        if (format.equals("2 8")) {
            return "7500 Kelvin";
        }
        if (format.equals("3 0")) {
            return "One-touch";
        }
        return "Unknown " + format;
    }

    public String L() {
        Long m11 = ((f0) this.f9060a).m(61473);
        if (m11 == null) {
            return null;
        }
        return Long.toString(m11.longValue() - 3);
    }

    public String L0() {
        Long m11 = ((f0) this.f9060a).m(61471);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m11 == null) {
            return null;
        }
        return decimalFormat.format(m11.longValue() / 256.0d);
    }

    public String M() {
        return m(4137, "High", "Normal", "Low");
    }

    public String M0() {
        return m(61444, "Auto", "Daylight", "Cloudy", "Tungsten", null, "Custom", null, "Fluorescent", "Fluorescent 2", null, null, "Custom 2", "Custom 3");
    }

    public String N() {
        Long m11 = ((f0) this.f9060a).m(61462);
        if (m11 == null) {
            return null;
        }
        int longValue = (int) (m11.longValue() & 255);
        int longValue2 = (int) ((m11.longValue() >> 16) & 255);
        int longValue3 = ((int) (255 & (m11.longValue() >> 8))) + 1970;
        return !bc.f.a(longValue3, longValue2, longValue) ? "Invalid date" : String.format("%04d-%02d-%02d", Integer.valueOf(longValue3), Integer.valueOf(longValue2 + 1), Integer.valueOf(longValue));
    }

    public String N0() {
        Long m11 = ((f0) this.f9060a).m(61470);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m11 == null) {
            return null;
        }
        return decimalFormat.format(m11.longValue() / 256.0d);
    }

    public String O() {
        return m(61491, "Exposure", "Contrast", "Saturation", "Filter");
    }

    public String O0() {
        Long m11 = ((f0) this.f9060a).m(61469);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m11 == null) {
            return null;
        }
        return decimalFormat.format(m11.longValue() / 256.0d);
    }

    public String P() {
        return m(61453, "Off", "Electronic magnification", "Digital zoom 2x");
    }

    public String P0() {
        return m(61488, "No Zone or AF Failed", "Center Zone (Horizontal Orientation)", "Center Zone (Vertical Orientation)", "Left Zone", "Right Zone");
    }

    public String Q() {
        bc.k p11 = ((f0) this.f9060a).p(516);
        if (p11 == null) {
            return null;
        }
        return p11.k(false);
    }

    public String R() {
        Long m11 = ((f0) this.f9060a).m(61454);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m11 == null) {
            return null;
        }
        return decimalFormat.format((m11.longValue() / 3.0d) - 2.0d) + " EV";
    }

    public String S() {
        return m(61442, "P", "A", "S", Gender.MALE);
    }

    public String T() {
        return m(61467, "Off", "On");
    }

    public String U() {
        Long m11 = ((f0) this.f9060a).m(61476);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m11 == null) {
            return null;
        }
        return decimalFormat.format((m11.longValue() - 6) / 3.0d) + " EV";
    }

    public String V() {
        return m(61461, "No", "Yes");
    }

    public String W() {
        return m(61443, "Normal", "Red-eye reduction", "Rear flash sync", "Wireless");
    }

    public String X() {
        return m(4100, null, null, "On", "Off");
    }

    public String Y() {
        Long m11 = ((f0) this.f9060a).m(61459);
        if (m11 == null) {
            return null;
        }
        return cc.h.i(m11.longValue() / 256.0d);
    }

    public String Z() {
        bc.k p11 = ((f0) this.f9060a).p(517);
        if (p11 == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        return decimalFormat.format(p11.doubleValue()) + " mm";
    }

    public String a0() {
        return m(61490, "Wide Focus (Normal)", "Spot Focus");
    }

    public String b0() {
        Long m11 = ((f0) this.f9060a).m(61460);
        if (m11 == null) {
            return null;
        }
        if (m11.longValue() == 0) {
            return "Infinity";
        }
        return m11 + " mm";
    }

    public String c0() {
        return m(61489, "Auto Focus", "Manual Focus");
    }

    public String d0() {
        return m(4107, "Auto", "Manual");
    }

    public String e0() {
        return m(4106, "Normal", "Macro");
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            if (i11 != 519) {
                if (i11 != 521) {
                    if (i11 != 770) {
                        if (i11 != 4100) {
                            if (i11 != 4111) {
                                if (i11 != 4113) {
                                    if (i11 != 4117) {
                                        if (i11 != 4137) {
                                            if (i11 != 4149) {
                                                if (i11 != 4106) {
                                                    if (i11 != 4107) {
                                                        if (i11 != 4119) {
                                                            if (i11 != 4120) {
                                                                switch (i11) {
                                                                    case 257:
                                                                        return K();
                                                                    case 258:
                                                                        return g0();
                                                                    case 259:
                                                                        return h0();
                                                                    default:
                                                                        switch (i11) {
                                                                            case 512:
                                                                                return F0();
                                                                            case 513:
                                                                                return q0();
                                                                            case SyslogConstants.SYSLOG_PORT /* 514 */:
                                                                                return t0();
                                                                            case 515:
                                                                                return A();
                                                                            case 516:
                                                                                return Q();
                                                                            case 517:
                                                                                return Z();
                                                                            default:
                                                                                switch (i11) {
                                                                                    case 4096:
                                                                                        return E0();
                                                                                    case 4097:
                                                                                        return p0();
                                                                                    case 4098:
                                                                                        return v();
                                                                                    default:
                                                                                        switch (i11) {
                                                                                            case 61442:
                                                                                                return S();
                                                                                            case 61443:
                                                                                                return W();
                                                                                            case 61444:
                                                                                                return M0();
                                                                                            case 61445:
                                                                                                return j0();
                                                                                            case 61446:
                                                                                                return i0();
                                                                                            case 61447:
                                                                                                return D0();
                                                                                            case 61448:
                                                                                                return w0();
                                                                                            case 61449:
                                                                                                return y();
                                                                                            case 61450:
                                                                                                return z();
                                                                                            case 61451:
                                                                                                return w();
                                                                                            case 61452:
                                                                                                return s0();
                                                                                            case 61453:
                                                                                                return P();
                                                                                            case 61454:
                                                                                                return R();
                                                                                            case 61455:
                                                                                                return D();
                                                                                            default:
                                                                                                switch (i11) {
                                                                                                    case 61457:
                                                                                                        return l0();
                                                                                                    case 61458:
                                                                                                        return n0();
                                                                                                    case 61459:
                                                                                                        return Y();
                                                                                                    case 61460:
                                                                                                        return b0();
                                                                                                    case 61461:
                                                                                                        return V();
                                                                                                    case 61462:
                                                                                                        return N();
                                                                                                    case 61463:
                                                                                                        return J0();
                                                                                                    case 61464:
                                                                                                        return v0();
                                                                                                    default:
                                                                                                        switch (i11) {
                                                                                                            case 61467:
                                                                                                                return T();
                                                                                                            case 61468:
                                                                                                                return r0();
                                                                                                            case 61469:
                                                                                                                return O0();
                                                                                                            case 61470:
                                                                                                                return N0();
                                                                                                            case 61471:
                                                                                                                return L0();
                                                                                                            case 61472:
                                                                                                                return A0();
                                                                                                            case 61473:
                                                                                                                return L();
                                                                                                            case 61474:
                                                                                                                return B0();
                                                                                                            case 61475:
                                                                                                                return I0();
                                                                                                            case 61476:
                                                                                                                return U();
                                                                                                            case 61477:
                                                                                                                return o0();
                                                                                                            case 61478:
                                                                                                                return F();
                                                                                                            case 61479:
                                                                                                                return m0();
                                                                                                            case 61480:
                                                                                                                return f0();
                                                                                                            case 61481:
                                                                                                                return J();
                                                                                                            case 61482:
                                                                                                                return H();
                                                                                                            case 61483:
                                                                                                                return B();
                                                                                                            case 61484:
                                                                                                                return k0();
                                                                                                            case 61485:
                                                                                                                return x();
                                                                                                            case 61486:
                                                                                                                return G0();
                                                                                                            case 61487:
                                                                                                                return H0();
                                                                                                            case 61488:
                                                                                                                return P0();
                                                                                                            case 61489:
                                                                                                                return c0();
                                                                                                            case 61490:
                                                                                                                return a0();
                                                                                                            case 61491:
                                                                                                                return O();
                                                                                                            default:
                                                                                                                return super.f(i11);
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                            }
                                                            return C();
                                                        }
                                                        return z0();
                                                    }
                                                    return d0();
                                                }
                                                return e0();
                                            }
                                            return y0();
                                        }
                                        return M();
                                    }
                                    return K0();
                                }
                                return I();
                            }
                            return C0();
                        }
                        return X();
                    }
                    return x0();
                }
                return E();
            }
            return G();
        }
        return u0();
    }

    public String f0() {
        return m(61480, "Standard Form", "Data Form");
    }

    public String g0() {
        return m(258, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
    }

    public String h0() {
        return m(259, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
    }

    public String i0() {
        return m(61446, "Raw", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine");
    }

    public String j0() {
        return m(61445, "2560 x 1920", "1600 x 1200", "1280 x 960", "640 x 480");
    }

    public String k0() {
        return m(61484, "Did Not Fire", "Fired");
    }

    public String l0() {
        if (((f0) this.f9060a).V()) {
            Long m11 = ((f0) this.f9060a).m(61457);
            if (m11 == null) {
                return null;
            }
            return m11 + " min";
        }
        return "N/A";
    }

    public String m0() {
        return m(61479, "Still Image", "Time Lapse Movie");
    }

    public String n0() {
        if (((f0) this.f9060a).V()) {
            Long m11 = ((f0) this.f9060a).m(61458);
            if (m11 == null) {
                return null;
            }
            return Long.toString(m11.longValue());
        }
        return "N/A";
    }

    public String o0() {
        return m(61477, "100", "200", "400", "800", "Auto", "64");
    }

    public String p0() {
        bc.k p11 = ((f0) this.f9060a).p(4097);
        if (p11 == null) {
            return null;
        }
        return String.valueOf(Math.round(Math.pow(2.0d, p11.doubleValue() - 5.0d) * 100.0d));
    }

    public String q0() {
        String r11 = ((f0) this.f9060a).r(519);
        if (r11 != null) {
            Integer l11 = ((f0) this.f9060a).l(513);
            if (l11 == null) {
                return null;
            }
            if ((r11.startsWith("SX") && !r11.startsWith("SX151")) || r11.startsWith("D4322")) {
                int intValue = l11.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 6) {
                                return "Unknown (" + l11.toString() + ")";
                            }
                            return "RAW";
                        }
                        return "Super High Quality (Fine)";
                    }
                    return "High Quality (Normal)";
                }
                return "Standard Quality (Low)";
            }
            int intValue2 = l11.intValue();
            if (intValue2 != 0) {
                if (intValue2 != 1) {
                    if (intValue2 != 2) {
                        if (intValue2 != 4) {
                            if (intValue2 != 5) {
                                if (intValue2 != 6) {
                                    if (intValue2 != 33) {
                                        return "Unknown (" + l11.toString() + ")";
                                    }
                                    return "Uncompressed";
                                }
                                return "Small-Fine";
                            }
                            return "Medium-Fine";
                        }
                        return "RAW";
                    }
                    return "Super High Quality (Fine)";
                }
                return "High Quality (Normal)";
            }
            return "Standard Quality (Low)";
        }
        return l(513, 1, "Standard Quality", "High Quality", "Super High Quality");
    }

    public String r0() {
        Long m11 = ((f0) this.f9060a).m(61468);
        if (m11 == null) {
            return null;
        }
        return m11.longValue() == 0 ? "File Number Memory Off" : Long.toString(m11.longValue());
    }

    public String s0() {
        return m(61452, "Off", "On");
    }

    public String t0() {
        return m(SyslogConstants.SYSLOG_PORT, "Normal (no macro)", "Macro");
    }

    public String u0() {
        return u(0, 2);
    }

    public String v() {
        Double h11 = ((f0) this.f9060a).h(4098);
        if (h11 == null) {
            return null;
        }
        return cc.h.h(kb.c.a(h11.doubleValue()));
    }

    public String v0() {
        Long m11 = ((f0) this.f9060a).m(61463);
        if (m11 == null) {
            return null;
        }
        return cc.h.h(Math.pow((m11.longValue() / 16.0d) - 0.5d, 2.0d));
    }

    public String w() {
        Long m11 = ((f0) this.f9060a).m(61451);
        if (m11 == null) {
            return null;
        }
        return cc.h.h(Math.pow((m11.longValue() / 16.0d) - 0.5d, 2.0d));
    }

    public String w0() {
        return m(61448, "Multi-Segment", "Centre Weighted", "Spot");
    }

    public String x() {
        Long m11 = ((f0) this.f9060a).m(61485);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m11 == null) {
            return null;
        }
        return decimalFormat.format((m11.longValue() / 8.0d) - 6.0d);
    }

    public String x0() {
        return m(770, "Off", "On", "On (Preset)");
    }

    public String y() {
        Long m11 = ((f0) this.f9060a).m(61449);
        if (m11 == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(Math.pow((m11.longValue() / 8.0d) - 1.0d, 2.0d) * 3.125d);
    }

    public String y0() {
        return m(4149, "No", "Yes");
    }

    public String z() {
        Long m11 = ((f0) this.f9060a).m(61450);
        if (m11 == null) {
            return null;
        }
        double pow = Math.pow((49 - m11.longValue()) / 8.0d, 2.0d);
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(pow) + " sec";
    }

    public String z0() {
        int[] k11 = ((f0) this.f9060a).k(4119);
        if (k11 == null) {
            return null;
        }
        return String.valueOf(((short) k11[0]) / 256.0d);
    }
}