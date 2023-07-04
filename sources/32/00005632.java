package com.stripe.android.paymentsheet.forms;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.s0;

/* loaded from: classes6.dex */
public final class FormFieldValues {
    private final Map<IdentifierSpec, FormFieldEntry> fieldValuePairs;
    private final boolean showsMandate;
    private final PaymentSelection.CustomerRequestedSave userRequestedReuse;

    public FormFieldValues(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, boolean z11, PaymentSelection.CustomerRequestedSave userRequestedReuse) {
        s.g(fieldValuePairs, "fieldValuePairs");
        s.g(userRequestedReuse, "userRequestedReuse");
        this.fieldValuePairs = fieldValuePairs;
        this.showsMandate = z11;
        this.userRequestedReuse = userRequestedReuse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormFieldValues copy$default(FormFieldValues formFieldValues, Map map, boolean z11, PaymentSelection.CustomerRequestedSave customerRequestedSave, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = formFieldValues.fieldValuePairs;
        }
        if ((i11 & 2) != 0) {
            z11 = formFieldValues.showsMandate;
        }
        if ((i11 & 4) != 0) {
            customerRequestedSave = formFieldValues.userRequestedReuse;
        }
        return formFieldValues.copy(map, z11, customerRequestedSave);
    }

    public final Map<IdentifierSpec, FormFieldEntry> component1() {
        return this.fieldValuePairs;
    }

    public final boolean component2() {
        return this.showsMandate;
    }

    public final PaymentSelection.CustomerRequestedSave component3() {
        return this.userRequestedReuse;
    }

    public final FormFieldValues copy(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, boolean z11, PaymentSelection.CustomerRequestedSave userRequestedReuse) {
        s.g(fieldValuePairs, "fieldValuePairs");
        s.g(userRequestedReuse, "userRequestedReuse");
        return new FormFieldValues(fieldValuePairs, z11, userRequestedReuse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormFieldValues) {
            FormFieldValues formFieldValues = (FormFieldValues) obj;
            return s.c(this.fieldValuePairs, formFieldValues.fieldValuePairs) && this.showsMandate == formFieldValues.showsMandate && this.userRequestedReuse == formFieldValues.userRequestedReuse;
        }
        return false;
    }

    public final Map<IdentifierSpec, FormFieldEntry> getFieldValuePairs() {
        return this.fieldValuePairs;
    }

    public final boolean getShowsMandate() {
        return this.showsMandate;
    }

    public final PaymentSelection.CustomerRequestedSave getUserRequestedReuse() {
        return this.userRequestedReuse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.fieldValuePairs.hashCode() * 31;
        boolean z11 = this.showsMandate;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return ((hashCode + i11) * 31) + this.userRequestedReuse.hashCode();
    }

    public String toString() {
        return "FormFieldValues(fieldValuePairs=" + this.fieldValuePairs + ", showsMandate=" + this.showsMandate + ", userRequestedReuse=" + this.userRequestedReuse + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ FormFieldValues(Map map, boolean z11, PaymentSelection.CustomerRequestedSave customerRequestedSave, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s0.i() : map, z11, customerRequestedSave);
    }
}