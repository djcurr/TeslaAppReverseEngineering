package com.stripe.android.link.repositories;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConsumerSessionLookup;
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
@f(c = "com.stripe.android.link.repositories.LinkApiRepository$lookupConsumer$2", f = "LinkApiRepository.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LinkApiRepository$lookupConsumer$2 extends l implements p<o0, d<? super q<? extends ConsumerSessionLookup>>, Object> {
    final /* synthetic */ String $authSessionCookie;
    final /* synthetic */ String $email;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$lookupConsumer$2(LinkApiRepository linkApiRepository, String str, String str2, d<? super LinkApiRepository$lookupConsumer$2> dVar) {
        super(2, dVar);
        this.this$0 = linkApiRepository;
        this.$email = str;
        this.$authSessionCookie = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        LinkApiRepository$lookupConsumer$2 linkApiRepository$lookupConsumer$2 = new LinkApiRepository$lookupConsumer$2(this.this$0, this.$email, this.$authSessionCookie, dVar);
        linkApiRepository$lookupConsumer$2.L$0 = obj;
        return linkApiRepository$lookupConsumer$2;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super q<? extends ConsumerSessionLookup>> dVar) {
        return invoke2(o0Var, (d<? super q<ConsumerSessionLookup>>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super q<ConsumerSessionLookup>> dVar) {
        return ((LinkApiRepository$lookupConsumer$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        Logger logger;
        q a11;
        Object j11;
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
                String str = this.$email;
                String str2 = this.$authSessionCookie;
                q.a aVar3 = q.f54772b;
                stripeRepository = linkApiRepository.stripeRepository;
                aVar = linkApiRepository.publishableKeyProvider;
                aVar2 = linkApiRepository.stripeAccountIdProvider;
                ApiRequest.Options options = new ApiRequest.Options((String) aVar.invoke(), (String) aVar2.invoke(), null, 4, null);
                this.label = 1;
                obj = stripeRepository.lookupConsumerSession(str, str2, options, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            b11 = q.b((ConsumerSessionLookup) obj);
        } catch (Throwable th2) {
            q.a aVar4 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        LinkApiRepository linkApiRepository2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            logger = linkApiRepository2.logger;
            logger.error("Error looking up consumer", e11);
            q.a aVar5 = q.f54772b;
            return q.a(q.b(r.a(e11)));
        }
        ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) b11;
        if (consumerSessionLookup == null) {
            a11 = null;
        } else {
            q.a aVar6 = q.f54772b;
            a11 = q.a(q.b(consumerSessionLookup));
        }
        if (a11 == null) {
            q.a aVar7 = q.f54772b;
            j11 = q.b(r.a(new InternalError("Error looking up consumer")));
        } else {
            j11 = a11.j();
        }
        return q.a(j11);
    }
}