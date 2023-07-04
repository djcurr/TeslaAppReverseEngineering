package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* loaded from: classes5.dex */
public class j extends DecimalFormat {
    public j(int i11) {
        setMaximumFractionDigits(i11);
        if (i11 > 0) {
            setMinimumFractionDigits(1);
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(CoreConstants.DOT);
        decimalFormatSymbols.setMinusSign(CoreConstants.DASH_CHAR);
        setDecimalFormatSymbols(decimalFormatSymbols);
    }
}