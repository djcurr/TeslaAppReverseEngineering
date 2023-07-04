package com.stripe.android;

import java.util.Map;

/* loaded from: classes2.dex */
public interface AlipayAuthenticator {
    Map<String, String> onAuthenticationRequest(String str);
}