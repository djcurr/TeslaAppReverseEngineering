package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.g0;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.v;
import wz.s0;

/* loaded from: classes6.dex */
public final class ChallengeFragment extends Fragment {
    public static final String ARG_CRES = "arg_cres";
    public static final Companion Companion = new Companion(null);
    private StripeChallengeFragmentBinding _viewBinding;
    private final vz.k brandZoneView$delegate;
    private final ChallengeActionHandler challengeActionHandler;
    private final vz.k challengeEntryViewFactory$delegate;
    private final vz.k challengeZoneSelectView$delegate;
    private final vz.k challengeZoneTextView$delegate;
    private final vz.k challengeZoneView$delegate;
    private final vz.k challengeZoneWebView$delegate;
    private ChallengeResponseData cresData;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor errorRequestExecutor;
    private final UiType initialUiType;
    private final IntentData intentData;
    private final TransactionTimer transactionTimer;
    private final StripeUiCustomization uiCustomization;
    private final vz.k uiTypeCode$delegate;
    private final vz.k viewModel$delegate;
    private final zz.g workContext;

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
            int[] iArr = new int[UiType.values().length];
            iArr[UiType.Text.ordinal()] = 1;
            iArr[UiType.SingleSelect.ordinal()] = 2;
            iArr[UiType.MultiSelect.ordinal()] = 3;
            iArr[UiType.Html.ordinal()] = 4;
            iArr[UiType.OutOfBand.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment(StripeUiCustomization uiCustomization, TransactionTimer transactionTimer, ErrorRequestExecutor errorRequestExecutor, ErrorReporter errorReporter, ChallengeActionHandler challengeActionHandler, UiType uiType, IntentData intentData, zz.g workContext) {
        super(R.layout.stripe_challenge_fragment);
        vz.k a11;
        vz.k a12;
        vz.k a13;
        vz.k a14;
        vz.k a15;
        vz.k a16;
        vz.k a17;
        s.g(uiCustomization, "uiCustomization");
        s.g(transactionTimer, "transactionTimer");
        s.g(errorRequestExecutor, "errorRequestExecutor");
        s.g(errorReporter, "errorReporter");
        s.g(challengeActionHandler, "challengeActionHandler");
        s.g(intentData, "intentData");
        s.g(workContext, "workContext");
        this.uiCustomization = uiCustomization;
        this.transactionTimer = transactionTimer;
        this.errorRequestExecutor = errorRequestExecutor;
        this.errorReporter = errorReporter;
        this.challengeActionHandler = challengeActionHandler;
        this.initialUiType = uiType;
        this.intentData = intentData;
        this.workContext = workContext;
        a11 = vz.m.a(new ChallengeFragment$uiTypeCode$2(this));
        this.uiTypeCode$delegate = a11;
        this.viewModel$delegate = e0.a(this, m0.b(ChallengeActivityViewModel.class), new ChallengeFragment$special$$inlined$activityViewModels$1(this), new ChallengeFragment$viewModel$2(this));
        a12 = vz.m.a(new ChallengeFragment$challengeEntryViewFactory$2(this));
        this.challengeEntryViewFactory$delegate = a12;
        a13 = vz.m.a(new ChallengeFragment$challengeZoneView$2(this));
        this.challengeZoneView$delegate = a13;
        a14 = vz.m.a(new ChallengeFragment$brandZoneView$2(this));
        this.brandZoneView$delegate = a14;
        a15 = vz.m.a(new ChallengeFragment$challengeZoneTextView$2(this));
        this.challengeZoneTextView$delegate = a15;
        a16 = vz.m.a(new ChallengeFragment$challengeZoneSelectView$2(this));
        this.challengeZoneSelectView$delegate = a16;
        a17 = vz.m.a(new ChallengeFragment$challengeZoneWebView$2(this));
        this.challengeZoneWebView$delegate = a17;
    }

    public static /* synthetic */ void a(ChallengeFragment challengeFragment, ChallengeRequestResult challengeRequestResult) {
        m358onViewCreated$lambda2(challengeFragment, challengeRequestResult);
    }

    public static /* synthetic */ void b(ChallengeFragment challengeFragment, View view) {
        m353configure$lambda3(challengeFragment, view);
    }

    public static /* synthetic */ void c(ChallengeFragment challengeFragment, String str) {
        m356onViewCreated$lambda0(challengeFragment, str);
    }

    private final void configure(ChallengeZoneTextView challengeZoneTextView, ChallengeZoneSelectView challengeZoneSelectView, ChallengeZoneWebView challengeZoneWebView) {
        ChallengeResponseData challengeResponseData = null;
        if (challengeZoneTextView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneTextView);
            ChallengeZoneView challengeZoneView = getChallengeZoneView();
            ChallengeResponseData challengeResponseData2 = this.cresData;
            if (challengeResponseData2 == null) {
                s.x("cresData");
                challengeResponseData2 = null;
            }
            challengeZoneView.setSubmitButton(challengeResponseData2.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SUBMIT));
            ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                s.x("cresData");
            } else {
                challengeResponseData = challengeResponseData3;
            }
            challengeZoneView2.setResendButtonLabel(challengeResponseData.getResendInformationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.RESEND));
        } else if (challengeZoneSelectView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneSelectView);
            ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData4 = this.cresData;
            if (challengeResponseData4 == null) {
                s.x("cresData");
                challengeResponseData4 = null;
            }
            challengeZoneView3.setSubmitButton(challengeResponseData4.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.NEXT));
            ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData5 = this.cresData;
            if (challengeResponseData5 == null) {
                s.x("cresData");
            } else {
                challengeResponseData = challengeResponseData5;
            }
            challengeZoneView4.setResendButtonLabel(challengeResponseData.getResendInformationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.RESEND));
        } else if (challengeZoneWebView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneWebView);
            getChallengeZoneView().setInfoHeaderText(null, null);
            getChallengeZoneView().setInfoText(null, null);
            getChallengeZoneView().setSubmitButton(null, null);
            challengeZoneWebView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.f
                {
                    ChallengeFragment.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeFragment.b(ChallengeFragment.this, view);
                }
            });
            getBrandZoneView().setVisibility(8);
        } else {
            ChallengeResponseData challengeResponseData6 = this.cresData;
            if (challengeResponseData6 == null) {
                s.x("cresData");
                challengeResponseData6 = null;
            }
            if (challengeResponseData6.getUiType() == UiType.OutOfBand) {
                ChallengeZoneView challengeZoneView5 = getChallengeZoneView();
                ChallengeResponseData challengeResponseData7 = this.cresData;
                if (challengeResponseData7 == null) {
                    s.x("cresData");
                } else {
                    challengeResponseData = challengeResponseData7;
                }
                challengeZoneView5.setSubmitButton(challengeResponseData.getOobContinueLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.CONTINUE));
            }
        }
        configureChallengeZoneView();
    }

    /* renamed from: configure$lambda-3 */
    public static final void m353configure$lambda3(ChallengeFragment this$0, View view) {
        s.g(this$0, "this$0");
        this$0.getViewModel$3ds2sdk_release().onSubmitClicked(this$0.getChallengeAction());
    }

    private final void configureChallengeZoneView() {
        ChallengeZoneView challengeZoneView = getChallengeZoneView();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            s.x("cresData");
            challengeResponseData = null;
        }
        challengeZoneView.setInfoHeaderText(challengeResponseData.getChallengeInfoHeader(), this.uiCustomization.getLabelCustomization());
        ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            s.x("cresData");
            challengeResponseData3 = null;
        }
        challengeZoneView2.setInfoText(challengeResponseData3.getChallengeInfoText(), this.uiCustomization.getLabelCustomization());
        ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            s.x("cresData");
            challengeResponseData4 = null;
        }
        challengeZoneView3.setInfoTextIndicator(challengeResponseData4.getShouldShowChallengeInfoTextIndicator() ? R.drawable.stripe_3ds2_ic_indicator : 0);
        ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            s.x("cresData");
        } else {
            challengeResponseData2 = challengeResponseData5;
        }
        challengeZoneView4.setWhitelistingLabel(challengeResponseData2.getWhitelistingInfoText(), this.uiCustomization.getLabelCustomization(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SELECT));
        getChallengeZoneView().setSubmitButtonClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.g
            {
                ChallengeFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFragment.f(ChallengeFragment.this, view);
            }
        });
        getChallengeZoneView().setResendButtonClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.h
            {
                ChallengeFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFragment.g(ChallengeFragment.this, view);
            }
        });
    }

    /* renamed from: configureChallengeZoneView$lambda-7 */
    public static final void m354configureChallengeZoneView$lambda7(ChallengeFragment this$0, View view) {
        s.g(this$0, "this$0");
        this$0.getViewModel$3ds2sdk_release().onSubmitClicked(this$0.getChallengeAction());
    }

    /* renamed from: configureChallengeZoneView$lambda-8 */
    public static final void m355configureChallengeZoneView$lambda8(ChallengeFragment this$0, View view) {
        s.g(this$0, "this$0");
        this$0.getViewModel$3ds2sdk_release().submit(ChallengeAction.Resend.INSTANCE);
    }

    private final void configureInformationZoneView() {
        InformationZoneView informationZoneView = getViewBinding$3ds2sdk_release().caInformationZone;
        s.f(informationZoneView, "viewBinding.caInformationZone");
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            s.x("cresData");
            challengeResponseData = null;
        }
        String whyInfoLabel = challengeResponseData.getWhyInfoLabel();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            s.x("cresData");
            challengeResponseData3 = null;
        }
        informationZoneView.setWhyInfo(whyInfoLabel, challengeResponseData3.getWhyInfoText(), this.uiCustomization.getLabelCustomization());
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            s.x("cresData");
            challengeResponseData4 = null;
        }
        String expandInfoLabel = challengeResponseData4.getExpandInfoLabel();
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            s.x("cresData");
        } else {
            challengeResponseData2 = challengeResponseData5;
        }
        informationZoneView.setExpandInfo(expandInfoLabel, challengeResponseData2.getExpandInfoText(), this.uiCustomization.getLabelCustomization());
        String accentColor = this.uiCustomization.getAccentColor();
        if (accentColor == null) {
            return;
        }
        informationZoneView.setToggleColor$3ds2sdk_release(Color.parseColor(accentColor));
    }

    public static /* synthetic */ void d(ChallengeFragment challengeFragment, b0 b0Var) {
        m357onViewCreated$lambda1(challengeFragment, b0Var);
    }

    public static /* synthetic */ void e(ImageView imageView, Bitmap bitmap) {
        m359updateBrandZoneImages$lambda5$lambda4(imageView, bitmap);
    }

    public static /* synthetic */ void f(ChallengeFragment challengeFragment, View view) {
        m354configureChallengeZoneView$lambda7(challengeFragment, view);
    }

    public static /* synthetic */ void g(ChallengeFragment challengeFragment, View view) {
        m355configureChallengeZoneView$lambda8(challengeFragment, view);
    }

    private final BrandZoneView getBrandZoneView() {
        return (BrandZoneView) this.brandZoneView$delegate.getValue();
    }

    private final ChallengeAction getChallengeAction() {
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData == null) {
            s.x("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        int i11 = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        if (i11 != 4) {
            if (i11 != 5) {
                return new ChallengeAction.NativeForm(getUserEntry$3ds2sdk_release());
            }
            return ChallengeAction.Oob.INSTANCE;
        }
        return new ChallengeAction.HtmlForm(getUserEntry$3ds2sdk_release());
    }

    public final ChallengeEntryViewFactory getChallengeEntryViewFactory() {
        return (ChallengeEntryViewFactory) this.challengeEntryViewFactory$delegate.getValue();
    }

    private final ChallengeZoneView getChallengeZoneView() {
        return (ChallengeZoneView) this.challengeZoneView$delegate.getValue();
    }

    private final String getUiTypeCode() {
        return (String) this.uiTypeCode$delegate.getValue();
    }

    private final void onChallengeRequestResult(ChallengeRequestResult challengeRequestResult) {
        if (challengeRequestResult instanceof ChallengeRequestResult.Success) {
            ChallengeRequestResult.Success success = (ChallengeRequestResult.Success) challengeRequestResult;
            onSuccess(success.getCreqData(), success.getCresData());
        } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
            onError(((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData());
        } else if (challengeRequestResult instanceof ChallengeRequestResult.RuntimeError) {
            onError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).getThrowable());
        } else if (challengeRequestResult instanceof ChallengeRequestResult.Timeout) {
            onTimeout(((ChallengeRequestResult.Timeout) challengeRequestResult).getData());
        }
    }

    private final void onError(ErrorData errorData) {
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.ProtocolError(errorData, this.initialUiType, this.intentData));
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(errorData);
    }

    private final void onSuccess(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
        ChallengeResult failed;
        if (challengeResponseData.isChallengeCompleted()) {
            getViewModel$3ds2sdk_release().stopTimer();
            if (challengeRequestData.getCancelReason() != null) {
                failed = new ChallengeResult.Canceled(getUiTypeCode(), this.initialUiType, this.intentData);
            } else {
                String transStatus = challengeResponseData.getTransStatus();
                if (transStatus == null) {
                    transStatus = "";
                }
                if (s.c("Y", transStatus)) {
                    failed = new ChallengeResult.Succeeded(getUiTypeCode(), this.initialUiType, this.intentData);
                } else {
                    failed = new ChallengeResult.Failed(getUiTypeCode(), this.initialUiType, this.intentData);
                }
            }
            getViewModel$3ds2sdk_release().onFinish(failed);
            return;
        }
        getViewModel$3ds2sdk_release().onNextScreen(challengeResponseData);
    }

    private final void onTimeout(ErrorData errorData) {
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(errorData);
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.Timeout(getUiTypeCode(), this.initialUiType, this.intentData));
    }

    /* renamed from: onViewCreated$lambda-0 */
    public static final void m356onViewCreated$lambda0(ChallengeFragment this$0, String challengeText) {
        s.g(this$0, "this$0");
        ChallengeZoneTextView challengeZoneTextView$3ds2sdk_release = this$0.getChallengeZoneTextView$3ds2sdk_release();
        if (challengeZoneTextView$3ds2sdk_release == null) {
            return;
        }
        s.f(challengeText, "challengeText");
        challengeZoneTextView$3ds2sdk_release.setText(challengeText);
    }

    /* renamed from: onViewCreated$lambda-1 */
    public static final void m357onViewCreated$lambda1(ChallengeFragment this$0, b0 b0Var) {
        s.g(this$0, "this$0");
        this$0.refreshUi();
    }

    /* renamed from: onViewCreated$lambda-2 */
    public static final void m358onViewCreated$lambda2(ChallengeFragment this$0, ChallengeRequestResult challengeRequestResult) {
        s.g(this$0, "this$0");
        if (challengeRequestResult != null) {
            this$0.onChallengeRequestResult(challengeRequestResult);
        }
    }

    private final void updateBrandZoneImages() {
        Map l11;
        BrandZoneView brandZoneView = getViewBinding$3ds2sdk_release().caBrandZone;
        s.f(brandZoneView, "viewBinding.caBrandZone");
        vz.p[] pVarArr = new vz.p[2];
        ImageView issuerImageView$3ds2sdk_release = brandZoneView.getIssuerImageView$3ds2sdk_release();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            s.x("cresData");
            challengeResponseData = null;
        }
        pVarArr[0] = v.a(issuerImageView$3ds2sdk_release, challengeResponseData.getIssuerImage());
        ImageView paymentSystemImageView$3ds2sdk_release = brandZoneView.getPaymentSystemImageView$3ds2sdk_release();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            s.x("cresData");
        } else {
            challengeResponseData2 = challengeResponseData3;
        }
        pVarArr[1] = v.a(paymentSystemImageView$3ds2sdk_release, challengeResponseData2.getPaymentSystemImage());
        l11 = s0.l(pVarArr);
        for (Map.Entry entry : l11.entrySet()) {
            final ImageView imageView = (ImageView) entry.getKey();
            getViewModel$3ds2sdk_release().getImage((ChallengeResponseData.Image) entry.getValue(), getResources().getDisplayMetrics().densityDpi).observe(getViewLifecycleOwner(), new g0() { // from class: com.stripe.android.stripe3ds2.views.i
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    ChallengeFragment.e(imageView, (Bitmap) obj);
                }
            });
        }
    }

    /* renamed from: updateBrandZoneImages$lambda-5$lambda-4 */
    public static final void m359updateBrandZoneImages$lambda5$lambda4(ImageView imageView, Bitmap bitmap) {
        s.g(imageView, "$imageView");
        if (bitmap != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
            return;
        }
        imageView.setVisibility(8);
    }

    public final void clickSubmitButton() {
        getViewModel$3ds2sdk_release().submit(getChallengeAction());
    }

    public final ChallengeZoneSelectView getChallengeZoneSelectView$3ds2sdk_release() {
        return (ChallengeZoneSelectView) this.challengeZoneSelectView$delegate.getValue();
    }

    public final ChallengeZoneTextView getChallengeZoneTextView$3ds2sdk_release() {
        return (ChallengeZoneTextView) this.challengeZoneTextView$delegate.getValue();
    }

    public final ChallengeZoneWebView getChallengeZoneWebView$3ds2sdk_release() {
        return (ChallengeZoneWebView) this.challengeZoneWebView$delegate.getValue();
    }

    public final String getUserEntry$3ds2sdk_release() {
        ChallengeResponseData challengeResponseData = this.cresData;
        String str = null;
        if (challengeResponseData == null) {
            s.x("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        int i11 = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        if (i11 == 1) {
            ChallengeZoneTextView challengeZoneTextView$3ds2sdk_release = getChallengeZoneTextView$3ds2sdk_release();
            if (challengeZoneTextView$3ds2sdk_release != null) {
                str = challengeZoneTextView$3ds2sdk_release.getUserEntry();
            }
        } else if (i11 == 2 || i11 == 3) {
            ChallengeZoneSelectView challengeZoneSelectView$3ds2sdk_release = getChallengeZoneSelectView$3ds2sdk_release();
            if (challengeZoneSelectView$3ds2sdk_release != null) {
                str = challengeZoneSelectView$3ds2sdk_release.getUserEntry();
            }
        } else if (i11 != 4) {
            str = "";
        } else {
            ChallengeZoneWebView challengeZoneWebView$3ds2sdk_release = getChallengeZoneWebView$3ds2sdk_release();
            if (challengeZoneWebView$3ds2sdk_release != null) {
                str = challengeZoneWebView$3ds2sdk_release.getUserEntry();
            }
        }
        return str == null ? "" : str;
    }

    public final StripeChallengeFragmentBinding getViewBinding$3ds2sdk_release() {
        StripeChallengeFragmentBinding stripeChallengeFragmentBinding = this._viewBinding;
        if (stripeChallengeFragmentBinding != null) {
            return stripeChallengeFragmentBinding;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._viewBinding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        s.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        ChallengeResponseData challengeResponseData = arguments == null ? null : (ChallengeResponseData) arguments.getParcelable(ARG_CRES);
        if (challengeResponseData == null) {
            onError(new IllegalArgumentException("Could not start challenge screen. Challenge response data was null."));
            return;
        }
        this.cresData = challengeResponseData;
        this._viewBinding = StripeChallengeFragmentBinding.bind(view);
        getViewModel$3ds2sdk_release().getChallengeText().observe(getViewLifecycleOwner(), new g0() { // from class: com.stripe.android.stripe3ds2.views.k
            {
                ChallengeFragment.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ChallengeFragment.c(ChallengeFragment.this, (String) obj);
            }
        });
        getViewModel$3ds2sdk_release().getRefreshUi().observe(getViewLifecycleOwner(), new g0() { // from class: com.stripe.android.stripe3ds2.views.l
            {
                ChallengeFragment.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ChallengeFragment.d(ChallengeFragment.this, (b0) obj);
            }
        });
        getViewModel$3ds2sdk_release().getChallengeRequestResult().observe(getViewLifecycleOwner(), new g0() { // from class: com.stripe.android.stripe3ds2.views.j
            {
                ChallengeFragment.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ChallengeFragment.a(ChallengeFragment.this, (ChallengeRequestResult) obj);
            }
        });
        updateBrandZoneImages();
        configure(getChallengeZoneTextView$3ds2sdk_release(), getChallengeZoneSelectView$3ds2sdk_release(), getChallengeZoneWebView$3ds2sdk_release());
        configureInformationZoneView();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void refreshUi() {
        /*
            r6 = this;
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData r0 = r6.cresData
            r1 = 0
            java.lang.String r2 = "cresData"
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.s.x(r2)
            r0 = r1
        Lb:
            com.stripe.android.stripe3ds2.transactions.UiType r0 = r0.getUiType()
            com.stripe.android.stripe3ds2.transactions.UiType r3 = com.stripe.android.stripe3ds2.transactions.UiType.Html
            r4 = 1
            r5 = 0
            if (r0 != r3) goto L47
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData r0 = r6.cresData
            if (r0 != 0) goto L1d
            kotlin.jvm.internal.s.x(r2)
            r0 = r1
        L1d:
            java.lang.String r0 = r0.getAcsHtmlRefresh()
            if (r0 == 0) goto L2c
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            r0 = r5
            goto L2d
        L2c:
            r0 = r4
        L2d:
            if (r0 != 0) goto L47
            com.stripe.android.stripe3ds2.views.ChallengeZoneWebView r0 = r6.getChallengeZoneWebView$3ds2sdk_release()
            if (r0 != 0) goto L36
            goto L90
        L36:
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData r3 = r6.cresData
            if (r3 != 0) goto L3e
            kotlin.jvm.internal.s.x(r2)
            goto L3f
        L3e:
            r1 = r3
        L3f:
            java.lang.String r1 = r1.getAcsHtmlRefresh()
            r0.loadHtml(r1)
            goto L90
        L47:
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData r0 = r6.cresData
            if (r0 != 0) goto L4f
            kotlin.jvm.internal.s.x(r2)
            r0 = r1
        L4f:
            com.stripe.android.stripe3ds2.transactions.UiType r0 = r0.getUiType()
            com.stripe.android.stripe3ds2.transactions.UiType r3 = com.stripe.android.stripe3ds2.transactions.UiType.OutOfBand
            if (r0 != r3) goto L90
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData r0 = r6.cresData
            if (r0 != 0) goto L5f
            kotlin.jvm.internal.s.x(r2)
            r0 = r1
        L5f:
            java.lang.String r0 = r0.getChallengeAdditionalInfoText()
            if (r0 == 0) goto L6d
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 == 0) goto L6c
            goto L6d
        L6c:
            r4 = r5
        L6d:
            if (r4 != 0) goto L90
            com.stripe.android.stripe3ds2.views.ChallengeZoneView r0 = r6.getChallengeZoneView()
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData r3 = r6.cresData
            if (r3 != 0) goto L7b
            kotlin.jvm.internal.s.x(r2)
            goto L7c
        L7b:
            r1 = r3
        L7c:
            java.lang.String r1 = r1.getChallengeAdditionalInfoText()
            com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization r2 = r6.uiCustomization
            com.stripe.android.stripe3ds2.init.ui.LabelCustomization r2 = r2.getLabelCustomization()
            r0.setInfoText(r1, r2)
            com.stripe.android.stripe3ds2.views.ChallengeZoneView r0 = r6.getChallengeZoneView()
            r0.setInfoTextIndicator(r5)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeFragment.refreshUi():void");
    }

    private final void onError(Throwable th2) {
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.RuntimeError(th2, this.initialUiType, this.intentData));
    }
}