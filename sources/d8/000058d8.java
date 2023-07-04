package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.views.Brand;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: classes6.dex */
public interface TransactionFactory {
    Transaction create(String str, List<? extends X509Certificate> list, PublicKey publicKey, String str2, SdkTransactionId sdkTransactionId, boolean z11, Brand brand);
}