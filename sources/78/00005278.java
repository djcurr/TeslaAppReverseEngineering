package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AccountRangeJsonParser implements ModelJsonParser<AccountRange> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String FIELD_ACCOUNT_RANGE_HIGH = "account_range_high";
    @Deprecated
    public static final String FIELD_ACCOUNT_RANGE_LOW = "account_range_low";
    @Deprecated
    public static final String FIELD_BRAND = "brand";
    @Deprecated
    public static final String FIELD_COUNTRY = "country";
    @Deprecated
    public static final String FIELD_PAN_LENGTH = "pan_length";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final JSONObject serialize(AccountRange accountRange) {
        s.g(accountRange, "accountRange");
        JSONObject put = new JSONObject().put(FIELD_ACCOUNT_RANGE_LOW, accountRange.getBinRange().getLow()).put(FIELD_ACCOUNT_RANGE_HIGH, accountRange.getBinRange().getHigh()).put(FIELD_PAN_LENGTH, accountRange.getPanLength()).put(FIELD_BRAND, accountRange.getBrandInfo().getBrandName()).put("country", accountRange.getCountry());
        s.f(put, "JSONObject()\n           …RY, accountRange.country)");
        return put;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public AccountRange parse(JSONObject json) {
        AccountRange.BrandInfo brandInfo;
        s.g(json, "json");
        String optString = StripeJsonUtils.optString(json, FIELD_ACCOUNT_RANGE_HIGH);
        String optString2 = StripeJsonUtils.optString(json, FIELD_ACCOUNT_RANGE_LOW);
        Integer optInteger = StripeJsonUtils.INSTANCE.optInteger(json, FIELD_PAN_LENGTH);
        String optString3 = StripeJsonUtils.optString(json, FIELD_BRAND);
        AccountRange.BrandInfo[] values = AccountRange.BrandInfo.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                brandInfo = null;
                break;
            }
            brandInfo = values[i11];
            if (s.c(brandInfo.getBrandName(), optString3)) {
                break;
            }
            i11++;
        }
        if (optString == null || optString2 == null || optInteger == null || brandInfo == null) {
            return null;
        }
        return new AccountRange(new BinRange(optString2, optString), optInteger.intValue(), brandInfo, StripeJsonUtils.optString(json, "country"));
    }
}