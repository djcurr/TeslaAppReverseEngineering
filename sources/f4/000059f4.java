package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.q;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.p;
import vz.r;
import wz.v;
import zz.d;

@f(c = "com.stripe.android.ui.core.elements.BsbElement$getFormFieldValueFlow$1", f = "BsbElement.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class BsbElement$getFormFieldValueFlow$1 extends l implements q<Boolean, String, d<? super List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ BsbElement this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsbElement$getFormFieldValueFlow$1(BsbElement bsbElement, d<? super BsbElement$getFormFieldValueFlow$1> dVar) {
        super(3, dVar);
        this.this$0 = bsbElement;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, d<? super List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>> dVar) {
        return invoke(bool.booleanValue(), str, (d<? super List<p<IdentifierSpec, FormFieldEntry>>>) dVar);
    }

    public final Object invoke(boolean z11, String str, d<? super List<p<IdentifierSpec, FormFieldEntry>>> dVar) {
        BsbElement$getFormFieldValueFlow$1 bsbElement$getFormFieldValueFlow$1 = new BsbElement$getFormFieldValueFlow$1(this.this$0, dVar);
        bsbElement$getFormFieldValueFlow$1.Z$0 = z11;
        bsbElement$getFormFieldValueFlow$1.L$0 = str;
        return bsbElement$getFormFieldValueFlow$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List d11;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            d11 = v.d(vz.v.a(this.this$0.getIdentifier(), new FormFieldEntry((String) this.L$0, this.Z$0)));
            return d11;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}