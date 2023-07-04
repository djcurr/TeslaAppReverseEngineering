package com.stripe.android.link;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class LinkScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String urlEncode(String str) {
        String encode = URLEncoder.encode(str, StandardCharsets.UTF_8.toString());
        s.f(encode, "encode(this, StandardCharsets.UTF_8.toString())");
        return encode;
    }
}