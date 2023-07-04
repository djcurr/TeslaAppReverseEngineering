package com.stripe.android;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSessionPrefs;
import com.stripe.android.PaymentSessionViewModel;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import h00.l;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.w0;

/* loaded from: classes2.dex */
public final class PaymentSessionViewModel extends androidx.lifecycle.b {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_PAYMENT_SESSION_DATA = "key_payment_session_data";
    private static final int MAX_PAYMENT_METHODS_LIMIT = 100;
    private final f0<NetworkState> _networkState;
    private final f0<PaymentSessionData> _paymentSessionDataLiveData;
    private final CustomerSession customerSession;
    private final LiveData<NetworkState> networkState;
    private PaymentSessionData paymentSessionData;
    private final LiveData<PaymentSessionData> paymentSessionDataLiveData;
    private final PaymentSessionPrefs paymentSessionPrefs;
    private final l0 savedStateHandle;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Factory extends androidx.lifecycle.a {
        private final Application application;
        private final CustomerSession customerSession;
        private final PaymentSessionData paymentSessionData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Factory(Application application, androidx.savedstate.c owner, PaymentSessionData paymentSessionData, CustomerSession customerSession) {
            super(owner, null);
            s.g(application, "application");
            s.g(owner, "owner");
            s.g(paymentSessionData, "paymentSessionData");
            s.g(customerSession, "customerSession");
            this.application = application;
            this.paymentSessionData = paymentSessionData;
            this.customerSession = customerSession;
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 handle) {
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(handle, "handle");
            return new PaymentSessionViewModel(this.application, handle, this.paymentSessionData, this.customerSession, null, 16, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class FetchCustomerResult {
        public static final int $stable = 0;

        /* loaded from: classes2.dex */
        public static final class Error extends FetchCustomerResult {
            public static final int $stable = 8;
            private final int errorCode;
            private final String errorMessage;
            private final StripeError stripeError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(int i11, String errorMessage, StripeError stripeError) {
                super(null);
                s.g(errorMessage, "errorMessage");
                this.errorCode = i11;
                this.errorMessage = errorMessage;
                this.stripeError = stripeError;
            }

            public static /* synthetic */ Error copy$default(Error error, int i11, String str, StripeError stripeError, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = error.errorCode;
                }
                if ((i12 & 2) != 0) {
                    str = error.errorMessage;
                }
                if ((i12 & 4) != 0) {
                    stripeError = error.stripeError;
                }
                return error.copy(i11, str, stripeError);
            }

            public final int component1() {
                return this.errorCode;
            }

            public final String component2() {
                return this.errorMessage;
            }

            public final StripeError component3() {
                return this.stripeError;
            }

            public final Error copy(int i11, String errorMessage, StripeError stripeError) {
                s.g(errorMessage, "errorMessage");
                return new Error(i11, errorMessage, stripeError);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    return this.errorCode == error.errorCode && s.c(this.errorMessage, error.errorMessage) && s.c(this.stripeError, error.stripeError);
                }
                return false;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final StripeError getStripeError() {
                return this.stripeError;
            }

            public int hashCode() {
                int hashCode = ((Integer.hashCode(this.errorCode) * 31) + this.errorMessage.hashCode()) * 31;
                StripeError stripeError = this.stripeError;
                return hashCode + (stripeError == null ? 0 : stripeError.hashCode());
            }

            public String toString() {
                return "Error(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", stripeError=" + this.stripeError + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Success extends FetchCustomerResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        private FetchCustomerResult() {
        }

        public /* synthetic */ FetchCustomerResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public enum NetworkState {
        Active,
        Inactive
    }

    public /* synthetic */ PaymentSessionViewModel(Application application, l0 l0Var, PaymentSessionData paymentSessionData, CustomerSession customerSession, PaymentSessionPrefs paymentSessionPrefs, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, l0Var, paymentSessionData, customerSession, (i11 & 16) != 0 ? new PaymentSessionPrefs.Default(application) : paymentSessionPrefs);
    }

    public static /* synthetic */ LiveData fetchCustomer$default(PaymentSessionViewModel paymentSessionViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return paymentSessionViewModel.fetchCustomer(z11);
    }

    private final void fetchCustomerPaymentMethod(final String str, final l<? super PaymentMethod, b0> lVar) {
        if (str != null) {
            CustomerSession.getPaymentMethods$default(this.customerSession, PaymentMethod.Type.Card, 100, null, null, new CustomerSession.PaymentMethodsRetrievalListener() { // from class: com.stripe.android.PaymentSessionViewModel$fetchCustomerPaymentMethod$1
                @Override // com.stripe.android.CustomerSession.RetrievalListener
                public void onError(int i11, String errorMessage, StripeError stripeError) {
                    s.g(errorMessage, "errorMessage");
                    lVar.invoke(null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.stripe.android.CustomerSession.PaymentMethodsRetrievalListener
                public void onPaymentMethodsRetrieved(List<PaymentMethod> paymentMethods) {
                    Object obj;
                    s.g(paymentMethods, "paymentMethods");
                    l<PaymentMethod, b0> lVar2 = lVar;
                    String str2 = str;
                    Iterator<T> it2 = paymentMethods.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (s.c(((PaymentMethod) obj).f20932id, str2)) {
                            break;
                        }
                    }
                    lVar2.invoke(obj);
                }
            }, 12, null);
        } else {
            lVar.invoke(null);
        }
    }

    public static /* synthetic */ String getSelectedPaymentMethodId$default(PaymentSessionViewModel paymentSessionViewModel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return paymentSessionViewModel.getSelectedPaymentMethodId(str);
    }

    public static /* synthetic */ void onCustomerRetrieved$payments_core_release$default(PaymentSessionViewModel paymentSessionViewModel, String str, boolean z11, h00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        paymentSessionViewModel.onCustomerRetrieved$payments_core_release(str, z11, aVar);
    }

    private final void persistPaymentMethodResult(PaymentMethod paymentMethod, boolean z11) {
        PaymentSessionData copy;
        String id2;
        Customer cachedCustomer = this.customerSession.getCachedCustomer();
        if (cachedCustomer != null && (id2 = cachedCustomer.getId()) != null) {
            this.paymentSessionPrefs.savePaymentMethodId(id2, paymentMethod == null ? null : paymentMethod.f20932id);
        }
        copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : null, (r22 & 32) != 0 ? r1.shippingMethod : null, (r22 & 64) != 0 ? r1.paymentMethod : paymentMethod, (r22 & 128) != 0 ? this.paymentSessionData.useGooglePay : z11);
        setPaymentSessionData(copy);
    }

    public final void clearPaymentMethod() {
        PaymentSessionData copy;
        copy = r0.copy((r22 & 1) != 0 ? r0.isShippingInfoRequired : false, (r22 & 2) != 0 ? r0.isShippingMethodRequired : false, (r22 & 4) != 0 ? r0.cartTotal : 0L, (r22 & 8) != 0 ? r0.shippingTotal : 0L, (r22 & 16) != 0 ? r0.shippingInformation : null, (r22 & 32) != 0 ? r0.shippingMethod : null, (r22 & 64) != 0 ? r0.paymentMethod : null, (r22 & 128) != 0 ? this.paymentSessionData.useGooglePay : false);
        setPaymentSessionData(copy);
    }

    public final /* synthetic */ LiveData fetchCustomer(final boolean z11) {
        Set c11;
        this._networkState.setValue(NetworkState.Active);
        final f0 f0Var = new f0();
        CustomerSession customerSession = this.customerSession;
        c11 = w0.c(PaymentSession.PRODUCT_TOKEN);
        customerSession.retrieveCurrentCustomer$payments_core_release(c11, new CustomerSession.CustomerRetrievalListener() { // from class: com.stripe.android.PaymentSessionViewModel$fetchCustomer$1
            @Override // com.stripe.android.CustomerSession.CustomerRetrievalListener
            public void onCustomerRetrieved(Customer customer) {
                s.g(customer, "customer");
                PaymentSessionViewModel.this.onCustomerRetrieved$payments_core_release(customer.getId(), z11, new PaymentSessionViewModel$fetchCustomer$1$onCustomerRetrieved$1(PaymentSessionViewModel.this, f0Var));
            }

            @Override // com.stripe.android.CustomerSession.RetrievalListener
            public void onError(int i11, String errorMessage, StripeError stripeError) {
                f0 f0Var2;
                s.g(errorMessage, "errorMessage");
                f0Var2 = PaymentSessionViewModel.this._networkState;
                f0Var2.setValue(PaymentSessionViewModel.NetworkState.Inactive);
                f0Var.setValue(new PaymentSessionViewModel.FetchCustomerResult.Error(i11, errorMessage, stripeError));
            }
        });
        return f0Var;
    }

    public final LiveData<NetworkState> getNetworkState$payments_core_release() {
        return this.networkState;
    }

    public final PaymentSessionData getPaymentSessionData() {
        return this.paymentSessionData;
    }

    public final LiveData<PaymentSessionData> getPaymentSessionDataLiveData() {
        return this.paymentSessionDataLiveData;
    }

    public final /* synthetic */ String getSelectedPaymentMethodId(String str) {
        String id2;
        if (!this.paymentSessionData.getUseGooglePay()) {
            if (str != null) {
                return str;
            }
            if (this.paymentSessionData.getPaymentMethod() != null) {
                PaymentMethod paymentMethod = this.paymentSessionData.getPaymentMethod();
                if (paymentMethod != null) {
                    return paymentMethod.f20932id;
                }
            } else {
                Customer cachedCustomer = this.customerSession.getCachedCustomer();
                if (cachedCustomer != null && (id2 = cachedCustomer.getId()) != null) {
                    return this.paymentSessionPrefs.getPaymentMethodId(id2);
                }
            }
        }
        return null;
    }

    public final /* synthetic */ void onCompleted() {
    }

    public final /* synthetic */ void onCustomerRetrieved$payments_core_release(String str, boolean z11, h00.a onComplete) {
        s.g(onComplete, "onComplete");
        if (z11) {
            fetchCustomerPaymentMethod(this.paymentSessionPrefs.getPaymentMethodId(str), new PaymentSessionViewModel$onCustomerRetrieved$1(onComplete, this));
        } else {
            onComplete.invoke();
        }
    }

    public final /* synthetic */ void onListenerAttached() {
        this._paymentSessionDataLiveData.setValue(this.paymentSessionData);
    }

    public final /* synthetic */ void onPaymentFlowResult(PaymentSessionData paymentSessionData) {
        s.g(paymentSessionData, "paymentSessionData");
        setPaymentSessionData(paymentSessionData);
    }

    public final /* synthetic */ void onPaymentMethodResult(PaymentMethodsActivityStarter.Result result) {
        persistPaymentMethodResult(result == null ? null : result.paymentMethod, result == null ? false : result.getUseGooglePay());
    }

    public final void setPaymentSessionData(PaymentSessionData value) {
        s.g(value, "value");
        if (s.c(value, this.paymentSessionData)) {
            return;
        }
        this.paymentSessionData = value;
        this.savedStateHandle.h(KEY_PAYMENT_SESSION_DATA, value);
        this._paymentSessionDataLiveData.setValue(value);
    }

    public final /* synthetic */ void updateCartTotal(long j11) {
        PaymentSessionData copy;
        copy = r0.copy((r22 & 1) != 0 ? r0.isShippingInfoRequired : false, (r22 & 2) != 0 ? r0.isShippingMethodRequired : false, (r22 & 4) != 0 ? r0.cartTotal : j11, (r22 & 8) != 0 ? r0.shippingTotal : 0L, (r22 & 16) != 0 ? r0.shippingInformation : null, (r22 & 32) != 0 ? r0.shippingMethod : null, (r22 & 64) != 0 ? r0.paymentMethod : null, (r22 & 128) != 0 ? this.paymentSessionData.useGooglePay : false);
        setPaymentSessionData(copy);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSessionViewModel(Application application, l0 savedStateHandle, PaymentSessionData paymentSessionData, CustomerSession customerSession, PaymentSessionPrefs paymentSessionPrefs) {
        super(application);
        s.g(application, "application");
        s.g(savedStateHandle, "savedStateHandle");
        s.g(paymentSessionData, "paymentSessionData");
        s.g(customerSession, "customerSession");
        s.g(paymentSessionPrefs, "paymentSessionPrefs");
        this.savedStateHandle = savedStateHandle;
        this.customerSession = customerSession;
        this.paymentSessionPrefs = paymentSessionPrefs;
        this.paymentSessionData = paymentSessionData;
        f0<PaymentSessionData> f0Var = new f0<>();
        this._paymentSessionDataLiveData = f0Var;
        this.paymentSessionDataLiveData = f0Var;
        PaymentSessionData paymentSessionData2 = (PaymentSessionData) savedStateHandle.c(KEY_PAYMENT_SESSION_DATA);
        if (paymentSessionData2 != null) {
            setPaymentSessionData(paymentSessionData2);
        }
        f0<NetworkState> f0Var2 = new f0<>();
        this._networkState = f0Var2;
        this.networkState = f0Var2;
    }
}