package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import com.stripe.android.R;

/* loaded from: classes6.dex */
public final class BecsDebitMandateAcceptanceTextFactory {
    public static final int $stable = 8;
    private final Context context;

    public BecsDebitMandateAcceptanceTextFactory(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        this.context = context;
    }

    public final CharSequence create(String companyName) {
        kotlin.jvm.internal.s.g(companyName, "companyName");
        String string = this.context.getString(R.string.becs_mandate_acceptance, companyName);
        kotlin.jvm.internal.s.f(string, "context.getString(\n     …    companyName\n        )");
        if (Build.VERSION.SDK_INT >= 24) {
            Spanned fromHtml = Html.fromHtml(string, 0);
            kotlin.jvm.internal.s.f(fromHtml, "{\n            Html.fromH…ML_MODE_LEGACY)\n        }");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(string);
        kotlin.jvm.internal.s.f(fromHtml2, "{\n            Html.fromH…AcceptanceText)\n        }");
        return fromHtml2;
    }
}