package l6;

import ch.qos.logback.core.CoreConstants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes.dex */
public final class c {
    public static k6.a a(String str) {
        return b(str, new i());
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x021e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k6.a b(java.lang.String r12, k6.a r13) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.c.b(java.lang.String, k6.a):k6.a");
    }

    public static String c(k6.a aVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (aVar.t0()) {
            DecimalFormat decimalFormat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
            stringBuffer.append(decimalFormat.format(aVar.getYear()));
            if (aVar.getMonth() == 0) {
                return stringBuffer.toString();
            }
            decimalFormat.applyPattern("'-'00");
            stringBuffer.append(decimalFormat.format(aVar.getMonth()));
            if (aVar.X0() == 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append(decimalFormat.format(aVar.X0()));
            if (aVar.hasTime()) {
                stringBuffer.append('T');
                decimalFormat.applyPattern("00");
                stringBuffer.append(decimalFormat.format(aVar.p()));
                stringBuffer.append(CoreConstants.COLON_CHAR);
                stringBuffer.append(decimalFormat.format(aVar.m()));
                if (aVar.j() != 0 || aVar.J0() != 0) {
                    decimalFormat.applyPattern(":00.#########");
                    stringBuffer.append(decimalFormat.format(aVar.j() + (aVar.J0() / 1.0E9d)));
                }
                if (aVar.P0()) {
                    int offset = aVar.getTimeZone().getOffset(aVar.C().getTimeInMillis());
                    if (offset == 0) {
                        stringBuffer.append(Matrix.MATRIX_TYPE_ZERO);
                    } else {
                        int i11 = offset / 3600000;
                        int abs = Math.abs((offset % 3600000) / 60000);
                        decimalFormat.applyPattern("+00;-00");
                        stringBuffer.append(decimalFormat.format(i11));
                        decimalFormat.applyPattern(":00");
                        stringBuffer.append(decimalFormat.format(abs));
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}