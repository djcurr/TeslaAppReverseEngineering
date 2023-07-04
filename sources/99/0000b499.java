package t6;

import com.adyen.checkout.components.model.payments.request.BacsDirectDebitPaymentMethod;
import com.adyen.checkout.components.model.payments.request.PaymentComponentData;

/* loaded from: classes.dex */
public final class b extends c7.h<BacsDirectDebitPaymentMethod> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PaymentComponentData<BacsDirectDebitPaymentMethod> paymentComponentData, boolean z11, boolean z12, com.adyen.checkout.bacs.a mode) {
        super(paymentComponentData, z11, z12);
        kotlin.jvm.internal.s.g(paymentComponentData, "paymentComponentData");
        kotlin.jvm.internal.s.g(mode, "mode");
    }
}