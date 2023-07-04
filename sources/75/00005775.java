package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import h00.p;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2$1$1$1", f = "CustomerApiRepository.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CustomerApiRepository$getPaymentMethods$2$1$1$1 extends l implements p<o0, d<? super List<? extends PaymentMethod>>, Object> {
    final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
    final /* synthetic */ PaymentMethod.Type $paymentMethodType;
    int label;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerApiRepository$getPaymentMethods$2$1$1$1(CustomerApiRepository customerApiRepository, PaymentSheet.CustomerConfiguration customerConfiguration, PaymentMethod.Type type, d<? super CustomerApiRepository$getPaymentMethods$2$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = customerApiRepository;
        this.$customerConfig = customerConfiguration;
        this.$paymentMethodType = type;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CustomerApiRepository$getPaymentMethods$2$1$1$1(this.this$0, this.$customerConfig, this.$paymentMethodType, dVar);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super List<? extends PaymentMethod>> dVar) {
        return invoke2(o0Var, (d<? super List<PaymentMethod>>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super List<PaymentMethod>> dVar) {
        return ((CustomerApiRepository$getPaymentMethods$2$1$1$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        StripeRepository stripeRepository;
        Provider provider;
        Set<String> set;
        Provider provider2;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            stripeRepository = this.this$0.stripeRepository;
            ListPaymentMethodsParams listPaymentMethodsParams = new ListPaymentMethodsParams(this.$customerConfig.getId(), this.$paymentMethodType, null, null, null, 28, null);
            provider = this.this$0.lazyPaymentConfig;
            String publishableKey = ((PaymentConfiguration) provider.get()).getPublishableKey();
            set = this.this$0.productUsageTokens;
            String ephemeralKeySecret = this.$customerConfig.getEphemeralKeySecret();
            provider2 = this.this$0.lazyPaymentConfig;
            ApiRequest.Options options = new ApiRequest.Options(ephemeralKeySecret, ((PaymentConfiguration) provider2.get()).getStripeAccountId(), null, 4, null);
            this.label = 1;
            obj = stripeRepository.getPaymentMethods(listPaymentMethodsParams, publishableKey, set, options, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return obj;
    }
}