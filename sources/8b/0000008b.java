package ad;

import bc.l;
import cc.h;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class b extends h<c> {
    public b(c cVar) {
        super(cVar);
    }

    public String A() {
        return m(10, "Perceptual", "Relative Colorimetric", "Saturation", "Absolute Colorimetric");
    }

    public String B() {
        return m(9, null, "Yes");
    }

    public String C() {
        Object o11 = ((c) this.f9060a).o(13);
        if (o11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (bc.h hVar : (List) o11) {
            if (sb2.length() != 0) {
                sb2.append('\n');
            }
            sb2.append(String.format("%s: %s", hVar.a(), hVar.b()));
        }
        return sb2.toString();
    }

    public String D() {
        return m(18, "Unspecified", "Metres");
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        if (i11 != 9) {
                            if (i11 != 10) {
                                if (i11 != 13) {
                                    if (i11 != 15) {
                                        if (i11 != 18) {
                                            return super.f(i11);
                                        }
                                        return D();
                                    }
                                    return v();
                                }
                                return C();
                            }
                            return A();
                        }
                        return B();
                    }
                    return z();
                }
                return y();
            }
            return x();
        }
        return w();
    }

    public String v() {
        byte[] e11 = ((c) this.f9060a).e(15);
        Integer l11 = ((c) this.f9060a).l(4);
        if (e11 != null && l11 != null) {
            l lVar = new l(e11);
            try {
                int intValue = l11.intValue();
                if (intValue != 0) {
                    if (intValue == 6 || intValue == 2) {
                        return String.format("R %d, G %d, B %d", Integer.valueOf(lVar.p()), Integer.valueOf(lVar.p()), Integer.valueOf(lVar.p()));
                    }
                    if (intValue == 3) {
                        return String.format("Palette Index %d", Short.valueOf(lVar.r()));
                    }
                    if (intValue != 4) {
                        return null;
                    }
                }
                return String.format("Greyscale Level %d", Integer.valueOf(lVar.p()));
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public String w() {
        com.drew.imaging.png.a fromNumericValue;
        Integer l11 = ((c) this.f9060a).l(4);
        if (l11 == null || (fromNumericValue = com.drew.imaging.png.a.fromNumericValue(l11.intValue())) == null) {
            return null;
        }
        return fromNumericValue.getDescription();
    }

    public String x() {
        return m(5, "Deflate");
    }

    public String y() {
        return m(6, "Adaptive");
    }

    public String z() {
        return m(7, "No Interlace", "Adam7 Interlace");
    }
}