package com.stripe.android.view;

import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1", f = "PaymentFlowViewModel.kt", l = {71, 89}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PaymentFlowViewModel$validateShippingInformation$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<androidx.lifecycle.b0<vz.q<? extends List<? extends ShippingMethod>>>, zz.d<? super vz.b0>, Object> {
    final /* synthetic */ PaymentSessionConfig.ShippingInformationValidator $shippingInfoValidator;
    final /* synthetic */ ShippingInformation $shippingInformation;
    final /* synthetic */ PaymentSessionConfig.ShippingMethodsFactory $shippingMethodsFactory;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentFlowViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewModel$validateShippingInformation$1(PaymentFlowViewModel paymentFlowViewModel, PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, ShippingInformation shippingInformation, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, zz.d<? super PaymentFlowViewModel$validateShippingInformation$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentFlowViewModel;
        this.$shippingInfoValidator = shippingInformationValidator;
        this.$shippingInformation = shippingInformation;
        this.$shippingMethodsFactory = shippingMethodsFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        PaymentFlowViewModel$validateShippingInformation$1 paymentFlowViewModel$validateShippingInformation$1 = new PaymentFlowViewModel$validateShippingInformation$1(this.this$0, this.$shippingInfoValidator, this.$shippingInformation, this.$shippingMethodsFactory, dVar);
        paymentFlowViewModel$validateShippingInformation$1.L$0 = obj;
        return paymentFlowViewModel$validateShippingInformation$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(androidx.lifecycle.b0<vz.q<List<ShippingMethod>>> b0Var, zz.d<? super vz.b0> dVar) {
        return ((PaymentFlowViewModel$validateShippingInformation$1) create(b0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(androidx.lifecycle.b0<vz.q<? extends List<? extends ShippingMethod>>> b0Var, zz.d<? super vz.b0> dVar) {
        return invoke2((androidx.lifecycle.b0<vz.q<List<ShippingMethod>>>) b0Var, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        androidx.lifecycle.b0 b0Var;
        zz.g gVar;
        List<ShippingMethod> i11;
        d11 = a00.d.d();
        int i12 = this.label;
        if (i12 == 0) {
            vz.r.b(obj);
            b0Var = (androidx.lifecycle.b0) this.L$0;
            gVar = this.this$0.workContext;
            PaymentFlowViewModel$validateShippingInformation$1$result$1 paymentFlowViewModel$validateShippingInformation$1$result$1 = new PaymentFlowViewModel$validateShippingInformation$1$result$1(this.$shippingInfoValidator, this.$shippingInformation, this.$shippingMethodsFactory, null);
            this.L$0 = b0Var;
            this.label = 1;
            obj = v20.i.g(gVar, paymentFlowViewModel$validateShippingInformation$1$result$1, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vz.r.b(obj);
            return vz.b0.f54756a;
        } else {
            b0Var = (androidx.lifecycle.b0) this.L$0;
            vz.r.b(obj);
        }
        Object j11 = ((vz.q) obj).j();
        PaymentFlowViewModel paymentFlowViewModel = this.this$0;
        i11 = wz.w.i();
        if (!vz.q.g(j11)) {
            i11 = j11;
        }
        paymentFlowViewModel.setShippingMethods$payments_core_release(i11);
        vz.q a11 = vz.q.a(j11);
        this.L$0 = null;
        this.label = 2;
        if (b0Var.emit(a11, this) == d11) {
            return d11;
        }
        return vz.b0.f54756a;
    }
}