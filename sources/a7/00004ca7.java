package com.stripe.android.core.model;

import com.stripe.android.core.model.CountryCode;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class CountryCodeKt {
    public static final CountryCode getCountryCode(Locale locale) {
        s.g(locale, "<this>");
        CountryCode.Companion companion = CountryCode.Companion;
        String country = locale.getCountry();
        s.f(country, "this.country");
        return companion.create(country);
    }
}