package com.stripe.android.view;

import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.view.ShippingInfoWidget;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.r0;

/* loaded from: classes6.dex */
public final class PostalCodeValidator {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final Map<String, Pattern> POSTAL_CODE_PATTERNS;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPostalCodeNotRequired(List<? extends ShippingInfoWidget.CustomizableShippingField> list, List<? extends ShippingInfoWidget.CustomizableShippingField> list2) {
            ShippingInfoWidget.CustomizableShippingField customizableShippingField = ShippingInfoWidget.CustomizableShippingField.PostalCode;
            return list.contains(customizableShippingField) || list2.contains(customizableShippingField);
        }
    }

    static {
        Map<String, Pattern> f11;
        f11 = r0.f(vz.v.a(Locale.US.getCountry(), Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")));
        POSTAL_CODE_PATTERNS = f11;
    }

    public final boolean isValid(String postalCode, String countryCode) {
        boolean w11;
        Matcher matcher;
        kotlin.jvm.internal.s.g(postalCode, "postalCode");
        kotlin.jvm.internal.s.g(countryCode, "countryCode");
        Pattern pattern = POSTAL_CODE_PATTERNS.get(countryCode);
        Boolean bool = null;
        if (pattern != null && (matcher = pattern.matcher(postalCode)) != null) {
            bool = Boolean.valueOf(matcher.matches());
        }
        if (bool == null) {
            if (CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCode)) {
                w11 = kotlin.text.v.w(postalCode);
                return w11 ^ true;
            }
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean isValid$payments_core_release(String postalCode, String str, List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields) {
        boolean w11;
        Matcher matcher;
        kotlin.jvm.internal.s.g(postalCode, "postalCode");
        kotlin.jvm.internal.s.g(optionalShippingInfoFields, "optionalShippingInfoFields");
        kotlin.jvm.internal.s.g(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        if (str == null) {
            return false;
        }
        if (!(postalCode.length() == 0) || !Companion.isPostalCodeNotRequired(optionalShippingInfoFields, hiddenShippingInfoFields)) {
            Pattern pattern = POSTAL_CODE_PATTERNS.get(str);
            Boolean bool = null;
            if (pattern != null && (matcher = pattern.matcher(postalCode)) != null) {
                bool = Boolean.valueOf(matcher.matches());
            }
            if (bool == null) {
                if (CountryUtils.INSTANCE.doesCountryUsePostalCode(str)) {
                    w11 = kotlin.text.v.w(postalCode);
                    if (!(!w11)) {
                        return false;
                    }
                }
            } else {
                return bool.booleanValue();
            }
        }
        return true;
    }
}