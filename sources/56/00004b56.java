package com.stripe.android;

import com.stripe.android.networking.FraudDetectionData;

/* loaded from: classes2.dex */
public interface FraudDetectionDataStore {
    Object get(zz.d<? super FraudDetectionData> dVar);

    void save(FraudDetectionData fraudDetectionData);
}