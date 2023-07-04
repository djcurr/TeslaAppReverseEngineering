package hc;

/* loaded from: classes.dex */
public class w extends cc.h<x> {
    public w(x xVar) {
        super(xVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1 && i11 != 4 && i11 != 7 && i11 != 10 && i11 != 13 && i11 != 16 && i11 != 19) {
            return super.f(i11);
        }
        return v(i11);
    }

    public String v(int i11) {
        Integer l11 = ((x) this.f9060a).l(i11);
        if (l11 == null) {
            return null;
        }
        return super.o(l11.shortValue());
    }
}