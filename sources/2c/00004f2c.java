package com.stripe.android.link.injection;

import com.stripe.android.link.ui.forms.FormController;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import java.util.Map;
import java.util.Set;
import v20.o0;

/* loaded from: classes6.dex */
public interface FormControllerSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        FormControllerSubcomponent build();

        Builder formSpec(LayoutSpec layoutSpec);

        Builder initialValues(Map<IdentifierSpec, String> map);

        Builder viewModelScope(o0 o0Var);

        Builder viewOnlyFields(Set<IdentifierSpec> set);
    }

    FormController getFormController();
}