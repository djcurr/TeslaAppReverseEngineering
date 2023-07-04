package com.stripe.android.cards;

import android.content.Context;
import android.content.SharedPreferences;
import h00.a;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DefaultCardAccountRangeStore$prefs$2 extends u implements a<SharedPreferences> {
    final /* synthetic */ DefaultCardAccountRangeStore this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCardAccountRangeStore$prefs$2(DefaultCardAccountRangeStore defaultCardAccountRangeStore) {
        super(0);
        this.this$0 = defaultCardAccountRangeStore;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final SharedPreferences invoke() {
        Context context;
        context = this.this$0.context;
        return context.getSharedPreferences("InMemoryCardAccountRangeSource.Store", 0);
    }
}