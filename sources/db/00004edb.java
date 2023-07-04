package com.stripe.android.link;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.LinkPaymentLauncher", f = "LinkPaymentLauncher.kt", l = {140}, m = "signInWithUserInput-gIAlu-s")
/* loaded from: classes6.dex */
public final class LinkPaymentLauncher$signInWithUserInput$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkPaymentLauncher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPaymentLauncher$signInWithUserInput$1(LinkPaymentLauncher linkPaymentLauncher, zz.d<? super LinkPaymentLauncher$signInWithUserInput$1> dVar) {
        super(dVar);
        this.this$0 = linkPaymentLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m156signInWithUserInputgIAlus = this.this$0.m156signInWithUserInputgIAlus(null, this);
        d11 = a00.d.d();
        return m156signInWithUserInputgIAlus == d11 ? m156signInWithUserInputgIAlus : q.a(m156signInWithUserInputgIAlus);
    }
}