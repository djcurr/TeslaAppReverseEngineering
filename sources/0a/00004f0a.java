package com.stripe.android.link.account;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.account.LinkAccountManager", f = "LinkAccountManager.kt", l = {140}, m = "startVerification-IoAF18A")
/* loaded from: classes6.dex */
public final class LinkAccountManager$startVerification$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$startVerification$1(LinkAccountManager linkAccountManager, zz.d<? super LinkAccountManager$startVerification$1> dVar) {
        super(dVar);
        this.this$0 = linkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m163startVerificationIoAF18A = this.this$0.m163startVerificationIoAF18A(this);
        d11 = a00.d.d();
        return m163startVerificationIoAF18A == d11 ? m163startVerificationIoAF18A : q.a(m163startVerificationIoAF18A);
    }
}