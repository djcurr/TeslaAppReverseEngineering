package com.stripe.android.core.networking;

import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class StripeClientUserAgentHeaderFactory$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1 extends u implements l<String, String> {
    public static final StripeClientUserAgentHeaderFactory$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1 INSTANCE = new StripeClientUserAgentHeaderFactory$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1();

    StripeClientUserAgentHeaderFactory$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1() {
        super(1);
    }

    @Override // h00.l
    public final String invoke(String name) {
        s.g(name, "name");
        String property = System.getProperty(name);
        return property == null ? "" : property;
    }
}