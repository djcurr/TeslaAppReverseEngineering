package com.stripe.android;

import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.core.networking.StripeResponseKtxKt;
import com.stripe.android.model.parsers.FraudDetectionDataJsonParser;
import com.stripe.android.networking.FraudDetectionData;

/* loaded from: classes2.dex */
public final class FraudDetectionDataRepositoryKt {
    private static final FraudDetectionDataJsonParser fraudDetectionJsonParser;
    private static final h00.a<Long> timestampSupplier;

    static {
        FraudDetectionDataRepositoryKt$timestampSupplier$1 fraudDetectionDataRepositoryKt$timestampSupplier$1 = FraudDetectionDataRepositoryKt$timestampSupplier$1.INSTANCE;
        timestampSupplier = fraudDetectionDataRepositoryKt$timestampSupplier$1;
        fraudDetectionJsonParser = new FraudDetectionDataJsonParser(fraudDetectionDataRepositoryKt$timestampSupplier$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FraudDetectionData fraudDetectionData(StripeResponse<String> stripeResponse) {
        if (!stripeResponse.isOk()) {
            stripeResponse = null;
        }
        if (stripeResponse == null) {
            return null;
        }
        return fraudDetectionJsonParser.parse(StripeResponseKtxKt.responseJson(stripeResponse));
    }
}