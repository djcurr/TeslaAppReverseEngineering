package com.stripe.android.paymentsheet.forms;

import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.SaveForFutureUseElement;
import h00.r;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import vz.b0;
import wz.e0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$hiddenIdentifiers$2", f = "FormViewModel.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FormViewModel$hiddenIdentifiers$2 extends l implements r<Boolean, List<? extends IdentifierSpec>, List<? extends IdentifierSpec>, d<? super List<? extends IdentifierSpec>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ FormViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormViewModel$hiddenIdentifiers$2(FormViewModel formViewModel, d<? super FormViewModel$hiddenIdentifiers$2> dVar) {
        super(4, dVar);
        this.this$0 = formViewModel;
    }

    @Override // h00.r
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, List<? extends IdentifierSpec> list, List<? extends IdentifierSpec> list2, d<? super List<? extends IdentifierSpec>> dVar) {
        return invoke(bool.booleanValue(), (List<IdentifierSpec>) list, (List<IdentifierSpec>) list2, (d<? super List<IdentifierSpec>>) dVar);
    }

    public final Object invoke(boolean z11, List<IdentifierSpec> list, List<IdentifierSpec> list2, d<? super List<IdentifierSpec>> dVar) {
        FormViewModel$hiddenIdentifiers$2 formViewModel$hiddenIdentifiers$2 = new FormViewModel$hiddenIdentifiers$2(this.this$0, dVar);
        formViewModel$hiddenIdentifiers$2.Z$0 = z11;
        formViewModel$hiddenIdentifiers$2.L$0 = list;
        formViewModel$hiddenIdentifiers$2.L$1 = list2;
        return formViewModel$hiddenIdentifiers$2.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        List y02;
        e eVar;
        boolean z11;
        List z02;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            vz.r.b(obj);
            boolean z12 = this.Z$0;
            y02 = e0.y0((List) this.L$1, (List) this.L$0);
            eVar = this.this$0.saveForFutureUseElement;
            this.L$0 = y02;
            this.Z$0 = z12;
            this.label = 1;
            Object t11 = g.t(eVar, this);
            if (t11 == d11) {
                return d11;
            }
            z11 = z12;
            obj = t11;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            z11 = this.Z$0;
            y02 = (List) this.L$0;
            vz.r.b(obj);
        }
        SaveForFutureUseElement saveForFutureUseElement = (SaveForFutureUseElement) obj;
        if (z11 || saveForFutureUseElement == null) {
            return y02;
        }
        z02 = e0.z0(y02, saveForFutureUseElement.getIdentifier());
        return z02;
    }
}