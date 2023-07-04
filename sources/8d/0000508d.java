package com.stripe.android.link.ui.wallet;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$7$1$1", f = "WalletScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class WalletScreenKt$WalletBody$7$1$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ c1.o0<Boolean> $openDialog$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletScreenKt$WalletBody$7$1$1(c1.o0<Boolean> o0Var, d<? super WalletScreenKt$WalletBody$7$1$1> dVar) {
        super(2, dVar);
        this.$openDialog$delegate = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new WalletScreenKt$WalletBody$7$1$1(this.$openDialog$delegate, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((WalletScreenKt$WalletBody$7$1$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            WalletScreenKt.m250WalletBody$lambda10(this.$openDialog$delegate, true);
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}