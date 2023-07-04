package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.address.AddressFieldElementRepository;
import g30.f1;
import g30.q1;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;
import wz.u;
import wz.x0;

@a
/* loaded from: classes6.dex */
public final class AddressSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final Set<DisplayField> displayFields;
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

        public final b<AddressSpec> serializer() {
            return AddressSpec$$serializer.INSTANCE;
        }
    }

    public AddressSpec() {
        this((IdentifierSpec) null, (Set) null, (Set) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressSpec(int i11, IdentifierSpec identifierSpec, Set set, Set set2, q1 q1Var) {
        super(null);
        Set<DisplayField> d11;
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, AddressSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = (i11 & 1) == 0 ? IdentifierSpec.Companion.Generic("billing_details[address]") : identifierSpec;
        if ((i11 & 2) == 0) {
            this.validCountryCodes = BillingSpecKt.getSupportedBillingCountries();
        } else {
            this.validCountryCodes = set;
        }
        if ((i11 & 4) != 0) {
            this.displayFields = set2;
            return;
        }
        d11 = x0.d();
        this.displayFields = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressSpec copy$default(AddressSpec addressSpec, IdentifierSpec identifierSpec, Set set, Set set2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = addressSpec.getApiPath();
        }
        if ((i11 & 2) != 0) {
            set = addressSpec.validCountryCodes;
        }
        if ((i11 & 4) != 0) {
            set2 = addressSpec.displayFields;
        }
        return addressSpec.copy(identifierSpec, set, set2);
    }

    public static /* synthetic */ void getDisplayFields$annotations() {
    }

    public static /* synthetic */ void getValidCountryCodes$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (kotlin.jvm.internal.s.c(r3, r4) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.stripe.android.ui.core.elements.AddressSpec r5, f30.d r6, e30.f r7) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.s.g(r6, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.s.g(r7, r0)
            r0 = 0
            boolean r1 = r6.k(r7, r0)
            r2 = 1
            if (r1 == 0) goto L19
        L17:
            r1 = r2
            goto L2d
        L19:
            com.stripe.android.ui.core.elements.IdentifierSpec r1 = r5.getApiPath()
            com.stripe.android.ui.core.elements.IdentifierSpec$Companion r3 = com.stripe.android.ui.core.elements.IdentifierSpec.Companion
            java.lang.String r4 = "billing_details[address]"
            com.stripe.android.ui.core.elements.IdentifierSpec r3 = r3.Generic(r4)
            boolean r1 = kotlin.jvm.internal.s.c(r1, r3)
            if (r1 != 0) goto L2c
            goto L17
        L2c:
            r1 = r0
        L2d:
            if (r1 == 0) goto L38
            com.stripe.android.ui.core.elements.IdentifierSpec$$serializer r1 = com.stripe.android.ui.core.elements.IdentifierSpec$$serializer.INSTANCE
            com.stripe.android.ui.core.elements.IdentifierSpec r3 = r5.getApiPath()
            r6.q(r7, r0, r1, r3)
        L38:
            boolean r1 = r6.k(r7, r2)
            if (r1 == 0) goto L40
        L3e:
            r1 = r2
            goto L4e
        L40:
            java.util.Set<java.lang.String> r1 = r5.validCountryCodes
            java.util.Set r3 = com.stripe.android.ui.core.elements.BillingSpecKt.getSupportedBillingCountries()
            boolean r1 = kotlin.jvm.internal.s.c(r1, r3)
            if (r1 != 0) goto L4d
            goto L3e
        L4d:
            r1 = r0
        L4e:
            if (r1 == 0) goto L5c
            g30.q0 r1 = new g30.q0
            g30.u1 r3 = g30.u1.f27647a
            r1.<init>(r3)
            java.util.Set<java.lang.String> r3 = r5.validCountryCodes
            r6.q(r7, r2, r1, r3)
        L5c:
            r1 = 2
            boolean r3 = r6.k(r7, r1)
            if (r3 == 0) goto L65
        L63:
            r0 = r2
            goto L72
        L65:
            java.util.Set<com.stripe.android.ui.core.elements.DisplayField> r3 = r5.displayFields
            java.util.Set r4 = wz.v0.d()
            boolean r3 = kotlin.jvm.internal.s.c(r3, r4)
            if (r3 != 0) goto L72
            goto L63
        L72:
            if (r0 == 0) goto L80
            g30.q0 r0 = new g30.q0
            com.stripe.android.ui.core.elements.DisplayField$$serializer r2 = com.stripe.android.ui.core.elements.DisplayField$$serializer.INSTANCE
            r0.<init>(r2)
            java.util.Set<com.stripe.android.ui.core.elements.DisplayField> r5 = r5.displayFields
            r6.q(r7, r1, r0, r5)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.AddressSpec.write$Self(com.stripe.android.ui.core.elements.AddressSpec, f30.d, e30.f):void");
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final Set<String> component2() {
        return this.validCountryCodes;
    }

    public final Set<DisplayField> component3() {
        return this.displayFields;
    }

    public final AddressSpec copy(IdentifierSpec apiPath, Set<String> validCountryCodes, Set<? extends DisplayField> displayFields) {
        s.g(apiPath, "apiPath");
        s.g(validCountryCodes, "validCountryCodes");
        s.g(displayFields, "displayFields");
        return new AddressSpec(apiPath, validCountryCodes, displayFields);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressSpec) {
            AddressSpec addressSpec = (AddressSpec) obj;
            return s.c(getApiPath(), addressSpec.getApiPath()) && s.c(this.validCountryCodes, addressSpec.validCountryCodes) && s.c(this.displayFields, addressSpec.displayFields);
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Set<DisplayField> getDisplayFields() {
        return this.displayFields;
    }

    public final Set<String> getValidCountryCodes() {
        return this.validCountryCodes;
    }

    public int hashCode() {
        return (((getApiPath().hashCode() * 31) + this.validCountryCodes.hashCode()) * 31) + this.displayFields.hashCode();
    }

    public String toString() {
        return "AddressSpec(apiPath=" + getApiPath() + ", validCountryCodes=" + this.validCountryCodes + ", displayFields=" + this.displayFields + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues, AddressFieldElementRepository addressRepository) {
        SectionFieldElement addressElement;
        s.g(initialValues, "initialValues");
        s.g(addressRepository, "addressRepository");
        if (this.displayFields.size() == 1 && u.a0(this.displayFields) == DisplayField.Country) {
            addressElement = new CountryElement(IdentifierSpec.Companion.Generic("billing_details[address][country]"), new DropdownFieldController(new CountryConfig(this.validCountryCodes, null, false, 6, null), initialValues.get(getApiPath())));
        } else {
            addressElement = new AddressElement(getApiPath(), addressRepository, initialValues, this.validCountryCodes, null, 16, null);
        }
        return createSectionElement$payments_ui_core_release(addressElement, Integer.valueOf(R.string.billing_details));
    }

    public /* synthetic */ AddressSpec(IdentifierSpec identifierSpec, Set set, Set set2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.Generic("billing_details[address]") : identifierSpec, (i11 & 2) != 0 ? BillingSpecKt.getSupportedBillingCountries() : set, (i11 & 4) != 0 ? x0.d() : set2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressSpec(IdentifierSpec apiPath, Set<String> validCountryCodes, Set<? extends DisplayField> displayFields) {
        super(null);
        s.g(apiPath, "apiPath");
        s.g(validCountryCodes, "validCountryCodes");
        s.g(displayFields, "displayFields");
        this.apiPath = apiPath;
        this.validCountryCodes = validCountryCodes;
        this.displayFields = displayFields;
    }
}