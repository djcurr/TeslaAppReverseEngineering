package com.stripe.android.ui.core.elements;

import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.ui.core.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import wz.u;
import wz.x;

/* loaded from: classes6.dex */
public final class CountryConfig implements DropdownConfig {
    public static final int $stable = 8;
    private final List<Country> countries;
    private final String debugLabel;
    private final List<String> displayItems;
    private final boolean flagMode;
    private final int label;
    private final Locale locale;
    private final Set<String> onlyShowCountryCodes;
    private final boolean tinyMode;

    public CountryConfig() {
        this(null, null, false, 7, null);
    }

    public CountryConfig(Set<String> onlyShowCountryCodes, Locale locale, boolean z11) {
        int t11;
        s.g(onlyShowCountryCodes, "onlyShowCountryCodes");
        s.g(locale, "locale");
        this.onlyShowCountryCodes = onlyShowCountryCodes;
        this.locale = locale;
        this.flagMode = z11;
        this.debugLabel = "country";
        this.label = R.string.address_label_country;
        this.tinyMode = z11;
        List orderedCountries = CountryUtils.INSTANCE.getOrderedCountries(locale);
        ArrayList<Country> arrayList = new ArrayList();
        for (Object obj : orderedCountries) {
            if (getOnlyShowCountryCodes().isEmpty() || getOnlyShowCountryCodes().contains(((Country) obj).getCode().getValue())) {
                arrayList.add(obj);
            }
        }
        this.countries = arrayList;
        t11 = x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (Country country : arrayList) {
            arrayList2.add(countryCodeToEmoji(country.getCode().getValue()) + ' ' + country.getName());
        }
        this.displayItems = arrayList2;
    }

    private final String countryCodeToEmoji(String str) {
        if (str.length() != 2) {
            return "🌐";
        }
        char[] chars = Character.toChars((Character.codePointAt(str, 0) - 65) + 127462);
        s.f(chars, "toChars(firstLetter)");
        String str2 = new String(chars);
        char[] chars2 = Character.toChars((Character.codePointAt(str, 1) - 65) + 127462);
        s.f(chars2, "toChars(secondLetter)");
        return s.p(str2, new String(chars2));
    }

    private final String getCountryName(String str) {
        int Z;
        Z = w.Z(str, " ", 0, false, 6, null);
        String substring = str.substring(Z + 1);
        s.f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public String convertFromRaw(String rawValue) {
        s.g(rawValue, "rawValue");
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        CountryCode create = CountryCode.Companion.create(rawValue);
        Locale locale = Locale.getDefault();
        s.f(locale, "getDefault()");
        Country countryByCode = countryUtils.getCountryByCode(create, locale);
        String str = null;
        if (countryByCode != null) {
            Integer valueOf = Integer.valueOf(getCountries$payments_ui_core_release().indexOf(countryByCode));
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                str = getDisplayItems().get(valueOf.intValue());
            }
        }
        if (str == null) {
            String str2 = (String) u.d0(getDisplayItems());
            return str2 == null ? "" : str2;
        }
        return str;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public String convertToRaw(String displayName) {
        s.g(displayName, "displayName");
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        String countryName = getCountryName(displayName);
        Locale locale = Locale.getDefault();
        s.f(locale, "getDefault()");
        CountryCode countryCodeByName = countryUtils.getCountryCodeByName(countryName, locale);
        if (countryCodeByName == null) {
            return null;
        }
        return countryCodeByName.getValue();
    }

    public final List<Country> getCountries$payments_ui_core_release() {
        return this.countries;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public List<String> getDisplayItems() {
        return this.displayItems;
    }

    public final boolean getFlagMode() {
        return this.flagMode;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public int getLabel() {
        return this.label;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Set<String> getOnlyShowCountryCodes() {
        return this.onlyShowCountryCodes;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public String getSelectedItemLabel(int i11) {
        String name;
        Country country = (Country) u.e0(this.countries, i11);
        if (country == null) {
            return "";
        }
        if (getFlagMode()) {
            name = countryCodeToEmoji(country.getCode().getValue());
        } else {
            name = country.getName();
        }
        return name == null ? "" : name;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public boolean getTinyMode() {
        return this.tinyMode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CountryConfig(java.util.Set r1, java.util.Locale r2, boolean r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L8
            java.util.Set r1 = wz.v0.d()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L15
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r5 = "getDefault()"
            kotlin.jvm.internal.s.f(r2, r5)
        L15:
            r4 = r4 & 4
            if (r4 == 0) goto L1a
            r3 = 0
        L1a:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CountryConfig.<init>(java.util.Set, java.util.Locale, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}