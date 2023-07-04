package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.response.RedirectAction;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.SourceJsonParser;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class Source implements StripeModel, StripePaymentSource {
    public static final String EURO = "eur";
    public static final String USD = "usd";
    private final Klarna _klarna;
    private final WeChat _weChat;
    private final Long amount;
    private final String clientSecret;
    private final CodeVerification codeVerification;
    private final Long created;
    private final String currency;
    private final Flow flow;

    /* renamed from: id  reason: collision with root package name */
    private final String f20936id;
    private final Boolean isLiveMode;
    private final Owner owner;
    private final Receiver receiver;
    private final Redirect redirect;
    private final SourceOrder sourceOrder;
    private final Map<String, Object> sourceTypeData;
    private final SourceTypeModel sourceTypeModel;
    private final String statementDescriptor;
    private final Status status;
    private final String type;
    private final String typeRaw;
    private final Usage usage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Source> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class CodeVerification implements StripeModel {
        private final int attemptsRemaining;
        private final Status status;
        public static final Parcelable.Creator<CodeVerification> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<CodeVerification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodeVerification createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new CodeVerification(parcel.readInt(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodeVerification[] newArray(int i11) {
                return new CodeVerification[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum Status {
            Pending("pending"),
            Succeeded("succeeded"),
            Failed("failed");
            
            public static final Companion Companion = new Companion(null);
            private final String code;

            /* loaded from: classes6.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Status fromCode(String str) {
                    Status[] values;
                    for (Status status : Status.values()) {
                        if (s.c(status.code, str)) {
                            return status;
                        }
                    }
                    return null;
                }
            }

            Status(String str) {
                this.code = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }
        }

        public CodeVerification(int i11, Status status) {
            this.attemptsRemaining = i11;
            this.status = status;
        }

        public static /* synthetic */ CodeVerification copy$default(CodeVerification codeVerification, int i11, Status status, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = codeVerification.attemptsRemaining;
            }
            if ((i12 & 2) != 0) {
                status = codeVerification.status;
            }
            return codeVerification.copy(i11, status);
        }

        public final int component1() {
            return this.attemptsRemaining;
        }

        public final Status component2() {
            return this.status;
        }

        public final CodeVerification copy(int i11, Status status) {
            return new CodeVerification(i11, status);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CodeVerification) {
                CodeVerification codeVerification = (CodeVerification) obj;
                return this.attemptsRemaining == codeVerification.attemptsRemaining && this.status == codeVerification.status;
            }
            return false;
        }

        public final int getAttemptsRemaining() {
            return this.attemptsRemaining;
        }

        public final Status getStatus() {
            return this.status;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int hashCode = Integer.hashCode(this.attemptsRemaining) * 31;
            Status status = this.status;
            return hashCode + (status == null ? 0 : status.hashCode());
        }

        public String toString() {
            return "CodeVerification(attemptsRemaining=" + this.attemptsRemaining + ", status=" + this.status + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(this.attemptsRemaining);
            Status status = this.status;
            if (status == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(status.name());
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String asSourceType(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1920743119:
                        if (str.equals("bancontact")) {
                            return "bancontact";
                        }
                        break;
                    case -1414960566:
                        if (str.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -896955097:
                        if (str.equals("sofort")) {
                            return "sofort";
                        }
                        break;
                    case -825238221:
                        if (str.equals("three_d_secure")) {
                            return "three_d_secure";
                        }
                        break;
                    case -791770330:
                        if (str.equals("wechat")) {
                            return "wechat";
                        }
                        break;
                    case -284840886:
                        str.equals("unknown");
                        break;
                    case 100648:
                        if (str.equals("eps")) {
                            return "eps";
                        }
                        break;
                    case 109234:
                        if (str.equals("p24")) {
                            return "p24";
                        }
                        break;
                    case 3046160:
                        if (str.equals("card")) {
                            return "card";
                        }
                        break;
                    case 38358441:
                        if (str.equals("giropay")) {
                            return "giropay";
                        }
                        break;
                    case 100048981:
                        if (str.equals("ideal")) {
                            return "ideal";
                        }
                        break;
                    case 1251821346:
                        if (str.equals("multibanco")) {
                            return "multibanco";
                        }
                        break;
                    case 1636477296:
                        if (str.equals("sepa_debit")) {
                            return "sepa_debit";
                        }
                        break;
                }
            }
            return "unknown";
        }

        public final Source fromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new SourceJsonParser().parse2(jSONObject);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Source> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Status status;
            LinkedHashMap linkedHashMap;
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            CodeVerification createFromParcel = parcel.readInt() == 0 ? null : CodeVerification.CREATOR.createFromParcel(parcel);
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            Flow valueOf4 = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            int i11 = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Owner createFromParcel2 = parcel.readInt() == 0 ? null : Owner.CREATOR.createFromParcel(parcel);
            Receiver createFromParcel3 = parcel.readInt() == 0 ? null : Receiver.CREATOR.createFromParcel(parcel);
            Redirect createFromParcel4 = parcel.readInt() == 0 ? null : Redirect.CREATOR.createFromParcel(parcel);
            Status valueOf5 = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                status = valueOf5;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (i11 != readInt) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(Source.class.getClassLoader()));
                    i11++;
                    readInt = readInt;
                    valueOf5 = valueOf5;
                }
                status = valueOf5;
                linkedHashMap = linkedHashMap2;
            }
            return new Source(readString, valueOf2, readString2, createFromParcel, valueOf3, readString3, valueOf4, valueOf, createFromParcel2, createFromParcel3, createFromParcel4, status, linkedHashMap, (SourceTypeModel) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : WeChat.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Klarna.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SourceOrder.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source[] newArray(int i11) {
            return new Source[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum Flow {
        Redirect(RedirectAction.ACTION_TYPE),
        Receiver("receiver"),
        CodeVerification("code_verification"),
        None(PermissionsResponse.SCOPE_NONE);
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Flow fromCode(String str) {
                Flow[] values;
                for (Flow flow : Flow.values()) {
                    if (s.c(flow.getCode$payments_core_release(), str)) {
                        return flow;
                    }
                }
                return null;
            }
        }

        Flow(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Klarna implements StripeModel {
        private final String clientToken;
        private final Set<String> customPaymentMethods;
        private final String firstName;
        private final String lastName;
        private final String payLaterAssetUrlsDescriptive;
        private final String payLaterAssetUrlsStandard;
        private final String payLaterName;
        private final String payLaterRedirectUrl;
        private final String payNowAssetUrlsDescriptive;
        private final String payNowAssetUrlsStandard;
        private final String payNowName;
        private final String payNowRedirectUrl;
        private final String payOverTimeAssetUrlsDescriptive;
        private final String payOverTimeAssetUrlsStandard;
        private final String payOverTimeName;
        private final String payOverTimeRedirectUrl;
        private final Set<String> paymentMethodCategories;
        private final String purchaseCountry;
        public static final Parcelable.Creator<Klarna> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Klarna> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Klarna createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    linkedHashSet.add(parcel.readString());
                    i11++;
                    readInt = readInt;
                }
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    linkedHashSet2.add(parcel.readString());
                    i12++;
                    readInt2 = readInt2;
                }
                return new Klarna(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, linkedHashSet, linkedHashSet2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Klarna[] newArray(int i11) {
                return new Klarna[i11];
            }
        }

        public Klarna(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set<String> paymentMethodCategories, Set<String> customPaymentMethods) {
            s.g(paymentMethodCategories, "paymentMethodCategories");
            s.g(customPaymentMethods, "customPaymentMethods");
            this.firstName = str;
            this.lastName = str2;
            this.purchaseCountry = str3;
            this.clientToken = str4;
            this.payNowAssetUrlsDescriptive = str5;
            this.payNowAssetUrlsStandard = str6;
            this.payNowName = str7;
            this.payNowRedirectUrl = str8;
            this.payLaterAssetUrlsDescriptive = str9;
            this.payLaterAssetUrlsStandard = str10;
            this.payLaterName = str11;
            this.payLaterRedirectUrl = str12;
            this.payOverTimeAssetUrlsDescriptive = str13;
            this.payOverTimeAssetUrlsStandard = str14;
            this.payOverTimeName = str15;
            this.payOverTimeRedirectUrl = str16;
            this.paymentMethodCategories = paymentMethodCategories;
            this.customPaymentMethods = customPaymentMethods;
        }

        public final String component1() {
            return this.firstName;
        }

        public final String component10() {
            return this.payLaterAssetUrlsStandard;
        }

        public final String component11() {
            return this.payLaterName;
        }

        public final String component12() {
            return this.payLaterRedirectUrl;
        }

        public final String component13() {
            return this.payOverTimeAssetUrlsDescriptive;
        }

        public final String component14() {
            return this.payOverTimeAssetUrlsStandard;
        }

        public final String component15() {
            return this.payOverTimeName;
        }

        public final String component16() {
            return this.payOverTimeRedirectUrl;
        }

        public final Set<String> component17() {
            return this.paymentMethodCategories;
        }

        public final Set<String> component18() {
            return this.customPaymentMethods;
        }

        public final String component2() {
            return this.lastName;
        }

        public final String component3() {
            return this.purchaseCountry;
        }

        public final String component4() {
            return this.clientToken;
        }

        public final String component5() {
            return this.payNowAssetUrlsDescriptive;
        }

        public final String component6() {
            return this.payNowAssetUrlsStandard;
        }

        public final String component7() {
            return this.payNowName;
        }

        public final String component8() {
            return this.payNowRedirectUrl;
        }

        public final String component9() {
            return this.payLaterAssetUrlsDescriptive;
        }

        public final Klarna copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set<String> paymentMethodCategories, Set<String> customPaymentMethods) {
            s.g(paymentMethodCategories, "paymentMethodCategories");
            s.g(customPaymentMethods, "customPaymentMethods");
            return new Klarna(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, paymentMethodCategories, customPaymentMethods);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Klarna) {
                Klarna klarna = (Klarna) obj;
                return s.c(this.firstName, klarna.firstName) && s.c(this.lastName, klarna.lastName) && s.c(this.purchaseCountry, klarna.purchaseCountry) && s.c(this.clientToken, klarna.clientToken) && s.c(this.payNowAssetUrlsDescriptive, klarna.payNowAssetUrlsDescriptive) && s.c(this.payNowAssetUrlsStandard, klarna.payNowAssetUrlsStandard) && s.c(this.payNowName, klarna.payNowName) && s.c(this.payNowRedirectUrl, klarna.payNowRedirectUrl) && s.c(this.payLaterAssetUrlsDescriptive, klarna.payLaterAssetUrlsDescriptive) && s.c(this.payLaterAssetUrlsStandard, klarna.payLaterAssetUrlsStandard) && s.c(this.payLaterName, klarna.payLaterName) && s.c(this.payLaterRedirectUrl, klarna.payLaterRedirectUrl) && s.c(this.payOverTimeAssetUrlsDescriptive, klarna.payOverTimeAssetUrlsDescriptive) && s.c(this.payOverTimeAssetUrlsStandard, klarna.payOverTimeAssetUrlsStandard) && s.c(this.payOverTimeName, klarna.payOverTimeName) && s.c(this.payOverTimeRedirectUrl, klarna.payOverTimeRedirectUrl) && s.c(this.paymentMethodCategories, klarna.paymentMethodCategories) && s.c(this.customPaymentMethods, klarna.customPaymentMethods);
            }
            return false;
        }

        public final String getClientToken() {
            return this.clientToken;
        }

        public final Set<String> getCustomPaymentMethods() {
            return this.customPaymentMethods;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getPayLaterAssetUrlsDescriptive() {
            return this.payLaterAssetUrlsDescriptive;
        }

        public final String getPayLaterAssetUrlsStandard() {
            return this.payLaterAssetUrlsStandard;
        }

        public final String getPayLaterName() {
            return this.payLaterName;
        }

        public final String getPayLaterRedirectUrl() {
            return this.payLaterRedirectUrl;
        }

        public final String getPayNowAssetUrlsDescriptive() {
            return this.payNowAssetUrlsDescriptive;
        }

        public final String getPayNowAssetUrlsStandard() {
            return this.payNowAssetUrlsStandard;
        }

        public final String getPayNowName() {
            return this.payNowName;
        }

        public final String getPayNowRedirectUrl() {
            return this.payNowRedirectUrl;
        }

        public final String getPayOverTimeAssetUrlsDescriptive() {
            return this.payOverTimeAssetUrlsDescriptive;
        }

        public final String getPayOverTimeAssetUrlsStandard() {
            return this.payOverTimeAssetUrlsStandard;
        }

        public final String getPayOverTimeName() {
            return this.payOverTimeName;
        }

        public final String getPayOverTimeRedirectUrl() {
            return this.payOverTimeRedirectUrl;
        }

        public final Set<String> getPaymentMethodCategories() {
            return this.paymentMethodCategories;
        }

        public final String getPurchaseCountry() {
            return this.purchaseCountry;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.firstName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.purchaseCountry;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.clientToken;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.payNowAssetUrlsDescriptive;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.payNowAssetUrlsStandard;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.payNowName;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.payNowRedirectUrl;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.payLaterAssetUrlsDescriptive;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.payLaterAssetUrlsStandard;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.payLaterName;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.payLaterRedirectUrl;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.payOverTimeAssetUrlsDescriptive;
            int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.payOverTimeAssetUrlsStandard;
            int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.payOverTimeName;
            int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.payOverTimeRedirectUrl;
            return ((((hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.paymentMethodCategories.hashCode()) * 31) + this.customPaymentMethods.hashCode();
        }

        public String toString() {
            return "Klarna(firstName=" + ((Object) this.firstName) + ", lastName=" + ((Object) this.lastName) + ", purchaseCountry=" + ((Object) this.purchaseCountry) + ", clientToken=" + ((Object) this.clientToken) + ", payNowAssetUrlsDescriptive=" + ((Object) this.payNowAssetUrlsDescriptive) + ", payNowAssetUrlsStandard=" + ((Object) this.payNowAssetUrlsStandard) + ", payNowName=" + ((Object) this.payNowName) + ", payNowRedirectUrl=" + ((Object) this.payNowRedirectUrl) + ", payLaterAssetUrlsDescriptive=" + ((Object) this.payLaterAssetUrlsDescriptive) + ", payLaterAssetUrlsStandard=" + ((Object) this.payLaterAssetUrlsStandard) + ", payLaterName=" + ((Object) this.payLaterName) + ", payLaterRedirectUrl=" + ((Object) this.payLaterRedirectUrl) + ", payOverTimeAssetUrlsDescriptive=" + ((Object) this.payOverTimeAssetUrlsDescriptive) + ", payOverTimeAssetUrlsStandard=" + ((Object) this.payOverTimeAssetUrlsStandard) + ", payOverTimeName=" + ((Object) this.payOverTimeName) + ", payOverTimeRedirectUrl=" + ((Object) this.payOverTimeRedirectUrl) + ", paymentMethodCategories=" + this.paymentMethodCategories + ", customPaymentMethods=" + this.customPaymentMethods + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.firstName);
            out.writeString(this.lastName);
            out.writeString(this.purchaseCountry);
            out.writeString(this.clientToken);
            out.writeString(this.payNowAssetUrlsDescriptive);
            out.writeString(this.payNowAssetUrlsStandard);
            out.writeString(this.payNowName);
            out.writeString(this.payNowRedirectUrl);
            out.writeString(this.payLaterAssetUrlsDescriptive);
            out.writeString(this.payLaterAssetUrlsStandard);
            out.writeString(this.payLaterName);
            out.writeString(this.payLaterRedirectUrl);
            out.writeString(this.payOverTimeAssetUrlsDescriptive);
            out.writeString(this.payOverTimeAssetUrlsStandard);
            out.writeString(this.payOverTimeName);
            out.writeString(this.payOverTimeRedirectUrl);
            Set<String> set = this.paymentMethodCategories;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
            Set<String> set2 = this.customPaymentMethods;
            out.writeInt(set2.size());
            for (String str2 : set2) {
                out.writeString(str2);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Owner implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Owner> CREATOR = new Creator();
        private final Address address;
        private final String email;
        private final String name;
        private final String phone;
        private final Address verifiedAddress;
        private final String verifiedEmail;
        private final String verifiedName;
        private final String verifiedPhone;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Owner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Owner createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Owner(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Owner[] newArray(int i11) {
                return new Owner[i11];
            }
        }

        public Owner(Address address, String str, String str2, String str3, Address address2, String str4, String str5, String str6) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
            this.verifiedAddress = address2;
            this.verifiedEmail = str4;
            this.verifiedName = str5;
            this.verifiedPhone = str6;
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final Address component5() {
            return this.verifiedAddress;
        }

        public final String component6() {
            return this.verifiedEmail;
        }

        public final String component7() {
            return this.verifiedName;
        }

        public final String component8() {
            return this.verifiedPhone;
        }

        public final Owner copy(Address address, String str, String str2, String str3, Address address2, String str4, String str5, String str6) {
            return new Owner(address, str, str2, str3, address2, str4, str5, str6);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Owner) {
                Owner owner = (Owner) obj;
                return s.c(this.address, owner.address) && s.c(this.email, owner.email) && s.c(this.name, owner.name) && s.c(this.phone, owner.phone) && s.c(this.verifiedAddress, owner.verifiedAddress) && s.c(this.verifiedEmail, owner.verifiedEmail) && s.c(this.verifiedName, owner.verifiedName) && s.c(this.verifiedPhone, owner.verifiedPhone);
            }
            return false;
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final Address getVerifiedAddress() {
            return this.verifiedAddress;
        }

        public final String getVerifiedEmail() {
            return this.verifiedEmail;
        }

        public final String getVerifiedName() {
            return this.verifiedName;
        }

        public final String getVerifiedPhone() {
            return this.verifiedPhone;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Address address2 = this.verifiedAddress;
            int hashCode5 = (hashCode4 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str4 = this.verifiedEmail;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.verifiedName;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.verifiedPhone;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Owner(address=" + this.address + ", email=" + ((Object) this.email) + ", name=" + ((Object) this.name) + ", phone=" + ((Object) this.phone) + ", verifiedAddress=" + this.verifiedAddress + ", verifiedEmail=" + ((Object) this.verifiedEmail) + ", verifiedName=" + ((Object) this.verifiedName) + ", verifiedPhone=" + ((Object) this.verifiedPhone) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
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
            Address address2 = this.verifiedAddress;
            if (address2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address2.writeToParcel(out, i11);
            }
            out.writeString(this.verifiedEmail);
            out.writeString(this.verifiedName);
            out.writeString(this.verifiedPhone);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Receiver implements StripeModel {
        private final String address;
        private final long amountCharged;
        private final long amountReceived;
        private final long amountReturned;
        public static final Parcelable.Creator<Receiver> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Receiver> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Receiver createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Receiver(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Receiver[] newArray(int i11) {
                return new Receiver[i11];
            }
        }

        public Receiver(String str, long j11, long j12, long j13) {
            this.address = str;
            this.amountCharged = j11;
            this.amountReceived = j12;
            this.amountReturned = j13;
        }

        public static /* synthetic */ Receiver copy$default(Receiver receiver, String str, long j11, long j12, long j13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = receiver.address;
            }
            if ((i11 & 2) != 0) {
                j11 = receiver.amountCharged;
            }
            long j14 = j11;
            if ((i11 & 4) != 0) {
                j12 = receiver.amountReceived;
            }
            long j15 = j12;
            if ((i11 & 8) != 0) {
                j13 = receiver.amountReturned;
            }
            return receiver.copy(str, j14, j15, j13);
        }

        public final String component1() {
            return this.address;
        }

        public final long component2() {
            return this.amountCharged;
        }

        public final long component3() {
            return this.amountReceived;
        }

        public final long component4() {
            return this.amountReturned;
        }

        public final Receiver copy(String str, long j11, long j12, long j13) {
            return new Receiver(str, j11, j12, j13);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Receiver) {
                Receiver receiver = (Receiver) obj;
                return s.c(this.address, receiver.address) && this.amountCharged == receiver.amountCharged && this.amountReceived == receiver.amountReceived && this.amountReturned == receiver.amountReturned;
            }
            return false;
        }

        public final String getAddress() {
            return this.address;
        }

        public final long getAmountCharged() {
            return this.amountCharged;
        }

        public final long getAmountReceived() {
            return this.amountReceived;
        }

        public final long getAmountReturned() {
            return this.amountReturned;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.address;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.amountCharged)) * 31) + Long.hashCode(this.amountReceived)) * 31) + Long.hashCode(this.amountReturned);
        }

        public String toString() {
            return "Receiver(address=" + ((Object) this.address) + ", amountCharged=" + this.amountCharged + ", amountReceived=" + this.amountReceived + ", amountReturned=" + this.amountReturned + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.address);
            out.writeLong(this.amountCharged);
            out.writeLong(this.amountReceived);
            out.writeLong(this.amountReturned);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Redirect implements StripeModel {
        private final String returnUrl;
        private final Status status;
        private final String url;
        public static final Parcelable.Creator<Redirect> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Redirect> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Redirect createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Redirect(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Redirect[] newArray(int i11) {
                return new Redirect[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum Status {
            Pending("pending"),
            Succeeded("succeeded"),
            NotRequired("not_required"),
            Failed("failed");
            
            public static final Companion Companion = new Companion(null);
            private final String code;

            /* loaded from: classes6.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Status fromCode(String str) {
                    Status[] values;
                    for (Status status : Status.values()) {
                        if (s.c(status.code, str)) {
                            return status;
                        }
                    }
                    return null;
                }
            }

            Status(String str) {
                this.code = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }
        }

        public Redirect(String str, Status status, String str2) {
            this.returnUrl = str;
            this.status = status;
            this.url = str2;
        }

        public static /* synthetic */ Redirect copy$default(Redirect redirect, String str, Status status, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = redirect.returnUrl;
            }
            if ((i11 & 2) != 0) {
                status = redirect.status;
            }
            if ((i11 & 4) != 0) {
                str2 = redirect.url;
            }
            return redirect.copy(str, status, str2);
        }

        public final String component1() {
            return this.returnUrl;
        }

        public final Status component2() {
            return this.status;
        }

        public final String component3() {
            return this.url;
        }

        public final Redirect copy(String str, Status status, String str2) {
            return new Redirect(str, status, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Redirect) {
                Redirect redirect = (Redirect) obj;
                return s.c(this.returnUrl, redirect.returnUrl) && this.status == redirect.status && s.c(this.url, redirect.url);
            }
            return false;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final String getUrl() {
            return this.url;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.returnUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Status status = this.status;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.url;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Redirect(returnUrl=" + ((Object) this.returnUrl) + ", status=" + this.status + ", url=" + ((Object) this.url) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.returnUrl);
            Status status = this.status;
            if (status == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(status.name());
            }
            out.writeString(this.url);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface SourceType {
        public static final String ALIPAY = "alipay";
        public static final String BANCONTACT = "bancontact";
        public static final String CARD = "card";
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EPS = "eps";
        public static final String GIROPAY = "giropay";
        public static final String IDEAL = "ideal";
        public static final String KLARNA = "klarna";
        public static final String MULTIBANCO = "multibanco";
        public static final String P24 = "p24";
        public static final String SEPA_DEBIT = "sepa_debit";
        public static final String SOFORT = "sofort";
        public static final String THREE_D_SECURE = "three_d_secure";
        public static final String UNKNOWN = "unknown";
        public static final String WECHAT = "wechat";

        /* loaded from: classes6.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String ALIPAY = "alipay";
            public static final String BANCONTACT = "bancontact";
            public static final String CARD = "card";
            public static final String EPS = "eps";
            public static final String GIROPAY = "giropay";
            public static final String IDEAL = "ideal";
            public static final String KLARNA = "klarna";
            public static final String MULTIBANCO = "multibanco";
            public static final String P24 = "p24";
            public static final String SEPA_DEBIT = "sepa_debit";
            public static final String SOFORT = "sofort";
            public static final String THREE_D_SECURE = "three_d_secure";
            public static final String UNKNOWN = "unknown";
            public static final String WECHAT = "wechat";

            private Companion() {
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum Status {
        Canceled("canceled"),
        Chargeable("chargeable"),
        Consumed("consumed"),
        Failed("failed"),
        Pending("pending");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status fromCode(String str) {
                Status[] values;
                for (Status status : Status.values()) {
                    if (s.c(status.code, str)) {
                        return status;
                    }
                }
                return null;
            }
        }

        Status(String str) {
            this.code = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    /* loaded from: classes6.dex */
    public enum Usage {
        Reusable("reusable"),
        SingleUse("single_use");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Usage fromCode(String str) {
                Usage[] values;
                for (Usage usage : Usage.values()) {
                    if (s.c(usage.getCode$payments_core_release(), str)) {
                        return usage;
                    }
                }
                return null;
            }
        }

        Usage(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    public Source(String str, Long l11, String str2, CodeVerification codeVerification, Long l12, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map<String, ? extends Object> map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str4) {
        s.g(type, "type");
        s.g(typeRaw, "typeRaw");
        this.f20936id = str;
        this.amount = l11;
        this.clientSecret = str2;
        this.codeVerification = codeVerification;
        this.created = l12;
        this.currency = str3;
        this.flow = flow;
        this.isLiveMode = bool;
        this.owner = owner;
        this.receiver = receiver;
        this.redirect = redirect;
        this.status = status;
        this.sourceTypeData = map;
        this.sourceTypeModel = sourceTypeModel;
        this.type = type;
        this.typeRaw = typeRaw;
        this.usage = usage;
        this._weChat = weChat;
        this._klarna = klarna;
        this.sourceOrder = sourceOrder;
        this.statementDescriptor = str4;
    }

    public static final String asSourceType(String str) {
        return Companion.asSourceType(str);
    }

    private final WeChat component18() {
        return this._weChat;
    }

    private final Klarna component19() {
        return this._klarna;
    }

    public static final Source fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final Receiver component10() {
        return this.receiver;
    }

    public final Redirect component11() {
        return this.redirect;
    }

    public final Status component12() {
        return this.status;
    }

    public final Map<String, Object> component13() {
        return this.sourceTypeData;
    }

    public final SourceTypeModel component14() {
        return this.sourceTypeModel;
    }

    public final String component15() {
        return this.type;
    }

    public final String component16() {
        return this.typeRaw;
    }

    public final Usage component17() {
        return this.usage;
    }

    public final Long component2() {
        return this.amount;
    }

    public final SourceOrder component20() {
        return this.sourceOrder;
    }

    public final String component21() {
        return this.statementDescriptor;
    }

    public final String component3() {
        return this.clientSecret;
    }

    public final CodeVerification component4() {
        return this.codeVerification;
    }

    public final Long component5() {
        return this.created;
    }

    public final String component6() {
        return this.currency;
    }

    public final Flow component7() {
        return this.flow;
    }

    public final Boolean component8() {
        return this.isLiveMode;
    }

    public final Owner component9() {
        return this.owner;
    }

    public final Source copy(String str, Long l11, String str2, CodeVerification codeVerification, Long l12, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map<String, ? extends Object> map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str4) {
        s.g(type, "type");
        s.g(typeRaw, "typeRaw");
        return new Source(str, l11, str2, codeVerification, l12, str3, flow, bool, owner, receiver, redirect, status, map, sourceTypeModel, type, typeRaw, usage, weChat, klarna, sourceOrder, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Source) {
            Source source = (Source) obj;
            return s.c(getId(), source.getId()) && s.c(this.amount, source.amount) && s.c(this.clientSecret, source.clientSecret) && s.c(this.codeVerification, source.codeVerification) && s.c(this.created, source.created) && s.c(this.currency, source.currency) && this.flow == source.flow && s.c(this.isLiveMode, source.isLiveMode) && s.c(this.owner, source.owner) && s.c(this.receiver, source.receiver) && s.c(this.redirect, source.redirect) && this.status == source.status && s.c(this.sourceTypeData, source.sourceTypeData) && s.c(this.sourceTypeModel, source.sourceTypeModel) && s.c(this.type, source.type) && s.c(this.typeRaw, source.typeRaw) && this.usage == source.usage && s.c(this._weChat, source._weChat) && s.c(this._klarna, source._klarna) && s.c(this.sourceOrder, source.sourceOrder) && s.c(this.statementDescriptor, source.statementDescriptor);
        }
        return false;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final CodeVerification getCodeVerification() {
        return this.codeVerification;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Flow getFlow() {
        return this.flow;
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.f20936id;
    }

    public final Klarna getKlarna() {
        if (s.c("klarna", this.type)) {
            Klarna klarna = this._klarna;
            if (klarna != null) {
                return klarna;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Source type must be 'klarna'".toString());
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final Receiver getReceiver() {
        return this.receiver;
    }

    public final Redirect getRedirect() {
        return this.redirect;
    }

    public final SourceOrder getSourceOrder() {
        return this.sourceOrder;
    }

    public final Map<String, Object> getSourceTypeData() {
        return this.sourceTypeData;
    }

    public final SourceTypeModel getSourceTypeModel() {
        return this.sourceTypeModel;
    }

    public final String getStatementDescriptor() {
        return this.statementDescriptor;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final String getTypeRaw() {
        return this.typeRaw;
    }

    public final Usage getUsage() {
        return this.usage;
    }

    public final WeChat getWeChat() {
        if (s.c("wechat", this.type)) {
            WeChat weChat = this._weChat;
            if (weChat != null) {
                return weChat;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Source type must be 'wechat'".toString());
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = (getId() == null ? 0 : getId().hashCode()) * 31;
        Long l11 = this.amount;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.clientSecret;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CodeVerification codeVerification = this.codeVerification;
        int hashCode4 = (hashCode3 + (codeVerification == null ? 0 : codeVerification.hashCode())) * 31;
        Long l12 = this.created;
        int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Flow flow = this.flow;
        int hashCode7 = (hashCode6 + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.isLiveMode;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Owner owner = this.owner;
        int hashCode9 = (hashCode8 + (owner == null ? 0 : owner.hashCode())) * 31;
        Receiver receiver = this.receiver;
        int hashCode10 = (hashCode9 + (receiver == null ? 0 : receiver.hashCode())) * 31;
        Redirect redirect = this.redirect;
        int hashCode11 = (hashCode10 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        Status status = this.status;
        int hashCode12 = (hashCode11 + (status == null ? 0 : status.hashCode())) * 31;
        Map<String, Object> map = this.sourceTypeData;
        int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        SourceTypeModel sourceTypeModel = this.sourceTypeModel;
        int hashCode14 = (((((hashCode13 + (sourceTypeModel == null ? 0 : sourceTypeModel.hashCode())) * 31) + this.type.hashCode()) * 31) + this.typeRaw.hashCode()) * 31;
        Usage usage = this.usage;
        int hashCode15 = (hashCode14 + (usage == null ? 0 : usage.hashCode())) * 31;
        WeChat weChat = this._weChat;
        int hashCode16 = (hashCode15 + (weChat == null ? 0 : weChat.hashCode())) * 31;
        Klarna klarna = this._klarna;
        int hashCode17 = (hashCode16 + (klarna == null ? 0 : klarna.hashCode())) * 31;
        SourceOrder sourceOrder = this.sourceOrder;
        int hashCode18 = (hashCode17 + (sourceOrder == null ? 0 : sourceOrder.hashCode())) * 31;
        String str3 = this.statementDescriptor;
        return hashCode18 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isLiveMode() {
        return this.isLiveMode;
    }

    public String toString() {
        return "Source(id=" + ((Object) getId()) + ", amount=" + this.amount + ", clientSecret=" + ((Object) this.clientSecret) + ", codeVerification=" + this.codeVerification + ", created=" + this.created + ", currency=" + ((Object) this.currency) + ", flow=" + this.flow + ", isLiveMode=" + this.isLiveMode + ", owner=" + this.owner + ", receiver=" + this.receiver + ", redirect=" + this.redirect + ", status=" + this.status + ", sourceTypeData=" + this.sourceTypeData + ", sourceTypeModel=" + this.sourceTypeModel + ", type=" + this.type + ", typeRaw=" + this.typeRaw + ", usage=" + this.usage + ", _weChat=" + this._weChat + ", _klarna=" + this._klarna + ", sourceOrder=" + this.sourceOrder + ", statementDescriptor=" + ((Object) this.statementDescriptor) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20936id);
        Long l11 = this.amount;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l11.longValue());
        }
        out.writeString(this.clientSecret);
        CodeVerification codeVerification = this.codeVerification;
        if (codeVerification == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            codeVerification.writeToParcel(out, i11);
        }
        Long l12 = this.created;
        if (l12 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l12.longValue());
        }
        out.writeString(this.currency);
        Flow flow = this.flow;
        if (flow == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(flow.name());
        }
        Boolean bool = this.isLiveMode;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Owner owner = this.owner;
        if (owner == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            owner.writeToParcel(out, i11);
        }
        Receiver receiver = this.receiver;
        if (receiver == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            receiver.writeToParcel(out, i11);
        }
        Redirect redirect = this.redirect;
        if (redirect == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            redirect.writeToParcel(out, i11);
        }
        Status status = this.status;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        Map<String, Object> map = this.sourceTypeData;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeValue(entry.getValue());
            }
        }
        out.writeParcelable(this.sourceTypeModel, i11);
        out.writeString(this.type);
        out.writeString(this.typeRaw);
        Usage usage = this.usage;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        WeChat weChat = this._weChat;
        if (weChat == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            weChat.writeToParcel(out, i11);
        }
        Klarna klarna = this._klarna;
        if (klarna == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            klarna.writeToParcel(out, i11);
        }
        SourceOrder sourceOrder = this.sourceOrder;
        if (sourceOrder == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sourceOrder.writeToParcel(out, i11);
        }
        out.writeString(this.statementDescriptor);
    }

    public /* synthetic */ Source(String str, Long l11, String str2, CodeVerification codeVerification, Long l12, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String str4, String str5, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : codeVerification, (i11 & 16) != 0 ? null : l12, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : flow, (i11 & 128) != 0 ? null : bool, (i11 & 256) != 0 ? null : owner, (i11 & 512) != 0 ? null : receiver, (i11 & 1024) != 0 ? null : redirect, (i11 & 2048) != 0 ? null : status, (i11 & 4096) != 0 ? null : map, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : sourceTypeModel, str4, str5, (65536 & i11) != 0 ? null : usage, (131072 & i11) != 0 ? null : weChat, (262144 & i11) != 0 ? null : klarna, (524288 & i11) != 0 ? null : sourceOrder, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : str6);
    }
}