package com.stripe.android.googlepaylauncher;

import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import h00.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1", f = "GooglePayPaymentMethodLauncherActivity.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ PaymentData $paymentData;
    Object L$0;
    int label;
    final /* synthetic */ GooglePayPaymentMethodLauncherActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, PaymentData paymentData, zz.d<? super GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1> dVar) {
        super(2, dVar);
        this.this$0 = googlePayPaymentMethodLauncherActivity;
        this.$paymentData = paymentData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1(this.this$0, this.$paymentData, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        GooglePayPaymentMethodLauncherViewModel viewModel;
        GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = this.this$0;
            viewModel = googlePayPaymentMethodLauncherActivity2.getViewModel();
            PaymentData paymentData = this.$paymentData;
            s.f(paymentData, "paymentData");
            this.L$0 = googlePayPaymentMethodLauncherActivity2;
            this.label = 1;
            Object createPaymentMethod = viewModel.createPaymentMethod(paymentData, this);
            if (createPaymentMethod == d11) {
                return d11;
            }
            googlePayPaymentMethodLauncherActivity = googlePayPaymentMethodLauncherActivity2;
            obj = createPaymentMethod;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.L$0;
            r.b(obj);
        }
        googlePayPaymentMethodLauncherActivity.finishWithResult((GooglePayPaymentMethodLauncher.Result) obj);
        return b0.f54756a;
    }
}