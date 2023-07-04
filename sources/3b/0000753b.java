package ic;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public class q0 extends cc.h<r0> {
    public q0(r0 r0Var) {
        super(r0Var);
    }

    @Override // cc.h
    public String f(int i11) {
        switch (i11) {
            case 0:
                return String.format("%d", ((r0) this.f9060a).l(i11));
            case 2:
                return ((r0) this.f9060a).r(i11);
            case 12:
                return ((r0) this.f9060a).r(i11);
            case 14:
                int[] k11 = ((r0) this.f9060a).k(i11);
                if (k11 == null) {
                    return null;
                }
                return String.format("%d/%d", Integer.valueOf(k11[0]), Integer.valueOf(k11[1]));
            case 18:
                return String.format("%d", ((r0) this.f9060a).l(i11));
            case 22:
                String r11 = ((r0) this.f9060a).r(i11);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat.format(simpleDateFormat.parse(r11));
                } catch (ParseException unused) {
                    return null;
                }
            case 36:
                return m(i11, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 38:
            case 40:
                return String.format("%d", ((r0) this.f9060a).l(i11));
            case 42:
                cc.f t11 = ((r0) this.f9060a).t(i11);
                if (t11 == null) {
                    return null;
                }
                return t11.toString();
            case 72:
            case 74:
            case 76:
            case 78:
                return String.format("%d", ((r0) this.f9060a).l(i11));
            case 80:
                return m(i11, "Off", "On");
            case 82:
                return String.format("%d", ((r0) this.f9060a).l(i11));
            case 84:
                Double h11 = ((r0) this.f9060a).h(i11);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (h11 == null) {
                    return null;
                }
                return decimalFormat.format(h11);
            case 86:
                return ((r0) this.f9060a).r(i11);
            default:
                return super.f(i11);
        }
    }
}