package com.stripe.android.paymentsheet.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import h00.a;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class DefaultDeviceIdRepository$prefs$2 extends u implements a<SharedPreferences> {
    final /* synthetic */ DefaultDeviceIdRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDeviceIdRepository$prefs$2(DefaultDeviceIdRepository defaultDeviceIdRepository) {
        super(0);
        this.this$0 = defaultDeviceIdRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final SharedPreferences invoke() {
        Context context;
        context = this.this$0.context;
        return context.getSharedPreferences("DefaultDeviceIdRepository", 0);
    }
}