package com.stripe.android.networking;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class DefaultFraudDetectionDataRequestFactory implements FraudDetectionDataRequestFactory {
    private final FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory;

    public DefaultFraudDetectionDataRequestFactory(FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory) {
        s.g(fraudDetectionDataRequestParamsFactory, "fraudDetectionDataRequestParamsFactory");
        this.fraudDetectionDataRequestParamsFactory = fraudDetectionDataRequestParamsFactory;
    }

    @Override // com.stripe.android.networking.FraudDetectionDataRequestFactory
    public FraudDetectionDataRequest create(FraudDetectionData fraudDetectionData) {
        Map createParams$payments_core_release = this.fraudDetectionDataRequestParamsFactory.createParams$payments_core_release(fraudDetectionData);
        String guid$payments_core_release = fraudDetectionData == null ? null : fraudDetectionData.getGuid$payments_core_release();
        if (guid$payments_core_release == null) {
            guid$payments_core_release = "";
        }
        return new FraudDetectionDataRequest(createParams$payments_core_release, guid$payments_core_release);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRequestFactory(Context context) {
        this(new FraudDetectionDataRequestParamsFactory(context));
        s.g(context, "context");
    }
}