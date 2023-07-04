package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import h00.q;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$requiredFields$3", f = "USBankAccountFormViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class USBankAccountFormViewModel$requiredFields$3 extends l implements q<Boolean, Boolean, d<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public USBankAccountFormViewModel$requiredFields$3(d<? super USBankAccountFormViewModel$requiredFields$3> dVar) {
        super(3, dVar);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, d<? super Boolean> dVar) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), dVar);
    }

    public final Object invoke(boolean z11, boolean z12, d<? super Boolean> dVar) {
        USBankAccountFormViewModel$requiredFields$3 uSBankAccountFormViewModel$requiredFields$3 = new USBankAccountFormViewModel$requiredFields$3(dVar);
        uSBankAccountFormViewModel$requiredFields$3.Z$0 = z11;
        uSBankAccountFormViewModel$requiredFields$3.Z$1 = z12;
        return uSBankAccountFormViewModel$requiredFields$3.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            return b.a(this.Z$0 && this.Z$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}