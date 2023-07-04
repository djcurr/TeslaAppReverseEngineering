package com.stripe.android.ui.core.elements;

import com.stripe.android.model.Source;
import com.stripe.android.ui.core.R;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;
import wz.w0;
import wz.x0;

/* loaded from: classes6.dex */
public final class KlarnaHelper {
    public static final int $stable;
    public static final KlarnaHelper INSTANCE = new KlarnaHelper();
    private static final Set<String> buyNowCountries;
    private static final Map<String, Set<String>> currencyToAllowedCountries;

    static {
        Set i11;
        Set c11;
        Set c12;
        Set c13;
        Set c14;
        Set c15;
        Map<String, Set<String>> l11;
        Set<String> i12;
        i11 = x0.i("AT", "FI", "DE", "NL", "BE", "ES", "IT", "FR");
        c11 = w0.c("DK");
        c12 = w0.c("NO");
        c13 = w0.c("SE");
        c14 = w0.c("GB");
        c15 = w0.c("US");
        l11 = s0.l(v.a(Source.EURO, i11), v.a("dkk", c11), v.a("nok", c12), v.a("sek", c13), v.a("gbp", c14), v.a(Source.USD, c15));
        currencyToAllowedCountries = l11;
        i12 = x0.i("AT", "BE", "DE", "IT", "NL", "ES", "SE");
        buyNowCountries = i12;
        $stable = 8;
    }

    private KlarnaHelper() {
    }

    public static /* synthetic */ int getKlarnaHeader$default(KlarnaHelper klarnaHelper, Locale locale, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = Locale.getDefault();
            s.f(locale, "getDefault()");
        }
        return klarnaHelper.getKlarnaHeader(locale);
    }

    public final Set<String> getAllowedCountriesForCurrency(String str) {
        Set<String> d11;
        Set<String> set = currencyToAllowedCountries.get(str);
        if (set == null) {
            d11 = x0.d();
            return d11;
        }
        return set;
    }

    public final int getKlarnaHeader(Locale locale) {
        s.g(locale, "locale");
        if (buyNowCountries.contains(locale.getCountry())) {
            return R.string.klarna_buy_now_pay_later;
        }
        return R.string.klarna_pay_later;
    }
}