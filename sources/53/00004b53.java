package com.stripe.android;

import com.stripe.android.networking.FraudDetectionData;

/* loaded from: classes2.dex */
public interface FraudDetectionDataRepository {
    FraudDetectionData getCached();

    Object getLatest(zz.d<? super FraudDetectionData> dVar);

    void refresh();

    void save(FraudDetectionData fraudDetectionData);
}