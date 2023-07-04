package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.i;
import wz.x0;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class CustomerApiRepository implements CustomerRepository {
    private final Provider<PaymentConfiguration> lazyPaymentConfig;
    private final Logger logger;
    private final Set<String> productUsageTokens;
    private final StripeRepository stripeRepository;
    private final g workContext;

    public CustomerApiRepository(StripeRepository stripeRepository, Provider<PaymentConfiguration> lazyPaymentConfig, Logger logger, @IOContext g workContext, Set<String> productUsageTokens) {
        s.g(stripeRepository, "stripeRepository");
        s.g(lazyPaymentConfig, "lazyPaymentConfig");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        this.stripeRepository = stripeRepository;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.logger = logger;
        this.workContext = workContext;
        this.productUsageTokens = productUsageTokens;
    }

    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    public Object detachPaymentMethod(PaymentSheet.CustomerConfiguration customerConfiguration, String str, d<? super PaymentMethod> dVar) {
        return i.g(this.workContext, new CustomerApiRepository$detachPaymentMethod$2(this, str, customerConfiguration, null), dVar);
    }

    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    public Object getPaymentMethods(PaymentSheet.CustomerConfiguration customerConfiguration, List<? extends PaymentMethod.Type> list, d<? super List<PaymentMethod>> dVar) {
        return i.g(this.workContext, new CustomerApiRepository$getPaymentMethods$2(list, this, customerConfiguration, null), dVar);
    }

    public /* synthetic */ CustomerApiRepository(StripeRepository stripeRepository, Provider provider, Logger logger, g gVar, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeRepository, provider, logger, gVar, (i11 & 16) != 0 ? x0.d() : set);
    }
}