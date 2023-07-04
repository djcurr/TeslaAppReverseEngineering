package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class DefaultPrefsRepository$prefs$2 extends kotlin.jvm.internal.u implements h00.a<SharedPreferences> {
    final /* synthetic */ DefaultPrefsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPrefsRepository$prefs$2(DefaultPrefsRepository defaultPrefsRepository) {
        super(0);
        this.this$0 = defaultPrefsRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final SharedPreferences invoke() {
        Context context;
        context = this.this$0.context;
        return context.getSharedPreferences("DefaultPrefsRepository", 0);
    }
}