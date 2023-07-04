package com.stripe.android.ui.core.forms.resources;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.ui.core.forms.resources.AsyncResourceRepository", f = "AsyncResourceRepository.kt", l = {48}, m = "waitUntilLoaded")
/* loaded from: classes6.dex */
public final class AsyncResourceRepository$waitUntilLoaded$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncResourceRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncResourceRepository$waitUntilLoaded$1(AsyncResourceRepository asyncResourceRepository, zz.d<? super AsyncResourceRepository$waitUntilLoaded$1> dVar) {
        super(dVar);
        this.this$0 = asyncResourceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitUntilLoaded(this);
    }
}