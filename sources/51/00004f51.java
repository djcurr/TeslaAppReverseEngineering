package com.stripe.android.link.repositories;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.networking.StripeRepository;
import h00.a;
import h00.p;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import wz.w0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.repositories.LinkApiRepository$listPaymentDetails$2", f = "LinkApiRepository.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LinkApiRepository$listPaymentDetails$2 extends l implements p<o0, d<? super q<? extends ConsumerPaymentDetails>>, Object> {
    final /* synthetic */ String $consumerSessionClientSecret;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$listPaymentDetails$2(LinkApiRepository linkApiRepository, String str, d<? super LinkApiRepository$listPaymentDetails$2> dVar) {
        super(2, dVar);
        this.this$0 = linkApiRepository;
        this.$consumerSessionClientSecret = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        LinkApiRepository$listPaymentDetails$2 linkApiRepository$listPaymentDetails$2 = new LinkApiRepository$listPaymentDetails$2(this.this$0, this.$consumerSessionClientSecret, dVar);
        linkApiRepository$listPaymentDetails$2.L$0 = obj;
        return linkApiRepository$listPaymentDetails$2;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super q<? extends ConsumerPaymentDetails>> dVar) {
        return invoke2(o0Var, (d<? super q<ConsumerPaymentDetails>>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super q<ConsumerPaymentDetails>> dVar) {
        return ((LinkApiRepository$listPaymentDetails$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        Logger logger;
        q a11;
        Object j11;
        StripeRepository stripeRepository;
        Set<String> c11;
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
                q.a aVar3 = q.f54772b;
                stripeRepository = linkApiRepository.stripeRepository;
                c11 = w0.c("card");
                aVar = linkApiRepository.publishableKeyProvider;
                aVar2 = linkApiRepository.stripeAccountIdProvider;
                ApiRequest.Options options = new ApiRequest.Options((String) aVar.invoke(), (String) aVar2.invoke(), null, 4, null);
                this.label = 1;
                obj = stripeRepository.listPaymentDetails(str, c11, options, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            b11 = q.b((ConsumerPaymentDetails) obj);
        } catch (Throwable th2) {
            q.a aVar4 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        LinkApiRepository linkApiRepository2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            logger = linkApiRepository2.logger;
            logger.error("Error fetching consumer payment details", e11);
            q.a aVar5 = q.f54772b;
            return q.a(q.b(r.a(e11)));
        }
        ConsumerPaymentDetails consumerPaymentDetails = (ConsumerPaymentDetails) b11;
        if (consumerPaymentDetails == null) {
            a11 = null;
        } else {
            q.a aVar6 = q.f54772b;
            a11 = q.a(q.b(consumerPaymentDetails));
        }
        if (a11 == null) {
            q.a aVar7 = q.f54772b;
            j11 = q.b(r.a(new InternalError("Error fetching consumer payment details")));
        } else {
            j11 = a11.j();
        }
        return q.a(j11);
    }
}