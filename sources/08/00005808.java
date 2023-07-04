package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.content.SharedPreferences;
import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class DefaultAppInfoRepository$Store$Default$sharedPrefs$2 extends u implements a<SharedPreferences> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository$Store$Default$sharedPrefs$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final SharedPreferences invoke() {
        return this.$context.getSharedPreferences("app_info", 0);
    }
}