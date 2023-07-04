package com.stripe.android;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {WalletConstants.ERROR_CODE_USER_CANCELLED}, m = "createFile")
/* loaded from: classes2.dex */
public final class StripeKtxKt$createFile$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StripeKtxKt$createFile$1(zz.d<? super StripeKtxKt$createFile$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.createFile(null, null, null, null, this);
    }
}