package com.stripe.android.cards;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.cards.InMemoryCardAccountRangeSource", f = "InMemoryCardAccountRangeSource.kt", l = {16}, m = "getAccountRange")
/* loaded from: classes2.dex */
public final class InMemoryCardAccountRangeSource$getAccountRange$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InMemoryCardAccountRangeSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMemoryCardAccountRangeSource$getAccountRange$1(InMemoryCardAccountRangeSource inMemoryCardAccountRangeSource, zz.d<? super InMemoryCardAccountRangeSource$getAccountRange$1> dVar) {
        super(dVar);
        this.this$0 = inMemoryCardAccountRangeSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAccountRange(null, this);
    }
}