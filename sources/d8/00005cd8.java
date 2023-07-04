package com.stripe.android.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.s0;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v20.e1;
import vz.q;
import wz.x0;

/* loaded from: classes6.dex */
public final class PaymentFlowViewModel extends androidx.lifecycle.p0 {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> PRODUCT_USAGE;
    private static final String SHIPPING_INFO_PRODUCT_TOKEN = "ShippingInfoScreen";
    private int currentPage;
    private final CustomerSession customerSession;
    private boolean isShippingInfoSubmitted;
    private PaymentSessionData paymentSessionData;
    private ShippingMethod selectedShippingMethod;
    private List<ShippingMethod> shippingMethods;
    private ShippingInformation submittedShippingInfo;
    private final zz.g workContext;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getPRODUCT_USAGE() {
            return PaymentFlowViewModel.PRODUCT_USAGE;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b {
        private final CustomerSession customerSession;
        private final PaymentSessionData paymentSessionData;

        public Factory(CustomerSession customerSession, PaymentSessionData paymentSessionData) {
            kotlin.jvm.internal.s.g(customerSession, "customerSession");
            kotlin.jvm.internal.s.g(paymentSessionData, "paymentSessionData");
            this.customerSession = customerSession;
            this.paymentSessionData = paymentSessionData;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends androidx.lifecycle.p0> T create(Class<T> modelClass) {
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            return new PaymentFlowViewModel(this.customerSession, this.paymentSessionData, e1.b());
        }
    }

    static {
        Set<String> i11;
        i11 = x0.i(PaymentSession.PRODUCT_TOKEN, PaymentFlowActivity.PRODUCT_TOKEN, SHIPPING_INFO_PRODUCT_TOKEN);
        PRODUCT_USAGE = i11;
    }

    public PaymentFlowViewModel(CustomerSession customerSession, PaymentSessionData paymentSessionData, zz.g workContext) {
        List<ShippingMethod> i11;
        kotlin.jvm.internal.s.g(customerSession, "customerSession");
        kotlin.jvm.internal.s.g(paymentSessionData, "paymentSessionData");
        kotlin.jvm.internal.s.g(workContext, "workContext");
        this.customerSession = customerSession;
        this.paymentSessionData = paymentSessionData;
        this.workContext = workContext;
        i11 = wz.w.i();
        this.shippingMethods = i11;
    }

    public final int getCurrentPage$payments_core_release() {
        return this.currentPage;
    }

    public final PaymentSessionData getPaymentSessionData$payments_core_release() {
        return this.paymentSessionData;
    }

    public final ShippingMethod getSelectedShippingMethod$payments_core_release() {
        return this.selectedShippingMethod;
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return this.shippingMethods;
    }

    public final ShippingInformation getSubmittedShippingInfo$payments_core_release() {
        return this.submittedShippingInfo;
    }

    public final boolean isShippingInfoSubmitted$payments_core_release() {
        return this.isShippingInfoSubmitted;
    }

    public final /* synthetic */ LiveData saveCustomerShippingInformation$payments_core_release(ShippingInformation shippingInformation) {
        kotlin.jvm.internal.s.g(shippingInformation, "shippingInformation");
        this.submittedShippingInfo = shippingInformation;
        final androidx.lifecycle.f0 f0Var = new androidx.lifecycle.f0();
        this.customerSession.setCustomerShippingInformation$payments_core_release(shippingInformation, PRODUCT_USAGE, new CustomerSession.CustomerRetrievalListener() { // from class: com.stripe.android.view.PaymentFlowViewModel$saveCustomerShippingInformation$1
            @Override // com.stripe.android.CustomerSession.CustomerRetrievalListener
            public void onCustomerRetrieved(Customer customer) {
                kotlin.jvm.internal.s.g(customer, "customer");
                PaymentFlowViewModel.this.setShippingInfoSubmitted$payments_core_release(true);
                androidx.lifecycle.f0<vz.q<Customer>> f0Var2 = f0Var;
                q.a aVar = vz.q.f54772b;
                f0Var2.setValue(vz.q.a(vz.q.b(customer)));
            }

            @Override // com.stripe.android.CustomerSession.RetrievalListener
            public void onError(int i11, String errorMessage, StripeError stripeError) {
                kotlin.jvm.internal.s.g(errorMessage, "errorMessage");
                PaymentFlowViewModel.this.setShippingInfoSubmitted$payments_core_release(false);
                androidx.lifecycle.f0<vz.q<Customer>> f0Var2 = f0Var;
                q.a aVar = vz.q.f54772b;
                f0Var2.setValue(vz.q.a(vz.q.b(vz.r.a(new RuntimeException(errorMessage)))));
            }
        });
        return f0Var;
    }

    public final void setCurrentPage$payments_core_release(int i11) {
        this.currentPage = i11;
    }

    public final void setPaymentSessionData$payments_core_release(PaymentSessionData paymentSessionData) {
        kotlin.jvm.internal.s.g(paymentSessionData, "<set-?>");
        this.paymentSessionData = paymentSessionData;
    }

    public final void setSelectedShippingMethod$payments_core_release(ShippingMethod shippingMethod) {
        this.selectedShippingMethod = shippingMethod;
    }

    public final void setShippingInfoSubmitted$payments_core_release(boolean z11) {
        this.isShippingInfoSubmitted = z11;
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> list) {
        kotlin.jvm.internal.s.g(list, "<set-?>");
        this.shippingMethods = list;
    }

    public final void setSubmittedShippingInfo$payments_core_release(ShippingInformation shippingInformation) {
        this.submittedShippingInfo = shippingInformation;
    }

    public final /* synthetic */ LiveData validateShippingInformation$payments_core_release(PaymentSessionConfig.ShippingInformationValidator shippingInfoValidator, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, ShippingInformation shippingInformation) {
        kotlin.jvm.internal.s.g(shippingInfoValidator, "shippingInfoValidator");
        kotlin.jvm.internal.s.g(shippingInformation, "shippingInformation");
        return androidx.lifecycle.g.b(null, 0L, new PaymentFlowViewModel$validateShippingInformation$1(this, shippingInfoValidator, shippingInformation, shippingMethodsFactory, null), 3, null);
    }
}