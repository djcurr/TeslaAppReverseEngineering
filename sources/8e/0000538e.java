package com.stripe.android.payments;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.d;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.browser.BrowserCapabilities;
import com.stripe.android.core.browser.BrowserCapabilitiesSupplier;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import n00.m;

/* loaded from: classes6.dex */
public final class StripeBrowserLauncherViewModel extends p0 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {m0.f(new z(StripeBrowserLauncherViewModel.class, "hasLaunched", "getHasLaunched()Z", 0))};
    public static final Companion Companion = new Companion(null);
    public static final String KEY_HAS_LAUNCHED = "has_launched";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final BrowserCapabilities browserCapabilities;
    private final kotlin.properties.c hasLaunched$delegate;
    private final String intentChooserTitle;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final l0 savedStateHandle;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory extends androidx.lifecycle.a {
        public static final int $stable = 8;
        private final Application application;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Factory(Application application, androidx.savedstate.c owner) {
            super(owner, null);
            s.g(application, "application");
            s.g(owner, "owner");
            this.application = application;
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 handle) {
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(handle, "handle");
            PaymentConfiguration companion = PaymentConfiguration.Companion.getInstance(this.application);
            BrowserCapabilitiesSupplier browserCapabilitiesSupplier = new BrowserCapabilitiesSupplier(this.application);
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(this.application, companion.getPublishableKey(), (Set) null, 4, (DefaultConstructorMarker) null);
            BrowserCapabilities browserCapabilities = browserCapabilitiesSupplier.get();
            String string = this.application.getString(com.stripe.android.R.string.stripe_verify_your_payment);
            s.f(string, "application.getString(R.…ripe_verify_your_payment)");
            return new StripeBrowserLauncherViewModel(defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, browserCapabilities, string, handle);
        }
    }

    public StripeBrowserLauncherViewModel(AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, BrowserCapabilities browserCapabilities, String intentChooserTitle, l0 savedStateHandle) {
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(browserCapabilities, "browserCapabilities");
        s.g(intentChooserTitle, "intentChooserTitle");
        s.g(savedStateHandle, "savedStateHandle");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.browserCapabilities = browserCapabilities;
        this.intentChooserTitle = intentChooserTitle;
        this.savedStateHandle = savedStateHandle;
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.hasLaunched$delegate = new kotlin.properties.b<Boolean>(Boolean.valueOf(savedStateHandle.a(KEY_HAS_LAUNCHED))) { // from class: com.stripe.android.payments.StripeBrowserLauncherViewModel$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(m<?> property, Boolean bool, Boolean bool2) {
                s.g(property, "property");
                bool2.booleanValue();
                bool.booleanValue();
                StripeBrowserLauncherViewModel.access$getSavedStateHandle$p(this).h(StripeBrowserLauncherViewModel.KEY_HAS_LAUNCHED, Boolean.TRUE);
            }
        };
    }

    public static final /* synthetic */ l0 access$getSavedStateHandle$p(StripeBrowserLauncherViewModel stripeBrowserLauncherViewModel) {
        return stripeBrowserLauncherViewModel.savedStateHandle;
    }

    public final Intent createLaunchIntent(PaymentBrowserAuthContract.Args args) {
        s.g(args, "args");
        boolean z11 = this.browserCapabilities == BrowserCapabilities.CustomTabs;
        logCapabilities(z11);
        Uri parse = Uri.parse(args.getUrl());
        if (z11) {
            Integer statusBarColor = args.getStatusBarColor();
            androidx.browser.customtabs.a a11 = statusBarColor == null ? null : new a.C0040a().c(statusBarColor.intValue()).a();
            d.a h11 = new d.a().h(2);
            if (a11 != null) {
                h11.d(a11);
            }
            d b11 = h11.b();
            s.f(b11, "Builder()\n              …\n                .build()");
            b11.f2065a.setData(parse);
            Intent createChooser = Intent.createChooser(b11.f2065a, this.intentChooserTitle);
            s.f(createChooser, "{\n            val custom…e\n            )\n        }");
            return createChooser;
        }
        Intent createChooser2 = Intent.createChooser(new Intent("android.intent.action.VIEW", parse), this.intentChooserTitle);
        s.f(createChooser2, "{\n            // use def…e\n            )\n        }");
        return createChooser2;
    }

    public final boolean getHasLaunched() {
        return ((Boolean) this.hasLaunched$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final Intent getResultIntent(PaymentBrowserAuthContract.Args args) {
        s.g(args, "args");
        Uri parse = Uri.parse(args.getUrl());
        Intent intent = new Intent();
        String clientSecret = args.getClientSecret();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String stripeAccountId = args.getStripeAccountId();
        Intent putExtras = intent.putExtras(new PaymentFlowResult.Unvalidated(clientSecret, 0, null, args.getShouldCancelSource(), lastPathSegment, null, stripeAccountId, 38, null).toBundle());
        s.f(putExtras, "Intent().putExtras(\n    …   ).toBundle()\n        )");
        return putExtras;
    }

    public final void logCapabilities(boolean z11) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        AnalyticsRequestExecutor analyticsRequestExecutor = this.analyticsRequestExecutor;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = this.paymentAnalyticsRequestFactory;
        if (z11) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithCustomTabs;
        } else if (!z11) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithDefaultBrowser;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, 30, null));
    }

    public final void setHasLaunched(boolean z11) {
        this.hasLaunched$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }
}