package ic;

import com.tencent.mm.opensdk.modelbase.BaseResp;

/* loaded from: classes.dex */
public class c1 extends cc.h<d1> {
    public c1(d1 d1Var) {
        super(d1Var);
    }

    public String A() {
        Integer l11 = ((d1) this.f9060a).l(45097);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        switch (intValue) {
            case 0:
                return "Standard";
            case 1:
                return "Vivid";
            case 2:
                return "Portrait";
            case 3:
                return "Landscape";
            case 4:
                return "Sunset";
            case 5:
                return "Night Portrait";
            case 6:
                return "Black & White";
            case 7:
                return "Adobe RGB";
            default:
                switch (intValue) {
                    case 12:
                        return "Neutral";
                    case 13:
                        return "Clear";
                    case 14:
                        return "Deep";
                    case 15:
                        return "Light";
                    case 16:
                        return "Autumn";
                    case 17:
                        return "Sepia";
                    default:
                        switch (intValue) {
                            case 100:
                                return "Neutral";
                            case 101:
                                return "Clear";
                            case 102:
                                return "Deep";
                            case 103:
                                return "Light";
                            case 104:
                                return "Night View";
                            case 105:
                                return "Autumn Leaves";
                            default:
                                return String.format("Unknown (%d)", l11);
                        }
                }
        }
    }

    public String B() {
        Integer l11 = ((d1) this.f9060a).l(45089);
        if (l11 == null) {
            return null;
        }
        return l11.intValue() == 0 ? "Auto" : String.format("%d K", Integer.valueOf(((l11.intValue() & (-16777216)) >> 24) | ((l11.intValue() & 16711680) >> 8)));
    }

    public String C() {
        Integer l11 = ((d1) this.f9060a).l(8211);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != -1 ? intValue != 0 ? intValue != 2 ? String.format("Unknown (%d)", l11) : "Auto" : "Off" : "N/A";
    }

    public String D() {
        Integer l11 = ((d1) this.f9060a).l(45093);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        switch (intValue) {
                            case 8:
                                return "Advanced LV1";
                            case 9:
                                return "Advanced LV2";
                            case 10:
                                return "Advanced LV3";
                            case 11:
                                return "Advanced LV4";
                            case 12:
                                return "Advanced LV5";
                            default:
                                switch (intValue) {
                                    case 16:
                                        return "LV1";
                                    case 17:
                                        return "LV2";
                                    case 18:
                                        return "LV3";
                                    case 19:
                                        return "LV4";
                                    case 20:
                                        return "LV5";
                                    default:
                                        return String.format("Unknown (%d)", l11);
                                }
                        }
                    }
                    return "Auto";
                }
                return "Advanced Auto";
            }
            return "Standard";
        }
        return "Off";
    }

    public String E() {
        Integer l11 = ((d1) this.f9060a).l(45121);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 29) {
            if (intValue != 65535) {
                switch (intValue) {
                    case 0:
                        return "Program";
                    case 1:
                        return "Portrait";
                    case 2:
                        return "Beach";
                    case 3:
                        return "Sports";
                    case 4:
                        return "Snow";
                    case 5:
                        return "Landscape";
                    case 6:
                        return "Auto";
                    case 7:
                        return "Aperture Priority";
                    case 8:
                        return "Shutter Priority";
                    case 9:
                        return "Night Scene / Twilight";
                    case 10:
                        return "Hi-Speed Shutter";
                    case 11:
                        return "Twilight Portrait";
                    case 12:
                        return "Soft Snap/Portrait";
                    case 13:
                        return "Fireworks";
                    case 14:
                        return "Smile Shutter";
                    case 15:
                        return "Manual";
                    default:
                        switch (intValue) {
                            case 18:
                                return "High Sensitivity";
                            case 19:
                                return "Macro";
                            case 20:
                                return "Advanced Sports Shooting";
                            default:
                                switch (intValue) {
                                    case 33:
                                        return "Food";
                                    case 34:
                                        return "Panorama";
                                    case 35:
                                        return "Handheld Night Shot";
                                    case 36:
                                        return "Anti Motion Blur";
                                    case 37:
                                        return "Pet";
                                    case 38:
                                        return "Backlight Correction HDR";
                                    case 39:
                                        return "Superior Auto";
                                    case 40:
                                        return "Background Defocus";
                                    case 41:
                                        return "Soft Skin";
                                    case 42:
                                        return "3D Image";
                                    default:
                                        return String.format("Unknown (%d)", l11);
                                }
                        }
                }
            }
            return "N/A";
        }
        return "Underwater";
    }

    public String F() {
        return j(260, "%d EV");
    }

    public String G() {
        Integer l11 = ((d1) this.f9060a).l(45128);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != -32768) {
            if (intValue != 128) {
                if (intValue != 32767) {
                    switch (intValue) {
                        case BaseResp.ErrCode.ERR_SENT_FAILED /* -3 */:
                            return "-3/3";
                        case -2:
                            return "-2/3";
                        case -1:
                            return "-1/3";
                        case 0:
                            return "Normal";
                        case 1:
                            return "+1/3";
                        case 2:
                            return "+2/3";
                        case 3:
                            return "+3/3";
                        default:
                            return "Unknown (" + l11 + ")";
                    }
                }
                return "High";
            }
            return "n/a";
        }
        return "Low";
    }

    public String H() {
        return m(8219, "Manual", null, "AF-A", "AF-C", "AF-S", null, "DMF", "AF-D");
    }

    public String I() {
        Integer l11 = ((d1) this.f9060a).l(8201);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 256 ? intValue != 65535 ? String.format("Unknown (%d)", l11) : "N/A" : "Auto" : "High" : "Normal" : "On" : "Off";
    }

    public String J() {
        return m(258, "RAW", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine", "RAW + JPEG", "Compressed RAW", "Compressed RAW + JPEG");
    }

    public String K() {
        Integer l11 = ((d1) this.f9060a).l(45094);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != 0 ? intValue != 1 ? "N/A" : "On" : "Off";
    }

    public String L() {
        Integer l11 = ((d1) this.f9060a).l(45127);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 65535 ? String.format("Unknown (%d)", l11) : "N/A" : "Extra Fine" : "Fine" : "Normal";
    }

    public String M() {
        Integer l11 = ((d1) this.f9060a).l(8210);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != -1 ? intValue != 0 ? intValue != 2 ? String.format("Unknown (%d)", l11) : "Auto" : "Off" : "N/A";
    }

    public String N() {
        Integer l11 = ((d1) this.f9060a).l(45134);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 65535 ? String.format("Unknown (%d)", l11) : "N/A" : "On" : "Off";
    }

    public String O() {
        Integer l11 = ((d1) this.f9060a).l(45120);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 65535 ? String.format("Unknown (%d)", l11) : "N/A" : "Magnifying Glass/Super Macro" : "On" : "Off";
    }

    public String P() {
        Integer l11 = ((d1) this.f9060a).l(8206);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 13) {
            if (intValue != 80) {
                if (intValue != 97) {
                    if (intValue != 98) {
                        switch (intValue) {
                            case 0:
                                return "Off";
                            case 1:
                                return "Toy Camera";
                            case 2:
                                return "Pop Color";
                            case 3:
                                return "Posterization";
                            case 4:
                                return "Posterization B/W";
                            case 5:
                                return "Retro Photo";
                            case 6:
                                return "Soft High Key";
                            case 7:
                                return "Partial Color (red)";
                            case 8:
                                return "Partial Color (green)";
                            case 9:
                                return "Partial Color (blue)";
                            case 10:
                                return "Partial Color (yellow)";
                            default:
                                switch (intValue) {
                                    case 16:
                                        return "Toy Camera (normal)";
                                    case 17:
                                        return "Toy Camera (cool)";
                                    case 18:
                                        return "Toy Camera (warm)";
                                    case 19:
                                        return "Toy Camera (green)";
                                    case 20:
                                        return "Toy Camera (magenta)";
                                    default:
                                        switch (intValue) {
                                            case 32:
                                                return "Soft Focus (low)";
                                            case 33:
                                                return "Soft Focus";
                                            case 34:
                                                return "Soft Focus (high)";
                                            default:
                                                switch (intValue) {
                                                    case 48:
                                                        return "Miniature (auto)";
                                                    case 49:
                                                        return "Miniature (top)";
                                                    case 50:
                                                        return "Miniature (middle horizontal)";
                                                    case 51:
                                                        return "Miniature (bottom)";
                                                    case 52:
                                                        return "Miniature (left)";
                                                    case 53:
                                                        return "Miniature (middle vertical)";
                                                    case 54:
                                                        return "Miniature (right)";
                                                    default:
                                                        switch (intValue) {
                                                            case 64:
                                                                return "HDR Painting (low)";
                                                            case 65:
                                                                return "HDR Painting";
                                                            case 66:
                                                                return "HDR Painting (high)";
                                                            default:
                                                                switch (intValue) {
                                                                    case 112:
                                                                        return "Illustration (low)";
                                                                    case 113:
                                                                        return "Illustration";
                                                                    case 114:
                                                                        return "Illustration (high)";
                                                                    default:
                                                                        return String.format("Unknown (%d)", l11);
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    }
                    return "Water Color 2";
                }
                return "Water Color";
            }
            return "Rich-tone Monochrome";
        }
        return "High Contrast Monochrome";
    }

    public String Q() {
        Integer l11 = ((d1) this.f9060a).l(45129);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 65535) {
                    if (intValue != 5) {
                        if (intValue != 6) {
                            return "Unknown (" + l11 + ")";
                        }
                        return "White Balance Bracketing";
                    }
                    return "Exposure Bracketing";
                }
                return "n/a";
            }
            return "Continuous";
        }
        return "Normal";
    }

    public String R() {
        Integer l11 = ((d1) this.f9060a).l(45091);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        switch (intValue) {
            case 0:
                return "Standard";
            case 1:
                return "Portrait";
            case 2:
                return "Text";
            case 3:
                return "Night Scene";
            case 4:
                return "Sunset";
            case 5:
                return "Sports";
            case 6:
                return "Landscape";
            case 7:
                return "Night Portrait";
            case 8:
                return "Macro";
            case 9:
                return "Super Macro";
            default:
                switch (intValue) {
                    case 16:
                        return "Auto";
                    case 17:
                        return "Night View/Portrait";
                    case 18:
                        return "Sweep Panorama";
                    case 19:
                        return "Handheld Night Shot";
                    case 20:
                        return "Anti Motion Blur";
                    case 21:
                        return "Cont. Priority AE";
                    case 22:
                        return "Auto+";
                    case 23:
                        return "3D Sweep Panorama";
                    case 24:
                        return "Superior Auto";
                    case 25:
                        return "High Sensitivity";
                    case 26:
                        return "Fireworks";
                    case 27:
                        return "Food";
                    case 28:
                        return "Pet";
                    default:
                        return "Unknown (" + l11 + ")";
                }
        }
    }

    public String S() {
        Integer l11 = ((d1) this.f9060a).l(45129);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != 0 ? intValue != 65535 ? l11.toString() : "n/a" : "Single";
    }

    public String T() {
        return m(8207, "Off", "Low", "Mid", "High");
    }

    public String U() {
        Integer l11 = ((d1) this.f9060a).l(45057);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 2) {
            if (intValue != 269) {
                if (intValue != 270) {
                    switch (intValue) {
                        case 256:
                            return "DSLR-A100";
                        case 257:
                            return "DSLR-A900";
                        case 258:
                            return "DSLR-A700";
                        case 259:
                            return "DSLR-A200";
                        case 260:
                            return "DSLR-A350";
                        case 261:
                            return "DSLR-A300";
                        case 262:
                            return "DSLR-A900 (APS-C mode)";
                        case 263:
                            return "DSLR-A380/A390";
                        case 264:
                            return "DSLR-A330";
                        case 265:
                            return "DSLR-A230";
                        case 266:
                            return "DSLR-A290";
                        default:
                            switch (intValue) {
                                case 273:
                                    return "DSLR-A550";
                                case 274:
                                    return "DSLR-A500";
                                case 275:
                                    return "DSLR-A450";
                                default:
                                    switch (intValue) {
                                        case 278:
                                            return "NEX-5";
                                        case 279:
                                            return "NEX-3";
                                        case 280:
                                            return "SLT-A33";
                                        case 281:
                                            return "SLT-A55V";
                                        case 282:
                                            return "DSLR-A560";
                                        case 283:
                                            return "DSLR-A580";
                                        case 284:
                                            return "NEX-C3";
                                        case 285:
                                            return "SLT-A35";
                                        case 286:
                                            return "SLT-A65V";
                                        case 287:
                                            return "SLT-A77V";
                                        case 288:
                                            return "NEX-5N";
                                        case 289:
                                            return "NEX-7";
                                        case 290:
                                            return "NEX-VG20E";
                                        case 291:
                                            return "SLT-A37";
                                        case 292:
                                            return "SLT-A57";
                                        case 293:
                                            return "NEX-F3";
                                        case 294:
                                            return "SLT-A99V";
                                        case 295:
                                            return "NEX-6";
                                        case 296:
                                            return "NEX-5R";
                                        case 297:
                                            return "DSC-RX100";
                                        case 298:
                                            return "DSC-RX1";
                                        default:
                                            return "Unknown (" + l11 + ")";
                                    }
                            }
                    }
                }
                return "DSLR-A850 (APS-C mode)";
            }
            return "DSLR-A850";
        }
        return "DSC-R1";
    }

    public String V() {
        Integer l11 = ((d1) this.f9060a).l(261);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 72) {
                if (intValue != 80) {
                    if (intValue != 96) {
                        if (intValue != 136) {
                            if (intValue != 144) {
                                if (intValue != 160) {
                                    return "Unknown (" + l11 + ")";
                                }
                                return "Minolta AF 1.4x APO";
                            }
                            return "Minolta AF 1.4x APO II";
                        }
                        return "Minolta/Sony AF 1.4x APO (D)";
                    }
                    return "Minolta AF 2x APO";
                }
                return "Minolta AF 2x APO II";
            }
            return "Minolta/Sony AF 2x APO (D)";
        }
        return "None";
    }

    public String W() {
        Integer l11 = ((d1) this.f9060a).l(8209);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != -1 ? intValue != 0 ? intValue != 2 ? String.format("Unknown (%d)", l11) : "Auto" : "Off" : "N/A";
    }

    public String X() {
        Integer l11 = ((d1) this.f9060a).l(277);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 16) {
                    if (intValue != 32) {
                        if (intValue != 48) {
                            if (intValue != 64) {
                                if (intValue != 80) {
                                    if (intValue != 96) {
                                        if (intValue != 112) {
                                            return "Unknown (" + l11 + ")";
                                        }
                                        return "Custom";
                                    }
                                    return "Fluorescent";
                                }
                                return "Flash";
                            }
                            return "Tungsten";
                        }
                        return "Shade";
                    }
                    return "Cloudy";
                }
                return "Daylight";
            }
            return "Color Temperature/Color Filter";
        }
        return "Auto";
    }

    public String Y() {
        return m(45092, "ISO Setting Used", "High Key", "Low Key");
    }

    @Override // cc.h
    public String f(int i11) {
        switch (i11) {
            case 258:
                return J();
            case 260:
                return F();
            case 261:
                return V();
            case 277:
                return X();
            case 8201:
                return I();
            case 8206:
                return P();
            case 8207:
                return T();
            case 8209:
                return W();
            case 8210:
                return M();
            case 8211:
                return C();
            case 8214:
                return z();
            case 8219:
                return H();
            case 8222:
                return x();
            case 45057:
                return U();
            case 45089:
                return B();
            case 45091:
                return R();
            case 45092:
                return Y();
            case 45093:
                return D();
            case 45094:
                return K();
            case 45097:
                return A();
            case 45120:
                return O();
            case 45121:
                return E();
            case 45123:
                return w();
            case 45124:
                return v();
            case 45127:
                return L();
            case 45128:
                return G();
            case 45129:
                return Q();
            case 45130:
                return S();
            case 45131:
                return y();
            case 45134:
                return N();
            default:
                return super.f(i11);
        }
    }

    public String v() {
        Integer l11 = ((d1) this.f9060a).l(45124);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 65535) {
                    return "Unknown (" + l11 + ")";
                }
                return "n/a";
            }
            return "Auto";
        }
        return "Off";
    }

    public String w() {
        Integer l11 = ((d1) this.f9060a).l(45123);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 6) {
                                if (intValue != 65535) {
                                    if (intValue != 14) {
                                        if (intValue != 15) {
                                            return "Unknown (" + l11 + ")";
                                        }
                                        return "Face Detected";
                                    }
                                    return "Manual Focus";
                                }
                                return "n/a";
                            }
                            return "Touch";
                        }
                        return "Flexible Spot";
                    }
                    return "Spot";
                }
                return "Center";
            }
            return "Multi";
        }
        return "Default";
    }

    public String x() {
        return m(8222, "Auto", "Center", "Top", "Upper-right", "Right", "Lower-right", "Bottom", "Lower-left", "Left", "Upper-left\t  \t", "Far Right", "Far Left", "Upper-middle", "Near Right", "Lower-middle", "Near Left", "Upper Far Right", "Lower Far Right", "Lower Far Left", "Upper Far Left");
    }

    public String y() {
        Integer l11 = ((d1) this.f9060a).l(45131);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 65535 ? String.format("Unknown (%d)", l11) : "N/A" : "On (Shooting)" : "On (Continuous)" : "Off";
    }

    public String z() {
        return m(8214, "No", "Yes");
    }
}