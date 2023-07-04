package com.stripe.android;

import ch.qos.logback.core.CoreConstants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PayWithGoogleUtils {
    public static final int $stable = 0;
    public static final PayWithGoogleUtils INSTANCE = new PayWithGoogleUtils();

    private PayWithGoogleUtils() {
    }

    public static final String getPriceString(int i11, Currency currency) {
        s.g(currency, "currency");
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder();
        if (defaultFractionDigits == 0) {
            int i12 = 0;
            while (i12 < length) {
                i12++;
                sb2.append('#');
            }
            DecimalFormat decimalFormat = new DecimalFormat(sb2.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
            decimalFormat.setCurrency(currency);
            decimalFormat.setGroupingUsed(false);
            String format = decimalFormat.format(Integer.valueOf(i11));
            s.f(format, "noDecimalCurrencyFormat.format(price)");
            return format;
        }
        int i13 = length - defaultFractionDigits;
        int i14 = 0;
        while (i14 < i13) {
            i14++;
            sb2.append('#');
        }
        if (length <= defaultFractionDigits) {
            sb2.append('0');
        }
        sb2.append(CoreConstants.DOT);
        int i15 = 0;
        while (i15 < defaultFractionDigits) {
            i15++;
            sb2.append('0');
        }
        double pow = i11 / Math.pow(10.0d, defaultFractionDigits);
        DecimalFormat decimalFormat2 = new DecimalFormat(sb2.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
        decimalFormat2.setCurrency(currency);
        decimalFormat2.setGroupingUsed(false);
        String format2 = decimalFormat2.format(pow);
        s.f(format2, "decimalFormat.format(decimalPrice)");
        return format2;
    }
}