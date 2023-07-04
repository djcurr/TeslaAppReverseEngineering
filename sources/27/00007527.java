package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class g0 extends cc.h<h0> {

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<Integer, String> f30328b;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30328b = hashMap;
        hashMap.put(0, "Off");
        hashMap.put(1, "Soft Focus");
        hashMap.put(2, "Pop Art");
        hashMap.put(3, "Pale & Light Color");
        hashMap.put(4, "Light Tone");
        hashMap.put(5, "Pin Hole");
        hashMap.put(6, "Grainy Film");
        hashMap.put(9, "Diorama");
        hashMap.put(10, "Cross Process");
        hashMap.put(12, "Fish Eye");
        hashMap.put(13, "Drawing");
        hashMap.put(14, "Gentle Sepia");
        hashMap.put(15, "Pale & Light Color II");
        hashMap.put(16, "Pop Art II");
        hashMap.put(17, "Pin Hole II");
        hashMap.put(18, "Pin Hole III");
        hashMap.put(19, "Grainy Film II");
        hashMap.put(20, "Dramatic Tone");
        hashMap.put(21, "Punk");
        hashMap.put(22, "Soft Focus 2");
        hashMap.put(23, "Sparkle");
        hashMap.put(24, "Watercolor");
        hashMap.put(25, "Key Line");
        hashMap.put(26, "Key Line II");
        hashMap.put(27, "Miniature");
        hashMap.put(28, "Reflection");
        hashMap.put(29, "Fragmented");
        hashMap.put(31, "Cross Process II");
        hashMap.put(32, "Dramatic Tone II");
        hashMap.put(33, "Watercolor I");
        hashMap.put(34, "Watercolor II");
        hashMap.put(35, "Diorama II");
        hashMap.put(36, "Vintage");
        hashMap.put(37, "Vintage II");
        hashMap.put(38, "Vintage III");
        hashMap.put(39, "Partial Color");
        hashMap.put(40, "Partial Color II");
        hashMap.put(41, "Partial Color III");
    }

    public g0(h0 h0Var) {
        super(h0Var);
    }

    public String A() {
        Integer l11 = ((h0) this.f9060a).l(266);
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
        return sb2.substring(0, sb2.length() - 2);
    }

    public String B() {
        Integer l11 = ((h0) this.f9060a).l(268);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 256) {
                        if (intValue != 512) {
                            return "Unknown (" + l11 + ")";
                        }
                        return "Sepia";
                    }
                    return "Monotone";
                }
                return "Muted";
            }
            return "Natural";
        }
        return "Vivid";
    }

    public String C() {
        return m(272, "Neutral", "Yellow", "Orange", "Red", "Green");
    }

    public String D() {
        return m(273, "Neutral", "Sepia", "Blue", "Purple", "Green");
    }

    public String E() {
        return u(0, 4);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            if (i11 != 256) {
                if (i11 != 289) {
                    if (i11 != 272) {
                        if (i11 != 273) {
                            switch (i11) {
                                case 265:
                                    return x();
                                case 266:
                                    return A();
                                case 267:
                                    return y();
                                case 268:
                                    return B();
                                default:
                                    return super.f(i11);
                            }
                        }
                        return D();
                    }
                    return C();
                }
                return w();
            }
            return z();
        }
        return E();
    }

    public String v(int i11) {
        int[] k11 = ((h0) this.f9060a).k(i11);
        if (k11 == null || k11.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < k11.length; i12++) {
            if (i12 == 0) {
                HashMap<Integer, String> hashMap = f30328b;
                sb2.append(hashMap.containsKey(Integer.valueOf(k11[i12])) ? hashMap.get(Integer.valueOf(k11[i12])) : "[unknown]");
            } else {
                sb2.append(k11[i12]);
                sb2.append("; ");
            }
            sb2.append("; ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    public String w() {
        return v(289);
    }

    public String x() {
        return m(265, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    public String y() {
        return m(267, "High Speed", "High Function", "Advanced High Speed", "Advanced High Function");
    }

    public String z() {
        return l(256, 1, "Color Temperature", "Gray Point");
    }
}