package com.stripe.android.paymentsheet;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FakeCustomerRepository implements CustomerRepository {
    private Throwable error;
    private final List<PaymentMethod> paymentMethods;
    public PaymentMethod savedPaymentMethod;

    public FakeCustomerRepository() {
        this(null, 1, null);
    }

    public FakeCustomerRepository(List<PaymentMethod> paymentMethods) {
        kotlin.jvm.internal.s.g(paymentMethods, "paymentMethods");
        this.paymentMethods = paymentMethods;
    }

    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    public Object detachPaymentMethod(PaymentSheet.CustomerConfiguration customerConfiguration, String str, zz.d<? super PaymentMethod> dVar) {
        return null;
    }

    public final Throwable getError() {
        return this.error;
    }

    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    public Object getPaymentMethods(PaymentSheet.CustomerConfiguration customerConfiguration, List<? extends PaymentMethod.Type> list, zz.d<? super List<PaymentMethod>> dVar) {
        return this.paymentMethods;
    }

    public final PaymentMethod getSavedPaymentMethod() {
        PaymentMethod paymentMethod = this.savedPaymentMethod;
        if (paymentMethod != null) {
            return paymentMethod;
        }
        kotlin.jvm.internal.s.x("savedPaymentMethod");
        return null;
    }

    public final void setError(Throwable th2) {
        this.error = th2;
    }

    public final void setSavedPaymentMethod(PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "<set-?>");
        this.savedPaymentMethod = paymentMethod;
    }

    public /* synthetic */ FakeCustomerRepository(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? wz.w.i() : list);
    }
}