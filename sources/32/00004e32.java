package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import androidx.lifecycle.f0;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import h00.p;
import kotlin.coroutines.jvm.internal.l;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$onConfirmResult$1", f = "GooglePayLauncherViewModel.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class GooglePayLauncherViewModel$onConfirmResult$1 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ Intent $data;
    final /* synthetic */ int $requestCode;
    int label;
    final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherViewModel$onConfirmResult$1(GooglePayLauncherViewModel googlePayLauncherViewModel, int i11, Intent intent, zz.d<? super GooglePayLauncherViewModel$onConfirmResult$1> dVar) {
        super(2, dVar);
        this.this$0 = googlePayLauncherViewModel;
        this.$requestCode = i11;
        this.$data = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new GooglePayLauncherViewModel$onConfirmResult$1(this.this$0, this.$requestCode, this.$data, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((GooglePayLauncherViewModel$onConfirmResult$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        f0 f0Var;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            GooglePayLauncherViewModel googlePayLauncherViewModel = this.this$0;
            int i12 = this.$requestCode;
            Intent intent = this.$data;
            this.label = 1;
            obj = googlePayLauncherViewModel.getResultFromConfirmation$payments_core_release(i12, intent, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        f0Var = this.this$0._googleResult;
        f0Var.postValue((GooglePayLauncher.Result) obj);
        return b0.f54756a;
    }
}