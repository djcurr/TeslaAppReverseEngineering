package com.stripe.android.link.repositories;

import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.StripeIntent;
import h00.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.repositories.LinkApiRepository$createPaymentDetails$2", f = "LinkApiRepository.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LinkApiRepository$createPaymentDetails$2 extends l implements p<o0, d<? super q<? extends LinkPaymentDetails>>, Object> {
    final /* synthetic */ String $consumerSessionClientSecret;
    final /* synthetic */ Map<String, Object> $extraConfirmationParams;
    final /* synthetic */ ConsumerPaymentDetailsCreateParams $paymentDetails;
    final /* synthetic */ StripeIntent $stripeIntent;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$createPaymentDetails$2(LinkApiRepository linkApiRepository, String str, ConsumerPaymentDetailsCreateParams consumerPaymentDetailsCreateParams, StripeIntent stripeIntent, Map<String, ? extends Object> map, d<? super LinkApiRepository$createPaymentDetails$2> dVar) {
        super(2, dVar);
        this.this$0 = linkApiRepository;
        this.$consumerSessionClientSecret = str;
        this.$paymentDetails = consumerPaymentDetailsCreateParams;
        this.$stripeIntent = stripeIntent;
        this.$extraConfirmationParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        LinkApiRepository$createPaymentDetails$2 linkApiRepository$createPaymentDetails$2 = new LinkApiRepository$createPaymentDetails$2(this.this$0, this.$consumerSessionClientSecret, this.$paymentDetails, this.$stripeIntent, this.$extraConfirmationParams, dVar);
        linkApiRepository$createPaymentDetails$2.L$0 = obj;
        return linkApiRepository$createPaymentDetails$2;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super q<? extends LinkPaymentDetails>> dVar) {
        return invoke2(o0Var, (d<? super q<LinkPaymentDetails>>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super q<LinkPaymentDetails>> dVar) {
        return ((LinkApiRepository$createPaymentDetails$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository$createPaymentDetails$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}