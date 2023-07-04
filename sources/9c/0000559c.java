package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheet;

/* loaded from: classes6.dex */
public interface PaymentSheetLauncher {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void presentWithPaymentIntent$default(PaymentSheetLauncher paymentSheetLauncher, String str, PaymentSheet.Configuration configuration, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: presentWithPaymentIntent");
            }
            if ((i11 & 2) != 0) {
                configuration = null;
            }
            paymentSheetLauncher.presentWithPaymentIntent(str, configuration);
        }

        public static /* synthetic */ void presentWithSetupIntent$default(PaymentSheetLauncher paymentSheetLauncher, String str, PaymentSheet.Configuration configuration, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: presentWithSetupIntent");
            }
            if ((i11 & 2) != 0) {
                configuration = null;
            }
            paymentSheetLauncher.presentWithSetupIntent(str, configuration);
        }
    }

    void presentWithPaymentIntent(String str, PaymentSheet.Configuration configuration);

    void presentWithSetupIntent(String str, PaymentSheet.Configuration configuration);
}