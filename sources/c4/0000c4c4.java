package zc;

/* loaded from: classes.dex */
public class h extends cc.h<i> {
    public h(i iVar) {
        super(iVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return super.f(i11);
                        }
                        return x();
                    }
                    return v();
                }
                return z();
            }
            return y();
        }
        return w();
    }

    public String v() {
        Integer l11 = ((i) this.f9060a).l(4);
        if (l11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l11);
        sb2.append(" bit");
        sb2.append(l11.intValue() == 1 ? "" : "s");
        sb2.append(" per channel");
        return sb2.toString();
    }

    public String w() {
        Integer l11 = ((i) this.f9060a).l(1);
        if (l11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l11);
        sb2.append(" channel");
        sb2.append(l11.intValue() == 1 ? "" : "s");
        return sb2.toString();
    }

    public String x() {
        return m(5, "Bitmap", "Grayscale", "Indexed", "RGB", "CMYK", null, null, "Multichannel", "Duotone", "Lab");
    }

    public String y() {
        Integer l11 = ((i) this.f9060a).l(2);
        if (l11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l11);
        sb2.append(" pixel");
        sb2.append(l11.intValue() == 1 ? "" : "s");
        return sb2.toString();
    }

    public String z() {
        try {
            Integer l11 = ((i) this.f9060a).l(3);
            if (l11 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l11);
            sb2.append(" pixel");
            sb2.append(l11.intValue() == 1 ? "" : "s");
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}