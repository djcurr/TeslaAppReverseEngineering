package qc;

/* loaded from: classes.dex */
public class g extends cc.h<i> {
    public g(i iVar) {
        super(iVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != -3) {
            if (i11 != 3) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        switch (i11) {
                            case 6:
                                return v(0);
                            case 7:
                                return v(1);
                            case 8:
                                return v(2);
                            case 9:
                                return v(3);
                            default:
                                return super.f(i11);
                        }
                    }
                    return y();
                }
                return w();
            }
            return z();
        }
        return x();
    }

    public String v(int i11) {
        f V = ((i) this.f9060a).V(i11);
        if (V == null) {
            return null;
        }
        return V.a() + " component: " + V;
    }

    public String w() {
        String r11 = ((i) this.f9060a).r(0);
        if (r11 == null) {
            return null;
        }
        return r11 + " bits";
    }

    public String x() {
        return m(-3, "Baseline", "Extended sequential, Huffman", "Progressive, Huffman", "Lossless, Huffman", null, "Differential sequential, Huffman", "Differential progressive, Huffman", "Differential lossless, Huffman", "Reserved for JPEG extensions", "Extended sequential, arithmetic", "Progressive, arithmetic", "Lossless, arithmetic", null, "Differential sequential, arithmetic", "Differential progressive, arithmetic", "Differential lossless, arithmetic");
    }

    public String y() {
        String r11 = ((i) this.f9060a).r(1);
        if (r11 == null) {
            return null;
        }
        return r11 + " pixels";
    }

    public String z() {
        String r11 = ((i) this.f9060a).r(3);
        if (r11 == null) {
            return null;
        }
        return r11 + " pixels";
    }
}