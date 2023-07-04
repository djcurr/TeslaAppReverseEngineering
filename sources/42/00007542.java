package ic;

import java.text.DecimalFormat;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class u extends cc.h<v> {
    public u(v vVar) {
        super(vVar);
    }

    private String B(int i11) {
        int[] k11 = ((v) this.f9060a).k(i11);
        if (k11 == null || k11.length < 2 || k11.length < 3 || k11[2] == 0) {
            return null;
        }
        return new DecimalFormat("0.##").format((k11[0] * k11[1]) / k11[2]) + " EV";
    }

    public String A() {
        bc.k p11 = ((v) this.f9060a).p(134);
        if (p11 == null) {
            return null;
        }
        if (p11.intValue() == 1) {
            return "No digital zoom";
        }
        return p11.k(true) + "x digital zoom";
    }

    public String C() {
        return B(14);
    }

    public String D() {
        return B(28);
    }

    public String E() {
        return u(1, 2);
    }

    public String F() {
        return B(24);
    }

    public String G() {
        return B(23);
    }

    public String H() {
        return m(135, "Flash Not Used", "Manual Flash", null, "Flash Not Ready", null, null, null, "External Flash", "Fired, Commander Mode", "Fired, TTL Mode");
    }

    public String I() {
        return m(CipherSuite.TLS_PSK_WITH_NULL_SHA384, "Off", "Minimal", "Low", null, "Normal", null, "High");
    }

    public String J() {
        return k(146, "%s degrees");
    }

    public String K() {
        int[] k11 = ((v) this.f9060a).k(2);
        if (k11 == null) {
            return null;
        }
        if (k11[0] == 0 && k11[1] != 0) {
            return "ISO " + k11[1];
        }
        return "Unknown (" + ((v) this.f9060a).r(2) + ")";
    }

    public String L() {
        return n(132);
    }

    public String M() {
        return B(139);
    }

    public String N() {
        return c(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, new String[]{"AF", "MF"}, "D", "G", "VR");
    }

    public String O() {
        return l(147, 1, "Lossy (Type 1)", null, "Uncompressed", null, null, null, "Lossless", "Lossy (Type 2)");
    }

    public String P() {
        return g(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256);
    }

    public String Q() {
        return B(13);
    }

    public String R() {
        return c(137, new String[]{"Single Frame", "Continuous"}, "Delay", null, "PC Control", "Exposure Bracketing", "Auto ISO", "White-Balance Bracketing", "IR Control");
    }

    public String S() {
        Integer l11 = ((v) this.f9060a).l(42);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 3) {
                    if (intValue != 5) {
                        return "Unknown (" + l11 + ")";
                    }
                    return "High";
                }
                return "Normal";
            }
            return "Low";
        }
        return "Off";
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 13) {
                    if (i11 != 14) {
                        if (i11 != 18) {
                            if (i11 != 28) {
                                if (i11 != 30) {
                                    if (i11 != 34) {
                                        if (i11 != 42) {
                                            if (i11 != 139) {
                                                if (i11 != 141) {
                                                    if (i11 != 177) {
                                                        if (i11 != 182) {
                                                            if (i11 != 23) {
                                                                if (i11 != 24) {
                                                                    if (i11 != 131) {
                                                                        if (i11 != 132) {
                                                                            if (i11 != 146) {
                                                                                if (i11 != 147) {
                                                                                    switch (i11) {
                                                                                        case 134:
                                                                                            return A();
                                                                                        case 135:
                                                                                            return H();
                                                                                        case 136:
                                                                                            return x();
                                                                                        case 137:
                                                                                            return R();
                                                                                        default:
                                                                                            return super.f(i11);
                                                                                    }
                                                                                }
                                                                                return O();
                                                                            }
                                                                            return J();
                                                                        }
                                                                        return L();
                                                                    }
                                                                    return N();
                                                                }
                                                                return F();
                                                            }
                                                            return G();
                                                        }
                                                        return P();
                                                    }
                                                    return I();
                                                }
                                                return y();
                                            }
                                            return M();
                                        }
                                        return S();
                                    }
                                    return v();
                                }
                                return z();
                            }
                            return D();
                        }
                        return w();
                    }
                    return C();
                }
                return Q();
            }
            return K();
        }
        return E();
    }

    public String v() {
        Integer l11 = ((v) this.f9060a).l(34);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 3) {
                    if (intValue != 5) {
                        if (intValue != 7) {
                            if (intValue != 65535) {
                                return "Unknown (" + l11 + ")";
                            }
                            return "Auto";
                        }
                        return "Extra High";
                    }
                    return "High";
                }
                return "Normal";
            }
            return "Light";
        }
        return "Off";
    }

    public String w() {
        return B(18);
    }

    public String x() {
        int[] k11 = ((v) this.f9060a).k(136);
        if (k11 == null) {
            return null;
        }
        if (k11.length == 4 && k11[0] == 0 && k11[2] == 0 && k11[3] == 0) {
            int i11 = k11[1];
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return "Unknown (" + k11[1] + ")";
                            }
                            return "Right";
                        }
                        return "Left";
                    }
                    return "Bottom";
                }
                return "Top";
            }
            return "Centre";
        }
        return "Unknown (" + ((v) this.f9060a).r(136) + ")";
    }

    public String y() {
        String r11 = ((v) this.f9060a).r(141);
        if (r11 == null) {
            return null;
        }
        return r11.startsWith("MODE1") ? "Mode I (sRGB)" : r11;
    }

    public String z() {
        return l(30, 1, "sRGB", "Adobe RGB");
    }
}