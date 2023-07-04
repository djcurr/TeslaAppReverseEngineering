package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.KlarnaSourceParams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import vz.v;
import wz.e0;
import wz.r0;
import wz.s0;
import yz.b;

/* loaded from: classes6.dex */
public final class KlarnaSourceParams implements StripeParamsModel, Parcelable {
    @Deprecated
    private static final String PARAM_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
    @Deprecated
    private static final String PARAM_DOB_DAY = "owner_dob_day";
    @Deprecated
    private static final String PARAM_DOB_MONTH = "owner_dob_month";
    @Deprecated
    private static final String PARAM_DOB_YEAR = "owner_dob_year";
    @Deprecated
    private static final String PARAM_FIRST_NAME = "first_name";
    @Deprecated
    private static final String PARAM_LAST_NAME = "last_name";
    @Deprecated
    private static final String PARAM_PRODUCT = "product";
    @Deprecated
    private static final String PARAM_PURCHASE_COUNTRY = "purchase_country";
    private final Address billingAddress;
    private final DateOfBirth billingDob;
    private final String billingEmail;
    private final String billingFirstName;
    private final String billingLastName;
    private final String billingPhone;
    private final Set<CustomPaymentMethods> customPaymentMethods;
    private final List<LineItem> lineItems;
    private final PaymentPageOptions pageOptions;
    private final String purchaseCountry;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KlarnaSourceParams> CREATOR = new Creator();
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
    public static final class Creator implements Parcelable.Creator<KlarnaSourceParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlarnaSourceParams createFromParcel(Parcel parcel) {
            String readString;
            s.g(parcel, "parcel");
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            for (int i12 = 0; i12 != readInt; i12++) {
                arrayList.add(LineItem.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            while (true) {
                readString = parcel.readString();
                if (i11 == readInt2) {
                    break;
                }
                linkedHashSet.add(CustomPaymentMethods.valueOf(readString));
                i11++;
            }
            return new KlarnaSourceParams(readString2, arrayList, linkedHashSet, readString, parcel.readString(), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DateOfBirth.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentPageOptions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlarnaSourceParams[] newArray(int i11) {
            return new KlarnaSourceParams[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum CustomPaymentMethods {
        PayIn4("payin4"),
        Installments("installments");
        
        private final String code;

        CustomPaymentMethods(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems) {
        this(purchaseCountry, lineItems, null, null, null, null, null, null, null, null, 1020, null);
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods) {
        this(purchaseCountry, lineItems, customPaymentMethods, null, null, null, null, null, null, null, 1016, null);
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
        s.g(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, null, null, null, null, null, null, 1008, null);
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
        s.g(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, null, null, null, null, null, 992, null);
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
        s.g(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, null, null, null, null, 960, null);
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
        s.g(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, null, null, null, 896, null);
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
        s.g(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, str4, null, null, 768, null);
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
        s.g(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4, DateOfBirth dateOfBirth) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, str4, dateOfBirth, null, 512, null);
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
        s.g(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions) {
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
        s.g(customPaymentMethods, "customPaymentMethods");
        this.purchaseCountry = purchaseCountry;
        this.lineItems = lineItems;
        this.customPaymentMethods = customPaymentMethods;
        this.billingEmail = str;
        this.billingPhone = str2;
        this.billingAddress = address;
        this.billingFirstName = str3;
        this.billingLastName = str4;
        this.billingDob = dateOfBirth;
        this.pageOptions = paymentPageOptions;
    }

    public final String component1() {
        return this.purchaseCountry;
    }

    public final PaymentPageOptions component10() {
        return this.pageOptions;
    }

    public final List<LineItem> component2() {
        return this.lineItems;
    }

    public final Set<CustomPaymentMethods> component3() {
        return this.customPaymentMethods;
    }

    public final String component4() {
        return this.billingEmail;
    }

    public final String component5() {
        return this.billingPhone;
    }

    public final Address component6() {
        return this.billingAddress;
    }

    public final String component7() {
        return this.billingFirstName;
    }

    public final String component8() {
        return this.billingLastName;
    }

    public final DateOfBirth component9() {
        return this.billingDob;
    }

    public final KlarnaSourceParams copy(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions) {
        s.g(purchaseCountry, "purchaseCountry");
        s.g(lineItems, "lineItems");
        s.g(customPaymentMethods, "customPaymentMethods");
        return new KlarnaSourceParams(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, str4, dateOfBirth, paymentPageOptions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KlarnaSourceParams) {
            KlarnaSourceParams klarnaSourceParams = (KlarnaSourceParams) obj;
            return s.c(this.purchaseCountry, klarnaSourceParams.purchaseCountry) && s.c(this.lineItems, klarnaSourceParams.lineItems) && s.c(this.customPaymentMethods, klarnaSourceParams.customPaymentMethods) && s.c(this.billingEmail, klarnaSourceParams.billingEmail) && s.c(this.billingPhone, klarnaSourceParams.billingPhone) && s.c(this.billingAddress, klarnaSourceParams.billingAddress) && s.c(this.billingFirstName, klarnaSourceParams.billingFirstName) && s.c(this.billingLastName, klarnaSourceParams.billingLastName) && s.c(this.billingDob, klarnaSourceParams.billingDob) && s.c(this.pageOptions, klarnaSourceParams.pageOptions);
        }
        return false;
    }

    public final Address getBillingAddress() {
        return this.billingAddress;
    }

    public final DateOfBirth getBillingDob() {
        return this.billingDob;
    }

    public final String getBillingEmail() {
        return this.billingEmail;
    }

    public final String getBillingFirstName() {
        return this.billingFirstName;
    }

    public final String getBillingLastName() {
        return this.billingLastName;
    }

    public final String getBillingPhone() {
        return this.billingPhone;
    }

    public final Set<CustomPaymentMethods> getCustomPaymentMethods() {
        return this.customPaymentMethods;
    }

    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    public final PaymentPageOptions getPageOptions() {
        return this.pageOptions;
    }

    public final String getPurchaseCountry() {
        return this.purchaseCountry;
    }

    public int hashCode() {
        int hashCode = ((((this.purchaseCountry.hashCode() * 31) + this.lineItems.hashCode()) * 31) + this.customPaymentMethods.hashCode()) * 31;
        String str = this.billingEmail;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billingPhone;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.billingAddress;
        int hashCode4 = (hashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.billingFirstName;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingLastName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateOfBirth dateOfBirth = this.billingDob;
        int hashCode7 = (hashCode6 + (dateOfBirth == null ? 0 : dateOfBirth.hashCode())) * 31;
        PaymentPageOptions paymentPageOptions = this.pageOptions;
        return hashCode7 + (paymentPageOptions != null ? paymentPageOptions.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map l11;
        List O0;
        List G0;
        String l02;
        Map f11;
        Map p11;
        Map p12;
        Map p13;
        Map<String, Object> p14;
        String m02;
        String m03;
        l11 = s0.l(v.a(PARAM_PRODUCT, "payment"), v.a(PARAM_PURCHASE_COUNTRY, this.purchaseCountry));
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        Map map = null;
        if (!(!set.isEmpty())) {
            set = null;
        }
        if (set == null) {
            f11 = null;
        } else {
            O0 = e0.O0(set);
            G0 = e0.G0(O0, new Comparator() { // from class: com.stripe.android.model.KlarnaSourceParams$toParamMap$lambda-2$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    int a11;
                    a11 = b.a(Integer.valueOf(((KlarnaSourceParams.CustomPaymentMethods) t11).ordinal()), Integer.valueOf(((KlarnaSourceParams.CustomPaymentMethods) t12).ordinal()));
                    return a11;
                }
            });
            l02 = e0.l0(G0, ",", null, null, 0, null, KlarnaSourceParams$toParamMap$2$2.INSTANCE, 30, null);
            f11 = r0.f(v.a(PARAM_CUSTOM_PAYMENT_METHODS, l02));
        }
        if (f11 == null) {
            f11 = s0.i();
        }
        p11 = s0.p(l11, f11);
        String str = this.billingFirstName;
        Map f12 = str == null ? null : r0.f(v.a(PARAM_FIRST_NAME, str));
        if (f12 == null) {
            f12 = s0.i();
        }
        p12 = s0.p(p11, f12);
        String str2 = this.billingLastName;
        Map f13 = str2 == null ? null : r0.f(v.a(PARAM_LAST_NAME, str2));
        if (f13 == null) {
            f13 = s0.i();
        }
        p13 = s0.p(p12, f13);
        DateOfBirth dateOfBirth = this.billingDob;
        if (dateOfBirth != null) {
            m02 = w.m0(String.valueOf(dateOfBirth.getDay()), 2, '0');
            m03 = w.m0(String.valueOf(dateOfBirth.getMonth()), 2, '0');
            map = s0.l(v.a(PARAM_DOB_DAY, m02), v.a(PARAM_DOB_MONTH, m03), v.a(PARAM_DOB_YEAR, String.valueOf(dateOfBirth.getYear())));
        }
        if (map == null) {
            map = s0.i();
        }
        p14 = s0.p(p13, map);
        return p14;
    }

    public String toString() {
        return "KlarnaSourceParams(purchaseCountry=" + this.purchaseCountry + ", lineItems=" + this.lineItems + ", customPaymentMethods=" + this.customPaymentMethods + ", billingEmail=" + ((Object) this.billingEmail) + ", billingPhone=" + ((Object) this.billingPhone) + ", billingAddress=" + this.billingAddress + ", billingFirstName=" + ((Object) this.billingFirstName) + ", billingLastName=" + ((Object) this.billingLastName) + ", billingDob=" + this.billingDob + ", pageOptions=" + this.pageOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.purchaseCountry);
        List<LineItem> list = this.lineItems;
        out.writeInt(list.size());
        for (LineItem lineItem : list) {
            lineItem.writeToParcel(out, i11);
        }
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        out.writeInt(set.size());
        for (CustomPaymentMethods customPaymentMethods : set) {
            out.writeString(customPaymentMethods.name());
        }
        out.writeString(this.billingEmail);
        out.writeString(this.billingPhone);
        Address address = this.billingAddress;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i11);
        }
        out.writeString(this.billingFirstName);
        out.writeString(this.billingLastName);
        DateOfBirth dateOfBirth = this.billingDob;
        if (dateOfBirth == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dateOfBirth.writeToParcel(out, i11);
        }
        PaymentPageOptions paymentPageOptions = this.pageOptions;
        if (paymentPageOptions == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        paymentPageOptions.writeToParcel(out, i11);
    }

    /* loaded from: classes6.dex */
    public static final class LineItem implements Parcelable {
        private final String itemDescription;
        private final Type itemType;
        private final Integer quantity;
        private final int totalAmount;
        public static final Parcelable.Creator<LineItem> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<LineItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LineItem createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new LineItem(Type.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LineItem[] newArray(int i11) {
                return new LineItem[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum Type {
            Sku("sku"),
            Tax("tax"),
            Shipping("shipping");
            
            private final String code;

            Type(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LineItem(Type itemType, String itemDescription, int i11) {
            this(itemType, itemDescription, i11, null, 8, null);
            s.g(itemType, "itemType");
            s.g(itemDescription, "itemDescription");
        }

        public LineItem(Type itemType, String itemDescription, int i11, Integer num) {
            s.g(itemType, "itemType");
            s.g(itemDescription, "itemDescription");
            this.itemType = itemType;
            this.itemDescription = itemDescription;
            this.totalAmount = i11;
            this.quantity = num;
        }

        public static /* synthetic */ LineItem copy$default(LineItem lineItem, Type type, String str, int i11, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                type = lineItem.itemType;
            }
            if ((i12 & 2) != 0) {
                str = lineItem.itemDescription;
            }
            if ((i12 & 4) != 0) {
                i11 = lineItem.totalAmount;
            }
            if ((i12 & 8) != 0) {
                num = lineItem.quantity;
            }
            return lineItem.copy(type, str, i11, num);
        }

        public final Type component1() {
            return this.itemType;
        }

        public final String component2() {
            return this.itemDescription;
        }

        public final int component3() {
            return this.totalAmount;
        }

        public final Integer component4() {
            return this.quantity;
        }

        public final LineItem copy(Type itemType, String itemDescription, int i11, Integer num) {
            s.g(itemType, "itemType");
            s.g(itemDescription, "itemDescription");
            return new LineItem(itemType, itemDescription, i11, num);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LineItem) {
                LineItem lineItem = (LineItem) obj;
                return this.itemType == lineItem.itemType && s.c(this.itemDescription, lineItem.itemDescription) && this.totalAmount == lineItem.totalAmount && s.c(this.quantity, lineItem.quantity);
            }
            return false;
        }

        public final String getItemDescription() {
            return this.itemDescription;
        }

        public final Type getItemType() {
            return this.itemType;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final int getTotalAmount() {
            return this.totalAmount;
        }

        public int hashCode() {
            int hashCode = ((((this.itemType.hashCode() * 31) + this.itemDescription.hashCode()) * 31) + Integer.hashCode(this.totalAmount)) * 31;
            Integer num = this.quantity;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "LineItem(itemType=" + this.itemType + ", itemDescription=" + this.itemDescription + ", totalAmount=" + this.totalAmount + ", quantity=" + this.quantity + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            int intValue;
            s.g(out, "out");
            out.writeString(this.itemType.name());
            out.writeString(this.itemDescription);
            out.writeInt(this.totalAmount);
            Integer num = this.quantity;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }

        public /* synthetic */ LineItem(Type type, String str, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, str, i11, (i12 & 8) != 0 ? null : num);
        }
    }

    /* loaded from: classes6.dex */
    public static final class PaymentPageOptions implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_BACKGROUND_IMAGE_URL = "background_image_url";
        @Deprecated
        private static final String PARAM_LOGO_URL = "logo_url";
        @Deprecated
        private static final String PARAM_PAGE_TITLE = "page_title";
        @Deprecated
        private static final String PARAM_PURCHASE_TYPE = "purchase_type";
        private final String backgroundImageUrl;
        private final String logoUrl;
        private final String pageTitle;
        private final PurchaseType purchaseType;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<PaymentPageOptions> CREATOR = new Creator();
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
        public static final class Creator implements Parcelable.Creator<PaymentPageOptions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPageOptions createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new PaymentPageOptions(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PurchaseType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPageOptions[] newArray(int i11) {
                return new PaymentPageOptions[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum PurchaseType {
            Buy("buy"),
            Rent("rent"),
            Book("book"),
            Subscribe("subscribe"),
            Download("download"),
            Order("order"),
            Continue("continue");
            
            private final String code;

            PurchaseType(String str) {
                this.code = str;
            }

            public final String getCode() {
                return this.code;
            }
        }

        public PaymentPageOptions() {
            this(null, null, null, null, 15, null);
        }

        public PaymentPageOptions(String str, String str2, String str3, PurchaseType purchaseType) {
            this.logoUrl = str;
            this.backgroundImageUrl = str2;
            this.pageTitle = str3;
            this.purchaseType = purchaseType;
        }

        public static /* synthetic */ PaymentPageOptions copy$default(PaymentPageOptions paymentPageOptions, String str, String str2, String str3, PurchaseType purchaseType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = paymentPageOptions.logoUrl;
            }
            if ((i11 & 2) != 0) {
                str2 = paymentPageOptions.backgroundImageUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = paymentPageOptions.pageTitle;
            }
            if ((i11 & 8) != 0) {
                purchaseType = paymentPageOptions.purchaseType;
            }
            return paymentPageOptions.copy(str, str2, str3, purchaseType);
        }

        public final String component1() {
            return this.logoUrl;
        }

        public final String component2() {
            return this.backgroundImageUrl;
        }

        public final String component3() {
            return this.pageTitle;
        }

        public final PurchaseType component4() {
            return this.purchaseType;
        }

        public final PaymentPageOptions copy(String str, String str2, String str3, PurchaseType purchaseType) {
            return new PaymentPageOptions(str, str2, str3, purchaseType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PaymentPageOptions) {
                PaymentPageOptions paymentPageOptions = (PaymentPageOptions) obj;
                return s.c(this.logoUrl, paymentPageOptions.logoUrl) && s.c(this.backgroundImageUrl, paymentPageOptions.backgroundImageUrl) && s.c(this.pageTitle, paymentPageOptions.pageTitle) && this.purchaseType == paymentPageOptions.purchaseType;
            }
            return false;
        }

        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final String getLogoUrl() {
            return this.logoUrl;
        }

        public final String getPageTitle() {
            return this.pageTitle;
        }

        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }

        public int hashCode() {
            String str = this.logoUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backgroundImageUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.pageTitle;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PurchaseType purchaseType = this.purchaseType;
            return hashCode3 + (purchaseType != null ? purchaseType.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map i11;
            Map p11;
            Map p12;
            Map p13;
            Map<String, Object> p14;
            i11 = s0.i();
            String str = this.logoUrl;
            Map f11 = str == null ? null : r0.f(v.a(PARAM_LOGO_URL, str));
            if (f11 == null) {
                f11 = s0.i();
            }
            p11 = s0.p(i11, f11);
            String str2 = this.backgroundImageUrl;
            Map f12 = str2 == null ? null : r0.f(v.a(PARAM_BACKGROUND_IMAGE_URL, str2));
            if (f12 == null) {
                f12 = s0.i();
            }
            p12 = s0.p(p11, f12);
            String str3 = this.pageTitle;
            Map f13 = str3 == null ? null : r0.f(v.a(PARAM_PAGE_TITLE, str3));
            if (f13 == null) {
                f13 = s0.i();
            }
            p13 = s0.p(p12, f13);
            PurchaseType purchaseType = this.purchaseType;
            Map f14 = purchaseType != null ? r0.f(v.a(PARAM_PURCHASE_TYPE, purchaseType.getCode())) : null;
            if (f14 == null) {
                f14 = s0.i();
            }
            p14 = s0.p(p13, f14);
            return p14;
        }

        public String toString() {
            return "PaymentPageOptions(logoUrl=" + ((Object) this.logoUrl) + ", backgroundImageUrl=" + ((Object) this.backgroundImageUrl) + ", pageTitle=" + ((Object) this.pageTitle) + ", purchaseType=" + this.purchaseType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.logoUrl);
            out.writeString(this.backgroundImageUrl);
            out.writeString(this.pageTitle);
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(purchaseType.name());
        }

        public /* synthetic */ PaymentPageOptions(String str, String str2, String str3, PurchaseType purchaseType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : purchaseType);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ KlarnaSourceParams(java.lang.String r14, java.util.List r15, java.util.Set r16, java.lang.String r17, java.lang.String r18, com.stripe.android.model.Address r19, java.lang.String r20, java.lang.String r21, com.stripe.android.model.DateOfBirth r22, com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 4
            if (r1 == 0) goto Lc
            java.util.Set r1 = wz.v0.d()
            r5 = r1
            goto Le
        Lc:
            r5 = r16
        Le:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L15
            r6 = r2
            goto L17
        L15:
            r6 = r17
        L17:
            r1 = r0 & 16
            if (r1 == 0) goto L1d
            r7 = r2
            goto L1f
        L1d:
            r7 = r18
        L1f:
            r1 = r0 & 32
            if (r1 == 0) goto L25
            r8 = r2
            goto L27
        L25:
            r8 = r19
        L27:
            r1 = r0 & 64
            if (r1 == 0) goto L2d
            r9 = r2
            goto L2f
        L2d:
            r9 = r20
        L2f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L35
            r10 = r2
            goto L37
        L35:
            r10 = r21
        L37:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3d
            r11 = r2
            goto L3f
        L3d:
            r11 = r22
        L3f:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L45
            r12 = r2
            goto L47
        L45:
            r12 = r23
        L47:
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.KlarnaSourceParams.<init>(java.lang.String, java.util.List, java.util.Set, java.lang.String, java.lang.String, com.stripe.android.model.Address, java.lang.String, java.lang.String, com.stripe.android.model.DateOfBirth, com.stripe.android.model.KlarnaSourceParams$PaymentPageOptions, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}