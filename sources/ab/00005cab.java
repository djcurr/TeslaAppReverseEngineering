package com.stripe.android.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.r0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.R;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.PaymentAuthWebViewActivityBinding;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;

/* loaded from: classes6.dex */
public final class PaymentAuthWebViewActivity extends androidx.appcompat.app.d {
    public static final int $stable = 8;
    private final vz.k _args$delegate;
    private final vz.k logger$delegate;
    private final vz.k viewBinding$delegate;
    private final vz.k viewModel$delegate;

    public PaymentAuthWebViewActivity() {
        vz.k a11;
        vz.k a12;
        vz.k a13;
        a11 = vz.m.a(new PaymentAuthWebViewActivity$viewBinding$2(this));
        this.viewBinding$delegate = a11;
        a12 = vz.m.a(new PaymentAuthWebViewActivity$_args$2(this));
        this._args$delegate = a12;
        a13 = vz.m.a(new PaymentAuthWebViewActivity$logger$2(this));
        this.logger$delegate = a13;
        this.viewModel$delegate = new r0(kotlin.jvm.internal.m0.b(PaymentAuthWebViewActivityViewModel.class), new PaymentAuthWebViewActivity$special$$inlined$viewModels$2(this), new PaymentAuthWebViewActivity$viewModel$2(this));
    }

    private final void cancelIntentSource() {
        setResult(-1, getViewModel().getCancellationResult$payments_core_release());
        finish();
    }

    private final Intent createResultIntent(PaymentFlowResult.Unvalidated unvalidated) {
        Intent putExtras = new Intent().putExtras(unvalidated.toBundle());
        kotlin.jvm.internal.s.f(putExtras, "Intent().putExtras(paymentFlowResult.toBundle())");
        return putExtras;
    }

    private final void customizeToolbar() {
        getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar()");
        PaymentAuthWebViewActivityViewModel.ToolbarTitleData toolbarTitle$payments_core_release = getViewModel().getToolbarTitle$payments_core_release();
        if (toolbarTitle$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            getViewBinding().toolbar.setTitle(CustomizeUtils.INSTANCE.buildStyledText(this, toolbarTitle$payments_core_release.getText$payments_core_release(), toolbarTitle$payments_core_release.getToolbarCustomization$payments_core_release()));
        }
        String toolbarBackgroundColor$payments_core_release = getViewModel().getToolbarBackgroundColor$payments_core_release();
        if (toolbarBackgroundColor$payments_core_release == null) {
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
        int parseColor = Color.parseColor(toolbarBackgroundColor$payments_core_release);
        getViewBinding().toolbar.setBackgroundColor(parseColor);
        CustomizeUtils.INSTANCE.setStatusBarColor(this, parseColor);
    }

    public final Logger getLogger() {
        return (Logger) this.logger$delegate.getValue();
    }

    private final PaymentAuthWebViewActivityBinding getViewBinding() {
        return (PaymentAuthWebViewActivityBinding) this.viewBinding$delegate.getValue();
    }

    private final PaymentAuthWebViewActivityViewModel getViewModel() {
        return (PaymentAuthWebViewActivityViewModel) this.viewModel$delegate.getValue();
    }

    public final PaymentBrowserAuthContract.Args get_args() {
        return (PaymentBrowserAuthContract.Args) this._args$delegate.getValue();
    }

    public static /* synthetic */ void h(PaymentAuthWebViewActivity paymentAuthWebViewActivity, Boolean bool) {
        m530onCreate$lambda0(paymentAuthWebViewActivity, bool);
    }

    /* renamed from: onCreate$lambda-0 */
    public static final void m530onCreate$lambda0(PaymentAuthWebViewActivity this$0, Boolean shouldHide) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(shouldHide, "shouldHide");
        if (shouldHide.booleanValue()) {
            CircularProgressIndicator circularProgressIndicator = this$0.getViewBinding().progressBar;
            kotlin.jvm.internal.s.f(circularProgressIndicator, "viewBinding.progressBar");
            circularProgressIndicator.setVisibility(8);
        }
    }

    public final void onAuthComplete$payments_core_release(Throwable th2) {
        if (th2 != null) {
            getViewModel().logError();
            setResult(-1, createResultIntent(PaymentFlowResult.Unvalidated.copy$default(getViewModel().getPaymentResult$payments_core_release(), null, 2, StripeException.Companion.create(th2), true, null, null, null, 113, null)));
        } else {
            getViewModel().logComplete();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getViewBinding().webView.canGoBack()) {
            getViewBinding().webView.goBack();
        } else {
            cancelIntentSource();
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean w11;
        super.onCreate(bundle);
        PaymentBrowserAuthContract.Args args = get_args();
        if (args == null) {
            setResult(0);
            finish();
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate()");
        setContentView(getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        customizeToolbar();
        String clientSecret = args.getClientSecret();
        setResult(-1, createResultIntent(getViewModel().getPaymentResult$payments_core_release()));
        w11 = kotlin.text.v.w(clientSecret);
        if (w11) {
            getLogger().debug("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        androidx.lifecycle.f0 f0Var = new androidx.lifecycle.f0(Boolean.FALSE);
        f0Var.observe(this, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.z
            {
                PaymentAuthWebViewActivity.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentAuthWebViewActivity.h(PaymentAuthWebViewActivity.this, (Boolean) obj);
            }
        });
        PaymentAuthWebViewClient paymentAuthWebViewClient = new PaymentAuthWebViewClient(getLogger(), f0Var, clientSecret, args.getReturnUrl(), new PaymentAuthWebViewActivity$onCreate$webViewClient$1(this), new PaymentAuthWebViewActivity$onCreate$webViewClient$2(this));
        getViewBinding().webView.setOnLoadBlank$payments_core_release(new PaymentAuthWebViewActivity$onCreate$2(paymentAuthWebViewClient));
        getViewBinding().webView.setWebViewClient(paymentAuthWebViewClient);
        getViewBinding().webView.setWebChromeClient(new PaymentAuthWebChromeClient(this, getLogger()));
        getViewModel().logStart();
        getViewBinding().webView.loadUrl(args.getUrl(), getViewModel().getExtraHeaders());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        kotlin.jvm.internal.s.g(menu, "menu");
        getLogger().debug("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(R.menu.payment_auth_web_view_menu, menu);
        String buttonText$payments_core_release = getViewModel().getButtonText$payments_core_release();
        if (buttonText$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            menu.findItem(R.id.action_close).setTitle(buttonText$payments_core_release);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        getViewBinding().webViewContainer.removeAllViews();
        getViewBinding().webView.destroy();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.s.g(item, "item");
        getLogger().debug("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (item.getItemId() == R.id.action_close) {
            cancelIntentSource();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}