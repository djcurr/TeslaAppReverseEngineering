package hc;

/* loaded from: classes.dex */
public class u extends cc.h<v> {
    public u(v vVar) {
        super(vVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1 && i11 != 5 && i11 != 9 && i11 != 13 && i11 != 17 && i11 != 21 && i11 != 25) {
            return super.f(i11);
        }
        return v(i11);
    }

    public String v(int i11) {
        Integer l11 = ((v) this.f9060a).l(i11);
        if (l11 == null) {
            return null;
        }
        return super.o(l11.shortValue());
    }
}