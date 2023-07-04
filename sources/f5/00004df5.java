package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class DefaultGooglePayRepository$paymentsClient$2 extends u implements h00.a<PaymentsClient> {
    final /* synthetic */ DefaultGooglePayRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultGooglePayRepository$paymentsClient$2(DefaultGooglePayRepository defaultGooglePayRepository) {
        super(0);
        this.this$0 = defaultGooglePayRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentsClient invoke() {
        GooglePayEnvironment googlePayEnvironment;
        Context context;
        Wallet.WalletOptions.Builder builder = new Wallet.WalletOptions.Builder();
        googlePayEnvironment = this.this$0.environment;
        Wallet.WalletOptions build = builder.setEnvironment(googlePayEnvironment.getValue$payments_core_release()).build();
        s.f(build, "Builder()\n            .s…lue)\n            .build()");
        context = this.this$0.context;
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(context, build);
        s.f(paymentsClient, "getPaymentsClient(context, options)");
        return paymentsClient;
    }
}