package com.stripe.android.googlepaylauncher;

import com.google.android.gms.tasks.Task;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import h00.p;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;

@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2", f = "GooglePayPaymentMethodLauncherActivity.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class GooglePayPaymentMethodLauncherActivity$onCreate$2 extends l implements p<o0, zz.d<? super b0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GooglePayPaymentMethodLauncherActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherActivity$onCreate$2(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, zz.d<? super GooglePayPaymentMethodLauncherActivity$onCreate$2> dVar) {
        super(2, dVar);
        this.this$0 = googlePayPaymentMethodLauncherActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        GooglePayPaymentMethodLauncherActivity$onCreate$2 googlePayPaymentMethodLauncherActivity$onCreate$2 = new GooglePayPaymentMethodLauncherActivity$onCreate$2(this.this$0, dVar);
        googlePayPaymentMethodLauncherActivity$onCreate$2.L$0 = obj;
        return googlePayPaymentMethodLauncherActivity$onCreate$2;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((GooglePayPaymentMethodLauncherActivity$onCreate$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        GooglePayPaymentMethodLauncherViewModel viewModel;
        GooglePayPaymentMethodLauncherViewModel viewModel2;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                r.b(obj);
                o0 o0Var = (o0) this.L$0;
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.this$0;
                q.a aVar = q.f54772b;
                viewModel2 = googlePayPaymentMethodLauncherActivity.getViewModel();
                this.label = 1;
                obj = viewModel2.createLoadPaymentDataTask(this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            b11 = q.b((Task) obj);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 == null) {
            googlePayPaymentMethodLauncherActivity2.launchGooglePay((Task) b11);
            viewModel = googlePayPaymentMethodLauncherActivity2.getViewModel();
            viewModel.setHasLaunched$payments_core_release(true);
        } else {
            googlePayPaymentMethodLauncherActivity2.updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(e11, 1));
        }
        return b0.f54756a;
    }
}