package com.stripe.android.networking;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", l = {CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 176}, m = "retrieveStripeIntent$payments_core_release")
/* loaded from: classes6.dex */
public final class StripeApiRepository$retrieveStripeIntent$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$retrieveStripeIntent$1(StripeApiRepository stripeApiRepository, zz.d<? super StripeApiRepository$retrieveStripeIntent$1> dVar) {
        super(dVar);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieveStripeIntent$payments_core_release(null, null, null, this);
    }
}