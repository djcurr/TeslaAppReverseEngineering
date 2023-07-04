package com.stripe.android.link;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.LinkPaymentLauncher", f = "LinkPaymentLauncher.kt", l = {120}, m = "setup")
/* loaded from: classes6.dex */
public final class LinkPaymentLauncher$setup$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkPaymentLauncher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPaymentLauncher$setup$1(LinkPaymentLauncher linkPaymentLauncher, zz.d<? super LinkPaymentLauncher$setup$1> dVar) {
        super(dVar);
        this.this$0 = linkPaymentLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setup(null, false, null, this);
    }
}