package com.stripe.android.paymentsheet.forms;

import android.content.Context;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArgumentsKt;
import com.stripe.android.ui.core.elements.FormElement;
import com.stripe.android.ui.core.elements.FormItemSpec;
import com.stripe.android.ui.core.forms.TransformSpecToElements;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class TransformSpecToElement {
    private final TransformSpecToElements transformSpecToElements;

    public TransformSpecToElement(ResourceRepository resourceRepository, FormFragmentArguments formFragmentArguments, Context context) {
        s.g(resourceRepository, "resourceRepository");
        s.g(formFragmentArguments, "formFragmentArguments");
        s.g(context, "context");
        this.transformSpecToElements = new TransformSpecToElements(resourceRepository, FormFragmentArgumentsKt.getInitialValuesMap(formFragmentArguments), formFragmentArguments.getAmount(), formFragmentArguments.getShowCheckboxControlledFields(), formFragmentArguments.getMerchantName(), context, null, 64, null);
    }

    public final List<FormElement> transform$paymentsheet_release(List<? extends FormItemSpec> list) {
        s.g(list, "list");
        return this.transformSpecToElements.transform(list);
    }
}