package com.stripe.android.stripe3ds2.transaction;

import java.io.InputStream;
import zz.d;

/* loaded from: classes6.dex */
public interface HttpClient {
    Object doGetRequest(d<? super InputStream> dVar);

    Object doPostRequest(String str, String str2, d<? super HttpResponse> dVar);
}