package com.stripe.android.link.ui.forms;

import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.link.ui.forms.FormController$completeFormValues$2", f = "FormController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class FormController$completeFormValues$2 extends l implements q<Map<IdentifierSpec, ? extends FormFieldEntry>, List<? extends IdentifierSpec>, d<? super Map<IdentifierSpec, ? extends FormFieldEntry>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FormController$completeFormValues$2(d<? super FormController$completeFormValues$2> dVar) {
        super(3, dVar);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(Map<IdentifierSpec, ? extends FormFieldEntry> map, List<? extends IdentifierSpec> list, d<? super Map<IdentifierSpec, ? extends FormFieldEntry>> dVar) {
        return invoke2((Map<IdentifierSpec, FormFieldEntry>) map, (List<IdentifierSpec>) list, (d<? super Map<IdentifierSpec, FormFieldEntry>>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<IdentifierSpec, FormFieldEntry> map, List<IdentifierSpec> list, d<? super Map<IdentifierSpec, FormFieldEntry>> dVar) {
        FormController$completeFormValues$2 formController$completeFormValues$2 = new FormController$completeFormValues$2(dVar);
        formController$completeFormValues$2.L$0 = map;
        formController$completeFormValues$2.L$1 = list;
        return formController$completeFormValues$2.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            List list = (List) this.L$1;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) this.L$0).entrySet()) {
                if (!list.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}