package fc;

import cc.h;
import fc.b;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class a extends h<b> {
    public a(b bVar) {
        super(bVar);
    }

    public static String v(long j11) {
        return new DecimalFormat("0.###").format(Double.valueOf(j11 / 65536.0d));
    }

    public static String w(Long l11) {
        if (l11 == null) {
            return null;
        }
        return v(l11.longValue());
    }

    public static String x(long j11, int i11) {
        return String.format("0x%0" + i11 + "X", Long.valueOf(j11));
    }

    public static String y(Long l11, int i11) {
        if (l11 == null) {
            return null;
        }
        return x(l11.longValue(), i11);
    }

    public String A() {
        b.c W = ((b) this.f9060a).W();
        if (W == null) {
            return null;
        }
        return W.toString();
    }

    public String B() {
        b.d X = ((b) this.f9060a).X();
        if (X == null) {
            return null;
        }
        return X.toString();
    }

    public String C() {
        b.e Y = ((b) this.f9060a).Y();
        if (Y != null) {
            return Y.toString();
        }
        Integer l11 = ((b) this.f9060a).l(5);
        if (l11 == null) {
            return null;
        }
        return "Illegal value 0x" + Integer.toHexString(l11.intValue());
    }

    public String D() {
        b.f Z = ((b) this.f9060a).Z();
        if (Z == null) {
            return null;
        }
        return Z.toString();
    }

    public String E() {
        b.g a02 = ((b) this.f9060a).a0();
        if (a02 == null) {
            return null;
        }
        return a02.toString();
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != -2) {
            if (i11 != 5) {
                switch (i11) {
                    case 10:
                        return D();
                    case 11:
                        return A();
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return y(((b) this.f9060a).m(i11), 8);
                    case 16:
                        return B();
                    case 17:
                    case 18:
                    case 19:
                        return w(((b) this.f9060a).m(i11));
                    case 20:
                        return E();
                    default:
                        return super.f(i11);
                }
            }
            return C();
        }
        return z();
    }

    public String z() {
        b.EnumC0514b V = ((b) this.f9060a).V();
        if (V == null) {
            return null;
        }
        return V.toString();
    }
}