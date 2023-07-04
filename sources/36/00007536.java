package ic;

/* loaded from: classes.dex */
public class o extends cc.h<p> {
    public o(p pVar) {
        super(pVar);
    }

    private String A() {
        return l(768, 1, "User Profile 1", "User Profile 2", "User Profile 3", "User Profile 0 (Dynamic)");
    }

    private String B() {
        return m(772, "Auto or Manual", "Daylight", "Fluorescent", "Tungsten", "Flash", "Cloudy", "Shadow");
    }

    private String v() {
        return s(787);
    }

    private String w() {
        return j(800, "%d C");
    }

    private String x() {
        return s(785);
    }

    private String y() {
        return s(786);
    }

    private String z() {
        return l(768, 1, "Fine", "Basic");
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 768) {
            if (i11 != 770) {
                if (i11 != 772) {
                    if (i11 != 800) {
                        switch (i11) {
                            case 785:
                                return x();
                            case 786:
                                return y();
                            case 787:
                                return v();
                            default:
                                switch (i11) {
                                    case 802:
                                    case 803:
                                    case 804:
                                        return s(i11);
                                    default:
                                        return super.f(i11);
                                }
                        }
                    }
                    return w();
                }
                return B();
            }
            return A();
        }
        return z();
    }
}