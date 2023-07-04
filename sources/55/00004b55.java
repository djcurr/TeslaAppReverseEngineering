package com.stripe.android;

import java.util.Calendar;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class FraudDetectionDataRepositoryKt$timestampSupplier$1 extends u implements h00.a<Long> {
    public static final FraudDetectionDataRepositoryKt$timestampSupplier$1 INSTANCE = new FraudDetectionDataRepositoryKt$timestampSupplier$1();

    FraudDetectionDataRepositoryKt$timestampSupplier$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Long invoke() {
        return Long.valueOf(Calendar.getInstance().getTimeInMillis());
    }
}