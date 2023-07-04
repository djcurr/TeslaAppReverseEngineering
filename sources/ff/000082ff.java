package lc;

import cc.h;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class a extends h<b> {
    public a(b bVar) {
        super(bVar);
    }

    private String A() {
        return m(64, "Perceptual", "Media-Relative Colorimetric", "Saturation", "ICC-Absolute Colorimetric");
    }

    private String B(int i11) {
        byte[] e11;
        String str;
        String str2;
        try {
            e11 = ((b) this.f9060a).e(i11);
        } catch (IOException unused) {
            return null;
        }
        if (e11 == null) {
            return ((b) this.f9060a).r(i11);
        }
        bc.a aVar = new bc.a(e11);
        int i12 = 0;
        int h11 = aVar.h(0);
        switch (h11) {
            case 1482250784:
                StringBuilder sb2 = new StringBuilder();
                DecimalFormat decimalFormat = new DecimalFormat("0.####");
                int length = (e11.length - 8) / 12;
                while (i12 < length) {
                    int i13 = (i12 * 12) + 8;
                    float o11 = aVar.o(i13);
                    float o12 = aVar.o(i13 + 4);
                    float o13 = aVar.o(i13 + 8);
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("(");
                    sb2.append(decimalFormat.format(o11));
                    sb2.append(", ");
                    sb2.append(decimalFormat.format(o12));
                    sb2.append(", ");
                    sb2.append(decimalFormat.format(o13));
                    sb2.append(")");
                    i12++;
                }
                return sb2.toString();
            case 1668641398:
                int h12 = aVar.h(8);
                StringBuilder sb3 = new StringBuilder();
                for (int i14 = 0; i14 < h12; i14++) {
                    if (i14 != 0) {
                        sb3.append(", ");
                    }
                    sb3.append(v(aVar.s((i14 * 2) + 12) / 65535.0d, 7, false));
                }
                return sb3.toString();
            case 1684370275:
                return new String(e11, 12, aVar.h(8) - 1);
            case 1835360627:
                int h13 = aVar.h(8);
                float o14 = aVar.o(12);
                float o15 = aVar.o(16);
                float o16 = aVar.o(20);
                int h14 = aVar.h(24);
                float o17 = aVar.o(28);
                int h15 = aVar.h(32);
                String format = h13 != 0 ? h13 != 1 ? h13 != 2 ? String.format("Unknown %d", Integer.valueOf(h13)) : "1964 10°" : "1931 2°" : "Unknown";
                String format2 = h14 != 0 ? h14 != 1 ? h14 != 2 ? String.format("Unknown %d", Integer.valueOf(h13)) : "0/d or d/0" : "0/45 or 45/0" : "Unknown";
                switch (h15) {
                    case 0:
                        str = "unknown";
                        break;
                    case 1:
                        str = "D50";
                        break;
                    case 2:
                        str = "D65";
                        break;
                    case 3:
                        str = "D93";
                        break;
                    case 4:
                        str = "F2";
                        break;
                    case 5:
                        str = "D55";
                        break;
                    case 6:
                        str = "A";
                        break;
                    case 7:
                        str = "Equi-Power (E)";
                        break;
                    case 8:
                        str = "F8";
                        break;
                    default:
                        str = String.format("Unknown %d", Integer.valueOf(h15));
                        break;
                }
                DecimalFormat decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", format, decimalFormat2.format(o14), decimalFormat2.format(o15), decimalFormat2.format(o16), format2, Integer.valueOf(Math.round(o17 * 100.0f)), str);
            case 1835824483:
                int h16 = aVar.h(8);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(h16);
                while (i12 < h16) {
                    int i15 = (i12 * 12) + 16;
                    String e12 = c.e(aVar.h(i15));
                    int h17 = aVar.h(i15 + 4);
                    int h18 = aVar.h(i15 + 8);
                    try {
                        str2 = new String(e11, h18, h17, "UTF-16BE");
                    } catch (UnsupportedEncodingException unused2) {
                        str2 = new String(e11, h18, h17);
                    }
                    sb4.append(" ");
                    sb4.append(e12);
                    sb4.append("(");
                    sb4.append(str2);
                    sb4.append(")");
                    i12++;
                }
                return sb4.toString();
            case 1936287520:
                return c.e(aVar.h(8));
            case 1952807028:
                try {
                    return new String(e11, 8, (e11.length - 8) - 1, "ASCII");
                } catch (UnsupportedEncodingException unused3) {
                    return new String(e11, 8, (e11.length - 8) - 1);
                }
            default:
                return String.format("%s (0x%08X): %d bytes", c.e(h11), Integer.valueOf(h11), Integer.valueOf(e11.length));
        }
        return null;
    }

    public static String v(double d11, int i11, boolean z11) {
        int i12 = i11;
        boolean z12 = true;
        if (i12 < 1) {
            return "" + Math.round(d11);
        }
        long abs = Math.abs((long) d11);
        long round = (int) Math.round((Math.abs(d11) - abs) * Math.pow(10.0d, i12));
        String str = "";
        long j11 = round;
        while (i12 > 0) {
            byte abs2 = (byte) Math.abs(j11 % 10);
            j11 /= 10;
            if (str.length() > 0 || z11 || abs2 != 0 || i12 == 1) {
                str = ((int) abs2) + str;
            }
            i12--;
        }
        long j12 = abs + j11;
        if (d11 >= 0.0d || (j12 == 0 && round == 0)) {
            z12 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z12 ? "-" : "");
        sb2.append(j12);
        sb2.append(".");
        sb2.append(str);
        return sb2.toString();
    }

    private static int w(String str) {
        return new bc.a(str.getBytes()).h(0);
    }

    private String x() {
        String r11 = ((b) this.f9060a).r(40);
        if (r11 == null) {
            return null;
        }
        try {
            switch (w(r11)) {
                case 1095782476:
                    return "Apple Computer, Inc.";
                case 1297303124:
                    return "Microsoft Corporation";
                case 1397180704:
                    return "Silicon Graphics, Inc.";
                case 1398099543:
                    return "Sun Microsystems, Inc.";
                case 1413959252:
                    return "Taligent, Inc.";
                default:
                    return String.format("Unknown (%s)", r11);
            }
        } catch (IOException unused) {
            return r11;
        }
    }

    private String y() {
        String r11 = ((b) this.f9060a).r(12);
        if (r11 == null) {
            return null;
        }
        try {
            switch (w(r11)) {
                case 1633842036:
                    return "Abstract";
                case 1818848875:
                    return "DeviceLink";
                case 1835955314:
                    return "Display Device";
                case 1852662636:
                    return "Named Color";
                case 1886549106:
                    return "Output Device";
                case 1935896178:
                    return "Input Device";
                case 1936744803:
                    return "ColorSpace Conversion";
                default:
                    return String.format("Unknown (%s)", r11);
            }
        } catch (IOException unused) {
            return r11;
        }
    }

    private String z() {
        Integer l11 = ((b) this.f9060a).l(8);
        if (l11 == null) {
            return null;
        }
        return String.format("%d.%d.%d", Integer.valueOf((l11.intValue() & (-16777216)) >> 24), Integer.valueOf((l11.intValue() & 15728640) >> 20), Integer.valueOf((l11.intValue() & 983040) >> 16));
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 8) {
            if (i11 != 12) {
                if (i11 != 40) {
                    if (i11 != 64) {
                        if (i11 > 538976288 && i11 < 2054847098) {
                            return B(i11);
                        }
                        return super.f(i11);
                    }
                    return A();
                }
                return x();
            }
            return y();
        }
        return z();
    }
}