package hc;

/* loaded from: classes.dex */
public class q extends cc.h<r> {
    public q(r rVar) {
        super(rVar);
    }

    public String A() {
        Integer l11 = ((r) this.f9060a).l(11);
        if (l11 == null) {
            return null;
        }
        return new bc.k(l11.intValue(), 32678L).toString();
    }

    public String B() {
        Integer l11 = ((r) this.f9060a).l(5);
        if (l11 == null) {
            return null;
        }
        return Integer.toString(1 / ((l11.intValue() / 32768) + 1));
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 2) {
            if (i11 != 11) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 != 7) {
                            if (i11 != 8) {
                                if (i11 != 9) {
                                    return super.f(i11);
                                }
                                return z();
                            }
                            return y();
                        }
                        return v();
                    }
                    return B();
                }
                return x();
            }
            return A();
        }
        return w();
    }

    public String v() {
        Integer l11 = ((r) this.f9060a).l(7);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue() & 15;
        if (intValue != 0) {
            if (intValue != 1) {
                return "Unknown (" + l11 + ")";
            }
            return "On";
        }
        return "Off";
    }

    public String w() {
        Integer l11 = ((r) this.f9060a).l(2);
        if (l11 == null) {
            return null;
        }
        return new bc.k(l11.intValue(), 32678L).toString();
    }

    public String x() {
        Integer l11 = ((r) this.f9060a).l(4);
        if (l11 == null) {
            return null;
        }
        return new bc.k(l11.intValue(), 32678L).toString();
    }

    public String y() {
        Integer l11 = ((r) this.f9060a).l(8);
        if (l11 == null) {
            return null;
        }
        return new bc.k(l11.intValue(), 32678L).toString();
    }

    public String z() {
        Integer l11 = ((r) this.f9060a).l(9);
        if (l11 == null) {
            return null;
        }
        return new bc.k(l11.intValue(), 32678L).toString();
    }
}