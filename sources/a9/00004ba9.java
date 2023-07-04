package com.stripe.android;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v;
import com.stripe.android.PaymentSessionViewModel;
import com.stripe.android.view.ActivityStarter;
import com.stripe.android.view.PaymentFlowActivity;
import com.stripe.android.view.PaymentFlowActivityStarter;
import com.stripe.android.view.PaymentMethodsActivity;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.x0;

/* loaded from: classes2.dex */
public final class PaymentSession {
    public static final String EXTRA_PAYMENT_SESSION_DATA = "extra_payment_session_data";
    public static final String PRODUCT_TOKEN = "PaymentSession";
    private static final Set<Integer> VALID_REQUEST_CODES;
    private final PaymentSessionConfig config;
    private final Context context;
    private final PaymentSession$lifecycleObserver$1 lifecycleObserver;
    private final v lifecycleOwner;
    private /* synthetic */ PaymentSessionListener listener;
    private final ActivityStarter<PaymentFlowActivity, PaymentFlowActivityStarter.Args> paymentFlowActivityStarter;
    private final ActivityStarter<PaymentMethodsActivity, PaymentMethodsActivityStarter.Args> paymentMethodsActivityStarter;
    private final PaymentSessionViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isValidRequestCode(int i11) {
            return PaymentSession.VALID_REQUEST_CODES.contains(Integer.valueOf(i11));
        }
    }

    /* loaded from: classes2.dex */
    public interface PaymentSessionListener {
        void onCommunicatingStateChanged(boolean z11);

        void onError(int i11, String str);

        void onPaymentSessionDataChanged(PaymentSessionData paymentSessionData);
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSessionViewModel.NetworkState.values().length];
            iArr[PaymentSessionViewModel.NetworkState.Active.ordinal()] = 1;
            iArr[PaymentSessionViewModel.NetworkState.Inactive.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Set<Integer> i11;
        i11 = x0.i(6000, Integer.valueOf((int) PaymentFlowActivityStarter.REQUEST_CODE));
        VALID_REQUEST_CODES = i11;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.stripe.android.PaymentSession$lifecycleObserver$1, androidx.lifecycle.u] */
    public PaymentSession(Context context, Application application, u0 viewModelStoreOwner, v lifecycleOwner, androidx.savedstate.c savedStateRegistryOwner, PaymentSessionConfig config, CustomerSession customerSession, ActivityStarter<PaymentMethodsActivity, PaymentMethodsActivityStarter.Args> paymentMethodsActivityStarter, ActivityStarter<PaymentFlowActivity, PaymentFlowActivityStarter.Args> paymentFlowActivityStarter, PaymentSessionData paymentSessionData) {
        s.g(context, "context");
        s.g(application, "application");
        s.g(viewModelStoreOwner, "viewModelStoreOwner");
        s.g(lifecycleOwner, "lifecycleOwner");
        s.g(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.g(config, "config");
        s.g(customerSession, "customerSession");
        s.g(paymentMethodsActivityStarter, "paymentMethodsActivityStarter");
        s.g(paymentFlowActivityStarter, "paymentFlowActivityStarter");
        s.g(paymentSessionData, "paymentSessionData");
        this.context = context;
        this.lifecycleOwner = lifecycleOwner;
        this.config = config;
        this.paymentMethodsActivityStarter = paymentMethodsActivityStarter;
        this.paymentFlowActivityStarter = paymentFlowActivityStarter;
        PaymentSessionViewModel paymentSessionViewModel = (PaymentSessionViewModel) new s0(viewModelStoreOwner, new PaymentSessionViewModel.Factory(application, savedStateRegistryOwner, paymentSessionData, customerSession)).a(PaymentSessionViewModel.class);
        this.viewModel = paymentSessionViewModel;
        ?? r32 = new u() { // from class: com.stripe.android.PaymentSession$lifecycleObserver$1
            {
                PaymentSession.this = this;
            }

            @h0(p.b.ON_DESTROY)
            public final void onDestroy() {
                PaymentSession.this.setListener$payments_core_release(null);
            }
        };
        this.lifecycleObserver = r32;
        lifecycleOwner.getLifecycle().a(r32);
        paymentSessionViewModel.getNetworkState$payments_core_release().observe(lifecycleOwner, new g0() { // from class: com.stripe.android.c
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentSession.c(PaymentSession.this, (PaymentSessionViewModel.NetworkState) obj);
            }
        });
        paymentSessionViewModel.getPaymentSessionDataLiveData().observe(lifecycleOwner, new g0() { // from class: com.stripe.android.a
            {
                PaymentSession.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentSession.a(PaymentSession.this, (PaymentSessionData) obj);
            }
        });
    }

    /* renamed from: _init_$lambda-1 */
    public static final void m124_init_$lambda1(PaymentSession this$0, PaymentSessionViewModel.NetworkState networkState) {
        PaymentSessionListener listener$payments_core_release;
        s.g(this$0, "this$0");
        if (networkState == null || (listener$payments_core_release = this$0.getListener$payments_core_release()) == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[networkState.ordinal()];
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z11 = false;
        }
        listener$payments_core_release.onCommunicatingStateChanged(z11);
    }

    /* renamed from: _init_$lambda-2 */
    public static final void m125_init_$lambda2(PaymentSession this$0, PaymentSessionData it2) {
        s.g(this$0, "this$0");
        PaymentSessionListener paymentSessionListener = this$0.listener;
        if (paymentSessionListener == null) {
            return;
        }
        s.f(it2, "it");
        paymentSessionListener.onPaymentSessionDataChanged(it2);
    }

    public static /* synthetic */ void a(PaymentSession paymentSession, PaymentSessionData paymentSessionData) {
        m125_init_$lambda2(paymentSession, paymentSessionData);
    }

    public static /* synthetic */ void b(PaymentSession paymentSession, PaymentSessionViewModel.FetchCustomerResult fetchCustomerResult) {
        m126fetchCustomer$lambda4(paymentSession, fetchCustomerResult);
    }

    public static /* synthetic */ void c(PaymentSession paymentSession, PaymentSessionViewModel.NetworkState networkState) {
        m124_init_$lambda1(paymentSession, networkState);
    }

    private final void fetchCustomer(boolean z11) {
        this.viewModel.fetchCustomer(z11).observe(this.lifecycleOwner, new g0() { // from class: com.stripe.android.b
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentSession.b(PaymentSession.this, (PaymentSessionViewModel.FetchCustomerResult) obj);
            }
        });
    }

    static /* synthetic */ void fetchCustomer$default(PaymentSession paymentSession, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        paymentSession.fetchCustomer(z11);
    }

    /* renamed from: fetchCustomer$lambda-4 */
    public static final void m126fetchCustomer$lambda4(PaymentSession this$0, PaymentSessionViewModel.FetchCustomerResult fetchCustomerResult) {
        PaymentSessionListener paymentSessionListener;
        s.g(this$0, "this$0");
        if (!(fetchCustomerResult instanceof PaymentSessionViewModel.FetchCustomerResult.Error) || (paymentSessionListener = this$0.listener) == null) {
            return;
        }
        PaymentSessionViewModel.FetchCustomerResult.Error error = (PaymentSessionViewModel.FetchCustomerResult.Error) fetchCustomerResult;
        paymentSessionListener.onError(error.getErrorCode(), error.getErrorMessage());
    }

    private final void onPaymentMethodResult(Intent intent) {
        this.viewModel.onPaymentMethodResult(PaymentMethodsActivityStarter.Result.Companion.fromIntent(intent));
    }

    public static /* synthetic */ void presentPaymentMethodSelection$default(PaymentSession paymentSession, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        paymentSession.presentPaymentMethodSelection(str);
    }

    public final void clearPaymentMethod() {
        this.viewModel.clearPaymentMethod();
    }

    public final PaymentSessionListener getListener$payments_core_release() {
        return this.listener;
    }

    public final PaymentSessionViewModel getViewModel$payments_core_release() {
        return this.viewModel;
    }

    public final boolean handlePaymentData(int i11, int i12, Intent intent) {
        if (intent != null && Companion.isValidRequestCode(i11)) {
            if (i12 != -1) {
                if (i12 != 0) {
                    return false;
                }
                if (i11 == 6000) {
                    onPaymentMethodResult(intent);
                } else {
                    fetchCustomer$default(this, false, 1, null);
                }
                return false;
            }
            if (i11 == 6000) {
                onPaymentMethodResult(intent);
            } else if (i11 != 6002) {
                return false;
            } else {
                PaymentSessionData paymentSessionData = (PaymentSessionData) intent.getParcelableExtra(EXTRA_PAYMENT_SESSION_DATA);
                if (paymentSessionData != null) {
                    getViewModel$payments_core_release().onPaymentFlowResult(paymentSessionData);
                }
            }
            return true;
        }
        return false;
    }

    public final void init(PaymentSessionListener listener) {
        s.g(listener, "listener");
        this.listener = listener;
        this.viewModel.onListenerAttached();
        if (this.config.getShouldPrefetchCustomer$payments_core_release()) {
            fetchCustomer(true);
        }
    }

    public final void onCompleted() {
        this.viewModel.onCompleted();
    }

    public final void presentPaymentMethodSelection(String str) {
        this.paymentMethodsActivityStarter.startForResult(new PaymentMethodsActivityStarter.Args.Builder().setInitialPaymentMethodId(this.viewModel.getSelectedPaymentMethodId(str)).setPaymentMethodsFooter(this.config.getPaymentMethodsFooterLayoutId()).setAddPaymentMethodFooter(this.config.getAddPaymentMethodFooterLayoutId()).setIsPaymentSessionActive(true).setPaymentConfiguration(PaymentConfiguration.Companion.getInstance(this.context)).setPaymentMethodTypes(this.config.getPaymentMethodTypes()).setShouldShowGooglePay(this.config.getShouldShowGooglePay()).setWindowFlags(this.config.getWindowFlags$payments_core_release()).setBillingAddressFields(this.config.getBillingAddressFields()).setUseGooglePay$payments_core_release(this.viewModel.getPaymentSessionData().getUseGooglePay()).setCanDeletePaymentMethods(this.config.getCanDeletePaymentMethods()).build());
    }

    public final void presentShippingFlow() {
        this.paymentFlowActivityStarter.startForResult(new PaymentFlowActivityStarter.Args(this.config, this.viewModel.getPaymentSessionData(), true, this.config.getWindowFlags$payments_core_release()));
    }

    public final void setCartTotal(long j11) {
        this.viewModel.updateCartTotal(j11);
    }

    public final void setListener$payments_core_release(PaymentSessionListener paymentSessionListener) {
        this.listener = paymentSessionListener;
    }

    public /* synthetic */ PaymentSession(Context context, Application application, u0 u0Var, v vVar, androidx.savedstate.c cVar, PaymentSessionConfig paymentSessionConfig, CustomerSession customerSession, ActivityStarter activityStarter, ActivityStarter activityStarter2, PaymentSessionData paymentSessionData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, application, u0Var, vVar, cVar, paymentSessionConfig, customerSession, activityStarter, activityStarter2, (i11 & 512) != 0 ? new PaymentSessionData(paymentSessionConfig) : paymentSessionData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentSession(androidx.activity.ComponentActivity r14, com.stripe.android.PaymentSessionConfig r15) {
        /*
            r13 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.s.g(r14, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.s.g(r15, r0)
            android.content.Context r1 = r14.getApplicationContext()
            java.lang.String r0 = "activity.applicationContext"
            kotlin.jvm.internal.s.f(r1, r0)
            android.app.Application r2 = r14.getApplication()
            java.lang.String r0 = "activity.application"
            kotlin.jvm.internal.s.f(r2, r0)
            com.stripe.android.CustomerSession$Companion r0 = com.stripe.android.CustomerSession.Companion
            com.stripe.android.CustomerSession r7 = r0.getInstance()
            com.stripe.android.view.PaymentMethodsActivityStarter r8 = new com.stripe.android.view.PaymentMethodsActivityStarter
            r8.<init>(r14)
            com.stripe.android.view.PaymentFlowActivityStarter r9 = new com.stripe.android.view.PaymentFlowActivityStarter
            r9.<init>(r14, r15)
            r10 = 0
            r11 = 512(0x200, float:7.175E-43)
            r12 = 0
            r0 = r13
            r3 = r14
            r4 = r14
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.PaymentSession.<init>(androidx.activity.ComponentActivity, com.stripe.android.PaymentSessionConfig):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentSession(androidx.fragment.app.Fragment r14, com.stripe.android.PaymentSessionConfig r15) {
        /*
            r13 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r14, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.s.g(r15, r0)
            androidx.fragment.app.h r0 = r14.requireActivity()
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r0 = "fragment.requireActivity().applicationContext"
            kotlin.jvm.internal.s.f(r1, r0)
            androidx.fragment.app.h r0 = r14.requireActivity()
            android.app.Application r2 = r0.getApplication()
            java.lang.String r0 = "fragment.requireActivity().application"
            kotlin.jvm.internal.s.f(r2, r0)
            com.stripe.android.CustomerSession$Companion r0 = com.stripe.android.CustomerSession.Companion
            com.stripe.android.CustomerSession r7 = r0.getInstance()
            com.stripe.android.view.PaymentMethodsActivityStarter r8 = new com.stripe.android.view.PaymentMethodsActivityStarter
            r8.<init>(r14)
            com.stripe.android.view.PaymentFlowActivityStarter r9 = new com.stripe.android.view.PaymentFlowActivityStarter
            r9.<init>(r14, r15)
            r10 = 0
            r11 = 512(0x200, float:7.175E-43)
            r12 = 0
            r0 = r13
            r3 = r14
            r4 = r14
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.PaymentSession.<init>(androidx.fragment.app.Fragment, com.stripe.android.PaymentSessionConfig):void");
    }
}