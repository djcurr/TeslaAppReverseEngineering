package com.stripe.android.paymentsheet.forms;

import com.stripe.android.ui.core.elements.FormElement;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.MandateTextElement;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import wz.u;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$showingMandate$2", f = "FormViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class FormViewModel$showingMandate$2 extends l implements q<List<? extends IdentifierSpec>, List<? extends FormElement>, d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FormViewModel$showingMandate$2(d<? super FormViewModel$showingMandate$2> dVar) {
        super(3, dVar);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(List<? extends IdentifierSpec> list, List<? extends FormElement> list2, d<? super Boolean> dVar) {
        return invoke2((List<IdentifierSpec>) list, list2, dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(List<IdentifierSpec> list, List<? extends FormElement> list2, d<? super Boolean> dVar) {
        FormViewModel$showingMandate$2 formViewModel$showingMandate$2 = new FormViewModel$showingMandate$2(dVar);
        formViewModel$showingMandate$2.L$0 = list;
        formViewModel$showingMandate$2.L$1 = list2;
        return formViewModel$showingMandate$2.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            List list = (List) this.L$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) this.L$1) {
                if (obj2 instanceof MandateTextElement) {
                    arrayList.add(obj2);
                }
            }
            MandateTextElement mandateTextElement = (MandateTextElement) u.d0(arrayList);
            return b.a(mandateTextElement == null ? false : !list.contains(mandateTextElement.getIdentifier()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}