package com.stripe.android.view;

import com.stripe.android.CustomerSession;
import vz.q;

/* loaded from: classes6.dex */
final class PaymentMethodsActivity$customerSession$2 extends kotlin.jvm.internal.u implements h00.a<vz.q<? extends CustomerSession>> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$customerSession$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ vz.q<? extends CustomerSession> invoke() {
        return vz.q.a(m539invoked1pmJ48());
    }

    /* renamed from: invoke-d1pmJ48  reason: not valid java name */
    public final Object m539invoked1pmJ48() {
        try {
            q.a aVar = vz.q.f54772b;
            return vz.q.b(CustomerSession.Companion.getInstance());
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            return vz.q.b(vz.r.a(th2));
        }
    }
}