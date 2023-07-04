package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.forms.FormFieldEntry;
import kotlinx.coroutines.flow.e;

/* loaded from: classes6.dex */
public interface InputController extends SectionFieldErrorController {
    e<String> getFieldValue();

    e<FormFieldEntry> getFormFieldValue();

    e<Integer> getLabel();

    e<String> getRawFieldValue();

    boolean getShowOptionalLabel();

    e<Boolean> isComplete();

    void onRawValueChange(String str);
}