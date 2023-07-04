package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.s;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.forms.CompleteFormFieldValueFilter$filterFlow$1", f = "CompleteFormFieldValueFilter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CompleteFormFieldValueFilter$filterFlow$1 extends l implements s<Map<IdentifierSpec, ? extends FormFieldEntry>, List<? extends IdentifierSpec>, Boolean, PaymentSelection.CustomerRequestedSave, d<? super FormFieldValues>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ CompleteFormFieldValueFilter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteFormFieldValueFilter$filterFlow$1(CompleteFormFieldValueFilter completeFormFieldValueFilter, d<? super CompleteFormFieldValueFilter$filterFlow$1> dVar) {
        super(5, dVar);
        this.this$0 = completeFormFieldValueFilter;
    }

    @Override // h00.s
    public /* bridge */ /* synthetic */ Object invoke(Map<IdentifierSpec, ? extends FormFieldEntry> map, List<? extends IdentifierSpec> list, Boolean bool, PaymentSelection.CustomerRequestedSave customerRequestedSave, d<? super FormFieldValues> dVar) {
        return invoke((Map<IdentifierSpec, FormFieldEntry>) map, (List<IdentifierSpec>) list, bool.booleanValue(), customerRequestedSave, dVar);
    }

    public final Object invoke(Map<IdentifierSpec, FormFieldEntry> map, List<IdentifierSpec> list, boolean z11, PaymentSelection.CustomerRequestedSave customerRequestedSave, d<? super FormFieldValues> dVar) {
        CompleteFormFieldValueFilter$filterFlow$1 completeFormFieldValueFilter$filterFlow$1 = new CompleteFormFieldValueFilter$filterFlow$1(this.this$0, dVar);
        completeFormFieldValueFilter$filterFlow$1.L$0 = map;
        completeFormFieldValueFilter$filterFlow$1.L$1 = list;
        completeFormFieldValueFilter$filterFlow$1.Z$0 = z11;
        completeFormFieldValueFilter$filterFlow$1.L$2 = customerRequestedSave;
        return completeFormFieldValueFilter$filterFlow$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FormFieldValues filterFlow;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            filterFlow = this.this$0.filterFlow((Map) this.L$0, (List) this.L$1, this.Z$0, (PaymentSelection.CustomerRequestedSave) this.L$2);
            return filterFlow;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}