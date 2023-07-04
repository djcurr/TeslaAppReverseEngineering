package ic;

import ch.qos.logback.core.net.SyslogConstants;

/* loaded from: classes.dex */
public class y0 extends cc.h<z0> {
    public y0(z0 z0Var) {
        super(z0Var);
    }

    private String A() {
        return m(541, "Off", "On");
    }

    private String B() {
        return m(SyslogConstants.SYSLOG_PORT, "Normal", "Macro", "View", "Manual");
    }

    private String C() {
        return m(537, "Off", "On");
    }

    private String D() {
        return m(531, "Off", "On");
    }

    private String E() {
        return m(535, "Record while down", "Press start, press stop");
    }

    private String F() {
        return m(542, "No", "Yes");
    }

    private String H() {
        return m(543, "Off", "Sport", "TV", "Night", "User 1", "User 2", "Lamp");
    }

    private String I() {
        return m(532, "Off", "On");
    }

    private String J() {
        return m(548, "5 frames/sec", "10 frames/sec", "15 frames/sec", "20 frames/sec");
    }

    private String K() {
        return m(526, "None", "Standard", "Best", "Adjust Exposure");
    }

    private String L() {
        return m(534, "Off", "On");
    }

    private String M() {
        return m(527, "Off", "On");
    }

    private String v() {
        return m(528, "Off", "On");
    }

    private String w() {
        return e(516, 3);
    }

    private String x() {
        return m(539, "Off", "On");
    }

    private String y() {
        return m(549, "Auto", "Force", "Disabled", "Red eye");
    }

    private String z() {
        return m(536, "Off", "On");
    }

    public String G() {
        Integer l11 = ((z0) this.f9060a).l(513);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        switch (intValue) {
            case 0:
                return "Normal/Very Low";
            case 1:
                return "Normal/Low";
            case 2:
                return "Normal/Medium Low";
            case 3:
                return "Normal/Medium";
            case 4:
                return "Normal/Medium High";
            case 5:
                return "Normal/High";
            case 6:
                return "Normal/Very High";
            case 7:
                return "Normal/Super High";
            default:
                switch (intValue) {
                    case 256:
                        return "Fine/Very Low";
                    case 257:
                        return "Fine/Low";
                    case 258:
                        return "Fine/Medium Low";
                    case 259:
                        return "Fine/Medium";
                    case 260:
                        return "Fine/Medium High";
                    case 261:
                        return "Fine/High";
                    case 262:
                        return "Fine/Very High";
                    case 263:
                        return "Fine/Super High";
                    default:
                        switch (intValue) {
                            case 512:
                                return "Super Fine/Very Low";
                            case 513:
                                return "Super Fine/Low";
                            case SyslogConstants.SYSLOG_PORT /* 514 */:
                                return "Super Fine/Medium Low";
                            case 515:
                                return "Super Fine/Medium";
                            case 516:
                                return "Super Fine/Medium High";
                            case 517:
                                return "Super Fine/High";
                            case 518:
                                return "Super Fine/Very High";
                            case 519:
                                return "Super Fine/Super High";
                            default:
                                return "Unknown (" + l11 + ")";
                        }
                }
        }
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 513) {
            if (i11 != 514) {
                if (i11 != 516) {
                    if (i11 != 539) {
                        if (i11 != 531) {
                            if (i11 != 532) {
                                if (i11 != 548) {
                                    if (i11 != 549) {
                                        switch (i11) {
                                            case 526:
                                                return K();
                                            case 527:
                                                return M();
                                            case 528:
                                                return v();
                                            default:
                                                switch (i11) {
                                                    case 534:
                                                        return L();
                                                    case 535:
                                                        return E();
                                                    case 536:
                                                        return z();
                                                    case 537:
                                                        return C();
                                                    default:
                                                        switch (i11) {
                                                            case 541:
                                                                return A();
                                                            case 542:
                                                                return F();
                                                            case 543:
                                                                return H();
                                                            default:
                                                                return super.f(i11);
                                                        }
                                                }
                                        }
                                    }
                                    return y();
                                }
                                return J();
                            }
                            return I();
                        }
                        return D();
                    }
                    return x();
                }
                return w();
            }
            return B();
        }
        return G();
    }
}