package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import h00.p;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onActivityResult$1", f = "GooglePayLauncherActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class GooglePayLauncherActivity$onActivityResult$1 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ Intent $data;
    final /* synthetic */ int $requestCode;
    int label;
    final /* synthetic */ GooglePayLauncherActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherActivity$onActivityResult$1(GooglePayLauncherActivity googlePayLauncherActivity, int i11, Intent intent, zz.d<? super GooglePayLauncherActivity$onActivityResult$1> dVar) {
        super(2, dVar);
        this.this$0 = googlePayLauncherActivity;
        this.$requestCode = i11;
        this.$data = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new GooglePayLauncherActivity$onActivityResult$1(this.this$0, this.$requestCode, this.$data, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((GooglePayLauncherActivity$onActivityResult$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GooglePayLauncherViewModel viewModel;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            viewModel = this.this$0.getViewModel();
            int i11 = this.$requestCode;
            Intent intent = this.$data;
            if (intent == null) {
                intent = new Intent();
            }
            viewModel.onConfirmResult(i11, intent);
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}