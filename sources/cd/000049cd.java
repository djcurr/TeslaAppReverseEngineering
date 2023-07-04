package com.reactnativestripesdk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.link.injection.NamedConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.q;

/* loaded from: classes2.dex */
public final class b0 extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final Promise f20255a;

    /* renamed from: b  reason: collision with root package name */
    private GooglePayLauncher f20256b;

    /* renamed from: c  reason: collision with root package name */
    private GooglePayPaymentMethodLauncher f20257c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20258d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20259e;

    /* renamed from: f  reason: collision with root package name */
    private Promise f20260f;

    /* renamed from: g  reason: collision with root package name */
    private Promise f20261g;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b implements GooglePayPaymentMethodLauncher.ReadyCallback, kotlin.jvm.internal.m {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GooglePayPaymentMethodLauncher.ReadyCallback) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.m
        public final vz.g<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.p(1, b0.this, b0.class, "onGooglePayMethodLauncherReady", "onGooglePayMethodLauncherReady(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback
        public final void onReady(boolean z11) {
            b0.this.i(z11);
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class c implements GooglePayPaymentMethodLauncher.ResultCallback, kotlin.jvm.internal.m {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GooglePayPaymentMethodLauncher.ResultCallback) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.m
        public final vz.g<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.p(1, b0.this, b0.class, "onGooglePayResult", "onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ResultCallback
        public final void onResult(GooglePayPaymentMethodLauncher.Result p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            b0.this.m(p02);
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class d implements GooglePayLauncher.ReadyCallback, kotlin.jvm.internal.m {
        d() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GooglePayLauncher.ReadyCallback) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.m
        public final vz.g<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.p(1, b0.this, b0.class, "onGooglePayLauncherReady", "onGooglePayLauncherReady(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncher.ReadyCallback
        public final void onReady(boolean z11) {
            b0.this.h(z11);
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class e implements GooglePayLauncher.ResultCallback, kotlin.jvm.internal.m {
        e() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GooglePayLauncher.ResultCallback) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.m
        public final vz.g<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.p(1, b0.this, b0.class, "onGooglePayResult", "onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncher.ResultCallback
        public final void onResult(GooglePayLauncher.Result p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            b0.this.l(p02);
        }
    }

    static {
        new a(null);
    }

    public b0(Promise initPromise) {
        kotlin.jvm.internal.s.g(initPromise, "initPromise");
        this.f20255a = initPromise;
    }

    private final GooglePayLauncher.BillingAddressConfig f(String str, boolean z11, boolean z12) {
        GooglePayLauncher.BillingAddressConfig.Format format;
        if (kotlin.jvm.internal.s.c(str, "FULL")) {
            format = GooglePayLauncher.BillingAddressConfig.Format.Full;
        } else {
            format = kotlin.jvm.internal.s.c(str, "MIN") ? GooglePayLauncher.BillingAddressConfig.Format.Min : GooglePayLauncher.BillingAddressConfig.Format.Min;
        }
        return new GooglePayLauncher.BillingAddressConfig(z11, format, z12);
    }

    private final GooglePayPaymentMethodLauncher.BillingAddressConfig g(String str, boolean z11, boolean z12) {
        GooglePayPaymentMethodLauncher.BillingAddressConfig.Format format;
        if (kotlin.jvm.internal.s.c(str, "FULL")) {
            format = GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Full;
        } else {
            format = kotlin.jvm.internal.s.c(str, "MIN") ? GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Min : GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Min;
        }
        return new GooglePayPaymentMethodLauncher.BillingAddressConfig(z11, format, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(boolean z11) {
        this.f20259e = true;
        if (this.f20258d) {
            k(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(boolean z11) {
        this.f20258d = true;
        if (this.f20259e) {
            k(z11);
        }
    }

    private final void k(boolean z11) {
        if (z11) {
            this.f20255a.resolve(new WritableNativeMap());
        } else {
            this.f20255a.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Failed.toString(), "Google Pay is not available on this device. You can use isGooglePaySupported to preemptively check for Google Pay support."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(GooglePayLauncher.Result result) {
        Promise promise;
        if (kotlin.jvm.internal.s.c(result, GooglePayLauncher.Result.Completed.INSTANCE)) {
            Promise promise2 = this.f20260f;
            if (promise2 != null) {
                promise2.resolve(new WritableNativeMap());
            }
        } else if (kotlin.jvm.internal.s.c(result, GooglePayLauncher.Result.Canceled.INSTANCE)) {
            Promise promise3 = this.f20260f;
            if (promise3 != null) {
                promise3.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Canceled.toString(), "Google Pay has been canceled"));
            }
        } else if ((result instanceof GooglePayLauncher.Result.Failed) && (promise = this.f20260f) != null) {
            promise.resolve(hr.a.e(com.reactnativestripesdk.utils.e.Failed.toString(), ((GooglePayLauncher.Result.Failed) result).getError()));
        }
        this.f20260f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(GooglePayPaymentMethodLauncher.Result result) {
        Promise promise;
        if (result instanceof GooglePayPaymentMethodLauncher.Result.Completed) {
            Promise promise2 = this.f20261g;
            if (promise2 != null) {
                promise2.resolve(hr.d.d("paymentMethod", hr.d.v(((GooglePayPaymentMethodLauncher.Result.Completed) result).getPaymentMethod())));
            }
        } else if (kotlin.jvm.internal.s.c(result, GooglePayPaymentMethodLauncher.Result.Canceled.INSTANCE)) {
            Promise promise3 = this.f20261g;
            if (promise3 != null) {
                promise3.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Canceled.toString(), "Google Pay has been canceled"));
            }
        } else if ((result instanceof GooglePayPaymentMethodLauncher.Result.Failed) && (promise = this.f20261g) != null) {
            promise.resolve(hr.a.e(com.reactnativestripesdk.utils.e.Failed.toString(), ((GooglePayPaymentMethodLauncher.Result.Failed) result).getError()));
        }
        this.f20261g = null;
    }

    public final void e(String currencyCode, int i11, Promise promise) {
        Object b11;
        kotlin.jvm.internal.s.g(currencyCode, "currencyCode");
        kotlin.jvm.internal.s.g(promise, "promise");
        GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher = this.f20257c;
        if (googlePayPaymentMethodLauncher == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Failed.toString(), "GooglePayPaymentMethodLauncher is not initialized."));
            return;
        }
        try {
            q.a aVar = vz.q.f54772b;
            this.f20261g = promise;
            GooglePayPaymentMethodLauncher.present$default(googlePayPaymentMethodLauncher, currencyCode, i11, null, 4, null);
            b11 = vz.q.b(vz.b0.f54756a);
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        Throwable e11 = vz.q.e(b11);
        if (e11 != null) {
            promise.resolve(hr.a.e(com.reactnativestripesdk.utils.e.Failed.toString(), e11));
        }
    }

    public final void n(String clientSecret, Promise promise) {
        Object b11;
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(promise, "promise");
        GooglePayLauncher googlePayLauncher = this.f20256b;
        if (googlePayLauncher == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Failed.toString(), "GooglePay is not initialized."));
            return;
        }
        try {
            q.a aVar = vz.q.f54772b;
            this.f20260f = promise;
            googlePayLauncher.presentForPaymentIntent(clientSecret);
            b11 = vz.q.b(vz.b0.f54756a);
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        Throwable e11 = vz.q.e(b11);
        if (e11 != null) {
            promise.resolve(hr.a.e(com.reactnativestripesdk.utils.e.Failed.toString(), e11));
        }
    }

    public final void o(String clientSecret, String currencyCode, Promise promise) {
        Object b11;
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(currencyCode, "currencyCode");
        kotlin.jvm.internal.s.g(promise, "promise");
        GooglePayLauncher googlePayLauncher = this.f20256b;
        if (googlePayLauncher == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Failed.toString(), "GooglePay is not initialized."));
            return;
        }
        try {
            q.a aVar = vz.q.f54772b;
            this.f20260f = promise;
            googlePayLauncher.presentForSetupIntent(clientSecret, currencyCode);
            b11 = vz.q.b(vz.b0.f54756a);
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        Throwable e11 = vz.q.e(b11);
        if (e11 != null) {
            promise.resolve(hr.a.e(com.reactnativestripesdk.utils.e.Failed.toString(), e11));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Boolean valueOf = arguments == null ? null : Boolean.valueOf(arguments.getBoolean("testEnv"));
        Bundle arguments2 = getArguments();
        String string = arguments2 == null ? null : arguments2.getString(NamedConstantsKt.MERCHANT_NAME);
        if (string == null) {
            string = "";
        }
        Bundle arguments3 = getArguments();
        String string2 = arguments3 == null ? null : arguments3.getString("countryCode");
        String str = string2 == null ? "" : string2;
        Bundle arguments4 = getArguments();
        boolean z11 = arguments4 == null ? false : arguments4.getBoolean("isEmailRequired");
        Bundle arguments5 = getArguments();
        boolean z12 = arguments5 == null ? false : arguments5.getBoolean("existingPaymentMethodRequired");
        Bundle arguments6 = getArguments();
        Bundle bundle2 = arguments6 != null ? arguments6.getBundle("billingAddressConfig") : null;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        boolean z13 = bundle2.getBoolean("isRequired");
        String string3 = bundle2.getString("format");
        String str2 = string3 != null ? string3 : "";
        boolean z14 = bundle2.getBoolean("isPhoneNumberRequired");
        GooglePayPaymentMethodLauncher.BillingAddressConfig g11 = g(str2, z13, z14);
        Boolean bool = Boolean.TRUE;
        String str3 = string;
        this.f20257c = new GooglePayPaymentMethodLauncher(this, new GooglePayPaymentMethodLauncher.Config(kotlin.jvm.internal.s.c(valueOf, bool) ? GooglePayEnvironment.Test : GooglePayEnvironment.Production, str, string, z11, g11, z12, false, 64, null), new b(), new c());
        this.f20256b = new GooglePayLauncher(this, new GooglePayLauncher.Config(kotlin.jvm.internal.s.c(valueOf, bool) ? GooglePayEnvironment.Test : GooglePayEnvironment.Production, str, str3, z11, f(str2, z13, z14), z12, false, 64, null), new d(), new e());
    }
}