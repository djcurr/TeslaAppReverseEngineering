package com.stripe.android.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.stripe.android.R;
import com.stripe.android.databinding.StripeActivityBinding;

/* loaded from: classes6.dex */
public abstract class StripeActivity extends androidx.appcompat.app.d {
    public static final int $stable = 8;
    private final vz.k alertDisplayer$delegate;
    private boolean isProgressBarVisible;
    private final vz.k progressBar$delegate;
    private final vz.k stripeColorUtils$delegate;
    private final vz.k viewBinding$delegate;
    private final vz.k viewStub$delegate;

    public StripeActivity() {
        vz.k a11;
        vz.k a12;
        vz.k a13;
        vz.k a14;
        vz.k a15;
        a11 = vz.m.a(new StripeActivity$viewBinding$2(this));
        this.viewBinding$delegate = a11;
        a12 = vz.m.a(new StripeActivity$progressBar$2(this));
        this.progressBar$delegate = a12;
        a13 = vz.m.a(new StripeActivity$viewStub$2(this));
        this.viewStub$delegate = a13;
        a14 = vz.m.a(new StripeActivity$alertDisplayer$2(this));
        this.alertDisplayer$delegate = a14;
        a15 = vz.m.a(new StripeActivity$stripeColorUtils$2(this));
        this.stripeColorUtils$delegate = a15;
    }

    private final AlertDisplayer getAlertDisplayer() {
        return (AlertDisplayer) this.alertDisplayer$delegate.getValue();
    }

    private final StripeColorUtils getStripeColorUtils() {
        return (StripeColorUtils) this.stripeColorUtils$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeActivityBinding getViewBinding() {
        return (StripeActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final ProgressBar getProgressBar$payments_core_release() {
        Object value = this.progressBar$delegate.getValue();
        kotlin.jvm.internal.s.f(value, "<get-progressBar>(...)");
        return (ProgressBar) value;
    }

    public final ViewStub getViewStub$payments_core_release() {
        return (ViewStub) this.viewStub$delegate.getValue();
    }

    protected final boolean isProgressBarVisible() {
        return this.isProgressBarVisible;
    }

    protected abstract void onActionSave();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.v(true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        kotlin.jvm.internal.s.g(menu, "menu");
        getMenuInflater().inflate(R.menu.add_payment_method, menu);
        menu.findItem(R.id.action_save).setEnabled(!this.isProgressBarVisible);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.s.g(item, "item");
        if (item.getItemId() == R.id.action_save) {
            onActionSave();
            return true;
        }
        boolean onOptionsItemSelected = super.onOptionsItemSelected(item);
        if (onOptionsItemSelected) {
            return onOptionsItemSelected;
        }
        onBackPressed();
        return onOptionsItemSelected;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        kotlin.jvm.internal.s.g(menu, "menu");
        MenuItem findItem = menu.findItem(R.id.action_save);
        StripeColorUtils stripeColorUtils = getStripeColorUtils();
        Resources.Theme theme = getTheme();
        kotlin.jvm.internal.s.f(theme, "theme");
        findItem.setIcon(stripeColorUtils.getTintedIconWithAttribute(theme, R.attr.titleTextColor, R.drawable.stripe_ic_checkmark));
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onProgressBarVisibilityChanged(boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setProgressBarVisible(boolean z11) {
        getProgressBar$payments_core_release().setVisibility(z11 ? 0 : 8);
        invalidateOptionsMenu();
        onProgressBarVisibilityChanged(z11);
        this.isProgressBarVisible = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showError(String error) {
        kotlin.jvm.internal.s.g(error, "error");
        getAlertDisplayer().show(error);
    }
}