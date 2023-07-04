package ic;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public class s0 extends cc.h<t0> {
    public s0(t0 t0Var) {
        super(t0Var);
    }

    @Override // cc.h
    public String f(int i11) {
        switch (i11) {
            case 0:
                return ((t0) this.f9060a).r(i11);
            case 10:
                return String.format("0x%08X", ((t0) this.f9060a).l(i11));
            case 14:
                return String.format("%d", ((t0) this.f9060a).l(i11));
            case 18:
                return String.format("0x%08X", ((t0) this.f9060a).l(i11));
            case 22:
                return String.format("%d", ((t0) this.f9060a).l(i11));
            case 24:
            case 31:
            case 38:
            case 45:
            case 52:
                return ((t0) this.f9060a).r(i11);
            case 53:
                int[] k11 = ((t0) this.f9060a).k(i11);
                if (k11 == null) {
                    return null;
                }
                return String.format("%d/%d", Integer.valueOf(k11[0]), Integer.valueOf(k11[1]));
            case 55:
                return String.format("%d", ((t0) this.f9060a).l(i11));
            case 59:
                String r11 = ((t0) this.f9060a).r(i11);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat.format(simpleDateFormat.parse(r11));
                } catch (ParseException unused) {
                    return null;
                }
            case 67:
                return m(i11, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 68:
            case 70:
                return String.format("%d", ((t0) this.f9060a).l(i11));
            case 72:
                return m(i11, "Off", "On");
            case 73:
                Double h11 = ((t0) this.f9060a).h(i11);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (h11 == null) {
                    return null;
                }
                return decimalFormat.format(h11);
            case 75:
                cc.f t11 = ((t0) this.f9060a).t(i11);
                if (t11 == null) {
                    return null;
                }
                return t11.toString();
            case 80:
                return ((t0) this.f9060a).r(i11);
            default:
                return super.f(i11);
        }
    }
}