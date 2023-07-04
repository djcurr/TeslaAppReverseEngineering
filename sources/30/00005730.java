package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment", f = "USBankAccountFormFragment.kt", l = {263}, m = "renderNameAndEmailCollectionScreen")
/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$renderNameAndEmailCollectionScreen$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$renderNameAndEmailCollectionScreen$1(USBankAccountFormFragment uSBankAccountFormFragment, zz.d<? super USBankAccountFormFragment$renderNameAndEmailCollectionScreen$1> dVar) {
        super(dVar);
        this.this$0 = uSBankAccountFormFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object renderNameAndEmailCollectionScreen;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        renderNameAndEmailCollectionScreen = this.this$0.renderNameAndEmailCollectionScreen(null, null, null, this);
        return renderNameAndEmailCollectionScreen;
    }
}