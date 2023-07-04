package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.address.AddressFieldElementRepository;
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
public final class CardBillingSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final Set<String> validCountryCodes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<CardBillingSpec> serializer() {
            return CardBillingSpec$$serializer.INSTANCE;
        }
    }

    public CardBillingSpec() {
        this((IdentifierSpec) null, (Set) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardBillingSpec(int i11, IdentifierSpec identifierSpec, Set set, q1 q1Var) {
        super(null);
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, CardBillingSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = (i11 & 1) == 0 ? IdentifierSpec.Companion.Generic("card_billing") : identifierSpec;
        if ((i11 & 2) == 0) {
            this.validCountryCodes = BillingSpecKt.getSupportedBillingCountries();
        } else {
            this.validCountryCodes = set;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardBillingSpec copy$default(CardBillingSpec cardBillingSpec, IdentifierSpec identifierSpec, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = cardBillingSpec.getApiPath();
        }
        if ((i11 & 2) != 0) {
            set = cardBillingSpec.validCountryCodes;
        }
        return cardBillingSpec.copy(identifierSpec, set);
    }

    public static /* synthetic */ void getValidCountryCodes$annotations() {
    }

    public static final void write$Self(CardBillingSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || !s.c(self.getApiPath(), IdentifierSpec.Companion.Generic("card_billing"))) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (output.k(serialDesc, 1) || !s.c(self.validCountryCodes, BillingSpecKt.getSupportedBillingCountries())) {
            output.q(serialDesc, 1, new q0(u1.f27647a), self.validCountryCodes);
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final Set<String> component2() {
        return this.validCountryCodes;
    }

    public final CardBillingSpec copy(IdentifierSpec apiPath, Set<String> validCountryCodes) {
        s.g(apiPath, "apiPath");
        s.g(validCountryCodes, "validCountryCodes");
        return new CardBillingSpec(apiPath, validCountryCodes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardBillingSpec) {
            CardBillingSpec cardBillingSpec = (CardBillingSpec) obj;
            return s.c(getApiPath(), cardBillingSpec.getApiPath()) && s.c(this.validCountryCodes, cardBillingSpec.validCountryCodes);
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Set<String> getValidCountryCodes() {
        return this.validCountryCodes;
    }

    public int hashCode() {
        return (getApiPath().hashCode() * 31) + this.validCountryCodes.hashCode();
    }

    public String toString() {
        return "CardBillingSpec(apiPath=" + getApiPath() + ", validCountryCodes=" + this.validCountryCodes + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final SectionElement transform(AddressFieldElementRepository addressRepository, Map<IdentifierSpec, String> initialValues) {
        s.g(addressRepository, "addressRepository");
        s.g(initialValues, "initialValues");
        return createSectionElement$payments_ui_core_release(new CardBillingAddressElement(IdentifierSpec.Companion.Generic("credit_billing"), initialValues, addressRepository, this.validCountryCodes, null, 16, null), Integer.valueOf(R.string.billing_details));
    }

    public /* synthetic */ CardBillingSpec(IdentifierSpec identifierSpec, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.Generic("card_billing") : identifierSpec, (i11 & 2) != 0 ? BillingSpecKt.getSupportedBillingCountries() : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBillingSpec(IdentifierSpec apiPath, Set<String> validCountryCodes) {
        super(null);
        s.g(apiPath, "apiPath");
        s.g(validCountryCodes, "validCountryCodes");
        this.apiPath = apiPath;
        this.validCountryCodes = validCountryCodes;
    }
}