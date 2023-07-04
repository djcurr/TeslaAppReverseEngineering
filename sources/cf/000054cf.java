package com.stripe.android.paymentsheet;

import v20.o0;
import vz.r;

@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.PaymentMethodsUIKt$PaymentMethodsUI$1$1", f = "PaymentMethodsUI.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class PaymentMethodsUIKt$PaymentMethodsUI$1$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ q0.h $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsUIKt$PaymentMethodsUI$1$1(q0.h hVar, int i11, zz.d<? super PaymentMethodsUIKt$PaymentMethodsUI$1$1> dVar) {
        super(2, dVar);
        this.$state = hVar;
        this.$selectedIndex = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new PaymentMethodsUIKt$PaymentMethodsUI$1$1(this.$state, this.$selectedIndex, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((PaymentMethodsUIKt$PaymentMethodsUI$1$1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            q0.h hVar = this.$state;
            int i12 = this.$selectedIndex;
            this.label = 1;
            if (hVar.r(i12, 0, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return vz.b0.f54756a;
    }
}