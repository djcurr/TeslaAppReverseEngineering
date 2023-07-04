package com.stripe.android.view;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.view.AddPaymentMethodActivityStarter;

/* loaded from: classes6.dex */
public final class AddPaymentMethodContract extends f.a<AddPaymentMethodActivityStarter.Args, AddPaymentMethodActivityStarter.Result> {
    @Override // f.a
    public Intent createIntent(Context context, AddPaymentMethodActivityStarter.Args input) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(input, "input");
        Intent putExtra = new Intent(context, AddPaymentMethodActivity.class).putExtra("extra_activity_args", input);
        kotlin.jvm.internal.s.f(putExtra, "Intent(context, AddPayme…tarter.Args.EXTRA, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public AddPaymentMethodActivityStarter.Result parseResult(int i11, Intent intent) {
        return AddPaymentMethodActivityStarter.Result.Companion.fromIntent(intent);
    }
}