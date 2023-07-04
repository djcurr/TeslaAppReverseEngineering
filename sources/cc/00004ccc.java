package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor$executeAsync$1", f = "DefaultAnalyticsRequestExecutor.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DefaultAnalyticsRequestExecutor$executeAsync$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ AnalyticsRequest $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultAnalyticsRequestExecutor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAnalyticsRequestExecutor$executeAsync$1(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, AnalyticsRequest analyticsRequest, d<? super DefaultAnalyticsRequestExecutor$executeAsync$1> dVar) {
        super(2, dVar);
        this.this$0 = defaultAnalyticsRequestExecutor;
        this.$request = analyticsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        DefaultAnalyticsRequestExecutor$executeAsync$1 defaultAnalyticsRequestExecutor$executeAsync$1 = new DefaultAnalyticsRequestExecutor$executeAsync$1(this.this$0, this.$request, dVar);
        defaultAnalyticsRequestExecutor$executeAsync$1.L$0 = obj;
        return defaultAnalyticsRequestExecutor$executeAsync$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((DefaultAnalyticsRequestExecutor$executeAsync$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        Logger logger;
        StripeNetworkClient stripeNetworkClient;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                r.b(obj);
                o0 o0Var = (o0) this.L$0;
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = this.this$0;
                AnalyticsRequest analyticsRequest = this.$request;
                q.a aVar = q.f54772b;
                stripeNetworkClient = defaultAnalyticsRequestExecutor.stripeNetworkClient;
                this.label = 1;
                obj = stripeNetworkClient.executeRequest(analyticsRequest, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            b11 = q.b((StripeResponse) obj);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            logger = defaultAnalyticsRequestExecutor2.logger;
            logger.error("Exception while making analytics request", e11);
        }
        return b0.f54756a;
    }
}