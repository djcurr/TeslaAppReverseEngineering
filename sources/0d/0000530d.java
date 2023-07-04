package com.stripe.android.networking;

import com.stripe.android.AlipayAuthenticator;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.AlipayAuthResult;
import com.stripe.android.model.PaymentIntent;
import zz.d;

/* loaded from: classes6.dex */
public interface AlipayRepository {
    Object authenticate(PaymentIntent paymentIntent, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, d<? super AlipayAuthResult> dVar);
}