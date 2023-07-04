package gc;

import cc.h;

/* loaded from: classes.dex */
public class a extends h<b> {
    public a(b bVar) {
        super(bVar);
    }

    @Override // cc.h
    public String f(int i11) {
        switch (i11) {
            case 28:
            case 29:
                return x(i11);
            case 30:
                return w();
            case 31:
            default:
                return ((b) this.f9060a).r(i11);
            case 32:
            case 33:
                return v(i11);
        }
    }

    public String v(int i11) {
        return ((b) this.f9060a).r(i11) + " bytes";
    }

    public String w() {
        return l(30, 1, "Grayscale", "Lab", "RGB", "CMYK");
    }

    public String x(int i11) {
        return ((b) this.f9060a).r(i11) + " pixels";
    }
}