package com.stripe.android.cards;

import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class DefaultCardAccountRangeRepositoryFactory$createRemoteCardAccountRangeSource$4$1 extends u implements a<String> {
    final /* synthetic */ String $publishableKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCardAccountRangeRepositoryFactory$createRemoteCardAccountRangeSource$4$1(String str) {
        super(0);
        this.$publishableKey = str;
    }

    @Override // h00.a
    public final String invoke() {
        return this.$publishableKey;
    }
}