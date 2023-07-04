package com.stripe.android;

import com.stripe.android.networking.FraudDetectionData;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class DefaultFraudDetectionDataStore$get$2$1$timestampSupplier$1 extends u implements h00.a<Long> {
    final /* synthetic */ JSONObject $json;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataStore$get$2$1$timestampSupplier$1(JSONObject jSONObject) {
        super(0);
        this.$json = jSONObject;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Long invoke() {
        return Long.valueOf(this.$json.optLong(FraudDetectionData.KEY_TIMESTAMP, -1L));
    }
}