package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import androidx.lifecycle.g0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.databinding.ActivityPaymentOptionsBinding;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.ui.AnimationConstants;
import com.stripe.android.paymentsheet.ui.BaseSheetActivity;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public final class PaymentOptionsActivity extends BaseSheetActivity<PaymentOptionResult> {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_FRAGMENT_CONFIG = "com.stripe.android.paymentsheet.extra_fragment_config";
    public static final String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    private final vz.k appbar$delegate;
    private final vz.k bottomSheet$delegate;
    private final vz.k bottomSpacer$delegate;
    private final vz.k fragmentContainerParent$delegate;
    private final vz.k header$delegate;
    private final vz.k linkAuthView$delegate;
    private final vz.k messageView$delegate;
    private final vz.k notesView$delegate;
    private final vz.k primaryButton$delegate;
    private final vz.k rootView$delegate;
    private final vz.k scrollView$delegate;
    private final vz.k starterArgs$delegate;
    private final vz.k testModeIndicator$delegate;
    private final vz.k toolbar$delegate;
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

    public PaymentOptionsActivity() {
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
        a11 = vz.m.a(new PaymentOptionsActivity$viewBinding$2(this));
        this.viewBinding$delegate = a11;
        PaymentOptionsActivity$viewModelFactory$1 paymentOptionsActivity$viewModelFactory$1 = new PaymentOptionsActivity$viewModelFactory$1(this);
        PaymentOptionsActivity$viewModelFactory$2 paymentOptionsActivity$viewModelFactory$2 = new PaymentOptionsActivity$viewModelFactory$2(this);
        Intent intent = getIntent();
        this.viewModelFactory = new PaymentOptionsViewModel.Factory(paymentOptionsActivity$viewModelFactory$1, paymentOptionsActivity$viewModelFactory$2, this, intent == null ? null : intent.getExtras());
        this.viewModel$delegate = new r0(m0.b(PaymentOptionsViewModel.class), new PaymentOptionsActivity$special$$inlined$viewModels$2(this), new PaymentOptionsActivity$viewModel$2(this));
        a12 = vz.m.a(new PaymentOptionsActivity$starterArgs$2(this));
        this.starterArgs$delegate = a12;
        a13 = vz.m.a(new PaymentOptionsActivity$rootView$2(this));
        this.rootView$delegate = a13;
        a14 = vz.m.a(new PaymentOptionsActivity$bottomSheet$2(this));
        this.bottomSheet$delegate = a14;
        a15 = vz.m.a(new PaymentOptionsActivity$appbar$2(this));
        this.appbar$delegate = a15;
        a16 = vz.m.a(new PaymentOptionsActivity$linkAuthView$2(this));
        this.linkAuthView$delegate = a16;
        a17 = vz.m.a(new PaymentOptionsActivity$toolbar$2(this));
        this.toolbar$delegate = a17;
        a18 = vz.m.a(new PaymentOptionsActivity$testModeIndicator$2(this));
        this.testModeIndicator$delegate = a18;
        a19 = vz.m.a(new PaymentOptionsActivity$scrollView$2(this));
        this.scrollView$delegate = a19;
        a21 = vz.m.a(new PaymentOptionsActivity$header$2(this));
        this.header$delegate = a21;
        a22 = vz.m.a(new PaymentOptionsActivity$fragmentContainerParent$2(this));
        this.fragmentContainerParent$delegate = a22;
        a23 = vz.m.a(new PaymentOptionsActivity$messageView$2(this));
        this.messageView$delegate = a23;
        a24 = vz.m.a(new PaymentOptionsActivity$notesView$2(this));
        this.notesView$delegate = a24;
        a25 = vz.m.a(new PaymentOptionsActivity$primaryButton$2(this));
        this.primaryButton$delegate = a25;
        a26 = vz.m.a(new PaymentOptionsActivity$bottomSpacer$2(this));
        this.bottomSpacer$delegate = a26;
    }

    public static /* synthetic */ void C(PaymentOptionsActivity paymentOptionsActivity, String str) {
        m301onCreate$lambda2(paymentOptionsActivity, str);
    }

    public static final /* synthetic */ BottomSheetController access$getBottomSheetController(PaymentOptionsActivity paymentOptionsActivity) {
        return paymentOptionsActivity.getBottomSheetController();
    }

    private final int getFragmentContainerId() {
        return getViewBinding$paymentsheet_release().fragmentContainer.getId();
    }

    public final PaymentOptionContract.Args getStarterArgs() {
        return (PaymentOptionContract.Args) this.starterArgs$delegate.getValue();
    }

    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    /* renamed from: onCreate$lambda-1 */
    public static final void m300onCreate$lambda1(PaymentOptionsActivity this$0, PaymentOptionResult it2) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(it2, "it");
        this$0.closeSheet(it2);
    }

    /* renamed from: onCreate$lambda-2 */
    public static final void m301onCreate$lambda2(PaymentOptionsActivity this$0, String it2) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        TextView messageView = this$0.getMessageView();
        kotlin.jvm.internal.s.f(it2, "it");
        this$0.updateErrorMessage(messageView, new BaseSheetViewModel.UserErrorMessage(it2));
    }

    /* renamed from: onCreate$lambda-4 */
    public static final void m302onCreate$lambda4(PaymentOptionsActivity this$0, PaymentOptionContract.Args args, BaseSheetViewModel.Event event) {
        PaymentOptionsViewModel.TransitionTarget transitionTarget;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.clearErrorMessages();
        if (event == null || (transitionTarget = (PaymentOptionsViewModel.TransitionTarget) event.getContentIfNotHandled()) == null) {
            return;
        }
        this$0.onTransitionTarget(transitionTarget, r3.b.a(vz.v.a("com.stripe.android.paymentsheet.extra_starter_args", args), vz.v.a("com.stripe.android.paymentsheet.extra_fragment_config", transitionTarget.getFragmentConfig())));
    }

    /* renamed from: onCreate$lambda-5 */
    public static final void m303onCreate$lambda5(PaymentOptionsActivity this$0, PaymentOptionContract.Args args, BaseSheetViewModel.Event event) {
        PaymentOptionsViewModel.TransitionTarget selectSavedPaymentMethod;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        FragmentConfig fragmentConfig = (FragmentConfig) event.getContentIfNotHandled();
        if (fragmentConfig != null) {
            PaymentOptionsViewModel viewModel = this$0.getViewModel();
            if (args.getPaymentMethods().isEmpty() && !fragmentConfig.isGooglePayReady() && !kotlin.jvm.internal.s.c(this$0.getViewModel().isLinkEnabled$paymentsheet_release().getValue(), Boolean.TRUE)) {
                selectSavedPaymentMethod = new PaymentOptionsViewModel.TransitionTarget.AddPaymentMethodSheet(fragmentConfig);
            } else {
                selectSavedPaymentMethod = new PaymentOptionsViewModel.TransitionTarget.SelectSavedPaymentMethod(fragmentConfig);
            }
            viewModel.transitionTo(selectSavedPaymentMethod);
        }
    }

    /* renamed from: onCreate$lambda-6 */
    public static final void m304onCreate$lambda6(PaymentOptionsActivity this$0, PaymentSelection paymentSelection) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.clearErrorMessages();
        this$0.resetPrimaryButtonState();
    }

    private final void onTransitionTarget(PaymentOptionsViewModel.TransitionTarget transitionTarget, Bundle bundle) {
        androidx.fragment.app.q supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.s.f(supportFragmentManager, "supportFragmentManager");
        androidx.fragment.app.z m11 = supportFragmentManager.m();
        kotlin.jvm.internal.s.f(m11, "beginTransaction()");
        if (transitionTarget instanceof PaymentOptionsViewModel.TransitionTarget.AddPaymentMethodFull) {
            AnimationConstants animationConstants = AnimationConstants.INSTANCE;
            m11.v(animationConstants.getFADE_IN(), animationConstants.getFADE_OUT(), animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
            m11.g(null);
            m11.r(getFragmentContainerId(), PaymentOptionsAddPaymentMethodFragment.class, bundle);
        } else if (transitionTarget instanceof PaymentOptionsViewModel.TransitionTarget.SelectSavedPaymentMethod) {
            m11.r(getFragmentContainerId(), PaymentOptionsListFragment.class, bundle);
        } else if (transitionTarget instanceof PaymentOptionsViewModel.TransitionTarget.AddPaymentMethodSheet) {
            m11.r(getFragmentContainerId(), PaymentOptionsAddPaymentMethodFragment.class, bundle);
        }
        m11.h();
        getSupportFragmentManager().d0();
        getRootView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity$onTransitionTarget$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                kotlin.jvm.internal.s.g(view, "view");
                view.removeOnLayoutChangeListener(this);
                PaymentOptionsActivity.access$getBottomSheetController(PaymentOptionsActivity.this).expand();
            }
        });
    }

    /* renamed from: resetPrimaryButtonState$lambda-7 */
    public static final void m305resetPrimaryButtonState$lambda7(PaymentOptionsActivity this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.clearErrorMessages();
        this$0.getViewModel().onUserSelection();
    }

    public static /* synthetic */ void x(PaymentOptionsActivity paymentOptionsActivity, View view) {
        m305resetPrimaryButtonState$lambda7(paymentOptionsActivity, view);
    }

    public static /* synthetic */ void y(PaymentOptionsActivity paymentOptionsActivity, PaymentSelection paymentSelection) {
        m304onCreate$lambda6(paymentOptionsActivity, paymentSelection);
    }

    public static /* synthetic */ void z(PaymentOptionsActivity paymentOptionsActivity, PaymentOptionResult paymentOptionResult) {
        m300onCreate$lambda1(paymentOptionsActivity, paymentOptionResult);
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

    public final ActivityPaymentOptionsBinding getViewBinding$paymentsheet_release() {
        return (ActivityPaymentOptionsBinding) this.viewBinding$delegate.getValue();
    }

    public final s0.b getViewModelFactory$paymentsheet_release() {
        return this.viewModelFactory;
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity, androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final PaymentOptionContract.Args starterArgs = getStarterArgs();
        if (starterArgs == null) {
            finish();
            return;
        }
        Integer statusBarColor = starterArgs.getStatusBarColor();
        if (statusBarColor != null) {
            getWindow().setStatusBarColor(statusBarColor.intValue());
        }
        setContentView(getViewBinding$paymentsheet_release().getRoot());
        getViewModel().getPaymentOptionResult$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.i
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentOptionsActivity.z(PaymentOptionsActivity.this, (PaymentOptionResult) obj);
            }
        });
        getViewModel().getError$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.k
            {
                PaymentOptionsActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentOptionsActivity.C(PaymentOptionsActivity.this, (String) obj);
            }
        });
        getViewModel().getTransition$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.l
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentOptionsActivity.m302onCreate$lambda4(PaymentOptionsActivity.this, starterArgs, (BaseSheetViewModel.Event) obj);
            }
        });
        getViewModel().getFragmentConfigEvent().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.m
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentOptionsActivity.m303onCreate$lambda5(PaymentOptionsActivity.this, starterArgs, (BaseSheetViewModel.Event) obj);
            }
        });
        getViewModel().getSelection$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.j
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentOptionsActivity.y(PaymentOptionsActivity.this, (PaymentSelection) obj);
            }
        });
        getSupportFragmentManager().Z0(new q.j() { // from class: com.stripe.android.paymentsheet.PaymentOptionsActivity$onCreate$7
            @Override // androidx.fragment.app.q.j
            public void onFragmentStarted(androidx.fragment.app.q fm2, Fragment fragment) {
                kotlin.jvm.internal.s.g(fm2, "fm");
                kotlin.jvm.internal.s.g(fragment, "fragment");
                boolean z11 = fragment instanceof PaymentOptionsAddPaymentMethodFragment;
                boolean z12 = true;
                if (!z11) {
                    PrimaryButton.UIState value = PaymentOptionsActivity.this.getViewModel().getPrimaryButtonUIState().getValue();
                    if (!(value != null && value.getVisible())) {
                        z12 = false;
                    }
                }
                PrimaryButton primaryButton = PaymentOptionsActivity.this.getViewBinding$paymentsheet_release().continueButton;
                kotlin.jvm.internal.s.f(primaryButton, "viewBinding.continueButton");
                primaryButton.setVisibility(z12 ? 0 : 8);
                View view = PaymentOptionsActivity.this.getViewBinding$paymentsheet_release().bottomSpacer;
                kotlin.jvm.internal.s.f(view, "viewBinding.bottomSpacer");
                view.setVisibility(z12 ? 0 : 8);
            }
        }, false);
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public void resetPrimaryButtonState() {
        getViewBinding$paymentsheet_release().continueButton.setLockVisible$paymentsheet_release(false);
        getViewBinding$paymentsheet_release().continueButton.updateState(PrimaryButton.State.Ready.INSTANCE);
        getViewBinding$paymentsheet_release().continueButton.setLabel(getString(R.string.stripe_continue_button_label));
        getViewBinding$paymentsheet_release().continueButton.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.paymentsheet.h
            {
                PaymentOptionsActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentOptionsActivity.x(PaymentOptionsActivity.this, view);
            }
        });
    }

    public final void setViewModelFactory$paymentsheet_release(s0.b bVar) {
        kotlin.jvm.internal.s.g(bVar, "<set-?>");
        this.viewModelFactory = bVar;
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public PaymentOptionsViewModel getViewModel() {
        return (PaymentOptionsViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.ui.BaseSheetActivity
    public void setActivityResult(PaymentOptionResult result) {
        kotlin.jvm.internal.s.g(result, "result");
        setResult(result.getResultCode(), new Intent().putExtras(result.toBundle()));
    }
}