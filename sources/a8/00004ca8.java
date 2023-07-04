package com.stripe.android.core.model;

import com.stripe.android.core.model.CountryCode;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.text.i;
import wz.e0;
import wz.w;
import wz.x0;
import yz.b;

/* loaded from: classes2.dex */
public final class CountryUtils {
    private static final Set<String> CARD_POSTAL_CODE_COUNTRIES;
    public static final CountryUtils INSTANCE = new CountryUtils();
    private static Locale cachedCountriesLocale;
    private static List<Country> cachedOrderedLocalizedCountries;

    static {
        Set<String> i11;
        List<Country> i12;
        i11 = x0.i("US", "GB", "CA");
        CARD_POSTAL_CODE_COUNTRIES = i11;
        i12 = w.i();
        cachedOrderedLocalizedCountries = i12;
    }

    private CountryUtils() {
    }

    private final List<Country> getSortedLocalizedCountries(Locale locale) {
        List G0;
        if (s.c(locale, cachedCountriesLocale)) {
            return cachedOrderedLocalizedCountries;
        }
        cachedCountriesLocale = locale;
        G0 = e0.G0(localizedCountries(locale), new Comparator() { // from class: com.stripe.android.core.model.CountryUtils$getSortedLocalizedCountries$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int a11;
                CountryUtils countryUtils = CountryUtils.INSTANCE;
                a11 = b.a(countryUtils.formatNameForSorting$stripe_core_release(((Country) t11).getName()), countryUtils.formatNameForSorting$stripe_core_release(((Country) t12).getName()));
                return a11;
            }
        });
        ArrayList arrayList = new ArrayList();
        for (Object obj : G0) {
            if (!s.c(((Country) obj).getCode(), CountryCodeKt.getCountryCode(locale))) {
                arrayList.add(obj);
            }
        }
        cachedOrderedLocalizedCountries = arrayList;
        return arrayList;
    }

    private final List<Country> localizedCountries(Locale locale) {
        String[] iSOCountries = Locale.getISOCountries();
        s.f(iSOCountries, "getISOCountries()");
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        for (String code : iSOCountries) {
            CountryCode.Companion companion = CountryCode.Companion;
            s.f(code, "code");
            CountryCode create = companion.create(code);
            String displayCountry = new Locale("", code).getDisplayCountry(locale);
            s.f(displayCountry, "Locale(\"\", code).getDisplayCountry(currentLocale)");
            arrayList.add(new Country(create, displayCountry));
        }
        return arrayList;
    }

    public final /* synthetic */ boolean doesCountryUsePostalCode(String countryCode) {
        s.g(countryCode, "countryCode");
        Set<String> set = CARD_POSTAL_CODE_COUNTRIES;
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return set.contains(upperCase);
    }

    public final String formatNameForSorting$stripe_core_release(String name) {
        s.g(name, "name");
        String lowerCase = name.toLowerCase(Locale.ROOT);
        s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String normalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
        s.f(normalize, "normalize(name.lowercase(), Normalizer.Form.NFD)");
        return new i("\\p{Mn}+").i(normalize, "");
    }

    public final Set<String> getCARD_POSTAL_CODE_COUNTRIES$stripe_core_release() {
        return CARD_POSTAL_CODE_COUNTRIES;
    }

    public final /* synthetic */ Country getCountryByCode(CountryCode countryCode, Locale currentLocale) {
        Object obj;
        s.g(currentLocale, "currentLocale");
        Iterator<T> it2 = localizedCountries(currentLocale).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (s.c(((Country) obj).getCode(), countryCode)) {
                break;
            }
        }
        return (Country) obj;
    }

    public final /* synthetic */ CountryCode getCountryCodeByName(String countryName, Locale currentLocale) {
        Object obj;
        s.g(countryName, "countryName");
        s.g(currentLocale, "currentLocale");
        Iterator<T> it2 = localizedCountries(currentLocale).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (s.c(((Country) obj).getName(), countryName)) {
                break;
            }
        }
        Country country = (Country) obj;
        if (country == null) {
            return null;
        }
        return country.getCode();
    }

    public final /* synthetic */ String getDisplayCountry(CountryCode countryCode, Locale currentLocale) {
        s.g(countryCode, "countryCode");
        s.g(currentLocale, "currentLocale");
        Country countryByCode = getCountryByCode(countryCode, currentLocale);
        String name = countryByCode == null ? null : countryByCode.getName();
        if (name == null) {
            String displayCountry = new Locale("", countryCode.getValue()).getDisplayCountry(currentLocale);
            s.f(displayCountry, "Locale(\"\", countryCode.v…layCountry(currentLocale)");
            return displayCountry;
        }
        return name;
    }

    public final /* synthetic */ List getOrderedCountries(Locale currentLocale) {
        List m11;
        List y02;
        s.g(currentLocale, "currentLocale");
        m11 = w.m(getCountryByCode(CountryCodeKt.getCountryCode(currentLocale), currentLocale));
        y02 = e0.y0(m11, getSortedLocalizedCountries(currentLocale));
        return y02;
    }

    public final /* synthetic */ boolean doesCountryUsePostalCode(CountryCode countryCode) {
        s.g(countryCode, "countryCode");
        return CARD_POSTAL_CODE_COUNTRIES.contains(countryCode.getValue());
    }
}