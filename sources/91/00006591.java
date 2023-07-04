package dc;

import cc.h;

/* loaded from: classes.dex */
public class a extends h<b> {
    public a(b bVar) {
        super(bVar);
    }

    private String v() {
        return m(3, "Unknown (RGB or CMYK)", "YCbCr", "YCCK");
    }

    private String w() {
        Integer l11 = ((b) this.f9060a).l(0);
        if (l11 == null) {
            return null;
        }
        return l11.intValue() == 100 ? "100" : Integer.toString(l11.intValue());
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            if (i11 != 3) {
                return super.f(i11);
            }
            return v();
        }
        return w();
    }
}