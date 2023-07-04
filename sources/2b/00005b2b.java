package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.e;
import vz.p;

/* loaded from: classes6.dex */
public interface SectionFieldElement {
    e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow();

    IdentifierSpec getIdentifier();

    e<List<IdentifierSpec>> getTextFieldIdentifiers();

    SectionFieldErrorController sectionFieldErrorController();

    void setRawValue(Map<IdentifierSpec, String> map);
}