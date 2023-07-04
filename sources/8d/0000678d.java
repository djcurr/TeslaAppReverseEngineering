package e7;

import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentMethod f24951a;

    public h(PaymentMethod paymentMethod) {
        s.g(paymentMethod, "paymentMethod");
        this.f24951a = paymentMethod;
    }

    @Override // e7.k
    public String a() {
        String type = this.f24951a.getType();
        return type == null ? "unknown" : type;
    }
}