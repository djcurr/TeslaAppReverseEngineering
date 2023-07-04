package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import h00.a;
import h00.p;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import v20.y0;
import vz.b0;
import vz.r;
import wz.e0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [BodyType] */
@f(c = "com.stripe.android.core.networking.DefaultStripeNetworkClient$executeInternal$2", f = "DefaultStripeNetworkClient.kt", l = {51, 57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DefaultStripeNetworkClient$executeInternal$2<BodyType> extends l implements p<o0, d<? super StripeResponse<BodyType>>, Object> {
    final /* synthetic */ int $remainingRetries;
    final /* synthetic */ a<StripeResponse<BodyType>> $requester;
    final /* synthetic */ Iterable<Integer> $retryResponseCodes;
    int label;
    final /* synthetic */ DefaultStripeNetworkClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient$executeInternal$2(a<StripeResponse<BodyType>> aVar, Iterable<Integer> iterable, int i11, DefaultStripeNetworkClient defaultStripeNetworkClient, d<? super DefaultStripeNetworkClient$executeInternal$2> dVar) {
        super(2, dVar);
        this.$requester = aVar;
        this.$retryResponseCodes = iterable;
        this.$remainingRetries = i11;
        this.this$0 = defaultStripeNetworkClient;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultStripeNetworkClient$executeInternal$2(this.$requester, this.$retryResponseCodes, this.$remainingRetries, this.this$0, dVar);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object obj) {
        return invoke(o0Var, (d) ((d) obj));
    }

    public final Object invoke(o0 o0Var, d<? super StripeResponse<BodyType>> dVar) {
        return ((DefaultStripeNetworkClient$executeInternal$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        boolean T;
        Logger logger;
        RetryDelaySupplier retryDelaySupplier;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            StripeResponse<BodyType> invoke = this.$requester.invoke();
            T = e0.T(this.$retryResponseCodes, b.c(invoke.getCode()));
            if (!T || this.$remainingRetries <= 0) {
                return invoke;
            }
            logger = this.this$0.logger;
            logger.info("Request failed with code " + invoke.getCode() + ". Retrying up to " + this.$remainingRetries + " more time(s).");
            retryDelaySupplier = this.this$0.retryDelaySupplier;
            long delayMillis = retryDelaySupplier.getDelayMillis(3, this.$remainingRetries);
            this.label = 1;
            if (y0.b(delayMillis, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                r.b(obj);
                return (StripeResponse) obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        Iterable<Integer> iterable = this.$retryResponseCodes;
        a<StripeResponse<BodyType>> aVar = this.$requester;
        this.label = 2;
        obj = this.this$0.executeInternal$stripe_core_release(this.$remainingRetries - 1, iterable, aVar, this);
        if (obj == d11) {
            return d11;
        }
        return (StripeResponse) obj;
    }
}