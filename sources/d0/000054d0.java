package com.stripe.android.paymentsheet;

import v20.o0;
import vz.r;

@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.PaymentMethodsUIKt$PaymentMethodsUI$2", f = "PaymentMethodsUI.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class PaymentMethodsUIKt$PaymentMethodsUI$2 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ o0 $scope;
    final /* synthetic */ q0.h $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsUIKt$PaymentMethodsUI$2(boolean z11, q0.h hVar, o0 o0Var, zz.d<? super PaymentMethodsUIKt$PaymentMethodsUI$2> dVar) {
        super(2, dVar);
        this.$isEnabled = z11;
        this.$state = hVar;
        this.$scope = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new PaymentMethodsUIKt$PaymentMethodsUI$2(this.$isEnabled, this.$state, this.$scope, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((PaymentMethodsUIKt$PaymentMethodsUI$2) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            if (this.$isEnabled) {
                LazyListEnabableKt.reenableScrolling(this.$state, this.$scope);
            } else {
                LazyListEnabableKt.disableScrolling(this.$state, this.$scope);
            }
            return vz.b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}