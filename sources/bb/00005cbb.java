package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.r0;
import androidx.viewpager.widget.b;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.R;
import com.stripe.android.databinding.PaymentFlowActivityBinding;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.PaymentFlowActivityStarter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentFlowActivity extends StripeActivity {
    public static final String PRODUCT_TOKEN = "PaymentFlowActivity";
    private final vz.k args$delegate;
    private final vz.k customerSession$delegate;
    private final vz.k keyboardController$delegate;
    private final vz.k paymentFlowPagerAdapter$delegate;
    private final vz.k paymentSessionConfig$delegate;
    private final vz.k viewBinding$delegate;
    private final vz.k viewModel$delegate;
    private final vz.k viewPager$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PaymentFlowActivity() {
        vz.k a11;
        vz.k a12;
        vz.k a13;
        vz.k a14;
        vz.k a15;
        vz.k a16;
        vz.k a17;
        a11 = vz.m.a(new PaymentFlowActivity$viewBinding$2(this));
        this.viewBinding$delegate = a11;
        a12 = vz.m.a(new PaymentFlowActivity$viewPager$2(this));
        this.viewPager$delegate = a12;
        a13 = vz.m.a(PaymentFlowActivity$customerSession$2.INSTANCE);
        this.customerSession$delegate = a13;
        a14 = vz.m.a(new PaymentFlowActivity$args$2(this));
        this.args$delegate = a14;
        a15 = vz.m.a(new PaymentFlowActivity$paymentSessionConfig$2(this));
        this.paymentSessionConfig$delegate = a15;
        this.viewModel$delegate = new r0(kotlin.jvm.internal.m0.b(PaymentFlowViewModel.class), new PaymentFlowActivity$special$$inlined$viewModels$2(this), new PaymentFlowActivity$viewModel$2(this));
        a16 = vz.m.a(new PaymentFlowActivity$paymentFlowPagerAdapter$2(this));
        this.paymentFlowPagerAdapter$delegate = a16;
        a17 = vz.m.a(new PaymentFlowActivity$keyboardController$2(this));
        this.keyboardController$delegate = a17;
    }

    private final void finishWithData(PaymentSessionData paymentSessionData) {
        setResult(-1, new Intent().putExtra(PaymentSession.EXTRA_PAYMENT_SESSION_DATA, paymentSessionData));
        finish();
    }

    public final PaymentFlowActivityStarter.Args getArgs() {
        return (PaymentFlowActivityStarter.Args) this.args$delegate.getValue();
    }

    public final CustomerSession getCustomerSession() {
        return (CustomerSession) this.customerSession$delegate.getValue();
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController$delegate.getValue();
    }

    public final PaymentFlowPagerAdapter getPaymentFlowPagerAdapter() {
        return (PaymentFlowPagerAdapter) this.paymentFlowPagerAdapter$delegate.getValue();
    }

    public final PaymentSessionConfig getPaymentSessionConfig() {
        return (PaymentSessionConfig) this.paymentSessionConfig$delegate.getValue();
    }

    private final ShippingInformation getShippingInfo() {
        return ((ShippingInfoWidget) getViewPager().findViewById(R.id.shipping_info_widget)).getShippingInformation();
    }

    public final PaymentFlowActivityBinding getViewBinding() {
        return (PaymentFlowActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final PaymentFlowViewModel getViewModel() {
        return (PaymentFlowViewModel) this.viewModel$delegate.getValue();
    }

    private final PaymentFlowViewPager getViewPager() {
        return (PaymentFlowViewPager) this.viewPager$delegate.getValue();
    }

    public static /* synthetic */ void h(PaymentFlowActivity paymentFlowActivity, List list, vz.q qVar) {
        m531onShippingInfoValidated$lambda4$lambda3(paymentFlowActivity, list, qVar);
    }

    private final boolean hasNextPage() {
        return getViewPager().getCurrentItem() + 1 < getPaymentFlowPagerAdapter().getCount();
    }

    private final boolean hasPreviousPage() {
        return getViewPager().getCurrentItem() != 0;
    }

    public static /* synthetic */ void k(PaymentFlowActivity paymentFlowActivity, vz.q qVar) {
        m532validateShippingInformation$lambda7(paymentFlowActivity, qVar);
    }

    private final void onShippingInfoError(Throwable th2) {
        PaymentSessionData copy;
        String message = th2.getMessage();
        boolean z11 = false;
        setProgressBarVisible(false);
        if (!((message == null || message.length() == 0) ? true : true)) {
            showError(message);
        } else {
            String string = getString(R.string.invalid_shipping_information);
            kotlin.jvm.internal.s.f(string, "getString(R.string.invalid_shipping_information)");
            showError(string);
        }
        PaymentFlowViewModel viewModel = getViewModel();
        copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : null, (r22 & 32) != 0 ? r1.shippingMethod : null, (r22 & 64) != 0 ? r1.paymentMethod : null, (r22 & 128) != 0 ? getViewModel().getPaymentSessionData$payments_core_release().useGooglePay : false);
        viewModel.setPaymentSessionData$payments_core_release(copy);
    }

    public static /* synthetic */ void onShippingInfoSaved$payments_core_release$default(PaymentFlowActivity paymentFlowActivity, ShippingInformation shippingInformation, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = wz.w.i();
        }
        paymentFlowActivity.onShippingInfoSaved$payments_core_release(shippingInformation, list);
    }

    private final void onShippingInfoSubmitted() {
        PaymentSessionData copy;
        getKeyboardController().hide();
        ShippingInformation shippingInfo = getShippingInfo();
        if (shippingInfo == null) {
            return;
        }
        PaymentFlowViewModel viewModel = getViewModel();
        copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : shippingInfo, (r22 & 32) != 0 ? r1.shippingMethod : null, (r22 & 64) != 0 ? r1.paymentMethod : null, (r22 & 128) != 0 ? getViewModel().getPaymentSessionData$payments_core_release().useGooglePay : false);
        viewModel.setPaymentSessionData$payments_core_release(copy);
        setProgressBarVisible(true);
        validateShippingInformation(getPaymentSessionConfig().getShippingInformationValidator$payments_core_release(), getPaymentSessionConfig().getShippingMethodsFactory$payments_core_release(), shippingInfo);
    }

    private final void onShippingInfoValidated(final List<ShippingMethod> list) {
        ShippingInformation shippingInformation = getViewModel().getPaymentSessionData$payments_core_release().getShippingInformation();
        if (shippingInformation == null) {
            return;
        }
        getViewModel().saveCustomerShippingInformation$payments_core_release(shippingInformation).observe(this, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.b0
            {
                PaymentFlowActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentFlowActivity.h(PaymentFlowActivity.this, list, (vz.q) obj);
            }
        });
    }

    /* renamed from: onShippingInfoValidated$lambda-4$lambda-3 */
    public static final void m531onShippingInfoValidated$lambda4$lambda3(PaymentFlowActivity this$0, List shippingMethods, vz.q result) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(shippingMethods, "$shippingMethods");
        kotlin.jvm.internal.s.f(result, "result");
        Object j11 = result.j();
        Throwable e11 = vz.q.e(j11);
        if (e11 == null) {
            this$0.onShippingInfoSaved$payments_core_release(((Customer) j11).getShippingInformation(), shippingMethods);
            return;
        }
        String message = e11.getMessage();
        if (message == null) {
            message = "";
        }
        this$0.showError(message);
    }

    private final void onShippingMethodSave() {
        PaymentSessionData copy;
        copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : null, (r22 & 32) != 0 ? r1.shippingMethod : ((SelectShippingMethodWidget) getViewPager().findViewById(R.id.select_shipping_method_widget)).getSelectedShippingMethod(), (r22 & 64) != 0 ? r1.paymentMethod : null, (r22 & 128) != 0 ? getViewModel().getPaymentSessionData$payments_core_release().useGooglePay : false);
        finishWithData(copy);
    }

    private final void onShippingMethodsReady(List<ShippingMethod> list) {
        setProgressBarVisible(false);
        getPaymentFlowPagerAdapter().setShippingMethods$payments_core_release(list);
        getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(true);
        if (hasNextPage()) {
            PaymentFlowViewModel viewModel = getViewModel();
            viewModel.setCurrentPage$payments_core_release(viewModel.getCurrentPage$payments_core_release() + 1);
            getViewPager().setCurrentItem(getViewModel().getCurrentPage$payments_core_release());
            return;
        }
        finishWithData(getViewModel().getPaymentSessionData$payments_core_release());
    }

    private final void validateShippingInformation(PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, ShippingInformation shippingInformation) {
        getViewModel().validateShippingInformation$payments_core_release(shippingInformationValidator, shippingMethodsFactory, shippingInformation).observe(this, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.a0
            {
                PaymentFlowActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentFlowActivity.k(PaymentFlowActivity.this, (vz.q) obj);
            }
        });
    }

    /* renamed from: validateShippingInformation$lambda-7 */
    public static final void m532validateShippingInformation$lambda7(PaymentFlowActivity this$0, vz.q result) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(result, "result");
        Object j11 = result.j();
        Throwable e11 = vz.q.e(j11);
        if (e11 == null) {
            this$0.onShippingInfoValidated((List) j11);
        } else {
            this$0.onShippingInfoError(e11);
        }
    }

    @Override // com.stripe.android.view.StripeActivity
    public void onActionSave() {
        if (PaymentFlowPage.ShippingInfo == getPaymentFlowPagerAdapter().getPageAt$payments_core_release(getViewPager().getCurrentItem())) {
            onShippingInfoSubmitted();
        } else {
            onShippingMethodSave();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (hasPreviousPage()) {
            PaymentFlowViewModel viewModel = getViewModel();
            viewModel.setCurrentPage$payments_core_release(viewModel.getCurrentPage$payments_core_release() - 1);
            getViewPager().setCurrentItem(getViewModel().getCurrentPage$payments_core_release());
            return;
        }
        super.onBackPressed();
    }

    @Override // com.stripe.android.view.StripeActivity, androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentFlowActivityStarter.Args.Companion companion = PaymentFlowActivityStarter.Args.Companion;
        Intent intent = getIntent();
        kotlin.jvm.internal.s.f(intent, "intent");
        Integer windowFlags$payments_core_release = companion.create(intent).getWindowFlags$payments_core_release();
        if (windowFlags$payments_core_release != null) {
            getWindow().addFlags(windowFlags$payments_core_release.intValue());
        }
        ShippingInformation submittedShippingInfo$payments_core_release = getViewModel().getSubmittedShippingInfo$payments_core_release();
        if (submittedShippingInfo$payments_core_release == null) {
            submittedShippingInfo$payments_core_release = getPaymentSessionConfig().getPrepopulatedShippingInfo();
        }
        getPaymentFlowPagerAdapter().setShippingMethods$payments_core_release(getViewModel().getShippingMethods$payments_core_release());
        getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(getViewModel().isShippingInfoSubmitted$payments_core_release());
        getPaymentFlowPagerAdapter().setShippingInformation$payments_core_release(submittedShippingInfo$payments_core_release);
        getPaymentFlowPagerAdapter().setSelectedShippingMethod$payments_core_release(getViewModel().getSelectedShippingMethod$payments_core_release());
        getViewPager().setAdapter(getPaymentFlowPagerAdapter());
        getViewPager().addOnPageChangeListener(new b.j() { // from class: com.stripe.android.view.PaymentFlowActivity$onCreate$2
            @Override // androidx.viewpager.widget.b.j
            public void onPageScrollStateChanged(int i11) {
            }

            @Override // androidx.viewpager.widget.b.j
            public void onPageScrolled(int i11, float f11, int i12) {
            }

            @Override // androidx.viewpager.widget.b.j
            public void onPageSelected(int i11) {
                PaymentFlowPagerAdapter paymentFlowPagerAdapter;
                PaymentFlowPagerAdapter paymentFlowPagerAdapter2;
                PaymentFlowViewModel viewModel;
                PaymentFlowPagerAdapter paymentFlowPagerAdapter3;
                PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
                paymentFlowPagerAdapter = paymentFlowActivity.getPaymentFlowPagerAdapter();
                paymentFlowActivity.setTitle(paymentFlowPagerAdapter.getPageTitle(i11));
                paymentFlowPagerAdapter2 = PaymentFlowActivity.this.getPaymentFlowPagerAdapter();
                if (paymentFlowPagerAdapter2.getPageAt$payments_core_release(i11) == PaymentFlowPage.ShippingInfo) {
                    viewModel = PaymentFlowActivity.this.getViewModel();
                    viewModel.setShippingInfoSubmitted$payments_core_release(false);
                    paymentFlowPagerAdapter3 = PaymentFlowActivity.this.getPaymentFlowPagerAdapter();
                    paymentFlowPagerAdapter3.setShippingInfoSubmitted$payments_core_release(false);
                }
            }
        });
        getViewPager().setCurrentItem(getViewModel().getCurrentPage$payments_core_release());
        setTitle(getPaymentFlowPagerAdapter().getPageTitle(getViewPager().getCurrentItem()));
    }

    public final /* synthetic */ void onShippingInfoSaved$payments_core_release(ShippingInformation shippingInformation, List shippingMethods) {
        PaymentSessionData copy;
        kotlin.jvm.internal.s.g(shippingMethods, "shippingMethods");
        onShippingMethodsReady(shippingMethods);
        PaymentFlowViewModel viewModel = getViewModel();
        copy = r3.copy((r22 & 1) != 0 ? r3.isShippingInfoRequired : false, (r22 & 2) != 0 ? r3.isShippingMethodRequired : false, (r22 & 4) != 0 ? r3.cartTotal : 0L, (r22 & 8) != 0 ? r3.shippingTotal : 0L, (r22 & 16) != 0 ? r3.shippingInformation : shippingInformation, (r22 & 32) != 0 ? r3.shippingMethod : null, (r22 & 64) != 0 ? r3.paymentMethod : null, (r22 & 128) != 0 ? getViewModel().getPaymentSessionData$payments_core_release().useGooglePay : false);
        viewModel.setPaymentSessionData$payments_core_release(copy);
    }
}