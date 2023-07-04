package mc;

import cc.h;

/* loaded from: classes.dex */
public class a extends h<b> {
    public a(b bVar) {
        super(bVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return super.f(i11);
                    }
                    return v();
                }
                return w();
            }
            return y();
        }
        return x();
    }

    public String v() {
        Integer l11 = ((b) this.f9060a).l(4);
        if (l11 == null) {
            return null;
        }
        if (l11.intValue() == 0) {
            return "No palette";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l11);
        sb2.append(" colour");
        sb2.append(l11.intValue() == 1 ? "" : "s");
        return sb2.toString();
    }

    public String w() {
        Integer l11 = ((b) this.f9060a).l(3);
        if (l11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l11.intValue() == 0 ? 256 : l11.intValue());
        sb2.append(" pixels");
        return sb2.toString();
    }

    public String x() {
        return l(1, 1, "Icon", "Cursor");
    }

    public String y() {
        Integer l11 = ((b) this.f9060a).l(2);
        if (l11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l11.intValue() == 0 ? 256 : l11.intValue());
        sb2.append(" pixels");
        return sb2.toString();
    }
}