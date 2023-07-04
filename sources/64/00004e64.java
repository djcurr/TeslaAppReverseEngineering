package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PaymentsClientFactory {
    private final Context context;

    public PaymentsClientFactory(Context context) {
        s.g(context, "context");
        this.context = context;
    }

    public final PaymentsClient create(GooglePayEnvironment environment) {
        s.g(environment, "environment");
        Wallet.WalletOptions build = new Wallet.WalletOptions.Builder().setEnvironment(environment.getValue$payments_core_release()).build();
        s.f(build, "Builder()\n            .s…lue)\n            .build()");
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(this.context, build);
        s.f(paymentsClient, "getPaymentsClient(context, options)");
        return paymentsClient;
    }
}