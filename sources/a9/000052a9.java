package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.wallets.Wallet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import wz.e0;
import wz.w;
import wz.x;

/* loaded from: classes6.dex */
public final class PaymentMethodJsonParser implements ModelJsonParser<PaymentMethod> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_BILLING_DETAILS = "billing_details";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CUSTOMER = "customer";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_TYPE = "type";

    /* loaded from: classes6.dex */
    public static final class AuBecsDebitJsonParser implements ModelJsonParser<PaymentMethod.AuBecsDebit> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BSB_NUMBER = "bsb_number";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.AuBecsDebit parse(JSONObject json) {
            s.g(json, "json");
            return new PaymentMethod.AuBecsDebit(StripeJsonUtils.optString(json, FIELD_BSB_NUMBER), StripeJsonUtils.optString(json, FIELD_FINGERPRINT), StripeJsonUtils.optString(json, FIELD_LAST4));
        }
    }

    /* loaded from: classes6.dex */
    public static final class BacsDebitJsonParser implements ModelJsonParser<PaymentMethod.BacsDebit> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";
        @Deprecated
        private static final String FIELD_SORT_CODE = "sort_code";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.BacsDebit parse(JSONObject json) {
            s.g(json, "json");
            return new PaymentMethod.BacsDebit(StripeJsonUtils.optString(json, FIELD_FINGERPRINT), StripeJsonUtils.optString(json, FIELD_LAST4), StripeJsonUtils.optString(json, FIELD_SORT_CODE));
        }
    }

    /* loaded from: classes6.dex */
    public static final class BillingDetails implements ModelJsonParser<PaymentMethod.BillingDetails> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_EMAIL = "email";
        @Deprecated
        private static final String FIELD_NAME = "name";
        @Deprecated
        private static final String FIELD_PHONE = "phone";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.BillingDetails parse(JSONObject json) {
            s.g(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            return new PaymentMethod.BillingDetails(optJSONObject == null ? null : new AddressJsonParser().parse(optJSONObject), StripeJsonUtils.optString(json, "email"), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"));
        }
    }

    /* loaded from: classes6.dex */
    public static final class CardJsonParser implements ModelJsonParser<PaymentMethod.Card> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BRAND = "brand";
        @Deprecated
        private static final String FIELD_CHECKS = "checks";
        @Deprecated
        private static final String FIELD_COUNTRY = "country";
        @Deprecated
        private static final String FIELD_EXP_MONTH = "exp_month";
        @Deprecated
        private static final String FIELD_EXP_YEAR = "exp_year";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_FUNDING = "funding";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";
        @Deprecated
        private static final String FIELD_NETWORKS = "networks";
        @Deprecated
        private static final String FIELD_THREE_D_SECURE_USAGE = "three_d_secure_usage";
        @Deprecated
        private static final String FIELD_WALLET = "wallet";

        /* loaded from: classes6.dex */
        public static final class ChecksJsonParser implements ModelJsonParser<PaymentMethod.Card.Checks> {
            private static final Companion Companion = new Companion(null);
            @Deprecated
            private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
            @Deprecated
            private static final String FIELD_ADDRESS_POSTAL_CODE_CHECK = "address_postal_code_check";
            @Deprecated
            private static final String FIELD_CVC_CHECK = "cvc_check";

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.Checks parse(JSONObject json) {
                s.g(json, "json");
                return new PaymentMethod.Card.Checks(StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1_CHECK), StripeJsonUtils.optString(json, FIELD_ADDRESS_POSTAL_CODE_CHECK), StripeJsonUtils.optString(json, FIELD_CVC_CHECK));
            }
        }

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class NetworksJsonParser implements ModelJsonParser<PaymentMethod.Card.Networks> {
            private static final Companion Companion = new Companion(null);
            @Deprecated
            private static final String FIELD_AVAIABLE = "available";
            @Deprecated
            private static final String FIELD_PREFERRED = "preferred";
            @Deprecated
            private static final String FIELD_SELECTION_MANDATORY = "selection_mandatory";

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.Networks parse(JSONObject json) {
                int t11;
                Set S0;
                s.g(json, "json");
                List<Object> jsonArrayToList = StripeJsonUtils.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_AVAIABLE));
                if (jsonArrayToList == null) {
                    jsonArrayToList = w.i();
                }
                t11 = x.t(jsonArrayToList, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (Object obj : jsonArrayToList) {
                    arrayList.add(obj.toString());
                }
                S0 = e0.S0(arrayList);
                return new PaymentMethod.Card.Networks(S0, StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_SELECTION_MANDATORY), StripeJsonUtils.optString(json, FIELD_PREFERRED));
            }
        }

        /* loaded from: classes6.dex */
        public static final class ThreeDSecureUsageJsonParser implements ModelJsonParser<PaymentMethod.Card.ThreeDSecureUsage> {
            private static final Companion Companion = new Companion(null);
            @Deprecated
            private static final String FIELD_IS_SUPPORTED = "supported";

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.ThreeDSecureUsage parse(JSONObject json) {
                s.g(json, "json");
                return new PaymentMethod.Card.ThreeDSecureUsage(StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_IS_SUPPORTED));
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Card parse(JSONObject json) {
            s.g(json, "json");
            CardBrand fromCode = CardBrand.Companion.fromCode(StripeJsonUtils.optString(json, "brand"));
            JSONObject optJSONObject = json.optJSONObject(FIELD_CHECKS);
            PaymentMethod.Card.Checks parse = optJSONObject == null ? null : new ChecksJsonParser().parse(optJSONObject);
            String optString = StripeJsonUtils.optString(json, "country");
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            Integer optInteger = stripeJsonUtils.optInteger(json, FIELD_EXP_MONTH);
            Integer optInteger2 = stripeJsonUtils.optInteger(json, FIELD_EXP_YEAR);
            String optString2 = StripeJsonUtils.optString(json, FIELD_FINGERPRINT);
            String optString3 = StripeJsonUtils.optString(json, FIELD_FUNDING);
            String optString4 = StripeJsonUtils.optString(json, FIELD_LAST4);
            JSONObject optJSONObject2 = json.optJSONObject(FIELD_THREE_D_SECURE_USAGE);
            PaymentMethod.Card.ThreeDSecureUsage parse2 = optJSONObject2 == null ? null : new ThreeDSecureUsageJsonParser().parse(optJSONObject2);
            JSONObject optJSONObject3 = json.optJSONObject(FIELD_WALLET);
            Wallet parse3 = optJSONObject3 == null ? null : new WalletJsonParser().parse(optJSONObject3);
            JSONObject optJSONObject4 = json.optJSONObject(FIELD_NETWORKS);
            return new PaymentMethod.Card(fromCode, parse, optString, optInteger, optInteger2, optString2, optString3, optString4, parse2, parse3, optJSONObject4 == null ? null : new NetworksJsonParser().parse(optJSONObject4));
        }
    }

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class FpxJsonParser implements ModelJsonParser<PaymentMethod.Fpx> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        @Deprecated
        private static final String FIELD_BANK = "bank";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Fpx parse(JSONObject json) {
            s.g(json, "json");
            return new PaymentMethod.Fpx(StripeJsonUtils.optString(json, "bank"), StripeJsonUtils.optString(json, FIELD_ACCOUNT_HOLDER_TYPE));
        }
    }

    /* loaded from: classes6.dex */
    public static final class IdealJsonParser implements ModelJsonParser<PaymentMethod.Ideal> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BANK = "bank";
        @Deprecated
        private static final String FIELD_BIC = "bic";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Ideal parse(JSONObject json) {
            s.g(json, "json");
            return new PaymentMethod.Ideal(StripeJsonUtils.optString(json, "bank"), StripeJsonUtils.optString(json, FIELD_BIC));
        }
    }

    /* loaded from: classes6.dex */
    public static final class NetbankingJsonParser implements ModelJsonParser<PaymentMethod.Netbanking> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BANK = "bank";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Netbanking parse(JSONObject json) {
            s.g(json, "json");
            return new PaymentMethod.Netbanking(StripeJsonUtils.optString(json, "bank"));
        }
    }

    /* loaded from: classes6.dex */
    public static final class SepaDebitJsonParser implements ModelJsonParser<PaymentMethod.SepaDebit> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BANK_CODE = "bank_code";
        @Deprecated
        private static final String FIELD_BRANCH_CODE = "branch_code";
        @Deprecated
        private static final String FIELD_COUNTRY = "country";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.SepaDebit parse(JSONObject json) {
            s.g(json, "json");
            return new PaymentMethod.SepaDebit(StripeJsonUtils.optString(json, FIELD_BANK_CODE), StripeJsonUtils.optString(json, FIELD_BRANCH_CODE), StripeJsonUtils.optString(json, "country"), StripeJsonUtils.optString(json, FIELD_FINGERPRINT), StripeJsonUtils.optString(json, FIELD_LAST4));
        }
    }

    /* loaded from: classes6.dex */
    public static final class SofortJsonParser implements ModelJsonParser<PaymentMethod.Sofort> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_COUNTRY = "country";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Sofort parse(JSONObject json) {
            s.g(json, "json");
            return new PaymentMethod.Sofort(StripeJsonUtils.optString(json, "country"));
        }
    }

    /* loaded from: classes6.dex */
    public static final class USBankAccountJsonParser implements ModelJsonParser<PaymentMethod.USBankAccount> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        @Deprecated
        private static final String FIELD_ACCOUNT_TYPE = "account_type";
        @Deprecated
        private static final String FIELD_BANK_NAME = "bank_name";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";
        @Deprecated
        private static final String FIELD_LINKED_ACCOUNT = "linked_account";
        @Deprecated
        private static final String FIELD_NETWORKS = "networks";
        @Deprecated
        private static final String FIELD_NETWORKS_PREFERRED = "preferred";
        @Deprecated
        private static final String FIELD_NETWORKS_SUPPORTED = "supported";
        @Deprecated
        private static final String FIELD_ROUTING_NUMBER = "routing_number";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.USBankAccount parse(JSONObject json) {
            PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks;
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType;
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType;
            int t11;
            s.g(json, "json");
            PaymentMethod.USBankAccount.USBankAccountHolderType[] values = PaymentMethod.USBankAccount.USBankAccountHolderType.values();
            int length = values.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                uSBankNetworks = null;
                if (i12 >= length) {
                    uSBankAccountHolderType = null;
                    break;
                }
                uSBankAccountHolderType = values[i12];
                if (s.c(StripeJsonUtils.optString(json, FIELD_ACCOUNT_HOLDER_TYPE), uSBankAccountHolderType.getValue())) {
                    break;
                }
                i12++;
            }
            if (uSBankAccountHolderType == null) {
                uSBankAccountHolderType = PaymentMethod.USBankAccount.USBankAccountHolderType.UNKNOWN;
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType2 = uSBankAccountHolderType;
            PaymentMethod.USBankAccount.USBankAccountType[] values2 = PaymentMethod.USBankAccount.USBankAccountType.values();
            int length2 = values2.length;
            while (true) {
                if (i11 >= length2) {
                    uSBankAccountType = null;
                    break;
                }
                uSBankAccountType = values2[i11];
                if (s.c(StripeJsonUtils.optString(json, FIELD_ACCOUNT_TYPE), uSBankAccountType.getValue())) {
                    break;
                }
                i11++;
            }
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType2 = uSBankAccountType == null ? PaymentMethod.USBankAccount.USBankAccountType.UNKNOWN : uSBankAccountType;
            String optString = StripeJsonUtils.optString(json, FIELD_BANK_NAME);
            String optString2 = StripeJsonUtils.optString(json, FIELD_FINGERPRINT);
            String optString3 = StripeJsonUtils.optString(json, FIELD_LAST4);
            String optString4 = StripeJsonUtils.optString(json, "linked_account");
            if (json.has(FIELD_NETWORKS)) {
                String optString5 = StripeJsonUtils.optString(json.optJSONObject(FIELD_NETWORKS), FIELD_NETWORKS_PREFERRED);
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                JSONObject optJSONObject = json.optJSONObject(FIELD_NETWORKS);
                List<Object> jsonArrayToList = stripeJsonUtils.jsonArrayToList(optJSONObject != null ? optJSONObject.getJSONArray(FIELD_NETWORKS_SUPPORTED) : null);
                if (jsonArrayToList == null) {
                    jsonArrayToList = w.i();
                }
                t11 = x.t(jsonArrayToList, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (Object obj : jsonArrayToList) {
                    arrayList.add(obj.toString());
                }
                uSBankNetworks = new PaymentMethod.USBankAccount.USBankNetworks(optString5, arrayList);
            }
            return new PaymentMethod.USBankAccount(uSBankAccountHolderType2, uSBankAccountType2, optString, optString2, optString3, optString4, uSBankNetworks, StripeJsonUtils.optString(json, FIELD_ROUTING_NUMBER));
        }
    }

    /* loaded from: classes6.dex */
    public static final class UpiJsonParser implements ModelJsonParser<PaymentMethod.Upi> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_VPA = "vpa";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Upi parse(JSONObject json) {
            s.g(json, "json");
            return new PaymentMethod.Upi(StripeJsonUtils.optString(json, FIELD_VPA));
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            iArr[PaymentMethod.Type.CardPresent.ordinal()] = 2;
            iArr[PaymentMethod.Type.Ideal.ordinal()] = 3;
            iArr[PaymentMethod.Type.Fpx.ordinal()] = 4;
            iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 5;
            iArr[PaymentMethod.Type.AuBecsDebit.ordinal()] = 6;
            iArr[PaymentMethod.Type.BacsDebit.ordinal()] = 7;
            iArr[PaymentMethod.Type.Sofort.ordinal()] = 8;
            iArr[PaymentMethod.Type.Upi.ordinal()] = 9;
            iArr[PaymentMethod.Type.Netbanking.ordinal()] = 10;
            iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 11;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public PaymentMethod parse(JSONObject json) {
        s.g(json, "json");
        PaymentMethod.Type fromCode = PaymentMethod.Type.Companion.fromCode(StripeJsonUtils.optString(json, "type"));
        PaymentMethod.Builder created = new PaymentMethod.Builder().setId(StripeJsonUtils.optString(json, "id")).setType(fromCode).setCreated(StripeJsonUtils.INSTANCE.optLong(json, FIELD_CREATED));
        JSONObject optJSONObject = json.optJSONObject(FIELD_BILLING_DETAILS);
        PaymentMethod.Builder liveMode = created.setBillingDetails(optJSONObject == null ? null : new BillingDetails().parse(optJSONObject)).setCustomerId(StripeJsonUtils.optString(json, "customer")).setLiveMode(json.optBoolean(FIELD_LIVEMODE));
        switch (fromCode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromCode.ordinal()]) {
            case 1:
                JSONObject optJSONObject2 = json.optJSONObject(fromCode.code);
                liveMode.setCard(optJSONObject2 != null ? new CardJsonParser().parse(optJSONObject2) : null);
                break;
            case 2:
                liveMode.setCardPresent(PaymentMethod.CardPresent.Companion.getEMPTY$payments_core_release());
                break;
            case 3:
                JSONObject optJSONObject3 = json.optJSONObject(fromCode.code);
                liveMode.setIdeal(optJSONObject3 != null ? new IdealJsonParser().parse(optJSONObject3) : null);
                break;
            case 4:
                JSONObject optJSONObject4 = json.optJSONObject(fromCode.code);
                liveMode.setFpx(optJSONObject4 != null ? new FpxJsonParser().parse(optJSONObject4) : null);
                break;
            case 5:
                JSONObject optJSONObject5 = json.optJSONObject(fromCode.code);
                liveMode.setSepaDebit(optJSONObject5 != null ? new SepaDebitJsonParser().parse(optJSONObject5) : null);
                break;
            case 6:
                JSONObject optJSONObject6 = json.optJSONObject(fromCode.code);
                liveMode.setAuBecsDebit(optJSONObject6 != null ? new AuBecsDebitJsonParser().parse(optJSONObject6) : null);
                break;
            case 7:
                JSONObject optJSONObject7 = json.optJSONObject(fromCode.code);
                liveMode.setBacsDebit(optJSONObject7 != null ? new BacsDebitJsonParser().parse(optJSONObject7) : null);
                break;
            case 8:
                JSONObject optJSONObject8 = json.optJSONObject(fromCode.code);
                liveMode.setSofort(optJSONObject8 != null ? new SofortJsonParser().parse(optJSONObject8) : null);
                break;
            case 9:
                JSONObject optJSONObject9 = json.optJSONObject(fromCode.code);
                liveMode.setUpi(optJSONObject9 != null ? new UpiJsonParser().parse(optJSONObject9) : null);
                break;
            case 10:
                JSONObject optJSONObject10 = json.optJSONObject(fromCode.code);
                liveMode.setNetbanking(optJSONObject10 != null ? new NetbankingJsonParser().parse(optJSONObject10) : null);
                break;
            case 11:
                JSONObject optJSONObject11 = json.optJSONObject(fromCode.code);
                liveMode.setUSBankAccount(optJSONObject11 != null ? new USBankAccountJsonParser().parse(optJSONObject11) : null);
                break;
        }
        return liveMode.build();
    }
}