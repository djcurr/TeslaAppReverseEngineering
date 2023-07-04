package com.stripe.android.stripe3ds2.transaction;

import java.security.PublicKey;
import zz.d;

/* loaded from: classes6.dex */
public interface AuthenticationRequestParametersFactory {
    Object create(String str, PublicKey publicKey, String str2, SdkTransactionId sdkTransactionId, PublicKey publicKey2, d<? super AuthenticationRequestParameters> dVar);
}