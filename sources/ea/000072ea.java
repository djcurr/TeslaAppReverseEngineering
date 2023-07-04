package hc;

import cc.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public abstract class a<T extends cc.b> extends cc.h<T> {
    public a(T t11) {
        super(t11);
    }

    private String D0(int i11) {
        byte[] e11 = this.f9060a.e(i11);
        if (e11 == null) {
            return null;
        }
        try {
            return new String(e11, "UTF-16LE").trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private int[] v(int i11) {
        byte[] e11 = this.f9060a.e(i11);
        if (e11 == null) {
            return null;
        }
        if (e11.length < 4) {
            int[] iArr = new int[e11.length];
            for (int i12 = 0; i12 < e11.length; i12++) {
                iArr[i12] = e11[i12];
            }
            return iArr;
        }
        int[] iArr2 = new int[e11.length - 2];
        try {
            bc.a aVar = new bc.a(e11);
            short f11 = aVar.f(0);
            short f12 = aVar.f(2);
            Boolean bool = Boolean.FALSE;
            if ((f11 * f12) + 2 > e11.length) {
                aVar.w(!aVar.v());
                f11 = aVar.f(0);
                f12 = aVar.f(2);
                if (e11.length >= (f11 * f12) + 2) {
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.TRUE;
            }
            if (bool.booleanValue()) {
                iArr2[0] = f11;
                iArr2[1] = f12;
                for (int i13 = 4; i13 < e11.length; i13++) {
                    iArr2[i13 - 2] = aVar.j(i13);
                }
            }
        } catch (IOException e12) {
            T t11 = this.f9060a;
            t11.a("IO exception processing data: " + e12.getMessage());
        }
        return iArr2;
    }

    private static String w(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length < 2) {
            return "<truncated data>";
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return "<zero pattern size>";
        }
        int i11 = (iArr[0] * iArr[1]) + 2;
        if (i11 > iArr.length) {
            return "<invalid pattern size>";
        }
        String[] strArr = {"Red", "Green", "Blue", "Cyan", "Magenta", "Yellow", "White"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (int i12 = 2; i12 < i11; i12++) {
            if (iArr[i12] <= 6) {
                sb2.append(strArr[iArr[i12]]);
            } else {
                sb2.append("Unknown");
            }
            if ((i12 - 2) % iArr[1] == 0) {
                sb2.append(",");
            } else if (i12 != i11 - 1) {
                sb2.append("][");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public String A() {
        byte[] e11 = this.f9060a.e(33422);
        if (e11 == null) {
            return null;
        }
        int[] k11 = this.f9060a.k(33421);
        if (k11 == null) {
            return String.format("Repeat Pattern not found for CFAPattern (%s)", super.f(33422));
        }
        if (k11.length == 2 && e11.length == k11[0] * k11[1]) {
            int[] iArr = new int[e11.length + 2];
            iArr[0] = k11[0];
            iArr[1] = k11[1];
            for (int i11 = 0; i11 < e11.length; i11++) {
                iArr[i11 + 2] = e11[i11] & 255;
            }
            return w(iArr);
        }
        return String.format("Unknown Pattern (%s)", super.f(33422));
    }

    public String A0() {
        bc.k p11 = this.f9060a.p(37382);
        if (p11 == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.0##");
        return decimalFormat.format(p11.doubleValue()) + " metres";
    }

    public String B() {
        return w(v(41730));
    }

    public String B0() {
        return m(41996, "Unknown", "Macro", "Close view", "Distant view");
    }

    public String C() {
        Integer l11 = this.f9060a.l(40961);
        if (l11 == null) {
            return null;
        }
        if (l11.intValue() == 1) {
            return "sRGB";
        }
        if (l11.intValue() == 65535) {
            return "Undefined";
        }
        return "Unknown (" + l11 + ")";
    }

    public String C0() {
        return l(263, 1, "No dithering or halftoning", "Ordered dither or halftone", "Randomized dither");
    }

    public String D() {
        int[] k11 = this.f9060a.k(37121);
        if (k11 == null) {
            return null;
        }
        String[] strArr = {"", "Y", "Cb", "Cr", "R", "G", "B"};
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < Math.min(4, k11.length); i11++) {
            int i12 = k11[i11];
            if (i12 > 0 && i12 < 7) {
                sb2.append(strArr[i12]);
            }
        }
        return sb2.toString();
    }

    public String E() {
        StringBuilder sb2;
        String str;
        bc.k p11 = this.f9060a.p(37122);
        if (p11 == null) {
            return null;
        }
        String k11 = p11.k(true);
        if (p11.h() && p11.intValue() == 1) {
            sb2 = new StringBuilder();
            sb2.append(k11);
            str = " bit/pixel";
        } else {
            sb2 = new StringBuilder();
            sb2.append(k11);
            str = " bits/pixel";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public String E0() {
        byte[] e11 = this.f9060a.e(37510);
        if (e11 == null) {
            return null;
        }
        if (e11.length == 0) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ASCII", System.getProperty("file.encoding"));
        hashMap.put("UNICODE", "UTF-16LE");
        hashMap.put("JIS", "Shift-JIS");
        try {
            if (e11.length >= 10) {
                String str = new String(e11, 0, 10);
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    if (str.startsWith(str2)) {
                        for (int length = str2.length(); length < 10; length++) {
                            byte b11 = e11[length];
                            if (b11 != 0 && b11 != 32) {
                                return new String(e11, length, e11.length - length, str3).trim();
                            }
                        }
                        return new String(e11, 10, e11.length - 10, str3).trim();
                    }
                }
            }
            return new String(e11, System.getProperty("file.encoding")).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public String F() {
        Integer l11 = this.f9060a.l(259);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 32766) {
            if (intValue != 32767) {
                switch (intValue) {
                    case 1:
                        return "Uncompressed";
                    case 2:
                        return "CCITT 1D";
                    case 3:
                        return "T4/Group 3 Fax";
                    case 4:
                        return "T6/Group 4 Fax";
                    case 5:
                        return "LZW";
                    case 6:
                        return "JPEG (old-style)";
                    case 7:
                        return "JPEG";
                    case 8:
                        return "Adobe Deflate";
                    case 9:
                        return "JBIG B&W";
                    case 10:
                        return "JBIG Color";
                    default:
                        switch (intValue) {
                            case 99:
                                return "JPEG";
                            case 262:
                                return "Kodak 262";
                            case 32809:
                                return "Thunderscan";
                            case 32867:
                                return "Kodak KDC Compressed";
                            case 34661:
                                return "JBIG";
                            case 34715:
                                return "JBIG2 TIFF FX";
                            case 34892:
                                return "Lossy JPEG";
                            case 65000:
                                return "Kodak DCR Compressed";
                            case Settings.DEFAULT_INITIAL_WINDOW_SIZE /* 65535 */:
                                return "Pentax PEF Compressed";
                            default:
                                switch (intValue) {
                                    case 32769:
                                        return "Packed RAW";
                                    case 32770:
                                        return "Samsung SRW Compressed";
                                    case 32771:
                                        return "CCIRLEW";
                                    case 32772:
                                        return "Samsung SRW Compressed 2";
                                    case 32773:
                                        return "PackBits";
                                    default:
                                        switch (intValue) {
                                            case 32895:
                                                return "IT8CTPAD";
                                            case 32896:
                                                return "IT8LW";
                                            case 32897:
                                                return "IT8MP";
                                            case 32898:
                                                return "IT8BL";
                                            default:
                                                switch (intValue) {
                                                    case 32908:
                                                        return "PixarFilm";
                                                    case 32909:
                                                        return "PixarLog";
                                                    default:
                                                        switch (intValue) {
                                                            case 32946:
                                                                return "Deflate";
                                                            case 32947:
                                                                return "DCS";
                                                            default:
                                                                switch (intValue) {
                                                                    case 34676:
                                                                        return "SGILog";
                                                                    case 34677:
                                                                        return "SGILog24";
                                                                    default:
                                                                        switch (intValue) {
                                                                            case 34712:
                                                                                return "JPEG 2000";
                                                                            case 34713:
                                                                                return "Nikon NEF Compressed";
                                                                            default:
                                                                                switch (intValue) {
                                                                                    case 34718:
                                                                                        return "Microsoft Document Imaging (MDI) Binary Level Codec";
                                                                                    case 34719:
                                                                                        return "Microsoft Document Imaging (MDI) Progressive Transform Codec";
                                                                                    case 34720:
                                                                                        return "Microsoft Document Imaging (MDI) Vector";
                                                                                    default:
                                                                                        return "Unknown (" + l11 + ")";
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
            return "Sony ARW Compressed";
        }
        return "Next";
    }

    public String F0() {
        Integer l11 = this.f9060a.l(37384);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 255) {
                                switch (intValue) {
                                    case 9:
                                        return "Fine Weather";
                                    case 10:
                                        return "Cloudy";
                                    case 11:
                                        return "Shade";
                                    case 12:
                                        return "Daylight Fluorescent";
                                    case 13:
                                        return "Day White Fluorescent";
                                    case 14:
                                        return "Cool White Fluorescent";
                                    case 15:
                                        return "White Fluorescent";
                                    case 16:
                                        return "Warm White Fluorescent";
                                    case 17:
                                        return "Standard light";
                                    case 18:
                                        return "Standard light (B)";
                                    case 19:
                                        return "Standard light (C)";
                                    case 20:
                                        return "D55";
                                    case 21:
                                        return "D65";
                                    case 22:
                                        return "D75";
                                    case 23:
                                        return "D50";
                                    case 24:
                                        return "Studio Tungsten";
                                    default:
                                        return "Unknown (" + l11 + ")";
                                }
                            }
                            return "(Other)";
                        }
                        return "Flash";
                    }
                    return "Tungsten";
                }
                return "Florescent";
            }
            return "Daylight";
        }
        return "Unknown";
    }

    public String G() {
        return m(41992, "None", "Soft", "Hard");
    }

    public String G0() {
        return m(41987, "Auto white balance", "Manual white balance");
    }

    public String H() {
        return m(41985, "Normal process", "Custom process");
    }

    public String H0() {
        return D0(40093);
    }

    public String I() {
        bc.k p11 = this.f9060a.p(41988);
        if (p11 == null) {
            return null;
        }
        return p11.e() == 0 ? "Digital zoom not used" : new DecimalFormat("0.#").format(p11.doubleValue());
    }

    public String I0() {
        return D0(40092);
    }

    public String J() {
        Integer l11 = this.f9060a.l(40963);
        if (l11 == null) {
            return null;
        }
        return l11 + " pixels";
    }

    public String J0() {
        return D0(40094);
    }

    public String K() {
        Integer l11 = this.f9060a.l(40962);
        if (l11 == null) {
            return null;
        }
        return l11 + " pixels";
    }

    public String K0() {
        return D0(40095);
    }

    public String L() {
        return u(36864, 2);
    }

    public String L0() {
        return D0(40091);
    }

    public String M() {
        bc.k p11 = this.f9060a.p(37380);
        if (p11 == null) {
            return null;
        }
        return p11.k(true) + " EV";
    }

    public String M0() {
        bc.k p11 = this.f9060a.p(282);
        if (p11 == null) {
            return null;
        }
        String o02 = o0();
        Object[] objArr = new Object[2];
        objArr[0] = p11.k(true);
        objArr[1] = o02 == null ? "unit" : o02.toLowerCase();
        return String.format("%s dots per %s", objArr);
    }

    public String N() {
        return m(41986, "Auto exposure", "Manual exposure", "Auto bracket");
    }

    public String N0() {
        return l(531, 1, "Center of pixel array", "Datum point");
    }

    public String O() {
        return l(34850, 1, "Manual control", "Program normal", "Aperture priority", "Shutter priority", "Program creative (slow program)", "Program action (high-speed program)", "Portrait mode", "Landscape mode");
    }

    public String O0() {
        int[] k11 = this.f9060a.k(530);
        if (k11 == null || k11.length < 2) {
            return null;
        }
        return (k11[0] == 2 && k11[1] == 1) ? "YCbCr4:2:2" : (k11[0] == 2 && k11[1] == 2) ? "YCbCr4:2:0" : "(Unknown)";
    }

    public String P() {
        String r11 = this.f9060a.r(33434);
        if (r11 == null) {
            return null;
        }
        return r11 + " sec";
    }

    public String P0() {
        bc.k p11 = this.f9060a.p(283);
        if (p11 == null) {
            return null;
        }
        String o02 = o0();
        Object[] objArr = new Object[2];
        objArr[0] = p11.k(true);
        objArr[1] = o02 == null ? "unit" : o02.toLowerCase();
        return String.format("%s dots per %s", objArr);
    }

    public String Q() {
        bc.k p11 = this.f9060a.p(33437);
        if (p11 == null) {
            return null;
        }
        return cc.h.h(p11.doubleValue());
    }

    public String R() {
        return l(41728, 1, "Film Scanner", "Reflection Print Scanner", "Digital Still Camera (DSC)");
    }

    public String S() {
        return l(266, 1, "Normal", "Reversed");
    }

    public String T() {
        Integer l11 = this.f9060a.l(37385);
        if (l11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((l11.intValue() & 1) != 0) {
            sb2.append("Flash fired");
        } else {
            sb2.append("Flash did not fire");
        }
        if ((l11.intValue() & 4) != 0) {
            if ((l11.intValue() & 2) != 0) {
                sb2.append(", return detected");
            } else {
                sb2.append(", return not detected");
            }
        }
        if ((l11.intValue() & 16) != 0) {
            sb2.append(", auto");
        }
        if ((l11.intValue() & 64) != 0) {
            sb2.append(", red-eye reduction");
        }
        return sb2.toString();
    }

    public String U() {
        return u(40960, 2);
    }

    public String V() {
        bc.k p11 = this.f9060a.p(37386);
        if (p11 == null) {
            return null;
        }
        return cc.h.i(p11.doubleValue());
    }

    public String W() {
        return l(41488, 1, "(No unit)", "Inches", "cm");
    }

    public String X() {
        String str;
        bc.k p11 = this.f9060a.p(41486);
        if (p11 == null) {
            return null;
        }
        String W = W();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p11.f().k(true));
        if (W == null) {
            str = "";
        } else {
            str = " " + W.toLowerCase();
        }
        sb2.append(str);
        return sb2.toString();
    }

    public String Y() {
        String str;
        bc.k p11 = this.f9060a.p(41487);
        if (p11 == null) {
            return null;
        }
        String W = W();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p11.f().k(true));
        if (W == null) {
            str = "";
        } else {
            str = " " + W.toLowerCase();
        }
        sb2.append(str);
        return sb2.toString();
    }

    public String Z() {
        return m(41991, "None", "Low gain up", "Low gain down", "High gain up", "High gain down");
    }

    public String a0() {
        String r11 = this.f9060a.r(257);
        if (r11 == null) {
            return null;
        }
        return r11 + " pixels";
    }

    public String b0() {
        String r11 = this.f9060a.r(256);
        if (r11 == null) {
            return null;
        }
        return r11 + " pixels";
    }

    public String c0() {
        String r11 = this.f9060a.r(1);
        if (r11 == null) {
            return null;
        }
        if ("R98".equalsIgnoreCase(r11.trim())) {
            return "Recommended Exif Interoperability Rules (ExifR98)";
        }
        return "Unknown (" + r11 + ")";
    }

    public String d0() {
        return u(2, 2);
    }

    public String e0() {
        Integer l11 = this.f9060a.l(34855);
        if (l11 != null) {
            return Integer.toString(l11.intValue());
        }
        return null;
    }

    @Override // cc.h
    public String f(int i11) {
        switch (i11) {
            case 1:
                return c0();
            case 2:
                return d0();
            case 254:
                return j0();
            case 255:
                return z0();
            case 256:
                return b0();
            case 257:
                return a0();
            case 258:
                return z();
            case 259:
                return F();
            case 262:
                return l0();
            case 263:
                return C0();
            case 266:
                return S();
            case 274:
                return k0();
            case 277:
                return q0();
            case 278:
                return p0();
            case 279:
                return y0();
            case 282:
                return M0();
            case 283:
                return P0();
            case 284:
                return m0();
            case 296:
                return o0();
            case 512:
                return f0();
            case 530:
                return O0();
            case 531:
                return N0();
            case 532:
                return n0();
            case 33422:
                return A();
            case 33434:
                return P();
            case 33437:
                return Q();
            case 34850:
                return O();
            case 34855:
                return e0();
            case 34864:
                return v0();
            case 36864:
                return L();
            case 37121:
                return D();
            case 37122:
                return E();
            case 37377:
                return x0();
            case 37378:
                return y();
            case 37380:
                return M();
            case 37381:
                return h0();
            case 37382:
                return A0();
            case 37383:
                return i0();
            case 37384:
                return F0();
            case 37385:
                return T();
            case 37386:
                return V();
            case 37510:
                return E0();
            case 40091:
                return L0();
            case 40092:
                return I0();
            case 40093:
                return H0();
            case 40094:
                return J0();
            case 40095:
                return K0();
            case 40960:
                return U();
            case 40961:
                return C();
            case 40962:
                return K();
            case 40963:
                return J();
            case 41486:
                return X();
            case 41487:
                return Y();
            case 41488:
                return W();
            case 41495:
                return u0();
            case 41728:
                return R();
            case 41729:
                return t0();
            case 41730:
                return B();
            case 41985:
                return H();
            case 41986:
                return N();
            case 41987:
                return G0();
            case 41988:
                return I();
            case 41989:
                return x();
            case 41990:
                return s0();
            case 41991:
                return Z();
            case 41992:
                return G();
            case 41993:
                return r0();
            case 41994:
                return w0();
            case 41996:
                return B0();
            case 42034:
                return g0();
            default:
                return super.f(i11);
        }
    }

    public String f0() {
        Integer l11 = this.f9060a.l(512);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 1) {
            if (intValue != 14) {
                return "Unknown (" + l11 + ")";
            }
            return "Lossless";
        }
        return "Baseline";
    }

    public String g0() {
        return n(42034);
    }

    public String h0() {
        Double h11 = this.f9060a.h(37381);
        if (h11 == null) {
            return null;
        }
        return cc.h.h(kb.c.a(h11.doubleValue()));
    }

    public String i0() {
        Integer l11 = this.f9060a.l(37383);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 255) {
            switch (intValue) {
                case 0:
                    return "Unknown";
                case 1:
                    return "Average";
                case 2:
                    return "Center weighted average";
                case 3:
                    return "Spot";
                case 4:
                    return "Multi-spot";
                case 5:
                    return "Multi-segment";
                case 6:
                    return "Partial";
                default:
                    return "Unknown (" + l11 + ")";
            }
        }
        return "(Other)";
    }

    public String j0() {
        return l(254, 0, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image", "Single page of multi-page reduced-resolution image", "Transparency mask", "Transparency mask of reduced-resolution image", "Transparency mask of multi-page image", "Transparency mask of reduced-resolution multi-page image");
    }

    public String k0() {
        return super.p(274);
    }

    public String l0() {
        Integer l11 = this.f9060a.l(262);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 32803) {
            if (intValue != 32892) {
                switch (intValue) {
                    case 0:
                        return "WhiteIsZero";
                    case 1:
                        return "BlackIsZero";
                    case 2:
                        return "RGB";
                    case 3:
                        return "RGB Palette";
                    case 4:
                        return "Transparency Mask";
                    case 5:
                        return "CMYK";
                    case 6:
                        return "YCbCr";
                    default:
                        switch (intValue) {
                            case 8:
                                return "CIELab";
                            case 9:
                                return "ICCLab";
                            case 10:
                                return "ITULab";
                            default:
                                switch (intValue) {
                                    case 32844:
                                        return "Pixar LogL";
                                    case 32845:
                                        return "Pixar LogLuv";
                                    default:
                                        return "Unknown colour space";
                                }
                        }
                }
            }
            return "Linear Raw";
        }
        return "Color Filter Array";
    }

    public String m0() {
        return l(284, 1, "Chunky (contiguous for each subsampling pixel)", "Separate (Y-plane/Cb-plane/Cr-plane format)");
    }

    public String n0() {
        int[] k11 = this.f9060a.k(532);
        if (k11 == null || k11.length < 6) {
            Object o11 = this.f9060a.o(532);
            if (o11 == null || !(o11 instanceof long[])) {
                return null;
            }
            long[] jArr = (long[]) o11;
            if (jArr.length < 6) {
                return null;
            }
            int[] iArr = new int[jArr.length];
            for (int i11 = 0; i11 < jArr.length; i11++) {
                iArr[i11] = (int) jArr[i11];
            }
            k11 = iArr;
        }
        return String.format("[%d,%d,%d] [%d,%d,%d]", Integer.valueOf(k11[0]), Integer.valueOf(k11[2]), Integer.valueOf(k11[4]), Integer.valueOf(k11[1]), Integer.valueOf(k11[3]), Integer.valueOf(k11[5]));
    }

    public String o0() {
        return l(296, 1, "(No unit)", "Inch", "cm");
    }

    public String p0() {
        String r11 = this.f9060a.r(278);
        if (r11 == null) {
            return null;
        }
        return r11 + " rows/strip";
    }

    public String q0() {
        String r11 = this.f9060a.r(277);
        if (r11 == null) {
            return null;
        }
        return r11 + " samples/pixel";
    }

    public String r0() {
        return m(41993, "None", "Low saturation", "High saturation");
    }

    public String s0() {
        return m(41990, "Standard", "Landscape", "Portrait", "Night scene");
    }

    public String t0() {
        return l(41729, 1, "Directly photographed image");
    }

    public String u0() {
        return l(41495, 1, "(Not defined)", "One-chip color area sensor", "Two-chip color area sensor", "Three-chip color area sensor", "Color sequential area sensor", null, "Trilinear sensor", "Color sequential linear sensor");
    }

    public String v0() {
        return m(34864, "Unknown", "Standard Output Sensitivity", "Recommended Exposure Index", "ISO Speed", "Standard Output Sensitivity and Recommended Exposure Index", "Standard Output Sensitivity and ISO Speed", "Recommended Exposure Index and ISO Speed", "Standard Output Sensitivity, Recommended Exposure Index and ISO Speed");
    }

    public String w0() {
        return m(41994, "None", "Low", "Hard");
    }

    public String x() {
        Integer l11 = this.f9060a.l(41989);
        if (l11 == null) {
            return null;
        }
        return l11.intValue() == 0 ? "Unknown" : cc.h.i(l11.intValue());
    }

    public String x0() {
        return super.r(37377);
    }

    public String y() {
        Double h11 = this.f9060a.h(37378);
        if (h11 == null) {
            return null;
        }
        return cc.h.h(kb.c.a(h11.doubleValue()));
    }

    public String y0() {
        String r11 = this.f9060a.r(279);
        if (r11 == null) {
            return null;
        }
        return r11 + " bytes";
    }

    public String z() {
        String r11 = this.f9060a.r(258);
        if (r11 == null) {
            return null;
        }
        return r11 + " bits/component/pixel";
    }

    public String z0() {
        return l(255, 1, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image");
    }
}