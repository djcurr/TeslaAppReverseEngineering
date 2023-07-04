package com.stripe.android.view;

import android.widget.AutoCompleteTextView;
import com.stripe.android.core.model.Country;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class CountryAutoCompleteTextViewValidator implements AutoCompleteTextView.Validator {
    private final CountryAdapter countryAdapter;
    private final h00.l<Country, vz.b0> onCountrySelected;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryAutoCompleteTextViewValidator(CountryAdapter countryAdapter, h00.l<? super Country, vz.b0> onCountrySelected) {
        kotlin.jvm.internal.s.g(countryAdapter, "countryAdapter");
        kotlin.jvm.internal.s.g(onCountrySelected, "onCountrySelected");
        this.countryAdapter = countryAdapter;
        this.onCountrySelected = onCountrySelected;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public CharSequence fixText(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AutoCompleteTextView.Validator
    public boolean isValid(CharSequence charSequence) {
        Object obj;
        Iterator<T> it2 = this.countryAdapter.getUnfilteredCountries$payments_core_release().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (kotlin.jvm.internal.s.c(((Country) obj).getName(), String.valueOf(charSequence))) {
                break;
            }
        }
        this.onCountrySelected.invoke(obj);
        return ((Country) obj) != null;
    }
}