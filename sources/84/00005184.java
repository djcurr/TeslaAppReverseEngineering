package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.CardUtils;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.y;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;
import wz.x0;
import wz.y0;

/* loaded from: classes6.dex */
public final class PaymentMethodCreateParams implements StripeParamsModel, Parcelable {
    private static final String PARAM_BILLING_DETAILS = "billing_details";
    private static final String PARAM_METADATA = "metadata";
    private static final String PARAM_TYPE = "type";
    private final AuBecsDebit auBecsDebit;
    private final BacsDebit bacsDebit;
    private final PaymentMethod.BillingDetails billingDetails;
    private final Card card;
    private final Fpx fpx;
    private final Ideal ideal;
    private final Link link;
    private final Map<String, String> metadata;
    private final Netbanking netbanking;
    private final Map<String, Object> overrideParamMap;
    private final Set<String> productUsage;
    private final SepaDebit sepaDebit;
    private final Sofort sofort;
    private final PaymentMethod.Type type;
    private final Upi upi;
    private final USBankAccount usBankAccount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PaymentMethodCreateParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class AuBecsDebit implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_ACCOUNT_NUMBER = "account_number";
        @Deprecated
        private static final String PARAM_BSB_NUMBER = "bsb_number";
        private String accountNumber;
        private String bsbNumber;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Creator();
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
        public static final class Creator implements Parcelable.Creator<AuBecsDebit> {
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new AuBecsDebit(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit[] newArray(int i11) {
                return new AuBecsDebit[i11];
            }
        }

        public AuBecsDebit(String bsbNumber, String accountNumber) {
            s.g(bsbNumber, "bsbNumber");
            s.g(accountNumber, "accountNumber");
            this.bsbNumber = bsbNumber;
            this.accountNumber = accountNumber;
        }

        public static /* synthetic */ AuBecsDebit copy$default(AuBecsDebit auBecsDebit, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = auBecsDebit.bsbNumber;
            }
            if ((i11 & 2) != 0) {
                str2 = auBecsDebit.accountNumber;
            }
            return auBecsDebit.copy(str, str2);
        }

        public final String component1() {
            return this.bsbNumber;
        }

        public final String component2() {
            return this.accountNumber;
        }

        public final AuBecsDebit copy(String bsbNumber, String accountNumber) {
            s.g(bsbNumber, "bsbNumber");
            s.g(accountNumber, "accountNumber");
            return new AuBecsDebit(bsbNumber, accountNumber);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AuBecsDebit) {
                AuBecsDebit auBecsDebit = (AuBecsDebit) obj;
                return s.c(this.bsbNumber, auBecsDebit.bsbNumber) && s.c(this.accountNumber, auBecsDebit.accountNumber);
            }
            return false;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getBsbNumber() {
            return this.bsbNumber;
        }

        public int hashCode() {
            return (this.bsbNumber.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public final void setAccountNumber(String str) {
            s.g(str, "<set-?>");
            this.accountNumber = str;
        }

        public final void setBsbNumber(String str) {
            s.g(str, "<set-?>");
            this.bsbNumber = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> l11;
            l11 = s0.l(v.a(PARAM_BSB_NUMBER, this.bsbNumber), v.a(PARAM_ACCOUNT_NUMBER, this.accountNumber));
            return l11;
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.bsbNumber + ", accountNumber=" + this.accountNumber + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bsbNumber);
            out.writeString(this.accountNumber);
        }
    }

    /* loaded from: classes6.dex */
    public static final class BacsDebit implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_ACCOUNT_NUMBER = "account_number";
        @Deprecated
        private static final String PARAM_SORT_CODE = "sort_code";
        private String accountNumber;
        private String sortCode;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();
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
        public static final class Creator implements Parcelable.Creator<BacsDebit> {
            @Override // android.os.Parcelable.Creator
            public final BacsDebit createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new BacsDebit(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BacsDebit[] newArray(int i11) {
                return new BacsDebit[i11];
            }
        }

        public BacsDebit(String accountNumber, String sortCode) {
            s.g(accountNumber, "accountNumber");
            s.g(sortCode, "sortCode");
            this.accountNumber = accountNumber;
            this.sortCode = sortCode;
        }

        public static /* synthetic */ BacsDebit copy$default(BacsDebit bacsDebit, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bacsDebit.accountNumber;
            }
            if ((i11 & 2) != 0) {
                str2 = bacsDebit.sortCode;
            }
            return bacsDebit.copy(str, str2);
        }

        public final String component1() {
            return this.accountNumber;
        }

        public final String component2() {
            return this.sortCode;
        }

        public final BacsDebit copy(String accountNumber, String sortCode) {
            s.g(accountNumber, "accountNumber");
            s.g(sortCode, "sortCode");
            return new BacsDebit(accountNumber, sortCode);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BacsDebit) {
                BacsDebit bacsDebit = (BacsDebit) obj;
                return s.c(this.accountNumber, bacsDebit.accountNumber) && s.c(this.sortCode, bacsDebit.sortCode);
            }
            return false;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getSortCode() {
            return this.sortCode;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.sortCode.hashCode();
        }

        public final void setAccountNumber(String str) {
            s.g(str, "<set-?>");
            this.accountNumber = str;
        }

        public final void setSortCode(String str) {
            s.g(str, "<set-?>");
            this.sortCode = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> l11;
            l11 = s0.l(v.a(PARAM_ACCOUNT_NUMBER, this.accountNumber), v.a(PARAM_SORT_CODE, this.sortCode));
            return l11;
        }

        public String toString() {
            return "BacsDebit(accountNumber=" + this.accountNumber + ", sortCode=" + this.sortCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.accountNumber);
            out.writeString(this.sortCode);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Card card, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                billingDetails = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(card, billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createAffirm$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                billingDetails = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createAffirm(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createAfterpayClearpay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                billingDetails = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createAfterpayClearpay(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createAlipay$default(Companion companion, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = null;
            }
            return companion.createAlipay(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createBancontact$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createBancontact(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createBlik$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                billingDetails = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createBlik(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createEps$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createEps(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createGiropay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createGiropay(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createGrabPay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createGrabPay(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createKlarna$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                billingDetails = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createKlarna(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createLink$default(Companion companion, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.createLink(str, str2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createOxxo$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createOxxo(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createP24$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createP24(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createPayPal$default(Companion companion, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = null;
            }
            return companion.createPayPal(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createUSBankAccount$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                billingDetails = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createUSBankAccount(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createWeChatPay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                billingDetails = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            return companion.createWeChatPay(billingDetails, map);
        }

        public final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails) {
            s.g(auBecsDebit, "auBecsDebit");
            s.g(billingDetails, "billingDetails");
            return create$default(this, auBecsDebit, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails) {
            s.g(bacsDebit, "bacsDebit");
            s.g(billingDetails, "billingDetails");
            return create$default(this, bacsDebit, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Card card) {
            s.g(card, "card");
            return create$default(this, card, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails) {
            s.g(card, "card");
            return create$default(this, card, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(card, "card");
            return new PaymentMethodCreateParams(card, billingDetails, map, (DefaultConstructorMarker) null);
        }

        public final PaymentMethodCreateParams create(Fpx fpx) {
            s.g(fpx, "fpx");
            return create$default(this, fpx, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails) {
            s.g(fpx, "fpx");
            return create$default(this, fpx, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Ideal ideal) {
            s.g(ideal, "ideal");
            return create$default(this, ideal, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails) {
            s.g(ideal, "ideal");
            return create$default(this, ideal, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Netbanking netbanking) {
            s.g(netbanking, "netbanking");
            return create$default(this, netbanking, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails) {
            s.g(netbanking, "netbanking");
            return create$default(this, netbanking, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(SepaDebit sepaDebit) {
            s.g(sepaDebit, "sepaDebit");
            return create$default(this, sepaDebit, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails) {
            s.g(sepaDebit, "sepaDebit");
            return create$default(this, sepaDebit, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Sofort sofort) {
            s.g(sofort, "sofort");
            return create$default(this, sofort, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails) {
            s.g(sofort, "sofort");
            return create$default(this, sofort, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(USBankAccount usBankAccount) {
            s.g(usBankAccount, "usBankAccount");
            return create$default(this, usBankAccount, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(USBankAccount usBankAccount, PaymentMethod.BillingDetails billingDetails) {
            s.g(usBankAccount, "usBankAccount");
            return create$default(this, usBankAccount, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Upi upi) {
            s.g(upi, "upi");
            return create$default(this, upi, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails) {
            s.g(upi, "upi");
            return create$default(this, upi, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams createAffirm() {
            return createAffirm$default(this, null, null, 3, null);
        }

        public final PaymentMethodCreateParams createAffirm(PaymentMethod.BillingDetails billingDetails) {
            return createAffirm$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createAffirm(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.Affirm, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createAfterpayClearpay() {
            return createAfterpayClearpay$default(this, null, null, 3, null);
        }

        public final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails) {
            return createAfterpayClearpay$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.AfterpayClearpay, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createAlipay() {
            return createAlipay$default(this, null, 1, null);
        }

        public final PaymentMethodCreateParams createAlipay(Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.Alipay, null, null, null, null, null, null, null, null, null, null, null, null, map, null, null, 57342, null);
        }

        public final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails) {
            s.g(billingDetails, "billingDetails");
            return createBancontact$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Bancontact, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createBlik() {
            return createBlik$default(this, null, null, 3, null);
        }

        public final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails) {
            return createBlik$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.Blik, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createCard(CardParams cardParams) {
            s.g(cardParams, "cardParams");
            return create(new Card(cardParams.getNumber$payments_core_release(), Integer.valueOf(cardParams.getExpMonth$payments_core_release()), Integer.valueOf(cardParams.getExpYear$payments_core_release()), cardParams.getCvc$payments_core_release(), null, cardParams.getAttribution(), 16, null), new PaymentMethod.BillingDetails(cardParams.getAddress(), null, cardParams.getName(), null, 10, null), cardParams.getMetadata());
        }

        public final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails) {
            s.g(billingDetails, "billingDetails");
            return createEps$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Eps, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createFromGooglePay(JSONObject googlePayPaymentData) {
            Set j11;
            com.stripe.android.model.Card card;
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
            return create$default(this, new Card(null, null, null, null, str2, j11, 15, null), new PaymentMethod.BillingDetails(fromJson.getAddress(), fromJson.getEmail(), fromJson.getName(), fromJson.getPhoneNumber()), (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails) {
            s.g(billingDetails, "billingDetails");
            return createGiropay$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Giropay, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails) {
            s.g(billingDetails, "billingDetails");
            return createGrabPay$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.GrabPay, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createKlarna() {
            return createKlarna$default(this, null, null, 3, null);
        }

        public final PaymentMethodCreateParams createKlarna(PaymentMethod.BillingDetails billingDetails) {
            return createKlarna$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createKlarna(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.Klarna, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createLink(String paymentDetailsId, String consumerSessionClientSecret, Map<String, ? extends Object> map) {
            s.g(paymentDetailsId, "paymentDetailsId");
            s.g(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Link, null, null, null, null, null, null, null, null, null, null, new Link(paymentDetailsId, consumerSessionClientSecret, map), null, null, null, null, 63486, null);
        }

        public final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails) {
            s.g(billingDetails, "billingDetails");
            return createOxxo$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Oxxo, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails) {
            s.g(billingDetails, "billingDetails");
            return createP24$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.P24, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createPayPal() {
            return createPayPal$default(this, null, 1, null);
        }

        public final PaymentMethodCreateParams createPayPal(Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.PayPal, null, null, null, null, null, null, null, null, null, null, null, null, map, null, null, 57342, null);
        }

        public final PaymentMethodCreateParams createUSBankAccount() {
            return createUSBankAccount$default(this, null, null, 3, null);
        }

        public final PaymentMethodCreateParams createUSBankAccount(PaymentMethod.BillingDetails billingDetails) {
            return createUSBankAccount$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createUSBankAccount(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.USBankAccount, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createWeChatPay() {
            return createWeChatPay$default(this, null, null, 3, null);
        }

        public final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails) {
            return createWeChatPay$default(this, billingDetails, null, 2, null);
        }

        public final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.WeChatPay, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53246, null);
        }

        public final PaymentMethodCreateParams createWithOverride(PaymentMethod.Type type, Map<String, ? extends Object> map, Set<String> productUsage) {
            s.g(type, "type");
            s.g(productUsage, "productUsage");
            return new PaymentMethodCreateParams(type, null, null, null, null, null, null, null, null, null, null, null, null, null, productUsage, map, 16382, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                billingDetails = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(ideal, billingDetails, map);
        }

        public final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(ideal, "ideal");
            return new PaymentMethodCreateParams(ideal, billingDetails, map, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                billingDetails = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(fpx, billingDetails, map);
        }

        public final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(fpx, "fpx");
            return new PaymentMethodCreateParams(fpx, billingDetails, map, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                billingDetails = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(sepaDebit, billingDetails, map);
        }

        public final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(sepaDebit, "sepaDebit");
            return new PaymentMethodCreateParams(sepaDebit, billingDetails, map, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(auBecsDebit, billingDetails, map);
        }

        public final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(auBecsDebit, "auBecsDebit");
            s.g(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(auBecsDebit, billingDetails, map, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(bacsDebit, billingDetails, map);
        }

        public final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(bacsDebit, "bacsDebit");
            s.g(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(bacsDebit, billingDetails, map, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                billingDetails = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(sofort, billingDetails, map);
        }

        public final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(sofort, "sofort");
            return new PaymentMethodCreateParams(sofort, billingDetails, map, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Upi upi, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                billingDetails = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(upi, billingDetails, map);
        }

        public final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(upi, "upi");
            return new PaymentMethodCreateParams(upi, billingDetails, map, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                billingDetails = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(uSBankAccount, billingDetails, map);
        }

        public final PaymentMethodCreateParams create(USBankAccount usBankAccount, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(usBankAccount, "usBankAccount");
            return new PaymentMethodCreateParams(usBankAccount, billingDetails, map, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map map, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                billingDetails = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            return companion.create(netbanking, billingDetails, map);
        }

        public final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            s.g(netbanking, "netbanking");
            return new PaymentMethodCreateParams(netbanking, billingDetails, map, (DefaultConstructorMarker) null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethodCreateParams> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodCreateParams createFromParcel(Parcel parcel) {
            PaymentMethod.BillingDetails billingDetails;
            Link link;
            LinkedHashMap linkedHashMap;
            LinkedHashSet linkedHashSet;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            s.g(parcel, "parcel");
            PaymentMethod.Type createFromParcel = PaymentMethod.Type.CREATOR.createFromParcel(parcel);
            Card createFromParcel2 = parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel);
            Ideal createFromParcel3 = parcel.readInt() == 0 ? null : Ideal.CREATOR.createFromParcel(parcel);
            Fpx createFromParcel4 = parcel.readInt() == 0 ? null : Fpx.CREATOR.createFromParcel(parcel);
            SepaDebit createFromParcel5 = parcel.readInt() == 0 ? null : SepaDebit.CREATOR.createFromParcel(parcel);
            AuBecsDebit createFromParcel6 = parcel.readInt() == 0 ? null : AuBecsDebit.CREATOR.createFromParcel(parcel);
            BacsDebit createFromParcel7 = parcel.readInt() == 0 ? null : BacsDebit.CREATOR.createFromParcel(parcel);
            Sofort createFromParcel8 = parcel.readInt() == 0 ? null : Sofort.CREATOR.createFromParcel(parcel);
            Upi createFromParcel9 = parcel.readInt() == 0 ? null : Upi.CREATOR.createFromParcel(parcel);
            Netbanking createFromParcel10 = parcel.readInt() == 0 ? null : Netbanking.CREATOR.createFromParcel(parcel);
            USBankAccount createFromParcel11 = parcel.readInt() == 0 ? null : USBankAccount.CREATOR.createFromParcel(parcel);
            Link createFromParcel12 = parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel);
            PaymentMethod.BillingDetails createFromParcel13 = parcel.readInt() == 0 ? null : PaymentMethod.BillingDetails.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                link = createFromParcel12;
                billingDetails = createFromParcel13;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt);
                billingDetails = createFromParcel13;
                int i11 = 0;
                while (i11 != readInt) {
                    linkedHashMap4.put(parcel.readString(), parcel.readString());
                    i11++;
                    readInt = readInt;
                    createFromParcel12 = createFromParcel12;
                }
                link = createFromParcel12;
                linkedHashMap = linkedHashMap4;
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            int i12 = 0;
            while (i12 != readInt2) {
                linkedHashSet2.add(parcel.readString());
                i12++;
                readInt2 = readInt2;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = linkedHashMap;
                linkedHashSet = linkedHashSet2;
                linkedHashMap3 = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt3);
                linkedHashSet = linkedHashSet2;
                int i13 = 0;
                while (i13 != readInt3) {
                    linkedHashMap5.put(parcel.readString(), parcel.readValue(PaymentMethodCreateParams.class.getClassLoader()));
                    i13++;
                    readInt3 = readInt3;
                    linkedHashMap = linkedHashMap;
                }
                linkedHashMap2 = linkedHashMap;
                linkedHashMap3 = linkedHashMap5;
            }
            return new PaymentMethodCreateParams(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, createFromParcel11, link, billingDetails, linkedHashMap2, linkedHashSet, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethodCreateParams[] newArray(int i11) {
            return new PaymentMethodCreateParams[i11];
        }
    }

    /* loaded from: classes6.dex */
    public static final class Fpx implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_BANK = "bank";
        private String bank;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Fpx> CREATOR = new Creator();
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
        public static final class Creator implements Parcelable.Creator<Fpx> {
            @Override // android.os.Parcelable.Creator
            public final Fpx createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Fpx(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Fpx[] newArray(int i11) {
                return new Fpx[i11];
            }
        }

        public Fpx(String str) {
            this.bank = str;
        }

        public static /* synthetic */ Fpx copy$default(Fpx fpx, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fpx.bank;
            }
            return fpx.copy(str);
        }

        public final String component1() {
            return this.bank;
        }

        public final Fpx copy(String str) {
            return new Fpx(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fpx) && s.c(this.bank, ((Fpx) obj).bank);
        }

        public final String getBank() {
            return this.bank;
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setBank(String str) {
            this.bank = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> i11;
            String str = this.bank;
            Map<String, Object> f11 = str == null ? null : r0.f(v.a("bank", str));
            if (f11 == null) {
                i11 = s0.i();
                return i11;
            }
            return f11;
        }

        public String toString() {
            return "Fpx(bank=" + ((Object) this.bank) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bank);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Ideal implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_BANK = "bank";
        private String bank;
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
            @Override // android.os.Parcelable.Creator
            public final Ideal createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Ideal(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Ideal[] newArray(int i11) {
                return new Ideal[i11];
            }
        }

        public Ideal(String str) {
            this.bank = str;
        }

        public static /* synthetic */ Ideal copy$default(Ideal ideal, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = ideal.bank;
            }
            return ideal.copy(str);
        }

        public final String component1() {
            return this.bank;
        }

        public final Ideal copy(String str) {
            return new Ideal(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ideal) && s.c(this.bank, ((Ideal) obj).bank);
        }

        public final String getBank() {
            return this.bank;
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setBank(String str) {
            this.bank = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> i11;
            String str = this.bank;
            Map<String, Object> f11 = str == null ? null : r0.f(v.a("bank", str));
            if (f11 == null) {
                i11 = s0.i();
                return i11;
            }
            return f11;
        }

        public String toString() {
            return "Ideal(bank=" + ((Object) this.bank) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bank);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Netbanking implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_BANK = "bank";
        private String bank;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Netbanking> CREATOR = new Creator();
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
        public static final class Creator implements Parcelable.Creator<Netbanking> {
            @Override // android.os.Parcelable.Creator
            public final Netbanking createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Netbanking(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Netbanking[] newArray(int i11) {
                return new Netbanking[i11];
            }
        }

        public Netbanking(String bank) {
            s.g(bank, "bank");
            this.bank = bank;
        }

        public static /* synthetic */ Netbanking copy$default(Netbanking netbanking, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = netbanking.bank;
            }
            return netbanking.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.bank;
        }

        public final Netbanking copy(String bank) {
            s.g(bank, "bank");
            return new Netbanking(bank);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Netbanking) && s.c(this.bank, ((Netbanking) obj).bank);
        }

        public final String getBank$payments_core_release() {
            return this.bank;
        }

        public int hashCode() {
            return this.bank.hashCode();
        }

        public final void setBank$payments_core_release(String str) {
            s.g(str, "<set-?>");
            this.bank = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> f11;
            String lowerCase = this.bank.toLowerCase(Locale.ROOT);
            s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            f11 = r0.f(v.a("bank", lowerCase));
            return f11;
        }

        public String toString() {
            return "Netbanking(bank=" + this.bank + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bank);
        }
    }

    /* loaded from: classes6.dex */
    public static final class SepaDebit implements StripeParamsModel, Parcelable {
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
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new SepaDebit(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i11) {
                return new SepaDebit[i11];
            }
        }

        public SepaDebit(String str) {
            this.iban = str;
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

        public final SepaDebit copy(String str) {
            return new SepaDebit(str);
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

        public int hashCode() {
            String str = this.iban;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setIban(String str) {
            this.iban = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> i11;
            String str = this.iban;
            Map<String, Object> f11 = str == null ? null : r0.f(v.a(PARAM_IBAN, str));
            if (f11 == null) {
                i11 = s0.i();
                return i11;
            }
            return f11;
        }

        public String toString() {
            return "SepaDebit(iban=" + ((Object) this.iban) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.iban);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Sofort implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_COUNTRY = "country";
        private String country;
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
            @Override // android.os.Parcelable.Creator
            public final Sofort createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Sofort(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Sofort[] newArray(int i11) {
                return new Sofort[i11];
            }
        }

        public Sofort(String country) {
            s.g(country, "country");
            this.country = country;
        }

        public static /* synthetic */ Sofort copy$default(Sofort sofort, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sofort.country;
            }
            return sofort.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.country;
        }

        public final Sofort copy(String country) {
            s.g(country, "country");
            return new Sofort(country);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Sofort) && s.c(this.country, ((Sofort) obj).country);
        }

        public final String getCountry$payments_core_release() {
            return this.country;
        }

        public int hashCode() {
            return this.country.hashCode();
        }

        public final void setCountry$payments_core_release(String str) {
            s.g(str, "<set-?>");
            this.country = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> f11;
            String upperCase = this.country.toUpperCase(Locale.ROOT);
            s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            f11 = r0.f(v.a("country", upperCase));
            return f11;
        }

        public String toString() {
            return "Sofort(country=" + this.country + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.country);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Upi implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_VPA = "vpa";
        private final String vpa;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Upi> CREATOR = new Creator();
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
        public static final class Creator implements Parcelable.Creator<Upi> {
            @Override // android.os.Parcelable.Creator
            public final Upi createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Upi(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Upi[] newArray(int i11) {
                return new Upi[i11];
            }
        }

        public Upi(String str) {
            this.vpa = str;
        }

        private final String component1() {
            return this.vpa;
        }

        public static /* synthetic */ Upi copy$default(Upi upi, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = upi.vpa;
            }
            return upi.copy(str);
        }

        public final Upi copy(String str) {
            return new Upi(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Upi) && s.c(this.vpa, ((Upi) obj).vpa);
        }

        public int hashCode() {
            String str = this.vpa;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> i11;
            String str = this.vpa;
            Map<String, Object> f11 = str == null ? null : r0.f(v.a(PARAM_VPA, str));
            if (f11 == null) {
                i11 = s0.i();
                return i11;
            }
            return f11;
        }

        public String toString() {
            return "Upi(vpa=" + ((Object) this.vpa) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.vpa);
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            iArr[PaymentMethod.Type.Ideal.ordinal()] = 2;
            iArr[PaymentMethod.Type.Fpx.ordinal()] = 3;
            iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 4;
            iArr[PaymentMethod.Type.AuBecsDebit.ordinal()] = 5;
            iArr[PaymentMethod.Type.BacsDebit.ordinal()] = 6;
            iArr[PaymentMethod.Type.Sofort.ordinal()] = 7;
            iArr[PaymentMethod.Type.Upi.ordinal()] = 8;
            iArr[PaymentMethod.Type.Netbanking.ordinal()] = 9;
            iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 10;
            iArr[PaymentMethod.Type.Link.ordinal()] = 11;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentMethodCreateParams(PaymentMethod.Type type, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, PaymentMethod.BillingDetails billingDetails, Map<String, String> map, Set<String> productUsage, Map<String, ? extends Object> map2) {
        s.g(type, "type");
        s.g(productUsage, "productUsage");
        this.type = type;
        this.card = card;
        this.ideal = ideal;
        this.fpx = fpx;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.sofort = sofort;
        this.upi = upi;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
        this.link = link;
        this.billingDetails = billingDetails;
        this.metadata = map;
        this.productUsage = productUsage;
        this.overrideParamMap = map2;
    }

    public /* synthetic */ PaymentMethodCreateParams(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(auBecsDebit, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(bacsDebit, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Card card, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(card, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(fpx, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(ideal, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(netbanking, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(sepaDebit, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(sofort, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(uSBankAccount, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Upi upi, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(upi, billingDetails, map);
    }

    private final Netbanking component10() {
        return this.netbanking;
    }

    private final USBankAccount component11() {
        return this.usBankAccount;
    }

    private final Link component12() {
        return this.link;
    }

    private final Map<String, String> component14() {
        return this.metadata;
    }

    private final Set<String> component15() {
        return this.productUsage;
    }

    private final Map<String, Object> component16() {
        return this.overrideParamMap;
    }

    private final Ideal component3() {
        return this.ideal;
    }

    private final Fpx component4() {
        return this.fpx;
    }

    private final SepaDebit component5() {
        return this.sepaDebit;
    }

    private final AuBecsDebit component6() {
        return this.auBecsDebit;
    }

    private final BacsDebit component7() {
        return this.bacsDebit;
    }

    private final Sofort component8() {
        return this.sofort;
    }

    private final Upi component9() {
        return this.upi;
    }

    public static final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(auBecsDebit, billingDetails);
    }

    public static final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(auBecsDebit, billingDetails, map);
    }

    public static final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(bacsDebit, billingDetails);
    }

    public static final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(bacsDebit, billingDetails, map);
    }

    public static final PaymentMethodCreateParams create(Card card) {
        return Companion.create(card);
    }

    public static final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(card, billingDetails);
    }

    public static final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(card, billingDetails, map);
    }

    public static final PaymentMethodCreateParams create(Fpx fpx) {
        return Companion.create(fpx);
    }

    public static final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(fpx, billingDetails);
    }

    public static final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(fpx, billingDetails, map);
    }

    public static final PaymentMethodCreateParams create(Ideal ideal) {
        return Companion.create(ideal);
    }

    public static final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(ideal, billingDetails);
    }

    public static final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(ideal, billingDetails, map);
    }

    public static final PaymentMethodCreateParams create(Netbanking netbanking) {
        return Companion.create(netbanking);
    }

    public static final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(netbanking, billingDetails);
    }

    public static final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(netbanking, billingDetails, map);
    }

    public static final PaymentMethodCreateParams create(SepaDebit sepaDebit) {
        return Companion.create(sepaDebit);
    }

    public static final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(sepaDebit, billingDetails);
    }

    public static final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(sepaDebit, billingDetails, map);
    }

    public static final PaymentMethodCreateParams create(Sofort sofort) {
        return Companion.create(sofort);
    }

    public static final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(sofort, billingDetails);
    }

    public static final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(sofort, billingDetails, map);
    }

    public static final PaymentMethodCreateParams create(USBankAccount uSBankAccount) {
        return Companion.create(uSBankAccount);
    }

    public static final PaymentMethodCreateParams create(USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(uSBankAccount, billingDetails);
    }

    public static final PaymentMethodCreateParams create(USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(uSBankAccount, billingDetails, map);
    }

    public static final PaymentMethodCreateParams create(Upi upi) {
        return Companion.create(upi);
    }

    public static final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(upi, billingDetails);
    }

    public static final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(upi, billingDetails, map);
    }

    public static final PaymentMethodCreateParams createAffirm() {
        return Companion.createAffirm();
    }

    public static final PaymentMethodCreateParams createAffirm(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createAffirm(billingDetails);
    }

    public static final PaymentMethodCreateParams createAffirm(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createAffirm(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createAfterpayClearpay() {
        return Companion.createAfterpayClearpay();
    }

    public static final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createAfterpayClearpay(billingDetails);
    }

    public static final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createAfterpayClearpay(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createAlipay() {
        return Companion.createAlipay();
    }

    public static final PaymentMethodCreateParams createAlipay(Map<String, String> map) {
        return Companion.createAlipay(map);
    }

    public static final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createBancontact(billingDetails);
    }

    public static final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createBancontact(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createBlik() {
        return Companion.createBlik();
    }

    public static final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createBlik(billingDetails);
    }

    public static final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createBlik(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createCard(CardParams cardParams) {
        return Companion.createCard(cardParams);
    }

    public static final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createEps(billingDetails);
    }

    public static final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createEps(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createFromGooglePay(JSONObject jSONObject) {
        return Companion.createFromGooglePay(jSONObject);
    }

    public static final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createGiropay(billingDetails);
    }

    public static final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createGiropay(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createGrabPay(billingDetails);
    }

    public static final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createGrabPay(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createKlarna() {
        return Companion.createKlarna();
    }

    public static final PaymentMethodCreateParams createKlarna(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createKlarna(billingDetails);
    }

    public static final PaymentMethodCreateParams createKlarna(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createKlarna(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createOxxo(billingDetails);
    }

    public static final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createOxxo(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createP24(billingDetails);
    }

    public static final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createP24(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createPayPal() {
        return Companion.createPayPal();
    }

    public static final PaymentMethodCreateParams createPayPal(Map<String, String> map) {
        return Companion.createPayPal(map);
    }

    public static final PaymentMethodCreateParams createUSBankAccount() {
        return Companion.createUSBankAccount();
    }

    public static final PaymentMethodCreateParams createUSBankAccount(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createUSBankAccount(billingDetails);
    }

    public static final PaymentMethodCreateParams createUSBankAccount(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createUSBankAccount(billingDetails, map);
    }

    public static final PaymentMethodCreateParams createWeChatPay() {
        return Companion.createWeChatPay();
    }

    public static final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createWeChatPay(billingDetails);
    }

    public static final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createWeChatPay(billingDetails, map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Map<String, Object> getTypeParams() {
        Map<String, Object> paramMap;
        Map<String, Object> i11;
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
                Card card = this.card;
                if (card != null) {
                    paramMap = card.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 2:
                Ideal ideal = this.ideal;
                if (ideal != null) {
                    paramMap = ideal.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 3:
                Fpx fpx = this.fpx;
                if (fpx != null) {
                    paramMap = fpx.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 4:
                SepaDebit sepaDebit = this.sepaDebit;
                if (sepaDebit != null) {
                    paramMap = sepaDebit.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 5:
                AuBecsDebit auBecsDebit = this.auBecsDebit;
                if (auBecsDebit != null) {
                    paramMap = auBecsDebit.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 6:
                BacsDebit bacsDebit = this.bacsDebit;
                if (bacsDebit != null) {
                    paramMap = bacsDebit.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 7:
                Sofort sofort = this.sofort;
                if (sofort != null) {
                    paramMap = sofort.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 8:
                Upi upi = this.upi;
                if (upi != null) {
                    paramMap = upi.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 9:
                Netbanking netbanking = this.netbanking;
                if (netbanking != null) {
                    paramMap = netbanking.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 10:
                USBankAccount uSBankAccount = this.usBankAccount;
                if (uSBankAccount != null) {
                    paramMap = uSBankAccount.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            case 11:
                Link link = this.link;
                if (link != null) {
                    paramMap = link.toParamMap();
                    break;
                }
                paramMap = null;
                break;
            default:
                paramMap = null;
                break;
        }
        if (paramMap == null || paramMap.isEmpty()) {
            paramMap = null;
        }
        Map<String, Object> f11 = paramMap != null ? r0.f(v.a(getType$payments_core_release().code, paramMap)) : null;
        if (f11 == null) {
            i11 = s0.i();
            return i11;
        }
        return f11;
    }

    public final PaymentMethod.Type component1$payments_core_release() {
        return this.type;
    }

    public final PaymentMethod.BillingDetails component13() {
        return this.billingDetails;
    }

    public final Card component2() {
        return this.card;
    }

    public final PaymentMethodCreateParams copy(PaymentMethod.Type type, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, PaymentMethod.BillingDetails billingDetails, Map<String, String> map, Set<String> productUsage, Map<String, ? extends Object> map2) {
        s.g(type, "type");
        s.g(productUsage, "productUsage");
        return new PaymentMethodCreateParams(type, card, ideal, fpx, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, uSBankAccount, link, billingDetails, map, productUsage, map2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentMethodCreateParams) {
            PaymentMethodCreateParams paymentMethodCreateParams = (PaymentMethodCreateParams) obj;
            return this.type == paymentMethodCreateParams.type && s.c(this.card, paymentMethodCreateParams.card) && s.c(this.ideal, paymentMethodCreateParams.ideal) && s.c(this.fpx, paymentMethodCreateParams.fpx) && s.c(this.sepaDebit, paymentMethodCreateParams.sepaDebit) && s.c(this.auBecsDebit, paymentMethodCreateParams.auBecsDebit) && s.c(this.bacsDebit, paymentMethodCreateParams.bacsDebit) && s.c(this.sofort, paymentMethodCreateParams.sofort) && s.c(this.upi, paymentMethodCreateParams.upi) && s.c(this.netbanking, paymentMethodCreateParams.netbanking) && s.c(this.usBankAccount, paymentMethodCreateParams.usBankAccount) && s.c(this.link, paymentMethodCreateParams.link) && s.c(this.billingDetails, paymentMethodCreateParams.billingDetails) && s.c(this.metadata, paymentMethodCreateParams.metadata) && s.c(this.productUsage, paymentMethodCreateParams.productUsage) && s.c(this.overrideParamMap, paymentMethodCreateParams.overrideParamMap);
        }
        return false;
    }

    public final /* synthetic */ Set getAttribution$payments_core_release() {
        Set m11;
        if (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()] == 1) {
            Card card = this.card;
            Set<String> attribution$payments_core_release = card == null ? null : card.getAttribution$payments_core_release();
            if (attribution$payments_core_release == null) {
                attribution$payments_core_release = x0.d();
            }
            m11 = y0.m(attribution$payments_core_release, this.productUsage);
            return m11;
        }
        return this.productUsage;
    }

    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final Card getCard() {
        return this.card;
    }

    public final PaymentMethod.Type getType$payments_core_release() {
        return this.type;
    }

    public final String getTypeCode() {
        return this.type.code;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Card card = this.card;
        int hashCode2 = (hashCode + (card == null ? 0 : card.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int hashCode3 = (hashCode2 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int hashCode4 = (hashCode3 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int hashCode5 = (hashCode4 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int hashCode6 = (hashCode5 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int hashCode7 = (hashCode6 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Sofort sofort = this.sofort;
        int hashCode8 = (hashCode7 + (sofort == null ? 0 : sofort.hashCode())) * 31;
        Upi upi = this.upi;
        int hashCode9 = (hashCode8 + (upi == null ? 0 : upi.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int hashCode10 = (hashCode9 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        int hashCode11 = (hashCode10 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 31;
        Link link = this.link;
        int hashCode12 = (hashCode11 + (link == null ? 0 : link.hashCode())) * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        int hashCode13 = (hashCode12 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int hashCode14 = (((hashCode13 + (map == null ? 0 : map.hashCode())) * 31) + this.productUsage.hashCode()) * 31;
        Map<String, Object> map2 = this.overrideParamMap;
        return hashCode14 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map f11;
        Map p11;
        Map p12;
        Map<String, Object> p13;
        Map<String, Object> map = this.overrideParamMap;
        if (map == null) {
            f11 = r0.f(v.a("type", this.type.code));
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            Map f12 = billingDetails == null ? null : r0.f(v.a(PARAM_BILLING_DETAILS, billingDetails.toParamMap()));
            if (f12 == null) {
                f12 = s0.i();
            }
            p11 = s0.p(f11, f12);
            p12 = s0.p(p11, getTypeParams());
            Map<String, String> map2 = this.metadata;
            Map f13 = map2 != null ? r0.f(v.a(PARAM_METADATA, map2)) : null;
            if (f13 == null) {
                f13 = s0.i();
            }
            p13 = s0.p(p12, f13);
            return p13;
        }
        return map;
    }

    public String toString() {
        return "PaymentMethodCreateParams(type=" + this.type + ", card=" + this.card + ", ideal=" + this.ideal + ", fpx=" + this.fpx + ", sepaDebit=" + this.sepaDebit + ", auBecsDebit=" + this.auBecsDebit + ", bacsDebit=" + this.bacsDebit + ", sofort=" + this.sofort + ", upi=" + this.upi + ", netbanking=" + this.netbanking + ", usBankAccount=" + this.usBankAccount + ", link=" + this.link + ", billingDetails=" + this.billingDetails + ", metadata=" + this.metadata + ", productUsage=" + this.productUsage + ", overrideParamMap=" + this.overrideParamMap + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        this.type.writeToParcel(out, i11);
        Card card = this.card;
        if (card == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            card.writeToParcel(out, i11);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ideal.writeToParcel(out, i11);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            fpx.writeToParcel(out, i11);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sepaDebit.writeToParcel(out, i11);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            auBecsDebit.writeToParcel(out, i11);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bacsDebit.writeToParcel(out, i11);
        }
        Sofort sofort = this.sofort;
        if (sofort == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sofort.writeToParcel(out, i11);
        }
        Upi upi = this.upi;
        if (upi == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            upi.writeToParcel(out, i11);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            netbanking.writeToParcel(out, i11);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            uSBankAccount.writeToParcel(out, i11);
        }
        Link link = this.link;
        if (link == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            link.writeToParcel(out, i11);
        }
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            billingDetails.writeToParcel(out, i11);
        }
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
        Set<String> set = this.productUsage;
        out.writeInt(set.size());
        for (String str : set) {
            out.writeString(str);
        }
        Map<String, Object> map2 = this.overrideParamMap;
        if (map2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map2.size());
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            out.writeString(entry2.getKey());
            out.writeValue(entry2.getValue());
        }
    }

    /* loaded from: classes6.dex */
    public static final class Link implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_CONSUMER_SESSION_CLIENT_SECRET = "consumer_session_client_secret";
        @Deprecated
        private static final String PARAM_CREDENTIALS = "credentials";
        @Deprecated
        private static final String PARAM_PAYMENT_DETAILS_ID = "payment_details_id";
        private String consumerSessionClientSecret;
        private Map<String, ? extends Object> extraParams;
        private String paymentDetailsId;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Link> CREATOR = new Creator();
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
        public static final class Creator implements Parcelable.Creator<Link> {
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(Link.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Link(readString, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i11) {
                return new Link[i11];
            }
        }

        public Link(String paymentDetailsId, String consumerSessionClientSecret, Map<String, ? extends Object> map) {
            s.g(paymentDetailsId, "paymentDetailsId");
            s.g(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.paymentDetailsId = paymentDetailsId;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
            this.extraParams = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Link copy$default(Link link, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = link.paymentDetailsId;
            }
            if ((i11 & 2) != 0) {
                str2 = link.consumerSessionClientSecret;
            }
            if ((i11 & 4) != 0) {
                map = link.extraParams;
            }
            return link.copy(str, str2, map);
        }

        public final String component1$payments_core_release() {
            return this.paymentDetailsId;
        }

        public final String component2$payments_core_release() {
            return this.consumerSessionClientSecret;
        }

        public final Map<String, Object> component3$payments_core_release() {
            return this.extraParams;
        }

        public final Link copy(String paymentDetailsId, String consumerSessionClientSecret, Map<String, ? extends Object> map) {
            s.g(paymentDetailsId, "paymentDetailsId");
            s.g(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new Link(paymentDetailsId, consumerSessionClientSecret, map);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Link) {
                Link link = (Link) obj;
                return s.c(this.paymentDetailsId, link.paymentDetailsId) && s.c(this.consumerSessionClientSecret, link.consumerSessionClientSecret) && s.c(this.extraParams, link.extraParams);
            }
            return false;
        }

        public final String getConsumerSessionClientSecret$payments_core_release() {
            return this.consumerSessionClientSecret;
        }

        public final Map<String, Object> getExtraParams$payments_core_release() {
            return this.extraParams;
        }

        public final String getPaymentDetailsId$payments_core_release() {
            return this.paymentDetailsId;
        }

        public int hashCode() {
            int hashCode = ((this.paymentDetailsId.hashCode() * 31) + this.consumerSessionClientSecret.hashCode()) * 31;
            Map<String, ? extends Object> map = this.extraParams;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public final void setConsumerSessionClientSecret$payments_core_release(String str) {
            s.g(str, "<set-?>");
            this.consumerSessionClientSecret = str;
        }

        public final void setExtraParams$payments_core_release(Map<String, ? extends Object> map) {
            this.extraParams = map;
        }

        public final void setPaymentDetailsId$payments_core_release(String str) {
            s.g(str, "<set-?>");
            this.paymentDetailsId = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map f11;
            Map l11;
            Map<String, Object> p11;
            f11 = r0.f(v.a(PARAM_CONSUMER_SESSION_CLIENT_SECRET, this.consumerSessionClientSecret));
            l11 = s0.l(v.a(PARAM_PAYMENT_DETAILS_ID, this.paymentDetailsId), v.a(PARAM_CREDENTIALS, f11));
            Map<String, ? extends Object> map = this.extraParams;
            if (map == null) {
                map = s0.i();
            }
            p11 = s0.p(l11, map);
            return p11;
        }

        public String toString() {
            return "Link(paymentDetailsId=" + this.paymentDetailsId + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ", extraParams=" + this.extraParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.paymentDetailsId);
            out.writeString(this.consumerSessionClientSecret);
            Map<String, ? extends Object> map = this.extraParams;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeValue(entry.getValue());
            }
        }

        public /* synthetic */ Link(String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : map);
        }
    }

    /* loaded from: classes6.dex */
    public static final class USBankAccount implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        @Deprecated
        private static final String PARAM_ACCOUNT_NUMBER = "account_number";
        @Deprecated
        private static final String PARAM_ACCOUNT_TYPE = "account_type";
        @Deprecated
        private static final String PARAM_LINKED_ACCOUNT_SESSION_ID = "link_account_session";
        @Deprecated
        private static final String PARAM_ROUTING_NUMBER = "routing_number";
        private PaymentMethod.USBankAccount.USBankAccountHolderType accountHolderType;
        private String accountNumber;
        private PaymentMethod.USBankAccount.USBankAccountType accountType;
        private String linkAccountSessionId;
        private String routingNumber;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
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
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new USBankAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.USBankAccount.USBankAccountType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentMethod.USBankAccount.USBankAccountHolderType.CREATOR.createFromParcel(parcel) : null, null);
            }

            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i11) {
                return new USBankAccount[i11];
            }
        }

        private USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType) {
            this.linkAccountSessionId = str;
            this.accountNumber = str2;
            this.routingNumber = str3;
            this.accountType = uSBankAccountType;
            this.accountHolderType = uSBankAccountHolderType;
        }

        public /* synthetic */ USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, uSBankAccountType, uSBankAccountHolderType);
        }

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uSBankAccount.linkAccountSessionId;
            }
            if ((i11 & 2) != 0) {
                str2 = uSBankAccount.accountNumber;
            }
            String str4 = str2;
            if ((i11 & 4) != 0) {
                str3 = uSBankAccount.routingNumber;
            }
            String str5 = str3;
            if ((i11 & 8) != 0) {
                uSBankAccountType = uSBankAccount.accountType;
            }
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType2 = uSBankAccountType;
            if ((i11 & 16) != 0) {
                uSBankAccountHolderType = uSBankAccount.accountHolderType;
            }
            return uSBankAccount.copy(str, str4, str5, uSBankAccountType2, uSBankAccountHolderType);
        }

        public final String component1$payments_core_release() {
            return this.linkAccountSessionId;
        }

        public final String component2$payments_core_release() {
            return this.accountNumber;
        }

        public final String component3$payments_core_release() {
            return this.routingNumber;
        }

        public final PaymentMethod.USBankAccount.USBankAccountType component4$payments_core_release() {
            return this.accountType;
        }

        public final PaymentMethod.USBankAccount.USBankAccountHolderType component5$payments_core_release() {
            return this.accountHolderType;
        }

        public final USBankAccount copy(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType) {
            return new USBankAccount(str, str2, str3, uSBankAccountType, uSBankAccountHolderType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof USBankAccount) {
                USBankAccount uSBankAccount = (USBankAccount) obj;
                return s.c(this.linkAccountSessionId, uSBankAccount.linkAccountSessionId) && s.c(this.accountNumber, uSBankAccount.accountNumber) && s.c(this.routingNumber, uSBankAccount.routingNumber) && this.accountType == uSBankAccount.accountType && this.accountHolderType == uSBankAccount.accountHolderType;
            }
            return false;
        }

        public final PaymentMethod.USBankAccount.USBankAccountHolderType getAccountHolderType$payments_core_release() {
            return this.accountHolderType;
        }

        public final String getAccountNumber$payments_core_release() {
            return this.accountNumber;
        }

        public final PaymentMethod.USBankAccount.USBankAccountType getAccountType$payments_core_release() {
            return this.accountType;
        }

        public final String getLinkAccountSessionId$payments_core_release() {
            return this.linkAccountSessionId;
        }

        public final String getRoutingNumber$payments_core_release() {
            return this.routingNumber;
        }

        public int hashCode() {
            String str = this.linkAccountSessionId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountNumber;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.routingNumber;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            int hashCode4 = (hashCode3 + (uSBankAccountType == null ? 0 : uSBankAccountType.hashCode())) * 31;
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            return hashCode4 + (uSBankAccountHolderType != null ? uSBankAccountHolderType.hashCode() : 0);
        }

        public final void setAccountHolderType$payments_core_release(PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType) {
            this.accountHolderType = uSBankAccountHolderType;
        }

        public final void setAccountNumber$payments_core_release(String str) {
            this.accountNumber = str;
        }

        public final void setAccountType$payments_core_release(PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType) {
            this.accountType = uSBankAccountType;
        }

        public final void setLinkAccountSessionId$payments_core_release(String str) {
            this.linkAccountSessionId = str;
        }

        public final void setRoutingNumber$payments_core_release(String str) {
            this.routingNumber = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> l11;
            Map<String, Object> f11;
            String str = this.linkAccountSessionId;
            if (str != null) {
                s.e(str);
                f11 = r0.f(v.a(PARAM_LINKED_ACCOUNT_SESSION_ID, str));
                return f11;
            }
            String str2 = this.accountNumber;
            s.e(str2);
            String str3 = this.routingNumber;
            s.e(str3);
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            s.e(uSBankAccountType);
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            s.e(uSBankAccountHolderType);
            l11 = s0.l(v.a(PARAM_ACCOUNT_NUMBER, str2), v.a(PARAM_ROUTING_NUMBER, str3), v.a(PARAM_ACCOUNT_TYPE, uSBankAccountType.getValue()), v.a(PARAM_ACCOUNT_HOLDER_TYPE, uSBankAccountHolderType.getValue()));
            return l11;
        }

        public String toString() {
            return "USBankAccount(linkAccountSessionId=" + ((Object) this.linkAccountSessionId) + ", accountNumber=" + ((Object) this.accountNumber) + ", routingNumber=" + ((Object) this.routingNumber) + ", accountType=" + this.accountType + ", accountHolderType=" + this.accountHolderType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.linkAccountSessionId);
            out.writeString(this.accountNumber);
            out.writeString(this.routingNumber);
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            if (uSBankAccountType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                uSBankAccountType.writeToParcel(out, i11);
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            if (uSBankAccountHolderType == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            uSBankAccountHolderType.writeToParcel(out, i11);
        }

        /* synthetic */ USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : uSBankAccountType, (i11 & 16) != 0 ? null : uSBankAccountHolderType);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public USBankAccount(String linkAccountSessionId) {
            this(linkAccountSessionId, null, null, null, null);
            s.g(linkAccountSessionId, "linkAccountSessionId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public USBankAccount(String accountNumber, String routingNumber, PaymentMethod.USBankAccount.USBankAccountType accountType, PaymentMethod.USBankAccount.USBankAccountHolderType accountHolderType) {
            this(null, accountNumber, routingNumber, accountType, accountHolderType);
            s.g(accountNumber, "accountNumber");
            s.g(routingNumber, "routingNumber");
            s.g(accountType, "accountType");
            s.g(accountHolderType, "accountHolderType");
        }
    }

    /* loaded from: classes6.dex */
    public static final class Card implements StripeParamsModel, Parcelable {
        private static final String PARAM_CVC = "cvc";
        private static final String PARAM_EXP_MONTH = "exp_month";
        private static final String PARAM_EXP_YEAR = "exp_year";
        private static final String PARAM_NUMBER = "number";
        private static final String PARAM_TOKEN = "token";
        private final Set<String> attribution;
        private final String cvc;
        private final Integer expiryMonth;
        private final Integer expiryYear;
        private final String number;
        private final String token;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Card> {
            public static final int $stable = 8;
            private String cvc;
            private Integer expiryMonth;
            private Integer expiryYear;
            private String number;

            public final Builder setCvc(String str) {
                this.cvc = str;
                return this;
            }

            public final Builder setExpiryMonth(Integer num) {
                this.expiryMonth = num;
                return this;
            }

            public final Builder setExpiryYear(Integer num) {
                this.expiryYear = num;
                return this;
            }

            public final Builder setNumber(String str) {
                this.number = str;
                return this;
            }

            @Override // com.stripe.android.ObjectBuilder
            public Card build() {
                return new Card(this.number, this.expiryMonth, this.expiryYear, this.cvc, null, null, 48, null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Card create(String token) {
                s.g(token, "token");
                return new Card(null, null, null, null, token, null, 46, null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                LinkedHashSet linkedHashSet = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                }
                return new Card(readString, valueOf, valueOf2, readString2, readString3, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        public Card() {
            this(null, null, null, null, null, null, 63, null);
        }

        public Card(String str, Integer num, Integer num2, String str2, String str3, Set<String> set) {
            this.number = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.cvc = str2;
            this.token = str3;
            this.attribution = set;
        }

        private final String component5() {
            return this.token;
        }

        public static /* synthetic */ Card copy$default(Card card, String str, Integer num, Integer num2, String str2, String str3, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = card.number;
            }
            if ((i11 & 2) != 0) {
                num = card.expiryMonth;
            }
            Integer num3 = num;
            if ((i11 & 4) != 0) {
                num2 = card.expiryYear;
            }
            Integer num4 = num2;
            if ((i11 & 8) != 0) {
                str2 = card.cvc;
            }
            String str4 = str2;
            if ((i11 & 16) != 0) {
                str3 = card.token;
            }
            String str5 = str3;
            Set<String> set2 = set;
            if ((i11 & 32) != 0) {
                set2 = card.attribution;
            }
            return card.copy(str, num3, num4, str4, str5, set2);
        }

        public static final Card create(String str) {
            return Companion.create(str);
        }

        public final String component1$payments_core_release() {
            return this.number;
        }

        public final Integer component2$payments_core_release() {
            return this.expiryMonth;
        }

        public final Integer component3$payments_core_release() {
            return this.expiryYear;
        }

        public final String component4$payments_core_release() {
            return this.cvc;
        }

        public final Set<String> component6$payments_core_release() {
            return this.attribution;
        }

        public final Card copy(String str, Integer num, Integer num2, String str2, String str3, Set<String> set) {
            return new Card(str, num, num2, str2, str3, set);
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
                return s.c(this.number, card.number) && s.c(this.expiryMonth, card.expiryMonth) && s.c(this.expiryYear, card.expiryYear) && s.c(this.cvc, card.cvc) && s.c(this.token, card.token) && s.c(this.attribution, card.attribution);
            }
            return false;
        }

        public final Set<String> getAttribution$payments_core_release() {
            return this.attribution;
        }

        public final CardBrand getBrand$payments_core_release() {
            return CardUtils.getPossibleCardBrand(this.number);
        }

        public final String getCvc$payments_core_release() {
            return this.cvc;
        }

        public final Integer getExpiryMonth$payments_core_release() {
            return this.expiryMonth;
        }

        public final Integer getExpiryYear$payments_core_release() {
            return this.expiryYear;
        }

        public final String getLast4() {
            return getLast4$payments_core_release();
        }

        public final String getLast4$payments_core_release() {
            String j12;
            String str = this.number;
            if (str == null) {
                return null;
            }
            j12 = y.j1(str, 4);
            return j12;
        }

        public final String getNumber$payments_core_release() {
            return this.number;
        }

        public int hashCode() {
            String str = this.number;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.expiryMonth;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.cvc;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.token;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Set<String> set = this.attribution;
            return hashCode5 + (set != null ? set.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<p> l11;
            Map<String, Object> t11;
            l11 = w.l(v.a(PARAM_NUMBER, this.number), v.a(PARAM_EXP_MONTH, this.expiryMonth), v.a(PARAM_EXP_YEAR, this.expiryYear), v.a(PARAM_CVC, this.cvc), v.a(PARAM_TOKEN, this.token));
            ArrayList arrayList = new ArrayList();
            for (p pVar : l11) {
                Object d11 = pVar.d();
                p a11 = d11 == null ? null : v.a(pVar.c(), d11);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            t11 = s0.t(arrayList);
            return t11;
        }

        public String toString() {
            return "Card(number=" + ((Object) this.number) + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", cvc=" + ((Object) this.cvc) + ", token=" + ((Object) this.token) + ", attribution=" + this.attribution + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.number);
            Integer num = this.expiryMonth;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.cvc);
            out.writeString(this.token);
            Set<String> set = this.attribution;
            if (set == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
        }

        public /* synthetic */ Card(String str, Integer num, Integer num2, String str2, String str3, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : set);
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(PaymentMethod.Type type, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, PaymentMethod.BillingDetails billingDetails, Map map, Set set, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i11 & 2) != 0 ? null : card, (i11 & 4) != 0 ? null : ideal, (i11 & 8) != 0 ? null : fpx, (i11 & 16) != 0 ? null : sepaDebit, (i11 & 32) != 0 ? null : auBecsDebit, (i11 & 64) != 0 ? null : bacsDebit, (i11 & 128) != 0 ? null : sofort, (i11 & 256) != 0 ? null : upi, (i11 & 512) != 0 ? null : netbanking, (i11 & 1024) != 0 ? null : uSBankAccount, (i11 & 2048) != 0 ? null : link, (i11 & 4096) != 0 ? null : billingDetails, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : map, (i11 & 16384) != 0 ? x0.d() : set, (i11 & 32768) == 0 ? map2 : null);
    }

    private PaymentMethodCreateParams(Card card, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Card, card, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53244, null);
    }

    private PaymentMethodCreateParams(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Ideal, null, ideal, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53242, null);
    }

    private PaymentMethodCreateParams(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Fpx, null, null, fpx, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 53238, null);
    }

    private PaymentMethodCreateParams(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.SepaDebit, null, null, null, sepaDebit, null, null, null, null, null, null, null, billingDetails, map, null, null, 53230, null);
    }

    private PaymentMethodCreateParams(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.AuBecsDebit, null, null, null, null, auBecsDebit, null, null, null, null, null, null, billingDetails, map, null, null, 53214, null);
    }

    private PaymentMethodCreateParams(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.BacsDebit, null, null, null, null, null, bacsDebit, null, null, null, null, null, billingDetails, map, null, null, 53182, null);
    }

    private PaymentMethodCreateParams(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Sofort, null, null, null, null, null, null, sofort, null, null, null, null, billingDetails, map, null, null, 53118, null);
    }

    private PaymentMethodCreateParams(Upi upi, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Upi, null, null, null, null, null, null, null, upi, null, null, null, billingDetails, map, null, null, 52990, null);
    }

    private PaymentMethodCreateParams(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Netbanking, null, null, null, null, null, null, null, null, netbanking, null, null, billingDetails, map, null, null, 52734, null);
    }

    private PaymentMethodCreateParams(USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.USBankAccount, null, null, null, null, null, null, null, null, null, uSBankAccount, null, billingDetails, map, null, null, 52222, null);
    }
}