package com.stripe.android.networking;

import com.stripe.android.core.model.StripeModel;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", l = {1707}, m = "fetchStripeModel")
/* loaded from: classes6.dex */
public final class StripeApiRepository$fetchStripeModel$1<ModelType extends StripeModel> extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$fetchStripeModel$1(StripeApiRepository stripeApiRepository, zz.d<? super StripeApiRepository$fetchStripeModel$1> dVar) {
        super(dVar);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object fetchStripeModel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchStripeModel = this.this$0.fetchStripeModel(null, null, null, this);
        return fetchStripeModel;
    }
}