package com.plaid.link;

import com.plaid.link.configuration.LinkPublicKeyConfiguration;
import com.plaid.link.configuration.LinkTokenConfiguration;
import h00.l;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PlaidKotlinFunctionsKt {
    public static final /* synthetic */ LinkPublicKeyConfiguration linkConfiguration(l initializer) {
        s.g(initializer, "initializer");
        LinkPublicKeyConfiguration.Builder builder = new LinkPublicKeyConfiguration.Builder();
        initializer.invoke(builder);
        return builder.build();
    }

    public static final /* synthetic */ LinkTokenConfiguration linkTokenConfiguration(l initializer) {
        s.g(initializer, "initializer");
        LinkTokenConfiguration.Builder builder = new LinkTokenConfiguration.Builder();
        initializer.invoke(builder);
        return builder.build();
    }
}