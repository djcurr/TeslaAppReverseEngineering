package com.stripe.android.utils;

import android.net.Uri;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes6.dex */
public final class StripeUrlUtils {
    public static final StripeUrlUtils INSTANCE = new StripeUrlUtils();

    private StripeUrlUtils() {
    }

    public final boolean isStripeUrl$payments_core_release(String url) {
        s.g(url, "url");
        Uri parse = Uri.parse(url);
        if (s.c(parse.getScheme(), "https")) {
            String host = parse.getHost();
            if (!s.c(host, "stripe.com")) {
                if (!(host == null ? false : v.t(host, ".stripe.com", false, 2, null))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}