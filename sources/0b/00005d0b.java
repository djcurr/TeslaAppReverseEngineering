package com.stripe.android.view;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class PaymentUtils {
    public static final int $stable = 0;
    public static final PaymentUtils INSTANCE = new PaymentUtils();

    private PaymentUtils() {
    }

    public static final String formatPriceStringUsingFree(long j11, Currency currency, String free) {
        kotlin.jvm.internal.s.g(currency, "currency");
        kotlin.jvm.internal.s.g(free, "free");
        if (j11 == 0) {
            return free;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        Objects.requireNonNull(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return INSTANCE.formatPriceString$payments_core_release(j11, currency);
    }

    public final /* synthetic */ String formatPriceString$payments_core_release(double d11, Currency currency) {
        kotlin.jvm.internal.s.g(currency, "currency");
        double pow = d11 / Math.pow(10.0d, currency.getDefaultFractionDigits());
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        try {
            if (currencyInstance != null) {
                DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
                String format = currencyInstance.format(pow);
                kotlin.jvm.internal.s.f(format, "{\n            val decima…ajorUnitAmount)\n        }");
                return format;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.text.DecimalFormat");
        } catch (ClassCastException unused) {
            String format2 = currencyInstance.format(pow);
            kotlin.jvm.internal.s.f(format2, "{\n            currencyFo…ajorUnitAmount)\n        }");
            return format2;
        }
    }
}