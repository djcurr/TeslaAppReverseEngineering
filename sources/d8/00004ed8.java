package com.stripe.android.link;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.LinkPaymentLauncher", f = "LinkPaymentLauncher.kt", l = {151}, m = "attachNewCardToAccount-gIAlu-s")
/* loaded from: classes6.dex */
public final class LinkPaymentLauncher$attachNewCardToAccount$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkPaymentLauncher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPaymentLauncher$attachNewCardToAccount$1(LinkPaymentLauncher linkPaymentLauncher, zz.d<? super LinkPaymentLauncher$attachNewCardToAccount$1> dVar) {
        super(dVar);
        this.this$0 = linkPaymentLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m155attachNewCardToAccountgIAlus = this.this$0.m155attachNewCardToAccountgIAlus(null, this);
        d11 = a00.d.d();
        return m155attachNewCardToAccountgIAlus == d11 ? m155attachNewCardToAccountgIAlus : q.a(m155attachNewCardToAccountgIAlus);
    }
}