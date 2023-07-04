package com.stripe.android.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.r0;
import com.stripe.android.CustomerSession;
import com.stripe.android.R;
import com.stripe.android.Stripe;
import com.stripe.android.databinding.AddPaymentMethodActivityBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.q;

/* loaded from: classes6.dex */
public final class AddPaymentMethodActivity extends StripeActivity {
    public static final String PRODUCT_TOKEN = "AddPaymentMethodActivity";
    private final vz.k addPaymentMethodView$delegate;
    private final vz.k args$delegate;
    private final vz.k paymentMethodType$delegate;
    private final vz.k shouldAttachToCustomer$delegate;
    private final vz.k stripe$delegate;
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

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            iArr[PaymentMethod.Type.Fpx.ordinal()] = 2;
            iArr[PaymentMethod.Type.Netbanking.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AddPaymentMethodActivity() {
        vz.k a11;
        vz.k a12;
        vz.k a13;
        vz.k a14;
        vz.k a15;
        a11 = vz.m.a(new AddPaymentMethodActivity$args$2(this));
        this.args$delegate = a11;
        a12 = vz.m.a(new AddPaymentMethodActivity$stripe$2(this));
        this.stripe$delegate = a12;
        a13 = vz.m.a(new AddPaymentMethodActivity$paymentMethodType$2(this));
        this.paymentMethodType$delegate = a13;
        a14 = vz.m.a(new AddPaymentMethodActivity$shouldAttachToCustomer$2(this));
        this.shouldAttachToCustomer$delegate = a14;
        a15 = vz.m.a(new AddPaymentMethodActivity$addPaymentMethodView$2(this));
        this.addPaymentMethodView$delegate = a15;
        this.viewModel$delegate = new r0(kotlin.jvm.internal.m0.b(AddPaymentMethodViewModel.class), new AddPaymentMethodActivity$special$$inlined$viewModels$2(this), new AddPaymentMethodActivity$viewModel$2(this));
    }

    private final void attachPaymentMethodToCustomer(PaymentMethod paymentMethod) {
        Object b11;
        try {
            q.a aVar = vz.q.f54772b;
            b11 = vz.q.b(CustomerSession.Companion.getInstance());
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        Throwable e11 = vz.q.e(b11);
        if (e11 == null) {
            getViewModel().attachPaymentMethod$payments_core_release((CustomerSession) b11, paymentMethod).observe(this, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.b
                {
                    AddPaymentMethodActivity.this = this;
                }

                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    AddPaymentMethodActivity.k(AddPaymentMethodActivity.this, (vz.q) obj);
                }
            });
            return;
        }
        finishWithResult(new AddPaymentMethodActivityStarter.Result.Failure(e11));
    }

    /* renamed from: attachPaymentMethodToCustomer$lambda-8$lambda-7 */
    public static final void m506attachPaymentMethodToCustomer$lambda8$lambda7(AddPaymentMethodActivity this$0, vz.q result) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(result, "result");
        Object j11 = result.j();
        Throwable e11 = vz.q.e(j11);
        if (e11 == null) {
            this$0.finishWithPaymentMethod((PaymentMethod) j11);
            return;
        }
        this$0.setProgressBarVisible(false);
        String message = e11.getMessage();
        if (message == null) {
            message = "";
        }
        this$0.showError(message);
    }

    private final void configureView(AddPaymentMethodActivityStarter.Args args) {
        Integer windowFlags$payments_core_release = args.getWindowFlags$payments_core_release();
        if (windowFlags$payments_core_release != null) {
            getWindow().addFlags(windowFlags$payments_core_release.intValue());
        }
        getViewStub$payments_core_release().setLayoutResource(R.layout.add_payment_method_activity);
        View inflate = getViewStub$payments_core_release().inflate();
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        AddPaymentMethodActivityBinding bind = AddPaymentMethodActivityBinding.bind((ViewGroup) inflate);
        kotlin.jvm.internal.s.f(bind, "bind(scrollView)");
        bind.root.addView(getAddPaymentMethodView());
        LinearLayout linearLayout = bind.root;
        kotlin.jvm.internal.s.f(linearLayout, "viewBinding.root");
        View createFooterView = createFooterView(linearLayout);
        if (createFooterView != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                getAddPaymentMethodView().setAccessibilityTraversalBefore(createFooterView.getId());
                createFooterView.setAccessibilityTraversalAfter(getAddPaymentMethodView().getId());
            }
            bind.root.addView(createFooterView);
        }
        setTitle(getTitleStringRes());
    }

    private final View createFooterView(ViewGroup viewGroup) {
        if (getArgs().getAddPaymentMethodFooterLayoutId$payments_core_release() > 0) {
            View inflate = getLayoutInflater().inflate(getArgs().getAddPaymentMethodFooterLayoutId$payments_core_release(), viewGroup, false);
            inflate.setId(R.id.stripe_add_payment_method_footer);
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

    /* renamed from: createPaymentMethod$lambda-4 */
    public static final void m507createPaymentMethod$lambda4(AddPaymentMethodActivity this$0, vz.q result) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(result, "result");
        Object j11 = result.j();
        Throwable e11 = vz.q.e(j11);
        if (e11 == null) {
            PaymentMethod paymentMethod = (PaymentMethod) j11;
            if (this$0.getShouldAttachToCustomer()) {
                this$0.attachPaymentMethodToCustomer(paymentMethod);
                return;
            } else {
                this$0.finishWithPaymentMethod(paymentMethod);
                return;
            }
        }
        this$0.setProgressBarVisible(false);
        String message = e11.getMessage();
        if (message == null) {
            message = "";
        }
        this$0.showError(message);
    }

    public final AddPaymentMethodView createPaymentMethodView(AddPaymentMethodActivityStarter.Args args) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getPaymentMethodType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return AddPaymentMethodNetbankingView.Companion.create$payments_core_release(this);
                }
                throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Unsupported Payment Method type: ", getPaymentMethodType().code));
            }
            return AddPaymentMethodFpxView.Companion.create$payments_core_release(this);
        }
        return new AddPaymentMethodCardView(this, null, 0, args.getBillingAddressFields$payments_core_release(), 6, null);
    }

    private final void finishWithPaymentMethod(PaymentMethod paymentMethod) {
        finishWithResult(new AddPaymentMethodActivityStarter.Result.Success(paymentMethod));
    }

    private final void finishWithResult(AddPaymentMethodActivityStarter.Result result) {
        setProgressBarVisible(false);
        setResult(-1, new Intent().putExtras(result.toBundle()));
        finish();
    }

    private final AddPaymentMethodView getAddPaymentMethodView() {
        return (AddPaymentMethodView) this.addPaymentMethodView$delegate.getValue();
    }

    public final AddPaymentMethodActivityStarter.Args getArgs() {
        return (AddPaymentMethodActivityStarter.Args) this.args$delegate.getValue();
    }

    public final PaymentMethod.Type getPaymentMethodType() {
        return (PaymentMethod.Type) this.paymentMethodType$delegate.getValue();
    }

    private final boolean getShouldAttachToCustomer() {
        return ((Boolean) this.shouldAttachToCustomer$delegate.getValue()).booleanValue();
    }

    public final Stripe getStripe() {
        return (Stripe) this.stripe$delegate.getValue();
    }

    private final int getTitleStringRes() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getPaymentMethodType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return R.string.title_bank_account;
                }
                throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Unsupported Payment Method type: ", getPaymentMethodType().code));
            }
            return R.string.title_bank_account;
        }
        return R.string.title_add_a_card;
    }

    private final AddPaymentMethodViewModel getViewModel() {
        return (AddPaymentMethodViewModel) this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void h(AddPaymentMethodActivity addPaymentMethodActivity, vz.q qVar) {
        m507createPaymentMethod$lambda4(addPaymentMethodActivity, qVar);
    }

    public static /* synthetic */ void k(AddPaymentMethodActivity addPaymentMethodActivity, vz.q qVar) {
        m506attachPaymentMethodToCustomer$lambda8$lambda7(addPaymentMethodActivity, qVar);
    }

    public final void createPaymentMethod$payments_core_release(AddPaymentMethodViewModel viewModel, PaymentMethodCreateParams paymentMethodCreateParams) {
        kotlin.jvm.internal.s.g(viewModel, "viewModel");
        if (paymentMethodCreateParams == null) {
            return;
        }
        setProgressBarVisible(true);
        viewModel.createPaymentMethod$payments_core_release(paymentMethodCreateParams).observe(this, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.a
            {
                AddPaymentMethodActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                AddPaymentMethodActivity.h(AddPaymentMethodActivity.this, (vz.q) obj);
            }
        });
    }

    @Override // com.stripe.android.view.StripeActivity
    public void onActionSave() {
        createPaymentMethod$payments_core_release(getViewModel(), getAddPaymentMethodView().getCreateParams());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.stripe.android.view.StripeActivity, androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        configureView(getArgs());
        setResult(-1, new Intent().putExtras(AddPaymentMethodActivityStarter.Result.Canceled.INSTANCE.toBundle()));
    }

    @Override // com.stripe.android.view.StripeActivity
    protected void onProgressBarVisibilityChanged(boolean z11) {
        getAddPaymentMethodView().setCommunicatingProgress(z11);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        getAddPaymentMethodView().requestFocus();
    }
}