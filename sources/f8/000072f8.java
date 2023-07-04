package hc;

import ezvcard.property.Gender;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class o extends cc.h<p> {
    public o(p pVar) {
        super(pVar);
    }

    private String H() {
        return u(0, 1);
    }

    public String A(int i11) {
        String r11 = ((p) this.f9060a).r(i11);
        if (r11 == null) {
            return null;
        }
        String trim = r11.trim();
        if ("T".equalsIgnoreCase(trim)) {
            return "True direction";
        }
        if (Gender.MALE.equalsIgnoreCase(trim)) {
            return "Magnetic direction";
        }
        return "Unknown (" + trim + ")";
    }

    public String B() {
        bc.g W = ((p) this.f9060a).W();
        if (W == null) {
            return null;
        }
        return bc.g.b(W.d());
    }

    public String C() {
        bc.g W = ((p) this.f9060a).W();
        if (W == null) {
            return null;
        }
        return bc.g.b(W.e());
    }

    public String D() {
        String r11 = ((p) this.f9060a).r(10);
        if (r11 == null) {
            return null;
        }
        String trim = r11.trim();
        if ("2".equalsIgnoreCase(trim)) {
            return "2-dimensional measurement";
        }
        if ("3".equalsIgnoreCase(trim)) {
            return "3-dimensional measurement";
        }
        return "Unknown (" + trim + ")";
    }

    public String E() {
        String r11 = ((p) this.f9060a).r(12);
        if (r11 == null) {
            return null;
        }
        String trim = r11.trim();
        if ("K".equalsIgnoreCase(trim)) {
            return "kph";
        }
        if (Gender.MALE.equalsIgnoreCase(trim)) {
            return "mph";
        }
        if (Gender.NONE.equalsIgnoreCase(trim)) {
            return "knots";
        }
        return "Unknown (" + trim + ")";
    }

    public String F() {
        String r11 = ((p) this.f9060a).r(9);
        if (r11 == null) {
            return null;
        }
        String trim = r11.trim();
        if ("A".equalsIgnoreCase(trim)) {
            return "Active (Measurement in progress)";
        }
        if ("V".equalsIgnoreCase(trim)) {
            return "Void (Measurement Interoperability)";
        }
        return "Unknown (" + trim + ")";
    }

    public String G() {
        bc.k[] q11 = ((p) this.f9060a).q(7);
        DecimalFormat decimalFormat = new DecimalFormat("00.000");
        if (q11 == null) {
            return null;
        }
        return String.format("%02d:%02d:%s UTC", Integer.valueOf(q11[0].intValue()), Integer.valueOf(q11[1].intValue()), decimalFormat.format(q11[2].doubleValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    @Override // cc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String f(int r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L68
            r0 = 2
            if (r2 == r0) goto L63
            r0 = 12
            if (r2 == r0) goto L5e
            r0 = 30
            if (r2 == r0) goto L59
            r0 = 4
            if (r2 == r0) goto L54
            r0 = 5
            if (r2 == r0) goto L4f
            r0 = 6
            if (r2 == r0) goto L4a
            r0 = 7
            if (r2 == r0) goto L45
            r0 = 9
            if (r2 == r0) goto L40
            r0 = 10
            if (r2 == r0) goto L3b
            switch(r2) {
                case 14: goto L36;
                case 15: goto L31;
                case 16: goto L36;
                case 17: goto L31;
                default: goto L24;
            }
        L24:
            switch(r2) {
                case 23: goto L36;
                case 24: goto L31;
                case 25: goto L2c;
                default: goto L27;
            }
        L27:
            java.lang.String r2 = super.f(r2)
            return r2
        L2c:
            java.lang.String r2 = r1.x()
            return r2
        L31:
            java.lang.String r2 = r1.z(r2)
            return r2
        L36:
            java.lang.String r2 = r1.A(r2)
            return r2
        L3b:
            java.lang.String r2 = r1.D()
            return r2
        L40:
            java.lang.String r2 = r1.F()
            return r2
        L45:
            java.lang.String r2 = r1.G()
            return r2
        L4a:
            java.lang.String r2 = r1.v()
            return r2
        L4f:
            java.lang.String r2 = r1.w()
            return r2
        L54:
            java.lang.String r2 = r1.C()
            return r2
        L59:
            java.lang.String r2 = r1.y()
            return r2
        L5e:
            java.lang.String r2 = r1.E()
            return r2
        L63:
            java.lang.String r2 = r1.B()
            return r2
        L68:
            java.lang.String r2 = r1.H()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.o.f(int):java.lang.String");
    }

    public String v() {
        bc.k p11 = ((p) this.f9060a).p(6);
        if (p11 == null) {
            return null;
        }
        return p11.intValue() + " metres";
    }

    public String w() {
        return m(5, "Sea level", "Below sea level");
    }

    public String x() {
        String r11 = ((p) this.f9060a).r(25);
        if (r11 == null) {
            return null;
        }
        String trim = r11.trim();
        if ("K".equalsIgnoreCase(trim)) {
            return "kilometers";
        }
        if (Gender.MALE.equalsIgnoreCase(trim)) {
            return "miles";
        }
        if (Gender.NONE.equalsIgnoreCase(trim)) {
            return "knots";
        }
        return "Unknown (" + trim + ")";
    }

    public String y() {
        return m(30, "No Correction", "Differential Corrected");
    }

    public String z(int i11) {
        bc.k p11 = ((p) this.f9060a).p(i11);
        String format = p11 != null ? new DecimalFormat("0.##").format(p11.doubleValue()) : ((p) this.f9060a).r(i11);
        if (format == null || format.trim().length() == 0) {
            return null;
        }
        return format.trim() + " degrees";
    }
}