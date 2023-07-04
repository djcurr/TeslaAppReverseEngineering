package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Token;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class TokenJsonParser implements ModelJsonParser<Token> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_TYPE = "type";
    @Deprecated
    private static final String FIELD_USED = "used";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Token.Type.values().length];
            iArr[Token.Type.Card.ordinal()] = 1;
            iArr[Token.Type.BankAccount.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Token parse(JSONObject json) {
        Token token;
        s.g(json, "json");
        String optString = StripeJsonUtils.optString(json, "id");
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        Long optLong = stripeJsonUtils.optLong(json, FIELD_CREATED);
        Token.Type fromCode = Token.Type.Companion.fromCode(StripeJsonUtils.optString(json, "type"));
        if (fromCode == null || optString == null || optLong == null) {
            return null;
        }
        boolean optBoolean = stripeJsonUtils.optBoolean(json, FIELD_USED);
        boolean optBoolean2 = stripeJsonUtils.optBoolean(json, FIELD_LIVEMODE);
        Date date = new Date(TimeUnit.SECONDS.toMillis(optLong.longValue()));
        int i11 = WhenMappings.$EnumSwitchMapping$0[fromCode.ordinal()];
        if (i11 == 1) {
            Token.Type type = Token.Type.Card;
            JSONObject optJSONObject = json.optJSONObject(type.getCode());
            if (optJSONObject == null) {
                return null;
            }
            token = new Token(optString, type, date, optBoolean2, optBoolean, null, new CardJsonParser().parse(optJSONObject), 32, null);
        } else if (i11 != 2) {
            token = new Token(optString, fromCode, date, optBoolean2, optBoolean, null, null, 96, null);
        } else {
            Token.Type type2 = Token.Type.BankAccount;
            JSONObject optJSONObject2 = json.optJSONObject(type2.getCode());
            if (optJSONObject2 == null) {
                return null;
            }
            token = new Token(optString, type2, date, optBoolean2, optBoolean, new BankAccountJsonParser().parse(optJSONObject2), null, 64, null);
        }
        return token;
    }
}