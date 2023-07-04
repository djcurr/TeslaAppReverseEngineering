package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.IssuingCardPin;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class IssuingCardPinJsonParser implements ModelJsonParser<IssuingCardPin> {
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public IssuingCardPin parse(JSONObject json) {
        s.g(json, "json");
        String optString = StripeJsonUtils.optString(json, "pin");
        if (optString == null) {
            return null;
        }
        return new IssuingCardPin(optString);
    }
}