package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q0;
import g30.q1;
import g30.u1;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class CountrySpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final Set<String> onlyShowCountryCodes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<CountrySpec> serializer() {
            return CountrySpec$$serializer.INSTANCE;
        }
    }

    public CountrySpec() {
        this((IdentifierSpec) null, (Set) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountrySpec(int i11, IdentifierSpec identifierSpec, Set set, q1 q1Var) {
        super(null);
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, CountrySpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = (i11 & 1) == 0 ? IdentifierSpec.Companion.getCountry() : identifierSpec;
        if ((i11 & 2) == 0) {
            this.onlyShowCountryCodes = BillingSpecKt.getSupportedBillingCountries();
        } else {
            this.onlyShowCountryCodes = set;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountrySpec copy$default(CountrySpec countrySpec, IdentifierSpec identifierSpec, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = countrySpec.getApiPath();
        }
        if ((i11 & 2) != 0) {
            set = countrySpec.onlyShowCountryCodes;
        }
        return countrySpec.copy(identifierSpec, set);
    }

    public static /* synthetic */ void getOnlyShowCountryCodes$annotations() {
    }

    public static final void write$Self(CountrySpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || !s.c(self.getApiPath(), IdentifierSpec.Companion.getCountry())) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (output.k(serialDesc, 1) || !s.c(self.onlyShowCountryCodes, BillingSpecKt.getSupportedBillingCountries())) {
            output.q(serialDesc, 1, new q0(u1.f27647a), self.onlyShowCountryCodes);
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final Set<String> component2() {
        return this.onlyShowCountryCodes;
    }

    public final CountrySpec copy(IdentifierSpec apiPath, Set<String> onlyShowCountryCodes) {
        s.g(apiPath, "apiPath");
        s.g(onlyShowCountryCodes, "onlyShowCountryCodes");
        return new CountrySpec(apiPath, onlyShowCountryCodes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CountrySpec) {
            CountrySpec countrySpec = (CountrySpec) obj;
            return s.c(getApiPath(), countrySpec.getApiPath()) && s.c(this.onlyShowCountryCodes, countrySpec.onlyShowCountryCodes);
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Set<String> getOnlyShowCountryCodes() {
        return this.onlyShowCountryCodes;
    }

    public int hashCode() {
        return (getApiPath().hashCode() * 31) + this.onlyShowCountryCodes.hashCode();
    }

    public String toString() {
        return "CountrySpec(apiPath=" + getApiPath() + ", onlyShowCountryCodes=" + this.onlyShowCountryCodes + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        s.g(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new CountryElement(getApiPath(), new DropdownFieldController(new CountryConfig(this.onlyShowCountryCodes, null, false, 6, null), initialValues.get(getApiPath()))), null, 2, null);
    }

    public /* synthetic */ CountrySpec(IdentifierSpec identifierSpec, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.getCountry() : identifierSpec, (i11 & 2) != 0 ? BillingSpecKt.getSupportedBillingCountries() : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySpec(IdentifierSpec apiPath, Set<String> onlyShowCountryCodes) {
        super(null);
        s.g(apiPath, "apiPath");
        s.g(onlyShowCountryCodes, "onlyShowCountryCodes");
        this.apiPath = apiPath;
        this.onlyShowCountryCodes = onlyShowCountryCodes;
    }
}