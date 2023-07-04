package cc;

import bc.k;
import bc.p;
import cc.b;
import ch.qos.logback.core.CoreConstants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes.dex */
public class h<T extends b> {

    /* renamed from: a  reason: collision with root package name */
    protected final T f9060a;

    public h(T t11) {
        this.f9060a = t11;
    }

    public static String a(int[] iArr, int i11) {
        if (iArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < 4 && i12 < iArr.length; i12++) {
            if (i12 == i11) {
                sb2.append(CoreConstants.DOT);
            }
            char c11 = (char) iArr[i12];
            if (c11 < '0') {
                c11 = (char) (c11 + '0');
            }
            if (i12 != 0 || c11 != '0') {
                sb2.append(c11);
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String h(double d11) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return "f/" + decimalFormat.format(d11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String i(double d11) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(d11) + " mm";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(int i11) {
        byte[] e11 = this.f9060a.e(i11);
        if (e11 == null) {
            return null;
        }
        int length = e11.length;
        for (int i12 = 0; i12 < e11.length; i12++) {
            int i13 = e11[i12] & 255;
            if (i13 == 0 || i13 > 127) {
                length = i12;
                break;
            }
        }
        return new String(e11, 0, length);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String c(int i11, Object... objArr) {
        Integer l11 = this.f9060a.l(i11);
        if (l11 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; objArr.length > i12; i12++) {
            Object obj = objArr[i12];
            if (obj != null) {
                char c11 = (l11.intValue() & 1) == 1 ? (char) 1 : (char) 0;
                if (obj instanceof String[]) {
                    arrayList.add(((String[]) obj)[c11]);
                } else if (c11 != 0 && (obj instanceof String)) {
                    arrayList.add((String) obj);
                }
            }
            l11 = Integer.valueOf(l11.intValue() >> 1);
        }
        return p.a(arrayList, ", ");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d(int i11) {
        byte[] e11 = this.f9060a.e(i11);
        if (e11 == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(e11.length);
        objArr[1] = e11.length == 1 ? "" : "s";
        return String.format("(%d byte%s)", objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e(int i11, int i12) {
        k p11 = this.f9060a.p(i11);
        if (p11 == null) {
            return null;
        }
        return String.format("%." + i12 + "f", Double.valueOf(p11.doubleValue()));
    }

    public String f(int i11) {
        int length;
        Object o11 = this.f9060a.o(i11);
        if (o11 == null) {
            return null;
        }
        if (!o11.getClass().isArray() || (length = Array.getLength(o11)) <= 16) {
            if (o11 instanceof Date) {
                return new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy").format((Date) o11).replaceAll("([0-9]{2} [^ ]+)$", ":$1");
            }
            return this.f9060a.r(i11);
        }
        return String.format("[%d values]", Integer.valueOf(length));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String g(int i11) {
        Long m11 = this.f9060a.m(i11);
        if (m11 == null) {
            return null;
        }
        return new Date(m11.longValue()).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String j(int i11, String str) {
        Integer l11 = this.f9060a.l(i11);
        if (l11 == null) {
            return null;
        }
        return String.format(str, l11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String k(int i11, String str) {
        String r11 = this.f9060a.r(i11);
        if (r11 == null) {
            return null;
        }
        return String.format(str, r11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String l(int i11, int i12, String... strArr) {
        String str;
        Long m11 = this.f9060a.m(i11);
        if (m11 == null) {
            return null;
        }
        long longValue = m11.longValue() - i12;
        if (longValue < 0 || longValue >= strArr.length || (str = strArr[(int) longValue]) == null) {
            return "Unknown (" + m11 + ")";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String m(int i11, String... strArr) {
        return l(i11, 0, strArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String n(int i11) {
        k[] q11 = this.f9060a.q(i11);
        if (q11 == null || q11.length != 4) {
            return null;
        }
        if (q11[0].i() && q11[2].i()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (q11[0].c(q11[1])) {
            sb2.append(q11[0].k(true));
            sb2.append("mm");
        } else {
            sb2.append(q11[0].k(true));
            sb2.append(CoreConstants.DASH_CHAR);
            sb2.append(q11[1].k(true));
            sb2.append("mm");
        }
        if (!q11[2].i()) {
            sb2.append(' ');
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (q11[2].c(q11[3])) {
                sb2.append(h(q11[2].doubleValue()));
            } else {
                sb2.append("f/");
                sb2.append(decimalFormat.format(q11[2].doubleValue()));
                sb2.append(CoreConstants.DASH_CHAR);
                sb2.append(decimalFormat.format(q11[3].doubleValue()));
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String o(short s11) {
        if (s11 != 0) {
            if (s11 != 1) {
                if (s11 != 2) {
                    if (s11 != 3) {
                        if (s11 != 4) {
                            if (s11 != 255) {
                                switch (s11) {
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
                                        return "Standard Light A";
                                    case 18:
                                        return "Standard Light B";
                                    case 19:
                                        return "Standard Light C";
                                    case 20:
                                        return "D55";
                                    case 21:
                                        return "D65";
                                    case 22:
                                        return "D75";
                                    case 23:
                                        return "D50";
                                    case 24:
                                        return "ISO Studio Tungsten";
                                    default:
                                        return f(s11);
                                }
                            }
                            return "Other";
                        }
                        return "Flash";
                    }
                    return "Tungsten (Incandescent)";
                }
                return "Fluorescent";
            }
            return "Daylight";
        }
        return "Unknown";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String p(int i11) {
        return l(i11, 1, "Top, left side (Horizontal / normal)", "Top, right side (Mirror horizontal)", "Bottom, right side (Rotate 180)", "Bottom, left side (Mirror vertical)", "Left side, top (Mirror horizontal and rotate 270 CW)", "Right side, top (Rotate 90 CW)", "Right side, bottom (Mirror horizontal and rotate 90 CW)", "Left side, bottom (Rotate 270 CW)");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String q(int i11) {
        k p11 = this.f9060a.p(i11);
        if (p11 != null) {
            return p11.k(true);
        }
        Double h11 = this.f9060a.h(i11);
        if (h11 != null) {
            return new DecimalFormat("0.###").format(h11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String r(int i11) {
        Float i12 = this.f9060a.i(i11);
        if (i12 == null) {
            return null;
        }
        if (i12.floatValue() <= 1.0f) {
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            return decimalFormat.format(((float) Math.round(((float) (1.0d / Math.exp(i12.floatValue() * Math.log(2.0d)))) * 10.0d)) / 10.0f) + " sec";
        }
        return "1/" + ((int) Math.exp(i12.floatValue() * Math.log(2.0d))) + " sec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String s(int i11) {
        k p11 = this.f9060a.p(i11);
        if (p11 == null) {
            return null;
        }
        return p11.k(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String t(int i11, Charset charset) {
        byte[] e11 = this.f9060a.e(i11);
        if (e11 == null) {
            return null;
        }
        try {
            return new String(e11, charset.name()).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String u(int i11, int i12) {
        int[] k11 = this.f9060a.k(i11);
        if (k11 == null) {
            return null;
        }
        return a(k11, i12);
    }
}