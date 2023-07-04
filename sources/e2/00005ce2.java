package com.stripe.android.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.r0;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;
import com.stripe.android.R;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.PaymentMethodsActivityBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import com.stripe.android.view.PaymentMethodsAdapter;
import com.stripe.android.view.i18n.TranslatorManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentMethodsActivity extends androidx.appcompat.app.d {
    public static final String PRODUCT_TOKEN = "PaymentMethodsActivity";
    private final vz.k adapter$delegate;
    private final vz.k alertDisplayer$delegate;
    private final vz.k args$delegate;
    private final vz.k cardDisplayTextFactory$delegate;
    private final vz.k customerSession$delegate;
    private final vz.k startedFromPaymentSession$delegate;
    private final vz.k viewBinding$delegate;
    private final vz.k viewModel$delegate;
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

    public PaymentMethodsActivity() {
        vz.k a11;
        vz.k a12;
        vz.k a13;
        vz.k a14;
        vz.k a15;
        vz.k a16;
        vz.k a17;
        a11 = vz.m.a(new PaymentMethodsActivity$viewBinding$2(this));
        this.viewBinding$delegate = a11;
        a12 = vz.m.a(new PaymentMethodsActivity$startedFromPaymentSession$2(this));
        this.startedFromPaymentSession$delegate = a12;
        a13 = vz.m.a(new PaymentMethodsActivity$customerSession$2(this));
        this.customerSession$delegate = a13;
        a14 = vz.m.a(new PaymentMethodsActivity$cardDisplayTextFactory$2(this));
        this.cardDisplayTextFactory$delegate = a14;
        a15 = vz.m.a(new PaymentMethodsActivity$alertDisplayer$2(this));
        this.alertDisplayer$delegate = a15;
        a16 = vz.m.a(new PaymentMethodsActivity$args$2(this));
        this.args$delegate = a16;
        this.viewModel$delegate = new r0(kotlin.jvm.internal.m0.b(PaymentMethodsViewModel.class), new PaymentMethodsActivity$special$$inlined$viewModels$2(this), new PaymentMethodsActivity$viewModel$2(this));
        a17 = vz.m.a(new PaymentMethodsActivity$adapter$2(this));
        this.adapter$delegate = a17;
    }

    private final View createFooterView(ViewGroup viewGroup) {
        if (getArgs().getPaymentMethodsFooterLayoutId() > 0) {
            View inflate = getLayoutInflater().inflate(getArgs().getPaymentMethodsFooterLayoutId(), viewGroup, false);
            inflate.setId(R.id.stripe_payment_methods_footer);
            if (inflate instanceof TextView) {
                TextView textView = (TextView) inflate;
                u3.b.c(textView, 15);
                androidx.core.view.a0.l(inflate);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return inflate;
            }
            return inflate;
        }
        return null;
    }

    private final void fetchCustomerPaymentMethods() {
        getViewModel().getPaymentMethods$payments_core_release().observe(this, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.g0
            {
                PaymentMethodsActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentMethodsActivity.l(PaymentMethodsActivity.this, (vz.q) obj);
            }
        });
    }

    /* renamed from: fetchCustomerPaymentMethods$lambda-9 */
    public static final void m534fetchCustomerPaymentMethods$lambda9(PaymentMethodsActivity this$0, vz.q result) {
        String message;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(result, "result");
        Object j11 = result.j();
        Throwable e11 = vz.q.e(j11);
        if (e11 == null) {
            this$0.getAdapter().setPaymentMethods$payments_core_release((List) j11);
            return;
        }
        AlertDisplayer alertDisplayer = this$0.getAlertDisplayer();
        if (e11 instanceof StripeException) {
            StripeException stripeException = (StripeException) e11;
            message = TranslatorManager.INSTANCE.getErrorMessageTranslator().translate(stripeException.getStatusCode(), e11.getMessage(), stripeException.getStripeError());
        } else {
            message = e11.getMessage();
            if (message == null) {
                message = "";
            }
        }
        alertDisplayer.show(message);
    }

    public final void finishWithGooglePay() {
        setResult(-1, new Intent().putExtras(new PaymentMethodsActivityStarter.Result(null, true, 1, null).toBundle()));
        finish();
    }

    private final void finishWithResult(PaymentMethod paymentMethod, int i11) {
        Intent intent = new Intent();
        intent.putExtras(new PaymentMethodsActivityStarter.Result(paymentMethod, getArgs().getUseGooglePay$payments_core_release() && paymentMethod == null).toBundle());
        vz.b0 b0Var = vz.b0.f54756a;
        setResult(i11, intent);
        finish();
    }

    public static /* synthetic */ void finishWithResult$default(PaymentMethodsActivity paymentMethodsActivity, PaymentMethod paymentMethod, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        paymentMethodsActivity.finishWithResult(paymentMethod, i11);
    }

    private final PaymentMethodsAdapter getAdapter() {
        return (PaymentMethodsAdapter) this.adapter$delegate.getValue();
    }

    private final AlertDisplayer getAlertDisplayer() {
        return (AlertDisplayer) this.alertDisplayer$delegate.getValue();
    }

    public final PaymentMethodsActivityStarter.Args getArgs() {
        return (PaymentMethodsActivityStarter.Args) this.args$delegate.getValue();
    }

    private final CardDisplayTextFactory getCardDisplayTextFactory() {
        return (CardDisplayTextFactory) this.cardDisplayTextFactory$delegate.getValue();
    }

    /* renamed from: getCustomerSession-d1pmJ48 */
    public final Object m535getCustomerSessiond1pmJ48() {
        return ((vz.q) this.customerSession$delegate.getValue()).j();
    }

    public final boolean getStartedFromPaymentSession() {
        return ((Boolean) this.startedFromPaymentSession$delegate.getValue()).booleanValue();
    }

    public final PaymentMethodsViewModel getViewModel() {
        return (PaymentMethodsViewModel) this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void h(androidx.activity.result.d dVar, AddPaymentMethodActivityStarter.Args args) {
        m538onCreate$lambda4(dVar, args);
    }

    public static /* synthetic */ void k(PaymentMethodsActivity paymentMethodsActivity, String str) {
        m536onCreate$lambda2(paymentMethodsActivity, str);
    }

    public static /* synthetic */ void l(PaymentMethodsActivity paymentMethodsActivity, vz.q qVar) {
        m534fetchCustomerPaymentMethods$lambda9(paymentMethodsActivity, qVar);
    }

    public static /* synthetic */ void m(PaymentMethodsActivity paymentMethodsActivity, Boolean bool) {
        m537onCreate$lambda3(paymentMethodsActivity, bool);
    }

    private final void onAddedPaymentMethod(PaymentMethod paymentMethod) {
        PaymentMethod.Type type = paymentMethod.type;
        if (type != null && type.isReusable) {
            fetchCustomerPaymentMethods();
            getViewModel().onPaymentMethodAdded$payments_core_release(paymentMethod);
            return;
        }
        finishWithResult$default(this, paymentMethod, 0, 2, null);
    }

    /* renamed from: onCreate$lambda-2 */
    public static final void m536onCreate$lambda2(PaymentMethodsActivity this$0, String str) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (str == null) {
            return;
        }
        Snackbar.Y(this$0.getViewBinding$payments_core_release().coordinator, str, -1).O();
    }

    /* renamed from: onCreate$lambda-3 */
    public static final void m537onCreate$lambda3(PaymentMethodsActivity this$0, Boolean it2) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        LinearProgressIndicator linearProgressIndicator = this$0.getViewBinding$payments_core_release().progressBar;
        kotlin.jvm.internal.s.f(linearProgressIndicator, "viewBinding.progressBar");
        kotlin.jvm.internal.s.f(it2, "it");
        linearProgressIndicator.setVisibility(it2.booleanValue() ? 0 : 8);
    }

    /* renamed from: onCreate$lambda-4 */
    public static final void m538onCreate$lambda4(androidx.activity.result.d addPaymentMethodLauncher, AddPaymentMethodActivityStarter.Args args) {
        kotlin.jvm.internal.s.g(addPaymentMethodLauncher, "$addPaymentMethodLauncher");
        if (args != null) {
            addPaymentMethodLauncher.b(args);
        }
    }

    private final void setupRecyclerView() {
        final DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory = new DeletePaymentMethodDialogFactory(this, getAdapter(), getCardDisplayTextFactory(), m535getCustomerSessiond1pmJ48(), getViewModel().getProductUsage$payments_core_release(), new PaymentMethodsActivity$setupRecyclerView$deletePaymentMethodDialogFactory$1(this));
        getAdapter().setListener$payments_core_release(new PaymentMethodsAdapter.Listener() { // from class: com.stripe.android.view.PaymentMethodsActivity$setupRecyclerView$1
            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onDeletePaymentMethodAction(PaymentMethod paymentMethod) {
                kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
                deletePaymentMethodDialogFactory.create(paymentMethod).show();
            }

            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onGooglePayClick() {
                PaymentMethodsActivity.this.finishWithGooglePay();
            }

            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onPaymentMethodClick(PaymentMethod paymentMethod) {
                kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
                PaymentMethodsActivity.this.getViewBinding$payments_core_release().recycler.setTappedPaymentMethod$payments_core_release(paymentMethod);
            }
        });
        getViewBinding$payments_core_release().recycler.setAdapter(getAdapter());
        getViewBinding$payments_core_release().recycler.setPaymentMethodSelectedCallback$payments_core_release(new PaymentMethodsActivity$setupRecyclerView$2(this));
        if (getArgs().getCanDeletePaymentMethods$payments_core_release()) {
            getViewBinding$payments_core_release().recycler.attachItemTouchHelper$payments_core_release(new PaymentMethodSwipeCallback(this, getAdapter(), new SwipeToDeleteCallbackListener(deletePaymentMethodDialogFactory)));
        }
    }

    public final PaymentMethodsActivityBinding getViewBinding$payments_core_release() {
        return (PaymentMethodsActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final void onAddPaymentMethodResult$payments_core_release(AddPaymentMethodActivityStarter.Result result) {
        kotlin.jvm.internal.s.g(result, "result");
        if (result instanceof AddPaymentMethodActivityStarter.Result.Success) {
            onAddedPaymentMethod(((AddPaymentMethodActivityStarter.Result.Success) result).getPaymentMethod());
        } else {
            boolean z11 = result instanceof AddPaymentMethodActivityStarter.Result.Failure;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finishWithResult(getAdapter().getSelectedPaymentMethod$payments_core_release(), 0);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (vz.q.g(m535getCustomerSessiond1pmJ48())) {
            finishWithResult(null, 0);
            return;
        }
        setContentView(getViewBinding$payments_core_release().getRoot());
        Integer windowFlags$payments_core_release = getArgs().getWindowFlags$payments_core_release();
        if (windowFlags$payments_core_release != null) {
            getWindow().addFlags(windowFlags$payments_core_release.intValue());
        }
        getViewModel().getSnackbarData$payments_core_release().observe(this, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.f0
            {
                PaymentMethodsActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentMethodsActivity.k(PaymentMethodsActivity.this, (String) obj);
            }
        });
        getViewModel().getProgressData$payments_core_release().observe(this, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.e0
            {
                PaymentMethodsActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentMethodsActivity.m(PaymentMethodsActivity.this, (Boolean) obj);
            }
        });
        setupRecyclerView();
        final androidx.activity.result.d registerForActivityResult = registerForActivityResult(new AddPaymentMethodContract(), new androidx.activity.result.b() { // from class: com.stripe.android.view.c0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                PaymentMethodsActivity.this.onAddPaymentMethodResult$payments_core_release((AddPaymentMethodActivityStarter.Result) obj);
            }
        });
        kotlin.jvm.internal.s.f(registerForActivityResult, "registerForActivityResul…entMethodResult\n        )");
        getAdapter().getAddPaymentMethodArgs().observe(this, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.d0
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentMethodsActivity.h(androidx.activity.result.d.this, (AddPaymentMethodActivityStarter.Args) obj);
            }
        });
        setSupportActionBar(getViewBinding$payments_core_release().toolbar);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.v(true);
            supportActionBar.x(true);
        }
        FrameLayout frameLayout = getViewBinding$payments_core_release().footerContainer;
        kotlin.jvm.internal.s.f(frameLayout, "viewBinding.footerContainer");
        View createFooterView = createFooterView(frameLayout);
        if (createFooterView != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                getViewBinding$payments_core_release().recycler.setAccessibilityTraversalBefore(createFooterView.getId());
                createFooterView.setAccessibilityTraversalAfter(getViewBinding$payments_core_release().recycler.getId());
            }
            getViewBinding$payments_core_release().footerContainer.addView(createFooterView);
            FrameLayout frameLayout2 = getViewBinding$payments_core_release().footerContainer;
            kotlin.jvm.internal.s.f(frameLayout2, "viewBinding.footerContainer");
            frameLayout2.setVisibility(0);
        }
        fetchCustomerPaymentMethods();
        getViewBinding$payments_core_release().recycler.requestFocusFromTouch();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        PaymentMethodsViewModel viewModel = getViewModel();
        PaymentMethod selectedPaymentMethod$payments_core_release = getAdapter().getSelectedPaymentMethod$payments_core_release();
        viewModel.setSelectedPaymentMethodId$payments_core_release(selectedPaymentMethod$payments_core_release == null ? null : selectedPaymentMethod$payments_core_release.f20932id);
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        finishWithResult(getAdapter().getSelectedPaymentMethod$payments_core_release(), 0);
        return true;
    }
}