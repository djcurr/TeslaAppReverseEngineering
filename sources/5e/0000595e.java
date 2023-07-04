package com.stripe.android.ui.core;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.q;
import vz.r;
import vz.v;
import wz.r0;
import wz.u;
import wz.x0;

/* loaded from: classes6.dex */
public final class CurrencyFormatter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final double MAJOR_UNIT_BASE = 10.0d;
    private static final Map<Set<String>, Integer> SERVER_DECIMAL_DIGITS;

    static {
        Set i11;
        Map<Set<String>, Integer> f11;
        i11 = x0.i("UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP");
        f11 = r0.f(v.a(i11, 2));
        SERVER_DECIMAL_DIGITS = f11;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String format$default(Companion companion, long j11, String str, Locale locale, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                locale = Locale.getDefault();
                s.f(locale, "getDefault()");
            }
            return companion.format(j11, str, locale);
        }

        private final int getDefaultDecimalDigits(Currency currency) {
            Map map = CurrencyFormatter.SERVER_DECIMAL_DIGITS;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String currencyCode = currency.getCurrencyCode();
                s.f(currencyCode, "currency.currencyCode");
                String upperCase = currencyCode.toUpperCase(Locale.ROOT);
                s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (((Set) entry.getKey()).contains(upperCase)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add(Integer.valueOf(((Number) entry2.getValue()).intValue()));
            }
            Integer num = (Integer) u.d0(arrayList);
            return num == null ? currency.getDefaultFractionDigits() : num.intValue();
        }

        public final String format(long j11, String amountCurrencyCode, Locale targetLocale) {
            s.g(amountCurrencyCode, "amountCurrencyCode");
            s.g(targetLocale, "targetLocale");
            String upperCase = amountCurrencyCode.toUpperCase(Locale.ROOT);
            s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Currency currency = Currency.getInstance(upperCase);
            s.f(currency, "getInstance(amountCurrencyCode.uppercase())");
            return format(j11, currency, targetLocale);
        }

        public static /* synthetic */ String format$default(Companion companion, long j11, Currency currency, Locale locale, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                locale = Locale.getDefault();
                s.f(locale, "getDefault()");
            }
            return companion.format(j11, currency, locale);
        }

        public final String format(long j11, Currency amountCurrency, Locale targetLocale) {
            s.g(amountCurrency, "amountCurrency");
            s.g(targetLocale, "targetLocale");
            int defaultDecimalDigits = getDefaultDecimalDigits(amountCurrency);
            double pow = j11 / Math.pow(CurrencyFormatter.MAJOR_UNIT_BASE, defaultDecimalDigits);
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(targetLocale);
            try {
                q.a aVar = q.f54772b;
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                q.b(r.a(th2));
            }
            if (currencyInstance != null) {
                DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrency(amountCurrency);
                decimalFormatSymbols.setCurrencySymbol(amountCurrency.getSymbol(targetLocale));
                ((DecimalFormat) currencyInstance).setMinimumFractionDigits(defaultDecimalDigits);
                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
                q.b(b0.f54756a);
                String format = currencyInstance.format(pow);
                s.f(format, "currencyFormat.format(majorUnitAmount)");
                return format;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.text.DecimalFormat");
        }
    }
}