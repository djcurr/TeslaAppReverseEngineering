package com.stripe.android.googlepaylauncher;

import com.google.android.gms.tasks.Task;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import h00.p;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;

@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4", f = "GooglePayLauncherActivity.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class GooglePayLauncherActivity$onCreate$4 extends l implements p<o0, zz.d<? super b0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GooglePayLauncherActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherActivity$onCreate$4(GooglePayLauncherActivity googlePayLauncherActivity, zz.d<? super GooglePayLauncherActivity$onCreate$4> dVar) {
        super(2, dVar);
        this.this$0 = googlePayLauncherActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        GooglePayLauncherActivity$onCreate$4 googlePayLauncherActivity$onCreate$4 = new GooglePayLauncherActivity$onCreate$4(this.this$0, dVar);
        googlePayLauncherActivity$onCreate$4.L$0 = obj;
        return googlePayLauncherActivity$onCreate$4;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((GooglePayLauncherActivity$onCreate$4) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        GooglePayLauncherViewModel viewModel;
        GooglePayLauncherViewModel viewModel2;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                r.b(obj);
                o0 o0Var = (o0) this.L$0;
                GooglePayLauncherActivity googlePayLauncherActivity = this.this$0;
                q.a aVar = q.f54772b;
                viewModel2 = googlePayLauncherActivity.getViewModel();
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
        GooglePayLauncherActivity googlePayLauncherActivity2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 == null) {
            googlePayLauncherActivity2.payWithGoogle((Task) b11);
        } else {
            viewModel = googlePayLauncherActivity2.getViewModel();
            viewModel.updateResult(new GooglePayLauncher.Result.Failed(e11));
        }
        return b0.f54756a;
    }
}