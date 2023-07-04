package com.stripe.android.core.networking;

import java.io.File;
import zz.d;

/* loaded from: classes2.dex */
public interface StripeNetworkClient {
    Object executeRequest(StripeRequest stripeRequest, d<? super StripeResponse<String>> dVar);

    Object executeRequestForFile(StripeRequest stripeRequest, File file, d<? super StripeResponse<File>> dVar);
}