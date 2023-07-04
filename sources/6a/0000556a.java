package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.v1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.link.ui.LinkButtonView;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.databinding.ActivityPaymentSheetBinding;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.ui.AnimationConstants;
import com.stripe.android.paymentsheet.ui.BaseSheetActivity;
import com.stripe.android.paymentsheet.ui.GooglePayButton;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import java.security.InvalidParameterException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public final class PaymentSheetActivity extends BaseSheetActivity<PaymentSheetResult> {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_FRAGMENT_CONFIG = "com.stripe.android.paymentsheet.extra_fragment_config";
    public static final String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    private final vz.k appbar$delegate;
    private final vz.k bottomSheet$delegate;
    private final vz.k bottomSpacer$delegate;
    private final vz.k buttonContainer$delegate;
    private final h00.l<PaymentSheetViewState, vz.b0> buyButtonStateObserver;
    private final vz.k fragmentContainerParent$delegate;
    private final vz.k googlePayButton$delegate;
    private final vz.k googlePayDivider$delegate;
    private final vz.k header$delegate;
    private final vz.k linkAuthView$delegate;
    private final vz.k linkButton$delegate;
    private final vz.k messageView$delegate;
    private final vz.k notesView$delegate;
    private final vz.k primaryButton$delegate;
    private final vz.k rootView$delegate;
    private final vz.k scrollView$delegate;
    private final vz.k starterArgs$delegate;
    private final vz.k testModeIndicator$delegate;
    private final vz.k toolbar$delegate;
    private final vz.k topContainer$delegate;
    private final vz.k topMessage$delegate;
    private final vz.k viewBinding$delegate;
    private final vz.k viewModel$delegate;
    private s0.b viewModelFactory;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PaymentSheetActivity() {
        vz.k a11;
        vz.k a12;
        vz.k a13;
        vz.k a14;
        vz.k a15;
        vz.k a16;
        vz.k a17;
        vz.k a18;
        vz.k a19;
        vz.k a21;
        vz.k a22;
        vz.k a23;
        vz.k a24;
        vz.k a25;
        vz.k a26;
        vz.k a27;
        vz.k a28;
        vz.k a29;
        vz.k a31;
        vz.k a32;
        vz.k a33;
        a11 = vz.m.a(new PaymentSheetActivity$viewBinding$2(this));
        this.viewBinding$delegate = a11;
        PaymentSheetActivity$viewModelFactory$1 paymentSheetActivity$viewModelFactory$1 = new PaymentSheetActivity$viewModelFactory$1(this);
        PaymentSheetActivity$viewModelFactory$2 paymentSheetActivity$viewModelFactory$2 = new PaymentSheetActivity$viewModelFactory$2(this);
        Intent intent = getIntent();
        this.viewModelFactory = new PaymentSheetViewModel.Factory(paymentSheetActivity$viewModelFactory$1, paymentSheetActivity$viewModelFactory$2, this, intent == null ? null : intent.getExtras());
        this.viewModel$delegate = new r0(m0.b(PaymentSheetViewModel.class), new PaymentSheetActivity$special$$inlined$viewModels$2(this), new PaymentSheetActivity$viewModel$2(this));
        a12 = vz.m.a(new PaymentSheetActivity$starterArgs$2(this));
        this.starterArgs$delegate = a12;
        a13 = vz.m.a(new PaymentSheetActivity$rootView$2(this));
        this.rootView$delegate = a13;
        a14 = vz.m.a(new PaymentSheetActivity$bottomSheet$2(this));
        this.bottomSheet$delegate = a14;
        a15 = vz.m.a(new PaymentSheetActivity$appbar$2(this));
        this.appbar$delegate = a15;
        a16 = vz.m.a(new PaymentSheetActivity$linkAuthView$2(this));
        this.linkAuthView$delegate = a16;
        a17 = vz.m.a(new PaymentSheetActivity$toolbar$2(this));
        this.toolbar$delegate = a17;
        a18 = vz.m.a(new PaymentSheetActivity$testModeIndicator$2(this));
        this.testModeIndicator$delegate = a18;
        a19 = vz.m.a(new PaymentSheetActivity$scrollView$2(this));
        this.scrollView$delegate = a19;
        a21 = vz.m.a(new PaymentSheetActivity$header$2(this));
        this.header$delegate = a21;
        a22 = vz.m.a(new PaymentSheetActivity$fragmentContainerParent$2(this));
        this.fragmentContainerParent$delegate = a22;
        a23 = vz.m.a(new PaymentSheetActivity$messageView$2(this));
        this.messageView$delegate = a23;
        a24 = vz.m.a(new PaymentSheetActivity$notesView$2(this));
        this.notesView$delegate = a24;
        a25 = vz.m.a(new PaymentSheetActivity$primaryButton$2(this));
        this.primaryButton$delegate = a25;
        a26 = vz.m.a(new PaymentSheetActivity$bottomSpacer$2(this));
        this.bottomSpacer$delegate = a26;
        a27 = vz.m.a(new PaymentSheetActivity$buttonContainer$2(this));
        this.buttonContainer$delegate = a27;
        a28 = vz.m.a(new PaymentSheetActivity$topContainer$2(this));
        this.topContainer$delegate = a28;
        a29 = vz.m.a(new PaymentSheetActivity$googlePayButton$2(this));
        this.googlePayButton$delegate = a29;
        a31 = vz.m.a(new PaymentSheetActivity$linkButton$2(this));
        this.linkButton$delegate = a31;
        a32 = vz.m.a(new PaymentSheetActivity$topMessage$2(this));
        this.topMessage$delegate = a32;
        a33 = vz.m.a(new PaymentSheetActivity$googlePayDivider$2(this));
        this.googlePayDivider$delegate = a33;
        this.buyButtonStateObserver = new PaymentSheetActivity$buyButtonStateObserver$1(this);
    }

    public static /* synthetic */ void A(PaymentSheetActivity paymentSheetActivity, PaymentSheetResult paymentSheetResult) {
        m316onCreate$lambda8(paymentSheetActivity, paymentSheetResult);
    }

    public static /* synthetic */ void B(PaymentSheetActivity paymentSheetActivity, PaymentSelection paymentSelection) {
        m320setupGooglePayButton$lambda18(paymentSheetActivity, paymentSelection);
    }

    public static /* synthetic */ void D(PaymentSheetActivity paymentSheetActivity, View view) {
        m318resetPrimaryButtonState$lambda13(paymentSheetActivity, view);
    }

    public static /* synthetic */ void E(PaymentSheetActivity paymentSheetActivity, View view) {
        m319setupGooglePayButton$lambda17(paymentSheetActivity, view);
    }

    public static /* synthetic */ void F(h00.l lVar, PaymentSheetViewState paymentSheetViewState) {
        m312onCreate$lambda11(lVar, paymentSheetViewState);
    }

    public static /* synthetic */ void G(PaymentSheetActivity paymentSheetActivity, PaymentSheetViewState paymentSheetViewState) {
        m321setupGooglePayButton$lambda19(paymentSheetActivity, paymentSheetViewState);
    }

    public static final /* synthetic */ BottomSheetController access$getBottomSheetController(PaymentSheetActivity paymentSheetActivity) {
        return paymentSheetActivity.getBottomSheetController();
    }

    private final ViewGroup getButtonContainer() {
        Object value = this.buttonContainer$delegate.getValue();
        kotlin.jvm.internal.s.f(value, "<get-buttonContainer>(...)");
        return (ViewGroup) value;
    }

    private final int getFragmentContainerId() {
        return getViewBinding$paymentsheet_release().fragmentContainer.getId();
    }

    private final GooglePayButton getGooglePayButton() {
        return (GooglePayButton) this.googlePayButton$delegate.getValue();
    }

    private final ComposeView getGooglePayDivider() {
        return (ComposeView) this.googlePayDivider$delegate.getValue();
    }

    private final LinkButtonView getLinkButton() {
        return (LinkButtonView) this.linkButton$delegate.getValue();
    }

    public final PaymentSheetContract.Args getStarterArgs() {
        return (PaymentSheetContract.Args) this.starterArgs$delegate.getValue();
    }

    private final LinearLayout getTopContainer() {
        return (LinearLayout) this.topContainer$delegate.getValue();
    }

    private final TextView getTopMessage() {
        return (TextView) this.topMessage$delegate.getValue();
    }

    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    /* renamed from: onCreate$lambda-10 */
    public static final void m311onCreate$lambda10(PaymentSheetActivity this$0, PaymentSelection paymentSelection) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.clearErrorMessages();
        this$0.resetPrimaryButtonState();
    }

    /* renamed from: onCreate$lambda-11 */
    public static final void m312onCreate$lambda11(h00.l tmp0, PaymentSheetViewState paymentSheetViewState) {
        kotlin.jvm.internal.s.g(tmp0, "$tmp0");
        tmp0.invoke(paymentSheetViewState);
    }

    /* renamed from: onCreate$lambda-5 */
    public static final void m313onCreate$lambda5(PaymentSheetActivity this$0, PaymentSheetContract.Args args, BaseSheetViewModel.Event event) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (event == null) {
            return;
        }
        this$0.clearErrorMessages();
        PaymentSheetViewModel.TransitionTarget transitionTarget = (PaymentSheetViewModel.TransitionTarget) event.getContentIfNotHandled();
        if (transitionTarget == null) {
            return;
        }
        this$0.onTransitionTarget(transitionTarget, r3.b.a(vz.v.a("com.stripe.android.paymentsheet.extra_starter_args", args), vz.v.a("com.stripe.android.paymentsheet.extra_fragment_config", transitionTarget.getFragmentConfig())));
    }

    /* renamed from: onCreate$lambda-6 */
    public static final void m314onCreate$lambda6(PaymentSheetActivity this$0, BaseSheetViewModel.Event event) {
        PaymentSheetViewModel.TransitionTarget selectSavedPaymentMethod;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        FragmentConfig fragmentConfig = (FragmentConfig) event.getContentIfNotHandled();
        if (fragmentConfig != null) {
            List<Fragment> s02 = this$0.getSupportFragmentManager().s0();
            kotlin.jvm.internal.s.f(s02, "supportFragmentManager.fragments");
            if (wz.u.d0(s02) instanceof PaymentSheetLoadingFragment) {
                List<PaymentMethod> value = this$0.getViewModel().getPaymentMethods$paymentsheet_release().getValue();
                if (value == null || value.isEmpty()) {
                    this$0.getViewModel().updateSelection(null);
                    selectSavedPaymentMethod = new PaymentSheetViewModel.TransitionTarget.AddPaymentMethodSheet(fragmentConfig);
                } else {
                    selectSavedPaymentMethod = new PaymentSheetViewModel.TransitionTarget.SelectSavedPaymentMethod(fragmentConfig);
                }
                this$0.getViewModel().transitionTo(selectSavedPaymentMethod);
            }
        }
    }

    /* renamed from: onCreate$lambda-7 */
    public static final void m315onCreate$lambda7(PaymentSheetActivity this$0, BaseSheetViewModel.Event event) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        ConfirmStripeIntentParams confirmStripeIntentParams = (ConfirmStripeIntentParams) event.getContentIfNotHandled();
        if (confirmStripeIntentParams != null) {
            this$0.getWindow().setSoftInputMode(2);
            v20.k.d(androidx.lifecycle.w.a(this$0), null, null, new PaymentSheetActivity$onCreate$7$1(this$0, confirmStripeIntentParams, null), 3, null);
        }
    }

    /* renamed from: onCreate$lambda-8 */
    public static final void m316onCreate$lambda8(PaymentSheetActivity this$0, PaymentSheetResult it2) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(it2, "it");
        this$0.closeSheet(it2);
    }

    /* renamed from: onCreate$lambda-9 */
    public static final void m317onCreate$lambda9(PaymentSheetActivity this$0, Boolean enabled) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        LinkButtonView linkButton = this$0.getLinkButton();
        kotlin.jvm.internal.s.f(enabled, "enabled");
        linkButton.setEnabled(enabled.booleanValue());
        this$0.getGooglePayButton().setEnabled(enabled.booleanValue());
    }

    private final void onTransitionTarget(PaymentSheetViewModel.TransitionTarget transitionTarget, Bundle bundle) {
        androidx.fragment.app.q supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.s.f(supportFragmentManager, "supportFragmentManager");
        androidx.fragment.app.z m11 = supportFragmentManager.m();
        kotlin.jvm.internal.s.f(m11, "beginTransaction()");
        if (transitionTarget instanceof PaymentSheetViewModel.TransitionTarget.AddPaymentMethodFull) {
            AnimationConstants animationConstants = AnimationConstants.INSTANCE;
            m11.v(animationConstants.getFADE_IN(), animationConstants.getFADE_OUT(), animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
            m11.g(null);
            m11.r(getFragmentContainerId(), PaymentSheetAddPaymentMethodFragment.class, bundle);
        } else if (transitionTarget instanceof PaymentSheetViewModel.TransitionTarget.SelectSavedPaymentMethod) {
            AnimationConstants animationConstants2 = AnimationConstants.INSTANCE;
            m11.v(animationConstants2.getFADE_IN(), animationConstants2.getFADE_OUT(), animationConstants2.getFADE_IN(), animationConstants2.getFADE_OUT());
            m11.r(getFragmentContainerId(), PaymentSheetListFragment.class, bundle);
        } else if (transitionTarget instanceof PaymentSheetViewModel.TransitionTarget.AddPaymentMethodSheet) {
            AnimationConstants animationConstants3 = AnimationConstants.INSTANCE;
            m11.v(animationConstants3.getFADE_IN(), animationConstants3.getFADE_OUT(), animationConstants3.getFADE_IN(), animationConstants3.getFADE_OUT());
            m11.r(getFragmentContainerId(), PaymentSheetAddPaymentMethodFragment.class, bundle);
        }
        m11.h();
        getButtonContainer().setVisibility(0);
    }

    /* renamed from: resetPrimaryButtonState$lambda-13 */
    public static final void m318resetPrimaryButtonState$lambda13(PaymentSheetActivity this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.clearErrorMessages();
        this$0.getViewModel().checkout(PaymentSheetViewModel.CheckoutIdentifier.SheetBottomBuy);
    }

    private final void setupGooglePayButton() {
        PaymentSheet.Appearance appearance;
        PaymentSheet.Colors colors;
        PaymentSheet.Configuration config$paymentsheet_release = getViewModel().getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null && (appearance = config$paymentsheet_release.getAppearance()) != null && (colors = appearance.getColors(PaymentsThemeKt.isSystemDarkTheme(this))) != null) {
            getGooglePayButton().setBackgroundColor(PaymentsThemeKt.m396shouldUseDarkDynamicColor8_81llA(t1.c0.b(colors.getSurface())));
        }
        getGooglePayButton().setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.paymentsheet.s
            {
                PaymentSheetActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSheetActivity.E(PaymentSheetActivity.this, view);
            }
        });
        getViewModel().getSelection$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.w
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentSheetActivity.B(PaymentSheetActivity.this, (PaymentSelection) obj);
            }
        });
        getViewModel().getButtonStateObservable$paymentsheet_release(PaymentSheetViewModel.CheckoutIdentifier.SheetTopGooglePay).observe(this, new g0() { // from class: com.stripe.android.paymentsheet.x
            {
                PaymentSheetActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentSheetActivity.G(PaymentSheetActivity.this, (PaymentSheetViewState) obj);
            }
        });
    }

    /* renamed from: setupGooglePayButton$lambda-17 */
    public static final void m319setupGooglePayButton$lambda17(PaymentSheetActivity this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.getViewModel().setContentVisible(false);
        this$0.getViewModel().setLastSelectedPaymentMethod$paymentsheet_release(this$0.getViewModel().getSelection$paymentsheet_release().getValue());
        this$0.getViewModel().updateSelection(PaymentSelection.GooglePay.INSTANCE);
    }

    /* renamed from: setupGooglePayButton$lambda-18 */
    public static final void m320setupGooglePayButton$lambda18(PaymentSheetActivity this$0, PaymentSelection paymentSelection) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (kotlin.jvm.internal.s.c(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            this$0.getViewModel().checkout(PaymentSheetViewModel.CheckoutIdentifier.SheetTopGooglePay);
        }
    }

    /* renamed from: setupGooglePayButton$lambda-19 */
    public static final void m321setupGooglePayButton$lambda19(PaymentSheetActivity this$0, PaymentSheetViewState paymentSheetViewState) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (paymentSheetViewState instanceof PaymentSheetViewState.Reset) {
            this$0.getViewModel().updateSelection(this$0.getViewModel().getLastSelectedPaymentMethod$paymentsheet_release());
        }
        TextView topMessage = this$0.getTopMessage();
        kotlin.jvm.internal.s.f(topMessage, "topMessage");
        this$0.updateErrorMessage(topMessage, paymentSheetViewState == null ? null : paymentSheetViewState.getErrorMessage());
        this$0.getGooglePayButton().updateState(paymentSheetViewState != null ? PaymentSheetViewModelKt.convert(paymentSheetViewState) : null);
    }

    private final void setupTopContainer() {
        int i11;
        setupGooglePayButton();
        Resources resources = getResources();
        if (getViewModel().getSupportedPaymentMethods$paymentsheet_release().size() == 1 && getViewModel().getSupportedPaymentMethods$paymentsheet_release().contains(LpmRepository.SupportedPaymentMethod.Card.INSTANCE)) {
            i11 = R.string.stripe_paymentsheet_or_pay_with_card;
        } else {
            i11 = R.string.stripe_paymentsheet_or_pay_using;
        }
        final String string = resources.getString(i11);
        kotlin.jvm.internal.s.f(string, "resources.getString(\n   …g\n            }\n        )");
        getViewModel().getShowTopContainer$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.p
            {
                PaymentSheetActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentSheetActivity.x(PaymentSheetActivity.this, string, (Boolean) obj);
            }
        });
    }

    /* renamed from: setupTopContainer$lambda-15 */
    public static final void m322setupTopContainer$lambda15(PaymentSheetActivity this$0, String dividerText, Boolean visible) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(dividerText, "$dividerText");
        LinkButtonView linkButton = this$0.getLinkButton();
        kotlin.jvm.internal.s.f(linkButton, "linkButton");
        Boolean value = this$0.getViewModel().isLinkEnabled$paymentsheet_release().getValue();
        Boolean bool = Boolean.TRUE;
        linkButton.setVisibility(kotlin.jvm.internal.s.c(value, bool) ? 0 : 8);
        GooglePayButton googlePayButton = this$0.getGooglePayButton();
        kotlin.jvm.internal.s.f(googlePayButton, "googlePayButton");
        googlePayButton.setVisibility(kotlin.jvm.internal.s.c(this$0.getViewModel().isGooglePayReady$paymentsheet_release().getValue(), bool) ? 0 : 8);
        LinearLayout topContainer = this$0.getTopContainer();
        kotlin.jvm.internal.s.f(topContainer, "topContainer");
        kotlin.jvm.internal.s.f(visible, "visible");
        topContainer.setVisibility(visible.booleanValue() ? 0 : 8);
        if (visible.booleanValue()) {
            ComposeView googlePayDivider = this$0.getGooglePayDivider();
            googlePayDivider.setViewCompositionStrategy(v1.b.f3127a);
            googlePayDivider.setContent(j1.c.c(-985538854, true, new PaymentSheetActivity$setupTopContainer$1$1$1(dividerText)));
        }
    }

    public static /* synthetic */ void x(PaymentSheetActivity paymentSheetActivity, String str, Boolean bool) {
        m322setupTopContainer$lambda15(paymentSheetActivity, str, bool);
    }

    public static /* synthetic */ void y(PaymentSheetActivity paymentSheetActivity, Boolean bool) {
        m317onCreate$lambda9(paymentSheetActivity, bool);
    }

    public static /* synthetic */ void z(PaymentSheetActivity paymentSheetActivity, PaymentSelection paymentSelection) {
        m311onCreate$lambda10(paymentSheetActivity, paymentSelection);
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public void clearErrorMessages() {
        super.clearErrorMessages();
        TextView topMessage = getTopMessage();
        kotlin.jvm.internal.s.f(topMessage, "topMessage");
        BaseSheetActivity.updateErrorMessage$default(this, topMessage, null, 2, null);
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public AppBarLayout getAppbar() {
        return (AppBarLayout) this.appbar$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public ViewGroup getBottomSheet() {
        Object value = this.bottomSheet$delegate.getValue();
        kotlin.jvm.internal.s.f(value, "<get-bottomSheet>(...)");
        return (ViewGroup) value;
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public View getBottomSpacer() {
        return (View) this.bottomSpacer$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public ViewGroup getFragmentContainerParent() {
        Object value = this.fragmentContainerParent$delegate.getValue();
        kotlin.jvm.internal.s.f(value, "<get-fragmentContainerParent>(...)");
        return (ViewGroup) value;
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public ComposeView getHeader() {
        return (ComposeView) this.header$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public ComposeView getLinkAuthView() {
        return (ComposeView) this.linkAuthView$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public TextView getMessageView() {
        return (TextView) this.messageView$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public ComposeView getNotesView() {
        return (ComposeView) this.notesView$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public PrimaryButton getPrimaryButton() {
        return (PrimaryButton) this.primaryButton$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public ViewGroup getRootView() {
        Object value = this.rootView$delegate.getValue();
        kotlin.jvm.internal.s.f(value, "<get-rootView>(...)");
        return (ViewGroup) value;
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public ScrollView getScrollView() {
        return (ScrollView) this.scrollView$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public TextView getTestModeIndicator() {
        return (TextView) this.testModeIndicator$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public MaterialToolbar getToolbar() {
        return (MaterialToolbar) this.toolbar$delegate.getValue();
    }

    public final ActivityPaymentSheetBinding getViewBinding$paymentsheet_release() {
        return (ActivityPaymentSheetBinding) this.viewBinding$delegate.getValue();
    }

    public final s0.b getViewModelFactory$paymentsheet_release() {
        return this.viewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity, androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        PaymentSheet.Appearance appearance;
        final PaymentSheetContract.Args starterArgs = getStarterArgs();
        if (starterArgs == null) {
            setActivityResult((PaymentSheetResult) new PaymentSheetResult.Failed(new IllegalArgumentException("PaymentSheet started without arguments.")));
            finish();
            return;
        }
        try {
            PaymentSheet.Configuration config$paymentsheet_release = starterArgs.getConfig$paymentsheet_release();
            if (config$paymentsheet_release != null) {
                PaymentSheetConfigurationKtxKt.validate(config$paymentsheet_release);
            }
            starterArgs.getClientSecret$paymentsheet_release().validate();
            PaymentSheet.Configuration config$paymentsheet_release2 = starterArgs.getConfig$paymentsheet_release();
            if (config$paymentsheet_release2 != null && (appearance = config$paymentsheet_release2.getAppearance()) != null) {
                PaymentSheetConfigurationKtxKt.parseAppearance(appearance);
            }
            super.onCreate(bundle);
            PaymentSheetViewModel viewModel = getViewModel();
            androidx.lifecycle.q a11 = androidx.lifecycle.w.a(this);
            GooglePayPaymentMethodLauncherContract googlePayPaymentMethodLauncherContract = new GooglePayPaymentMethodLauncherContract();
            final PaymentSheetViewModel viewModel2 = getViewModel();
            androidx.activity.result.d<GooglePayPaymentMethodLauncherContract.Args> registerForActivityResult = registerForActivityResult(googlePayPaymentMethodLauncherContract, new androidx.activity.result.b() { // from class: com.stripe.android.paymentsheet.t
                @Override // androidx.activity.result.b
                public final void a(Object obj) {
                    PaymentSheetViewModel.this.onGooglePayResult$paymentsheet_release((GooglePayPaymentMethodLauncher.Result) obj);
                }
            });
            kotlin.jvm.internal.s.f(registerForActivityResult, "registerForActivityResul…lePayResult\n            )");
            viewModel.setupGooglePay(a11, registerForActivityResult);
            if (!getViewModel().maybeFetchStripeIntent$paymentsheet_release()) {
                getButtonContainer().setVisibility(0);
                PrimaryButton primaryButton = getViewBinding$paymentsheet_release().buyButton;
                kotlin.jvm.internal.s.f(primaryButton, "viewBinding.buyButton");
                primaryButton.setVisibility(0);
            }
            Integer statusBarColor$paymentsheet_release = starterArgs.getStatusBarColor$paymentsheet_release();
            if (statusBarColor$paymentsheet_release != null) {
                getWindow().setStatusBarColor(statusBarColor$paymentsheet_release.intValue());
            }
            setContentView(getViewBinding$paymentsheet_release().getRoot());
            getRootView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    kotlin.jvm.internal.s.g(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    PaymentSheetActivity.access$getBottomSheetController(PaymentSheetActivity.this).expand();
                }
            });
            setupTopContainer();
            LinkButtonView linkButton = getLinkButton();
            linkButton.setOnClick(new PaymentSheetActivity$onCreate$4$1(getViewModel()));
            linkButton.setLinkPaymentLauncher(getViewModel().getLinkLauncher());
            getViewModel().getTransition$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.o
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    PaymentSheetActivity.m313onCreate$lambda5(PaymentSheetActivity.this, starterArgs, (BaseSheetViewModel.Event) obj);
                }
            });
            getViewModel().getFragmentConfigEvent().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.y
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    PaymentSheetActivity.m314onCreate$lambda6(PaymentSheetActivity.this, (BaseSheetViewModel.Event) obj);
                }
            });
            getViewModel().getStartConfirm$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.z
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    PaymentSheetActivity.m315onCreate$lambda7(PaymentSheetActivity.this, (BaseSheetViewModel.Event) obj);
                }
            });
            getViewModel().getPaymentSheetResult$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.u
                {
                    PaymentSheetActivity.this = this;
                }

                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    PaymentSheetActivity.A(PaymentSheetActivity.this, (PaymentSheetResult) obj);
                }
            });
            getViewModel().getButtonsEnabled().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.a0
                {
                    PaymentSheetActivity.this = this;
                }

                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    PaymentSheetActivity.y(PaymentSheetActivity.this, (Boolean) obj);
                }
            });
            getViewModel().getSelection$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.v
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    PaymentSheetActivity.z(PaymentSheetActivity.this, (PaymentSelection) obj);
                }
            });
            androidx.lifecycle.d0<PaymentSheetViewState> buttonStateObservable$paymentsheet_release = getViewModel().getButtonStateObservable$paymentsheet_release(PaymentSheetViewModel.CheckoutIdentifier.SheetBottomBuy);
            final h00.l<PaymentSheetViewState, vz.b0> lVar = this.buyButtonStateObserver;
            buttonStateObservable$paymentsheet_release.observe(this, new g0() { // from class: com.stripe.android.paymentsheet.q
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    PaymentSheetActivity.F(h00.l.this, (PaymentSheetViewState) obj);
                }
            });
        } catch (InvalidParameterException e11) {
            setActivityResult((PaymentSheetResult) new PaymentSheetResult.Failed(e11));
            finish();
        }
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public void resetPrimaryButtonState() {
        String buildPayButtonLabel;
        getViewBinding$paymentsheet_release().buyButton.updateState(PrimaryButton.State.Ready.INSTANCE);
        if (getViewModel().isProcessingPaymentIntent$paymentsheet_release()) {
            PrimaryButton primaryButton = getViewBinding$paymentsheet_release().buyButton;
            Amount value = getViewModel().getAmount$paymentsheet_release().getValue();
            if (value == null) {
                buildPayButtonLabel = null;
            } else {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                buildPayButtonLabel = value.buildPayButtonLabel(resources);
            }
            primaryButton.setLabel(buildPayButtonLabel);
        } else {
            getViewBinding$paymentsheet_release().buyButton.setLabel(getResources().getString(R.string.stripe_setup_button_label));
        }
        getViewBinding$paymentsheet_release().buyButton.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.paymentsheet.n
            {
                PaymentSheetActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSheetActivity.D(PaymentSheetActivity.this, view);
            }
        });
    }

    public final void setViewModelFactory$paymentsheet_release(s0.b bVar) {
        kotlin.jvm.internal.s.g(bVar, "<set-?>");
        this.viewModelFactory = bVar;
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public PaymentSheetViewModel getViewModel() {
        return (PaymentSheetViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public void setActivityResult(PaymentSheetResult result) {
        kotlin.jvm.internal.s.g(result, "result");
        setResult(-1, new Intent().putExtras(new PaymentSheetContract.Result(result).toBundle()));
    }
}