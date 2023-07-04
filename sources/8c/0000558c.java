package com.stripe.android.paymentsheet;

import android.app.Activity;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.view.ActivityStarter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentSheetActivityStarter extends ActivityStarter<PaymentSheetActivity, PaymentSheetContract.Args> {
    public static final Companion Companion = new Companion(null);
    public static final int REQUEST_CODE = 6003;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivityStarter(Activity activity) {
        super(activity, PaymentSheetActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (DefaultConstructorMarker) null);
        kotlin.jvm.internal.s.g(activity, "activity");
    }
}