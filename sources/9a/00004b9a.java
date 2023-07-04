package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.view.PaymentRelayActivity;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PaymentRelayContract extends f.a<PaymentRelayStarter.Args, PaymentFlowResult.Unvalidated> {
    @Override // f.a
    public Intent createIntent(Context context, PaymentRelayStarter.Args input) {
        s.g(context, "context");
        s.g(input, "input");
        PaymentFlowResult.Unvalidated result = input.toResult();
        if (result == null) {
            result = new PaymentFlowResult.Unvalidated(null, 0, null, false, null, null, null, 127, null);
        }
        Intent putExtras = new Intent(context, PaymentRelayActivity.class).putExtras(result.toBundle());
        s.f(putExtras, "Intent(context, PaymentR…entFlowResult.toBundle())");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public PaymentFlowResult.Unvalidated parseResult(int i11, Intent intent) {
        return PaymentFlowResult.Unvalidated.Companion.fromIntent(intent);
    }
}