package com.stripe.android.view;

import android.app.Application;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.s0;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.R;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.q;

/* loaded from: classes6.dex */
public final class PaymentMethodsViewModel extends androidx.lifecycle.b {
    private final CardDisplayTextFactory cardDisplayTextFactory;
    private final Object customerSession;
    private final Set<String> productUsage;
    private final androidx.lifecycle.f0<Boolean> progressData;
    private final Resources resources;
    private String selectedPaymentMethodId;
    private final androidx.lifecycle.f0<String> snackbarData;
    private final boolean startedFromPaymentSession;

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b {
        private final Application application;
        private final Object customerSession;
        private final String initialPaymentMethodId;
        private final boolean startedFromPaymentSession;

        public Factory(Application application, Object obj, String str, boolean z11) {
            kotlin.jvm.internal.s.g(application, "application");
            this.application = application;
            this.customerSession = obj;
            this.initialPaymentMethodId = str;
            this.startedFromPaymentSession = z11;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends androidx.lifecycle.p0> T create(Class<T> modelClass) {
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            return new PaymentMethodsViewModel(this.application, this.customerSession, this.initialPaymentMethodId, this.startedFromPaymentSession);
        }
    }

    public /* synthetic */ PaymentMethodsViewModel(Application application, Object obj, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, obj, (i11 & 4) != 0 ? null : str, z11);
    }

    private final String createSnackbarText(PaymentMethod paymentMethod, int i11) {
        PaymentMethod.Card card = paymentMethod.card;
        if (card == null) {
            return null;
        }
        return this.resources.getString(i11, this.cardDisplayTextFactory.createUnstyled$payments_core_release(card));
    }

    public final /* synthetic */ LiveData getPaymentMethods$payments_core_release() {
        final androidx.lifecycle.f0 f0Var = new androidx.lifecycle.f0();
        this.progressData.setValue(Boolean.TRUE);
        Object obj = this.customerSession;
        Throwable e11 = vz.q.e(obj);
        if (e11 == null) {
            CustomerSession.getPaymentMethods$payments_core_release$default((CustomerSession) obj, PaymentMethod.Type.Card, null, null, null, getProductUsage$payments_core_release(), new CustomerSession.PaymentMethodsRetrievalListener() { // from class: com.stripe.android.view.PaymentMethodsViewModel$getPaymentMethods$1$1
                @Override // com.stripe.android.CustomerSession.RetrievalListener
                public void onError(int i11, String errorMessage, StripeError stripeError) {
                    kotlin.jvm.internal.s.g(errorMessage, "errorMessage");
                    androidx.lifecycle.f0<vz.q<List<PaymentMethod>>> f0Var2 = f0Var;
                    q.a aVar = vz.q.f54772b;
                    f0Var2.setValue(vz.q.a(vz.q.b(vz.r.a(new APIException(stripeError, null, i11, errorMessage, null, 18, null)))));
                    this.getProgressData$payments_core_release().setValue(Boolean.FALSE);
                }

                @Override // com.stripe.android.CustomerSession.PaymentMethodsRetrievalListener
                public void onPaymentMethodsRetrieved(List<PaymentMethod> paymentMethods) {
                    kotlin.jvm.internal.s.g(paymentMethods, "paymentMethods");
                    androidx.lifecycle.f0<vz.q<List<PaymentMethod>>> f0Var2 = f0Var;
                    q.a aVar = vz.q.f54772b;
                    f0Var2.setValue(vz.q.a(vz.q.b(paymentMethods)));
                    this.getProgressData$payments_core_release().setValue(Boolean.FALSE);
                }
            }, 14, null);
        } else {
            q.a aVar = vz.q.f54772b;
            f0Var.setValue(vz.q.a(vz.q.b(vz.r.a(e11))));
            getProgressData$payments_core_release().setValue(Boolean.FALSE);
        }
        return f0Var;
    }

    public final Set<String> getProductUsage$payments_core_release() {
        return this.productUsage;
    }

    public final androidx.lifecycle.f0<Boolean> getProgressData$payments_core_release() {
        return this.progressData;
    }

    public final String getSelectedPaymentMethodId$payments_core_release() {
        return this.selectedPaymentMethodId;
    }

    public final androidx.lifecycle.f0<String> getSnackbarData$payments_core_release() {
        return this.snackbarData;
    }

    public final void onPaymentMethodAdded$payments_core_release(PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        String createSnackbarText = createSnackbarText(paymentMethod, R.string.added);
        if (createSnackbarText == null) {
            return;
        }
        getSnackbarData$payments_core_release().setValue(createSnackbarText);
        getSnackbarData$payments_core_release().setValue(null);
    }

    public final void onPaymentMethodRemoved$payments_core_release(PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        String createSnackbarText = createSnackbarText(paymentMethod, R.string.removed);
        if (createSnackbarText == null) {
            return;
        }
        getSnackbarData$payments_core_release().setValue(createSnackbarText);
        getSnackbarData$payments_core_release().setValue(null);
    }

    public final void setSelectedPaymentMethodId$payments_core_release(String str) {
        this.selectedPaymentMethodId = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsViewModel(Application application, Object obj, String str, boolean z11) {
        super(application);
        List n11;
        Set<String> S0;
        kotlin.jvm.internal.s.g(application, "application");
        this.customerSession = obj;
        this.selectedPaymentMethodId = str;
        this.startedFromPaymentSession = z11;
        this.resources = application.getResources();
        this.cardDisplayTextFactory = new CardDisplayTextFactory(application);
        String[] strArr = new String[2];
        strArr[0] = z11 ? PaymentSession.PRODUCT_TOKEN : null;
        strArr[1] = PaymentMethodsActivity.PRODUCT_TOKEN;
        n11 = wz.w.n(strArr);
        S0 = wz.e0.S0(n11);
        this.productUsage = S0;
        this.snackbarData = new androidx.lifecycle.f0<>();
        this.progressData = new androidx.lifecycle.f0<>();
    }
}