package yc;

import cc.h;

/* loaded from: classes.dex */
public class a extends h<b> {
    public a(b bVar) {
        super(bVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1) {
            if (i11 != 10) {
                if (i11 != 12) {
                    return super.f(i11);
                }
                return w();
            }
            return v();
        }
        return x();
    }

    public String v() {
        return l(10, 3, "24-bit color", "16 colors");
    }

    public String w() {
        return l(12, 1, "Color or B&W", "Grayscale");
    }

    public String x() {
        return m(1, "2.5 with fixed EGA palette information", null, "2.8 with modifiable EGA palette information", "2.8 without palette information (default palette)", "PC Paintbrush for Windows", "3.0 or better");
    }
}