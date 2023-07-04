package com.stripe.android.paymentsheet.repositories;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import h00.p;
import java.util.Set;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$detachPaymentMethod$2", f = "CustomerApiRepository.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CustomerApiRepository$detachPaymentMethod$2 extends l implements p<o0, d<? super PaymentMethod>, Object> {
    final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
    final /* synthetic */ String $paymentMethodId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerApiRepository$detachPaymentMethod$2(CustomerApiRepository customerApiRepository, String str, PaymentSheet.CustomerConfiguration customerConfiguration, d<? super CustomerApiRepository$detachPaymentMethod$2> dVar) {
        super(2, dVar);
        this.this$0 = customerApiRepository;
        this.$paymentMethodId = str;
        this.$customerConfig = customerConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        CustomerApiRepository$detachPaymentMethod$2 customerApiRepository$detachPaymentMethod$2 = new CustomerApiRepository$detachPaymentMethod$2(this.this$0, this.$paymentMethodId, this.$customerConfig, dVar);
        customerApiRepository$detachPaymentMethod$2.L$0 = obj;
        return customerApiRepository$detachPaymentMethod$2;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super PaymentMethod> dVar) {
        return ((CustomerApiRepository$detachPaymentMethod$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        Logger logger;
        StripeRepository stripeRepository;
        Provider provider;
        Set<String> set;
        Provider provider2;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                r.b(obj);
                o0 o0Var = (o0) this.L$0;
                CustomerApiRepository customerApiRepository = this.this$0;
                String str = this.$paymentMethodId;
                PaymentSheet.CustomerConfiguration customerConfiguration = this.$customerConfig;
                q.a aVar = q.f54772b;
                stripeRepository = customerApiRepository.stripeRepository;
                provider = customerApiRepository.lazyPaymentConfig;
                String publishableKey = ((PaymentConfiguration) provider.get()).getPublishableKey();
                set = customerApiRepository.productUsageTokens;
                String ephemeralKeySecret = customerConfiguration.getEphemeralKeySecret();
                provider2 = customerApiRepository.lazyPaymentConfig;
                ApiRequest.Options options = new ApiRequest.Options(ephemeralKeySecret, ((PaymentConfiguration) provider2.get()).getStripeAccountId(), null, 4, null);
                this.label = 1;
                obj = stripeRepository.detachPaymentMethod(publishableKey, set, str, options, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            b11 = q.b((PaymentMethod) obj);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        CustomerApiRepository customerApiRepository2 = this.this$0;
        String str2 = this.$paymentMethodId;
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            logger = customerApiRepository2.logger;
            logger.error("Failed to detach payment method " + str2 + CoreConstants.DOT, e11);
        }
        if (q.g(b11)) {
            return null;
        }
        return b11;
    }
}