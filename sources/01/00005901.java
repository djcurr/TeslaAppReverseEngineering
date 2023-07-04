package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q;
import androidx.fragment.app.z;
import androidx.lifecycle.g0;
import androidx.lifecycle.r0;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeActivityBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import v20.e1;
import v20.j0;
import vz.v;

/* loaded from: classes6.dex */
public final class ChallengeActivity extends androidx.appcompat.app.d {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final j0 WORK_CONTEXT = e1.b();
    private final vz.k challengeActionHandler$delegate;
    private final vz.k errorReporter$delegate;
    private final vz.k errorRequestExecutor$delegate;
    private final vz.k fragment$delegate;
    private final vz.k fragmentViewBinding$delegate;
    private final vz.k keyboardController$delegate;
    private Dialog progressDialog;
    private final vz.k progressDialogFactory$delegate;
    private final vz.k transactionTimer$delegate;
    private final vz.k viewArgs$delegate;
    private final vz.k viewBinding$delegate;
    private final vz.k viewModel$delegate;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ChallengeActivity() {
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
        a11 = vz.m.a(new ChallengeActivity$transactionTimer$2(this));
        this.transactionTimer$delegate = a11;
        a12 = vz.m.a(new ChallengeActivity$errorReporter$2(this));
        this.errorReporter$delegate = a12;
        a13 = vz.m.a(new ChallengeActivity$fragment$2(this));
        this.fragment$delegate = a13;
        a14 = vz.m.a(new ChallengeActivity$fragmentViewBinding$2(this));
        this.fragmentViewBinding$delegate = a14;
        a15 = vz.m.a(new ChallengeActivity$viewBinding$2(this));
        this.viewBinding$delegate = a15;
        a16 = vz.m.a(new ChallengeActivity$challengeActionHandler$2(this));
        this.challengeActionHandler$delegate = a16;
        a17 = vz.m.a(new ChallengeActivity$errorRequestExecutor$2(this));
        this.errorRequestExecutor$delegate = a17;
        this.viewModel$delegate = new r0(m0.b(ChallengeActivityViewModel.class), new ChallengeActivity$special$$inlined$viewModels$2(this), new ChallengeActivity$viewModel$2(this));
        a18 = vz.m.a(new ChallengeActivity$viewArgs$2(this));
        this.viewArgs$delegate = a18;
        a19 = vz.m.a(new ChallengeActivity$keyboardController$2(this));
        this.keyboardController$delegate = a19;
        a21 = vz.m.a(new ChallengeActivity$progressDialogFactory$2(this));
        this.progressDialogFactory$delegate = a21;
    }

    private final void configureHeaderZone() {
        final ThreeDS2Button customize = new HeaderZoneCustomizer(this).customize(getViewArgs().getUiCustomization$3ds2sdk_release().getToolbarCustomization(), getViewArgs().getUiCustomization$3ds2sdk_release().getButtonCustomization(UiCustomization.ButtonType.CANCEL));
        if (customize == null) {
            return;
        }
        customize.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeActivity.n(customize, this, view);
            }
        });
    }

    /* renamed from: configureHeaderZone$lambda-6 */
    public static final void m348configureHeaderZone$lambda6(ThreeDS2Button threeDS2Button, ChallengeActivity this$0, View view) {
        s.g(this$0, "this$0");
        threeDS2Button.setClickable(false);
        this$0.getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
    }

    private final void dismissDialog() {
        Dialog dialog = this.progressDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.progressDialog = null;
    }

    private final void dismissKeyboard() {
        getKeyboardController().hide();
    }

    public final ChallengeActionHandler getChallengeActionHandler() {
        return (ChallengeActionHandler) this.challengeActionHandler$delegate.getValue();
    }

    public final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter$delegate.getValue();
    }

    public final ErrorRequestExecutor getErrorRequestExecutor() {
        return (ErrorRequestExecutor) this.errorRequestExecutor$delegate.getValue();
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController$delegate.getValue();
    }

    private final ChallengeSubmitDialogFactory getProgressDialogFactory() {
        return (ChallengeSubmitDialogFactory) this.progressDialogFactory$delegate.getValue();
    }

    public final TransactionTimer getTransactionTimer() {
        return (TransactionTimer) this.transactionTimer$delegate.getValue();
    }

    public final ChallengeViewArgs getViewArgs() {
        return (ChallengeViewArgs) this.viewArgs$delegate.getValue();
    }

    public static /* synthetic */ void h(ChallengeActivity challengeActivity, ChallengeAction challengeAction) {
        m349onCreate$lambda1(challengeActivity, challengeAction);
    }

    public static /* synthetic */ void k(ChallengeActivity challengeActivity, l0 l0Var, Boolean bool) {
        m352onCreate$lambda4(challengeActivity, l0Var, bool);
    }

    public static /* synthetic */ void l(ChallengeActivity challengeActivity, l0 l0Var, ChallengeResponseData challengeResponseData) {
        m351onCreate$lambda3(challengeActivity, l0Var, challengeResponseData);
    }

    public static /* synthetic */ void m(ChallengeActivity challengeActivity, ChallengeResult challengeResult) {
        m350onCreate$lambda2(challengeActivity, challengeResult);
    }

    public static /* synthetic */ void n(ThreeDS2Button threeDS2Button, ChallengeActivity challengeActivity, View view) {
        m348configureHeaderZone$lambda6(threeDS2Button, challengeActivity, view);
    }

    /* renamed from: onCreate$lambda-1 */
    public static final void m349onCreate$lambda1(ChallengeActivity this$0, ChallengeAction challengeAction) {
        s.g(this$0, "this$0");
        if (this$0.isFinishing()) {
            return;
        }
        this$0.dismissKeyboard();
        Dialog create = this$0.getProgressDialogFactory().create();
        create.show();
        this$0.progressDialog = create;
        ChallengeActivityViewModel viewModel$3ds2sdk_release = this$0.getViewModel$3ds2sdk_release();
        s.f(challengeAction, "challengeAction");
        viewModel$3ds2sdk_release.submit(challengeAction);
    }

    /* renamed from: onCreate$lambda-2 */
    public static final void m350onCreate$lambda2(ChallengeActivity this$0, ChallengeResult challengeResult) {
        s.g(this$0, "this$0");
        this$0.setResult(-1, new Intent().putExtras(challengeResult.toBundle$3ds2sdk_release()));
        if (this$0.isFinishing()) {
            return;
        }
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* renamed from: onCreate$lambda-3 */
    public static final void m351onCreate$lambda3(ChallengeActivity this$0, l0 uiTypeCode, ChallengeResponseData challengeResponseData) {
        s.g(this$0, "this$0");
        s.g(uiTypeCode, "$uiTypeCode");
        this$0.dismissDialog();
        if (challengeResponseData != null) {
            this$0.startFragment(challengeResponseData);
            UiType uiType = challengeResponseData.getUiType();
            T code = uiType == null ? 0 : uiType.getCode();
            if (code == 0) {
                code = "";
            }
            uiTypeCode.f34916a = code;
        }
    }

    /* renamed from: onCreate$lambda-4 */
    public static final void m352onCreate$lambda4(ChallengeActivity this$0, l0 uiTypeCode, Boolean bool) {
        s.g(this$0, "this$0");
        s.g(uiTypeCode, "$uiTypeCode");
        if (s.c(bool, Boolean.TRUE)) {
            this$0.getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.Timeout((String) uiTypeCode.f34916a, this$0.getViewArgs().getCresData$3ds2sdk_release().getUiType(), this$0.getViewArgs().getIntentData$3ds2sdk_release()));
        }
    }

    private final void startFragment(ChallengeResponseData challengeResponseData) {
        q supportFragmentManager = getSupportFragmentManager();
        s.f(supportFragmentManager, "supportFragmentManager");
        z m11 = supportFragmentManager.m();
        s.f(m11, "beginTransaction()");
        AnimationConstants animationConstants = AnimationConstants.INSTANCE;
        m11.v(animationConstants.getSLIDE_IN(), animationConstants.getSLIDE_OUT(), animationConstants.getSLIDE_IN(), animationConstants.getSLIDE_OUT());
        m11.r(getViewBinding$3ds2sdk_release().fragmentContainer.getId(), ChallengeFragment.class, r3.b.a(v.a(ChallengeFragment.ARG_CRES, challengeResponseData)));
        m11.h();
    }

    public final ChallengeFragment getFragment$3ds2sdk_release() {
        return (ChallengeFragment) this.fragment$delegate.getValue();
    }

    public final StripeChallengeFragmentBinding getFragmentViewBinding$3ds2sdk_release() {
        return (StripeChallengeFragmentBinding) this.fragmentViewBinding$delegate.getValue();
    }

    public final StripeChallengeActivityBinding getViewBinding$3ds2sdk_release() {
        return (StripeChallengeActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        getSupportFragmentManager().j1(new ChallengeFragmentFactory(getViewArgs().getUiCustomization$3ds2sdk_release(), getTransactionTimer(), getErrorRequestExecutor(), getErrorReporter(), getChallengeActionHandler(), getViewArgs().getCresData$3ds2sdk_release().getUiType(), getViewArgs().getIntentData$3ds2sdk_release(), WORK_CONTEXT));
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(new androidx.activity.e() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(true);
            }

            @Override // androidx.activity.e
            public void handleOnBackPressed() {
                ChallengeActivity.this.getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
            }
        });
        getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
        setContentView(getViewBinding$3ds2sdk_release().getRoot());
        getViewModel$3ds2sdk_release().getSubmitClicked().observe(this, new g0() { // from class: com.stripe.android.stripe3ds2.views.b
            {
                ChallengeActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ChallengeActivity.h(ChallengeActivity.this, (ChallengeAction) obj);
            }
        });
        getViewModel$3ds2sdk_release().getShouldFinish().observe(this, new g0() { // from class: com.stripe.android.stripe3ds2.views.c
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ChallengeActivity.m(ChallengeActivity.this, (ChallengeResult) obj);
            }
        });
        configureHeaderZone();
        final l0 l0Var = new l0();
        l0Var.f34916a = "";
        getViewModel$3ds2sdk_release().getNextScreen().observe(this, new g0() { // from class: com.stripe.android.stripe3ds2.views.d
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ChallengeActivity.l(ChallengeActivity.this, l0Var, (ChallengeResponseData) obj);
            }
        });
        if (bundle == null) {
            getViewModel$3ds2sdk_release().onNextScreen(getViewArgs().getCresData$3ds2sdk_release());
        }
        getViewModel$3ds2sdk_release().getTimeout().observe(this, new g0() { // from class: com.stripe.android.stripe3ds2.views.e
            {
                ChallengeActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ChallengeActivity.k(ChallengeActivity.this, l0Var, (Boolean) obj);
            }
        });
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dismissDialog();
    }

    @Override // androidx.fragment.app.h, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        getViewModel$3ds2sdk_release().setShouldRefreshUi(true);
        dismissKeyboard();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getViewModel$3ds2sdk_release().getShouldRefreshUi()) {
            getViewModel$3ds2sdk_release().onRefreshUi();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }
}