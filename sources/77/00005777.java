package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.List;
import zz.d;

/* loaded from: classes6.dex */
public interface CustomerRepository {
    Object detachPaymentMethod(PaymentSheet.CustomerConfiguration customerConfiguration, String str, d<? super PaymentMethod> dVar);

    Object getPaymentMethods(PaymentSheet.CustomerConfiguration customerConfiguration, List<? extends PaymentMethod.Type> list, d<? super List<PaymentMethod>> dVar);
}