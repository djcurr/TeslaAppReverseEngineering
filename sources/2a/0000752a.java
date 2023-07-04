package ic;

/* loaded from: classes.dex */
public class i extends cc.h<j> {
    public i(j jVar) {
        super(jVar);
    }

    private String M() {
        return u(0, 2);
    }

    public String A() {
        return l(5120, 1, "Standard", null, "Wide");
    }

    public String B() {
        Integer l11 = ((j) this.f9060a).l(5122);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 256) {
                    if (intValue != 32768) {
                        if (intValue != 512) {
                            if (intValue != 513) {
                                return "Unknown (" + l11 + ")";
                            }
                            return "Wide 2 (400%)";
                        }
                        return "Wide 1 (230%)";
                    }
                    return "Film Simulation";
                }
                return "Standard (100%)";
            }
            return "Manual";
        }
        return "Auto (100-400%)";
    }

    public String C() {
        return m(4147, "Auto", "Manual");
    }

    public String D() {
        Integer l11 = ((j) this.f9060a).l(4148);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 256) {
            if (intValue != 512) {
                if (intValue != 768) {
                    return "Unknown (" + l11 + ")";
                }
                return "DR (Dynamic Range Priority)";
            }
            return "SN (Signal to Noise Priority)";
        }
        return "HR (High Resolution)";
    }

    public String E() {
        Integer l11 = ((j) this.f9060a).l(5121);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 256) {
                if (intValue != 272) {
                    if (intValue != 288) {
                        if (intValue != 304) {
                            if (intValue != 512) {
                                if (intValue != 768) {
                                    if (intValue != 1024) {
                                        if (intValue != 1280) {
                                            if (intValue != 1281) {
                                                return "Unknown (" + l11 + ")";
                                            }
                                            return "Pro Neg. Hi";
                                        }
                                        return "Pro Neg. Std";
                                    }
                                    return "F4/Velvia";
                                }
                                return "F3/Studio Portrait Ex";
                            }
                            return "F2/Fujichrome (Velvia)";
                        }
                        return "F1c/Studio Portrait Increased Sharpness";
                    }
                    return "F1b/Studio Portrait Smooth Skin Tone (Astia)";
                }
                return "F1a/Studio Portrait Enhanced Saturation";
            }
            return "F1/Studio Portrait";
        }
        return "F0/Standard (Provia) ";
    }

    public String F() {
        Integer l11 = ((j) this.f9060a).l(4624);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 16) {
                if (intValue != 48) {
                    return "Unknown (" + l11 + ")";
                }
                return "B&W";
            }
            return "Chrome";
        }
        return "Standard";
    }

    public String G() {
        bc.k p11 = ((j) this.f9060a).p(4113);
        if (p11 == null) {
            return null;
        }
        return p11.k(false) + " EV (Apex)";
    }

    public String H() {
        return m(4112, "Auto", "On", "Off", "Red-eye Reduction", "External");
    }

    public String I() {
        return m(4129, "Auto Focus", "Manual Focus");
    }

    public String J() {
        return m(4865, "Good Focus", "Out Of Focus");
    }

    public String K() {
        Integer l11 = ((j) this.f9060a).l(4110);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 256) {
                if (intValue != 512) {
                    return "Unknown (" + l11 + ")";
                }
                return "Weak";
            }
            return "Strong";
        }
        return "Normal";
    }

    public String L() {
        return m(4128, "Off", "On");
    }

    public String N() {
        Integer l11 = ((j) this.f9060a).l(4107);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 64) {
            if (intValue != 128) {
                if (intValue != 256) {
                    return "Unknown (" + l11 + ")";
                }
                return "N/A";
            }
            return "Normal";
        }
        return "Low";
    }

    public String O() {
        Integer l11 = ((j) this.f9060a).l(4145);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 27) {
            if (intValue != 28) {
                if (intValue != 256) {
                    if (intValue != 512) {
                        if (intValue != 768) {
                            switch (intValue) {
                                case 0:
                                    return "Auto";
                                case 1:
                                    return "Portrait scene";
                                case 2:
                                    return "Landscape scene";
                                case 3:
                                    return "Macro";
                                case 4:
                                    return "Sports scene";
                                case 5:
                                    return "Night scene";
                                case 6:
                                    return "Program AE";
                                case 7:
                                    return "Natural Light";
                                case 8:
                                    return "Anti-blur";
                                case 9:
                                    return "Beach & Snow";
                                case 10:
                                    return "Sunset";
                                case 11:
                                    return "Museum";
                                case 12:
                                    return "Party";
                                case 13:
                                    return "Flower";
                                case 14:
                                    return "Text";
                                case 15:
                                    return "Natural Light & Flash";
                                case 16:
                                    return "Beach";
                                case 17:
                                    return "Snow";
                                case 18:
                                    return "Fireworks";
                                case 19:
                                    return "Underwater";
                                case 20:
                                    return "Portrait with Skin Correction";
                                default:
                                    switch (intValue) {
                                        case 22:
                                            return "Panorama";
                                        case 23:
                                            return "Night (Tripod)";
                                        case 24:
                                            return "Pro Low-light";
                                        case 25:
                                            return "Pro Focus";
                                        default:
                                            return "Unknown (" + l11 + ")";
                                    }
                            }
                        }
                        return "Manual exposure";
                    }
                    return "Shutter priority AE";
                }
                return "Aperture priority AE";
            }
            return "Cat Face Detection";
        }
        return "Dog Face Detection";
    }

    public String P() {
        Integer l11 = ((j) this.f9060a).l(4097);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue != 5) {
                            if (intValue != 130) {
                                if (intValue != 132) {
                                    if (intValue != 32768) {
                                        if (intValue != 65535) {
                                            return "Unknown (" + l11 + ")";
                                        }
                                        return "N/A";
                                    }
                                    return "Film Simulation";
                                }
                                return "Medium Hard";
                            }
                            return "Medium Soft";
                        }
                        return "Hardest";
                    }
                    return "Hard";
                }
                return "Normal";
            }
            return "Soft";
        }
        return "Softest";
    }

    public String Q() {
        return m(4144, "Off", "On");
    }

    public String R() {
        Integer l11 = ((j) this.f9060a).l(4100);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 128) {
                if (intValue != 256) {
                    if (intValue != 384) {
                        if (intValue != 512) {
                            if (intValue != 768) {
                                if (intValue != 32768) {
                                    return "Unknown (" + l11 + ")";
                                }
                                return "Film Simulation";
                            }
                            return "None (B&W)";
                        }
                        return "Low";
                    }
                    return "Medium Low";
                }
                return "High";
            }
            return "Medium High";
        }
        return "Normal";
    }

    public String S() {
        Integer l11 = ((j) this.f9060a).l(4098);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 256) {
                if (intValue != 512) {
                    if (intValue != 1024) {
                        if (intValue != 1280) {
                            if (intValue != 4080) {
                                switch (intValue) {
                                    case 768:
                                        return "Daylight Fluorescent";
                                    case 769:
                                        return "Day White Fluorescent";
                                    case 770:
                                        return "White Fluorescent";
                                    case 771:
                                        return "Warm White Fluorescent";
                                    case 772:
                                        return "Living Room Warm White Fluorescent";
                                    default:
                                        switch (intValue) {
                                            case 3840:
                                                return "Custom White Balance";
                                            case 3841:
                                                return "Custom White Balance 2";
                                            case 3842:
                                                return "Custom White Balance 3";
                                            case 3843:
                                                return "Custom White Balance 4";
                                            case 3844:
                                                return "Custom White Balance 5";
                                            default:
                                                return "Unknown (" + l11 + ")";
                                        }
                                }
                            }
                            return "Kelvin";
                        }
                        return "Flash";
                    }
                    return "Incandescence";
                }
                return "Cloudy";
            }
            return "Daylight";
        }
        return "Auto";
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            if (i11 != 4102) {
                if (i11 != 4107) {
                    if (i11 != 4110) {
                        if (i11 != 4352) {
                            if (i11 != 4624) {
                                if (i11 != 4112) {
                                    if (i11 != 4113) {
                                        if (i11 != 4128) {
                                            if (i11 != 4129) {
                                                if (i11 != 4144) {
                                                    if (i11 != 4145) {
                                                        if (i11 != 4147) {
                                                            if (i11 != 4148) {
                                                                switch (i11) {
                                                                    case 4097:
                                                                        return P();
                                                                    case 4098:
                                                                        return S();
                                                                    case 4099:
                                                                        return y();
                                                                    case 4100:
                                                                        return R();
                                                                    default:
                                                                        switch (i11) {
                                                                            case 4864:
                                                                                return x();
                                                                            case 4865:
                                                                                return J();
                                                                            case 4866:
                                                                                return w();
                                                                            default:
                                                                                switch (i11) {
                                                                                    case 5120:
                                                                                        return A();
                                                                                    case 5121:
                                                                                        return E();
                                                                                    case 5122:
                                                                                        return B();
                                                                                    default:
                                                                                        return super.f(i11);
                                                                                }
                                                                        }
                                                                }
                                                            }
                                                            return D();
                                                        }
                                                        return C();
                                                    }
                                                    return O();
                                                }
                                                return Q();
                                            }
                                            return I();
                                        }
                                        return L();
                                    }
                                    return G();
                                }
                                return H();
                            }
                            return F();
                        }
                        return v();
                    }
                    return K();
                }
                return N();
            }
            return z();
        }
        return M();
    }

    public String v() {
        return m(4352, "Off", "On", "No Flash & Flash");
    }

    public String w() {
        return m(4866, "AE Good", "Over Exposed");
    }

    public String x() {
        return m(4864, "No Blur Warning", "Blur warning");
    }

    public String y() {
        Integer l11 = ((j) this.f9060a).l(4099);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 128) {
                if (intValue != 256) {
                    if (intValue != 384) {
                        if (intValue != 512) {
                            if (intValue != 32768) {
                                switch (intValue) {
                                    case 768:
                                        return "None (B&W)";
                                    case 769:
                                        return "B&W Green Filter";
                                    case 770:
                                        return "B&W Yellow Filter";
                                    case 771:
                                        return "B&W Blue Filter";
                                    case 772:
                                        return "B&W Sepia";
                                    default:
                                        return "Unknown (" + l11 + ")";
                                }
                            }
                            return "Film Simulation";
                        }
                        return "Low";
                    }
                    return "Medium Low";
                }
                return "High";
            }
            return "Medium High";
        }
        return "Normal";
    }

    public String z() {
        Integer l11 = ((j) this.f9060a).l(4102);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 256) {
                if (intValue != 768) {
                    return "Unknown (" + l11 + ")";
                }
                return "Low";
            }
            return "High";
        }
        return "Normal";
    }
}