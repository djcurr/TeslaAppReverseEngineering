package com.stripe.android.link;

import com.stripe.android.link.LinkActivityViewModel;
import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class LinkActivityViewModel$Factory$fallbackInitialize$viewModelComponent$1 extends u implements a<String> {
    final /* synthetic */ LinkActivityViewModel.Factory.FallbackInitializeParam $arg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivityViewModel$Factory$fallbackInitialize$viewModelComponent$1(LinkActivityViewModel.Factory.FallbackInitializeParam fallbackInitializeParam) {
        super(0);
        this.$arg = fallbackInitializeParam;
    }

    @Override // h00.a
    public final String invoke() {
        return this.$arg.getPublishableKey();
    }
}