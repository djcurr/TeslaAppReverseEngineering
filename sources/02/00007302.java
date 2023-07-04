package hc;

/* loaded from: classes.dex */
public class y extends cc.h<z> {
    public y(z zVar) {
        super(zVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 0) {
            Integer l11 = ((z) this.f9060a).l(i11);
            if (l11 == null) {
                return null;
            }
            return String.format("0x%08x", l11);
        }
        return super.f(i11);
    }
}