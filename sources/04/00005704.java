package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.content.Context;
import com.stripe.android.paymentsheet.R;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes6.dex */
public final class ACHText {
    public static final ACHText INSTANCE = new ACHText();

    private ACHText() {
    }

    public final String getContinueMandateText(Context context) {
        String D;
        String D2;
        s.g(context, "context");
        String string = context.getString(R.string.stripe_paymentsheet_ach_continue_mandate);
        s.f(string, "context.getString(\n     …ontinue_mandate\n        )");
        D = v.D(string, "<terms>", "<a href=\"https://stripe.com/ach-payments/authorization\">", false, 4, null);
        D2 = v.D(D, "</terms>", "</a>", false, 4, null);
        return D2;
    }
}