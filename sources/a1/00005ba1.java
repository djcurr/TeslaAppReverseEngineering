package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.elements.AddressSpec;
import com.stripe.android.ui.core.elements.AfterpayClearpayTextSpec;
import com.stripe.android.ui.core.elements.BillingSpecKt;
import com.stripe.android.ui.core.elements.EmailSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.TranslationId;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AfterpayClearpaySpecKt {
    private static final LayoutSpec AfterpayClearpayForm;
    private static final AfterpayClearpayTextSpec afterpayClearpayHeader;

    static {
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        AfterpayClearpayTextSpec afterpayClearpayTextSpec = new AfterpayClearpayTextSpec(companion.Generic("afterpay_clearpay_header"));
        afterpayClearpayHeader = afterpayClearpayTextSpec;
        AfterpayClearpayForm = LayoutSpec.Companion.create(afterpayClearpayTextSpec, new NameSpec((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null), new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null), new AddressSpec(companion.Generic("address"), BillingSpecKt.getSupportedBillingCountries(), (Set) null, 4, (DefaultConstructorMarker) null));
    }

    public static final LayoutSpec getAfterpayClearpayForm() {
        return AfterpayClearpayForm;
    }

    public static final AfterpayClearpayTextSpec getAfterpayClearpayHeader() {
        return afterpayClearpayHeader;
    }
}