package com.stripe.android.paymentsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.y;

/* loaded from: classes6.dex */
public abstract class PaymentSelection implements Parcelable {
    public static final int $stable = 0;

    /* loaded from: classes6.dex */
    public enum CustomerRequestedSave {
        RequestReuse,
        RequestNoReuse,
        NoRequest
    }

    /* loaded from: classes6.dex */
    public static final class GooglePay extends PaymentSelection {
        public static final GooglePay INSTANCE = new GooglePay();
        public static final Parcelable.Creator<GooglePay> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<GooglePay> {
            @Override // android.os.Parcelable.Creator
            public final GooglePay createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return GooglePay.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final GooglePay[] newArray(int i11) {
                return new GooglePay[i11];
            }
        }

        private GooglePay() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class New extends PaymentSelection {
        public static final int $stable = 0;

        /* loaded from: classes6.dex */
        public static final class Card extends New {
            private final CardBrand brand;
            private final CustomerRequestedSave customerRequestedSave;
            private final String last4;
            private final PaymentMethodCreateParams paymentMethodCreateParams;
            public static final Parcelable.Creator<Card> CREATOR = new Creator();
            public static final int $stable = PaymentMethodCreateParams.$stable;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Card> {
                @Override // android.os.Parcelable.Creator
                public final Card createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Card((PaymentMethodCreateParams) parcel.readParcelable(Card.class.getClassLoader()), CardBrand.valueOf(parcel.readString()), CustomerRequestedSave.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Card[] newArray(int i11) {
                    return new Card[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Card(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand brand, CustomerRequestedSave customerRequestedSave) {
                super(null);
                String j12;
                s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
                s.g(brand, "brand");
                s.g(customerRequestedSave, "customerRequestedSave");
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.brand = brand;
                this.customerRequestedSave = customerRequestedSave;
                Object obj = getPaymentMethodCreateParams().toParamMap().get("card");
                Map map = obj instanceof Map ? (Map) obj : null;
                s.e(map);
                Object obj2 = map.get("number");
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
                j12 = y.j1((String) obj2, 4);
                this.last4 = j12;
            }

            public static /* synthetic */ Card copy$default(Card card, PaymentMethodCreateParams paymentMethodCreateParams, CardBrand cardBrand, CustomerRequestedSave customerRequestedSave, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paymentMethodCreateParams = card.getPaymentMethodCreateParams();
                }
                if ((i11 & 2) != 0) {
                    cardBrand = card.brand;
                }
                if ((i11 & 4) != 0) {
                    customerRequestedSave = card.getCustomerRequestedSave();
                }
                return card.copy(paymentMethodCreateParams, cardBrand, customerRequestedSave);
            }

            public static /* synthetic */ void getLast4$annotations() {
            }

            public final PaymentMethodCreateParams component1() {
                return getPaymentMethodCreateParams();
            }

            public final CardBrand component2() {
                return this.brand;
            }

            public final CustomerRequestedSave component3() {
                return getCustomerRequestedSave();
            }

            public final Card copy(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand brand, CustomerRequestedSave customerRequestedSave) {
                s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
                s.g(brand, "brand");
                s.g(customerRequestedSave, "customerRequestedSave");
                return new Card(paymentMethodCreateParams, brand, customerRequestedSave);
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
                    return s.c(getPaymentMethodCreateParams(), card.getPaymentMethodCreateParams()) && this.brand == card.brand && getCustomerRequestedSave() == card.getCustomerRequestedSave();
                }
                return false;
            }

            public final CardBrand getBrand() {
                return this.brand;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public final String getLast4() {
                return this.last4;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public int hashCode() {
                return (((getPaymentMethodCreateParams().hashCode() * 31) + this.brand.hashCode()) * 31) + getCustomerRequestedSave().hashCode();
            }

            public String toString() {
                return "Card(paymentMethodCreateParams=" + getPaymentMethodCreateParams() + ", brand=" + this.brand + ", customerRequestedSave=" + getCustomerRequestedSave() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeParcelable(this.paymentMethodCreateParams, i11);
                out.writeString(this.brand.name());
                out.writeString(this.customerRequestedSave.name());
            }
        }

        /* loaded from: classes6.dex */
        public static final class GenericPaymentMethod extends New {
            private final CustomerRequestedSave customerRequestedSave;
            private final int iconResource;
            private final String labelResource;
            private final PaymentMethodCreateParams paymentMethodCreateParams;
            public static final Parcelable.Creator<GenericPaymentMethod> CREATOR = new Creator();
            public static final int $stable = PaymentMethodCreateParams.$stable;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<GenericPaymentMethod> {
                @Override // android.os.Parcelable.Creator
                public final GenericPaymentMethod createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new GenericPaymentMethod(parcel.readString(), parcel.readInt(), (PaymentMethodCreateParams) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()), CustomerRequestedSave.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final GenericPaymentMethod[] newArray(int i11) {
                    return new GenericPaymentMethod[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericPaymentMethod(String labelResource, int i11, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave) {
                super(null);
                s.g(labelResource, "labelResource");
                s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
                s.g(customerRequestedSave, "customerRequestedSave");
                this.labelResource = labelResource;
                this.iconResource = i11;
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.customerRequestedSave = customerRequestedSave;
            }

            public static /* synthetic */ GenericPaymentMethod copy$default(GenericPaymentMethod genericPaymentMethod, String str, int i11, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = genericPaymentMethod.labelResource;
                }
                if ((i12 & 2) != 0) {
                    i11 = genericPaymentMethod.iconResource;
                }
                if ((i12 & 4) != 0) {
                    paymentMethodCreateParams = genericPaymentMethod.getPaymentMethodCreateParams();
                }
                if ((i12 & 8) != 0) {
                    customerRequestedSave = genericPaymentMethod.getCustomerRequestedSave();
                }
                return genericPaymentMethod.copy(str, i11, paymentMethodCreateParams, customerRequestedSave);
            }

            public final String component1() {
                return this.labelResource;
            }

            public final int component2() {
                return this.iconResource;
            }

            public final PaymentMethodCreateParams component3() {
                return getPaymentMethodCreateParams();
            }

            public final CustomerRequestedSave component4() {
                return getCustomerRequestedSave();
            }

            public final GenericPaymentMethod copy(String labelResource, int i11, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave) {
                s.g(labelResource, "labelResource");
                s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
                s.g(customerRequestedSave, "customerRequestedSave");
                return new GenericPaymentMethod(labelResource, i11, paymentMethodCreateParams, customerRequestedSave);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GenericPaymentMethod) {
                    GenericPaymentMethod genericPaymentMethod = (GenericPaymentMethod) obj;
                    return s.c(this.labelResource, genericPaymentMethod.labelResource) && this.iconResource == genericPaymentMethod.iconResource && s.c(getPaymentMethodCreateParams(), genericPaymentMethod.getPaymentMethodCreateParams()) && getCustomerRequestedSave() == genericPaymentMethod.getCustomerRequestedSave();
                }
                return false;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public final int getIconResource() {
                return this.iconResource;
            }

            public final String getLabelResource() {
                return this.labelResource;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public int hashCode() {
                return (((((this.labelResource.hashCode() * 31) + Integer.hashCode(this.iconResource)) * 31) + getPaymentMethodCreateParams().hashCode()) * 31) + getCustomerRequestedSave().hashCode();
            }

            public String toString() {
                return "GenericPaymentMethod(labelResource=" + this.labelResource + ", iconResource=" + this.iconResource + ", paymentMethodCreateParams=" + getPaymentMethodCreateParams() + ", customerRequestedSave=" + getCustomerRequestedSave() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.labelResource);
                out.writeInt(this.iconResource);
                out.writeParcelable(this.paymentMethodCreateParams, i11);
                out.writeString(this.customerRequestedSave.name());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Link extends New {
            private final CustomerRequestedSave customerRequestedSave;
            private final int iconResource;
            private final String label;
            private final ConsumerPaymentDetails.PaymentDetails paymentDetails;
            private final PaymentMethodCreateParams paymentMethodCreateParams;
            public static final Parcelable.Creator<Link> CREATOR = new Creator();
            public static final int $stable = PaymentMethodCreateParams.$stable | ConsumerPaymentDetails.PaymentDetails.$stable;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Link> {
                @Override // android.os.Parcelable.Creator
                public final Link createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Link((ConsumerPaymentDetails.PaymentDetails) parcel.readParcelable(Link.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(Link.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Link[] newArray(int i11) {
                    return new Link[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Link(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
                super(null);
                s.g(paymentDetails, "paymentDetails");
                s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
                this.paymentDetails = paymentDetails;
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.customerRequestedSave = CustomerRequestedSave.NoRequest;
                if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
                    this.iconResource = PaymentMethodsUiExtensionKt.getCardBrandIcon(((ConsumerPaymentDetails.Card) paymentDetails).getBrand());
                    if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
                        this.label = ((ConsumerPaymentDetails.Card) paymentDetails).getLast4();
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new NoWhenBranchMatchedException();
            }

            public static /* synthetic */ Link copy$default(Link link, ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paymentDetails = link.paymentDetails;
                }
                if ((i11 & 2) != 0) {
                    paymentMethodCreateParams = link.getPaymentMethodCreateParams();
                }
                return link.copy(paymentDetails, paymentMethodCreateParams);
            }

            public static /* synthetic */ void getCustomerRequestedSave$annotations() {
            }

            public static /* synthetic */ void getIconResource$annotations() {
            }

            public static /* synthetic */ void getLabel$annotations() {
            }

            public final ConsumerPaymentDetails.PaymentDetails component1() {
                return this.paymentDetails;
            }

            public final PaymentMethodCreateParams component2() {
                return getPaymentMethodCreateParams();
            }

            public final Link copy(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
                s.g(paymentDetails, "paymentDetails");
                s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
                return new Link(paymentDetails, paymentMethodCreateParams);
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
                    return s.c(this.paymentDetails, link.paymentDetails) && s.c(getPaymentMethodCreateParams(), link.getPaymentMethodCreateParams());
                }
                return false;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public final int getIconResource() {
                return this.iconResource;
            }

            public final String getLabel() {
                return this.label;
            }

            public final ConsumerPaymentDetails.PaymentDetails getPaymentDetails() {
                return this.paymentDetails;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public int hashCode() {
                return (this.paymentDetails.hashCode() * 31) + getPaymentMethodCreateParams().hashCode();
            }

            public String toString() {
                return "Link(paymentDetails=" + this.paymentDetails + ", paymentMethodCreateParams=" + getPaymentMethodCreateParams() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeParcelable(this.paymentDetails, i11);
                out.writeParcelable(this.paymentMethodCreateParams, i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class USBankAccount extends New {
            private final String bankName;
            private final CustomerRequestedSave customerRequestedSave;
            private final String financialConnectionsSessionId;
            private final int iconResource;
            private final String intentId;
            private final String labelResource;
            private final String last4;
            private final PaymentMethodCreateParams paymentMethodCreateParams;
            public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
            public static final int $stable = PaymentMethodCreateParams.$stable;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<USBankAccount> {
                @Override // android.os.Parcelable.Creator
                public final USBankAccount createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new USBankAccount(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PaymentMethodCreateParams) parcel.readParcelable(USBankAccount.class.getClassLoader()), CustomerRequestedSave.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final USBankAccount[] newArray(int i11) {
                    return new USBankAccount[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public USBankAccount(String labelResource, int i11, String bankName, String last4, String financialConnectionsSessionId, String intentId, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave) {
                super(null);
                s.g(labelResource, "labelResource");
                s.g(bankName, "bankName");
                s.g(last4, "last4");
                s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
                s.g(intentId, "intentId");
                s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
                s.g(customerRequestedSave, "customerRequestedSave");
                this.labelResource = labelResource;
                this.iconResource = i11;
                this.bankName = bankName;
                this.last4 = last4;
                this.financialConnectionsSessionId = financialConnectionsSessionId;
                this.intentId = intentId;
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.customerRequestedSave = customerRequestedSave;
            }

            public final String component1() {
                return this.labelResource;
            }

            public final int component2() {
                return this.iconResource;
            }

            public final String component3() {
                return this.bankName;
            }

            public final String component4() {
                return this.last4;
            }

            public final String component5() {
                return this.financialConnectionsSessionId;
            }

            public final String component6() {
                return this.intentId;
            }

            public final PaymentMethodCreateParams component7() {
                return getPaymentMethodCreateParams();
            }

            public final CustomerRequestedSave component8() {
                return getCustomerRequestedSave();
            }

            public final USBankAccount copy(String labelResource, int i11, String bankName, String last4, String financialConnectionsSessionId, String intentId, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave) {
                s.g(labelResource, "labelResource");
                s.g(bankName, "bankName");
                s.g(last4, "last4");
                s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
                s.g(intentId, "intentId");
                s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
                s.g(customerRequestedSave, "customerRequestedSave");
                return new USBankAccount(labelResource, i11, bankName, last4, financialConnectionsSessionId, intentId, paymentMethodCreateParams, customerRequestedSave);
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
                    return s.c(this.labelResource, uSBankAccount.labelResource) && this.iconResource == uSBankAccount.iconResource && s.c(this.bankName, uSBankAccount.bankName) && s.c(this.last4, uSBankAccount.last4) && s.c(this.financialConnectionsSessionId, uSBankAccount.financialConnectionsSessionId) && s.c(this.intentId, uSBankAccount.intentId) && s.c(getPaymentMethodCreateParams(), uSBankAccount.getPaymentMethodCreateParams()) && getCustomerRequestedSave() == uSBankAccount.getCustomerRequestedSave();
                }
                return false;
            }

            public final String getBankName() {
                return this.bankName;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public final String getFinancialConnectionsSessionId() {
                return this.financialConnectionsSessionId;
            }

            public final int getIconResource() {
                return this.iconResource;
            }

            public final String getIntentId() {
                return this.intentId;
            }

            public final String getLabelResource() {
                return this.labelResource;
            }

            public final String getLast4() {
                return this.last4;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public int hashCode() {
                return (((((((((((((this.labelResource.hashCode() * 31) + Integer.hashCode(this.iconResource)) * 31) + this.bankName.hashCode()) * 31) + this.last4.hashCode()) * 31) + this.financialConnectionsSessionId.hashCode()) * 31) + this.intentId.hashCode()) * 31) + getPaymentMethodCreateParams().hashCode()) * 31) + getCustomerRequestedSave().hashCode();
            }

            public String toString() {
                return "USBankAccount(labelResource=" + this.labelResource + ", iconResource=" + this.iconResource + ", bankName=" + this.bankName + ", last4=" + this.last4 + ", financialConnectionsSessionId=" + this.financialConnectionsSessionId + ", intentId=" + this.intentId + ", paymentMethodCreateParams=" + getPaymentMethodCreateParams() + ", customerRequestedSave=" + getCustomerRequestedSave() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.labelResource);
                out.writeInt(this.iconResource);
                out.writeString(this.bankName);
                out.writeString(this.last4);
                out.writeString(this.financialConnectionsSessionId);
                out.writeString(this.intentId);
                out.writeParcelable(this.paymentMethodCreateParams, i11);
                out.writeString(this.customerRequestedSave.name());
            }
        }

        private New() {
            super(null);
        }

        public /* synthetic */ New(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract CustomerRequestedSave getCustomerRequestedSave();

        public abstract PaymentMethodCreateParams getPaymentMethodCreateParams();
    }

    /* loaded from: classes6.dex */
    public static final class Saved extends PaymentSelection {
        private final PaymentMethod paymentMethod;
        public static final Parcelable.Creator<Saved> CREATOR = new Creator();
        public static final int $stable = PaymentMethod.$stable;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Saved> {
            @Override // android.os.Parcelable.Creator
            public final Saved createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Saved((PaymentMethod) parcel.readParcelable(Saved.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Saved[] newArray(int i11) {
                return new Saved[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Saved(PaymentMethod paymentMethod) {
            super(null);
            s.g(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
        }

        public static /* synthetic */ Saved copy$default(Saved saved, PaymentMethod paymentMethod, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentMethod = saved.paymentMethod;
            }
            return saved.copy(paymentMethod);
        }

        public final PaymentMethod component1() {
            return this.paymentMethod;
        }

        public final Saved copy(PaymentMethod paymentMethod) {
            s.g(paymentMethod, "paymentMethod");
            return new Saved(paymentMethod);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Saved) && s.c(this.paymentMethod, ((Saved) obj).paymentMethod);
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public int hashCode() {
            return this.paymentMethod.hashCode();
        }

        public String toString() {
            return "Saved(paymentMethod=" + this.paymentMethod + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeParcelable(this.paymentMethod, i11);
        }
    }

    private PaymentSelection() {
    }

    public /* synthetic */ PaymentSelection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}