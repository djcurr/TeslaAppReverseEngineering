package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import vz.p;
import wz.w;

/* loaded from: classes6.dex */
public abstract class FormElement {
    public static final int $stable = 0;

    private FormElement() {
    }

    public /* synthetic */ FormElement(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Controller getController();

    public abstract e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow();

    public abstract IdentifierSpec getIdentifier();

    public e<List<IdentifierSpec>> getTextFieldIdentifiers() {
        List i11;
        i11 = w.i();
        return j0.a(i11);
    }
}