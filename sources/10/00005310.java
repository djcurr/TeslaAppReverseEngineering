package com.stripe.android.networking;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.networking.DefaultAlipayRepository", f = "DefaultAlipayRepository.kt", l = {34}, m = "authenticate")
/* loaded from: classes6.dex */
public final class DefaultAlipayRepository$authenticate$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultAlipayRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAlipayRepository$authenticate$1(DefaultAlipayRepository defaultAlipayRepository, zz.d<? super DefaultAlipayRepository$authenticate$1> dVar) {
        super(dVar);
        this.this$0 = defaultAlipayRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.authenticate(null, null, null, this);
    }
}