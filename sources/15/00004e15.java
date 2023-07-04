package com.stripe.android.googlepaylauncher;

import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.p;
import kotlin.coroutines.jvm.internal.l;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onGooglePayResult$1", f = "GooglePayLauncherActivity.kt", l = {CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class GooglePayLauncherActivity$onGooglePayResult$1 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ AuthActivityStarterHost $host;
    final /* synthetic */ PaymentMethodCreateParams $params;
    int label;
    final /* synthetic */ GooglePayLauncherActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherActivity$onGooglePayResult$1(GooglePayLauncherActivity googlePayLauncherActivity, AuthActivityStarterHost authActivityStarterHost, PaymentMethodCreateParams paymentMethodCreateParams, zz.d<? super GooglePayLauncherActivity$onGooglePayResult$1> dVar) {
        super(2, dVar);
        this.this$0 = googlePayLauncherActivity;
        this.$host = authActivityStarterHost;
        this.$params = paymentMethodCreateParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new GooglePayLauncherActivity$onGooglePayResult$1(this.this$0, this.$host, this.$params, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((GooglePayLauncherActivity$onGooglePayResult$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        GooglePayLauncherViewModel viewModel;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            viewModel = this.this$0.getViewModel();
            AuthActivityStarterHost authActivityStarterHost = this.$host;
            PaymentMethodCreateParams paymentMethodCreateParams = this.$params;
            this.label = 1;
            if (viewModel.confirmStripeIntent(authActivityStarterHost, paymentMethodCreateParams, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return b0.f54756a;
    }
}