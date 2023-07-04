package com.stripe.android.view;

import com.stripe.android.CustomerSession;

/* loaded from: classes6.dex */
final class PaymentFlowActivity$customerSession$2 extends kotlin.jvm.internal.u implements h00.a<CustomerSession> {
    public static final PaymentFlowActivity$customerSession$2 INSTANCE = new PaymentFlowActivity$customerSession$2();

    PaymentFlowActivity$customerSession$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final CustomerSession invoke() {
        return CustomerSession.Companion.getInstance();
    }
}