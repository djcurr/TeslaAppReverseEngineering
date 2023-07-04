package com.stripe.android.link.repositories;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import h00.a;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.repositories.LinkApiRepository$deletePaymentDetails$2", f = "LinkApiRepository.kt", l = {268}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LinkApiRepository$deletePaymentDetails$2 extends l implements p<o0, d<? super q<? extends b0>>, Object> {
    final /* synthetic */ String $consumerSessionClientSecret;
    final /* synthetic */ String $paymentDetailsId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$deletePaymentDetails$2(LinkApiRepository linkApiRepository, String str, String str2, d<? super LinkApiRepository$deletePaymentDetails$2> dVar) {
        super(2, dVar);
        this.this$0 = linkApiRepository;
        this.$consumerSessionClientSecret = str;
        this.$paymentDetailsId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        LinkApiRepository$deletePaymentDetails$2 linkApiRepository$deletePaymentDetails$2 = new LinkApiRepository$deletePaymentDetails$2(this.this$0, this.$consumerSessionClientSecret, this.$paymentDetailsId, dVar);
        linkApiRepository$deletePaymentDetails$2.L$0 = obj;
        return linkApiRepository$deletePaymentDetails$2;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super q<? extends b0>> dVar) {
        return invoke2(o0Var, (d<? super q<b0>>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super q<b0>> dVar) {
        return ((LinkApiRepository$deletePaymentDetails$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        Logger logger;
        StripeRepository stripeRepository;
        a aVar;
        a aVar2;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                r.b(obj);
                o0 o0Var = (o0) this.L$0;
                LinkApiRepository linkApiRepository = this.this$0;
                String str = this.$consumerSessionClientSecret;
                String str2 = this.$paymentDetailsId;
                q.a aVar3 = q.f54772b;
                stripeRepository = linkApiRepository.stripeRepository;
                aVar = linkApiRepository.publishableKeyProvider;
                aVar2 = linkApiRepository.stripeAccountIdProvider;
                ApiRequest.Options options = new ApiRequest.Options((String) aVar.invoke(), (String) aVar2.invoke(), null, 4, null);
                this.label = 1;
                if (stripeRepository.deletePaymentDetails(str, str2, options, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            b11 = q.b(b0.f54756a);
        } catch (Throwable th2) {
            q.a aVar4 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        LinkApiRepository linkApiRepository2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            logger = linkApiRepository2.logger;
            logger.error("Error deleting consumer payment method", e11);
            q.a aVar5 = q.f54772b;
            return q.a(q.b(r.a(e11)));
        }
        b0 b0Var = (b0) b11;
        q.a aVar6 = q.f54772b;
        return q.a(q.b(b0.f54756a));
    }
}