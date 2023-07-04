package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256}, m = "createAccountToken")
/* loaded from: classes2.dex */
public final class StripeKtxKt$createAccountToken$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StripeKtxKt$createAccountToken$1(zz.d<? super StripeKtxKt$createAccountToken$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.createAccountToken(null, null, null, null, this);
    }
}