package com.stripe.android.view;

import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import vz.q;

@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1$result$1", f = "PaymentFlowViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class PaymentFlowViewModel$validateShippingInformation$1$result$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.q<? extends List<? extends ShippingMethod>>>, Object> {
    final /* synthetic */ PaymentSessionConfig.ShippingInformationValidator $shippingInfoValidator;
    final /* synthetic */ ShippingInformation $shippingInformation;
    final /* synthetic */ PaymentSessionConfig.ShippingMethodsFactory $shippingMethodsFactory;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewModel$validateShippingInformation$1$result$1(PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, ShippingInformation shippingInformation, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, zz.d<? super PaymentFlowViewModel$validateShippingInformation$1$result$1> dVar) {
        super(2, dVar);
        this.$shippingInfoValidator = shippingInformationValidator;
        this.$shippingInformation = shippingInformation;
        this.$shippingMethodsFactory = shippingMethodsFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        PaymentFlowViewModel$validateShippingInformation$1$result$1 paymentFlowViewModel$validateShippingInformation$1$result$1 = new PaymentFlowViewModel$validateShippingInformation$1$result$1(this.$shippingInfoValidator, this.$shippingInformation, this.$shippingMethodsFactory, dVar);
        paymentFlowViewModel$validateShippingInformation$1$result$1.L$0 = obj;
        return paymentFlowViewModel$validateShippingInformation$1$result$1;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(v20.o0 o0Var, zz.d<? super vz.q<? extends List<? extends ShippingMethod>>> dVar) {
        return invoke2(o0Var, (zz.d<? super vz.q<? extends List<ShippingMethod>>>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(v20.o0 o0Var, zz.d<? super vz.q<? extends List<ShippingMethod>>> dVar) {
        return ((PaymentFlowViewModel$validateShippingInformation$1$result$1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b11;
        Object b12;
        a00.d.d();
        if (this.label == 0) {
            vz.r.b(obj);
            v20.o0 o0Var = (v20.o0) this.L$0;
            if (this.$shippingInfoValidator.isValid(this.$shippingInformation)) {
                PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory = this.$shippingMethodsFactory;
                ShippingInformation shippingInformation = this.$shippingInformation;
                try {
                    q.a aVar = vz.q.f54772b;
                    List<ShippingMethod> create = shippingMethodsFactory == null ? null : shippingMethodsFactory.create(shippingInformation);
                    if (create == null) {
                        create = wz.w.i();
                    }
                    b12 = vz.q.b(create);
                } catch (Throwable th2) {
                    q.a aVar2 = vz.q.f54772b;
                    b12 = vz.q.b(vz.r.a(th2));
                }
            } else {
                PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator = this.$shippingInfoValidator;
                ShippingInformation shippingInformation2 = this.$shippingInformation;
                try {
                    q.a aVar3 = vz.q.f54772b;
                    b11 = vz.q.b(shippingInformationValidator.getErrorMessage(shippingInformation2));
                } catch (Throwable th3) {
                    q.a aVar4 = vz.q.f54772b;
                    b11 = vz.q.b(vz.r.a(th3));
                }
                Throwable e11 = vz.q.e(b11);
                if (e11 == null) {
                    e11 = new RuntimeException((String) b11);
                }
                q.a aVar5 = vz.q.f54772b;
                b12 = vz.q.b(vz.r.a(e11));
            }
            return vz.q.a(b12);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}