package com.stripe.android.link.account;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.spongycastle.crypto.tls.CipherSuite;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.account.LinkAccountManager", f = "LinkAccountManager.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256}, m = "createPaymentDetails-0E7RQCE")
/* loaded from: classes6.dex */
public final class LinkAccountManager$createPaymentDetails$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$createPaymentDetails$1(LinkAccountManager linkAccountManager, zz.d<? super LinkAccountManager$createPaymentDetails$1> dVar) {
        super(dVar);
        this.this$0 = linkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m159createPaymentDetails0E7RQCE = this.this$0.m159createPaymentDetails0E7RQCE(null, null, this);
        d11 = a00.d.d();
        return m159createPaymentDetails0E7RQCE == d11 ? m159createPaymentDetails0E7RQCE : q.a(m159createPaymentDetails0E7RQCE);
    }
}