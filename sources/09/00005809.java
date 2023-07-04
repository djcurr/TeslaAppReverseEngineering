package com.stripe.android.stripe3ds2.init;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository", f = "DefaultAppInfoRepository.kt", l = {61}, m = "get")
/* loaded from: classes6.dex */
public final class DefaultAppInfoRepository$get$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultAppInfoRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository$get$1(DefaultAppInfoRepository defaultAppInfoRepository, zz.d<? super DefaultAppInfoRepository$get$1> dVar) {
        super(dVar);
        this.this$0 = defaultAppInfoRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(this);
    }
}