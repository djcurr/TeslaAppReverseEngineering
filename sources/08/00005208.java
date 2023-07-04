package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import b30.a;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.Address;
import com.stripe.android.model.KlarnaSourceParams;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrderParams;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;
import wz.x;
import wz.x0;

/* loaded from: classes6.dex */
public final class SourceParams implements StripeParamsModel, Parcelable {
    private static final String PARAM_AMOUNT = "amount";
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    private static final String PARAM_CURRENCY = "currency";
    private static final String PARAM_FLOW = "flow";
    private static final String PARAM_METADATA = "metadata";
    private static final String PARAM_OWNER = "owner";
    private static final String PARAM_REDIRECT = "redirect";
    private static final String PARAM_RETURN_URL = "return_url";
    private static final String PARAM_SOURCE_ORDER = "source_order";
    private static final String PARAM_TOKEN = "token";
    private static final String PARAM_TYPE = "type";
    private static final String PARAM_USAGE = "usage";
    private static final String PARAM_WECHAT = "wechat";
    private Long amount;
    private ApiParams apiParams;
    private final Set<String> attribution;
    private String currency;
    private Flow flow;
    private Map<String, String> metadata;
    private OwnerParams owner;
    private String returnUrl;
    private SourceOrderParams sourceOrder;
    private String token;
    private TypeData typeData;
    private final String typeRaw;
    private Source.Usage usage;
    private WeChatParams weChatParams;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SourceParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {

        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KlarnaSourceParams.LineItem.Type.values().length];
                iArr[KlarnaSourceParams.LineItem.Type.Sku.ordinal()] = 1;
                iArr[KlarnaSourceParams.LineItem.Type.Tax.ordinal()] = 2;
                iArr[KlarnaSourceParams.LineItem.Type.Shipping.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SourceParams createAlipayReusableParams$default(Companion companion, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            return companion.createAlipayReusableParams(str, str2, str3, str4);
        }

        public static /* synthetic */ SourceParams createEPSParams$default(Companion companion, long j11, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            return companion.createEPSParams(j11, str, str2, str3);
        }

        public static /* synthetic */ SourceParams createGiropayParams$default(Companion companion, long j11, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            return companion.createGiropayParams(j11, str, str2, str3);
        }

        public static /* synthetic */ SourceParams createSofortParams$default(Companion companion, long j11, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            return companion.createSofortParams(j11, str, str2, str3);
        }

        public static /* synthetic */ SourceParams createWeChatPayParams$default(Companion companion, long j11, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            return companion.createWeChatPayParams(j11, str, str2, str3);
        }

        public final SourceParams createAlipayReusableParams(String currency, String str, String str2, String returnUrl) {
            s.g(currency, "currency");
            s.g(returnUrl, "returnUrl");
            return new SourceParams("alipay", null, null, currency, new OwnerParams(null, str2, str, null, 9, null), Source.Usage.Reusable, returnUrl, null, null, null, null, null, null, null, 16262, null);
        }

        public final SourceParams createAlipaySingleUseParams(long j11, String currency, String str, String str2, String returnUrl) {
            s.g(currency, "currency");
            s.g(returnUrl, "returnUrl");
            return new SourceParams("alipay", null, Long.valueOf(j11), currency, new OwnerParams(null, str2, str, null, 9, null), null, returnUrl, null, null, null, null, null, null, null, 16290, null);
        }

        public final SourceParams createBancontactParams(long j11, String name, String returnUrl, String str, String str2) {
            s.g(name, "name");
            s.g(returnUrl, "returnUrl");
            return new SourceParams("bancontact", new TypeData.Bancontact(str, str2), Long.valueOf(j11), Source.EURO, new OwnerParams(null, null, name, null, 11, null), null, returnUrl, null, null, null, null, null, null, null, 16288, null);
        }

        public final SourceParams createCardParams(CardParams cardParams) {
            s.g(cardParams, "cardParams");
            return new SourceParams("card", new TypeData.Card(cardParams.getNumber$payments_core_release(), Integer.valueOf(cardParams.getExpMonth$payments_core_release()), Integer.valueOf(cardParams.getExpYear$payments_core_release()), cardParams.getCvc$payments_core_release()), null, null, new OwnerParams(cardParams.getAddress(), null, cardParams.getName(), null, 10, null), null, null, null, null, null, cardParams.getMetadata(), null, null, cardParams.getAttribution(), 7148, null);
        }

        public final SourceParams createCardParamsFromGooglePay(JSONObject googlePayPaymentData) {
            Set j11;
            Card card;
            TokenizationMethod tokenizationMethod;
            s.g(googlePayPaymentData, "googlePayPaymentData");
            GooglePayResult fromJson = GooglePayResult.Companion.fromJson(googlePayPaymentData);
            Token token = fromJson.getToken();
            String str = null;
            String id2 = token == null ? null : token.getId();
            if (id2 == null) {
                id2 = "";
            }
            String str2 = id2;
            if (token != null && (card = token.getCard()) != null && (tokenizationMethod = card.getTokenizationMethod()) != null) {
                str = tokenizationMethod.toString();
            }
            j11 = x0.j(str);
            return new SourceParams("card", null, null, null, new OwnerParams(fromJson.getAddress(), fromJson.getEmail(), fromJson.getName(), fromJson.getPhoneNumber()), null, null, null, null, str2, null, null, null, j11, 7662, null);
        }

        public final SourceParams createCustomParams(String type) {
            s.g(type, "type");
            return new SourceParams(type, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
        }

        public final SourceParams createEPSParams(long j11, String name, String returnUrl, String str) {
            s.g(name, "name");
            s.g(returnUrl, "returnUrl");
            return new SourceParams("eps", new TypeData.Eps(str), Long.valueOf(j11), Source.EURO, new OwnerParams(null, null, name, null, 11, null), null, returnUrl, null, null, null, null, null, null, null, 16288, null);
        }

        public final SourceParams createGiropayParams(long j11, String name, String returnUrl, String str) {
            s.g(name, "name");
            s.g(returnUrl, "returnUrl");
            return new SourceParams("giropay", new TypeData.Giropay(str), Long.valueOf(j11), Source.EURO, new OwnerParams(null, null, name, null, 11, null), null, returnUrl, null, null, null, null, null, null, null, 16288, null);
        }

        public final SourceParams createIdealParams(long j11, String str, String returnUrl, String str2, String str3) {
            s.g(returnUrl, "returnUrl");
            return new SourceParams("ideal", new TypeData.Ideal(str2, str3), Long.valueOf(j11), Source.EURO, new OwnerParams(null, null, str, null, 11, null), null, returnUrl, null, null, null, null, null, null, null, 16288, null);
        }

        public final SourceParams createKlarna(String returnUrl, String currency, KlarnaSourceParams klarnaParams) {
            int t11;
            SourceOrderParams.Item.Type type;
            s.g(returnUrl, "returnUrl");
            s.g(currency, "currency");
            s.g(klarnaParams, "klarnaParams");
            int i11 = 0;
            for (KlarnaSourceParams.LineItem lineItem : klarnaParams.getLineItems()) {
                i11 += lineItem.getTotalAmount();
            }
            List<KlarnaSourceParams.LineItem> lineItems = klarnaParams.getLineItems();
            t11 = x.t(lineItems, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (KlarnaSourceParams.LineItem lineItem2 : lineItems) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[lineItem2.getItemType().ordinal()];
                if (i12 == 1) {
                    type = SourceOrderParams.Item.Type.Sku;
                } else if (i12 == 2) {
                    type = SourceOrderParams.Item.Type.Tax;
                } else if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    type = SourceOrderParams.Item.Type.Shipping;
                }
                arrayList.add(new SourceOrderParams.Item(type, Integer.valueOf(lineItem2.getTotalAmount()), currency, lineItem2.getItemDescription(), null, lineItem2.getQuantity(), 16, null));
            }
            SourceOrderParams sourceOrderParams = new SourceOrderParams(arrayList, null, 2, null);
            Flow flow = Flow.Redirect;
            return new SourceParams("klarna", null, Long.valueOf(i11), currency, new OwnerParams(klarnaParams.getBillingAddress(), klarnaParams.getBillingEmail(), null, klarnaParams.getBillingPhone(), 4, null), null, returnUrl, flow, sourceOrderParams, null, null, null, new ApiParams(klarnaParams.toParamMap()), null, 11810, null);
        }

        public final SourceParams createMasterpassParams(String transactionId, String cartId) {
            s.g(transactionId, "transactionId");
            s.g(cartId, "cartId");
            return new SourceParams("card", new TypeData.Masterpass(transactionId, cartId), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
        }

        public final SourceParams createMultibancoParams(long j11, String returnUrl, String email) {
            s.g(returnUrl, "returnUrl");
            s.g(email, "email");
            return new SourceParams("multibanco", null, Long.valueOf(j11), Source.EURO, new OwnerParams(null, email, null, null, 13, null), null, returnUrl, null, null, null, null, null, null, null, 16290, null);
        }

        public final SourceParams createP24Params(long j11, String currency, String str, String email, String returnUrl) {
            s.g(currency, "currency");
            s.g(email, "email");
            s.g(returnUrl, "returnUrl");
            return new SourceParams("p24", null, Long.valueOf(j11), currency, new OwnerParams(null, email, str, null, 9, null), null, returnUrl, null, null, null, null, null, null, null, 16290, null);
        }

        public final Map<String, String> createRetrieveSourceParams(String clientSecret) {
            Map<String, String> f11;
            s.g(clientSecret, "clientSecret");
            f11 = r0.f(v.a("client_secret", clientSecret));
            return f11;
        }

        public final SourceParams createSepaDebitParams(String name, String iban, String str, String city, String postalCode, String country) {
            s.g(name, "name");
            s.g(iban, "iban");
            s.g(city, "city");
            s.g(postalCode, "postalCode");
            s.g(country, "country");
            return createSepaDebitParams(name, iban, null, str, city, postalCode, country);
        }

        public final SourceParams createSofortParams(long j11, String returnUrl, String country, String str) {
            s.g(returnUrl, "returnUrl");
            s.g(country, "country");
            return new SourceParams("sofort", new TypeData.Sofort(country, str), Long.valueOf(j11), Source.EURO, null, null, returnUrl, null, null, null, null, null, null, null, 16304, null);
        }

        public final SourceParams createSourceFromTokenParams(String tokenId) {
            s.g(tokenId, "tokenId");
            return new SourceParams("card", null, null, null, null, null, null, null, null, tokenId, null, null, null, null, 15870, null);
        }

        public final SourceParams createThreeDSecureParams(long j11, String currency, String returnUrl, String cardId) {
            s.g(currency, "currency");
            s.g(returnUrl, "returnUrl");
            s.g(cardId, "cardId");
            return new SourceParams("three_d_secure", new TypeData.ThreeDSecure(cardId), Long.valueOf(j11), currency, null, null, returnUrl, null, null, null, null, null, null, null, 16304, null);
        }

        public final SourceParams createVisaCheckoutParams(String callId) {
            s.g(callId, "callId");
            return new SourceParams("card", new TypeData.VisaCheckout(callId), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
        }

        public final SourceParams createWeChatPayParams(long j11, String currency, String weChatAppId, String str) {
            s.g(currency, "currency");
            s.g(weChatAppId, "weChatAppId");
            return new SourceParams("wechat", null, Long.valueOf(j11), currency, null, null, null, null, null, null, null, new WeChatParams(weChatAppId, str), null, null, 14322, null);
        }

        public final SourceParams createSepaDebitParams(String name, String iban, String str, String str2, String str3, String str4, String str5) {
            s.g(name, "name");
            s.g(iban, "iban");
            return new SourceParams("sepa_debit", new TypeData.SepaDebit(iban), null, Source.EURO, new OwnerParams(new Address.Builder().setLine1(str2).setCity(str3).setPostalCode(str4).setCountry(str5).build(), str, name, null, 8, null), null, null, null, null, null, null, null, null, null, 16356, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SourceParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            TypeData typeData = (TypeData) parcel.readParcelable(SourceParams.class.getClassLoader());
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            OwnerParams createFromParcel = parcel.readInt() == 0 ? null : OwnerParams.CREATOR.createFromParcel(parcel);
            Source.Usage valueOf2 = parcel.readInt() == 0 ? null : Source.Usage.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            Flow valueOf3 = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            SourceOrderParams createFromParcel2 = parcel.readInt() == 0 ? null : SourceOrderParams.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            WeChatParams createFromParcel3 = parcel.readInt() == 0 ? null : WeChatParams.CREATOR.createFromParcel(parcel);
            ApiParams createFromParcel4 = ApiParams.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            int i12 = 0;
            while (i12 != readInt2) {
                linkedHashSet.add(parcel.readString());
                i12++;
                readInt2 = readInt2;
            }
            return new SourceParams(readString, typeData, valueOf, readString2, createFromParcel, valueOf2, readString3, valueOf3, createFromParcel2, readString4, linkedHashMap, createFromParcel3, createFromParcel4, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceParams[] newArray(int i11) {
            return new SourceParams[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum Flow {
        Redirect("redirect"),
        Receiver("receiver"),
        CodeVerification("code_verification"),
        None(PermissionsResponse.SCOPE_NONE);
        
        private final String code;

        Flow(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class TypeData implements Parcelable {

        /* loaded from: classes6.dex */
        public static final class Bancontact extends TypeData {
            @Deprecated
            private static final String PARAM_PREFERRED_LANGUAGE = "preferred_language";
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String preferredLanguage;
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Bancontact> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Bancontact> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Bancontact createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Bancontact(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Bancontact[] newArray(int i11) {
                    return new Bancontact[i11];
                }
            }

            public Bancontact() {
                this(null, null, 3, null);
            }

            public /* synthetic */ Bancontact(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
            }

            public static /* synthetic */ Bancontact copy$default(Bancontact bancontact, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = bancontact.statementDescriptor;
                }
                if ((i11 & 2) != 0) {
                    str2 = bancontact.preferredLanguage;
                }
                return bancontact.copy(str, str2);
            }

            public final String component1() {
                return this.statementDescriptor;
            }

            public final String component2() {
                return this.preferredLanguage;
            }

            public final Bancontact copy(String str, String str2) {
                return new Bancontact(str, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Bancontact) {
                    Bancontact bancontact = (Bancontact) obj;
                    return s.c(this.statementDescriptor, bancontact.statementDescriptor) && s.c(this.preferredLanguage, bancontact.preferredLanguage);
                }
                return false;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, String>> getParams() {
                List<p<String, String>> l11;
                l11 = w.l(v.a(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor), v.a(PARAM_PREFERRED_LANGUAGE, this.preferredLanguage));
                return l11;
            }

            public final String getPreferredLanguage() {
                return this.preferredLanguage;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "bancontact";
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.preferredLanguage;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final void setPreferredLanguage(String str) {
                this.preferredLanguage = str;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                return "Bancontact(statementDescriptor=" + ((Object) this.statementDescriptor) + ", preferredLanguage=" + ((Object) this.preferredLanguage) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.statementDescriptor);
                out.writeString(this.preferredLanguage);
            }

            public Bancontact(String str, String str2) {
                super(null);
                this.statementDescriptor = str;
                this.preferredLanguage = str2;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Card extends TypeData {
            @Deprecated
            private static final String PARAM_CVC = "cvc";
            @Deprecated
            private static final String PARAM_EXP_MONTH = "exp_month";
            @Deprecated
            private static final String PARAM_EXP_YEAR = "exp_year";
            @Deprecated
            private static final String PARAM_NUMBER = "number";
            private final String cvc;
            private final Integer expMonth;
            private final Integer expYear;
            private final String number;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Card> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Card> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Card(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card[] newArray(int i11) {
                    return new Card[i11];
                }
            }

            public /* synthetic */ Card(String str, Integer num, Integer num2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, num, num2, (i11 & 8) != 0 ? null : str2);
            }

            public static /* synthetic */ Card copy$default(Card card, String str, Integer num, Integer num2, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = card.number;
                }
                if ((i11 & 2) != 0) {
                    num = card.expMonth;
                }
                if ((i11 & 4) != 0) {
                    num2 = card.expYear;
                }
                if ((i11 & 8) != 0) {
                    str2 = card.cvc;
                }
                return card.copy(str, num, num2, str2);
            }

            public final String component1() {
                return this.number;
            }

            public final Integer component2() {
                return this.expMonth;
            }

            public final Integer component3() {
                return this.expYear;
            }

            public final String component4() {
                return this.cvc;
            }

            public final Card copy(String str, Integer num, Integer num2, String str2) {
                return new Card(str, num, num2, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Card) {
                    Card card = (Card) obj;
                    return s.c(this.number, card.number) && s.c(this.expMonth, card.expMonth) && s.c(this.expYear, card.expYear) && s.c(this.cvc, card.cvc);
                }
                return false;
            }

            public final String getCvc() {
                return this.cvc;
            }

            public final Integer getExpMonth() {
                return this.expMonth;
            }

            public final Integer getExpYear() {
                return this.expYear;
            }

            public final String getNumber() {
                return this.number;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, Object>> getParams() {
                List<p<String, Object>> l11;
                l11 = w.l(v.a(PARAM_NUMBER, this.number), v.a(PARAM_EXP_MONTH, this.expMonth), v.a(PARAM_EXP_YEAR, this.expYear), v.a(PARAM_CVC, this.cvc));
                return l11;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "card";
            }

            public int hashCode() {
                String str = this.number;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.expMonth;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.expYear;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str2 = this.cvc;
                return hashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Card(number=" + ((Object) this.number) + ", expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", cvc=" + ((Object) this.cvc) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.number);
                Integer num = this.expMonth;
                if (num == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num.intValue());
                }
                Integer num2 = this.expYear;
                if (num2 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num2.intValue());
                }
                out.writeString(this.cvc);
            }

            public Card(String str, Integer num, Integer num2, String str2) {
                super(null);
                this.number = str;
                this.expMonth = num;
                this.expYear = num2;
                this.cvc = str2;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Eps extends TypeData {
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Eps> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Eps> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Eps createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Eps(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Eps[] newArray(int i11) {
                    return new Eps[i11];
                }
            }

            public Eps() {
                this(null, 1, null);
            }

            public /* synthetic */ Eps(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }

            public static /* synthetic */ Eps copy$default(Eps eps, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = eps.statementDescriptor;
                }
                return eps.copy(str);
            }

            public final String component1() {
                return this.statementDescriptor;
            }

            public final Eps copy(String str) {
                return new Eps(str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Eps) && s.c(this.statementDescriptor, ((Eps) obj).statementDescriptor);
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, String>> getParams() {
                List<p<String, String>> d11;
                d11 = wz.v.d(v.a(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor));
                return d11;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "eps";
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                return "Eps(statementDescriptor=" + ((Object) this.statementDescriptor) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.statementDescriptor);
            }

            public Eps(String str) {
                super(null);
                this.statementDescriptor = str;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Giropay extends TypeData {
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Giropay> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Giropay> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Giropay createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Giropay(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Giropay[] newArray(int i11) {
                    return new Giropay[i11];
                }
            }

            public Giropay() {
                this(null, 1, null);
            }

            public /* synthetic */ Giropay(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }

            public static /* synthetic */ Giropay copy$default(Giropay giropay, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = giropay.statementDescriptor;
                }
                return giropay.copy(str);
            }

            public final String component1() {
                return this.statementDescriptor;
            }

            public final Giropay copy(String str) {
                return new Giropay(str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Giropay) && s.c(this.statementDescriptor, ((Giropay) obj).statementDescriptor);
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, String>> getParams() {
                List<p<String, String>> d11;
                d11 = wz.v.d(v.a(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor));
                return d11;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "giropay";
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                return "Giropay(statementDescriptor=" + ((Object) this.statementDescriptor) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.statementDescriptor);
            }

            public Giropay(String str) {
                super(null);
                this.statementDescriptor = str;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Ideal extends TypeData {
            @Deprecated
            private static final String PARAM_BANK = "bank";
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String bank;
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Ideal> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Ideal> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ideal createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Ideal(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ideal[] newArray(int i11) {
                    return new Ideal[i11];
                }
            }

            public Ideal() {
                this(null, null, 3, null);
            }

            public /* synthetic */ Ideal(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
            }

            public static /* synthetic */ Ideal copy$default(Ideal ideal, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = ideal.statementDescriptor;
                }
                if ((i11 & 2) != 0) {
                    str2 = ideal.bank;
                }
                return ideal.copy(str, str2);
            }

            public final String component1() {
                return this.statementDescriptor;
            }

            public final String component2() {
                return this.bank;
            }

            public final Ideal copy(String str, String str2) {
                return new Ideal(str, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Ideal) {
                    Ideal ideal = (Ideal) obj;
                    return s.c(this.statementDescriptor, ideal.statementDescriptor) && s.c(this.bank, ideal.bank);
                }
                return false;
            }

            public final String getBank() {
                return this.bank;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, String>> getParams() {
                List<p<String, String>> l11;
                l11 = w.l(v.a(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor), v.a("bank", this.bank));
                return l11;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "ideal";
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.bank;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final void setBank(String str) {
                this.bank = str;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                return "Ideal(statementDescriptor=" + ((Object) this.statementDescriptor) + ", bank=" + ((Object) this.bank) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.statementDescriptor);
                out.writeString(this.bank);
            }

            public Ideal(String str, String str2) {
                super(null);
                this.statementDescriptor = str;
                this.bank = str2;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Masterpass extends TypeData {
            @Deprecated
            private static final String PARAM_CART_ID = "cart_id";
            @Deprecated
            private static final String PARAM_MASTERPASS = "masterpass";
            @Deprecated
            private static final String PARAM_TRANSACTION_ID = "transaction_id";
            private String cartId;
            private String transactionId;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Masterpass> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Masterpass> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Masterpass createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Masterpass(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Masterpass[] newArray(int i11) {
                    return new Masterpass[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Masterpass(String transactionId, String cartId) {
                super(null);
                s.g(transactionId, "transactionId");
                s.g(cartId, "cartId");
                this.transactionId = transactionId;
                this.cartId = cartId;
            }

            public static /* synthetic */ Masterpass copy$default(Masterpass masterpass, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = masterpass.transactionId;
                }
                if ((i11 & 2) != 0) {
                    str2 = masterpass.cartId;
                }
                return masterpass.copy(str, str2);
            }

            public final String component1() {
                return this.transactionId;
            }

            public final String component2() {
                return this.cartId;
            }

            public final Masterpass copy(String transactionId, String cartId) {
                s.g(transactionId, "transactionId");
                s.g(cartId, "cartId");
                return new Masterpass(transactionId, cartId);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Masterpass) {
                    Masterpass masterpass = (Masterpass) obj;
                    return s.c(this.transactionId, masterpass.transactionId) && s.c(this.cartId, masterpass.cartId);
                }
                return false;
            }

            public final String getCartId() {
                return this.cartId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, Map<String, String>>> getParams() {
                Map l11;
                List<p<String, Map<String, String>>> d11;
                l11 = s0.l(v.a(PARAM_TRANSACTION_ID, this.transactionId), v.a(PARAM_CART_ID, this.cartId));
                d11 = wz.v.d(v.a(PARAM_MASTERPASS, l11));
                return d11;
            }

            public final String getTransactionId() {
                return this.transactionId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "card";
            }

            public int hashCode() {
                return (this.transactionId.hashCode() * 31) + this.cartId.hashCode();
            }

            public final void setCartId(String str) {
                s.g(str, "<set-?>");
                this.cartId = str;
            }

            public final void setTransactionId(String str) {
                s.g(str, "<set-?>");
                this.transactionId = str;
            }

            public String toString() {
                return "Masterpass(transactionId=" + this.transactionId + ", cartId=" + this.cartId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.transactionId);
                out.writeString(this.cartId);
            }
        }

        /* loaded from: classes6.dex */
        public static final class SepaDebit extends TypeData {
            @Deprecated
            private static final String PARAM_IBAN = "iban";
            private String iban;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<SepaDebit> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SepaDebit createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new SepaDebit(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SepaDebit[] newArray(int i11) {
                    return new SepaDebit[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SepaDebit(String iban) {
                super(null);
                s.g(iban, "iban");
                this.iban = iban;
            }

            public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = sepaDebit.iban;
                }
                return sepaDebit.copy(str);
            }

            public final String component1() {
                return this.iban;
            }

            public final SepaDebit copy(String iban) {
                s.g(iban, "iban");
                return new SepaDebit(iban);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SepaDebit) && s.c(this.iban, ((SepaDebit) obj).iban);
            }

            public final String getIban() {
                return this.iban;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, String>> getParams() {
                List<p<String, String>> d11;
                d11 = wz.v.d(v.a(PARAM_IBAN, this.iban));
                return d11;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "sepa_debit";
            }

            public int hashCode() {
                return this.iban.hashCode();
            }

            public final void setIban(String str) {
                s.g(str, "<set-?>");
                this.iban = str;
            }

            public String toString() {
                return "SepaDebit(iban=" + this.iban + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.iban);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Sofort extends TypeData {
            @Deprecated
            private static final String PARAM_COUNTRY = "country";
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String country;
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Sofort> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Sofort> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Sofort createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Sofort(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Sofort[] newArray(int i11) {
                    return new Sofort[i11];
                }
            }

            public /* synthetic */ Sofort(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? null : str2);
            }

            public static /* synthetic */ Sofort copy$default(Sofort sofort, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = sofort.country;
                }
                if ((i11 & 2) != 0) {
                    str2 = sofort.statementDescriptor;
                }
                return sofort.copy(str, str2);
            }

            public final String component1() {
                return this.country;
            }

            public final String component2() {
                return this.statementDescriptor;
            }

            public final Sofort copy(String country, String str) {
                s.g(country, "country");
                return new Sofort(country, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Sofort) {
                    Sofort sofort = (Sofort) obj;
                    return s.c(this.country, sofort.country) && s.c(this.statementDescriptor, sofort.statementDescriptor);
                }
                return false;
            }

            public final String getCountry() {
                return this.country;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, String>> getParams() {
                List<p<String, String>> l11;
                l11 = w.l(v.a("country", this.country), v.a(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor));
                return l11;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "sofort";
            }

            public int hashCode() {
                int hashCode = this.country.hashCode() * 31;
                String str = this.statementDescriptor;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final void setCountry(String str) {
                s.g(str, "<set-?>");
                this.country = str;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                return "Sofort(country=" + this.country + ", statementDescriptor=" + ((Object) this.statementDescriptor) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.country);
                out.writeString(this.statementDescriptor);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sofort(String country, String str) {
                super(null);
                s.g(country, "country");
                this.country = country;
                this.statementDescriptor = str;
            }
        }

        /* loaded from: classes6.dex */
        public static final class ThreeDSecure extends TypeData {
            @Deprecated
            private static final String PARAM_CARD = "card";
            private String cardId;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<ThreeDSecure> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<ThreeDSecure> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecure createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new ThreeDSecure(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecure[] newArray(int i11) {
                    return new ThreeDSecure[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThreeDSecure(String cardId) {
                super(null);
                s.g(cardId, "cardId");
                this.cardId = cardId;
            }

            public static /* synthetic */ ThreeDSecure copy$default(ThreeDSecure threeDSecure, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = threeDSecure.cardId;
                }
                return threeDSecure.copy(str);
            }

            public final String component1() {
                return this.cardId;
            }

            public final ThreeDSecure copy(String cardId) {
                s.g(cardId, "cardId");
                return new ThreeDSecure(cardId);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThreeDSecure) && s.c(this.cardId, ((ThreeDSecure) obj).cardId);
            }

            public final String getCardId() {
                return this.cardId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, String>> getParams() {
                List<p<String, String>> d11;
                d11 = wz.v.d(v.a("card", this.cardId));
                return d11;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "three_d_secure";
            }

            public int hashCode() {
                return this.cardId.hashCode();
            }

            public final void setCardId(String str) {
                s.g(str, "<set-?>");
                this.cardId = str;
            }

            public String toString() {
                return "ThreeDSecure(cardId=" + this.cardId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.cardId);
            }
        }

        /* loaded from: classes6.dex */
        public static final class VisaCheckout extends TypeData {
            @Deprecated
            private static final String PARAM_CALL_ID = "callid";
            @Deprecated
            private static final String PARAM_VISA_CHECKOUT = "visa_checkout";
            private String callId;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<VisaCheckout> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<VisaCheckout> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VisaCheckout createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new VisaCheckout(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VisaCheckout[] newArray(int i11) {
                    return new VisaCheckout[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VisaCheckout(String callId) {
                super(null);
                s.g(callId, "callId");
                this.callId = callId;
            }

            public static /* synthetic */ VisaCheckout copy$default(VisaCheckout visaCheckout, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = visaCheckout.callId;
                }
                return visaCheckout.copy(str);
            }

            public final String component1() {
                return this.callId;
            }

            public final VisaCheckout copy(String callId) {
                s.g(callId, "callId");
                return new VisaCheckout(callId);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VisaCheckout) && s.c(this.callId, ((VisaCheckout) obj).callId);
            }

            public final String getCallId() {
                return this.callId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<p<String, Object>> getParams() {
                Map f11;
                List<p<String, Object>> d11;
                f11 = r0.f(v.a(PARAM_CALL_ID, this.callId));
                d11 = wz.v.d(v.a(PARAM_VISA_CHECKOUT, f11));
                return d11;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "card";
            }

            public int hashCode() {
                return this.callId.hashCode();
            }

            public final void setCallId(String str) {
                s.g(str, "<set-?>");
                this.callId = str;
            }

            public String toString() {
                return "VisaCheckout(callId=" + this.callId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.callId);
            }
        }

        private TypeData() {
        }

        public /* synthetic */ TypeData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<String, Map<String, Object>> createParams() {
            Map i11;
            Map<String, Map<String, Object>> f11;
            Map<String, Map<String, Object>> i12;
            List<p<String, Object>> params = getParams();
            i11 = s0.i();
            Iterator<T> it2 = params.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                p pVar = (p) it2.next();
                String str = (String) pVar.a();
                Object b11 = pVar.b();
                f11 = b11 != null ? r0.f(v.a(str, b11)) : null;
                if (f11 == null) {
                    f11 = s0.i();
                }
                i11 = s0.p(i11, f11);
            }
            if (!(!i11.isEmpty())) {
                i11 = null;
            }
            f11 = i11 != null ? r0.f(v.a(getType(), i11)) : null;
            if (f11 == null) {
                i12 = s0.i();
                return i12;
            }
            return f11;
        }

        public abstract List<p<String, Object>> getParams();

        public abstract String getType();
    }

    public SourceParams(String typeRaw, TypeData typeData, Long l11, String str, OwnerParams ownerParams, Source.Usage usage, String str2, Flow flow, SourceOrderParams sourceOrderParams, String str3, Map<String, String> map, WeChatParams weChatParams, ApiParams apiParams, Set<String> attribution) {
        s.g(typeRaw, "typeRaw");
        s.g(apiParams, "apiParams");
        s.g(attribution, "attribution");
        this.typeRaw = typeRaw;
        this.typeData = typeData;
        this.amount = l11;
        this.currency = str;
        this.owner = ownerParams;
        this.usage = usage;
        this.returnUrl = str2;
        this.flow = flow;
        this.sourceOrder = sourceOrderParams;
        this.token = str3;
        this.metadata = map;
        this.weChatParams = weChatParams;
        this.apiParams = apiParams;
        this.attribution = attribution;
    }

    private final WeChatParams component12() {
        return this.weChatParams;
    }

    private final ApiParams component13() {
        return this.apiParams;
    }

    public static final SourceParams createAlipayReusableParams(String str, String str2, String str3, String str4) {
        return Companion.createAlipayReusableParams(str, str2, str3, str4);
    }

    public static final SourceParams createAlipaySingleUseParams(long j11, String str, String str2, String str3, String str4) {
        return Companion.createAlipaySingleUseParams(j11, str, str2, str3, str4);
    }

    public static final SourceParams createBancontactParams(long j11, String str, String str2, String str3, String str4) {
        return Companion.createBancontactParams(j11, str, str2, str3, str4);
    }

    public static final SourceParams createCardParams(CardParams cardParams) {
        return Companion.createCardParams(cardParams);
    }

    public static final SourceParams createCardParamsFromGooglePay(JSONObject jSONObject) {
        return Companion.createCardParamsFromGooglePay(jSONObject);
    }

    public static final SourceParams createCustomParams(String str) {
        return Companion.createCustomParams(str);
    }

    public static final SourceParams createEPSParams(long j11, String str, String str2, String str3) {
        return Companion.createEPSParams(j11, str, str2, str3);
    }

    public static final SourceParams createGiropayParams(long j11, String str, String str2, String str3) {
        return Companion.createGiropayParams(j11, str, str2, str3);
    }

    public static final SourceParams createIdealParams(long j11, String str, String str2, String str3, String str4) {
        return Companion.createIdealParams(j11, str, str2, str3, str4);
    }

    public static final SourceParams createKlarna(String str, String str2, KlarnaSourceParams klarnaSourceParams) {
        return Companion.createKlarna(str, str2, klarnaSourceParams);
    }

    public static final SourceParams createMasterpassParams(String str, String str2) {
        return Companion.createMasterpassParams(str, str2);
    }

    public static final SourceParams createMultibancoParams(long j11, String str, String str2) {
        return Companion.createMultibancoParams(j11, str, str2);
    }

    public static final SourceParams createP24Params(long j11, String str, String str2, String str3, String str4) {
        return Companion.createP24Params(j11, str, str2, str3, str4);
    }

    public static final Map<String, String> createRetrieveSourceParams(String str) {
        return Companion.createRetrieveSourceParams(str);
    }

    public static final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6) {
        return Companion.createSepaDebitParams(str, str2, str3, str4, str5, str6);
    }

    public static final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return Companion.createSepaDebitParams(str, str2, str3, str4, str5, str6, str7);
    }

    public static final SourceParams createSofortParams(long j11, String str, String str2, String str3) {
        return Companion.createSofortParams(j11, str, str2, str3);
    }

    public static final SourceParams createSourceFromTokenParams(String str) {
        return Companion.createSourceFromTokenParams(str);
    }

    public static final SourceParams createThreeDSecureParams(long j11, String str, String str2, String str3) {
        return Companion.createThreeDSecureParams(j11, str, str2, str3);
    }

    public static final SourceParams createVisaCheckoutParams(String str) {
        return Companion.createVisaCheckoutParams(str);
    }

    public static final SourceParams createWeChatPayParams(long j11, String str, String str2, String str3) {
        return Companion.createWeChatPayParams(j11, str, str2, str3);
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public final String component1() {
        return this.typeRaw;
    }

    public final String component10() {
        return this.token;
    }

    public final Map<String, String> component11() {
        return this.metadata;
    }

    public final Set<String> component14$payments_core_release() {
        return this.attribution;
    }

    public final TypeData component2$payments_core_release() {
        return this.typeData;
    }

    public final Long component3() {
        return this.amount;
    }

    public final String component4() {
        return this.currency;
    }

    public final OwnerParams component5() {
        return this.owner;
    }

    public final Source.Usage component6() {
        return this.usage;
    }

    public final String component7() {
        return this.returnUrl;
    }

    public final Flow component8() {
        return this.flow;
    }

    public final SourceOrderParams component9() {
        return this.sourceOrder;
    }

    public final SourceParams copy(String typeRaw, TypeData typeData, Long l11, String str, OwnerParams ownerParams, Source.Usage usage, String str2, Flow flow, SourceOrderParams sourceOrderParams, String str3, Map<String, String> map, WeChatParams weChatParams, ApiParams apiParams, Set<String> attribution) {
        s.g(typeRaw, "typeRaw");
        s.g(apiParams, "apiParams");
        s.g(attribution, "attribution");
        return new SourceParams(typeRaw, typeData, l11, str, ownerParams, usage, str2, flow, sourceOrderParams, str3, map, weChatParams, apiParams, attribution);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceParams) {
            SourceParams sourceParams = (SourceParams) obj;
            return s.c(this.typeRaw, sourceParams.typeRaw) && s.c(this.typeData, sourceParams.typeData) && s.c(this.amount, sourceParams.amount) && s.c(this.currency, sourceParams.currency) && s.c(this.owner, sourceParams.owner) && this.usage == sourceParams.usage && s.c(this.returnUrl, sourceParams.returnUrl) && this.flow == sourceParams.flow && s.c(this.sourceOrder, sourceParams.sourceOrder) && s.c(this.token, sourceParams.token) && s.c(this.metadata, sourceParams.metadata) && s.c(this.weChatParams, sourceParams.weChatParams) && s.c(this.apiParams, sourceParams.apiParams) && s.c(this.attribution, sourceParams.attribution);
        }
        return false;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final Map<String, Object> getApiParameterMap() {
        return this.apiParams.getValue();
    }

    public final Set<String> getAttribution$payments_core_release() {
        return this.attribution;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Flow getFlow() {
        return this.flow;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final OwnerParams getOwner() {
        return this.owner;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final SourceOrderParams getSourceOrder() {
        return this.sourceOrder;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getType() {
        return Source.Companion.asSourceType(this.typeRaw);
    }

    public final TypeData getTypeData$payments_core_release() {
        return this.typeData;
    }

    public final String getTypeRaw() {
        return this.typeRaw;
    }

    public final Source.Usage getUsage() {
        return this.usage;
    }

    public int hashCode() {
        int hashCode = this.typeRaw.hashCode() * 31;
        TypeData typeData = this.typeData;
        int hashCode2 = (hashCode + (typeData == null ? 0 : typeData.hashCode())) * 31;
        Long l11 = this.amount;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.currency;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OwnerParams ownerParams = this.owner;
        int hashCode5 = (hashCode4 + (ownerParams == null ? 0 : ownerParams.hashCode())) * 31;
        Source.Usage usage = this.usage;
        int hashCode6 = (hashCode5 + (usage == null ? 0 : usage.hashCode())) * 31;
        String str2 = this.returnUrl;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Flow flow = this.flow;
        int hashCode8 = (hashCode7 + (flow == null ? 0 : flow.hashCode())) * 31;
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        int hashCode9 = (hashCode8 + (sourceOrderParams == null ? 0 : sourceOrderParams.hashCode())) * 31;
        String str3 = this.token;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        WeChatParams weChatParams = this.weChatParams;
        return ((((hashCode11 + (weChatParams != null ? weChatParams.hashCode() : 0)) * 31) + this.apiParams.hashCode()) * 31) + this.attribution.hashCode();
    }

    public final void setAmount(Long l11) {
        this.amount = l11;
    }

    public final SourceParams setApiParameterMap(Map<String, ? extends Object> map) {
        if (map == null) {
            map = s0.i();
        }
        this.apiParams = new ApiParams(map);
        return this;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setFlow(Flow flow) {
        this.flow = flow;
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public final void setOwner(OwnerParams ownerParams) {
        this.owner = ownerParams;
    }

    public final void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final void setSourceOrder(SourceOrderParams sourceOrderParams) {
        this.sourceOrder = sourceOrderParams;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setTypeData$payments_core_release(TypeData typeData) {
        this.typeData = typeData;
    }

    public final void setUsage(Source.Usage usage) {
        this.usage = usage;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map f11;
        Map p11;
        Map p12;
        Map p13;
        Map p14;
        Map p15;
        Map p16;
        Map p17;
        Map f12;
        Map f13;
        Map p18;
        Map p19;
        Map p21;
        Map p22;
        Map<String, Object> p23;
        f11 = r0.f(v.a("type", this.typeRaw));
        Map<String, Object> value = this.apiParams.getValue();
        if (!(!value.isEmpty())) {
            value = null;
        }
        Map f14 = value == null ? null : r0.f(v.a(getTypeRaw(), value));
        if (f14 == null) {
            f14 = s0.i();
        }
        p11 = s0.p(f11, f14);
        TypeData typeData = this.typeData;
        Map<String, Map<String, Object>> createParams = typeData == null ? null : typeData.createParams();
        if (createParams == null) {
            createParams = s0.i();
        }
        p12 = s0.p(p11, createParams);
        Long l11 = this.amount;
        Map f15 = l11 == null ? null : r0.f(v.a("amount", Long.valueOf(l11.longValue())));
        if (f15 == null) {
            f15 = s0.i();
        }
        p13 = s0.p(p12, f15);
        String str = this.currency;
        Map f16 = str == null ? null : r0.f(v.a(PARAM_CURRENCY, str));
        if (f16 == null) {
            f16 = s0.i();
        }
        p14 = s0.p(p13, f16);
        Flow flow = this.flow;
        Map f17 = flow == null ? null : r0.f(v.a(PARAM_FLOW, flow.getCode$payments_core_release()));
        if (f17 == null) {
            f17 = s0.i();
        }
        p15 = s0.p(p14, f17);
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        Map f18 = sourceOrderParams == null ? null : r0.f(v.a(PARAM_SOURCE_ORDER, sourceOrderParams.toParamMap()));
        if (f18 == null) {
            f18 = s0.i();
        }
        p16 = s0.p(p15, f18);
        OwnerParams ownerParams = this.owner;
        Map f19 = ownerParams == null ? null : r0.f(v.a(PARAM_OWNER, ownerParams.toParamMap()));
        if (f19 == null) {
            f19 = s0.i();
        }
        p17 = s0.p(p16, f19);
        String str2 = this.returnUrl;
        if (str2 == null) {
            f13 = null;
        } else {
            f12 = r0.f(v.a("return_url", str2));
            f13 = r0.f(v.a("redirect", f12));
        }
        if (f13 == null) {
            f13 = s0.i();
        }
        p18 = s0.p(p17, f13);
        Map<String, String> map = this.metadata;
        Map f21 = map == null ? null : r0.f(v.a(PARAM_METADATA, map));
        if (f21 == null) {
            f21 = s0.i();
        }
        p19 = s0.p(p18, f21);
        String str3 = this.token;
        Map f22 = str3 == null ? null : r0.f(v.a(PARAM_TOKEN, str3));
        if (f22 == null) {
            f22 = s0.i();
        }
        p21 = s0.p(p19, f22);
        Source.Usage usage = this.usage;
        Map f23 = usage == null ? null : r0.f(v.a("usage", usage.getCode$payments_core_release()));
        if (f23 == null) {
            f23 = s0.i();
        }
        p22 = s0.p(p21, f23);
        WeChatParams weChatParams = this.weChatParams;
        Map f24 = weChatParams != null ? r0.f(v.a("wechat", weChatParams.toParamMap())) : null;
        if (f24 == null) {
            f24 = s0.i();
        }
        p23 = s0.p(p22, f24);
        return p23;
    }

    public String toString() {
        return "SourceParams(typeRaw=" + this.typeRaw + ", typeData=" + this.typeData + ", amount=" + this.amount + ", currency=" + ((Object) this.currency) + ", owner=" + this.owner + ", usage=" + this.usage + ", returnUrl=" + ((Object) this.returnUrl) + ", flow=" + this.flow + ", sourceOrder=" + this.sourceOrder + ", token=" + ((Object) this.token) + ", metadata=" + this.metadata + ", weChatParams=" + this.weChatParams + ", apiParams=" + this.apiParams + ", attribution=" + this.attribution + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.typeRaw);
        out.writeParcelable(this.typeData, i11);
        Long l11 = this.amount;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l11.longValue());
        }
        out.writeString(this.currency);
        OwnerParams ownerParams = this.owner;
        if (ownerParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ownerParams.writeToParcel(out, i11);
        }
        Source.Usage usage = this.usage;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        out.writeString(this.returnUrl);
        Flow flow = this.flow;
        if (flow == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(flow.name());
        }
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        if (sourceOrderParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sourceOrderParams.writeToParcel(out, i11);
        }
        out.writeString(this.token);
        Map<String, String> map = this.metadata;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        WeChatParams weChatParams = this.weChatParams;
        if (weChatParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            weChatParams.writeToParcel(out, i11);
        }
        this.apiParams.writeToParcel(out, i11);
        Set<String> set = this.attribution;
        out.writeInt(set.size());
        for (String str : set) {
            out.writeString(str);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ApiParams implements Parcelable {
        private final Map<String, Object> value;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ApiParams> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Companion implements a<ApiParams> {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: newArray */
            public ApiParams[] m267newArray(int i11) {
                return (ApiParams[]) a.C0144a.a(this, i11);
            }

            /* renamed from: create */
            public ApiParams m266create(Parcel parcel) {
                s.g(parcel, "parcel");
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                String readString = parcel.readString();
                Map jsonObjectToMap = stripeJsonUtils.jsonObjectToMap(readString == null ? null : new JSONObject(readString));
                if (jsonObjectToMap == null) {
                    jsonObjectToMap = s0.i();
                }
                return new ApiParams(jsonObjectToMap);
            }

            public void write(ApiParams apiParams, Parcel parcel, int i11) {
                s.g(apiParams, "<this>");
                s.g(parcel, "parcel");
                JSONObject mapToJsonObject = StripeJsonUtils.INSTANCE.mapToJsonObject(apiParams.getValue());
                parcel.writeString(mapToJsonObject == null ? null : mapToJsonObject.toString());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ApiParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiParams createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return ApiParams.Companion.m266create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiParams[] newArray(int i11) {
                return new ApiParams[i11];
            }
        }

        public ApiParams() {
            this(null, 1, null);
        }

        public ApiParams(Map<String, ? extends Object> value) {
            s.g(value, "value");
            this.value = value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiParams copy$default(ApiParams apiParams, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = apiParams.value;
            }
            return apiParams.copy(map);
        }

        public final Map<String, Object> component1() {
            return this.value;
        }

        public final ApiParams copy(Map<String, ? extends Object> value) {
            s.g(value, "value");
            return new ApiParams(value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiParams) && s.c(this.value, ((ApiParams) obj).value);
        }

        public final Map<String, Object> getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ApiParams(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Companion.write(this, out, i11);
        }

        public /* synthetic */ ApiParams(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? s0.i() : map);
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeChatParams implements StripeParamsModel, Parcelable {
        private static final String PARAM_APPID = "appid";
        private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
        private final String appId;
        private final String statementDescriptor;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<WeChatParams> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<WeChatParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatParams createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new WeChatParams(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatParams[] newArray(int i11) {
                return new WeChatParams[i11];
            }
        }

        public WeChatParams() {
            this(null, null, 3, null);
        }

        public WeChatParams(String str, String str2) {
            this.appId = str;
            this.statementDescriptor = str2;
        }

        private final String component1() {
            return this.appId;
        }

        private final String component2() {
            return this.statementDescriptor;
        }

        public static /* synthetic */ WeChatParams copy$default(WeChatParams weChatParams, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = weChatParams.appId;
            }
            if ((i11 & 2) != 0) {
                str2 = weChatParams.statementDescriptor;
            }
            return weChatParams.copy(str, str2);
        }

        public final WeChatParams copy(String str, String str2) {
            return new WeChatParams(str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof WeChatParams) {
                WeChatParams weChatParams = (WeChatParams) obj;
                return s.c(this.appId, weChatParams.appId) && s.c(this.statementDescriptor, weChatParams.statementDescriptor);
            }
            return false;
        }

        public int hashCode() {
            String str = this.appId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.statementDescriptor;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map i11;
            Map p11;
            Map<String, Object> p12;
            i11 = s0.i();
            String str = this.appId;
            Map f11 = str == null ? null : r0.f(v.a(PARAM_APPID, str));
            if (f11 == null) {
                f11 = s0.i();
            }
            p11 = s0.p(i11, f11);
            String str2 = this.statementDescriptor;
            Map f12 = str2 != null ? r0.f(v.a(PARAM_STATEMENT_DESCRIPTOR, str2)) : null;
            if (f12 == null) {
                f12 = s0.i();
            }
            p12 = s0.p(p11, f12);
            return p12;
        }

        public String toString() {
            return "WeChatParams(appId=" + ((Object) this.appId) + ", statementDescriptor=" + ((Object) this.statementDescriptor) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.appId);
            out.writeString(this.statementDescriptor);
        }

        public /* synthetic */ WeChatParams(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class OwnerParams implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_ADDRESS = "address";
        @Deprecated
        private static final String PARAM_EMAIL = "email";
        @Deprecated
        private static final String PARAM_NAME = "name";
        @Deprecated
        private static final String PARAM_PHONE = "phone";
        private Address address;
        private String email;
        private String name;
        private String phone;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<OwnerParams> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<OwnerParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OwnerParams createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new OwnerParams(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OwnerParams[] newArray(int i11) {
                return new OwnerParams[i11];
            }
        }

        public OwnerParams() {
            this(null, null, null, null, 15, null);
        }

        public OwnerParams(Address address) {
            this(address, null, null, null, 14, null);
        }

        public OwnerParams(Address address, String str) {
            this(address, str, null, null, 12, null);
        }

        public OwnerParams(Address address, String str, String str2) {
            this(address, str, str2, null, 8, null);
        }

        public OwnerParams(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public static /* synthetic */ OwnerParams copy$default(OwnerParams ownerParams, Address address, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                address = ownerParams.address;
            }
            if ((i11 & 2) != 0) {
                str = ownerParams.email;
            }
            if ((i11 & 4) != 0) {
                str2 = ownerParams.name;
            }
            if ((i11 & 8) != 0) {
                str3 = ownerParams.phone;
            }
            return ownerParams.copy(address, str, str2, str3);
        }

        public final Address component1$payments_core_release() {
            return this.address;
        }

        public final String component2$payments_core_release() {
            return this.email;
        }

        public final String component3$payments_core_release() {
            return this.name;
        }

        public final String component4$payments_core_release() {
            return this.phone;
        }

        public final OwnerParams copy(Address address, String str, String str2, String str3) {
            return new OwnerParams(address, str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OwnerParams) {
                OwnerParams ownerParams = (OwnerParams) obj;
                return s.c(this.address, ownerParams.address) && s.c(this.email, ownerParams.email) && s.c(this.name, ownerParams.name) && s.c(this.phone, ownerParams.phone);
            }
            return false;
        }

        public final Address getAddress$payments_core_release() {
            return this.address;
        }

        public final String getEmail$payments_core_release() {
            return this.email;
        }

        public final String getName$payments_core_release() {
            return this.name;
        }

        public final String getPhone$payments_core_release() {
            return this.phone;
        }

        public int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setAddress$payments_core_release(Address address) {
            this.address = address;
        }

        public final void setEmail$payments_core_release(String str) {
            this.email = str;
        }

        public final void setName$payments_core_release(String str) {
            this.name = str;
        }

        public final void setPhone$payments_core_release(String str) {
            this.phone = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map i11;
            Map p11;
            Map p12;
            Map p13;
            Map<String, Object> p14;
            i11 = s0.i();
            Address address = this.address;
            Map f11 = address == null ? null : r0.f(v.a("address", address.toParamMap()));
            if (f11 == null) {
                f11 = s0.i();
            }
            p11 = s0.p(i11, f11);
            String str = this.email;
            Map f12 = str == null ? null : r0.f(v.a("email", str));
            if (f12 == null) {
                f12 = s0.i();
            }
            p12 = s0.p(p11, f12);
            String str2 = this.name;
            Map f13 = str2 == null ? null : r0.f(v.a("name", str2));
            if (f13 == null) {
                f13 = s0.i();
            }
            p13 = s0.p(p12, f13);
            String str3 = this.phone;
            Map f14 = str3 != null ? r0.f(v.a("phone", str3)) : null;
            if (f14 == null) {
                f14 = s0.i();
            }
            p14 = s0.p(p13, f14);
            return p14;
        }

        public String toString() {
            return "OwnerParams(address=" + this.address + ", email=" + ((Object) this.email) + ", name=" + ((Object) this.name) + ", phone=" + ((Object) this.phone) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Address address = this.address;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i11);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            out.writeString(this.phone);
        }

        public /* synthetic */ OwnerParams(Address address, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
        }
    }

    public /* synthetic */ SourceParams(String str, TypeData typeData, Long l11, String str2, OwnerParams ownerParams, Source.Usage usage, String str3, Flow flow, SourceOrderParams sourceOrderParams, String str4, Map map, WeChatParams weChatParams, ApiParams apiParams, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : typeData, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : ownerParams, (i11 & 32) != 0 ? null : usage, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : flow, (i11 & 256) != 0 ? null : sourceOrderParams, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? null : map, (i11 & 2048) != 0 ? null : weChatParams, (i11 & 4096) != 0 ? new ApiParams(null, 1, null) : apiParams, (i11 & PKIFailureInfo.certRevoked) != 0 ? x0.d() : set);
    }
}