package com.stripe.android.link.ui.forms;

import com.stripe.android.ui.core.elements.IdentifierSpec;
import h00.q;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.link.ui.forms.FormController$lastTextFieldIdentifier$1", f = "FormController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class FormController$lastTextFieldIdentifier$1 extends l implements q<List<? extends IdentifierSpec>, List<? extends IdentifierSpec>, d<? super IdentifierSpec>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FormController$lastTextFieldIdentifier$1(d<? super FormController$lastTextFieldIdentifier$1> dVar) {
        super(3, dVar);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(List<? extends IdentifierSpec> list, List<? extends IdentifierSpec> list2, d<? super IdentifierSpec> dVar) {
        return invoke2((List<IdentifierSpec>) list, (List<IdentifierSpec>) list2, dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(List<IdentifierSpec> list, List<IdentifierSpec> list2, d<? super IdentifierSpec> dVar) {
        FormController$lastTextFieldIdentifier$1 formController$lastTextFieldIdentifier$1 = new FormController$lastTextFieldIdentifier$1(dVar);
        formController$lastTextFieldIdentifier$1.L$0 = list;
        formController$lastTextFieldIdentifier$1.L$1 = list2;
        return formController$lastTextFieldIdentifier$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            List list = (List) this.L$0;
            List list2 = (List) this.L$1;
            ListIterator listIterator = list2.listIterator(list2.size());
            while (listIterator.hasPrevious()) {
                Object previous = listIterator.previous();
                if (!list.contains((IdentifierSpec) previous)) {
                    return previous;
                }
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}