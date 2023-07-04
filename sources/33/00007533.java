package ic;

import com.facebook.react.modules.clipboard.ClipboardModule;
import java.io.IOException;
import java.text.DecimalFormat;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class m0 extends cc.h<n0> {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f30335b = {"Normal", "Portrait", "Scenery", "Sports", "Night Portrait", "Program", "Aperture Priority", "Shutter Priority", "Macro", "Spot", "Manual", "Movie Preview", "Panning", "Simple", "Color Effects", "Self Portrait", "Economy", "Fireworks", "Party", "Snow", "Night Scenery", "Food", "Baby", "Soft Skin", "Candlelight", "Starry Night", "High Sensitivity", "Panorama Assist", "Underwater", "Beach", "Aerial Photo", "Sunset", "Pet", "Intelligent ISO", ClipboardModule.NAME, "High Speed Continuous Shooting", "Intelligent Auto", null, "Multi-aspect", null, "Transform", "Flash Burst", "Pin Hole", "Film Grain", "My Color", "Photo Frame", null, null, null, null, "HDR"};

    public m0(n0 n0Var) {
        super(n0Var);
    }

    private String H0(int i11) {
        byte[] e11 = ((n0) this.f9060a).e(i11);
        if (e11 == null) {
            return null;
        }
        bc.a aVar = new bc.a(e11);
        try {
            int s11 = aVar.s(0);
            int s12 = aVar.s(2);
            if (s11 == -1 && s12 == 1) {
                return "Slim Low";
            }
            if (s11 == -3 && s12 == 2) {
                return "Slim High";
            }
            if (s11 == 0 && s12 == 0) {
                return "Off";
            }
            if (s11 == 1 && s12 == 1) {
                return "Stretch Low";
            }
            if (s11 == 3 && s12 == 2) {
                return "Stretch High";
            }
            return "Unknown (" + s11 + " " + s12 + ")";
        } catch (IOException unused) {
            return null;
        }
    }

    private static String N0(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    private String v(cc.d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < dVarArr.length) {
            sb2.append("Face ");
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(": ");
            sb2.append(dVarArr[i11].toString());
            sb2.append("\n");
            i11 = i12;
        }
        if (sb2.length() > 0) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return null;
    }

    public String A() {
        int[] k11 = ((n0) this.f9060a).k(15);
        if (k11 == null || k11.length < 2) {
            return null;
        }
        int i11 = k11[0];
        if (i11 == 0) {
            int i12 = k11[1];
            if (i12 != 1) {
                if (i12 != 16) {
                    return "Unknown (" + k11[0] + " " + k11[1] + ")";
                }
                return "Spot Mode Off";
            }
            return "Spot Mode On";
        } else if (i11 == 1) {
            int i13 = k11[1];
            if (i13 != 0) {
                if (i13 != 1) {
                    return "Unknown (" + k11[0] + " " + k11[1] + ")";
                }
                return "5-area";
            }
            return "Spot Focusing";
        } else if (i11 == 16) {
            int i14 = k11[1];
            if (i14 != 0) {
                if (i14 != 16) {
                    return "Unknown (" + k11[0] + " " + k11[1] + ")";
                }
                return "1-area (high speed)";
            }
            return "1-area";
        } else if (i11 != 32) {
            if (i11 != 64) {
                return "Unknown (" + k11[0] + " " + k11[1] + ")";
            }
            return "Face Detect";
        } else {
            int i15 = k11[1];
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            return "Unknown (" + k11[0] + " " + k11[1] + ")";
                        }
                        return "3-area (right)";
                    }
                    return "3-area (center)";
                }
                return "3-area (left)";
            }
            return "Auto or Face Detect";
        }
    }

    public String A0() {
        return l(32777, 1, "Off", "On");
    }

    public String B() {
        return l(49, 1, "Fired", "Enabled but not used", "Disabled but required", "Disabled and not required");
    }

    public String B0() {
        return l(59, 1, "Off", "On");
    }

    public String C() {
        return l(32, 1, "Off", "On");
    }

    public String C0() {
        return m(150, "Off", "Time Lapse", "Stop-motion Animation");
    }

    public String D() {
        cc.a V = ((n0) this.f9060a).V(32784);
        if (V == null) {
            return null;
        }
        return V.c();
    }

    public String D0() {
        return N0(t(101, bc.e.f7596a));
    }

    public String E() {
        cc.a V = ((n0) this.f9060a).V(51);
        if (V == null) {
            return null;
        }
        return V.c();
    }

    public String E0() {
        return m(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, "Off", "On");
    }

    public String F() {
        return N0(t(102, bc.e.f7596a));
    }

    public String F0() {
        return H0(32786);
    }

    public String G() {
        return m(69, "No Bracket", "3 Images, Sequence 0/-/+", "3 Images, Sequence -/0/+", "5 Images, Sequence 0/-/+", "5 Images, Sequence -/0/+", "7 Images, Sequence 0/-/+", "7 Images, Sequence -/0/+");
    }

    public String G0() {
        return H0(89);
    }

    public String H() {
        return m(42, "Off", null, "On", "Indefinite", "Unlimited");
    }

    public String I() {
        return m(143, "Normal", "Rotate CW", "Rotate 180", "Rotate CCW", "Tilt Upwards", "Tile Downwards");
    }

    public String I0() {
        return d(33);
    }

    public String J() {
        return N0(t(109, bc.e.f7596a));
    }

    public String J0() {
        Integer l11 = ((n0) this.f9060a).l(41);
        if (l11 == null) {
            return null;
        }
        return (l11.intValue() / 100.0f) + " s";
    }

    public String K() {
        return m(124, "Off", "On");
    }

    public String K0() {
        return u(2, 2);
    }

    public String L() {
        return l(40, 1, "Off", "Warm", "Cool", "Black & White", "Sepia");
    }

    public String L0() {
        return l(3, 1, "Auto", "Daylight", "Cloudy", "Incandescent", "Manual", null, null, "Flash", null, "Black & White", "Manual", "Shade");
    }

    public String M() {
        return m(50, "Normal", "Natural", "Vivid");
    }

    public String M0() {
        return l(58, 1, "Home", "Destination");
    }

    public String N() {
        return m(57, "Normal");
    }

    public String O() {
        Integer l11 = ((n0) this.f9060a).l(44);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 6) {
                        if (intValue != 7) {
                            if (intValue != 256) {
                                if (intValue != 272) {
                                    if (intValue != 288) {
                                        return "Unknown (" + l11 + ")";
                                    }
                                    return "High";
                                }
                                return "Normal";
                            }
                            return "Low";
                        }
                        return "Medium High";
                    }
                    return "Medium Low";
                }
                return "High";
            }
            return "Low";
        }
        return "Normal";
    }

    public String P() {
        return l(53, 1, "Off", "Wide", "Telephoto", "Macro");
    }

    public String Q() {
        return N0(t(105, bc.e.f7596a));
    }

    public String R() {
        return v(((n0) this.f9060a).W());
    }

    public String S() {
        return u(38, 2);
    }

    public String T() {
        return m(72, "n/a", "1st", "2nd");
    }

    public String U() {
        return l(32775, 1, "Off", "On");
    }

    public String V() {
        return m(98, "No", "Yes (Flash required but disabled)");
    }

    public String W() {
        return l(7, 1, "Auto", "Manual", null, "Auto, Focus Button", "Auto, Continuous");
    }

    public String X() {
        Integer l11 = ((n0) this.f9060a).l(158);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != 0 ? intValue != 100 ? intValue != 200 ? intValue != 300 ? intValue != 32868 ? intValue != 32968 ? intValue != 33068 ? String.format("Unknown (%d)", l11) : "3 EV (Auto)" : "2 EV (Auto)" : "1 EV (Auto)" : "3 EV" : "2 EV" : "1 EV" : "Off";
    }

    public String Y() {
        return l(26, 2, "On, Mode 1", "Off", "On, Mode 2");
    }

    public String Z() {
        return m(121, "Off", "Low", "Standard", "High");
    }

    public String a0() {
        return m(93, "Off", "Low", "Standard", "High");
    }

    public String b0() {
        return m(112, "Off", null, "Auto", "On");
    }

    public String c0() {
        return b(37);
    }

    public String d0() {
        return N0(t(111, bc.e.f7596a));
    }

    public String e0() {
        byte[] e11 = ((n0) this.f9060a).e(96);
        if (e11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < e11.length; i11++) {
            sb2.append((int) e11[i11]);
            if (i11 < e11.length - 1) {
                sb2.append(".");
            }
        }
        return sb2.toString();
    }

    @Override // cc.h
    public String f(int i11) {
        switch (i11) {
            case 1:
                return n0();
            case 2:
                return K0();
            case 3:
                return L0();
            case 7:
                return W();
            case 15:
                return A();
            case 26:
                return Y();
            case 28:
                return h0();
            case 31:
                return p0();
            case 32:
                return C();
            case 33:
                return I0();
            case 37:
                return c0();
            case 38:
                return S();
            case 40:
                return L();
            case 41:
                return J0();
            case 42:
                return H();
            case 44:
                return O();
            case 45:
                return j0();
            case 46:
                return t0();
            case 48:
                return r0();
            case 49:
                return B();
            case 50:
                return M();
            case 51:
                return E();
            case 52:
                return k0();
            case 53:
                return P();
            case 57:
                return N();
            case 58:
                return M0();
            case 59:
                return B0();
            case 61:
                return z();
            case 62:
                return y0();
            case 69:
                return G();
            case 72:
                return T();
            case 73:
                return g0();
            case 78:
                return R();
            case 89:
                return G0();
            case 93:
                return a0();
            case 96:
                return e0();
            case 97:
                return o0();
            case 98:
                return V();
            case 101:
                return D0();
            case 102:
                return F();
            case 103:
                return f0();
            case 105:
                return Q();
            case 107:
                return w0();
            case 109:
                return J();
            case 111:
                return d0();
            case 112:
                return b0();
            case 121:
                return Z();
            case 124:
                return K();
            case 137:
                return l0();
            case 138:
                return u0();
            case 140:
                return y();
            case 141:
                return w();
            case 142:
                return x();
            case 143:
                return I();
            case 144:
                return q0();
            case 145:
                return m0();
            case 147:
                return x0();
            case 150:
                return C0();
            case 158:
                return X();
            case 159:
                return v0();
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                return E0();
            case 32768:
                return i0();
            case 32769:
                return s0();
            case 32775:
                return U();
            case 32776:
                return z0();
            case 32777:
                return A0();
            case 32784:
                return D();
            case 32786:
                return F0();
            default:
                return super.f(i11);
        }
    }

    public String f0() {
        return N0(t(103, bc.e.f7596a));
    }

    public String g0() {
        return l(73, 1, "Off", "On");
    }

    public String h0() {
        return l(28, 1, "Off", "On");
    }

    public String i0() {
        return u(32768, 2);
    }

    public String j0() {
        return m(45, "Standard (0)", "Low (-1)", "High (+1)", "Lowest (-2)", "Highest (+2)");
    }

    public String k0() {
        return l(52, 1, "Standard", "Extended");
    }

    public String l0() {
        return m(137, "Auto", "Standard or Custom", "Vivid", "Natural", "Monochrome", "Scenery", "Portrait");
    }

    public String m0() {
        Integer l11 = ((n0) this.f9060a).l(145);
        if (l11 == null) {
            return null;
        }
        return new DecimalFormat("0.#").format((-l11.shortValue()) / 10.0d);
    }

    public String n0() {
        return l(1, 2, "High", "Normal", null, null, "Very High", "Raw", null, "Motion Picture");
    }

    public String o0() {
        return v(((n0) this.f9060a).X());
    }

    public String p0() {
        return l(31, 1, f30335b);
    }

    public String q0() {
        Integer l11 = ((n0) this.f9060a).l(144);
        if (l11 == null) {
            return null;
        }
        return new DecimalFormat("0.#").format(l11.shortValue() / 10.0d);
    }

    public String r0() {
        Integer l11 = ((n0) this.f9060a).l(48);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 1) {
            if (intValue != 3) {
                if (intValue != 6) {
                    if (intValue != 8) {
                        return "Unknown (" + l11 + ")";
                    }
                    return "Rotate 270 CW";
                }
                return "Rotate 90 CW";
            }
            return "Rotate 180";
        }
        return "Horizontal";
    }

    public String s0() {
        return l(32769, 1, f30335b);
    }

    public String t0() {
        return l(46, 1, "Off", "10 s", "2 s");
    }

    public String u0() {
        return m(138, "Off", "On");
    }

    public String v0() {
        return m(159, "Mechanical", "Electronic", "Hybrid");
    }

    public String w() {
        Integer l11 = ((n0) this.f9060a).l(141);
        if (l11 == null) {
            return null;
        }
        return String.valueOf((int) l11.shortValue());
    }

    public String w0() {
        return N0(t(107, bc.e.f7596a));
    }

    public String x() {
        Integer l11 = ((n0) this.f9060a).l(142);
        if (l11 == null) {
            return null;
        }
        return String.valueOf((int) l11.shortValue());
    }

    public String x0() {
        return m(147, "Off", "Left to Right", "Right to Left", "Top to Bottom", "Bottom to Top");
    }

    public String y() {
        Integer l11 = ((n0) this.f9060a).l(140);
        if (l11 == null) {
            return null;
        }
        return String.valueOf((int) l11.shortValue());
    }

    public String y0() {
        return l(62, 1, "Off", "On");
    }

    public String z() {
        return l(61, 1, "Normal", "Outdoor/Illuminations/Flower/HDR Art", "Indoor/Architecture/Objects/HDR B&W", "Creative", "Auto", null, "Expressive", "Retro", "Pure", "Elegant", null, "Monochrome", "Dynamic Art", "Silhouette");
    }

    public String z0() {
        return l(32776, 1, "Off", "On");
    }
}