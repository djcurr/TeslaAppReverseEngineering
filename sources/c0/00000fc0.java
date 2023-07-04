package c7;

import com.adyen.checkout.components.model.payments.request.PaymentComponentData;
import com.adyen.checkout.components.model.payments.request.PaymentMethodDetails;

/* loaded from: classes.dex */
public abstract class h<PaymentMethodDetailsT extends PaymentMethodDetails> {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentComponentData<PaymentMethodDetailsT> f8917a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8918b;

    public h(PaymentComponentData<PaymentMethodDetailsT> paymentComponentData, boolean z11, boolean z12) {
        this.f8917a = paymentComponentData;
        this.f8918b = z11;
    }

    public PaymentComponentData<PaymentMethodDetailsT> a() {
        return this.f8917a;
    }

    public boolean b() {
        return this.f8918b;
    }
}