package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.v1;
import androidx.fragment.app.q;
import androidx.lifecycle.g0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.stripe.android.paymentsheet.BottomSheetController;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.PaymentsTheme;
import com.stripe.android.ui.core.PaymentsThemeDefaults;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.PrimaryButtonStyle;
import com.stripe.android.view.KeyboardController;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t1.c0;
import vz.b0;
import x2.r;

/* loaded from: classes6.dex */
public abstract class BaseSheetActivity<ResultType> extends androidx.appcompat.app.d {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_FRAGMENT_CONFIG = "com.stripe.android.paymentsheet.extra_fragment_config";
    public static final String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    public static final double TABLET_WIDTH_RATIO = 0.6d;
    private final vz.k bottomSheetBehavior$delegate;
    private final vz.k bottomSheetController$delegate;
    private final vz.k keyboardController$delegate;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class ToolbarResources {
        private final int description;
        private final int icon;

        public ToolbarResources(int i11, int i12) {
            this.icon = i11;
            this.description = i12;
        }

        public static /* synthetic */ ToolbarResources copy$default(ToolbarResources toolbarResources, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = toolbarResources.icon;
            }
            if ((i13 & 2) != 0) {
                i12 = toolbarResources.description;
            }
            return toolbarResources.copy(i11, i12);
        }

        public final int component1() {
            return this.icon;
        }

        public final int component2() {
            return this.description;
        }

        public final ToolbarResources copy(int i11, int i12) {
            return new ToolbarResources(i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ToolbarResources) {
                ToolbarResources toolbarResources = (ToolbarResources) obj;
                return this.icon == toolbarResources.icon && this.description == toolbarResources.description;
            }
            return false;
        }

        public final int getDescription() {
            return this.description;
        }

        public final int getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return (Integer.hashCode(this.icon) * 31) + Integer.hashCode(this.description);
        }

        public String toString() {
            return "ToolbarResources(icon=" + this.icon + ", description=" + this.description + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public BaseSheetActivity() {
        vz.k a11;
        vz.k a12;
        vz.k a13;
        a11 = vz.m.a(new BaseSheetActivity$bottomSheetBehavior$2(this));
        this.bottomSheetBehavior$delegate = a11;
        a12 = vz.m.a(new BaseSheetActivity$bottomSheetController$2(this));
        this.bottomSheetController$delegate = a12;
        a13 = vz.m.a(new BaseSheetActivity$keyboardController$2(this));
        this.keyboardController$delegate = a13;
    }

    public static /* synthetic */ void getBottomSheetBehavior$paymentsheet_release$annotations() {
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController$delegate.getValue();
    }

    public static /* synthetic */ void h(BaseSheetActivity baseSheetActivity, Boolean bool) {
        m335onCreate$lambda5(baseSheetActivity, bool);
    }

    public static /* synthetic */ void k(BaseSheetActivity baseSheetActivity) {
        m330onCreate$lambda0(baseSheetActivity);
    }

    public static /* synthetic */ void l(BaseSheetActivity baseSheetActivity, Boolean bool) {
        m342setupPrimaryButton$lambda17(baseSheetActivity, bool);
    }

    public static /* synthetic */ void m(BaseSheetActivity baseSheetActivity, Boolean bool) {
        m333onCreate$lambda3(baseSheetActivity, bool);
    }

    public static /* synthetic */ void n(BaseSheetActivity baseSheetActivity, PrimaryButton.State state) {
        m341setupPrimaryButton$lambda16(baseSheetActivity, state);
    }

    public static /* synthetic */ void o(BaseSheetActivity baseSheetActivity, Boolean bool) {
        m337onCreate$lambda7(baseSheetActivity, bool);
    }

    /* renamed from: onCreate$lambda-0 */
    public static final void m330onCreate$lambda0(BaseSheetActivity this$0) {
        s.g(this$0, "this$0");
        this$0.updateToolbarButton(this$0.getSupportFragmentManager().n0() == 0);
    }

    /* renamed from: onCreate$lambda-1 */
    public static final void m331onCreate$lambda1(BaseSheetActivity this$0) {
        s.g(this$0, "this$0");
        this$0.getAppbar().setElevation(this$0.getScrollView().getScrollY() > 0 ? this$0.getResources().getDimension(R.dimen.stripe_paymentsheet_toolbar_elevation) : BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: onCreate$lambda-2 */
    public static final void m332onCreate$lambda2(BaseSheetActivity this$0, Boolean shouldFinish) {
        s.g(this$0, "this$0");
        s.f(shouldFinish, "shouldFinish");
        if (shouldFinish.booleanValue()) {
            this$0.finish();
        }
    }

    /* renamed from: onCreate$lambda-3 */
    public static final void m333onCreate$lambda3(BaseSheetActivity this$0, Boolean isProcessing) {
        s.g(this$0, "this$0");
        s.f(isProcessing, "isProcessing");
        this$0.updateRootViewClickHandling(isProcessing.booleanValue());
        this$0.getToolbar().setEnabled(!isProcessing.booleanValue());
    }

    /* renamed from: onCreate$lambda-4 */
    public static final void m334onCreate$lambda4(BaseSheetActivity this$0, View view) {
        s.g(this$0, "this$0");
        if (this$0.getToolbar().isEnabled()) {
            if (this$0.getSupportFragmentManager().n0() == 0) {
                this$0.getViewModel().onUserCancel();
            } else {
                this$0.onUserBack();
            }
        }
    }

    /* renamed from: onCreate$lambda-5 */
    public static final void m335onCreate$lambda5(BaseSheetActivity this$0, Boolean bool) {
        s.g(this$0, "this$0");
        this$0.getLinkAuthView().setContent(j1.c.c(-985537179, true, new BaseSheetActivity$onCreate$6$1(bool, this$0)));
    }

    /* renamed from: onCreate$lambda-6 */
    public static final void m336onCreate$lambda6(BaseSheetActivity this$0, Boolean it2) {
        s.g(this$0, "this$0");
        ScrollView scrollView = this$0.getScrollView();
        s.f(it2, "it");
        scrollView.setVisibility(it2.booleanValue() ? 0 : 8);
    }

    /* renamed from: onCreate$lambda-7 */
    public static final void m337onCreate$lambda7(BaseSheetActivity this$0, Boolean isLiveMode) {
        s.g(this$0, "this$0");
        TextView testModeIndicator = this$0.getTestModeIndicator();
        s.f(isLiveMode, "isLiveMode");
        testModeIndicator.setVisibility(isLiveMode.booleanValue() ? 8 : 0);
    }

    private final void onUserBack() {
        getKeyboardController().hide();
        onBackPressed();
    }

    public static /* synthetic */ void p(BaseSheetActivity baseSheetActivity) {
        m331onCreate$lambda1(baseSheetActivity);
    }

    public static /* synthetic */ void q(BaseSheetActivity baseSheetActivity, Boolean bool) {
        m332onCreate$lambda2(baseSheetActivity, bool);
    }

    public static /* synthetic */ void r(BaseSheetActivity baseSheetActivity, View view) {
        m334onCreate$lambda4(baseSheetActivity, view);
    }

    public static /* synthetic */ void s(BaseSheetActivity baseSheetActivity, PrimaryButton.UIState uIState) {
        m339setupPrimaryButton$lambda15(baseSheetActivity, uIState);
    }

    private final void setSheetWidthForTablets() {
        int i11;
        int b11;
        if (getResources().getBoolean(R.bool.isTablet)) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = getWindowManager().getCurrentWindowMetrics();
                s.f(currentWindowMetrics, "windowManager.currentWindowMetrics");
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
                s.f(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
                i11 = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                i11 = displayMetrics.widthPixels;
            }
            ViewGroup.LayoutParams layoutParams = getBottomSheet().getLayoutParams();
            s.f(layoutParams, "bottomSheet.layoutParams");
            b11 = j00.c.b(i11 * 0.6d);
            layoutParams.width = b11;
            getBottomSheet().setLayoutParams(layoutParams);
        }
    }

    private final void setupHeader() {
        ComposeView header = getHeader();
        header.setViewCompositionStrategy(v1.b.f3127a);
        header.setContent(j1.c.c(-985534770, true, new BaseSheetActivity$setupHeader$1$1(this)));
    }

    private final void setupNotes() {
        getViewModel().getNotesText$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.ui.e
            {
                BaseSheetActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseSheetActivity.v(BaseSheetActivity.this, (String) obj);
            }
        });
    }

    /* renamed from: setupNotes$lambda-19 */
    public static final void m338setupNotes$lambda19(BaseSheetActivity this$0, String str) {
        s.g(this$0, "this$0");
        boolean z11 = str != null;
        if (str != null) {
            this$0.getNotesView().setContent(j1.c.c(-985540643, true, new BaseSheetActivity$setupNotes$1$1$1(str)));
        }
        this$0.getNotesView().setVisibility(z11 ? 0 : 8);
    }

    private final void setupPrimaryButton() {
        getViewModel().getPrimaryButtonUIState().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.ui.k
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseSheetActivity.s(BaseSheetActivity.this, (PrimaryButton.UIState) obj);
            }
        });
        getViewModel().getPrimaryButtonState().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.ui.j
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseSheetActivity.n(BaseSheetActivity.this, (PrimaryButton.State) obj);
            }
        });
        getViewModel().getCtaEnabled().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.ui.m
            {
                BaseSheetActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseSheetActivity.l(BaseSheetActivity.this, (Boolean) obj);
            }
        });
        PrimaryButton primaryButton = getPrimaryButton();
        PaymentsTheme paymentsTheme = PaymentsTheme.INSTANCE;
        PrimaryButtonStyle primaryButtonStyle = paymentsTheme.getPrimaryButtonStyle();
        PaymentSheet.Configuration config$paymentsheet_release = getViewModel().getConfig$paymentsheet_release();
        ColorStateList primaryButtonColor = config$paymentsheet_release == null ? null : config$paymentsheet_release.getPrimaryButtonColor();
        if (primaryButtonColor == null) {
            PrimaryButtonStyle primaryButtonStyle2 = paymentsTheme.getPrimaryButtonStyle();
            Context baseContext = getBaseContext();
            s.f(baseContext, "baseContext");
            primaryButtonColor = ColorStateList.valueOf(PaymentsThemeKt.getBackgroundColor(primaryButtonStyle2, baseContext));
            s.f(primaryButtonColor, "valueOf(\n               …aseContext)\n            )");
        }
        primaryButton.setAppearanceConfiguration(primaryButtonStyle, primaryButtonColor);
        getBottomSpacer().setVisibility(0);
    }

    /* renamed from: setupPrimaryButton$lambda-15 */
    public static final void m339setupPrimaryButton$lambda15(BaseSheetActivity this$0, final PrimaryButton.UIState uIState) {
        b0 b0Var;
        s.g(this$0, "this$0");
        if (uIState == null) {
            b0Var = null;
        } else {
            this$0.getPrimaryButton().setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.paymentsheet.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseSheetActivity.t(PrimaryButton.UIState.this, view);
                }
            });
            this$0.getPrimaryButton().setLabel(uIState.getLabel());
            this$0.getPrimaryButton().setVisibility(uIState.getVisible() ? 0 : 8);
            this$0.getBottomSpacer().setVisibility(uIState.getVisible() ? 0 : 8);
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            this$0.resetPrimaryButtonState();
        }
    }

    /* renamed from: setupPrimaryButton$lambda-15$lambda-13$lambda-12 */
    public static final void m340setupPrimaryButton$lambda15$lambda13$lambda12(PrimaryButton.UIState uIState, View view) {
        h00.a<b0> onClick = uIState.getOnClick();
        if (onClick == null) {
            return;
        }
        onClick.invoke();
    }

    /* renamed from: setupPrimaryButton$lambda-16 */
    public static final void m341setupPrimaryButton$lambda16(BaseSheetActivity this$0, PrimaryButton.State state) {
        s.g(this$0, "this$0");
        this$0.getPrimaryButton().updateState(state);
    }

    /* renamed from: setupPrimaryButton$lambda-17 */
    public static final void m342setupPrimaryButton$lambda17(BaseSheetActivity this$0, Boolean isEnabled) {
        s.g(this$0, "this$0");
        PrimaryButton primaryButton = this$0.getPrimaryButton();
        s.f(isEnabled, "isEnabled");
        primaryButton.setEnabled(isEnabled.booleanValue());
    }

    public static /* synthetic */ void t(PrimaryButton.UIState uIState, View view) {
        m340setupPrimaryButton$lambda15$lambda13$lambda12(uIState, view);
    }

    public static /* synthetic */ void u(BaseSheetActivity baseSheetActivity, Boolean bool) {
        m336onCreate$lambda6(baseSheetActivity, bool);
    }

    public static /* synthetic */ void updateErrorMessage$default(BaseSheetActivity baseSheetActivity, TextView textView, BaseSheetViewModel.UserErrorMessage userErrorMessage, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateErrorMessage");
        }
        if ((i11 & 2) != 0) {
            userErrorMessage = null;
        }
        baseSheetActivity.updateErrorMessage(textView, userErrorMessage);
    }

    private final void updateRootViewClickHandling(boolean z11) {
        if (!z11) {
            getRootView().setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.paymentsheet.ui.f
                {
                    BaseSheetActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseSheetActivity.w(BaseSheetActivity.this, view);
                }
            });
            return;
        }
        getRootView().setOnClickListener(null);
        getRootView().setClickable(false);
    }

    /* renamed from: updateRootViewClickHandling$lambda-21 */
    public static final void m343updateRootViewClickHandling$lambda21(BaseSheetActivity this$0, View view) {
        s.g(this$0, "this$0");
        this$0.getViewModel().onUserCancel();
    }

    private final void updateToolbarButton(boolean z11) {
        ToolbarResources toolbarResources;
        PaymentSheet.Appearance appearance;
        if (z11) {
            toolbarResources = new ToolbarResources(R.drawable.stripe_paymentsheet_toolbar_close, R.string.stripe_paymentsheet_close);
        } else {
            toolbarResources = new ToolbarResources(R.drawable.stripe_paymentsheet_toolbar_back, R.string.stripe_paymentsheet_back);
        }
        Drawable d11 = h.a.d(this, toolbarResources.getIcon());
        PaymentSheet.Configuration config$paymentsheet_release = getViewModel().getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null && (appearance = config$paymentsheet_release.getAppearance()) != null && d11 != null) {
            Context baseContext = getBaseContext();
            s.f(baseContext, "baseContext");
            d11.setTintList(ColorStateList.valueOf(appearance.getColors(PaymentsThemeKt.isSystemDarkTheme(baseContext)).getAppBarIcon()));
        }
        getToolbar().setNavigationIcon(d11);
        getToolbar().setNavigationContentDescription(getResources().getString(toolbarResources.getDescription()));
    }

    public static /* synthetic */ void v(BaseSheetActivity baseSheetActivity, String str) {
        m338setupNotes$lambda19(baseSheetActivity, str);
    }

    public static /* synthetic */ void w(BaseSheetActivity baseSheetActivity, View view) {
        m343updateRootViewClickHandling$lambda21(baseSheetActivity, view);
    }

    public void clearErrorMessages() {
        updateErrorMessage$default(this, getMessageView(), null, 2, null);
    }

    public final void closeSheet(ResultType resulttype) {
        setActivityResult(resulttype);
        getBottomSheetController().hide();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public abstract AppBarLayout getAppbar();

    public abstract ViewGroup getBottomSheet();

    public final BottomSheetBehavior<ViewGroup> getBottomSheetBehavior$paymentsheet_release() {
        return (BottomSheetBehavior) this.bottomSheetBehavior$delegate.getValue();
    }

    public final BottomSheetController getBottomSheetController() {
        return (BottomSheetController) this.bottomSheetController$delegate.getValue();
    }

    public abstract View getBottomSpacer();

    public abstract ViewGroup getFragmentContainerParent();

    public abstract ComposeView getHeader();

    public abstract ComposeView getLinkAuthView();

    public abstract TextView getMessageView();

    public abstract ComposeView getNotesView();

    public abstract PrimaryButton getPrimaryButton();

    public abstract ViewGroup getRootView();

    public abstract ScrollView getScrollView();

    public abstract TextView getTestModeIndicator();

    public abstract MaterialToolbar getToolbar();

    public abstract BaseSheetViewModel<?> getViewModel();

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().n0() > 0) {
            clearErrorMessages();
            super.onBackPressed();
            return;
        }
        getViewModel().onUserCancel();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getViewModel().registerFromActivity(this);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        getSupportFragmentManager().h(new q.l() { // from class: com.stripe.android.paymentsheet.ui.i
            @Override // androidx.fragment.app.q.l
            public final void a() {
                BaseSheetActivity.k(BaseSheetActivity.this);
            }
        });
        getScrollView().getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.stripe.android.paymentsheet.ui.h
            {
                BaseSheetActivity.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BaseSheetActivity.p(BaseSheetActivity.this);
            }
        });
        getBottomSheetController().setup();
        getBottomSheetController().getShouldFinish$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.ui.c
            {
                BaseSheetActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseSheetActivity.q(BaseSheetActivity.this, (Boolean) obj);
            }
        });
        getViewModel().getProcessing().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.ui.n
            {
                BaseSheetActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseSheetActivity.m(BaseSheetActivity.this, (Boolean) obj);
            }
        });
        setSupportActionBar(getToolbar());
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.y(false);
        }
        getToolbar().setNavigationOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.paymentsheet.ui.a
            {
                BaseSheetActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSheetActivity.r(BaseSheetActivity.this, view);
            }
        });
        updateToolbarButton(getSupportFragmentManager().n0() == 0);
        setupHeader();
        setupPrimaryButton();
        setupNotes();
        getViewModel().getShowLinkVerificationDialog().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.ui.l
            {
                BaseSheetActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseSheetActivity.h(BaseSheetActivity.this, (Boolean) obj);
            }
        });
        getViewModel().getContentVisible$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.ui.d
            {
                BaseSheetActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseSheetActivity.u(BaseSheetActivity.this, (Boolean) obj);
            }
        });
        getBottomSheet().setClickable(true);
        getViewModel().getLiveMode$paymentsheet_release().observe(this, new g0() { // from class: com.stripe.android.paymentsheet.ui.b
            {
                BaseSheetActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseSheetActivity.o(BaseSheetActivity.this, (Boolean) obj);
            }
        });
        Context baseContext = getBaseContext();
        s.f(baseContext, "baseContext");
        boolean isSystemDarkTheme = PaymentsThemeKt.isSystemDarkTheme(baseContext);
        PaymentSheet.Configuration config$paymentsheet_release = getViewModel().getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null) {
            getBottomSheet().setBackgroundColor(c0.j(c0.b(config$paymentsheet_release.getAppearance().getColors(isSystemDarkTheme).getSurface())));
            getToolbar().setBackgroundColor(c0.j(c0.b(config$paymentsheet_release.getAppearance().getColors(isSystemDarkTheme).getSurface())));
        }
        setSheetWidthForTablets();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getViewModel().unregisterFromActivity();
    }

    public abstract void resetPrimaryButtonState();

    public abstract void setActivityResult(ResultType resulttype);

    public final void updateErrorMessage(TextView messageView, BaseSheetViewModel.UserErrorMessage userErrorMessage) {
        PaymentSheet.Appearance appearance;
        s.g(messageView, "messageView");
        String message = userErrorMessage == null ? null : userErrorMessage.getMessage();
        PaymentSheet.Configuration config$paymentsheet_release = getViewModel().getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null && (appearance = config$paymentsheet_release.getAppearance()) != null) {
            messageView.setText(PaymentsThemeKt.m395createTextSpanFromTextStyleqhTmNto(message, this, x2.g.f(appearance.getTypography().getSizeScaleFactor() * r.h(PaymentsThemeDefaults.INSTANCE.getTypography().m407getSmallFontSizeXSAIIZE())), c0.b(appearance.getColors(PaymentsThemeKt.isSystemDarkTheme(this)).getError()), appearance.getTypography().getFontResId()));
        }
        messageView.setVisibility(userErrorMessage != null ? 0 : 8);
    }
}