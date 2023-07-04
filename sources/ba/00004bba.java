package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class PaymentSessionPrefs$Default$prefs$2 extends u implements h00.a<SharedPreferences> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSessionPrefs$Default$prefs$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final SharedPreferences invoke() {
        return this.$context.getSharedPreferences("PaymentSessionPrefs", 0);
    }
}