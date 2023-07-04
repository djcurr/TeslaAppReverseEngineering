package com.stripe.android;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.link.injection.NamedConstantsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;
import wz.e0;
import wz.v;
import wz.w;
import wz.x;
import wz.x0;

/* loaded from: classes2.dex */
public final class GooglePayJsonFactory {
    public static final int $stable = 0;
    @Deprecated
    private static final List<String> ALLOWED_AUTH_METHODS;
    @Deprecated
    private static final int API_VERSION = 2;
    @Deprecated
    private static final int API_VERSION_MINOR = 0;
    @Deprecated
    private static final String CARD_PAYMENT_METHOD = "CARD";
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final List<String> DEFAULT_CARD_NETWORKS;
    @Deprecated
    private static final String JCB_CARD_NETWORK = "JCB";
    private final GooglePayConfig googlePayConfig;
    private final boolean isJcbEnabled;

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List<String> l11;
        List<String> l12;
        l11 = w.l("PAN_ONLY", "CRYPTOGRAM_3DS");
        ALLOWED_AUTH_METHODS = l11;
        l12 = w.l("AMEX", "DISCOVER", "MASTERCARD", "VISA");
        DEFAULT_CARD_NETWORKS = l12;
    }

    public GooglePayJsonFactory(GooglePayConfig googlePayConfig, boolean z11) {
        s.g(googlePayConfig, "googlePayConfig");
        this.googlePayConfig = googlePayConfig;
        this.isJcbEnabled = z11;
    }

    private final JSONObject createBaseCardPaymentMethodParams() {
        List d11;
        List y02;
        JSONObject put = new JSONObject().put("allowedAuthMethods", new JSONArray((Collection) ALLOWED_AUTH_METHODS));
        List<String> list = DEFAULT_CARD_NETWORKS;
        d11 = v.d(JCB_CARD_NETWORK);
        if (!this.isJcbEnabled) {
            d11 = null;
        }
        if (d11 == null) {
            d11 = w.i();
        }
        y02 = e0.y0(list, d11);
        JSONObject put2 = put.put("allowedCardNetworks", new JSONArray((Collection) y02));
        s.f(put2, "JSONObject()\n           …          )\n            )");
        return put2;
    }

    private final JSONObject createCardPaymentMethod(BillingAddressParameters billingAddressParameters, Boolean bool) {
        JSONObject createBaseCardPaymentMethodParams = createBaseCardPaymentMethodParams();
        boolean z11 = false;
        if (billingAddressParameters != null && billingAddressParameters.isRequired$payments_core_release()) {
            z11 = true;
        }
        if (z11) {
            createBaseCardPaymentMethodParams.put("billingAddressRequired", true);
            createBaseCardPaymentMethodParams.put("billingAddressParameters", new JSONObject().put("phoneNumberRequired", billingAddressParameters.isPhoneNumberRequired$payments_core_release()).put("format", billingAddressParameters.getFormat$payments_core_release().getCode$payments_core_release()));
        }
        if (bool != null) {
            createBaseCardPaymentMethodParams.put("allowCreditCards", bool.booleanValue());
        }
        JSONObject put = new JSONObject().put("type", CARD_PAYMENT_METHOD).put("parameters", createBaseCardPaymentMethodParams).put("tokenizationSpecification", this.googlePayConfig.getTokenizationSpecification());
        s.f(put, "JSONObject()\n           …okenizationSpecification)");
        return put;
    }

    public static /* synthetic */ JSONObject createIsReadyToPayRequest$default(GooglePayJsonFactory googlePayJsonFactory, BillingAddressParameters billingAddressParameters, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            billingAddressParameters = null;
        }
        if ((i11 & 2) != 0) {
            bool = null;
        }
        if ((i11 & 4) != 0) {
            bool2 = null;
        }
        return googlePayJsonFactory.createIsReadyToPayRequest(billingAddressParameters, bool, bool2);
    }

    public static /* synthetic */ JSONObject createPaymentDataRequest$default(GooglePayJsonFactory googlePayJsonFactory, TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z11, MerchantInfo merchantInfo, Boolean bool, int i11, Object obj) {
        return googlePayJsonFactory.createPaymentDataRequest(transactionInfo, (i11 & 2) != 0 ? null : billingAddressParameters, (i11 & 4) != 0 ? null : shippingAddressParameters, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : merchantInfo, (i11 & 32) == 0 ? bool : null);
    }

    private final JSONObject createShippingAddressParameters(ShippingAddressParameters shippingAddressParameters) {
        JSONObject put = new JSONObject().put("allowedCountryCodes", new JSONArray((Collection) shippingAddressParameters.getNormalizedAllowedCountryCodes$payments_core_release())).put("phoneNumberRequired", shippingAddressParameters.getPhoneNumberRequired$payments_core_release());
        s.f(put, "JSONObject()\n           …berRequired\n            )");
        return put;
    }

    private final JSONObject createTransactionInfo(TransactionInfo transactionInfo) {
        JSONObject jSONObject = new JSONObject();
        String currencyCode$payments_core_release = transactionInfo.getCurrencyCode$payments_core_release();
        Locale locale = Locale.ROOT;
        String upperCase = currencyCode$payments_core_release.toUpperCase(locale);
        s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        JSONObject put = jSONObject.put("currencyCode", upperCase).put("totalPriceStatus", transactionInfo.getTotalPriceStatus$payments_core_release().getCode$payments_core_release());
        String countryCode$payments_core_release = transactionInfo.getCountryCode$payments_core_release();
        if (countryCode$payments_core_release != null) {
            String upperCase2 = countryCode$payments_core_release.toUpperCase(locale);
            s.f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            put.put("countryCode", upperCase2);
        }
        String transactionId$payments_core_release = transactionInfo.getTransactionId$payments_core_release();
        if (transactionId$payments_core_release != null) {
            put.put("transactionId", transactionId$payments_core_release);
        }
        Integer totalPrice$payments_core_release = transactionInfo.getTotalPrice$payments_core_release();
        if (totalPrice$payments_core_release != null) {
            int intValue = totalPrice$payments_core_release.intValue();
            String upperCase3 = transactionInfo.getCurrencyCode$payments_core_release().toUpperCase(locale);
            s.f(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Currency currency = Currency.getInstance(upperCase3);
            s.f(currency, "getInstance(\n           …                        )");
            put.put("totalPrice", PayWithGoogleUtils.getPriceString(intValue, currency));
        }
        String totalPriceLabel$payments_core_release = transactionInfo.getTotalPriceLabel$payments_core_release();
        if (totalPriceLabel$payments_core_release != null) {
            put.put("totalPriceLabel", totalPriceLabel$payments_core_release);
        }
        TransactionInfo.CheckoutOption checkoutOption$payments_core_release = transactionInfo.getCheckoutOption$payments_core_release();
        if (checkoutOption$payments_core_release != null) {
            put.put("checkoutOption", checkoutOption$payments_core_release.getCode$payments_core_release());
        }
        s.f(put, "JSONObject()\n           …          }\n            }");
        return put;
    }

    public final JSONObject createIsReadyToPayRequest() {
        return createIsReadyToPayRequest$default(this, null, null, null, 7, null);
    }

    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters) {
        return createIsReadyToPayRequest$default(this, billingAddressParameters, null, null, 6, null);
    }

    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters, Boolean bool) {
        return createIsReadyToPayRequest$default(this, billingAddressParameters, bool, null, 4, null);
    }

    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters, Boolean bool, Boolean bool2) {
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(createCardPaymentMethod(billingAddressParameters, bool2)));
        if (bool != null) {
            put.put("existingPaymentMethodRequired", bool.booleanValue());
        }
        s.f(put, "JSONObject()\n           …          }\n            }");
        return put;
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo) {
        s.g(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, null, null, false, null, null, 62, null);
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters) {
        s.g(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, null, false, null, null, 60, null);
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters) {
        s.g(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, shippingAddressParameters, false, null, null, 56, null);
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z11) {
        s.g(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, shippingAddressParameters, z11, null, null, 48, null);
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z11, MerchantInfo merchantInfo) {
        s.g(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, shippingAddressParameters, z11, merchantInfo, null, 32, null);
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z11, MerchantInfo merchantInfo, Boolean bool) {
        s.g(transactionInfo, "transactionInfo");
        boolean z12 = false;
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(createCardPaymentMethod(billingAddressParameters, bool))).put("transactionInfo", createTransactionInfo(transactionInfo)).put("emailRequired", z11);
        if (shippingAddressParameters != null && shippingAddressParameters.isRequired$payments_core_release()) {
            put.put("shippingAddressRequired", true);
            put.put("shippingAddressParameters", createShippingAddressParameters(shippingAddressParameters));
        }
        if (merchantInfo != null) {
            String merchantName$payments_core_release = merchantInfo.getMerchantName$payments_core_release();
            if (merchantName$payments_core_release == null || merchantName$payments_core_release.length() == 0) {
                z12 = true;
            }
            if (!z12) {
                put.put("merchantInfo", new JSONObject().put(NamedConstantsKt.MERCHANT_NAME, merchantInfo.getMerchantName$payments_core_release()));
            }
        }
        s.f(put, "JSONObject()\n           …          }\n            }");
        return put;
    }

    /* loaded from: classes2.dex */
    public static final class MerchantInfo implements Parcelable {
        private final String merchantName;
        public static final Parcelable.Creator<MerchantInfo> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<MerchantInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantInfo createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new MerchantInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantInfo[] newArray(int i11) {
                return new MerchantInfo[i11];
            }
        }

        public MerchantInfo() {
            this(null, 1, null);
        }

        public MerchantInfo(String str) {
            this.merchantName = str;
        }

        public static /* synthetic */ MerchantInfo copy$default(MerchantInfo merchantInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = merchantInfo.merchantName;
            }
            return merchantInfo.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.merchantName;
        }

        public final MerchantInfo copy(String str) {
            return new MerchantInfo(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MerchantInfo) && s.c(this.merchantName, ((MerchantInfo) obj).merchantName);
        }

        public final String getMerchantName$payments_core_release() {
            return this.merchantName;
        }

        public int hashCode() {
            String str = this.merchantName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MerchantInfo(merchantName=" + ((Object) this.merchantName) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.merchantName);
        }

        public /* synthetic */ MerchantInfo(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class BillingAddressParameters implements Parcelable {
        private final Format format;
        private final boolean isPhoneNumberRequired;
        private final boolean isRequired;
        public static final Parcelable.Creator<BillingAddressParameters> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<BillingAddressParameters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressParameters createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new BillingAddressParameters(parcel.readInt() != 0, Format.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressParameters[] newArray(int i11) {
                return new BillingAddressParameters[i11];
            }
        }

        /* loaded from: classes2.dex */
        public enum Format {
            Min("MIN"),
            Full("FULL");
            
            private final String code;

            Format(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        public BillingAddressParameters() {
            this(false, null, false, 7, null);
        }

        public BillingAddressParameters(boolean z11) {
            this(z11, null, false, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public BillingAddressParameters(boolean z11, Format format) {
            this(z11, format, false, 4, null);
            s.g(format, "format");
        }

        public BillingAddressParameters(boolean z11, Format format, boolean z12) {
            s.g(format, "format");
            this.isRequired = z11;
            this.format = format;
            this.isPhoneNumberRequired = z12;
        }

        public static /* synthetic */ BillingAddressParameters copy$default(BillingAddressParameters billingAddressParameters, boolean z11, Format format, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = billingAddressParameters.isRequired;
            }
            if ((i11 & 2) != 0) {
                format = billingAddressParameters.format;
            }
            if ((i11 & 4) != 0) {
                z12 = billingAddressParameters.isPhoneNumberRequired;
            }
            return billingAddressParameters.copy(z11, format, z12);
        }

        public final boolean component1$payments_core_release() {
            return this.isRequired;
        }

        public final Format component2$payments_core_release() {
            return this.format;
        }

        public final boolean component3$payments_core_release() {
            return this.isPhoneNumberRequired;
        }

        public final BillingAddressParameters copy(boolean z11, Format format, boolean z12) {
            s.g(format, "format");
            return new BillingAddressParameters(z11, format, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingAddressParameters) {
                BillingAddressParameters billingAddressParameters = (BillingAddressParameters) obj;
                return this.isRequired == billingAddressParameters.isRequired && this.format == billingAddressParameters.format && this.isPhoneNumberRequired == billingAddressParameters.isPhoneNumberRequired;
            }
            return false;
        }

        public final Format getFormat$payments_core_release() {
            return this.format;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z11 = this.isRequired;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int hashCode = ((r02 * 31) + this.format.hashCode()) * 31;
            boolean z12 = this.isPhoneNumberRequired;
            return hashCode + (z12 ? 1 : z12 ? 1 : 0);
        }

        public final boolean isPhoneNumberRequired$payments_core_release() {
            return this.isPhoneNumberRequired;
        }

        public final boolean isRequired$payments_core_release() {
            return this.isRequired;
        }

        public String toString() {
            return "BillingAddressParameters(isRequired=" + this.isRequired + ", format=" + this.format + ", isPhoneNumberRequired=" + this.isPhoneNumberRequired + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(this.isRequired ? 1 : 0);
            out.writeString(this.format.name());
            out.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }

        public /* synthetic */ BillingAddressParameters(boolean z11, Format format, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? Format.Min : format, (i11 & 4) != 0 ? false : z12);
        }
    }

    public /* synthetic */ GooglePayJsonFactory(GooglePayConfig googlePayConfig, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(googlePayConfig, (i11 & 2) != 0 ? false : z11);
    }

    public /* synthetic */ GooglePayJsonFactory(Context context, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayJsonFactory(Context context, boolean z11) {
        this(new GooglePayConfig(context), z11);
        s.g(context, "context");
    }

    /* loaded from: classes2.dex */
    public static final class TransactionInfo implements Parcelable {
        private final CheckoutOption checkoutOption;
        private final String countryCode;
        private final String currencyCode;
        private final Integer totalPrice;
        private final String totalPriceLabel;
        private final TotalPriceStatus totalPriceStatus;
        private final String transactionId;
        public static final Parcelable.Creator<TransactionInfo> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes2.dex */
        public enum CheckoutOption {
            Default("DEFAULT"),
            CompleteImmediatePurchase("COMPLETE_IMMEDIATE_PURCHASE");
            
            private final String code;

            CheckoutOption(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<TransactionInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionInfo createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new TransactionInfo(parcel.readString(), TotalPriceStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : CheckoutOption.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionInfo[] newArray(int i11) {
                return new TransactionInfo[i11];
            }
        }

        /* loaded from: classes2.dex */
        public enum TotalPriceStatus {
            NotCurrentlyKnown("NOT_CURRENTLY_KNOWN"),
            Estimated("ESTIMATED"),
            Final("FINAL");
            
            private final String code;

            TotalPriceStatus(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus) {
            this(currencyCode, totalPriceStatus, null, null, null, null, null, 124, null);
            s.g(currencyCode, "currencyCode");
            s.g(totalPriceStatus, "totalPriceStatus");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str) {
            this(currencyCode, totalPriceStatus, str, null, null, null, null, 120, null);
            s.g(currencyCode, "currencyCode");
            s.g(totalPriceStatus, "totalPriceStatus");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2) {
            this(currencyCode, totalPriceStatus, str, str2, null, null, null, 112, null);
            s.g(currencyCode, "currencyCode");
            s.g(totalPriceStatus, "totalPriceStatus");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2, Integer num) {
            this(currencyCode, totalPriceStatus, str, str2, num, null, null, 96, null);
            s.g(currencyCode, "currencyCode");
            s.g(totalPriceStatus, "totalPriceStatus");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2, Integer num, String str3) {
            this(currencyCode, totalPriceStatus, str, str2, num, str3, null, 64, null);
            s.g(currencyCode, "currencyCode");
            s.g(totalPriceStatus, "totalPriceStatus");
        }

        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2, Integer num, String str3, CheckoutOption checkoutOption) {
            s.g(currencyCode, "currencyCode");
            s.g(totalPriceStatus, "totalPriceStatus");
            this.currencyCode = currencyCode;
            this.totalPriceStatus = totalPriceStatus;
            this.countryCode = str;
            this.transactionId = str2;
            this.totalPrice = num;
            this.totalPriceLabel = str3;
            this.checkoutOption = checkoutOption;
        }

        public static /* synthetic */ TransactionInfo copy$default(TransactionInfo transactionInfo, String str, TotalPriceStatus totalPriceStatus, String str2, String str3, Integer num, String str4, CheckoutOption checkoutOption, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = transactionInfo.currencyCode;
            }
            if ((i11 & 2) != 0) {
                totalPriceStatus = transactionInfo.totalPriceStatus;
            }
            TotalPriceStatus totalPriceStatus2 = totalPriceStatus;
            if ((i11 & 4) != 0) {
                str2 = transactionInfo.countryCode;
            }
            String str5 = str2;
            if ((i11 & 8) != 0) {
                str3 = transactionInfo.transactionId;
            }
            String str6 = str3;
            if ((i11 & 16) != 0) {
                num = transactionInfo.totalPrice;
            }
            Integer num2 = num;
            if ((i11 & 32) != 0) {
                str4 = transactionInfo.totalPriceLabel;
            }
            String str7 = str4;
            if ((i11 & 64) != 0) {
                checkoutOption = transactionInfo.checkoutOption;
            }
            return transactionInfo.copy(str, totalPriceStatus2, str5, str6, num2, str7, checkoutOption);
        }

        public final String component1$payments_core_release() {
            return this.currencyCode;
        }

        public final TotalPriceStatus component2$payments_core_release() {
            return this.totalPriceStatus;
        }

        public final String component3$payments_core_release() {
            return this.countryCode;
        }

        public final String component4$payments_core_release() {
            return this.transactionId;
        }

        public final Integer component5$payments_core_release() {
            return this.totalPrice;
        }

        public final String component6$payments_core_release() {
            return this.totalPriceLabel;
        }

        public final CheckoutOption component7$payments_core_release() {
            return this.checkoutOption;
        }

        public final TransactionInfo copy(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2, Integer num, String str3, CheckoutOption checkoutOption) {
            s.g(currencyCode, "currencyCode");
            s.g(totalPriceStatus, "totalPriceStatus");
            return new TransactionInfo(currencyCode, totalPriceStatus, str, str2, num, str3, checkoutOption);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TransactionInfo) {
                TransactionInfo transactionInfo = (TransactionInfo) obj;
                return s.c(this.currencyCode, transactionInfo.currencyCode) && this.totalPriceStatus == transactionInfo.totalPriceStatus && s.c(this.countryCode, transactionInfo.countryCode) && s.c(this.transactionId, transactionInfo.transactionId) && s.c(this.totalPrice, transactionInfo.totalPrice) && s.c(this.totalPriceLabel, transactionInfo.totalPriceLabel) && this.checkoutOption == transactionInfo.checkoutOption;
            }
            return false;
        }

        public final CheckoutOption getCheckoutOption$payments_core_release() {
            return this.checkoutOption;
        }

        public final String getCountryCode$payments_core_release() {
            return this.countryCode;
        }

        public final String getCurrencyCode$payments_core_release() {
            return this.currencyCode;
        }

        public final Integer getTotalPrice$payments_core_release() {
            return this.totalPrice;
        }

        public final String getTotalPriceLabel$payments_core_release() {
            return this.totalPriceLabel;
        }

        public final TotalPriceStatus getTotalPriceStatus$payments_core_release() {
            return this.totalPriceStatus;
        }

        public final String getTransactionId$payments_core_release() {
            return this.transactionId;
        }

        public int hashCode() {
            int hashCode = ((this.currencyCode.hashCode() * 31) + this.totalPriceStatus.hashCode()) * 31;
            String str = this.countryCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.totalPrice;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.totalPriceLabel;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CheckoutOption checkoutOption = this.checkoutOption;
            return hashCode5 + (checkoutOption != null ? checkoutOption.hashCode() : 0);
        }

        public String toString() {
            return "TransactionInfo(currencyCode=" + this.currencyCode + ", totalPriceStatus=" + this.totalPriceStatus + ", countryCode=" + ((Object) this.countryCode) + ", transactionId=" + ((Object) this.transactionId) + ", totalPrice=" + this.totalPrice + ", totalPriceLabel=" + ((Object) this.totalPriceLabel) + ", checkoutOption=" + this.checkoutOption + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.currencyCode);
            out.writeString(this.totalPriceStatus.name());
            out.writeString(this.countryCode);
            out.writeString(this.transactionId);
            Integer num = this.totalPrice;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.totalPriceLabel);
            CheckoutOption checkoutOption = this.checkoutOption;
            if (checkoutOption == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(checkoutOption.name());
        }

        public /* synthetic */ TransactionInfo(String str, TotalPriceStatus totalPriceStatus, String str2, String str3, Integer num, String str4, CheckoutOption checkoutOption, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, totalPriceStatus, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : checkoutOption);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayJsonFactory(h00.a<String> publishableKeyProvider, h00.a<String> stripeAccountIdProvider, GooglePayPaymentMethodLauncher.Config googlePayConfig) {
        this(new GooglePayConfig(publishableKeyProvider.invoke(), stripeAccountIdProvider.invoke()), googlePayConfig.isJcbEnabled$payments_core_release());
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(stripeAccountIdProvider, "stripeAccountIdProvider");
        s.g(googlePayConfig, "googlePayConfig");
    }

    /* loaded from: classes2.dex */
    public static final class ShippingAddressParameters implements Parcelable {
        private final Set<String> allowedCountryCodes;
        private final boolean isRequired;
        private final boolean phoneNumberRequired;
        public static final Parcelable.Creator<ShippingAddressParameters> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ShippingAddressParameters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingAddressParameters createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                boolean z11 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new ShippingAddressParameters(z11, linkedHashSet, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingAddressParameters[] newArray(int i11) {
                return new ShippingAddressParameters[i11];
            }
        }

        public ShippingAddressParameters() {
            this(false, null, false, 7, null);
        }

        public ShippingAddressParameters(boolean z11) {
            this(z11, null, false, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ShippingAddressParameters(boolean z11, Set<String> allowedCountryCodes) {
            this(z11, allowedCountryCodes, false, 4, null);
            s.g(allowedCountryCodes, "allowedCountryCodes");
        }

        public ShippingAddressParameters(boolean z11, Set<String> allowedCountryCodes, boolean z12) {
            s.g(allowedCountryCodes, "allowedCountryCodes");
            this.isRequired = z11;
            this.allowedCountryCodes = allowedCountryCodes;
            this.phoneNumberRequired = z12;
            String[] countryCodes = Locale.getISOCountries();
            for (String str : getNormalizedAllowedCountryCodes$payments_core_release()) {
                s.f(countryCodes, "countryCodes");
                int length = countryCodes.length;
                boolean z13 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (s.c(str, countryCodes[i11])) {
                        z13 = true;
                        continue;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (!z13) {
                    throw new IllegalArgumentException((CoreConstants.SINGLE_QUOTE_CHAR + str + "' is not a valid country code").toString());
                }
            }
        }

        private final Set<String> component2() {
            return this.allowedCountryCodes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShippingAddressParameters copy$default(ShippingAddressParameters shippingAddressParameters, boolean z11, Set set, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = shippingAddressParameters.isRequired;
            }
            if ((i11 & 2) != 0) {
                set = shippingAddressParameters.allowedCountryCodes;
            }
            if ((i11 & 4) != 0) {
                z12 = shippingAddressParameters.phoneNumberRequired;
            }
            return shippingAddressParameters.copy(z11, set, z12);
        }

        public final boolean component1$payments_core_release() {
            return this.isRequired;
        }

        public final boolean component3$payments_core_release() {
            return this.phoneNumberRequired;
        }

        public final ShippingAddressParameters copy(boolean z11, Set<String> allowedCountryCodes, boolean z12) {
            s.g(allowedCountryCodes, "allowedCountryCodes");
            return new ShippingAddressParameters(z11, allowedCountryCodes, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ShippingAddressParameters) {
                ShippingAddressParameters shippingAddressParameters = (ShippingAddressParameters) obj;
                return this.isRequired == shippingAddressParameters.isRequired && s.c(this.allowedCountryCodes, shippingAddressParameters.allowedCountryCodes) && this.phoneNumberRequired == shippingAddressParameters.phoneNumberRequired;
            }
            return false;
        }

        public final Set<String> getNormalizedAllowedCountryCodes$payments_core_release() {
            int t11;
            Set<String> S0;
            Set<String> set = this.allowedCountryCodes;
            t11 = x.t(set, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (String str : set) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                arrayList.add(upperCase);
            }
            S0 = e0.S0(arrayList);
            return S0;
        }

        public final boolean getPhoneNumberRequired$payments_core_release() {
            return this.phoneNumberRequired;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z11 = this.isRequired;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int hashCode = ((r02 * 31) + this.allowedCountryCodes.hashCode()) * 31;
            boolean z12 = this.phoneNumberRequired;
            return hashCode + (z12 ? 1 : z12 ? 1 : 0);
        }

        public final boolean isRequired$payments_core_release() {
            return this.isRequired;
        }

        public String toString() {
            return "ShippingAddressParameters(isRequired=" + this.isRequired + ", allowedCountryCodes=" + this.allowedCountryCodes + ", phoneNumberRequired=" + this.phoneNumberRequired + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(this.isRequired ? 1 : 0);
            Set<String> set = this.allowedCountryCodes;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
            out.writeInt(this.phoneNumberRequired ? 1 : 0);
        }

        public /* synthetic */ ShippingAddressParameters(boolean z11, Set set, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? x0.d() : set, (i11 & 4) != 0 ? false : z12);
        }
    }
}