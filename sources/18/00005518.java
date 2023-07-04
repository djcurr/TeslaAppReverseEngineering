package com.stripe.android.paymentsheet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public /* synthetic */ class PaymentOptionsAdapter$onCreateViewHolder$1 extends kotlin.jvm.internal.a implements h00.p<Integer, Boolean, vz.b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentOptionsAdapter$onCreateViewHolder$1(Object obj) {
        super(2, obj, PaymentOptionsAdapter.class, "onItemSelected", "onItemSelected$paymentsheet_release(IZZ)V", 0);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ vz.b0 invoke(Integer num, Boolean bool) {
        invoke(num.intValue(), bool.booleanValue());
        return vz.b0.f54756a;
    }

    public final void invoke(int i11, boolean z11) {
        PaymentOptionsAdapter.onItemSelected$paymentsheet_release$default((PaymentOptionsAdapter) this.receiver, i11, z11, false, 4, null);
    }
}