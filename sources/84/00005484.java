package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import androidx.activity.result.d;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import java.util.Set;
import kotlin.jvm.internal.s;
import v20.e1;
import wz.w0;

/* loaded from: classes6.dex */
public final class PaymentLauncherFactory {
    public static final int $stable = 8;
    private final Context context;
    private final d<PaymentLauncherContract.Args> hostActivityLauncher;

    public PaymentLauncherFactory(Context context, d<PaymentLauncherContract.Args> hostActivityLauncher) {
        s.g(context, "context");
        s.g(hostActivityLauncher, "hostActivityLauncher");
        this.context = context;
        this.hostActivityLauncher = hostActivityLauncher;
    }

    public static /* synthetic */ PaymentLauncher create$default(PaymentLauncherFactory paymentLauncherFactory, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return paymentLauncherFactory.create(str, str2);
    }

    public final PaymentLauncher create(String publishableKey, String str) {
        Set c11;
        s.g(publishableKey, "publishableKey");
        c11 = w0.c("PaymentLauncher");
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(this.context, new PaymentLauncherFactory$create$analyticsRequestFactory$1(publishableKey), c11);
        return new StripePaymentLauncher(new PaymentLauncherFactory$create$1(publishableKey), new PaymentLauncherFactory$create$2(str), this.hostActivityLauncher, this.context, false, e1.b(), e1.c(), new StripeApiRepository(this.context, new PaymentLauncherFactory$create$3(publishableKey), null, null, null, null, null, null, null, paymentAnalyticsRequestFactory, null, null, null, null, 15868, null), paymentAnalyticsRequestFactory, c11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentLauncherFactory(androidx.activity.ComponentActivity r4, final com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback r5) {
        /*
            r3 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r5, r0)
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.String r1 = "activity.applicationContext"
            kotlin.jvm.internal.s.f(r0, r1)
            com.stripe.android.payments.paymentlauncher.PaymentLauncherContract r1 = new com.stripe.android.payments.paymentlauncher.PaymentLauncherContract
            r1.<init>()
            com.stripe.android.payments.paymentlauncher.b r2 = new com.stripe.android.payments.paymentlauncher.b
            r2.<init>()
            androidx.activity.result.d r4 = r4.registerForActivityResult(r1, r2)
            java.lang.String r5 = "activity.registerForActi…nPaymentResult,\n        )"
            kotlin.jvm.internal.s.f(r4, r5)
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.PaymentLauncherFactory.<init>(androidx.activity.ComponentActivity, com.stripe.android.payments.paymentlauncher.PaymentLauncher$PaymentResultCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentLauncherFactory(androidx.fragment.app.Fragment r4, final com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback r5) {
        /*
            r3 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r5, r0)
            androidx.fragment.app.h r0 = r4.requireActivity()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "fragment.requireActivity().applicationContext"
            kotlin.jvm.internal.s.f(r0, r1)
            com.stripe.android.payments.paymentlauncher.PaymentLauncherContract r1 = new com.stripe.android.payments.paymentlauncher.PaymentLauncherContract
            r1.<init>()
            com.stripe.android.payments.paymentlauncher.b r2 = new com.stripe.android.payments.paymentlauncher.b
            r2.<init>()
            androidx.activity.result.d r4 = r4.registerForActivityResult(r1, r2)
            java.lang.String r5 = "fragment.registerForActi…onPaymentResult\n        )"
            kotlin.jvm.internal.s.f(r4, r5)
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.PaymentLauncherFactory.<init>(androidx.fragment.app.Fragment, com.stripe.android.payments.paymentlauncher.PaymentLauncher$PaymentResultCallback):void");
    }
}