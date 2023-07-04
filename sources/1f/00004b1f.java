package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.CustomerSessionOperationExecutor", f = "CustomerSessionOperationExecutor.kt", l = {27, 32, 39, 51, 66, 77, 92, 103, 118, 128, 142, 155, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 200}, m = "execute$payments_core_release")
/* loaded from: classes2.dex */
public final class CustomerSessionOperationExecutor$execute$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomerSessionOperationExecutor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSessionOperationExecutor$execute$1(CustomerSessionOperationExecutor customerSessionOperationExecutor, zz.d<? super CustomerSessionOperationExecutor$execute$1> dVar) {
        super(dVar);
        this.this$0 = customerSessionOperationExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute$payments_core_release(null, null, this);
    }
}