package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import wz.x;

/* loaded from: classes6.dex */
public final class CompleteFormFieldValueFilter {
    private final e<Map<IdentifierSpec, FormFieldEntry>> currentFieldValueMap;
    private final e<List<IdentifierSpec>> hiddenIdentifiers;
    private final e<Boolean> showingMandate;
    private final e<PaymentSelection.CustomerRequestedSave> userRequestedReuse;

    /* JADX WARN: Multi-variable type inference failed */
    public CompleteFormFieldValueFilter(e<? extends Map<IdentifierSpec, FormFieldEntry>> currentFieldValueMap, e<? extends List<IdentifierSpec>> hiddenIdentifiers, e<Boolean> showingMandate, e<? extends PaymentSelection.CustomerRequestedSave> userRequestedReuse) {
        s.g(currentFieldValueMap, "currentFieldValueMap");
        s.g(hiddenIdentifiers, "hiddenIdentifiers");
        s.g(showingMandate, "showingMandate");
        s.g(userRequestedReuse, "userRequestedReuse");
        this.currentFieldValueMap = currentFieldValueMap;
        this.hiddenIdentifiers = hiddenIdentifiers;
        this.showingMandate = showingMandate;
        this.userRequestedReuse = userRequestedReuse;
    }

    public final e<FormFieldValues> filterFlow() {
        return g.j(this.currentFieldValueMap, this.hiddenIdentifiers, this.showingMandate, this.userRequestedReuse, new CompleteFormFieldValueFilter$filterFlow$1(this, null));
    }

    public final e<Boolean> getShowingMandate() {
        return this.showingMandate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormFieldValues filterFlow(Map<IdentifierSpec, FormFieldEntry> map, List<IdentifierSpec> list, boolean z11, PaymentSelection.CustomerRequestedSave customerRequestedSave) {
        boolean z12;
        int t11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<IdentifierSpec, FormFieldEntry>> it2 = map.entrySet().iterator();
        while (true) {
            z12 = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<IdentifierSpec, FormFieldEntry> next = it2.next();
            if (true ^ list.contains(next.getKey())) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        FormFieldValues formFieldValues = new FormFieldValues(linkedHashMap, z11, customerRequestedSave);
        Collection<FormFieldEntry> values = linkedHashMap.values();
        t11 = x.t(values, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (FormFieldEntry formFieldEntry : values) {
            arrayList.add(Boolean.valueOf(formFieldEntry.isComplete()));
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (!((Boolean) it3.next()).booleanValue()) {
                        z12 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z12) {
            return formFieldValues;
        }
        return null;
    }
}