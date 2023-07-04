package com.stripe.android.payments.bankaccount.domain;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession", f = "AttachFinancialConnectionsSession.kt", l = {43}, m = "forSetupIntent-BWLJW6A")
/* loaded from: classes6.dex */
public final class AttachFinancialConnectionsSession$forSetupIntent$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AttachFinancialConnectionsSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachFinancialConnectionsSession$forSetupIntent$1(AttachFinancialConnectionsSession attachFinancialConnectionsSession, zz.d<? super AttachFinancialConnectionsSession$forSetupIntent$1> dVar) {
        super(dVar);
        this.this$0 = attachFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m276forSetupIntentBWLJW6A = this.this$0.m276forSetupIntentBWLJW6A(null, null, null, this);
        d11 = a00.d.d();
        return m276forSetupIntentBWLJW6A == d11 ? m276forSetupIntentBWLJW6A : q.a(m276forSetupIntentBWLJW6A);
    }
}