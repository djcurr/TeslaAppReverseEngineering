package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.elements.CountrySpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.x0;

/* loaded from: classes6.dex */
public final class SofortSpecKt {
    private static final LayoutSpec SofortForm;
    private static final CountrySpec sofortCountrySection;

    static {
        Set i11;
        i11 = x0.i("AT", "BE", "DE", "ES", "IT", "NL");
        CountrySpec countrySpec = new CountrySpec((IdentifierSpec) null, i11, 1, (DefaultConstructorMarker) null);
        sofortCountrySection = countrySpec;
        SofortForm = LayoutSpec.Companion.create(countrySpec);
    }

    public static final CountrySpec getSofortCountrySection() {
        return sofortCountrySection;
    }

    public static final LayoutSpec getSofortForm() {
        return SofortForm;
    }
}