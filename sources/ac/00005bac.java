package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.AddressSpec;
import com.stripe.android.ui.core.elements.BillingSpecKt;
import com.stripe.android.ui.core.elements.EmailSpec;
import com.stripe.android.ui.core.elements.IbanSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.elements.MandateTextSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.TranslationId;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SepaDebitSpecKt {
    private static final LayoutSpec SepaDebitForm;
    private static final MandateTextSpec sepaDebitMandate;

    static {
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        MandateTextSpec mandateTextSpec = new MandateTextSpec(companion.Generic("mandate"), R.string.sepa_mandate);
        sepaDebitMandate = mandateTextSpec;
        SepaDebitForm = LayoutSpec.Companion.create(new NameSpec((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null), new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null), new IbanSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null), new AddressSpec(companion.Generic("address"), BillingSpecKt.getSupportedBillingCountries(), (Set) null, 4, (DefaultConstructorMarker) null), mandateTextSpec);
    }

    public static final LayoutSpec getSepaDebitForm() {
        return SepaDebitForm;
    }

    public static final MandateTextSpec getSepaDebitMandate() {
        return sepaDebitMandate;
    }
}