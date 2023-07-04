package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.wallets.Wallet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class WalletJsonParser implements ModelJsonParser<Wallet> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_BILLING_ADDRESS = "billing_address";
    @Deprecated
    private static final String FIELD_DYNAMIC_LAST4 = "dynamic_last4";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_NAME = "name";
    @Deprecated
    private static final String FIELD_SHIPPING_ADDRESS = "shipping_address";
    @Deprecated
    private static final String FIELD_TYPE = "type";

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
            int[] iArr = new int[Wallet.Type.values().length];
            iArr[Wallet.Type.AmexExpressCheckout.ordinal()] = 1;
            iArr[Wallet.Type.ApplePay.ordinal()] = 2;
            iArr[Wallet.Type.SamsungPay.ordinal()] = 3;
            iArr[Wallet.Type.GooglePay.ordinal()] = 4;
            iArr[Wallet.Type.Masterpass.ordinal()] = 5;
            iArr[Wallet.Type.VisaCheckout.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Wallet.MasterpassWallet parseMasterpassWallet(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_BILLING_ADDRESS);
        Address parse = optJSONObject == null ? null : new AddressJsonParser().parse(optJSONObject);
        String optString = StripeJsonUtils.optString(jSONObject, "email");
        String optString2 = StripeJsonUtils.optString(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject(FIELD_SHIPPING_ADDRESS);
        return new Wallet.MasterpassWallet(parse, optString, optString2, optJSONObject2 != null ? new AddressJsonParser().parse(optJSONObject2) : null);
    }

    private final Wallet.VisaCheckoutWallet parseVisaCheckoutWallet(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_BILLING_ADDRESS);
        Address parse = optJSONObject == null ? null : new AddressJsonParser().parse(optJSONObject);
        String optString = StripeJsonUtils.optString(jSONObject, "email");
        String optString2 = StripeJsonUtils.optString(jSONObject, "name");
        JSONObject optJSONObject2 = jSONObject.optJSONObject(FIELD_SHIPPING_ADDRESS);
        return new Wallet.VisaCheckoutWallet(parse, optString, optString2, optJSONObject2 != null ? new AddressJsonParser().parse(optJSONObject2) : null, str);
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Wallet parse(JSONObject json) {
        JSONObject optJSONObject;
        Wallet amexExpressCheckoutWallet;
        s.g(json, "json");
        Wallet.Type fromCode$payments_core_release = Wallet.Type.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, "type"));
        if (fromCode$payments_core_release == null || (optJSONObject = json.optJSONObject(fromCode$payments_core_release.getCode())) == null) {
            return null;
        }
        String optString = StripeJsonUtils.optString(json, FIELD_DYNAMIC_LAST4);
        switch (WhenMappings.$EnumSwitchMapping$0[fromCode$payments_core_release.ordinal()]) {
            case 1:
                amexExpressCheckoutWallet = new Wallet.AmexExpressCheckoutWallet(optString);
                break;
            case 2:
                amexExpressCheckoutWallet = new Wallet.ApplePayWallet(optString);
                break;
            case 3:
                amexExpressCheckoutWallet = new Wallet.SamsungPayWallet(optString);
                break;
            case 4:
                amexExpressCheckoutWallet = new Wallet.GooglePayWallet(optString);
                break;
            case 5:
                return parseMasterpassWallet(optJSONObject);
            case 6:
                return parseVisaCheckoutWallet(optJSONObject, optString);
            default:
                throw new NoWhenBranchMatchedException();
        }
        return amexExpressCheckoutWallet;
    }
}