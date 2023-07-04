package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.BankStatuses;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class FpxBankStatusesJsonParser implements ModelJsonParser<BankStatuses> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_PARSED_BANK_STATUS = "parsed_bank_status";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public BankStatuses parse(JSONObject json) {
        s.g(json, "json");
        Map optMap = StripeJsonUtils.INSTANCE.optMap(json, FIELD_PARSED_BANK_STATUS);
        if (optMap == null || optMap.isEmpty()) {
            optMap = null;
        }
        BankStatuses bankStatuses = optMap == null ? null : new BankStatuses(optMap);
        return bankStatuses == null ? new BankStatuses(null, 1, null) : bankStatuses;
    }
}