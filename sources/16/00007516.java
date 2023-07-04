package ic;

/* loaded from: classes.dex */
public class a1 extends cc.h<b1> {
    public a1(b1 b1Var) {
        super(b1Var);
    }

    private String v() {
        String r11 = ((b1) this.f9060a).r(8);
        if (r11 == null || r11.length() == 0) {
            return null;
        }
        char charAt = r11.charAt(0);
        return charAt != 'A' ? charAt != 'M' ? charAt != 'P' ? charAt != 'S' ? r11 : "Shutter Speed Priority AE" : "Program AE" : "Manual" : "Aperture Priority AE";
    }

    private String w() {
        String r11 = ((b1) this.f9060a).r(9);
        if (r11 == null || r11.length() == 0) {
            return null;
        }
        char charAt = r11.charAt(0);
        return charAt != '8' ? charAt != 'A' ? charAt != 'C' ? r11 : "Center Weighted Average" : "Average" : "Multi Segment";
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 8) {
            if (i11 != 9) {
                return super.f(i11);
            }
            return w();
        }
        return v();
    }
}